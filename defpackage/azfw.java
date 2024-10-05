package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfw extends AtomicInteger implements ayqd, ayqx {
    private static final long serialVersionUID = -6951100001833242599L;
    final ayqd a;
    final int b;
    final azfv d;
    aytf f;
    ayqx g;
    volatile boolean h;
    volatile boolean i;
    volatile boolean j;
    int k;
    final boolean e = false;
    final azqf c = new azqf();

    public azfw(ayqd ayqdVar, int i) {
        this.a = ayqdVar;
        this.b = i;
        this.d = new azfv(ayqdVar, this);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (azqi.e(this.c, th)) {
            this.i = true;
            f();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.k == 0) {
            this.f.k(obj);
        }
        f();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (getAndIncrement() != 0) {
            return;
        }
        ayqd ayqdVar = this.a;
        aytf aytfVar = this.f;
        azqf azqfVar = this.c;
        while (true) {
            if (!this.h) {
                if (!this.j) {
                    if (((Throwable) azqfVar.get()) == null) {
                        boolean z = this.i;
                        try {
                            Object sg = aytfVar.sg();
                            if (z) {
                                if (sg == null) {
                                    this.j = true;
                                    Throwable d = azqi.d(azqfVar);
                                    if (d != null) {
                                        ayqdVar.b(d);
                                        return;
                                    } else {
                                        ayqdVar.sh();
                                        return;
                                    }
                                }
                            } else if (sg == null) {
                            }
                            try {
                                ayqb ayqbVar = (ayqb) sg;
                                if (ayqbVar instanceof Callable) {
                                    try {
                                        Object call = ((Callable) ayqbVar).call();
                                        if (call != null && !this.j) {
                                            ayqdVar.c(call);
                                        }
                                    } catch (Throwable th) {
                                        aynu.c(th);
                                        azqi.e(azqfVar, th);
                                    }
                                } else {
                                    this.h = true;
                                    ayqbVar.aE(this.d);
                                }
                            } catch (Throwable th2) {
                                aynu.c(th2);
                                this.j = true;
                                this.g.qc();
                                aytfVar.d();
                                azqi.e(azqfVar, th2);
                                ayqdVar.b(azqi.d(azqfVar));
                                return;
                            }
                        } catch (Throwable th3) {
                            aynu.c(th3);
                            this.j = true;
                            this.g.qc();
                            azqi.e(azqfVar, th3);
                            ayqdVar.b(azqi.d(azqfVar));
                            return;
                        }
                    } else {
                        aytfVar.d();
                        this.j = true;
                        ayqdVar.b(azqi.d(azqfVar));
                        return;
                    }
                } else {
                    aytfVar.d();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.j = true;
        this.g.qc();
        ayrz.c(this.d);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.g, ayqxVar)) {
            this.g = ayqxVar;
            if (ayqxVar instanceof ayta) {
                ayta aytaVar = (ayta) ayqxVar;
                int sf = aytaVar.sf(3);
                if (sf == 1) {
                    this.k = 1;
                    this.f = aytaVar;
                    this.i = true;
                    this.a.se(this);
                    f();
                    return;
                }
                if (sf == 2) {
                    this.k = 2;
                    this.f = aytaVar;
                    this.a.se(this);
                    return;
                }
            }
            this.f = new azoh(this.b);
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.i = true;
        f();
    }
}
