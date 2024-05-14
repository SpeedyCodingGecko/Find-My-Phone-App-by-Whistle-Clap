package com.toolapp.findphonebyclapandwhistle.MyActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.RelativeLayout;

import com.toolapp.findphonebyclapandwhistle.R;
import com.toolapp.findphonebyclapandwhistle.MyTools.MySharedPreferences;
import com.toolapp.findphonebyclapandwhistle.MyTools.SOSFlasher;
import com.toolapp.findphonebyclapandwhistle.databinding.ActivityAlertBinding;
import com.toolapp.findphonebyclapandwhistle.functions.ControlForSounds;

public class ActivityAlertClass extends AppCompatActivity {
    public static boolean ON_SCREEN = false;

    public ControlForSounds soundModeController;
    RelativeLayout stop_btn;
    Vibrator vibrator;

    ActivityAlertBinding binding;
    MediaPlayer mediaPlayer;
    int Musicitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ON_SCREEN = true;
        this.vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        this.soundModeController = new ControlForSounds(this);

        this.stop_btn = findViewById(R.id.rl_alert_stop_btn);
        flashlight();
        if (new MySharedPreferences(getApplicationContext()).getBoolean("switchvibrate", false)) {
            vibrator();
        }

        this.stop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityAlertClass.ON_SCREEN = false;
                ActivityAlertClass.this.vibrator.cancel();
                ActivityAlertClass.this.finish();
                new SOSFlasher(getApplicationContext()).turnOffFlashlight();

            }
        });
        String item_image = new MySharedPreferences(getApplicationContext()).getString("applybtn_image", "");

        if (item_image.equals("cat")) {
            binding.ivItemImage.setImageResource(R.drawable.iv_cat);
            Musicitem = R.raw.catmeowing;
        } else if (item_image.equals("dog")) {
            binding.ivItemImage.setImageResource(R.drawable.iv_dog);
            Musicitem = R.raw.dogbarking;
        } else if (item_image.equals("heystayhere")) {
            binding.ivItemImage.setImageResource(R.drawable.iv_girl);
            Musicitem = R.raw.heystayhere;
        } else if (item_image.equals("whistle")) {
            binding.ivItemImage.setImageResource(R.drawable.ic_whistle);
            Musicitem = R.raw.whistle;
        } else if (item_image.equals("hello")) {
            binding.ivItemImage.setImageResource(R.drawable.ic_hello);
            Musicitem = R.raw.hello;
        } else if (item_image.equals("carhonk")) {
            binding.ivItemImage.setImageResource(R.drawable.iv_car);
            Musicitem = R.raw.carhonk;
        } else if (item_image.equals("doorbell")) {
            binding.ivItemImage.setImageResource(R.drawable.ic_doorball);
            Musicitem = R.raw.doorbell;
        } else if (item_image.equals("partyhorn")) {
            binding.ivItemImage.setImageResource(R.drawable.ic_party);
            Musicitem = R.raw.partyhorn;
        } else if (item_image.equals("policewhistle")) {
            binding.ivItemImage.setImageResource(R.drawable.ic_whistles);
            Musicitem = R.raw.policewhistle;
        } else if (item_image.equals("cavalry")) {
            binding.ivItemImage.setImageResource(R.drawable.ic_cavalry);
            Musicitem = R.raw.cavalry;
        } else if (item_image.equals("piano")) {
            binding.ivItemImage.setImageResource(R.drawable.iv_piano);
            Musicitem = R.raw.piano;
        } else if (item_image.equals("clap")) {
            binding.ivItemImage.setImageResource(R.drawable.iv_clap);
            Musicitem = R.raw.clap;
        } else {
            binding.ivItemImage.setImageResource(R.drawable.iv_cat);
            Musicitem = R.raw.catmeowing;
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), Musicitem);
        music();
        show_on_lockScreen();
    }


    private void music() {
        int selected_time;
        String name = new MySharedPreferences(getApplicationContext()).getString("duration", "");
        if (name.equals("15s")) {
            selected_time = 15000;
        } else if (name.equals("30s")) {
            selected_time = 30000;
        } else if (name.equals("1m")) {
            selected_time = 60000;
        } else if (name.equals("2m")) {
            selected_time = 120000;
        } else {
            selected_time = 15000;
        }
        if (new MySharedPreferences(getApplicationContext()).getBoolean("soundbtn", false)) {
            mediaPlayer.start();
            mediaPlayer.setLooping(true);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                }
            }, selected_time);
        }

    }


    private void flashlight() {
        if (new MySharedPreferences(getApplicationContext()).getBoolean("switchflash", false)) {
            new SOSFlasher(getApplicationContext()).turnOnFlashlight();
        }
    }

    private void vibrator() {
        String vibratorValue = new MySharedPreferences(getApplicationContext()).getString("vibrateradiobtn", "Default");

        if (vibratorValue.equals("Default")) {
            this.vibrator.vibrate(new long[]{60, 120, 180, 240, 300, 360, 420, 480}, 1);
        } else if (vibratorValue.equals("Strong Vibration")) {
            this.vibrator.vibrate(1000);
        } else if (vibratorValue.equals("Heartbeat")) {
            long[] heartbeatPattern = {0, 200, 200, 200, 200, 200};
            VibrationEffect effect = VibrationEffect.createWaveform(heartbeatPattern, 1);
            vibrator.vibrate(effect);
        } else if (vibratorValue.equals("Ticktock")) {
            long[] tiktokPattern = {0, 100, 200, 100, 200};
            VibrationEffect effect = VibrationEffect.createWaveform(tiktokPattern, 1);
            vibrator.vibrate(effect);
        } else {
            this.vibrator.vibrate(new long[]{60, 120, 180, 240, 300, 360, 420, 480}, 1);
        }

    }

    private void show_on_lockScreen() {
        getWindow().addFlags(6815872);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override
    // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ON_SCREEN = false;
        super.onDestroy();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        new SOSFlasher(getApplicationContext()).turnOffFlashlight();

    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ON_SCREEN = false;
        this.vibrator.cancel();
        super.onBackPressed();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        new SOSFlasher(getApplicationContext()).turnOffFlashlight();
    }
}
