package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzu extends AtomicInteger implements aypq, ayqx {
    static final ayzt[] a = new ayzt[0];
    static final ayzt[] b = new ayzt[0];
    private static final long serialVersionUID = -1672047311619175801L;
    final AtomicReference c;
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    final AtomicReference f = new AtomicReference(a);
    final int g;
    volatile aytf h;
    int i;
    volatile boolean j;
    Throwable k;
    int l;

    public ayzu(AtomicReference atomicReference, int i) {
        this.c = atomicReference;
        this.g = i;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.j) {
            aynu.j(th);
            return;
        }
        this.k = th;
        this.j = true;
        d();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.i != 0 || this.h.k(obj)) {
            d();
        } else {
            b(new ayrg("Prefetch queue is full?!"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        long j;
        if (getAndIncrement() != 0) {
            return;
        }
        aytf aytfVar = this.h;
        int i = this.l;
        int i2 = this.g;
        int i3 = i2 - (i2 >> 2);
        int i4 = this.i;
        int i5 = 1;
        aytf aytfVar2 = aytfVar;
        int i6 = i;
        while (true) {
            if (aytfVar2 != null) {
                ayzt[] ayztVarArr = (ayzt[]) this.f.get();
                long j2 = Long.MAX_VALUE;
                boolean z = false;
                for (ayzt ayztVar : ayztVarArr) {
                    long j3 = ayztVar.get();
                    if (j3 != Long.MIN_VALUE) {
                        j2 = Math.min(j3 - ayztVar.c, j2);
                        z = true;
                    }
                }
                if (!z) {
                    j2 = 0;
                }
                while (j2 != j) {
                    boolean z2 = this.j;
                    try {
                        Object sg = aytfVar2.sg();
                        boolean z3 = sg == null;
                        if (i(z2, z3)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        for (ayzt ayztVar2 : ayztVarArr) {
                            if (!ayztVar2.a()) {
                                ayztVar2.a.c(sg);
                                ayztVar2.c++;
                            }
                        }
                        if (i4 != 1 && (i6 = i6 + 1) == i3) {
                            ((banx) this.d.get()).sj(i3);
                            i6 = 0;
                        }
                        j2--;
                        j = ayztVarArr == this.f.get() ? 0L : 0L;
                    } catch (Throwable th) {
                        aynu.c(th);
                        ((banx) this.d.get()).sd();
                        aytfVar2.d();
                        this.j = true;
                        h(th);
                        return;
                    }
                }
                if (i(this.j, aytfVar2.j())) {
                    return;
                }
            }
            this.l = i6;
            i5 = addAndGet(-i5);
            if (i5 == 0) {
                return;
            }
            if (aytfVar2 == null) {
                aytfVar2 = this.h;
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.f.get() == b;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this.d, banxVar)) {
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(7);
                if (sf == 1) {
                    this.i = 1;
                    this.h = aytcVar;
                    this.j = true;
                    d();
                    return;
                }
                if (sf == 2) {
                    this.i = 2;
                    this.h = aytcVar;
                    banxVar.sj(this.g);
                    return;
                }
            }
            this.h = new azog(this.g);
            banxVar.sj(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ayzt ayztVar) {
        ayzt[] ayztVarArr;
        ayzt[] ayztVarArr2;
        do {
            ayztVarArr = (ayzt[]) this.f.get();
            int length = ayztVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (ayztVarArr[i] == ayztVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                ayztVarArr2 = a;
            } else {
                ayzt[] ayztVarArr3 = new ayzt[length - 1];
                System.arraycopy(ayztVarArr, 0, ayztVarArr3, 0, i);
                System.arraycopy(ayztVarArr, i + 1, ayztVarArr3, i, (length - i) - 1);
                ayztVarArr2 = ayztVarArr3;
            }
        } while (!this.f.compareAndSet(ayztVarArr, ayztVarArr2));
    }

    final void h(Throwable th) {
        for (ayzt ayztVar : (ayzt[]) this.f.getAndSet(b)) {
            if (!ayztVar.a()) {
                ayztVar.a.b(th);
            }
        }
    }

    final boolean i(boolean z, boolean z2) {
        if (!z || !z2) {
            return false;
        }
        Throwable th = this.k;
        if (th != null) {
            h(th);
            return true;
        }
        for (ayzt ayztVar : (ayzt[]) this.f.getAndSet(b)) {
            if (!ayztVar.a()) {
                ayztVar.a.sh();
            }
        }
        return true;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.f.getAndSet(b);
        this.c.compareAndSet(this, null);
        azqb.f(this.d);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.j = true;
        d();
    }
}
