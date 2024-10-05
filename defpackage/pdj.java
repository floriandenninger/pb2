package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdj {
    public final pdq a = new pdq();
    public final pcn b;
    public pdo c;
    public int d;
    public pjk e;

    public pdj(pcn pcnVar) {
        this.b = pcnVar;
    }

    public final void a() {
        pdq pdqVar = this.a;
        pdqVar.c = 0;
        pdqVar.n = 0L;
        pdqVar.h = false;
        pdqVar.l = false;
        pdqVar.m = null;
        this.d = 0;
    }

    public final void b(pdo pdoVar, pjk pjkVar) {
        opn.h(pdoVar);
        this.c = pdoVar;
        opn.h(pjkVar);
        this.e = pjkVar;
        this.b.d(pdoVar.k);
        a();
    }
}
