package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acnr implements Runnable {
    public final /* synthetic */ acoj a;
    public final /* synthetic */ abso b;
    private final /* synthetic */ int c;

    public /* synthetic */ acnr(acoj acojVar, abso absoVar, int i) {
        this.c = i;
        this.a = acojVar;
        this.b = absoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            acoj acojVar = this.a;
            abso absoVar = this.b;
            acojVar.s();
            acojVar.t(0, absoVar);
            return;
        }
        if (i == 1) {
            acoj acojVar2 = this.a;
            abso absoVar2 = this.b;
            if (!acojVar2.g.e(false)) {
                acojVar2.t(7, absoVar2);
                return;
            }
            acojVar2.b.a(true);
            acojVar2.n = true;
            acmd acmdVar = acojVar2.j;
            if (acmdVar != null) {
                acmdVar.b(true);
            }
            acojVar2.t(0, absoVar2);
            return;
        }
        if (i == 2) {
            acoj acojVar3 = this.a;
            abso absoVar3 = this.b;
            acojVar3.s();
            acojVar3.t(0, absoVar3);
            return;
        }
        acoj acojVar4 = this.a;
        abso absoVar4 = this.b;
        if (!acojVar4.g.e(acojVar4.m)) {
            acojVar4.t(7, absoVar4);
            return;
        }
        acojVar4.b.a(false);
        acojVar4.n = false;
        acmd acmdVar2 = acojVar4.j;
        if (acmdVar2 != null) {
            acmdVar2.b(false);
        }
        acojVar4.t(0, absoVar4);
    }
}
