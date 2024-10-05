package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aynp extends ayno {
    private final AtomicIntegerFieldUpdater a;

    public aynp(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.ayno
    public final boolean a(aynr aynrVar) {
        return this.a.compareAndSet(aynrVar, 0, -1);
    }

    @Override // defpackage.ayno
    public final void b(aynr aynrVar) {
        this.a.set(aynrVar, 0);
    }
}
