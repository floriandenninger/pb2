package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayus implements aypi, ayqx {
    final aypi a;
    ayqx b;

    public ayus(aypi aypiVar) {
        this.a = aypiVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
        this.b = ayrz.a;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.sh();
    }
}
