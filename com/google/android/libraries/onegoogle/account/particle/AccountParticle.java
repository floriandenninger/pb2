package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.youtube.R;
import defpackage.jm;
import defpackage.ufe;
import defpackage.uff;
import defpackage.ufg;
import defpackage.ujx;
import defpackage.ukd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountParticle extends ConstraintLayout implements uff, ukd {
    public ufe i;
    public final AccountParticleDisc j;
    public final TextView k;
    public final TextView l;
    public boolean m;
    private final TextView n;

    public AccountParticle(Context context) {
        this(context, null);
    }

    @Override // defpackage.ukd
    public final void a(ujx ujxVar) {
        if (this.m) {
            ujxVar.b(this, 90144);
        }
    }

    @Override // defpackage.ukd
    public final void b(ujx ujxVar) {
        if (this.m) {
            ujxVar.c(this);
        }
    }

    @Override // defpackage.uff
    public final TextView e() {
        return this.n;
    }

    @Override // defpackage.uff
    public final TextView f() {
        return this.k;
    }

    @Override // defpackage.uff
    public final TextView g() {
        return this.l;
    }

    @Override // defpackage.uff
    public final AccountParticleDisc h() {
        return this.j;
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ufg.a, i, R.style.OneGoogle_AccountParticle_DayNight);
        try {
            LayoutInflater.from(context).inflate(true != obtainStyledAttributes.getBoolean(2, false) ? R.layout.account_particle_small_disc_size : R.layout.account_particle, (ViewGroup) this, true);
            AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
            accountParticleDisc.getClass();
            this.j = accountParticleDisc;
            TextView textView = (TextView) findViewById(R.id.account_display_name);
            textView.getClass();
            this.k = textView;
            TextView textView2 = (TextView) findViewById(R.id.account_name);
            textView2.getClass();
            this.l = textView2;
            this.n = (TextView) findViewById(R.id.counter);
            jm.s(textView, obtainStyledAttributes.getResourceId(1, -1));
            jm.s(textView2, obtainStyledAttributes.getResourceId(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
