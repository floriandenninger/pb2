package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aen extends aei {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public aen(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.aei
    public final void a(aeq aeqVar, aeq aeqVar2) {
        this.b.lazySet(aeqVar, aeqVar2);
    }

    @Override // defpackage.aei
    public final void b(aeq aeqVar, Thread thread) {
        this.a.lazySet(aeqVar, thread);
    }

    @Override // defpackage.aei
    public final boolean c(aer aerVar, aem aemVar, aem aemVar2) {
        return this.d.compareAndSet(aerVar, aemVar, aemVar2);
    }

    @Override // defpackage.aei
    public final boolean d(aer aerVar, Object obj, Object obj2) {
        return this.e.compareAndSet(aerVar, obj, obj2);
    }

    @Override // defpackage.aei
    public final boolean e(aer aerVar, aeq aeqVar, aeq aeqVar2) {
        return this.c.compareAndSet(aerVar, aeqVar, aeqVar2);
    }
}
