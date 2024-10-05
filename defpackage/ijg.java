package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ijg implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ ViewTreeObserver c;
    final /* synthetic */ ijo d;

    public ijg(ijo ijoVar, int i, int i2, ViewTreeObserver viewTreeObserver) {
        this.d = ijoVar;
        this.a = i;
        this.b = i2;
        this.c = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a == this.d.bc.getWidth() && this.b == this.d.bc.getHeight()) {
            return;
        }
        if (this.c.isAlive()) {
            this.c.removeOnGlobalLayoutListener(this);
        }
        this.d.c.notifyObservers();
    }
}
