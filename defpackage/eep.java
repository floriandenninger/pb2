package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eep implements azrw {
    private final efz a;
    private final eeq b;
    private final int c;

    public eep(efz efzVar, eeq eeqVar, int i) {
        this.a = efzVar;
        this.b = eeqVar;
        this.c = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0082. Please report as an issue. */
    @Override // defpackage.azrw
    public final Object get() {
        Object airxVar;
        Object obj;
        int i = this.c;
        if (i / 100 == 0) {
            switch (i) {
                case 0:
                    return this.b.a();
                case 1:
                    return this.b.g();
                case 2:
                    eeq eeqVar = this.b;
                    efz efzVar = eeqVar.a;
                    azrw azrwVar = efzVar.g;
                    azrw azrwVar2 = efzVar.hC;
                    azrw azrwVar3 = efzVar.gh;
                    azrw azrwVar4 = efzVar.uC;
                    azrw azrwVar5 = efzVar.uD;
                    azrw azrwVar6 = eeqVar.E;
                    azrw azrwVar7 = eeqVar.j;
                    azrw azrwVar8 = eeqVar.D;
                    azrw azrwVar9 = efzVar.gc;
                    azrw azrwVar10 = efzVar.hl;
                    azrw azrwVar11 = efzVar.vl;
                    azrw azrwVar12 = efzVar.vm;
                    azrw azrwVar13 = efzVar.K;
                    azrw azrwVar14 = efzVar.D;
                    azrw azrwVar15 = eeqVar.aj;
                    azrw azrwVar16 = efzVar.vf;
                    azrw b = axqv.b(eeqVar.f);
                    efz efzVar2 = eeqVar.a;
                    return new adja(new aiwp(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, b, efzVar2.iU, efzVar2.fS, efzVar2.gD), (adiu) eeqVar.ak.get(), eeqVar.a.ja, (aifs) eeqVar.j.get());
                case 3:
                    return this.b.Q();
                case 4:
                    eeq eeqVar2 = this.b;
                    return aiog.e((airx) eeqVar2.d.get(), (aadw) eeqVar2.a.D.get());
                case 5:
                    eeq eeqVar3 = this.b;
                    airxVar = new airx((afgt) eeqVar3.a.hI.get(), (aypn) eeqVar3.b.get(), (aifv) eeqVar3.c.get(), (aypn) eeqVar3.a.gf.get(), (shf) eeqVar3.a.g.get(), (ajby) eeqVar3.a.uE.get(), (aaea) eeqVar3.a.K.get());
                    return airxVar;
                case 6:
                    return this.b.af();
                case 7:
                    return azqv.ap();
                case 8:
                    Context context = this.b.a.b.a;
                    return aifu.h();
                case 9:
                    return this.b.T();
                case 10:
                    eeq eeqVar4 = this.b;
                    return amsx.v((ajai) eeqVar4.ae.get(), (ajai) eeqVar4.af.get(), (ajai) eeqVar4.ag.get(), (ajai) eeqVar4.ah.get(), (ajai) eeqVar4.ai.get());
                case 11:
                    eeq eeqVar5 = this.b;
                    return aifi.d((aiow) eeqVar5.a.uG.get(), (Executor) eeqVar5.a.i.get(), eeqVar5.M, eeqVar5.O, (acpl) eeqVar5.a.aw.get(), (aifk) eeqVar5.a.fS.get());
                case 12:
                    eeq eeqVar6 = this.b;
                    efz efzVar3 = eeqVar6.a;
                    Context context2 = efzVar3.b.a;
                    ypa ypaVar = (ypa) efzVar3.B.get();
                    aemv aemvVar = (aemv) eeqVar6.a.hC.get();
                    aisf aisfVar = (aisf) eeqVar6.h.get();
                    aixc aixcVar = (aixc) eeqVar6.a.uI.get();
                    ahbh ahbhVar = (ahbh) eeqVar6.w.get();
                    aifs aifsVar = (aifs) eeqVar6.j.get();
                    aigv aigvVar = (aigv) eeqVar6.D.get();
                    aiwz aiwzVar = (aiwz) eeqVar6.F.get();
                    ahaw ahawVar = new ahaw(eeqVar6.a.b.a, (aifs) eeqVar6.j.get(), (aaoz) eeqVar6.a.gc.get(), (Executor) eeqVar6.a.f.get(), (banw) eeqVar6.H.get());
                    aiwg aiwgVar = (aiwg) eeqVar6.a.jn.get();
                    afqj afqjVar = (afqj) eeqVar6.a.hk.get();
                    aaea aaeaVar = (aaea) eeqVar6.a.K.get();
                    aife aifeVar = (aife) eeqVar6.K.get();
                    amsx.w(eeqVar6.P.get(), eeqVar6.Q.get(), eeqVar6.S.get(), eeqVar6.U.get(), eeqVar6.V.get(), eeqVar6.W.get(), eeqVar6.X.get(), eeqVar6.Y.get(), eeqVar6.Z.get(), eeqVar6.aa.get(), eeqVar6.a.vk.get());
                    ainy b2 = aiop.b(context2, ypaVar, aemvVar, aisfVar, aixcVar, ahbhVar, aifsVar, aigvVar, aiwzVar, ahawVar, aiwgVar, afqjVar, aaeaVar, aifeVar, (aiih) eeqVar6.x.get(), (aipn) eeqVar6.f200J.get(), (aipd) eeqVar6.B.get(), (aiow) eeqVar6.C.get(), (aimx) eeqVar6.v.get(), (banw) eeqVar6.ab.get(), (banw) eeqVar6.ac.get(), (aioo) eeqVar6.N.get(), (ahaz) eeqVar6.ad.get(), (aifk) eeqVar6.a.fS.get());
                    b2.v((aiov) eeqVar6.L.get(), (aypn) eeqVar6.l.get(), (aioo) eeqVar6.N.get(), (aifv) eeqVar6.c.get());
                    return b2;
                case 13:
                    return this.b.L();
                case 14:
                    return this.b.N();
                case 15:
                    return aifu.b((aypn) this.b.e.get());
                case 16:
                    return this.b.ag();
                case 17:
                    return azqv.ap();
                case 18:
                    return azqy.ap();
                case 19:
                    return this.b.n();
                case 20:
                    eeq eeqVar7 = this.b;
                    return aiog.b((aifv) eeqVar7.c.get(), (aift) eeqVar7.i.get());
                case 21:
                    Context context3 = this.b.a.b.a;
                    obj = new aift();
                    return obj;
                case 22:
                    eeq eeqVar8 = this.b;
                    ypa ypaVar2 = (ypa) eeqVar8.a.B.get();
                    axpg a = axqq.a(eeqVar8.k);
                    Handler handler = (Handler) eeqVar8.a.an.get();
                    zaw zawVar = (zaw) eeqVar8.a.iN.get();
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eeqVar8.a.Q.get();
                    Executor executor = (Executor) eeqVar8.a.i.get();
                    aimx aimxVar = (aimx) eeqVar8.v.get();
                    ahbg aI = eeqVar8.aI();
                    aaea aaeaVar2 = (aaea) eeqVar8.a.K.get();
                    aadw aadwVar = (aadw) eeqVar8.a.D.get();
                    return new aiih(ypaVar2, a, handler, zawVar, scheduledExecutorService, executor, aimxVar, aI, aaeaVar2, aadwVar, (aifk) eeqVar8.a.fS.get());
                case 23:
                    eeq eeqVar9 = this.b;
                    return acqm.d((azqw) eeqVar9.l.get(), (azqw) eeqVar9.m.get(), (azqw) eeqVar9.n.get(), (azqw) eeqVar9.o.get(), (azqw) eeqVar9.p.get(), (azqw) eeqVar9.q.get(), (azqw) eeqVar9.r.get(), (azqw) eeqVar9.s.get(), (azqw) eeqVar9.t.get(), (azqw) eeqVar9.u.get());
                case 24:
                    return azqy.ap();
                case 25:
                    return azqy.ap();
                case 26:
                    return azqv.ap();
                case 27:
                    return azqy.ap();
                case 28:
                    return azqy.ap();
                case 29:
                    return azqy.ap();
                case 30:
                    return azqv.ap();
                case 31:
                    return azqy.ap();
                case 32:
                    return azqy.ap();
                case 33:
                    return azqy.ap();
                case 34:
                    eeq eeqVar10 = this.b;
                    return new aiow((banw) eeqVar10.z.get(), eeqVar10.aL(), (aiih) eeqVar10.x.get(), (aipd) eeqVar10.B.get(), null);
                case 35:
                    eeq eeqVar11 = this.b;
                    Context context4 = eeqVar11.a.b.a;
                    azqw azqwVar = (azqw) eeqVar11.y.get();
                    ayaw.k(azqwVar);
                    return azqwVar;
                case 36:
                    return azqy.ap();
                case 37:
                    return this.b.H();
                case 38:
                    return this.b.v();
                case 39:
                    obj = new aiwz((aiwl) this.b.E.get());
                    return obj;
                case 40:
                    eeq eeqVar12 = this.b;
                    Context context5 = eeqVar12.a.b.a;
                    azqw azqwVar2 = (azqw) eeqVar12.G.get();
                    ayaw.k(azqwVar2);
                    return azqwVar2;
                case 41:
                    return azqy.ap();
                case 42:
                    return this.b.r();
                case 43:
                    eeq eeqVar13 = this.b;
                    return new aipn(eeqVar13.a.cp(), (aimx) eeqVar13.v.get(), (aild) eeqVar13.I.get(), (aipd) eeqVar13.B.get(), (Executor) eeqVar13.a.f.get(), (Executor) eeqVar13.a.i.get(), (aaea) eeqVar13.a.K.get(), eeqVar13.aL(), (aiih) eeqVar13.x.get(), (aifk) eeqVar13.a.fS.get(), eeqVar13.aI(), null);
                case 44:
                    return this.b.b();
                case 45:
                    return azqy.ap();
                case 46:
                    return this.b.m();
                case 47:
                    eeq eeqVar14 = this.b;
                    obj = new aiov((aypn) eeqVar14.b.get(), (aypn) eeqVar14.e.get(), (aypn) eeqVar14.y.get());
                    return obj;
                case 48:
                    eeq eeqVar15 = this.b;
                    return afqe.m((ainy) eeqVar15.M.get(), (aioo) eeqVar15.N.get());
                case 49:
                    return aifu.g(this.b.k);
                case 50:
                    return this.b.o();
                case 51:
                    eeq eeqVar16 = this.b;
                    airxVar = new aior((aigv) eeqVar16.D.get(), (aild) eeqVar16.I.get(), (ajby) eeqVar16.a.uE.get(), (ypa) eeqVar16.a.B.get(), amsx.r(new inj()), (aiov) eeqVar16.L.get(), amsx.r((aifm) eeqVar16.R.get()));
                    return airxVar;
                case 52:
                    return this.b.p();
                case 53:
                    eeq eeqVar17 = this.b;
                    aimx aimxVar2 = (aimx) eeqVar17.v.get();
                    ahbv ahbvVar = (ahbv) eeqVar17.a.bd.get();
                    Handler handler2 = (Handler) eeqVar17.a.an.get();
                    axpg a2 = axqq.a(eeqVar17.O);
                    aypn aypnVar = (aypn) eeqVar17.p.get();
                    aypn aypnVar2 = (aypn) eeqVar17.T.get();
                    aypn aypnVar3 = (aypn) eeqVar17.l.get();
                    aiov aiovVar = (aiov) eeqVar17.L.get();
                    efz efzVar4 = eeqVar17.a;
                    aimo c = acqm.c(aimxVar2, ahbvVar, handler2, a2, aypnVar, aypnVar2, aypnVar3, aiovVar, efzVar4.vc, efzVar4.vd);
                    c.b();
                    return c;
                case 54:
                    return this.b.U();
                case 55:
                    return this.b.I();
                case 56:
                    return this.b.J();
                case 57:
                    return azqy.ap();
                case 58:
                    eeq eeqVar18 = this.b;
                    ajca o = advr.o((aiwx) eeqVar18.a.vf.get(), (aift) eeqVar18.i.get(), (aemv) eeqVar18.a.hC.get());
                    o.a();
                    return o;
                case 59:
                    eeq eeqVar19 = this.b;
                    aidi I = advr.I(new akpq(eeqVar19.a.iW, eeqVar19.c, (byte[]) null, (char[]) null));
                    I.a((aypn) eeqVar19.e.get());
                    obj = I;
                    return obj;
                case 60:
                    eeq eeqVar20 = this.b;
                    return ajgm.b(eeqVar20.a.dE(), (aifv) eeqVar20.c.get());
                case 61:
                    return this.b.d();
                case 62:
                    return this.b.c();
                case 63:
                    obj = new khk((aioc) this.b.a.fY.get());
                    return obj;
                case 64:
                    obj = new khp((aioc) this.b.a.fY.get());
                    return obj;
                case 65:
                    return this.b.at();
                case 66:
                    return azqy.ap();
                case 67:
                    eeq eeqVar21 = this.b;
                    Context context6 = eeqVar21.a.b.a;
                    azqw azqwVar3 = (azqw) eeqVar21.g.get();
                    ayaw.k(azqwVar3);
                    return azqwVar3;
                case 68:
                    return this.b.l();
                case 69:
                    eeq eeqVar22 = this.b;
                    return ajbg.b((Executor) eeqVar22.a.i.get(), eeqVar22.O, (aifk) eeqVar22.a.fS.get(), (acpl) eeqVar22.a.aw.get());
                case 70:
                    return this.b.R();
                case 71:
                    return ajbp.b();
                case 72:
                    return aizl.b(this.b.a.av());
                case 73:
                    eeq eeqVar23 = this.b;
                    return amsx.t(eeqVar23.a.gg(), eeqVar23.a.fs(), (ajbh) eeqVar23.a.to.get());
                case 74:
                    return this.b.aA();
                case 75:
                    return this.b.aB();
                case 76:
                    return this.b.ay();
                case 77:
                    return this.b.az();
                case 78:
                    return new efw(this.a, this.b);
                case 79:
                    return this.b.h();
                case 80:
                    eeq eeqVar24 = this.b;
                    aivu b3 = aijh.b((aivo) eeqVar24.a.jk.get(), (aifv) eeqVar24.a.rX.get(), (aivs) eeqVar24.a.vr.get(), (ypa) eeqVar24.a.B.get());
                    b3.a();
                    return b3;
                case 81:
                    aioc aiocVar = ((ahzx) this.b.a.eQ.get()).a;
                    ayaw.k(aiocVar);
                    return aiocVar;
                case 82:
                    eeq eeqVar25 = this.b;
                    efz efzVar5 = eeqVar25.a;
                    azrw azrwVar17 = efzVar5.fX;
                    azrw azrwVar18 = efzVar5.hP;
                    ahqr ahqrVar = (ahqr) efzVar5.rx.get();
                    fnv fnvVar = (fnv) eeqVar25.a.vs.get();
                    aibl aiblVar = new aibl(new aibt(azrwVar17, azrwVar18), fnvVar);
                    aiblVar.e(new kvd(new kvf(fnvVar), ahqrVar, fnvVar));
                    return aiblVar;
                case 83:
                    return this.b.e();
                case 84:
                    return this.b.f();
                case 85:
                    eeq eeqVar26 = this.b;
                    ypa ypaVar3 = (ypa) eeqVar26.a.B.get();
                    aiij aiijVar = (aiij) eeqVar26.a.iX.get();
                    aijp aijpVar = (aijp) eeqVar26.a.fT.get();
                    efz efzVar6 = eeqVar26.a;
                    return new agpu(ypaVar3, aiijVar, aijpVar, efzVar6.gH, efzVar6.iP, (Executor) efzVar6.f.get(), (Executor) eeqVar26.a.i.get(), eeqVar26.ar(), (aaea) eeqVar26.a.K.get(), eeqVar26.a.dT(), (shf) eeqVar26.a.g.get(), (agtd) eeqVar26.a.iY.get(), eeqVar26.a.bY(), (agzz) eeqVar26.a.gG.get(), (agzr) eeqVar26.a.gP.get(), (aifk) eeqVar26.a.fS.get());
                case 86:
                    eeq eeqVar27 = this.b;
                    obj = new aiik((aifw) eeqVar27.j.get(), (aigv) eeqVar27.D.get());
                    return obj;
                case 87:
                    eeq eeqVar28 = this.b;
                    return aijd.c((ypa) eeqVar28.a.B.get(), (aarm) eeqVar28.a.er.get(), (ajoy) eeqVar28.a.eV.get(), (afsy) eeqVar28.a.au.get(), (aijp) eeqVar28.a.fT.get(), eeqVar28.ar(), (abdt) eeqVar28.a.lu.get(), (aaea) eeqVar28.a.K.get(), eeqVar28.a.dT());
                case 88:
                    return this.b.w();
                case 89:
                    eeq eeqVar29 = this.b;
                    shf shfVar = (shf) eeqVar29.a.g.get();
                    efz efzVar7 = eeqVar29.a;
                    ajyg ajygVar = new ajyg(efzVar7.eq, efzVar7.au, efzVar7.iP, efzVar7.iR, (byte[]) null);
                    efz efzVar8 = eeqVar29.a;
                    return aiis.c(shfVar, ajygVar, new ajyw(efzVar8.eq, efzVar8.au, efzVar8.kq, (char[]) null, (byte[]) null), (Executor) eeqVar29.a.f.get());
                case 90:
                    return this.b.j();
                case 91:
                    return new aedn();
                case 92:
                    eeq eeqVar30 = this.b;
                    return new jrc((anic) eeqVar30.a.f.get(), eeqVar30.k(), (aijg) eeqVar30.a.vB.get(), (ysy) eeqVar30.a.as.get(), (jqu) eeqVar30.a.vF.get(), eeqVar30.a.F());
                case 93:
                    return this.b.i();
                case 94:
                    return this.b.k();
                case 95:
                    efz efzVar9 = this.b.a;
                    return new kvo(new ogx(efzVar9.vK, efzVar9.vL, efzVar9.K, efzVar9.vM, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null), 1, null, null, null, null);
                case 96:
                    return this.b.as();
                case 97:
                    eeq eeqVar31 = this.b;
                    return new aivo(eeqVar31.M, eeqVar31.O, (zbw) eeqVar31.a.av.get(), (aifs) eeqVar31.j.get(), (aivz) eeqVar31.al.get(), (banw) eeqVar31.a.uN.get());
                case 98:
                    return aipa.b();
                case 99:
                    return this.b.aE();
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 100:
                return aifu.j((aipd) this.b.B.get());
            case 101:
                eeq eeqVar32 = this.b;
                return aiog.d((ainy) eeqVar32.M.get(), (aimb) eeqVar32.A.get());
            case 102:
                eeq eeqVar33 = this.b;
                return new ahsz((aypn) eeqVar33.e.get(), (aypn) eeqVar33.b.get(), (Executor) eeqVar33.a.i.get(), (banw) eeqVar33.am.get(), (banw) eeqVar33.an.get(), (aivl) eeqVar33.M.get());
            case 103:
                return azqy.ap();
            case 104:
                return azqy.ap();
            default:
                throw new AssertionError(i);
        }
    }
}
