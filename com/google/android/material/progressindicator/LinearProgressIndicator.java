package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.alio;
import defpackage.alip;
import defpackage.aliy;
import defpackage.alje;
import defpackage.aljf;
import defpackage.aljg;
import defpackage.aljj;
import defpackage.aljn;
import defpackage.aljo;
import defpackage.jw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LinearProgressIndicator extends alio {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.alio
    public final /* bridge */ /* synthetic */ alip a(Context context, AttributeSet attributeSet) {
        return new aljo(context, attributeSet);
    }

    @Override // defpackage.alio
    public final void g(int i) {
        alip alipVar = this.a;
        if (alipVar != null && ((aljo) alipVar).g == 0 && isIndeterminate()) {
            return;
        }
        super.g(i);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        aljo aljoVar = (aljo) this.a;
        boolean z2 = false;
        if (aljoVar.h == 1 || ((jw.e(this) == 1 && ((aljo) this.a).h == 2) || (jw.e(this) == 0 && ((aljo) this.a).h == 3))) {
            z2 = true;
        }
        aljoVar.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        aljf indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        aliy progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        alje aljnVar;
        Context context2 = getContext();
        aljo aljoVar = (aljo) this.a;
        aljg aljgVar = new aljg(aljoVar);
        if (aljoVar.g == 0) {
            aljnVar = new aljj(aljoVar);
        } else {
            aljnVar = new aljn(context2, aljoVar);
        }
        setIndeterminateDrawable(new aljf(context2, aljoVar, aljgVar, aljnVar));
        Context context3 = getContext();
        aljo aljoVar2 = (aljo) this.a;
        setProgressDrawable(new aliy(context3, aljoVar2, new aljg(aljoVar2)));
    }
}
