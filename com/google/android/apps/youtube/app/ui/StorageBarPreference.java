package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.youtube.R;
import defpackage.afsy;
import defpackage.ageh;
import defpackage.agko;
import defpackage.aglb;
import defpackage.agof;
import defpackage.alta;
import defpackage.azrw;
import defpackage.bsx;
import defpackage.lwz;
import defpackage.lyn;
import defpackage.yjj;
import defpackage.yjk;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.yxn;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StorageBarPreference extends Preference implements ypd {
    public afsy a;
    public azrw b;
    public yxn c;
    public ypa d;
    private final boolean e;

    public StorageBarPreference(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.P();
        this.d.m(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        this.d.m(this);
        super.P();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agko.class, aglb.class};
        }
        if (i == 0) {
            d();
            return null;
        }
        if (i == 1) {
            d();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        long j = 0;
        if (this.a.t()) {
            ageh agehVar = (ageh) ((agof) this.b.get()).a().b();
            if (this.e) {
                if (agehVar.d != null) {
                    j = agehVar.d.a();
                }
            } else if (agehVar.c != null) {
                j = agehVar.c.a();
            }
            j = yjj.A(j);
        }
        long A = this.e ? yjj.A(this.c.a()) : yjj.A(yjk.H());
        ProgressBar progressBar = (ProgressBar) bsxVar.a.findViewById(R.id.storage_bar);
        progressBar.setMax(1000);
        float f = (float) j;
        progressBar.setProgress((int) ((1000.0f * f) / (f + ((float) A))));
        ((TextView) bsxVar.a.findViewById(R.id.storage_used)).setText(this.j.getResources().getString(R.string.pref_offline_storage_used, zhq.g(this.j.getResources(), j)));
        ((TextView) bsxVar.a.findViewById(R.id.storage_free)).setText(this.j.getResources().getString(R.string.pref_offline_storage_free, zhq.g(this.j.getResources(), A)));
    }

    @Override // androidx.preference.Preference
    public final void z() {
        super.E();
        this.d.g(this);
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public StorageBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ((lyn) alta.t(this.j, lyn.class)).iY(this);
        if (attributeSet == null) {
            this.e = false;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lwz.a);
        this.e = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
