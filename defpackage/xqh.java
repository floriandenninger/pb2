package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xqh implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ akce a;
    final /* synthetic */ View b;
    final /* synthetic */ xqi c;

    public xqh(xqi xqiVar, akce akceVar, View view) {
        this.c = xqiVar;
        this.a = akceVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.a.f()) {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        int[] iArr = this.c.a;
        int i = iArr[0];
        int i2 = iArr[1];
        this.b.getLocationOnScreen(iArr);
        int[] iArr2 = this.c.a;
        if (i != iArr2[0] || i2 != iArr2[1]) {
            this.a.e();
        }
        return true;
    }
}
