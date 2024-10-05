package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azox extends ayqi {
    static final azpb b;
    static final azpb c;
    static final azow d;
    static final azou e;
    final ThreadFactory f;
    final AtomicReference g;
    private static final TimeUnit i = TimeUnit.SECONDS;
    private static final long h = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        azow azowVar = new azow(new azpb("RxCachedThreadSchedulerShutdown"));
        d = azowVar;
        azowVar.qc();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        azpb azpbVar = new azpb("RxCachedThreadScheduler", max);
        b = azpbVar;
        c = new azpb("RxCachedWorkerPoolEvictor", max);
        azou azouVar = new azou(0L, null, azpbVar);
        e = azouVar;
        azouVar.a();
    }

    public azox() {
        azpb azpbVar = b;
        this.f = azpbVar;
        azou azouVar = e;
        AtomicReference atomicReference = new AtomicReference(azouVar);
        this.g = atomicReference;
        azou azouVar2 = new azou(h, i, azpbVar);
        if (atomicReference.compareAndSet(azouVar, azouVar2)) {
            return;
        }
        azouVar2.a();
    }

    @Override // defpackage.ayqi
    public final ayqh a() {
        return new azov((azou) this.g.get());
    }
}
