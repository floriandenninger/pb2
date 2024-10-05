package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.bvx;
import defpackage.bwh;
import defpackage.bwk;
import defpackage.gbo;
import defpackage.gbp;
import defpackage.gbq;
import defpackage.whu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HatsContainer extends GridLayout {
    View a;
    ImageView b;
    View c;
    YouTubeTextView d;
    HatsSurvey e;
    public ViewGroup f;
    public boolean g;
    boolean h;
    private gbp i;
    private int j;

    public HatsContainer(Context context) {
        super(context);
        this.h = false;
        this.j = 0;
    }

    public final gbp a() {
        if (this.i == null) {
            this.i = new gbp(this);
        }
        return this.i;
    }

    public final void b() {
        if (this.j != 0 || this.d == null) {
            YouTubeTextView youTubeTextView = this.d;
            if (youTubeTextView != null) {
                bwk bwkVar = new bwk();
                bwkVar.J(1);
                bwkVar.D(new LinearInterpolator());
                bvx bvxVar = new bvx(2);
                bvxVar.b = 75L;
                bvxVar.z(youTubeTextView);
                bwkVar.f(bvxVar);
                bvx bvxVar2 = new bvx(1);
                bvxVar2.b = 150L;
                bvxVar2.z(this.e);
                bwkVar.f(bvxVar2);
                gbq gbqVar = new gbq();
                gbqVar.b = 300L;
                gbqVar.z(this);
                bwk bwkVar2 = new bwk();
                bwkVar2.J(0);
                bwkVar2.f(bwkVar);
                bwkVar2.f(gbqVar);
                bwh.b(this, bwkVar2);
            }
            whu.I(this.b, false);
            whu.I(this.c, false);
            YouTubeTextView youTubeTextView2 = this.d;
            if (youTubeTextView2 != null) {
                whu.I(youTubeTextView2, false);
            }
            whu.I(this.e, true);
            whu.I(this.a, this.g);
            this.j = 2;
            return;
        }
        whu.I(this.b, true);
        whu.I(this.c, true);
        whu.I(this.d, true);
        whu.I(this.e, false);
        whu.I(this.a, this.g);
        this.j = 1;
    }

    public final void c() {
        this.j = 0;
        b();
        if (this.h) {
            b();
        }
    }

    public final void d(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void e(YouTubeTextView youTubeTextView) {
        YouTubeTextView youTubeTextView2 = this.d;
        if (youTubeTextView2 != null) {
            this.f.removeView(youTubeTextView2);
        }
        this.d = youTubeTextView;
        if (youTubeTextView != null) {
            this.f.addView(youTubeTextView);
            this.d.setOnClickListener(new gbo(this, 0));
        }
    }

    public final void f(HatsSurvey hatsSurvey) {
        HatsSurvey hatsSurvey2 = this.e;
        if (hatsSurvey2 != null) {
            this.f.removeView(hatsSurvey2);
        }
        this.e = hatsSurvey;
        if (hatsSurvey != null) {
            this.f.addView(hatsSurvey);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ViewGroup) findViewById(R.id.hats_content_container);
        this.a = findViewById(R.id.hats_dismiss);
        this.c = findViewById(R.id.hats_expand_spacing);
        ImageView imageView = (ImageView) findViewById(R.id.hats_expand);
        this.b = imageView;
        imageView.setOnClickListener(new gbo(this, 1));
    }

    public HatsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        this.j = 0;
    }

    public HatsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = false;
        this.j = 0;
    }
}
