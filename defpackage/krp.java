package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krp implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ aozc a;
    final /* synthetic */ krq b;

    public krp(krq krqVar, aozc aozcVar) {
        this.b = krqVar;
        this.a = aozcVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.d(this.a);
    }
}
