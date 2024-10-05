package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cet extends ceo {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public cet(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ceo
    public final void a(cew cewVar, cew cewVar2) {
        this.b.lazySet(cewVar, cewVar2);
    }

    @Override // defpackage.ceo
    public final void b(cew cewVar, Thread thread) {
        this.a.lazySet(cewVar, thread);
    }

    @Override // defpackage.ceo
    public final boolean c(cex cexVar, ces cesVar, ces cesVar2) {
        return this.d.compareAndSet(cexVar, cesVar, cesVar2);
    }

    @Override // defpackage.ceo
    public final boolean d(cex cexVar, Object obj, Object obj2) {
        return this.e.compareAndSet(cexVar, obj, obj2);
    }

    @Override // defpackage.ceo
    public final boolean e(cex cexVar, cew cewVar, cew cewVar2) {
        return this.c.compareAndSet(cexVar, cewVar, cewVar2);
    }
}
