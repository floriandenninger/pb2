package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywc extends azqa implements aypq {
    private static final long serialVersionUID = -8158322871608889516L;
    final banw a;
    final banv[] b;
    final AtomicInteger c = new AtomicInteger();
    int d;
    long e;

    public aywc(banv[] banvVarArr, banw banwVar) {
        this.a = banwVar;
        this.b = banvVarArr;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.e++;
        this.a.c(obj);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (this.k) {
            banxVar.sd();
            return;
        }
        aysw.b(banxVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            d();
            return;
        }
        this.f = banxVar;
        long j = this.g;
        if (decrementAndGet() != 0) {
            g();
        }
        if (j != 0) {
            banxVar.sj(j);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.c.getAndIncrement() == 0) {
            banv[] banvVarArr = this.b;
            int length = banvVarArr.length;
            int i = this.d;
            while (i != 2) {
                banv banvVar = banvVarArr[i];
                if (banvVar != null) {
                    long j = this.e;
                    long j2 = 0;
                    if (j != 0) {
                        this.e = 0L;
                        if (!this.l) {
                            if (get() != 0 || !compareAndSet(0, 1)) {
                                ayeq.j(this.j, j);
                                d();
                            } else {
                                long j3 = this.g;
                                if (j3 != Long.MAX_VALUE) {
                                    long j4 = j3 - j;
                                    if (j4 < 0) {
                                        azqb.b(j4);
                                    } else {
                                        j2 = j4;
                                    }
                                    this.g = j2;
                                }
                                if (decrementAndGet() != 0) {
                                    g();
                                }
                            }
                        }
                    }
                    banvVar.ab(this);
                    i++;
                    this.d = i;
                    if (this.c.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    this.a.b(new NullPointerException("A Publisher entry is null"));
                    return;
                }
            }
            this.a.sh();
        }
    }
}
