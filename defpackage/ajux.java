package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajux implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ atdc b;
    final /* synthetic */ View c;
    final /* synthetic */ Object d;
    final /* synthetic */ acra e;
    final /* synthetic */ ajva f;

    public ajux(ajva ajvaVar, View view, atdc atdcVar, View view2, Object obj, acra acraVar) {
        this.f = ajvaVar;
        this.a = view;
        this.b = atdcVar;
        this.c = view2;
        this.d = obj;
        this.e = acraVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f.a(this.b, this.c, this.d, this.e);
    }
}
