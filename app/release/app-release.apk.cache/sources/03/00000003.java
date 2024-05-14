package com.toolapp.findphonebyclapandwhistle.MyActivities;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.view.View;
import com.toolapp.findphonebyclapandwhistle.R;
import e.n;
import n2.c;

/* loaded from: classes.dex */
public class ItemSelectActivity extends n {
    public static final /* synthetic */ int H = 0;
    public c A;
    public int C;
    public MediaPlayer D;
    public String E;
    public String G;
    public final int[] B = {R.id.ll_timer_15s, R.id.ll_timer_30s, R.id.ll_timer_1m, R.id.ll_timer_2m};
    public boolean F = false;

    public final void o(int i7, String str) {
        int[] iArr;
        int i8;
        for (int i9 : this.B) {
            View findViewById = findViewById(i9);
            if (i9 == i7) {
                SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("MyAppPrefs", 0).edit();
                edit.putString("duration", str);
                edit.apply();
                i8 = R.drawable.selected_language_btn_bg;
            } else {
                i8 = R.drawable.duration_btn_bg;
            }
            findViewById.setBackgroundResource(i8);
        }
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (this.D.isPlaying()) {
            this.D.stop();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016e, code lost:
        if (r1.equals("policewhistle") == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03da  */
    @Override // androidx.fragment.app.x, androidx.activity.l, x.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.demo.clap.Activities.ItemSelectActivity.onCreate(android.os.Bundle):void");
    }

    @Override // e.n, androidx.fragment.app.x, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.D.isPlaying()) {
            this.D.stop();
        }
    }
}