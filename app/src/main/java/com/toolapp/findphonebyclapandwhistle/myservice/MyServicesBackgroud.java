package com.toolapp.findphonebyclapandwhistle.myservice;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Vibrator;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.os.HandlerCompat;
import com.toolapp.findphonebyclapandwhistle.MyTools.MySharedPreferences;
import com.toolapp.findphonebyclapandwhistle.MyActivities.AlertActivityClass;
import com.toolapp.findphonebyclapandwhistle.R;
import com.toolapp.findphonebyclapandwhistle.functions.ModelForNameConst;
import com.toolapp.findphonebyclapandwhistle.functions.ServicesForConst;
import org.tensorflow.lite.support.audio.TensorAudio;
import org.tensorflow.lite.support.label.Category;
import org.tensorflow.lite.task.audio.classifier.AudioClassifier;
import org.tensorflow.lite.task.audio.classifier.Classifications;
import java.io.IOException;
public class MyServices extends Service {
    AudioRecord audioRecord;
    public Handler handler;
    Vibrator vibrator;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @SuppressLint("ForegroundServiceType")
    @Override
    public int onStartCommand(Intent intent, int i, int i2) {

        this.vibrator = (Vibrator) getSystemService("vibrator");
        Log.e("Status", "created");
        if (Build.VERSION.SDK_INT >= 26) {
            startMyOwnForeground();
        } else {
            startForeground(1, new Notification());
        }
        if (intent != null && intent.getAction().equals(ServicesForConst.INTENT_ACTION.STOPFOREGROUND_ACTION)) {
            stopForeground(true);
            stopSelf();
        }
        fun();
        return 1;
    }
    @Override
    public void onDestroy() {
        Log.e("Status", "distoryed");
        this.handler.removeCallbacks(null);
        super.onDestroy();
        if (!new MySharedPreferences(getApplicationContext()).getBoolean("soundbtn", false)) {
            stopForeground(false);
        }
    }
    private void startMyOwnForeground() {
        NotificationChannel notificationChannel = new NotificationChannel("com.example.claptofindphone.services", "My Background Service", 0);
        notificationChannel.setLightColor(-16776961);
        notificationChannel.setLockscreenVisibility(0);
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        startForeground(2, new NotificationCompat.Builder(this, "com.example.claptofindphone.services").setOngoing(true).setSmallIcon(R.drawable.ic_doorball).setContentTitle("Clap to find phone Activated").setPriority(1).setCategory(NotificationCompat.CATEGORY_SERVICE).build());
    }
    public void fun() {
        SharedPreferences preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        AudioClassifier audioClassifier;
        HandlerThread handlerThread = new HandlerThread("backgroundThread");
        handlerThread.start();
        this.handler = HandlerCompat.createAsync(handlerThread.getLooper());
        try {
            audioClassifier = AudioClassifier.createFromFile(this, ModelForNameConst.MODEL_FILE);
        } catch (IOException e) {
            e.printStackTrace();
            audioClassifier = null;
        }
        final TensorAudio createInputTensorAudio = audioClassifier.createInputTensorAudio();
        audioRecord = audioClassifier.createAudioRecord();
        AudioClassifier finalAudioClassifier = audioClassifier;
        this.handler.post(new Runnable() { // from class: com.aims_axio.claptofindphone.services.MyServices.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MyServices.this.audioRecord.startRecording();
                    createInputTensorAudio.load(MyServices.this.audioRecord);
                    for (Classifications classifications : finalAudioClassifier.classify(createInputTensorAudio)) {
                        for (Category category : classifications.getCategories()) {
                            if (category.getScore() > 0.5d && (category.getIndex() == 35 || category.getIndex() == 56 || category.getIndex() == 58 || category.getIndex() == 57)) {
                                Log.e("Category name", classifications.getHeadName());
                                Log.w("Category Index", classifications.getHeadIndex() + "");
                                Log.e("Label", category.getLabel());
                                Log.w("Name", category.getDisplayName() + "");
                                Log.w("Score", category.getScore() + "");
                                Log.w("Index", category.getIndex() + "");
                                if (preferences.getBoolean("active", false)) {
                                    if (!AlertActivityClass.ON_SCREEN) {
                                        AlertActivityClass.ON_SCREEN = true;
                                        Intent intent = new Intent(MyServices.this, AlertActivityClass.class);
                                        intent.setFlags(268435456);
                                        MyServices.this.startActivity(intent);
                                    }
                                }

                            }
                        }
                    }
                } catch (Exception e2) {
                    Log.e("error", e2.getMessage());
                }
                MyServices.this.handler.postDelayed(this, 500L);
            }
        });
    }
}
