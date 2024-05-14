package com.toolapp.findphonebyclapandwhistle.MyActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.toolapp.findphonebyclapandwhistle.MyActivities.Starting_1_Activity;
import com.toolapp.findphonebyclapandwhistle.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import e.n;
import e5.a;
import m.c;
import p2.f;
import p2.g;
import p2.i;

/* loaded from: classes.dex */
public class Starting_1_Activity extends n {
    public static final /* synthetic */ int B = 0;
    public c A;

    @Override // androidx.fragment.app.x, androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 != 2323 || Settings.canDrawOverlays(this)) {
            return;
        }
        Toast.makeText(this, "Overlay permission not granted", 0).show();
    }

    @Override // androidx.fragment.app.x, androidx.activity.l, x.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RelativeLayout relativeLayout;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_starting1, (ViewGroup) null, false);
        int i7 = R.id.bannerLayout;
        LinearLayout linearLayout = (LinearLayout) a.H(inflate, R.id.bannerLayout);
        if (linearLayout != null) {
            i7 = R.id.iv_starting_image;
            ImageView imageView = (ImageView) a.H(inflate, R.id.iv_starting_image);
            if (imageView != null) {
                i7 = R.id.rl_continue_btn;
                RelativeLayout relativeLayout2 = (RelativeLayout) a.H(inflate, R.id.rl_continue_btn);
                if (relativeLayout2 != null) {
                    i7 = R.id.switch_recode_permission;
                    SwitchMaterial switchMaterial = (SwitchMaterial) a.H(inflate, R.id.switch_recode_permission);
                    if (switchMaterial != null) {
                        c cVar = new c((RelativeLayout) inflate, linearLayout, imageView, relativeLayout2, switchMaterial, 5);
                        this.A = cVar;
                        switch (5) {
                            case 4:
                                relativeLayout = (RelativeLayout) cVar.f12085a;
                                break;
                            default:
                                relativeLayout = (RelativeLayout) cVar.f12085a;
                                break;
                        }
                        setContentView(relativeLayout);
                        String string = getString(R.string.banner);
                        i iVar = new i(this);
                        iVar.setAdUnitId(string);
                        iVar.setAdSize(g.f12769h);
                        iVar.a(new f(new q5.c(11)));
                        ((LinearLayout) this.A.f12086b).addView(iVar);
                        iVar.setVisibility(0);
                        ((SwitchMaterial) this.A.f12089e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: m2.q
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                                int i8 = Starting_1_Activity.B;
                                Starting_1_Activity starting_1_Activity = Starting_1_Activity.this;
                                starting_1_Activity.getClass();
                                if (z7) {
                                    if (!Settings.canDrawOverlays(starting_1_Activity)) {
                                        starting_1_Activity.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + starting_1_Activity.getPackageName())), 2323);
                                    }
                                    new com.google.android.gms.internal.clearcut.o(starting_1_Activity).i("android.permission.RECORD_AUDIO", "android.permission.POST_NOTIFICATIONS").e(new g2.c(11, starting_1_Activity));
                                }
                            }
                        });
                        ((RelativeLayout) this.A.f12088d).setOnClickListener(new m2.i(3, this));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
    }
}