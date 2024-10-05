package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdb implements ayqk, ayqx {
    final aypt a;
    ayqx b;

    public azdb(aypt ayptVar) {
        this.a = ayptVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.b = ayrz.a;
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

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.b = ayrz.a;
        this.a.sc(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            this.a.se(this);
        }
    }
}
