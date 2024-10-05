package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzx extends AtomicBoolean implements aypq, banx {
    private static final long serialVersionUID = -7419642935409022375L;
    final banw a;
    final ayzy b;
    final ayzw c;
    banx d;

    public ayzx(banw banwVar, ayzy ayzyVar, ayzw ayzwVar) {
        this.a = banwVar;
        this.b = ayzyVar;
        this.c = ayzwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.d, banxVar)) {
            this.d = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.d.sd();
        if (compareAndSet(false, true)) {
            ayzy ayzyVar = this.b;
            ayzw ayzwVar = this.c;
            synchronized (ayzyVar) {
                ayzw ayzwVar2 = ayzyVar.c;
                if (ayzwVar2 != null && ayzwVar2 == ayzwVar) {
                    long j = ayzwVar.c - 1;
                    ayzwVar.c = j;
                    if (j == 0 && ayzwVar.d) {
                        ayzyVar.c(ayzwVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        if (compareAndSet(false, true)) {
            this.b.b(this.c);
            this.a.sh();
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.d.sj(j);
    }
}
