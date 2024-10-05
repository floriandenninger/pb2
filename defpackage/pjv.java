package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjv implements Runnable {
    final /* synthetic */ Surface a;
    final /* synthetic */ pka b;

    public pjv(pka pkaVar, Surface surface) {
        this.b = pkaVar;
        this.a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.d(this.a);
    }
}
