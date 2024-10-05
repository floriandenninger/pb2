package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ntm implements View.OnAttachStateChangeListener {
    final /* synthetic */ nto a;

    public ntm(nto ntoVar) {
        this.a = ntoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        nto ntoVar = this.a;
        ntoVar.q = true;
        ntoVar.i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        nto ntoVar = this.a;
        ntoVar.q = false;
        ntoVar.o = true;
    }
}
