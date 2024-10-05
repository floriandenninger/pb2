package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvy extends azpv {
    private static final long serialVersionUID = -5082275438355852221L;
    final banw a;
    final ayrv b;
    final ayvz[] c;
    final azoh d;
    final Object[] e;
    boolean f;
    int g;
    int h;
    volatile boolean i;
    final AtomicLong j;
    volatile boolean k;
    final AtomicReference l;

    public ayvy(banw banwVar, ayrv ayrvVar, int i, int i2) {
        this.a = banwVar;
        this.b = ayrvVar;
        ayvz[] ayvzVarArr = new ayvz[i];
        for (int i3 = 0; i3 < i; i3++) {
            ayvzVarArr[i3] = new ayvz(this, i3, i2);
        }
        this.c = ayvzVarArr;
        this.e = new Object[i];
        this.d = new azoh(i2);
        this.j = new AtomicLong();
        this.l = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        for (ayvz ayvzVar : this.c) {
            azqb.f(ayvzVar);
        }
    }

    @Override // defpackage.aytf
    public final void d() {
        this.d.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        if (this.f) {
            banw banwVar = this.a;
            azoh azohVar = this.d;
            while (!this.i) {
                Throwable th = (Throwable) this.l.get();
                if (th == null) {
                    boolean z = this.k;
                    boolean j = azohVar.j();
                    if (!j) {
                        banwVar.c(null);
                    }
                    if (!z || !j) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        banwVar.sh();
                        return;
                    }
                } else {
                    azohVar.d();
                    banwVar.b(th);
                    return;
                }
            }
            azohVar.d();
            return;
        }
        banw banwVar2 = this.a;
        azoh azohVar2 = this.d;
        int i2 = 1;
        do {
            long j2 = this.j.get();
            long j3 = 0;
            while (j3 != j2) {
                boolean z2 = this.k;
                Object sg = azohVar2.sg();
                boolean z3 = sg == null;
                if (h(z2, z3, banwVar2, azohVar2)) {
                    return;
                }
                if (z3) {
                    break;
                }
                try {
                    Object a = this.b.a((Object[]) azohVar2.sg());
                    aysw.b(a, "The combiner returned a null value");
                    banwVar2.c(a);
                    ((ayvz) sg).d();
                    j3++;
                } catch (Throwable th2) {
                    aynu.c(th2);
                    b();
                    azqi.e(this.l, th2);
                    banwVar2.b(azqi.d(this.l));
                    return;
                }
            }
            if (j3 == j2 && h(this.k, azohVar2.j(), banwVar2, azohVar2)) {
                return;
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.j.addAndGet(-j3);
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i, Object obj) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.e;
            int i2 = this.g;
            if (objArr[i] == null) {
                i2++;
                this.g = i2;
            }
            objArr[i] = obj;
            z = false;
            if (objArr.length == i2) {
                azoh azohVar = this.d;
                ayvz ayvzVar = this.c[i];
                Object clone = objArr.clone();
                AtomicReferenceArray atomicReferenceArray = azohVar.g;
                long a = azohVar.a();
                int i3 = azohVar.f;
                long j = 2 + a;
                if (atomicReferenceArray.get(((int) j) & i3) == null) {
                    int i4 = ((int) a) & i3;
                    atomicReferenceArray.lazySet(i4 + 1, clone);
                    atomicReferenceArray.lazySet(i4, ayvzVar);
                } else {
                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
                    azohVar.g = atomicReferenceArray2;
                    int i5 = ((int) a) & i3;
                    atomicReferenceArray2.lazySet(i5 + 1, clone);
                    atomicReferenceArray2.lazySet(i5, ayvzVar);
                    azohVar.b(atomicReferenceArray, atomicReferenceArray2);
                    atomicReferenceArray.lazySet(i5, azoh.b);
                }
                azohVar.e(j);
            } else {
                z = true;
            }
        }
        if (z) {
            this.c[i].d();
        } else {
            f();
        }
    }

    final boolean h(boolean z, boolean z2, banw banwVar, azoh azohVar) {
        if (this.i) {
            b();
            azohVar.d();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable d = azqi.d(this.l);
        if (d != null && d != azqi.a) {
            b();
            azohVar.d();
            banwVar.b(d);
            return true;
        }
        if (!z2) {
            return false;
        }
        b();
        banwVar.sh();
        return true;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.d.j();
    }

    @Override // defpackage.banx
    public final void sd() {
        this.i = true;
        b();
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 4) != 0) {
            return 0;
        }
        int i2 = i & 2;
        this.f = i2 != 0;
        return i2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg = this.d.sg();
        if (sg == null) {
            return null;
        }
        Object a = this.b.a((Object[]) this.d.sg());
        aysw.b(a, "The combiner returned a null value");
        ((ayvz) sg).d();
        return a;
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.j, j);
            f();
        }
    }
}
