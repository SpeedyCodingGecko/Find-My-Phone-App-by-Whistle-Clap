package com.toolapp.findphonebyclapandwhistle.MyActivities;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.toolapp.findphonebyclapandwhistle.R;
import com.toolapp.findphonebyclapandwhistle.adapters.AdapterForSoundclass;
import com.toolapp.findphonebyclapandwhistle.adapters.PhoneAdapterForClass;
import com.toolapp.findphonebyclapandwhistle.datamodelclasses.DataModelForPhoneClass;
import com.toolapp.findphonebyclapandwhistle.datamodelclasses.DataModeForlSoundClass;

import java.util.ArrayList;

public class SelectItems extends AppCompatActivity {
    public static final int ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE = 2323;

    com.toolapp.findphonebyclapandwhistle.databinding.ActivityStarting1Binding binding;
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = com.toolapp.findphonebyclapandwhistle.databinding.ActivityStarting1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


     //   Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        // to make the Navigation drawer icon always appear on the action bar
       // Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        binding.toolBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupWindow(v);
            }
        });

// Set the custom switch track and thumb drawables
        binding.customSwitch.setTrackDrawable(getResources().getDrawable(R.drawable.bg_track, null));
        binding.customSwitch.setThumbDrawable(getResources().getDrawable(R.drawable.thumb, null));
// Set initial state of the switch
        binding.customSwitch.setChecked(false);
// Listen for switch state changes
        binding.customSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                @SuppressLint("UseCompatLoadingForDrawables") Drawable trackDrawable = getResources().getDrawable(R.drawable.bg_track, null);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable thumbDrawable = getResources().getDrawable(R.drawable.thumb, null);
                if (isChecked) {
                    // Switch is ON
                    // Change the switch track color to green
                    binding.customSwitch.setTrackDrawable(trackDrawable);
                    // Change the switch thumb color to white
                    binding.customSwitch.setThumbDrawable(thumbDrawable);
                    // Show the TextView and RecyclerView
                    binding.txtviewsoundimage.setVisibility(View.VISIBLE);
                    binding.secondRecycler.setVisibility(View.VISIBLE);
                } else {
                    // Switch is OFF
                    // Change the switch track color to red
                    binding.customSwitch.setTrackDrawable(trackDrawable);
                    // Change the switch thumb color to white
                    binding.customSwitch.setThumbDrawable(thumbDrawable);
                    // Hide the TextView and RecyclerView
                    binding.txtviewsoundimage.setVisibility(View.GONE);
                    binding.secondRecycler.setVisibility(View.GONE);
                }
            }
        });
        RecyclerView recyclerView = binding.recyclerViewPhone;
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);

        ArrayList<DataModelForPhoneClass> arrayList = new ArrayList<>();
        arrayList.add(
                new DataModelForPhoneClass(
                        Color.parseColor("#fef0e5"),
                        R.drawable.mask,
                        R.drawable.whistle,
                        "Whistle",
                        "Find phone \nthrough whistle"
                )
        );
        arrayList.add(
                new DataModelForPhoneClass(
                        Color.parseColor("#cbc3e3"),
                        R.drawable.mashgroupblue,
                        R.drawable.claphand,
                        "Clap",
                        "Find phone \nthrough clap"
                )
        );
        PhoneAdapterForClass adapter = new PhoneAdapterForClass(arrayList);
        recyclerView.setAdapter(adapter);
        RecyclerView recyclerViewSounds = binding.recyclerSounds;
        GridLayoutManager layoutManagerSounds = new GridLayoutManager(this, 3);
        recyclerViewSounds.setLayoutManager(layoutManagerSounds);
        ArrayList<DataModeForlSoundClass> arraySoundList = new ArrayList<>();
        arraySoundList.add(new DataModeForlSoundClass(Color.parseColor("#fef0e5"), R.drawable.catimage));
        arraySoundList.add(new DataModeForlSoundClass(Color.parseColor("#fef0e5"), R.drawable.ic_doorball));
        arraySoundList.add(new DataModeForlSoundClass(Color.parseColor("#fef0e5"), R.drawable.iv_girl));
        arraySoundList.add(new DataModeForlSoundClass(Color.parseColor("#fef0e5"), R.drawable.iv_piano));
        arraySoundList.add(new DataModeForlSoundClass(Color.parseColor("#fef0e5"), R.drawable.iv_car));
        arraySoundList.add(new DataModeForlSoundClass(Color.parseColor("#fef0e5"), R.drawable.ic_party));
        arraySoundList.add(new DataModeForlSoundClass(Color.parseColor("#fef0e5"), R.drawable.police));

        AdapterForSoundclass adapterSound = new AdapterForSoundclass(SelectItems.this,arraySoundList);
        recyclerViewSounds.setAdapter(adapterSound);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            Toast.makeText(this, ""+item.getItemId(), Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public boolean checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this)) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE);
            return false;
        }
        return true;
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && Settings.canDrawOverlays(this)) {
                // Overlay permission granted, you can proceed.
                //  Toast.makeText(this, "Overlay permission granted", Toast.LENGTH_SHORT).show();
            } else {
                // Overlay permission not granted, handle accordingly.
                Toast.makeText(this, "Overlay permission not granted", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void showPopupWindow(View view) {
        // Create a new instance of PopupWindow
        PopupWindow popupWindow = new PopupWindow(this);
        // Inflate the popup layout
        View popupView = getLayoutInflater().inflate(R.layout.popuplayout, null);
        ImageView crossicon=popupView.findViewById(R.id.crossicon);
        TextView txtsettings=popupView.findViewById(R.id.txtsettings);
        txtsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectItems.this,SettingsActivity.class);
                startActivity(intent);
            }
        });
        TextView shareapps=popupView.findViewById(R.id.shareapp);
        shareapps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String playStoreLink = "https://play.google.com/store/apps/details?id=" + getPackageName();
                intent.putExtra(Intent.EXTRA_TEXT, playStoreLink);
                startActivity(Intent.createChooser(intent, "Share app via"));
            }
        });
        TextView privacy=popupView.findViewById(R.id.privacy);
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectItems.this,PrivacyPolicy.class);
                startActivity(intent);
            }
        });
        crossicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        // Set content view
        popupWindow.setContentView(popupView);
        // Set width and height
        popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        // Show the popup window
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    }
}