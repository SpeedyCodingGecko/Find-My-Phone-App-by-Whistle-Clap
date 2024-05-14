package com.toolapp.findphonebyclapandwhistle.MyActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import com.toolapp.findphonebyclapandwhistle.MyTools.MySharedPreferences;
import com.toolapp.findphonebyclapandwhistle.databinding.ActivityHomeScreenBinding;
import com.toolapp.findphonebyclapandwhistle.functions.ServicesForConst;
import com.toolapp.findphonebyclapandwhistle.myservice.MyServices;
import com.toolapp.findphonebyclapandwhistle.R;

import java.util.Locale;

public class HomeActivityClass extends AppCompatActivity {

    public static int MANAGE_OVERLAY_PERMISSION_REQUEST_CODE = 6839;
    ActivityHomeScreenBinding binding;
    boolean isactive = false;
    private boolean shouldChangeLanguage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toolbar toolbar=findViewById(R.id.toolBar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        SharedPreferences preferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        updateLanguage();





        SharedPreferences.Editor editor = preferences.edit();

        binding.rvBtnStartStop.setOnClickListener(v -> {

        });

        isactive = preferences.getBoolean("active", false);

        if (isactive) {
            binding.tvActiveDeactive.setText(getString(R.string.DeActive));
            binding.lottieLoader.setVisibility(View.VISIBLE);
            binding.rvBtnStartStop.setVisibility(View.GONE);
        } else {
            binding.tvActiveDeactive.setText(getString(R.string.Active));
            binding.lottieLoader.setVisibility(View.GONE);
            binding.rvBtnStartStop.setVisibility(View.VISIBLE);
        }

        binding.rvActiveBtn.setOnClickListener(v -> {
            PermissionChk();
            if (isactive) {
                editor.putBoolean("active", false);
                editor.apply();
                binding.tvActiveDeactive.setText(getString(R.string.Active));
                HomeActivityClass.this.stopService();
                isactive = false;
                binding.lottieLoader.setVisibility(View.GONE);
                binding.rvBtnStartStop.setVisibility(View.VISIBLE);
            } else {
                editor.putBoolean("active", true);
                editor.apply();
                HomeActivityClass.this.startService();
                isactive = true;
                binding.tvActiveDeactive.setText(getString(R.string.DeActive));
                binding.lottieLoader.setVisibility(View.VISIBLE);
                binding.rvBtnStartStop.setVisibility(View.GONE);
            }

        });

        binding.ivBtnSetting.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivityClass.this, SettingsActivity.class));


        });

        binding.ivBtnInfo.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivityClass.this, InstructionClass.class));
        });

        binding.ivBtnLanguage.setOnClickListener(v -> {});


        requestPermissions(new String[]{"android.permission.RECORD_AUDIO", "android.permission.POST_NOTIFICATION"}, 101);
        if (Build.VERSION.SDK_INT >= 31) {
            requestPermissions(new String[]{"android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"}, 101);
        }

        item_image_select();
    }

    public void PermissionChk() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (!Settings.canDrawOverlays(this)) {
                startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), MANAGE_OVERLAY_PERMISSION_REQUEST_CODE);
                return;
            }
            return;
        }
    }

    private void item_image_select() {
        String item_image = new MySharedPreferences(getApplicationContext()).getString("applybtn_image", "");
        if (item_image.equals("cat")) {
            binding.ivStartStop.setImageResource(R.drawable.iv_cat);
        } else if (item_image.equals("dog")) {
            binding.ivStartStop.setImageResource(R.drawable.iv_dog);
        } else if (item_image.equals("heystayhere")) {
            binding.ivStartStop.setImageResource(R.drawable.iv_girl);
        } else if (item_image.equals("whistle")) {
            binding.ivStartStop.setImageResource(R.drawable.ic_whistle);
        } else if (item_image.equals("hello")) {
            binding.ivStartStop.setImageResource(R.drawable.ic_hello);
        } else if (item_image.equals("carhonk")) {
            binding.ivStartStop.setImageResource(R.drawable.iv_car);
        } else if (item_image.equals("doorbell")) {
            binding.ivStartStop.setImageResource(R.drawable.ic_doorball);
        } else if (item_image.equals("partyhorn")) {
            binding.ivStartStop.setImageResource(R.drawable.ic_party);
        } else if (item_image.equals("policewhistle")) {
            binding.ivStartStop.setImageResource(R.drawable.ic_whistles);
        } else if (item_image.equals("cavalry")) {
            binding.ivStartStop.setImageResource(R.drawable.ic_cavalry);
        } else if (item_image.equals("piano")) {
            binding.ivStartStop.setImageResource(R.drawable.iv_piano);
        } else if (item_image.equals("clap")) {
            binding.ivStartStop.setImageResource(R.drawable.iv_clap);
        } else {
            binding.ivStartStop.setImageResource(R.drawable.iv_cat);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        item_image_select();

        updateLanguage();
        setContentView(binding.getRoot());
    }

    public void startService() {
        Intent intent = new Intent(this, MyServices.class);
        intent.setAction(ServicesForConst.INTENT_ACTION.STARTFOREGROUND_ACTION);
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
    }

    public void stopService() {
        Intent intent = new Intent(this, MyServices.class);
        intent.setAction(ServicesForConst.INTENT_ACTION.STOPFOREGROUND_ACTION);
        stopService(intent);
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

    @Override
    public void onBackPressed() {
        HomeActivityClass.super.onBackPressed();
    }
}