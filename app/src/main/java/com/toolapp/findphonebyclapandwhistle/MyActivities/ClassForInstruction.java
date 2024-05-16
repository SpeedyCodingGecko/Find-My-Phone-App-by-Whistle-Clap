package com.toolapp.findphonebyclapandwhistle.MyActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.toolapp.findphonebyclapandwhistle.databinding.ActivityHowToUseBinding;

public class InstructionClass extends AppCompatActivity {

    ActivityHowToUseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHowToUseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ivBackBtn.setOnClickListener(v -> {
            onBackPressed();
        });



    }

    @Override
    public void onBackPressed() {
        InstructionClass.super.onBackPressed();

    }
}