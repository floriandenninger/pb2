package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xuy implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ xuz a;

    public xuy(xuz xuzVar) {
        this.a = xuzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        xuz xuzVar = this.a;
        View view = xuzVar.f;
        int i = xuzVar.g;
        wcy.q(view, i, 0, i, 0);
        this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
