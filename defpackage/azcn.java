package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azcn implements ayqk, ayqx {
    final aypt a;
    final ayrw b;
    ayqx c;

    public azcn(aypt ayptVar, ayrw ayrwVar) {
        this.a = ayptVar;
        this.b = ayrwVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayqx ayqxVar = this.c;
        this.c = ayrz.a;
        ayqxVar.qc();
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        try {
            if (this.b.a(obj)) {
                this.a.sc(obj);
            } else {
                this.a.sh();
            }
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }
}
