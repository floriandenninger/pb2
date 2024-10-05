package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayys implements aypq, ayqx {
    final aypi a;
    banx b;

    public ayys(aypi aypiVar) {
        this.a = aypiVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.b = azqb.a;
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
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
        this.a.sh();
    }
}
