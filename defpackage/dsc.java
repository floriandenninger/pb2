package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsc implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ dsx a;

    public dsc(dsx dsxVar) {
        this.a = dsxVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.y();
        return true;
    }
}
