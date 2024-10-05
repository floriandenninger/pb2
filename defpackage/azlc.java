package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azlc implements Runnable {
    final long a;
    final azlb b;

    public azlc(long j, azlb azlbVar) {
        this.a = j;
        this.b = azlbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        azlb azlbVar = this.b;
        if (azlbVar.compareAndSet(this.a, Long.MAX_VALUE)) {
            ayrz.c(azlbVar.f);
            azlbVar.a.b(new TimeoutException(azqi.c(azlbVar.b, azlbVar.c)));
            azlbVar.d.qc();
        }
    }
}
