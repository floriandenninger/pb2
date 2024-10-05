package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adqb implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ akcv a;
    final /* synthetic */ adqc b;

    public adqb(adqc adqcVar, akcv akcvVar) {
        this.b = adqcVar;
        this.a = akcvVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.b.r.getGlobalVisibleRect(rect);
        this.a.g(rect);
        this.b.r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
