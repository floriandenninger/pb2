package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abst implements Runnable {
    public final /* synthetic */ abtk a;
    public final /* synthetic */ abso b;
    private final /* synthetic */ int c;

    public /* synthetic */ abst(abtk abtkVar, abso absoVar, int i) {
        this.c = i;
        this.a = abtkVar;
        this.b = absoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            abtk abtkVar = this.a;
            abso absoVar = this.b;
            yjk.e();
            if (abtkVar.w != 2 || !abtkVar.y() || !abtkVar.j.j() || !abtkVar.k.j() || !abtkVar.o.k()) {
                abtkVar.u(2, absoVar);
                return;
            }
            abtkVar.i = false;
            abtkVar.x();
            boolean k = abtkVar.j.k();
            boolean g = abtkVar.q.g();
            boolean k2 = abtkVar.k.k();
            if (abtkVar.s != null) {
                abtkVar.s.d(true);
            }
            abtkVar.u((k2 && k && g) ? 0 : 7, absoVar);
            return;
        }
        if (i != 1) {
            abtk abtkVar2 = this.a;
            abso absoVar2 = this.b;
            yjk.e();
            if (abtkVar2.w != 2 || !abtkVar2.y() || !abtkVar2.j.j() || !abtkVar2.k.j() || !abtkVar2.o.k()) {
                abtkVar2.u(2, absoVar2);
                return;
            }
            if (!((abzy) abtkVar2.j).a.m()) {
                abtkVar2.u(7, absoVar2);
                return;
            }
            if (!abtkVar2.q.e()) {
                abtkVar2.j.k();
                abtkVar2.u(7, absoVar2);
                return;
            } else if (!abtkVar2.k.m()) {
                abtkVar2.j.k();
                abtkVar2.q.g();
                abtkVar2.u(7, absoVar2);
                return;
            } else {
                abtkVar2.i = true;
                abtkVar2.x();
                abtkVar2.u(0, absoVar2);
                return;
            }
        }
        abtk abtkVar3 = this.a;
        abso absoVar3 = this.b;
        yjk.e();
        abtkVar3.t();
        abtkVar3.u(0, absoVar3);
    }
}
