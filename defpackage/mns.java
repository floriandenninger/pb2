package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mns implements View.OnAttachStateChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ mnt b;

    public mns(mnt mntVar, int i) {
        this.b = mntVar;
        this.a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.d.removeOnAttachStateChangeListener(this);
        this.b.d.measure(0, 0);
        this.b.o(this.a);
        this.b.d.requestLayout();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
