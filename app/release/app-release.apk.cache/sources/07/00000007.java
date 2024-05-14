package com.toolapp.findphonebyclapandwhistle.myservice;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Vibrator;
import android.util.Log;
import com.toolapp.findphonebyclapandwhistle.R;
import i.g;
import java.io.IOException;
import org.tensorflow.lite.task.audio.classifier.AudioClassifier;
import u6.a;
import u6.b;
import x.o;

/* loaded from: classes.dex */
public class MyServices extends Service {

    /* renamed from: h  reason: collision with root package name */
    public AudioRecord f1566h;

    /* renamed from: i  reason: collision with root package name */
    public Handler f1567i;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.e("Status", "distoryed");
        this.f1567i.removeCallbacks(null);
        super.onDestroy();
        if (!getApplicationContext().getSharedPreferences("MyAppPrefs", 0).getBoolean("soundbtn", false)) {
            stopForeground(false);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        AudioClassifier audioClassifier;
        a l7;
        int i9;
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        Log.e("Status", "created");
        boolean z7 = false;
        NotificationChannel notificationChannel = new NotificationChannel("com.example.claptofindphone.services", "My Background Service", 0);
        notificationChannel.setLightColor(-16776961);
        notificationChannel.setLockscreenVisibility(0);
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        o oVar = new o(this, "com.example.claptofindphone.services");
        oVar.d(2);
        oVar.p.icon = R.drawable.ic_doorball;
        oVar.f14089e = o.c("Clap to find phone Activated");
        oVar.f14092h = 1;
        oVar.f14096l = "service";
        startForeground(2, oVar.a());
        if (intent != null && intent.getAction().equals("com.truiton.foregroundservice.action.stopforeground")) {
            stopForeground(true);
            stopSelf();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", 0);
        HandlerThread handlerThread = new HandlerThread("backgroundThread");
        handlerThread.start();
        this.f1567i = s3.a.l(handlerThread.getLooper());
        try {
            audioClassifier = AudioClassifier.j(this);
        } catch (IOException e7) {
            e7.printStackTrace();
            audioClassifier = null;
        }
        AudioClassifier audioClassifier2 = audioClassifier;
        b bVar = new b(audioClassifier2.l(), (int) (audioClassifier2.k() / l7.f13684a));
        a l8 = audioClassifier2.l();
        int i10 = l8.f13684a;
        if (i10 == 1) {
            i9 = 16;
        } else if (i10 != 2) {
            throw new IllegalArgumentException(String.format("Number of channels required by the model is %d. getAudioRecord method only supports 1 or 2 audio channels.", Integer.valueOf(i10)));
        } else {
            i9 = 12;
        }
        int i11 = i9;
        int minBufferSize = AudioRecord.getMinBufferSize(l8.f13685b, i11, 4);
        if (minBufferSize == -1 || minBufferSize == -2) {
            throw new IllegalStateException(String.format("AudioRecord.getMinBufferSize failed. Returned: %d", Integer.valueOf(minBufferSize)));
        }
        int a7 = t6.a.FLOAT32.a() * ((int) audioClassifier2.k()) * 2;
        AudioRecord audioRecord = new AudioRecord(6, l8.f13685b, i11, 4, minBufferSize < a7 ? a7 : minBufferSize);
        if (audioRecord.getState() == 1) {
            z7 = true;
        }
        if (!z7) {
            throw new IllegalStateException("AudioRecord failed to initialize");
        }
        this.f1566h = audioRecord;
        this.f1567i.post(new g(this, bVar, audioClassifier2, sharedPreferences, 4));
        return 1;
    }
}