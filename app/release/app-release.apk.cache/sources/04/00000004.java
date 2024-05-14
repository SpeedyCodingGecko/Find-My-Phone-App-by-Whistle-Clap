package com.toolapp.findphonebyclapandwhistle.MyActivities;

import android.content.res.Configuration;
import com.google.android.gms.internal.ads.k40;
import e.n;
import java.util.Locale;

/* loaded from: classes.dex */
public class SettingActivity extends n {
    public static final /* synthetic */ int B = 0;
    public k40 A;

    public final void o() {
        String string = getApplicationContext().getSharedPreferences("MyAppPrefs", 0).getString("code", "en");
        Locale locale = getResources().getConfiguration().locale;
        Locale locale2 = new Locale(string);
        if (!locale.equals(locale2)) {
            Locale.setDefault(locale2);
            Configuration configuration = new Configuration();
            configuration.setLocale(locale2);
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            recreate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01d0  */
    @Override // androidx.fragment.app.x, androidx.activity.l, x.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.demo.clap.Activities.SettingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onResume() {
        super.onResume();
        o();
    }
}