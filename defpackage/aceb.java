package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aceb implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ akcv a;
    final /* synthetic */ acei b;

    public aceb(acei aceiVar, akcv akcvVar) {
        this.b = aceiVar;
        this.a = akcvVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.b.n.getGlobalVisibleRect(rect);
        this.a.g(rect);
        this.b.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
