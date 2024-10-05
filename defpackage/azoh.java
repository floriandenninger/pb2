package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azoh implements ayte {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object b = new Object();
    final int d;
    long e;
    public final int f;
    public AtomicReferenceArray g;
    final int h;
    AtomicReferenceArray i;
    final AtomicLong c = new AtomicLong();
    final AtomicLong j = new AtomicLong();

    public azoh(int i) {
        int n = aynu.n(Math.max(8, i));
        int i2 = n - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(n + 1);
        this.g = atomicReferenceArray;
        this.f = i2;
        this.d = Math.min(n / 4, a);
        this.i = atomicReferenceArray;
        this.h = i2;
        this.e = i2 - 1;
        e(0L);
    }

    private final void f(long j) {
        this.j.lazySet(j);
    }

    private final void g(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        atomicReferenceArray.lazySet(i, obj);
        e(j + 1);
    }

    public final long a() {
        return this.c.get();
    }

    public final void b(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }

    @Override // defpackage.aytf
    public final void d() {
        while (true) {
            if (sg() == null && j()) {
                return;
            }
        }
    }

    public final void e(long j) {
        this.c.lazySet(j);
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return a() == this.j.get();
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.g;
            long j = this.c.get();
            int i = this.f;
            int i2 = ((int) j) & i;
            if (j < this.e) {
                g(atomicReferenceArray, obj, j, i2);
                return true;
            }
            long j2 = this.d + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.e = j2 - 1;
                g(atomicReferenceArray, obj, j, i2);
                return true;
            }
            long j3 = 1 + j;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                g(atomicReferenceArray, obj, j, i2);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.g = atomicReferenceArray2;
            this.e = (j + i) - 1;
            atomicReferenceArray2.lazySet(i2, obj);
            b(atomicReferenceArray, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, b);
            e(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // defpackage.ayte, defpackage.aytf
    public final Object sg() {
        AtomicReferenceArray atomicReferenceArray = this.i;
        long j = this.j.get();
        int i = this.h;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        Object obj2 = b;
        if (obj != null) {
            if (obj != obj2) {
                atomicReferenceArray.lazySet(i2, null);
                f(j + 1);
                return obj;
            }
        } else if (obj2 != null) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.i = atomicReferenceArray2;
        Object obj3 = atomicReferenceArray2.get(i2);
        if (obj3 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            f(j + 1);
        }
        return obj3;
    }
}
