package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfe extends anez {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public anfe(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.anez
    public final void a(anfl anflVar, anfl anflVar2) {
        this.b.lazySet(anflVar, anflVar2);
    }

    @Override // defpackage.anez
    public final void b(anfl anflVar, Thread thread) {
        this.a.lazySet(anflVar, thread);
    }

    @Override // defpackage.anez
    public final boolean c(anfm anfmVar, anfd anfdVar, anfd anfdVar2) {
        return this.d.compareAndSet(anfmVar, anfdVar, anfdVar2);
    }

    @Override // defpackage.anez
    public final boolean d(anfm anfmVar, Object obj, Object obj2) {
        return this.e.compareAndSet(anfmVar, obj, obj2);
    }

    @Override // defpackage.anez
    public final boolean e(anfm anfmVar, anfl anflVar, anfl anflVar2) {
        return this.c.compareAndSet(anfmVar, anflVar, anflVar2);
    }
}
