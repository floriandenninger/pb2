package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.ujx;
import defpackage.ukd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SimpleActionView extends LinearLayout implements ukd {
    public ammv a;

    public SimpleActionView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ukd
    public final void a(ujx ujxVar) {
        if (this.a.h()) {
            ujxVar.b(this, ((Integer) this.a.c()).intValue());
        }
    }

    @Override // defpackage.ukd
    public final void b(ujx ujxVar) {
        if (this.a.h()) {
            ujxVar.c(this);
        }
    }

    public SimpleActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = amlr.a;
    }
}
