package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azil implements ayqd, ayqx {
    final aypi a;
    ayqx b;

    public azil(aypi aypiVar) {
        this.a = aypiVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        this.b = ayqxVar;
        this.a.se(this);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }
}
