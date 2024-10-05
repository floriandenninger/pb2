package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class omh implements Runnable {
    public final /* synthetic */ omq a;
    private final /* synthetic */ int b;

    public /* synthetic */ omh(omq omqVar, int i) {
        this.b = i;
        this.a = omqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.a.getSupportFragmentManager().ai(new akpx(), true);
                return;
            case 1:
                omq omqVar = this.a;
                omqVar.av.c(omqVar.a, omqVar.t);
                return;
            case 2:
                this.a.aC.a();
                return;
            case 3:
                this.a.f250J.get();
                return;
            case 4:
                this.a.aW.a(true);
                return;
            case 5:
                omq omqVar2 = this.a;
                omqVar2.ak.u(omqVar2.n, (fzb) omqVar2.p.get());
                return;
            case 6:
                this.a.au.e();
                return;
            case 7:
                omq omqVar3 = this.a;
                omqVar3.r.b = omqVar3.k;
                return;
            case 8:
                this.a.aq.a();
                return;
            case 9:
                omq omqVar4 = this.a;
                omqVar4.as.i(omqVar4.aT);
                return;
            case 10:
                this.a.ae.c();
                return;
            case 11:
                this.a.u();
                return;
            case 12:
                this.a.j.a();
                return;
            case 13:
                this.a.am.v();
                return;
            case 14:
                omq omqVar5 = this.a;
                omqVar5.as.i(omqVar5.aT);
                return;
            case 15:
                this.a.ae.d();
                return;
            case 16:
                this.a.v();
                return;
            case 17:
                this.a.l();
                return;
            case 18:
                this.a.q();
                return;
            case 19:
                this.a.k();
                return;
            default:
                akev a = ((lhd) this.a.N.get()).a();
                if (a.a.d()) {
                    long c = a.f.c();
                    if (c >= a.j + a.a.h) {
                        a.i();
                        a.j = c;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
