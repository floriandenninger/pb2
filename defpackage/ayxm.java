package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxm extends AtomicInteger implements aypq, banx {
    static final ayxl[] a = new ayxl[0];
    static final ayxl[] b = new ayxl[0];
    private static final long serialVersionUID = -2117620485640801370L;
    final banw c;
    final ayrv d;
    final int e;
    final int f;
    volatile ayte g;
    volatile boolean h;
    final azqf i = new azqf();
    volatile boolean j;
    final AtomicReference k;
    final AtomicLong l;
    banx m;
    long n;
    long o;
    int p;
    int q;
    final int r;

    public ayxm(banw banwVar, ayrv ayrvVar, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.k = atomicReference;
        this.l = new AtomicLong();
        this.c = banwVar;
        this.d = ayrvVar;
        this.e = i;
        this.f = i2;
        this.r = Math.max(1, i >> 1);
        atomicReference.lazySet(a);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
        } else if (azqi.e(this.i, th)) {
            this.h = true;
            h();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        ayxl[] ayxlVarArr;
        ayxl[] ayxlVarArr2;
        if (this.h) {
            return;
        }
        try {
            banv banvVar = (banv) this.d.a(obj);
            aysw.b(banvVar, "The mapper returned a null Publisher");
            if (banvVar instanceof Callable) {
                try {
                    Object call = ((Callable) banvVar).call();
                    if (call != null) {
                        if (get() != 0 || !compareAndSet(0, 1)) {
                            if (!d().k(call)) {
                                b(new IllegalStateException("Scalar queue full?!"));
                                return;
                            } else if (getAndIncrement() != 0) {
                                return;
                            }
                        } else {
                            long j = this.l.get();
                            aytf aytfVar = this.g;
                            if (j == 0 || (aytfVar != null && !aytfVar.j())) {
                                if (aytfVar == null) {
                                    aytfVar = d();
                                }
                                if (!aytfVar.k(call)) {
                                    b(new IllegalStateException("Scalar queue full?!"));
                                    return;
                                }
                            } else {
                                this.c.c(call);
                                if (j != Long.MAX_VALUE) {
                                    this.l.decrementAndGet();
                                }
                                if (this.e != Integer.MAX_VALUE && !this.j) {
                                    int i = this.q + 1;
                                    this.q = i;
                                    int i2 = this.r;
                                    if (i == i2) {
                                        this.q = 0;
                                        this.m.sj(i2);
                                    }
                                }
                            }
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        }
                        i();
                        return;
                    }
                    if (this.e == Integer.MAX_VALUE || this.j) {
                        return;
                    }
                    int i3 = this.q + 1;
                    this.q = i3;
                    int i4 = this.r;
                    if (i3 == i4) {
                        this.q = 0;
                        this.m.sj(i4);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    aynu.c(th);
                    azqi.e(this.i, th);
                    h();
                    return;
                }
            }
            long j2 = this.n;
            this.n = 1 + j2;
            ayxl ayxlVar = new ayxl(this, j2);
            do {
                ayxlVarArr = (ayxl[]) this.k.get();
                if (ayxlVarArr != b) {
                    int length = ayxlVarArr.length;
                    ayxlVarArr2 = new ayxl[length + 1];
                    System.arraycopy(ayxlVarArr, 0, ayxlVarArr2, 0, length);
                    ayxlVarArr2[length] = ayxlVar;
                } else {
                    azqb.f(ayxlVar);
                    return;
                }
            } while (!this.k.compareAndSet(ayxlVarArr, ayxlVarArr2));
            banvVar.ab(ayxlVar);
        } catch (Throwable th2) {
            aynu.c(th2);
            this.m.sd();
            b(th2);
        }
    }

    final aytf d() {
        ayte ayteVar = this.g;
        if (ayteVar == null) {
            int i = this.e;
            ayteVar = i == Integer.MAX_VALUE ? new azoh(this.f) : new azog(i);
            this.g = ayteVar;
        }
        return ayteVar;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.m, banxVar)) {
            this.m = banxVar;
            this.c.f(this);
            if (this.j) {
                return;
            }
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                banxVar.sj(Long.MAX_VALUE);
            } else {
                banxVar.sj(i);
            }
        }
    }

    final void g() {
        ayte ayteVar = this.g;
        if (ayteVar != null) {
            ayteVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        boolean z;
        int i2;
        long j5;
        banw banwVar = this.c;
        int i3 = 1;
        while (!k()) {
            ayte ayteVar = this.g;
            long j6 = this.l.get();
            long j7 = -1;
            long j8 = 0;
            if (ayteVar != null) {
                j = j6;
                j2 = 0;
                while (true) {
                    i = i3;
                    long j9 = 0;
                    Object obj = null;
                    while (true) {
                        if (j == 0) {
                            break;
                        }
                        Object sg = ayteVar.sg();
                        if (k()) {
                            return;
                        }
                        if (sg == null) {
                            obj = sg;
                            break;
                        }
                        banwVar.c(sg);
                        j2++;
                        j9++;
                        j--;
                        obj = sg;
                    }
                    if (j9 != 0) {
                        j = j6 == Long.MAX_VALUE ? Long.MAX_VALUE : this.l.addAndGet(-j9);
                    }
                    if (j == 0 || obj == null) {
                        break;
                    } else {
                        i3 = i;
                    }
                }
            } else {
                i = i3;
                j = j6;
                j2 = 0;
            }
            boolean z2 = this.h;
            ayte ayteVar2 = this.g;
            ayxl[] ayxlVarArr = (ayxl[]) this.k.get();
            int length = ayxlVarArr.length;
            if (z2 && ((ayteVar2 == null || ayteVar2.j()) && length == 0)) {
                Throwable d = azqi.d(this.i);
                if (d != azqi.a) {
                    if (d == null) {
                        banwVar.sh();
                        return;
                    } else {
                        banwVar.b(d);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j10 = this.o;
                int i4 = this.p;
                if (length <= i4 || ayxlVarArr[i4].a != j10) {
                    if (length <= i4) {
                        i4 = 0;
                    }
                    for (int i5 = 0; i5 < length && ayxlVarArr[i4].a != j10; i5++) {
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                    }
                    this.p = i4;
                    this.o = ayxlVarArr[i4].a;
                }
                int i6 = i4;
                boolean z3 = false;
                int i7 = 0;
                while (i7 < length) {
                    if (k()) {
                        return;
                    }
                    ayxl ayxlVar = ayxlVarArr[i6];
                    Object obj2 = null;
                    while (!k()) {
                        aytf aytfVar = ayxlVar.f;
                        if (aytfVar != null) {
                            long j11 = j8;
                            while (j != j8) {
                                try {
                                    obj2 = aytfVar.sg();
                                    if (obj2 == null) {
                                        break;
                                    }
                                    banwVar.c(obj2);
                                    if (k()) {
                                        return;
                                    }
                                    j += j7;
                                    j11++;
                                    j7 = -1;
                                } catch (Throwable th) {
                                    aynu.c(th);
                                    azqb.f(ayxlVar);
                                    azqi.e(this.i, th);
                                    this.m.sd();
                                    if (k()) {
                                        return;
                                    }
                                    j(ayxlVar);
                                    i7++;
                                    z3 = true;
                                    i2 = 1;
                                }
                            }
                            long j12 = j11;
                            if (j12 != j8) {
                                long addAndGet = j6 != Long.MAX_VALUE ? this.l.addAndGet(-j12) : Long.MAX_VALUE;
                                ayxlVar.d(j12);
                                j = addAndGet;
                                j5 = 0;
                            } else {
                                j5 = j8;
                            }
                            if (j != j5 && obj2 != null) {
                                j7 = -1;
                                j8 = 0;
                            }
                        }
                        boolean z4 = ayxlVar.e;
                        aytf aytfVar2 = ayxlVar.f;
                        if (z4 && (aytfVar2 == null || aytfVar2.j())) {
                            j(ayxlVar);
                            if (k()) {
                                return;
                            }
                            j2++;
                            z3 = true;
                        }
                        if (j == 0) {
                            break;
                        }
                        i6++;
                        if (i6 == length) {
                            i6 = 0;
                        }
                        i2 = 1;
                        i7 += i2;
                        j7 = -1;
                        j8 = 0;
                    }
                    return;
                }
                this.p = i6;
                this.o = ayxlVarArr[i6].a;
                z = z3;
                j4 = j2;
                j3 = 0;
            } else {
                j3 = 0;
                j4 = j2;
                z = false;
            }
            if (j4 != j3 && !this.j) {
                this.m.sj(j4);
            }
            if (z) {
                i3 = i;
            } else {
                i3 = addAndGet(-i);
                if (i3 == 0) {
                    return;
                }
            }
        }
    }

    final void j(ayxl ayxlVar) {
        ayxl[] ayxlVarArr;
        ayxl[] ayxlVarArr2;
        do {
            ayxlVarArr = (ayxl[]) this.k.get();
            int length = ayxlVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayxlVarArr[i] == ayxlVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayxlVarArr2 = a;
            } else {
                ayxl[] ayxlVarArr3 = new ayxl[length - 1];
                System.arraycopy(ayxlVarArr, 0, ayxlVarArr3, 0, i);
                System.arraycopy(ayxlVarArr, i + 1, ayxlVarArr3, i, (length - i) - 1);
                ayxlVarArr2 = ayxlVarArr3;
            }
        } while (!this.k.compareAndSet(ayxlVarArr, ayxlVarArr2));
    }

    final boolean k() {
        if (this.j) {
            g();
            return true;
        }
        if (this.i.get() == null) {
            return false;
        }
        g();
        Throwable d = azqi.d(this.i);
        if (d != azqi.a) {
            this.c.b(d);
        }
        return true;
    }

    @Override // defpackage.banx
    public final void sd() {
        ayte ayteVar;
        ayxl[] ayxlVarArr;
        if (this.j) {
            return;
        }
        this.j = true;
        this.m.sd();
        ayxl[] ayxlVarArr2 = (ayxl[]) this.k.get();
        ayxl[] ayxlVarArr3 = b;
        if (ayxlVarArr2 != ayxlVarArr3 && (ayxlVarArr = (ayxl[]) this.k.getAndSet(ayxlVarArr3)) != ayxlVarArr3) {
            for (ayxl ayxlVar : ayxlVarArr) {
                azqb.f(ayxlVar);
            }
            Throwable d = azqi.d(this.i);
            if (d != null && d != azqi.a) {
                aynu.j(d);
            }
        }
        if (getAndIncrement() != 0 || (ayteVar = this.g) == null) {
            return;
        }
        ayteVar.d();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.h) {
            return;
        }
        this.h = true;
        h();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.l, j);
            h();
        }
    }
}
