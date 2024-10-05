package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.ajct;
import defpackage.jw;
import defpackage.ka;
import defpackage.xfn;
import defpackage.xkg;
import defpackage.xkh;
import defpackage.xkp;
import defpackage.xkq;
import defpackage.xkr;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdCountdownView extends LinearLayout implements View.OnClickListener {
    public xkr a;
    public xkq b;
    public xkh c;
    public ImageView d;
    public boolean e;
    public boolean f;
    public boolean g;
    public xfn h;
    public int i;
    public int j;
    public int k;
    public int l;
    private CharSequence m;
    private CharSequence n;

    public AdCountdownView(Context context) {
        super(context);
        c();
    }

    private final void c() {
        LayoutInflater.from(getContext()).inflate(R.layout.ad_countdown, (ViewGroup) this, true);
        setOrientation(0);
        this.f = true;
        Resources resources = getResources();
        ImageView imageView = (ImageView) findViewById(R.id.content_thumbnail);
        this.d = imageView;
        imageView.setOnClickListener(this);
        this.c = new xkh(getContext(), resources, (ImageView) findViewById(R.id.countdown_background), (AdCountdownTextView) findViewById(R.id.countdown_text), getAlpha());
        this.a = new xkr(this, getBackground(), getAlpha());
        a();
        this.i = resources.getDimensionPixelSize(R.dimen.skip_button_default_bottom_margin);
        this.j = resources.getDimensionPixelSize(R.dimen.skip_button_cta_bottom_margin);
        this.k = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_height);
        this.l = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_width);
        this.m = resources.getText(R.string.video_after_ad_mulitline);
        this.n = resources.getText(R.string.video_after_ads_mulitline);
    }

    public final void a() {
        b(false);
        xkh xkhVar = this.c;
        ajct c = ajct.c(xkhVar.n);
        if (c != null) {
            xkhVar.c.setTypeface(c.b(xkhVar.a, 0), 0);
        }
        xkp xkpVar = xkhVar.d;
        xkpVar.b = null;
        xkpVar.d(5);
        xkhVar.c.setClickable(true);
        xkhVar.c.setAlpha(1.0f);
        AdCountdownTextView adCountdownTextView = xkhVar.c;
        adCountdownTextView.setPadding(xkhVar.j, adCountdownTextView.getPaddingTop(), xkhVar.k, xkhVar.c.getPaddingBottom());
        yny.B(xkhVar.b, xkhVar.l, xkhVar.m);
        yny.B(xkhVar.c, -2, xkhVar.m);
        xkq xkqVar = xkhVar.p;
        if (xkqVar != null) {
            xkqVar.b();
        }
        this.f = true;
        xkq xkqVar2 = this.b;
        if (xkqVar2 != null) {
            xkqVar2.b();
        }
        int i = this.l;
        int i2 = this.k;
        this.d.getLayoutParams().width = i;
        this.d.getLayoutParams().height = i2;
    }

    public final void b(boolean z) {
        this.e = z;
        CharSequence charSequence = this.m;
        if (charSequence == null) {
            return;
        }
        if (z || this.h == xfn.POST_ROLL) {
            charSequence = "";
        } else if (this.g) {
            charSequence = this.n;
        }
        xkp xkpVar = this.c.d;
        xkpVar.a = charSequence;
        xkpVar.a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e || !this.f) {
            return;
        }
        this.c.a();
        xkh xkhVar = this.c;
        xkhVar.c.setClickable(true);
        ka q = jw.q(xkhVar.c);
        q.c(1.0f);
        q.d(xkhVar.o);
        q.g(0L);
        q.f(new xkg(xkhVar));
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.c.a();
        if (!this.e && this.f && i == 0) {
            this.c.b();
        }
    }

    public AdCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public AdCountdownView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }
}
