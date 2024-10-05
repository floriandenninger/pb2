package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azol extends ayqi implements azpf {
    static final azok b;
    static final azpb c;
    static final int d;
    static final azoz g;
    final ThreadFactory e;
    final AtomicReference f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        d = availableProcessors;
        azoz azozVar = new azoz(new azpb("RxComputationShutdown"));
        g = azozVar;
        azozVar.qc();
        azpb azpbVar = new azpb("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = azpbVar;
        azok azokVar = new azok(0, azpbVar);
        b = azokVar;
        azokVar.a();
    }

    public azol() {
        azpb azpbVar = c;
        this.e = azpbVar;
        azok azokVar = b;
        AtomicReference atomicReference = new AtomicReference(azokVar);
        this.f = atomicReference;
        azok azokVar2 = new azok(d, azpbVar);
        if (atomicReference.compareAndSet(azokVar, azokVar2)) {
            return;
        }
        azokVar2.a();
    }

    @Override // defpackage.ayqi
    public final ayqh a() {
        return new azoj(((azok) this.f.get()).c());
    }

    @Override // defpackage.azpf
    public final void b(int i, azmc azmcVar) {
        aysw.c(i, "number > 0 required");
        ((azok) this.f.get()).b(i, azmcVar);
    }

    @Override // defpackage.ayqi
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((azok) this.f.get()).c().g(runnable, j, timeUnit);
    }

    @Override // defpackage.ayqi
    public final ayqx d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((azok) this.f.get()).c().h(runnable, j, j2, timeUnit);
    }
}
