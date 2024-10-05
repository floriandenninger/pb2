package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azai implements aypq, banx {
    final banw a;
    final ayro b;
    banx c;
    Object d;
    boolean e;

    public azai(banw banwVar, ayro ayroVar) {
        this.a = banwVar;
        this.b = ayroVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.e) {
            aynu.j(th);
        } else {
            this.e = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        banw banwVar = this.a;
        Object obj2 = this.d;
        if (obj2 == null) {
            this.d = obj;
            banwVar.c(obj);
            return;
        }
        try {
            Object a = this.b.a(obj2, obj);
            aysw.b(a, "The value returned by the accumulator is null");
            this.d = a;
            banwVar.c(a);
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
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.c.sj(j);
    }
}
