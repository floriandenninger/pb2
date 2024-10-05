package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aggq implements Runnable {
    public final /* synthetic */ aghc a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aggq(aghc aghcVar, String str, int i) {
        this.c = i;
        this.a = aghcVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agnv p;
        agnv p2;
        agnu agnuVar;
        int i = this.c;
        if (i == 0) {
            aghc aghcVar = this.a;
            String str = this.b;
            if (aghcVar.h.z() && (p = ((agil) aghcVar.k.get()).p(str)) != null && p.A()) {
                yjk.e();
                ((agil) aghcVar.k.get()).V(str, agnf.PAUSED);
                aghj aghjVar = (aghj) aghcVar.l.get();
                yjk.e();
                aghjVar.c.j(aghjVar.c(str), 128);
                aghjVar.c.i(aghjVar.b(str));
                aghcVar.t(str);
                return;
            }
            return;
        }
        if (i == 1) {
            aghc aghcVar2 = this.a;
            String str2 = this.b;
            yjk.e();
            if (((agil) aghcVar2.k.get()).E(str2)) {
                aghcVar2.q(str2);
                aghcVar2.o();
                return;
            } else {
                aghcVar2.p(str2, 2);
                return;
            }
        }
        if (i == 2) {
            aghc aghcVar3 = this.a;
            String str3 = this.b;
            if (aghcVar3.h.z()) {
                aghcVar3.G(str3, 2);
                return;
            }
            return;
        }
        if (i == 3) {
            aghc aghcVar4 = this.a;
            String str4 = this.b;
            if (aghcVar4.h.z() && (p2 = ((agil) aghcVar4.k.get()).p(str4)) != null && p2.C()) {
                yjk.e();
                ((agil) aghcVar4.k.get()).V(str4, agnf.ACTIVE);
                if (p2.o == null) {
                    aghcVar4.A(str4, null, p2.m);
                } else {
                    aghj aghjVar2 = (aghj) aghcVar4.l.get();
                    yjk.e();
                    aghjVar2.c.l(aghjVar2.b(str4));
                }
                aghcVar4.t(str4);
                return;
            }
            return;
        }
        if (i == 4) {
            aghc aghcVar5 = this.a;
            String str5 = this.b;
            aghj aghjVar3 = (aghj) aghcVar5.l.get();
            aghjVar3.c.m(aghjVar3.b(str5));
            return;
        }
        if (i != 5) {
            aghc aghcVar6 = this.a;
            String str6 = this.b;
            if (aghcVar6.h.z()) {
                aghcVar6.G(str6, 1);
                return;
            }
            return;
        }
        aghc aghcVar7 = this.a;
        String str7 = this.b;
        agnv p3 = ((agil) aghcVar7.k.get()).p(str7);
        if (p3 == null || (agnuVar = p3.j) == null) {
            return;
        }
        if (!agnuVar.f()) {
            aghcVar7.C(p3);
        } else {
            aghcVar7.t(str7);
        }
    }
}
