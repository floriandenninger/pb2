package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aidm implements ayrs {
    public final /* synthetic */ aido a;
    private final /* synthetic */ int b;

    public /* synthetic */ aidm(aido aidoVar, int i) {
        this.b = i;
        this.a = aidoVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        aiqm aiqmVar;
        aiqm aiqmVar2;
        int i = 7;
        int i2 = 4;
        int i3 = 3;
        switch (this.b) {
            case 0:
                ahed ahedVar = (ahed) obj;
                aiqm aiqmVar3 = this.a.t;
                if (aiqmVar3 != null) {
                    aiqmVar3.f(ahedVar);
                    return;
                }
                return;
            case 1:
                aido aidoVar = this.a;
                aeqq aeqqVar = (aeqq) obj;
                if (adyu.bP(aeqqVar.b()) && (aiqmVar = aidoVar.t) != null) {
                    aiqmVar.g(aeqqVar);
                    return;
                }
                return;
            case 2:
                aido aidoVar2 = this.a;
                aheg ahegVar = (aheg) obj;
                if (aidoVar2.b(aidoVar2.u)) {
                    return;
                }
                long e = ahegVar.e();
                if (aidoVar2.q.containsKey(aidoVar2.u)) {
                    e -= ((Long) ((Pair) aidoVar2.q.get(aidoVar2.u)).first).longValue();
                }
                long j = e;
                long f = ahegVar.f();
                if (aidoVar2.r.d(aidoVar2.u) != null) {
                    f = TimeUnit.SECONDS.toMillis(r5.f.a());
                }
                aheg ahegVar2 = new aheg(j, ahegVar.b(), 0L, f, ahegVar.a(), ahegVar.d(), ahegVar.c(), ahegVar.j(), aidoVar2.u);
                aiqm aiqmVar4 = aidoVar2.t;
                if (aiqmVar4 != null) {
                    aiqmVar4.q(ahegVar2);
                    return;
                }
                return;
            case 3:
                aido aidoVar3 = this.a;
                ahej ahejVar = (ahej) obj;
                if (aidoVar3.b(aidoVar3.u)) {
                    return;
                }
                int a = ahejVar.a();
                if (a == 3) {
                    aiqm aiqmVar5 = aidoVar3.t;
                    if (aiqmVar5 != null) {
                        aiqmVar5.k();
                        return;
                    }
                    return;
                }
                if (a != 4) {
                    if (a == 7 && (aiqmVar2 = aidoVar3.t) != null) {
                        aiqmVar2.i();
                        return;
                    }
                    return;
                }
                aiqm aiqmVar6 = aidoVar3.t;
                if (aiqmVar6 != null) {
                    aiqmVar6.n();
                    return;
                }
                return;
            case 4:
                aiqm aiqmVar7 = this.a.t;
                if (aiqmVar7 != null) {
                    aiqmVar7.b();
                    return;
                }
                return;
            case 5:
                aido aidoVar4 = this.a;
                aiqm aiqmVar8 = aidoVar4.t;
                if (aiqmVar8 != null) {
                    aiqmVar8.h();
                }
                aidoVar4.q.clear();
                aidoVar4.a();
                return;
            case 6:
                ahcr ahcrVar = (ahcr) obj;
                aiqm aiqmVar9 = this.a.t;
                if (aiqmVar9 != null) {
                    aiqmVar9.c(ahcrVar);
                    return;
                }
                return;
            case 7:
                aido aidoVar5 = this.a;
                ahct ahctVar = (ahct) obj;
                ajbu n = aidoVar5.r.n(ahctVar.a());
                if (n == null || !n.e.equals(aidoVar5.u) || aidoVar5.b(aidoVar5.u)) {
                    return;
                }
                long a2 = ahctVar.a();
                if (aidoVar5.q.containsKey(aidoVar5.u)) {
                    a2 = ahctVar.a() - ((Long) ((Pair) aidoVar5.q.get(aidoVar5.u)).first).longValue();
                }
                aiqm aiqmVar10 = aidoVar5.t;
                if (aiqmVar10 != null) {
                    aiqmVar10.l(a2);
                    return;
                }
                return;
            case 8:
                aiqm aiqmVar11 = this.a.t;
                if (aiqmVar11 != null) {
                    aiqmVar11.o();
                    return;
                }
                return;
            case 9:
                ahcx ahcxVar = (ahcx) obj;
                aiqm aiqmVar12 = this.a.t;
                if (aiqmVar12 != null) {
                    aiqmVar12.d(ahcxVar);
                    return;
                }
                return;
            case 10:
                aido aidoVar6 = this.a;
                if (((ahdo) obj).a()) {
                    aiqm aiqmVar13 = aidoVar6.t;
                    if (aiqmVar13 != null) {
                        aiqmVar13.j();
                        return;
                    }
                    return;
                }
                aiqm aiqmVar14 = aidoVar6.t;
                if (aiqmVar14 != null) {
                    aiqmVar14.p();
                    return;
                }
                return;
            case 11:
                final aido aidoVar7 = this.a;
                ahdp ahdpVar = (ahdp) obj;
                if (ahdpVar.a() == null || !ahdpVar.a().c().aj()) {
                    return;
                }
                aidoVar7.a.d(aidoVar7.f.X(new ayrs() { // from class: aidn
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        aiqm aiqmVar15;
                        ahdx ahdxVar;
                        aido aidoVar8;
                        String str;
                        aido aidoVar9 = aido.this;
                        ahdx ahdxVar2 = (ahdx) obj2;
                        if (ahdxVar2.i()) {
                            if (!aidoVar9.b(ahdxVar2.e())) {
                                if (ahdxVar2.c().f().b == null) {
                                    zga.l("Missing Vss base url");
                                    return;
                                }
                                PlayerResponseModel c = ahdxVar2.c();
                                String e2 = ahdxVar2.e();
                                String str2 = aidoVar9.v;
                                long b = ahdxVar2.b();
                                if (e2.equals(aidoVar9.u)) {
                                    aidoVar8 = aidoVar9;
                                    ahdxVar = ahdxVar2;
                                } else {
                                    Pair pair = (Pair) aidoVar9.q.get(e2);
                                    aiqn aiqnVar = aidoVar9.p;
                                    boolean z = pair != null && ((aiqb) pair.second).a;
                                    boolean z2 = pair != null && ((aiqb) pair.second).b;
                                    boolean z3 = pair != null && ((aiqb) pair.second).c;
                                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) aiqnVar.a.get();
                                    scheduledExecutorService.getClass();
                                    afuh afuhVar = (afuh) aiqnVar.b.get();
                                    afuhVar.getClass();
                                    afqm afqmVar = (afqm) aiqnVar.c.get();
                                    afqmVar.getClass();
                                    shf shfVar = (shf) aiqnVar.d.get();
                                    shfVar.getClass();
                                    ysy ysyVar = (ysy) aiqnVar.e.get();
                                    ysyVar.getClass();
                                    zez zezVar = (zez) aiqnVar.f.get();
                                    zezVar.getClass();
                                    afqj afqjVar = (afqj) aiqnVar.g.get();
                                    afqjVar.getClass();
                                    afxf afxfVar = (afxf) aiqnVar.h.get();
                                    ahdxVar = ahdxVar2;
                                    afxfVar.getClass();
                                    zbw zbwVar = (zbw) aiqnVar.i.get();
                                    ahbv ahbvVar = (ahbv) aiqnVar.j.get();
                                    ahbvVar.getClass();
                                    afsy afsyVar = (afsy) aiqnVar.k.get();
                                    afsyVar.getClass();
                                    aaea aaeaVar = (aaea) aiqnVar.l.get();
                                    aaeaVar.getClass();
                                    aifs aifsVar = (aifs) aiqnVar.m.get();
                                    aifsVar.getClass();
                                    aigv aigvVar = (aigv) aiqnVar.n.get();
                                    aigvVar.getClass();
                                    awdj awdjVar = (awdj) aiqnVar.o.get();
                                    c.getClass();
                                    e2.getClass();
                                    aiqu aiquVar = (aiqu) aiqnVar.p.get();
                                    aiquVar.getClass();
                                    ammv ammvVar = (ammv) aiqnVar.q.get();
                                    ammvVar.getClass();
                                    aiqm aiqmVar16 = new aiqm(scheduledExecutorService, afuhVar, afqmVar, shfVar, ysyVar, zezVar, afqjVar, afxfVar, zbwVar, ahbvVar, afsyVar, aaeaVar, aifsVar, aigvVar, str2, awdjVar, c, e2, 1, z, z2, z3, aiquVar, ammvVar);
                                    aidoVar8 = aidoVar9;
                                    aidoVar8.t = aiqmVar16;
                                    if (pair == null) {
                                        str = e2;
                                        aidoVar8.q.put(str, new Pair(Long.valueOf(b), aidoVar8.t.a()));
                                    } else {
                                        str = e2;
                                    }
                                    aidoVar8.u = str;
                                }
                                long j2 = aidoVar8.s.e;
                                Pair pair2 = (Pair) aidoVar8.q.get(ahdxVar.e());
                                if (pair2 != null) {
                                    j2 = aidoVar8.s.e - ((Long) pair2.first).longValue();
                                }
                                aiqm aiqmVar17 = aidoVar8.t;
                                if (aiqmVar17 != null) {
                                    aiqmVar17.m(j2);
                                    return;
                                }
                                return;
                            }
                            aidoVar9.a();
                            return;
                        }
                        if (aidoVar9.b(ahdxVar2.e()) || !ahdxVar2.e().equals(aidoVar9.u) || (aiqmVar15 = aidoVar9.t) == null) {
                            return;
                        }
                        aiqmVar15.o();
                        aiqb a3 = aidoVar9.t.a();
                        Pair pair3 = (Pair) aidoVar9.q.get(ahdxVar2.e());
                        aidoVar9.q.put(ahdxVar2.e(), new Pair(Long.valueOf(pair3 != null ? ((Long) pair3.first).longValue() : 0L), a3));
                        aidoVar9.a();
                    }
                }));
                aidoVar7.a.d(aidoVar7.b.X(new aidm(aidoVar7, i3)));
                aidoVar7.a.d(aidoVar7.c.X(new aidm(aidoVar7, 2)));
                aidoVar7.a.d(aidoVar7.d.X(new aidm(aidoVar7, 8)));
                aidoVar7.a.d(aidoVar7.e.X(new aidm(aidoVar7, 1)));
                aidoVar7.a.d(aidoVar7.h.X(new aidm(aidoVar7, i)));
                aidoVar7.a.d(aidoVar7.i.V(new aidm(aidoVar7, 5)));
                aidoVar7.a.d(aidoVar7.j.X(new aidm(aidoVar7, 10)));
                aidoVar7.a.d(aidoVar7.k.X(new aidm(aidoVar7, 6)));
                aidoVar7.a.d(aidoVar7.l.X(new aidm(aidoVar7, 0)));
                aidoVar7.a.d(aidoVar7.m.X(new aidm(aidoVar7, 9)));
                aidoVar7.a.d(aidoVar7.o.X(new aidm(aidoVar7, 12)));
                aidoVar7.a.d(((aypn) aidoVar7.n.get()).X(new aidm(aidoVar7, i2)));
                return;
            default:
                ahdy ahdyVar = (ahdy) obj;
                aiqm aiqmVar15 = this.a.t;
                if (aiqmVar15 != null) {
                    aiqmVar15.e(ahdyVar);
                    return;
                }
                return;
        }
    }
}
