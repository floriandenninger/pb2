package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmm implements bmr {
    private pms a;
    private ptq b;
    private bjc c;

    public bmm(String str) {
        pmr pmrVar = new pmr();
        pmrVar.k = str;
        this.a = pmrVar.a();
    }

    @Override // defpackage.bmr
    public final void a(pth pthVar) {
        pse.d(this.b);
        int i = pts.a;
        long d = this.b.d();
        long e = this.b.e();
        if (d == -9223372036854775807L || e == -9223372036854775807L) {
            return;
        }
        pms pmsVar = this.a;
        if (e != pmsVar.r) {
            pmr b = pmsVar.b();
            b.o = e;
            pms a = b.a();
            this.a = a;
            this.c.rp(a);
        }
        int a2 = pthVar.a();
        this.c.t(pthVar, a2);
        this.c.v(d, 1, a2, 0, null);
    }

    @Override // defpackage.bmr
    public final void b(ptq ptqVar, bik bikVar, bmz bmzVar) {
        this.b = ptqVar;
        bmzVar.c();
        bjc n = bikVar.n(bmzVar.a(), 5);
        this.c = n;
        n.rp(this.a);
    }
}
