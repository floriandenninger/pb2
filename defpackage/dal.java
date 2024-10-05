package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dal implements Runnable {
    final /* synthetic */ ViewTreeObserver.OnDrawListener a;
    final /* synthetic */ dam b;

    public dal(dam damVar, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.b = damVar;
        this.a = onDrawListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cyd.a().b();
        this.b.b.b = true;
        View view = this.b.a;
        view.getViewTreeObserver().removeOnDrawListener(this.a);
        this.b.b.a.clear();
    }
}
