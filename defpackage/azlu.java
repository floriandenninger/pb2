package defpackage;

import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azlu implements banx {
    final int a;
    final int b;
    final /* synthetic */ azlv c;

    public azlu(azlv azlvVar, int i, int i2) {
        this.c = azlvVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.c.b.compareAndSet(this.a + this.b, 0L, 1L)) {
            azlv azlvVar = this.c;
            int i = this.b;
            if (azlvVar.b.decrementAndGet(i + i) == 0) {
                azlvVar.k = true;
                azlvVar.f.sd();
                if (azlvVar.getAndIncrement() == 0) {
                    azlvVar.g.d();
                }
            }
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        long j2;
        if (azqb.h(j)) {
            AtomicLongArray atomicLongArray = this.c.b;
            do {
                j2 = atomicLongArray.get(this.a);
                if (j2 == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLongArray.compareAndSet(this.a, j2, ayeq.l(j2, j)));
            if (this.c.l.get() == this.b) {
                this.c.d();
            }
        }
    }
}
