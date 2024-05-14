package com.toolapp.findphonebyclapandwhistle.MyTools;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {
    String PREFS_NAME = "MyAppPrefs";
    private SharedPreferences sharedPreferences;

    Context context;

    public static final String ITEM_KEY = "item_key"; // Declare as final static

    public MySharedPreferences(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key, String defaultValue) {
        return sharedPreferences.getString(key, defaultValue);
    }

    public void setBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }

    public void setFLASH(String key, int value) {
        SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName(), 0).edit();
        edit.putInt(key, value);
        edit.apply();

    }

    public int getFlash(String key, int defaultValue) {
        return context.getSharedPreferences(context.getPackageName(), 0).getInt(key, defaultValue);
    }
}
