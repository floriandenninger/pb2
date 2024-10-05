package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbg implements aypq, banx {
    final banw a;
    final ayrw b;
    banx c;
    boolean d;

    public azbg(banw banwVar, ayrw ayrwVar) {
        this.a = banwVar;
        this.b = ayrwVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        this.a.c(obj);
        try {
            if (this.b.a(obj)) {
                this.d = true;
                this.c.sd();
                this.a.sh();
            }
        } catch (Throwable th) {
            aynu.c(th);
            this.c.sd();
            b(th);
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            this.c = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.c.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.c.sj(j);
    }
}
