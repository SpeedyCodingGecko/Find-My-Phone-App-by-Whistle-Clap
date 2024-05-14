package com.toolapp.findphonebyclapandwhistle.MyActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import com.toolapp.findphonebyclapandwhistle.MyTools.MySharedPreferences;
import com.toolapp.findphonebyclapandwhistle.R;
import com.toolapp.findphonebyclapandwhistle.databinding.ActivityItemSelectBinding;

public class SelectedItem extends AppCompatActivity {

    ActivityItemSelectBinding binding;
    private int[] languageButtons = {
            R.id.ll_timer_15s, R.id.ll_timer_30s, R.id.ll_timer_1m, R.id.ll_timer_2m,
    };

    boolean isSelected = false;
    int Musicitem;
    MediaPlayer mediaPlayer;
    String item_image_name;
    boolean btn_selected = false;
    String Header_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityItemSelectBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        Toolbar toolbar=findViewById(R.id.toolBar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        item_image_name = getIntent().getStringExtra("item");
        Header_name = getIntent().getStringExtra("name_item");


        assert Header_name != null;
        if (!Header_name.isEmpty()) {
            toolbar.setTitle(Header_name);
        }
        switch (item_image_name) {
            case "cat":
                binding.ivItemImage.setImageResource(R.drawable.iv_cat);
                Musicitem = R.raw.catmeowing;
                break;
            case "police":
                binding.ivItemImage.setImageResource(R.drawable.police);
                Musicitem = R.raw.policewhistle;
                break;
            case "heystayhere":
                binding.ivItemImage.setImageResource(R.drawable.iv_girl);
                Musicitem = R.raw.heystayhere;
                break;
            case "whistle":
                binding.ivItemImage.setImageResource(R.drawable.ic_whistle);
                Musicitem = R.raw.whistle;
                break;
            case "hello":
                binding.ivItemImage.setImageResource(R.drawable.hello);
                Musicitem = R.raw.hello;
                break;
            case "carhonk":
                binding.ivItemImage.setImageResource(R.drawable.iv_car);
                Musicitem = R.raw.carhonk;
                break;
            case "doorbell":
                binding.ivItemImage.setImageResource(R.drawable.ic_doorball);
                Musicitem = R.raw.doorbell;
                break;
            case "partyhorn":
                binding.ivItemImage.setImageResource(R.drawable.ic_party);
                Musicitem = R.raw.partyhorn;
                break;
            case "policewhistle":
                binding.ivItemImage.setImageResource(R.drawable.whistle);
                Musicitem = R.raw.policewhistle;
                break;
            case "cavalry":
                binding.ivItemImage.setImageResource(R.drawable.ic_cavalry);
                Musicitem = R.raw.cavalry;
                break;
            case "piano":
                binding.ivItemImage.setImageResource(R.drawable.iv_piano);
                Musicitem = R.raw.piano;
                break;
            case "clap":
                binding.ivItemImage.setImageResource(R.drawable.iv_clap);
                Musicitem = R.raw.clap;
                break;
        }
       mediaPlayer = MediaPlayer.create(getApplicationContext(), Musicitem);
        binding.ivPlayBtn.setOnClickListener(v -> {
            if (btn_selected) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                binding.ivPlayBtn.setImageResource(R.drawable.ic_play_btn);
                btn_selected = false;
            } else {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), Musicitem);
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
                binding.ivPlayBtn.setImageResource(R.drawable.iv_pause);
                btn_selected = true;
            }

        });

        String duration = new MySharedPreferences(getApplicationContext()).getString("duration", "");
        if (duration.equals("15s")) {
            binding.llTimer15s.setBackgroundResource(R.drawable.selected_language_btn_bg);
        } else if (duration.equals("30s")) {
            binding.llTimer30s.setBackgroundResource(R.drawable.selected_language_btn_bg);
        } else if (duration.equals("1m")) {
            binding.llTimer1m.setBackgroundResource(R.drawable.selected_language_btn_bg);
        } else if (duration.equals("2m")) {
            binding.llTimer2m.setBackgroundResource(R.drawable.selected_language_btn_bg);
        } else {
            binding.llTimer15s.setBackgroundResource(R.drawable.selected_language_btn_bg);
        }

        binding.llTimer15s.setOnClickListener(v -> {
            onbtnButtonClick(R.id.ll_timer_15s, "15s");
        });

        binding.llTimer30s.setOnClickListener(v -> {
            onbtnButtonClick(R.id.ll_timer_30s, "30s");
        });

        binding.llTimer1m.setOnClickListener(v -> {
            onbtnButtonClick(R.id.ll_timer_1m, "1m");
        });

        binding.llTimer2m.setOnClickListener(v -> {
            onbtnButtonClick(R.id.ll_timer_2m, "2m");
        });


        binding.rlApplyBtn.setOnClickListener(v -> {
            new MySharedPreferences(getApplicationContext()).setString("applybtn_image", item_image_name);

           Intent intent=new Intent(SelectedItem.this,HomeActivityClass.class);
           startActivity(intent);
          //  onBackPressed();

        });


        MySharedPreferences sharedPreferences = new MySharedPreferences(getApplicationContext());

        boolean btn_selecteds = sharedPreferences.getBoolean("soundbtn", false);

        binding.switchSound.setChecked(btn_selecteds);


        binding.switchSound.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    new MySharedPreferences(getApplicationContext()).setBoolean("soundbtn", true);

                } else {
                    new MySharedPreferences(getApplicationContext()).setBoolean("soundbtn", false);

                }

                if (binding.switchSound.isChecked()) {
                    binding.seekbarVolume.setOnTouchListener((v, event) -> false);
                    binding.llTimer15s.setOnTouchListener((v, event) -> false);
                    binding.llTimer30s.setOnTouchListener((v, event) -> false);
                    binding.llTimer1m.setOnTouchListener((v, event) -> false);
                    binding.llTimer2m.setOnTouchListener((v, event) -> false);
                } else {
                    binding.seekbarVolume.setOnTouchListener((v, event) -> true);
                    binding.llTimer15s.setOnTouchListener((v, event) -> true);
                    binding.llTimer30s.setOnTouchListener((v, event) -> true);
                    binding.llTimer1m.setOnTouchListener((v, event) -> true);
                    binding.llTimer2m.setOnTouchListener((v, event) -> true);
                }
            }
        });

        if (binding.switchSound.isChecked()) {
            binding.seekbarVolume.setOnTouchListener((v, event) -> false);
            binding.llTimer15s.setOnTouchListener((v, event) -> false);
            binding.llTimer30s.setOnTouchListener((v, event) -> false);
            binding.llTimer1m.setOnTouchListener((v, event) -> false);
            binding.llTimer2m.setOnTouchListener((v, event) -> false);
        } else {
            binding.seekbarVolume.setOnTouchListener((v, event) -> true);
            binding.llTimer15s.setOnTouchListener((v, event) -> true);
            binding.llTimer30s.setOnTouchListener((v, event) -> true);
            binding.llTimer1m.setOnTouchListener((v, event) -> true);
            binding.llTimer2m.setOnTouchListener((v, event) -> true);
        }

        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        binding.seekbarVolume.setMax(maxVolume);
        int currVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        binding.seekbarVolume.setProgress(currVolume);

        binding.seekbarVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    public void setvolume(int i) {
        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamVolume(3, (int) ((i / 100.0f) * audioManager.getStreamMaxVolume(3)), 0);
    }

    private void onbtnButtonClick(int clickedButtonId, String value) {
        for (int buttonId : languageButtons) {
            View button = findViewById(buttonId);
            if (buttonId == clickedButtonId) {
                isSelected = true;
                new MySharedPreferences(getApplicationContext()).setString("duration", value);
                button.setBackgroundResource(R.drawable.selected_language_btn_bg);
            } else {
                button.setBackgroundResource(R.drawable.duration_btn_bg);
            }
        }
    }

    @Override
    public void onBackPressed() {
        SelectedItem.super.onBackPressed();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }
}