package com.toolapp.findphonebyclapandwhistle.MyActivities;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.toolapp.findphonebyclapandwhistle.MyActivities.Home_screenActivity;
import com.toolapp.findphonebyclapandwhistle.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import e.n;
import e5.a;
import java.util.Locale;
import n2.b;
import p2.f;
import p2.g;
import p2.i;
import q5.c;

/* loaded from: classes.dex */
public class Home_screenActivity extends n {
    public static final /* synthetic */ int C = 0;
    public b A;
    public boolean B = false;

    public final void o() {
        ImageView imageView;
        int i7;
        String string = getApplicationContext().getSharedPreferences("MyAppPrefs", 0).getString("applybtn_image", "");
        if (!string.equals("cat")) {
            if (string.equals("dog")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.iv_dog;
            } else if (string.equals("heystayhere")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.iv_girl;
            } else if (string.equals("whistle")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.ic_whistle;
            } else if (string.equals("hello")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.ic_hello;
            } else if (string.equals("carhonk")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.iv_car;
            } else if (string.equals("doorbell")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.ic_doorball;
            } else if (string.equals("partyhorn")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.ic_party;
            } else if (string.equals("policewhistle")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.ic_whistles;
            } else if (string.equals("cavalry")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.ic_cavalry;
            } else if (string.equals("piano")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.iv_piano;
            } else if (string.equals("clap")) {
                imageView = this.A.f12393h;
                i7 = R.drawable.iv_clap;
            }
            imageView.setImageResource(i7);
            return;
        }
        this.A.f12393h.setImageResource(R.drawable.iv_cat);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.x, androidx.activity.l, x.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_home_screen, (ViewGroup) null, false);
        int i7 = R.id.bannerLayout;
        LinearLayout linearLayout = (LinearLayout) a.H(inflate, R.id.bannerLayout);
        if (linearLayout != null) {
            i7 = R.id.btns;
            if (((LinearLayout) a.H(inflate, R.id.btns)) != null) {
                i7 = R.id.fl_btn_start_stop;
                FrameLayout frameLayout = (FrameLayout) a.H(inflate, R.id.fl_btn_start_stop);
                if (frameLayout != null) {
                    i7 = R.id.header;
                    if (((RelativeLayout) a.H(inflate, R.id.header)) != null) {
                        i7 = R.id.header_text;
                        if (((TextView) a.H(inflate, R.id.header_text)) != null) {
                            i7 = R.id.heystayhere;
                            LinearLayout linearLayout2 = (LinearLayout) a.H(inflate, R.id.heystayhere);
                            if (linearLayout2 != null) {
                                i7 = R.id.iv_btn_info;
                                ImageView imageView = (ImageView) a.H(inflate, R.id.iv_btn_info);
                                if (imageView != null) {
                                    i7 = R.id.iv_btn_language;
                                    ImageView imageView2 = (ImageView) a.H(inflate, R.id.iv_btn_language);
                                    if (imageView2 != null) {
                                        i7 = R.id.iv_btn_setting;
                                        ImageView imageView3 = (ImageView) a.H(inflate, R.id.iv_btn_setting);
                                        if (imageView3 != null) {
                                            i7 = R.id.iv_start_stop;
                                            ImageView imageView4 = (ImageView) a.H(inflate, R.id.iv_start_stop);
                                            if (imageView4 != null) {
                                                i7 = R.id.ll_carHonk;
                                                LinearLayout linearLayout3 = (LinearLayout) a.H(inflate, R.id.ll_carHonk);
                                                if (linearLayout3 != null) {
                                                    i7 = R.id.ll_cat;
                                                    LinearLayout linearLayout4 = (LinearLayout) a.H(inflate, R.id.ll_cat);
                                                    if (linearLayout4 != null) {
                                                        i7 = R.id.ll_cavalry;
                                                        LinearLayout linearLayout5 = (LinearLayout) a.H(inflate, R.id.ll_cavalry);
                                                        if (linearLayout5 != null) {
                                                            i7 = R.id.ll_clap;
                                                            LinearLayout linearLayout6 = (LinearLayout) a.H(inflate, R.id.ll_clap);
                                                            if (linearLayout6 != null) {
                                                                i7 = R.id.ll_dog;
                                                                LinearLayout linearLayout7 = (LinearLayout) a.H(inflate, R.id.ll_dog);
                                                                if (linearLayout7 != null) {
                                                                    i7 = R.id.ll_doorbell;
                                                                    LinearLayout linearLayout8 = (LinearLayout) a.H(inflate, R.id.ll_doorbell);
                                                                    if (linearLayout8 != null) {
                                                                        i7 = R.id.ll_hello;
                                                                        LinearLayout linearLayout9 = (LinearLayout) a.H(inflate, R.id.ll_hello);
                                                                        if (linearLayout9 != null) {
                                                                            i7 = R.id.ll_partyHorn;
                                                                            LinearLayout linearLayout10 = (LinearLayout) a.H(inflate, R.id.ll_partyHorn);
                                                                            if (linearLayout10 != null) {
                                                                                i7 = R.id.ll_piano;
                                                                                LinearLayout linearLayout11 = (LinearLayout) a.H(inflate, R.id.ll_piano);
                                                                                if (linearLayout11 != null) {
                                                                                    i7 = R.id.ll_police_whistle;
                                                                                    LinearLayout linearLayout12 = (LinearLayout) a.H(inflate, R.id.ll_police_whistle);
                                                                                    if (linearLayout12 != null) {
                                                                                        i7 = R.id.ll_whistle;
                                                                                        LinearLayout linearLayout13 = (LinearLayout) a.H(inflate, R.id.ll_whistle);
                                                                                        if (linearLayout13 != null) {
                                                                                            i7 = R.id.lottie_loader;
                                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) a.H(inflate, R.id.lottie_loader);
                                                                                            if (lottieAnimationView != null) {
                                                                                                i7 = R.id.rv_active_btn;
                                                                                                RelativeLayout relativeLayout = (RelativeLayout) a.H(inflate, R.id.rv_active_btn);
                                                                                                if (relativeLayout != null) {
                                                                                                    i7 = R.id.rv_btn_start_stop;
                                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) a.H(inflate, R.id.rv_btn_start_stop);
                                                                                                    if (relativeLayout2 != null) {
                                                                                                        i7 = R.id.tv_active_deactive;
                                                                                                        TextView textView = (TextView) a.H(inflate, R.id.tv_active_deactive);
                                                                                                        if (textView != null) {
                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) inflate;
                                                                                                            this.A = new b(relativeLayout3, linearLayout, frameLayout, linearLayout2, imageView, imageView2, imageView3, imageView4, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, lottieAnimationView, relativeLayout, relativeLayout2, textView);
                                                                                                            setContentView(relativeLayout3);
                                                                                                            SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", 0);
                                                                                                            p();
                                                                                                            LinearLayout linearLayout14 = this.A.f12387b;
                                                                                                            String string = getString(R.string.banner);
                                                                                                            i iVar = new i(this);
                                                                                                            iVar.setAdUnitId(string);
                                                                                                            iVar.setAdSize(g.f12769h);
                                                                                                            iVar.a(new f(new c(11)));
                                                                                                            linearLayout14.addView(iVar);
                                                                                                            iVar.setVisibility(0);
                                                                                                            SharedPreferences.Editor edit = sharedPreferences.edit();
                                                                                                            this.A.f12406v.setOnClickListener(new m2.a(0));
                                                                                                            boolean z7 = sharedPreferences.getBoolean("active", false);
                                                                                                            this.B = z7;
                                                                                                            if (z7) {
                                                                                                                this.A.f12407w.setText(getString(R.string.DeActive));
                                                                                                                this.A.f12404t.setVisibility(0);
                                                                                                                this.A.f12406v.setVisibility(8);
                                                                                                            } else {
                                                                                                                this.A.f12407w.setText(getString(R.string.Active));
                                                                                                                this.A.f12404t.setVisibility(8);
                                                                                                                this.A.f12406v.setVisibility(0);
                                                                                                            }
                                                                                                            this.A.f12405u.setOnClickListener(new m2.c(this, edit, 0));
                                                                                                            this.A.f12392g.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12390e.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12391f.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12395j.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12398m.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12389d.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12403s.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12400o.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12394i.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12399n.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.p.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12402r.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12396k.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12401q.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            this.A.f12397l.setOnClickListener(new View.OnClickListener(this) { // from class: m2.b

                                                                                                                /* renamed from: i  reason: collision with root package name */
                                                                                                                public final /* synthetic */ Home_screenActivity f12137i;

                                                                                                                {
                                                                                                                    this.f12137i = this;
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    int i8 = r2;
                                                                                                                    Home_screenActivity home_screenActivity = this.f12137i;
                                                                                                                    switch (i8) {
                                                                                                                        case 0:
                                                                                                                            int i9 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 1:
                                                                                                                            int i10 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 2:
                                                                                                                            int i11 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                                                                                                            int i12 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 4:
                                                                                                                            int i13 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 0));
                                                                                                                            return;
                                                                                                                        case 5:
                                                                                                                            int i14 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 6:
                                                                                                                            int i15 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 7:
                                                                                                                            int i16 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 8:
                                                                                                                            int i17 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 9:
                                                                                                                            int i18 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 1));
                                                                                                                            return;
                                                                                                                        case 10:
                                                                                                                            int i19 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new d(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 11:
                                                                                                                            int i20 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new e(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 12:
                                                                                                                            int i21 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new f(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        case 13:
                                                                                                                            int i22 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new g(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            int i23 = Home_screenActivity.C;
                                                                                                                            home_screenActivity.getClass();
                                                                                                                            new m.c(home_screenActivity, home_screenActivity).b(new h(home_screenActivity, 2));
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            requestPermissions(new String[]{"android.permission.RECORD_AUDIO", "android.permission.POST_NOTIFICATION"}, 101);
                                                                                                            if (Build.VERSION.SDK_INT >= 31) {
                                                                                                                requestPermissions(new String[]{"android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"}, 101);
                                                                                                            }
                                                                                                            o();
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onResume() {
        super.onResume();
        o();
        p();
        setContentView(this.A.f12386a);
    }

    public final void p() {
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
}