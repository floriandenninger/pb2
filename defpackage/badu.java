package defpackage;

import J.N;
import org.chromium.base.JavaHandlerThread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class badu implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ JavaHandlerThread b;

    public badu(JavaHandlerThread javaHandlerThread, long j) {
        this.b = javaHandlerThread;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.quit();
        N.MYwg$x8E(this.a);
    }
}
