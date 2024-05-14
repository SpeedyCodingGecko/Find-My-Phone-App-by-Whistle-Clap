package com.toolapp.findphonebyclapandwhistle.MyActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.toolapp.findphonebyclapandwhistle.R;
import com.toolapp.findphonebyclapandwhistle.MyTools.MySharedPreferences;
import com.toolapp.findphonebyclapandwhistle.databinding.ActivitySettingBinding;

import java.util.Locale;

public class SettingsActivity extends AppCompatActivity {

    ActivitySettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        updateLanguage();

        binding.ivBackBtn.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.ivBtnLanguage.setOnClickListener(v -> {
        //    startActivity(new Intent(SettingActivity.this, Language_Activity.class));

        });

        flashSettings();
        vibratesetting();

    }

    public void flashSettings() {
        boolean switchFlashValue = new MySharedPreferences(getApplicationContext()).getBoolean("switchflash", false);

        binding.switchFlash.setChecked(switchFlashValue);
        binding.switchFlash.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                new MySharedPreferences(getApplicationContext()).setBoolean("switchflash", isChecked);
            }
        });

        String flashradioset = new MySharedPreferences(getApplicationContext()).getString("flashradiobtn", "Default");
        if (flashradioset.equals("Default")) {
            binding.flashRadioGroup.check(R.id.flash_default);
        } else if (flashradioset.equals("Disco Mode")) {
            binding.flashRadioGroup.check(R.id.flash_disco_mode);
        } else if (flashradioset.equals("SOS Mode")) {
            binding.flashRadioGroup.check(R.id.flash_sos_mode);
        } else {
            binding.flashRadioGroup.check(R.id.flash_default);
        }

        binding.flashRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                String selectedOption = radioButton.getText().toString();
                new MySharedPreferences(getApplicationContext()).setString("flashradiobtn", selectedOption);
            }
        });
    }

    public void vibratesetting() {
        boolean switchVibrateValue = new MySharedPreferences(getApplicationContext()).getBoolean("switchvibrate", false);

        binding.switchVibrate.setChecked(switchVibrateValue);
        binding.switchVibrate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                new MySharedPreferences(getApplicationContext()).setBoolean("switchvibrate", isChecked);
            }
        });

        int vibrateradioset = new MySharedPreferences(getApplicationContext()).getFlash("vibrateradiobtn", 0);
        if (/*vibrateradioset.equals("Default")*/ vibrateradioset == 0) {
            binding.radioVibrateGroup.check(R.id.vibrate_default);
        } else if (/*vibrateradioset.equals("Strong Vibration")*/ vibrateradioset == 1) {
            binding.radioVibrateGroup.check(R.id.vibrate_strong);
        } else if (/*vibrateradioset.equals("Heartbeat")*/vibrateradioset == 2) {
            binding.radioVibrateGroup.check(R.id.vibrate_heartbeat);
        } else if (/*vibrateradioset.equals("Ticktock")*/ vibrateradioset == 3) {
            binding.radioVibrateGroup.check(R.id.vibrate_tiktok);
        } else {
            binding.radioVibrateGroup.check(R.id.vibrate_default);
        }

        binding.radioVibrateGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                String selectedOption = radioButton.getText().toString();
                new MySharedPreferences(getApplicationContext()).setFLASH("vibrateradiobtn", checkedId);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLanguage();
    }

    private void updateLanguage() {
        String selectedLanguageCode = new MySharedPreferences(getApplicationContext()).getString("code", "en");
        setLocale(selectedLanguageCode);
    }

    private void setLocale(String languageCode) {
        Locale currentLocale = getResources().getConfiguration().locale;
        Locale newLocale = new Locale(languageCode);

        if (!currentLocale.equals(newLocale)) {
            Locale.setDefault(newLocale);
            Configuration config = new Configuration();
            config.setLocale(newLocale);
            getResources().updateConfiguration(config, getResources().getDisplayMetrics());

            // Recreate the activity only if the locale has changed
            recreate();
        }
    }


}