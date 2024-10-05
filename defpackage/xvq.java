package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xvq implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ xvt a;

    public xvq(xvt xvtVar) {
        this.a = xvtVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        xvt xvtVar = this.a;
        xvtVar.f(xvtVar.u);
        xvt xvtVar2 = this.a;
        xvtVar2.f(xvtVar2.v);
        xvt xvtVar3 = this.a;
        xvtVar3.f(xvtVar3.w);
        xvt xvtVar4 = this.a;
        xvtVar4.f(xvtVar4.x);
        this.a.t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
