package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aibz implements View.OnAttachStateChangeListener {
    final /* synthetic */ aica a;

    public aibz(aica aicaVar) {
        this.a = aicaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.D(new acqx(acsb.c(28244)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aica aicaVar = this.a;
        aicaVar.c.removeCallbacks(aicaVar.h);
    }
}
