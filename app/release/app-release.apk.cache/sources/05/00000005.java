package com.toolapp.findphonebyclapandwhistle.MyActivities;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.b;
import androidx.activity.e;
import com.toolapp.findphonebyclapandwhistle.R;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.wr;
import e.n;
import java.util.Locale;
import l2.c;
import p2.p;
import w2.h2;
import w2.i2;
import w2.q;
import w2.t2;
import y2.d0;

/* loaded from: classes.dex */
public class Splash_Activity extends n {
    public static final /* synthetic */ int C = 0;
    public c A;
    public Boolean B;

    public final void o() {
        new Handler().postDelayed(new e(13, this), 3000L);
    }

    @Override // androidx.fragment.app.x, androidx.activity.l, x.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        Locale locale = new Locale(getApplicationContext().getSharedPreferences("MyAppPrefs", 0).getString("code", "en"));
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        this.B = Boolean.valueOf(sharedPreferences.getBoolean("age", false));
        edit.commit();
        Object obj = new Object() { // from class: m2.p
        };
        final i2 c5 = i2.c();
        synchronized (c5.f13963a) {
            if (c5.f13965c) {
                c5.f13964b.add(obj);
            } else if (c5.f13966d) {
                c5.b();
            } else {
                c5.f13965c = true;
                c5.f13964b.add(obj);
                synchronized (c5.f13967e) {
                    try {
                        c5.a(this);
                        c5.f13968f.j3(new h2(c5));
                        c5.f13968f.o1(new gl());
                        p pVar = c5.f13969g;
                        if (pVar.f12787a != -1 || pVar.f12788b != -1) {
                            try {
                                c5.f13968f.B1(new t2(pVar));
                            } catch (RemoteException e7) {
                                d0.h("Unable to set request configuration parcel.", e7);
                            }
                        }
                    } catch (RemoteException e8) {
                        d0.k("MobileAdsSettingManager initialization failed", e8);
                    }
                    pe.a(this);
                    if (((Boolean) of.f6111a.j()).booleanValue()) {
                        if (((Boolean) q.f14003d.f14006c.a(pe.Q8)).booleanValue()) {
                            d0.e("Initializing on bg thread");
                            wr.f8833a.execute(new Runnable() { // from class: w2.g2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            i2 i2Var = c5;
                                            Context context = this;
                                            synchronized (i2Var.f13967e) {
                                                i2Var.e(context);
                                            }
                                            return;
                                        default:
                                            i2 i2Var2 = c5;
                                            Context context2 = this;
                                            synchronized (i2Var2.f13967e) {
                                                i2Var2.e(context2);
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                    }
                    if (((Boolean) of.f6112b.j()).booleanValue()) {
                        if (((Boolean) q.f14003d.f14006c.a(pe.Q8)).booleanValue()) {
                            wr.f8834b.execute(new Runnable() { // from class: w2.g2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            i2 i2Var = c5;
                                            Context context = this;
                                            synchronized (i2Var.f13967e) {
                                                i2Var.e(context);
                                            }
                                            return;
                                        default:
                                            i2 i2Var2 = c5;
                                            Context context2 = this;
                                            synchronized (i2Var2.f13967e) {
                                                i2Var2.e(context2);
                                            }
                                            return;
                                    }
                                }
                            });
                        }
                    }
                    d0.e("Initializing on calling thread");
                    c5.e(this);
                }
            }
        }
        this.A = new c(this);
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
                new Handler().postDelayed(new b(7, this), 2000L);
            } else {
                this.A.a();
            }
        } catch (Exception e9) {
            Log.d("patel", "onCreate: " + e9);
        }
    }
}