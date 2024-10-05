package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdz implements View.OnAttachStateChangeListener {
    final /* synthetic */ teb a;

    public tdz(teb tebVar) {
        this.a = tebVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        teb tebVar = this.a;
        tebVar.k = false;
        if (tebVar.l) {
            return;
        }
        tebVar.j.g(tebVar.i, tebVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        teb tebVar = this.a;
        tebVar.k = true;
        if (tebVar.m) {
            tebVar.j();
            tebVar.j.e(tebVar.i);
        } else {
            tebVar.j.h(tebVar.i);
        }
    }
}
