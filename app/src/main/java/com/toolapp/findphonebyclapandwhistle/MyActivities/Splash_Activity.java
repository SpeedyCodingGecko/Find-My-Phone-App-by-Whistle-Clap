package com.toolapp.findphonebyclapandwhistle.MyActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;

import com.toolapp.findphonebyclapandwhistle.MyTools.MySharedPreferences;
import com.toolapp.findphonebyclapandwhistle.R;

import java.util.Locale;

public class Splash_Activity extends AppCompatActivity {

    Boolean sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Locale locale = new Locale(new MySharedPreferences(getApplicationContext()).getString("code", "en"));
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        sd = sharedPreferences.getBoolean("age", false);

        myEdit.commit();
        intentToHomeScreen();

    }

    public void navigate() {
        if(!sd) {
            startActivity(new Intent(Splash_Activity.this, SelectItems.class));
        } else {
            startActivity(new Intent(Splash_Activity.this, StartActivity.class));
        }
        finish();
        return;

    }

    public void intentToHomeScreen() {

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                navigate();
            }
        }, 3000);
    }
}