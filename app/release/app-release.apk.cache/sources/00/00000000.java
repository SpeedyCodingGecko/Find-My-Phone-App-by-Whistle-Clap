package com.toolapp.findphonebyclapandwhistle.MyActivities;

import android.media.MediaPlayer;
import android.os.Vibrator;
import android.widget.RelativeLayout;
import e.n;
import m.c;
import n2.a;

/* loaded from: classes.dex */
public class AlertActivity extends n {
    public static boolean F = false;
    public RelativeLayout A;
    public Vibrator B;
    public a C;
    public MediaPlayer D;
    public int E;

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        F = false;
        this.B.cancel();
        super.onBackPressed();
        if (this.D.isPlaying()) {
            this.D.stop();
        }
        new c(getApplicationContext()).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02da  */
    @Override // androidx.fragment.app.x, androidx.activity.l, x.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.demo.clap.Activities.AlertActivity.onCreate(android.os.Bundle):void");
    }

    @Override // e.n, androidx.fragment.app.x, android.app.Activity
    public final void onDestroy() {
        F = false;
        super.onDestroy();
        if (this.D.isPlaying()) {
            this.D.stop();
        }
        new c(getApplicationContext()).c();
    }
}