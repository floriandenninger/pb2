package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xwm implements akbl {
    final /* synthetic */ View a;
    final /* synthetic */ xwn b;

    public xwm(xwn xwnVar, View view) {
        this.b = xwnVar;
        this.a = view;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.a.getViewTreeObserver().removeOnScrollChangedListener(this.b.g);
        this.b.f = true;
    }
}
