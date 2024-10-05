package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cth implements cqv {
    final /* synthetic */ cvy a;
    final /* synthetic */ cti b;

    public cth(cti ctiVar, cvy cvyVar) {
        this.b = ctiVar;
        this.a = cvyVar;
    }

    @Override // defpackage.cqv
    public final void f(Object obj) {
        if (this.b.f(this.a)) {
            cti ctiVar = this.b;
            cvy cvyVar = this.a;
            csk cskVar = ctiVar.a.o;
            if (obj == null || !cskVar.c(cvyVar.c.e())) {
                csa csaVar = ctiVar.b;
                cqi cqiVar = cvyVar.a;
                cqw cqwVar = cvyVar.c;
                csaVar.e(cqiVar, obj, cqwVar, cqwVar.e(), ctiVar.d);
                return;
            }
            ctiVar.c = obj;
            ctiVar.b.c();
        }
    }

    @Override // defpackage.cqv
    public final void g(Exception exc) {
        if (this.b.f(this.a)) {
            cti ctiVar = this.b;
            cvy cvyVar = this.a;
            csa csaVar = ctiVar.b;
            cry cryVar = ctiVar.d;
            cqw cqwVar = cvyVar.c;
            csaVar.d(cryVar, exc, cqwVar, cqwVar.e());
        }
    }
}
