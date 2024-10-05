package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayyl extends azpv implements aypq {
    static final Object a = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final banw b;
    final ayrv c;
    final int d;
    final Map e;
    final azoh f;
    banx g;
    final AtomicBoolean h = new AtomicBoolean();
    final AtomicLong i = new AtomicLong();
    final AtomicInteger j = new AtomicInteger(1);
    Throwable k;
    volatile boolean l;
    boolean m;
    boolean n;

    public ayyl(banw banwVar, ayrv ayrvVar, int i, Map map) {
        this.b = banwVar;
        this.c = ayrvVar;
        this.d = i;
        this.e = map;
        this.f = new azoh(i);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.m) {
            aynu.j(th);
            return;
        }
        this.m = true;
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ayym ayymVar = ((ayrl) it.next()).b;
            ayymVar.f = th;
            ayymVar.e = true;
            ayymVar.b();
        }
        this.e.clear();
        this.k = th;
        this.l = true;
        g();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        boolean z;
        if (this.m) {
            return;
        }
        azoh azohVar = this.f;
        try {
            Object a2 = this.c.a(obj);
            Object obj2 = a2 != null ? a2 : a;
            ayrl ayrlVar = (ayrl) this.e.get(obj2);
            if (ayrlVar != null) {
                z = false;
            } else {
                if (this.h.get()) {
                    return;
                }
                ayrlVar = new ayrl(new ayym(this.d, this, a2));
                this.e.put(obj2, ayrlVar);
                this.j.getAndIncrement();
                z = true;
            }
            try {
                aysw.b(obj, "The valueSelector returned null");
                ayym ayymVar = ayrlVar.b;
                ayymVar.b.k(obj);
                ayymVar.b();
                if (z) {
                    azohVar.k(ayrlVar);
                    g();
                }
            } catch (Throwable th) {
                aynu.c(th);
                this.g.sd();
                b(th);
            }
        } catch (Throwable th2) {
            aynu.c(th2);
            this.g.sd();
            b(th2);
        }
    }

    @Override // defpackage.aytf
    public final void d() {
        this.f.d();
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.g, banxVar)) {
            this.g = banxVar;
            this.b.f(this);
            banxVar.sj(this.d);
        }
    }

    final void g() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        if (this.n) {
            azoh azohVar = this.f;
            banw banwVar = this.b;
            while (!this.h.get()) {
                boolean z = this.l;
                if (!z || (th = this.k) == null) {
                    banwVar.c(null);
                    if (z) {
                        Throwable th2 = this.k;
                        if (th2 != null) {
                            banwVar.b(th2);
                            return;
                        } else {
                            banwVar.sh();
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
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
        azoh azohVar2 = this.f;
        banw banwVar2 = this.b;
        int i2 = 1;
        do {
            long j = this.i.get();
            long j2 = 0;
            while (j2 != j) {
                boolean z2 = this.l;
                ayrl ayrlVar = (ayrl) azohVar2.sg();
                boolean z3 = ayrlVar == null;
                if (h(z2, z3, banwVar2, azohVar2)) {
                    return;
                }
                if (z3) {
                    break;
                }
                banwVar2.c(ayrlVar);
                j2++;
            }
            if (j2 == j && h(this.l, azohVar2.j(), banwVar2, azohVar2)) {
                return;
            }
            if (j2 != 0) {
                if (j != Long.MAX_VALUE) {
                    this.i.addAndGet(-j2);
                }
                this.g.sj(j2);
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    final boolean h(boolean z, boolean z2, banw banwVar, azoh azohVar) {
        if (this.h.get()) {
            azohVar.d();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.k;
        if (th != null) {
            azohVar.d();
            banwVar.b(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        banwVar.sh();
        return true;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.f.j();
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.h.compareAndSet(false, true) && this.j.decrementAndGet() == 0) {
            this.g.sd();
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.n = true;
        return 2;
    }

    @Override // defpackage.aytf
    public final /* bridge */ /* synthetic */ Object sg() {
        return (ayrl) this.f.sg();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.m) {
            return;
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ayym ayymVar = ((ayrl) it.next()).b;
            ayymVar.e = true;
            ayymVar.b();
        }
        this.e.clear();
        this.m = true;
        this.l = true;
        g();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.i, j);
            g();
        }
    }
}
