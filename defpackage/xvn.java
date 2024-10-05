package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xvn implements View.OnAttachStateChangeListener {
    final /* synthetic */ acra a;
    final /* synthetic */ byte[] b;

    public xvn(acra acraVar, byte[] bArr) {
        this.a = acraVar;
        this.b = bArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.u(new acqx(this.b), null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
