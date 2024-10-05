package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class smj implements View.OnAttachStateChangeListener {
    final /* synthetic */ awrl a;
    final /* synthetic */ sml b;

    public smj(sml smlVar, awrl awrlVar) {
        this.b = smlVar;
        this.a = awrlVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        synchronized (this.b.e) {
            this.b.a(this.a.d);
            this.b.a.remove(this.a.d);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
