package com.toolapp.findphonebyclapandwhistle.MyActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.toolapp.findphonebyclapandwhistle.R;
import com.toolapp.findphonebyclapandwhistle.databinding.ActivityLetsStartBinding;

public class StartActivity extends AppCompatActivity {

    ActivityLetsStartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLetsStartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.rlBtnLetsstart.setOnClickListener(v -> {
            Intent intent = new Intent(StartActivity.this, HomeActivityClass.class);
            intent.putExtra("activity", "letsstart");
            startActivity(intent);

        });

        binding.rlRateusBtn.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName()); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        });

        binding.rlShareappBtn.setOnClickListener(v -> {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "hello");
            sendIntent.setType("text/plain");
            Intent shareIntent = Intent.createChooser(sendIntent, null);
            startActivity(shareIntent);
        });
        binding.rlPrivacyBtn.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.termsfeed.com/live/86aab490-3471-479d-846e-81ecb6dedd64"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
    @Override
    public void onBackPressed() {
        showBottomsheet();
    }
    public void showBottomsheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.exit_bottomsheet_layout);
        bottomSheetDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        RelativeLayout yes_btn = bottomSheetDialog.findViewById(R.id.rv_btn_yes);

        yes_btn.setOnClickListener(v -> {
            bottomSheetDialog.dismiss();
            finish();
        });


        RelativeLayout no_btn = bottomSheetDialog.findViewById(R.id.rv_btn_no);
        no_btn.setOnClickListener(v -> {
            bottomSheetDialog.dismiss();
        });

        bottomSheetDialog.show();
    }
}