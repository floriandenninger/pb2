package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acmg implements Runnable {
    public final /* synthetic */ acmq a;
    private final /* synthetic */ int b;

    public /* synthetic */ acmg(acmq acmqVar, int i) {
        this.b = i;
        this.a = acmqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.c(false);
            return;
        }
        if (i == 1) {
            this.a.c(true);
            return;
        }
        if (i == 2) {
            acmq acmqVar = this.a;
            acac acacVar = acmqVar.n;
            if (acacVar != null) {
                abzy abzyVar = (abzy) acacVar;
                if (abzyVar.j()) {
                    abzyVar.f(acmqVar.k);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 3) {
            acmq acmqVar2 = this.a;
            if (!acmqVar2.e()) {
                acmqVar2.g();
                return;
            }
            if (!acmqVar2.n.d()) {
                acmqVar2.g();
                return;
            } else if (!acmqVar2.m.d()) {
                acmqVar2.g();
                return;
            } else {
                acmqVar2.k.h();
                acmqVar2.g = true;
                return;
            }
        }
        acmq acmqVar3 = this.a;
        yjk.e();
        yjk.e();
        if (acmqVar3.l != null) {
            acmqVar3.f();
            acmqVar3.l.o();
            acmqVar3.l = null;
        }
        acac acacVar2 = acmqVar3.n;
        if (acacVar2 != null) {
            ((abzy) acacVar2).e = null;
            acacVar2.e();
            acmqVar3.n.c();
            acmqVar3.n = null;
        }
        acac acacVar3 = acmqVar3.m;
        if (acacVar3 != null) {
            ((abzp) acacVar3).d = null;
            acacVar3.e();
            acmqVar3.m.c();
            acmqVar3.m = null;
        }
    }
}
