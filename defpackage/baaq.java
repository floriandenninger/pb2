package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baaq {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    public final azvm b = azth.o(null);
    public final azvk c = azth.p();
    public final azvk d = azth.p();
    public final azvk e = azth.p();

    private final baam g(baam baamVar) {
        if (baamVar.h.e() == 1) {
            this.e.b();
        }
        if (a() == 127) {
            return baamVar;
        }
        int i = this.c.a & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, baamVar);
        this.c.b();
        return null;
    }

    public final int a() {
        return this.c.a - this.d.a;
    }

    public final long b(baaq baaqVar, boolean z) {
        baam baamVar;
        do {
            baamVar = (baam) baaqVar.b.a;
            if (baamVar == null) {
                return -2L;
            }
            if (z && baamVar.h.e() != 1) {
                return -2L;
            }
            long j = baap.a;
            long nanoTime = System.nanoTime() - baamVar.g;
            if (nanoTime < baap.a) {
                return baap.a - nanoTime;
            }
        } while (!baaqVar.b.c(baamVar, null));
        c(baamVar, false);
        return -1L;
    }

    public final baam c(baam baamVar, boolean z) {
        if (z) {
            return g(baamVar);
        }
        baam baamVar2 = (baam) this.b.a(baamVar);
        if (baamVar2 == null) {
            return null;
        }
        return g(baamVar2);
    }

    public final baam d() {
        baam baamVar = (baam) this.b.a(null);
        return baamVar == null ? e() : baamVar;
    }

    public final baam e() {
        baam baamVar;
        while (true) {
            int i = this.d.a;
            if (i - this.c.a == 0) {
                return null;
            }
            int i2 = i & 127;
            if (this.d.c(i, i + 1) && (baamVar = (baam) this.a.getAndSet(i2, null)) != null) {
                if (baamVar.h.e() == 1) {
                    this.e.a();
                    boolean z = azwq.a;
                }
                return baamVar;
            }
        }
    }
}
