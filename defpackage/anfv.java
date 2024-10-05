package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfv extends anfu {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public anfv(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.anfu
    public final int a(anfx anfxVar) {
        return this.b.decrementAndGet(anfxVar);
    }

    @Override // defpackage.anfu
    public final void b(anfx anfxVar, Set set) {
        this.a.compareAndSet(anfxVar, null, set);
    }
}
