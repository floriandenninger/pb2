package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.alio;
import defpackage.alip;
import defpackage.aliq;
import defpackage.aliv;
import defpackage.aliw;
import defpackage.aliy;
import defpackage.aljf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CircularProgressIndicator extends alio {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.alio
    public final /* bridge */ /* synthetic */ alip a(Context context, AttributeSet attributeSet) {
        return new aliw(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        aliw aliwVar = (aliw) this.a;
        setIndeterminateDrawable(new aljf(context2, aliwVar, new aliq(aliwVar), new aliv(aliwVar)));
        Context context3 = getContext();
        aliw aliwVar2 = (aliw) this.a;
        setProgressDrawable(new aliy(context3, aliwVar2, new aliq(aliwVar2)));
    }
}
