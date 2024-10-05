package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xvo implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ xvt a;

    public xvo(xvt xvtVar) {
        this.a = xvtVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.r.getViewTreeObserver().removeOnPreDrawListener(this.a.n);
        xvt xvtVar = this.a;
        xvtVar.n = null;
        int lineCount = xvtVar.r.getLineCount();
        xvt xvtVar2 = this.a;
        if (lineCount > xvtVar2.l) {
            xvtVar2.s.setVisibility(0);
            this.a.i(true);
        }
        return true;
    }
}
