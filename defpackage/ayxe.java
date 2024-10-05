package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxe implements aypq, ayqx {
    final aypt a;
    banx b;
    long c;
    boolean d;

    public ayxe(aypt ayptVar) {
        this.a = ayptVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
            return;
        }
        this.d = true;
        this.b = azqb.a;
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        long j = this.c;
        if (j != 0) {
            this.c = j + 1;
            return;
        }
        this.d = true;
        this.b.sd();
        this.b = azqb.a;
        this.a.sc(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b == azqb.a;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.se(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.sd();
        this.b = azqb.a;
    }

    @Override // defpackage.banw
    public final void sh() {
        this.b = azqb.a;
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.sh();
    }
}
