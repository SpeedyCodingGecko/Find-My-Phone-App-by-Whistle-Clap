package com.toolapp.findphonebyclapandwhistle.MyActivities;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.toolapp.findphonebyclapandwhistle.R;
import com.google.android.ads.nativetemplates.TemplateView;
import e.e;
import e.n;
import e5.a;
import m.c;
import p2.f;
import p2.g;
import p2.i;

/* loaded from: classes.dex */
public class HowToUseActivity extends n {
    public static final /* synthetic */ int B = 0;
    public c A;

    @Override // androidx.activity.l, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.x, androidx.activity.l, x.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RelativeLayout relativeLayout;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_how_to_use, (ViewGroup) null, false);
        int i7 = R.id.bannerLayout;
        LinearLayout linearLayout = (LinearLayout) a.H(inflate, R.id.bannerLayout);
        if (linearLayout != null) {
            i7 = R.id.header;
            RelativeLayout relativeLayout2 = (RelativeLayout) a.H(inflate, R.id.header);
            if (relativeLayout2 != null) {
                i7 = R.id.iv_back_btn;
                ImageView imageView = (ImageView) a.H(inflate, R.id.iv_back_btn);
                if (imageView != null) {
                    i7 = R.id.text_howtouse;
                    TextView textView = (TextView) a.H(inflate, R.id.text_howtouse);
                    if (textView != null) {
                        c cVar = new c((RelativeLayout) inflate, linearLayout, relativeLayout2, imageView, textView, 4);
                        this.A = cVar;
                        switch (4) {
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
                        new e(this, (TemplateView) findViewById(R.id.nativead)).q();
                        ((ImageView) this.A.f12088d).setOnClickListener(new m2.i(0, this));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
    }
}