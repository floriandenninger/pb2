package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kin implements View.OnAttachStateChangeListener {
    final /* synthetic */ kip a;

    public kin(kip kipVar) {
        this.a = kipVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.d(null);
        this.a.e(false);
    }
}
