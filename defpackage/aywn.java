package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aywn extends AtomicLong implements aypq, banx {
    private static final long serialVersionUID = -9102637559663639004L;
    final banw a;
    final long b;
    final TimeUnit c;
    final ayqh d;
    banx e;
    ayqx f;
    volatile long g;
    boolean h;

    public aywn(banw banwVar, long j, TimeUnit timeUnit, ayqh ayqhVar) {
        this.a = banwVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqhVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
            return;
        }
        this.h = true;
        Object obj = this.f;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        this.a.b(th);
        this.d.qc();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        long j = this.g + 1;
        this.g = j;
        Object obj2 = this.f;
        if (obj2 != null) {
            ayrz.c((AtomicReference) obj2);
        }
        aywm aywmVar = new aywm(obj, j, this);
        this.f = aywmVar;
        ayrz.i(aywmVar, this.d.c(aywmVar, this.b, this.c));
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.e, banxVar)) {
            this.e = banxVar;
            this.a.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.e.sd();
        this.d.qc();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.h) {
            return;
        }
        this.h = true;
        Object obj = this.f;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        if (obj != null) {
            ((aywm) obj).a();
        }
        this.a.sh();
        this.d.qc();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this, j);
        }
    }
}
