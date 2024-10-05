package defpackage;

import android.content.Context;
import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eev implements azrw {
    private final efz a;
    private final eew b;
    private final int c;

    public eev(efz efzVar, eew eewVar, int i) {
        this.a = efzVar;
        this.b = eewVar;
        this.c = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        switch (this.c) {
            case 0:
                eew eewVar = this.b;
                return new aimc(ahbw.k(wgw.s, (aimb) eewVar.D.get()), new alor(eewVar.af, eewVar.h, eewVar.y, eewVar.G, eewVar.A, eewVar.a.fS), null);
            case 1:
                eew eewVar2 = this.b;
                efz efzVar = eewVar2.a;
                azrw azrwVar = efzVar.g;
                azrw azrwVar2 = efzVar.hC;
                azrw azrwVar3 = efzVar.gh;
                azrw azrwVar4 = efzVar.uC;
                azrw azrwVar5 = efzVar.uD;
                azrw azrwVar6 = eewVar2.H;
                azrw azrwVar7 = eewVar2.m;
                azrw azrwVar8 = eewVar2.G;
                azrw azrwVar9 = efzVar.gc;
                azrw azrwVar10 = efzVar.hl;
                azrw azrwVar11 = efzVar.vl;
                azrw azrwVar12 = efzVar.vm;
                azrw azrwVar13 = efzVar.K;
                azrw azrwVar14 = efzVar.D;
                azrw azrwVar15 = eewVar2.at;
                azrw azrwVar16 = efzVar.vf;
                azrw b = axqv.b(eewVar2.i);
                efz efzVar2 = eewVar2.a;
                return aifu.e(new aiwp(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, b, efzVar2.iU, efzVar2.fS, efzVar2.gD));
            case 2:
                eew eewVar3 = this.b;
                return new aiwl((ypa) eewVar3.a.B.get(), eewVar3.d(), (banw) eewVar3.ap.get(), (banw) eewVar3.aq.get(), (banw) eewVar3.ar.get(), (banw) eewVar3.as.get());
            case 3:
                eew eewVar4 = this.b;
                return aiog.e((airx) eewVar4.e.get(), (aadw) eewVar4.a.D.get());
            case 4:
                eew eewVar5 = this.b;
                return new airx((afgt) eewVar5.a.hI.get(), (aypn) eewVar5.c.get(), (aifv) eewVar5.d.get(), (aypn) eewVar5.a.gf.get(), (shf) eewVar5.a.g.get(), (ajby) eewVar5.a.uE.get(), (aaea) eewVar5.a.K.get());
            case 5:
                return aifu.k((azqv) this.b.b.get());
            case 6:
                return azqv.ap();
            case 7:
                Context context = this.b.a.b.a;
                return aifu.h();
            case 8:
                eew eewVar6 = this.b;
                efz efzVar3 = eewVar6.a;
                ajae c = aajo.c(efzVar3.uF, (ScheduledExecutorService) efzVar3.f.get(), eewVar6.ao, (aiow) eewVar6.a.uG.get(), (Handler) eewVar6.a.an.get(), (Executor) eewVar6.a.i.get(), (aaea) eewVar6.a.K.get(), (aifk) eewVar6.a.fS.get(), (SecureRandom) eewVar6.a.ea.get(), eewVar6.a.cp(), (acpl) eewVar6.a.aw.get());
                c.z((aypn) eewVar6.c.get(), (aypn) eewVar6.h.get());
                return c;
            case 9:
                eew eewVar7 = this.b;
                return amsx.v((ajai) eewVar7.aj.get(), (ajai) eewVar7.ak.get(), (ajai) eewVar7.al.get(), (ajai) eewVar7.am.get(), (ajai) eewVar7.an.get());
            case 10:
                eew eewVar8 = this.b;
                return aifi.d((aiow) eewVar8.a.uG.get(), (Executor) eewVar8.a.i.get(), eewVar8.Q, eewVar8.T, (acpl) eewVar8.a.aw.get(), (aifk) eewVar8.a.fS.get());
            case 11:
                eew eewVar9 = this.b;
                efz efzVar4 = eewVar9.a;
                Context context2 = efzVar4.b.a;
                ypa ypaVar = (ypa) efzVar4.B.get();
                aemv aemvVar = (aemv) eewVar9.a.hC.get();
                aisf aisfVar = (aisf) eewVar9.k.get();
                aixc aixcVar = (aixc) eewVar9.a.uI.get();
                ahbh ahbhVar = (ahbh) eewVar9.z.get();
                aifs aifsVar = (aifs) eewVar9.m.get();
                aigv aigvVar = (aigv) eewVar9.G.get();
                aiwz aiwzVar = (aiwz) eewVar9.I.get();
                ahaw ahawVar = new ahaw(eewVar9.a.b.a, (aifs) eewVar9.m.get(), (aaoz) eewVar9.a.gc.get(), (Executor) eewVar9.a.f.get(), (banw) eewVar9.K.get());
                aiwg aiwgVar = (aiwg) eewVar9.a.jn.get();
                afqj afqjVar = (afqj) eewVar9.a.hk.get();
                aaea aaeaVar = (aaea) eewVar9.a.K.get();
                aife aifeVar = (aife) eewVar9.O.get();
                amsx.w(eewVar9.U.get(), eewVar9.V.get(), eewVar9.W.get(), eewVar9.Y.get(), eewVar9.Z.get(), eewVar9.ab.get(), eewVar9.ac.get(), eewVar9.ad.get(), eewVar9.ae.get());
                ainy b2 = aiop.b(context2, ypaVar, aemvVar, aisfVar, aixcVar, ahbhVar, aifsVar, aigvVar, aiwzVar, ahawVar, aiwgVar, afqjVar, aaeaVar, aifeVar, (aiih) eewVar9.A.get(), (aipn) eewVar9.M.get(), (aipd) eewVar9.E.get(), (aiow) eewVar9.F.get(), (aimx) eewVar9.y.get(), (banw) eewVar9.ag.get(), (banw) eewVar9.ah.get(), (aioo) eewVar9.S.get(), (ahaz) eewVar9.ai.get(), (aifk) eewVar9.a.fS.get());
                b2.v((aiov) eewVar9.P.get(), (aypn) eewVar9.o.get(), (aioo) eewVar9.S.get(), (aifv) eewVar9.d.get());
                return b2;
            case 12:
                eew eewVar10 = this.b;
                ypa ypaVar2 = (ypa) eewVar10.a.B.get();
                efz efzVar5 = eewVar10.a;
                aisf a = aisg.a(ypaVar2, efzVar5.b.a, (aipt) efzVar5.iB.get(), (aitb) eewVar10.f.get(), (ahbv) eewVar10.a.bd.get(), (ScheduledExecutorService) eewVar10.a.f.get(), (String) eewVar10.a.fv.get(), (anhy) eewVar10.a.lq.get(), axqq.a(eewVar10.i), (aifk) eewVar10.a.fS.get());
                a.b((aypn) eewVar10.h.get(), (aypn) eewVar10.c.get(), (aypn) eewVar10.j.get(), (aifk) eewVar10.a.fS.get());
                return a;
            case 13:
                eew eewVar11 = this.b;
                return new aitb((ScheduledExecutorService) eewVar11.a.f.get(), (Executor) eewVar11.a.f.get(), (zjl) eewVar11.a.uH.get());
            case 14:
                return aifu.b((aypn) this.b.h.get());
            case 15:
                return aifu.l((azqv) this.b.g.get());
            case 16:
                return azqv.ap();
            case 17:
                return azqy.ap();
            case 18:
                eew eewVar12 = this.b;
                efz efzVar6 = eewVar12.a;
                return new ahbh(efzVar6.b.a, efzVar6.uJ, (aifs) eewVar12.m.get(), eewVar12.A, eewVar12.F, (aimb) eewVar12.D.get(), (ajbh) eewVar12.a.uK.get(), (aipd) eewVar12.E.get(), (aaea) eewVar12.a.K.get(), axqq.a(eewVar12.a.uS), (aifk) eewVar12.a.fS.get(), null);
            case 19:
                eew eewVar13 = this.b;
                return aiog.b((aifv) eewVar13.d.get(), (aift) eewVar13.l.get());
            case 20:
                Context context3 = this.b.a.b.a;
                return new aift();
            case 21:
                eew eewVar14 = this.b;
                ypa ypaVar3 = (ypa) eewVar14.a.B.get();
                axpg a2 = axqq.a(eewVar14.n);
                Handler handler = (Handler) eewVar14.a.an.get();
                zaw zawVar = (zaw) eewVar14.a.iN.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eewVar14.a.Q.get();
                Executor executor = (Executor) eewVar14.a.i.get();
                aimx aimxVar = (aimx) eewVar14.y.get();
                ahbg e = eewVar14.e();
                aaea aaeaVar2 = (aaea) eewVar14.a.K.get();
                aadw aadwVar = (aadw) eewVar14.a.D.get();
                return new aiih(ypaVar3, a2, handler, zawVar, scheduledExecutorService, executor, aimxVar, e, aaeaVar2, aadwVar, (aifk) eewVar14.a.fS.get());
            case 22:
                return this.b.x();
            case 23:
                eew eewVar15 = this.b;
                return acqm.d((azqw) eewVar15.o.get(), (azqw) eewVar15.p.get(), (azqw) eewVar15.q.get(), (azqw) eewVar15.r.get(), (azqw) eewVar15.s.get(), (azqw) eewVar15.t.get(), (azqw) eewVar15.u.get(), (azqw) eewVar15.v.get(), (azqw) eewVar15.w.get(), (azqw) eewVar15.x.get());
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
                eew eewVar16 = this.b;
                return new aiow((banw) eewVar16.C.get(), eewVar16.f(), (aiih) eewVar16.A.get(), (aipd) eewVar16.E.get(), null);
            case 35:
                eew eewVar17 = this.b;
                Context context4 = eewVar17.a.b.a;
                azqw azqwVar = (azqw) eewVar17.B.get();
                ayaw.k(azqwVar);
                return azqwVar;
            case 36:
                return azqy.ap();
            case 37:
                return new aipd((aimb) this.b.D.get());
            case 38:
                return new aigv((ypa) this.b.a.B.get());
            case 39:
                return new aiwz((aiwl) this.b.H.get());
            case 40:
                eew eewVar18 = this.b;
                Context context5 = eewVar18.a.b.a;
                azqw azqwVar2 = (azqw) eewVar18.f201J.get();
                ayaw.k(azqwVar2);
                return azqwVar2;
            case 41:
                return azqy.ap();
            case 42:
                eew eewVar19 = this.b;
                zgj bY = eewVar19.a.bY();
                aipn aipnVar = (aipn) eewVar19.M.get();
                aypn aypnVar = (aypn) eewVar19.h.get();
                aypn aypnVar2 = (aypn) eewVar19.N.get();
                aiih aiihVar = (aiih) eewVar19.A.get();
                aimx aimxVar2 = (aimx) eewVar19.y.get();
                axqq.a(eewVar19.n);
                return new aife(bY, aipnVar, aypnVar, aypnVar2, aiihVar, aimxVar2);
            case 43:
                eew eewVar20 = this.b;
                return new aipn(eewVar20.a.cp(), (aimx) eewVar20.y.get(), (aild) eewVar20.L.get(), (aipd) eewVar20.E.get(), (Executor) eewVar20.a.f.get(), (Executor) eewVar20.a.i.get(), (aaea) eewVar20.a.K.get(), eewVar20.f(), (aiih) eewVar20.A.get(), (aifk) eewVar20.a.fS.get(), eewVar20.e(), null);
            case 44:
                eew eewVar21 = this.b;
                Context context6 = eewVar21.a.b.a;
                aifs aifsVar2 = (aifs) eewVar21.m.get();
                afsy afsyVar = (afsy) eewVar21.a.au.get();
                efz efzVar7 = eewVar21.a;
                ailk a3 = aijm.a(context6, aifsVar2, afsyVar, efzVar7.uZ, (aili) efzVar7.vb.get());
                a3.g();
                return a3;
            case 45:
                return azqy.ap();
            case 46:
                return this.b.b();
            case 47:
                eew eewVar22 = this.b;
                return new aiov((aypn) eewVar22.c.get(), (aypn) eewVar22.h.get(), (aypn) eewVar22.B.get());
            case 48:
                eew eewVar23 = this.b;
                return afqe.m((ainy) eewVar23.Q.get(), (aioo) eewVar23.S.get());
            case 49:
                return aifu.g(this.b.R);
            case 50:
                eew eewVar24 = this.b;
                ahca j = aash.j((afhz) eewVar24.a.gs.get());
                j.b((aypn) eewVar24.g.get(), (aypn) eewVar24.h.get(), (aypn) eewVar24.c.get());
                return j;
            case 51:
                eew eewVar25 = this.b;
                return new aior((aigv) eewVar25.G.get(), (aild) eewVar25.L.get(), (ajby) eewVar25.a.uE.get(), (ypa) eewVar25.a.B.get(), amsx.r(new inj()), (aiov) eewVar25.P.get(), amvs.a);
            case 52:
                eew eewVar26 = this.b;
                aimx aimxVar3 = (aimx) eewVar26.y.get();
                ahbv ahbvVar = (ahbv) eewVar26.a.bd.get();
                Handler handler2 = (Handler) eewVar26.a.an.get();
                axpg a4 = axqq.a(eewVar26.T);
                aypn aypnVar3 = (aypn) eewVar26.s.get();
                aypn aypnVar4 = (aypn) eewVar26.X.get();
                aypn aypnVar5 = (aypn) eewVar26.o.get();
                aiov aiovVar = (aiov) eewVar26.P.get();
                efz efzVar8 = eewVar26.a;
                aimo c2 = acqm.c(aimxVar3, ahbvVar, handler2, a4, aypnVar3, aypnVar4, aypnVar5, aiovVar, efzVar8.vc, efzVar8.vd);
                c2.b();
                return c2;
            case 53:
                return aifu.f((azqw) this.b.u.get());
            case 54:
                eew eewVar27 = this.b;
                efz efzVar9 = eewVar27.a;
                airh z = aiog.z(new ajyw(efzVar9.ay, efzVar9.kY, efzVar9.gE, (byte[]) null, (byte[]) null), (aiov) eewVar27.P.get());
                z.a();
                return z;
            case 55:
                eew eewVar28 = this.b;
                airr c3 = aifi.c(airp.b((shf) eewVar28.a.g.get(), (Executor) eewVar28.a.f.get(), (afhz) eewVar28.a.gs.get(), airj.c((tcu) eewVar28.a.ve.get()), (aaea) eewVar28.a.K.get(), (ScheduledExecutorService) eewVar28.a.f.get()), (aiov) eewVar28.P.get(), (aypn) eewVar28.aa.get(), (aypn) eewVar28.N.get(), (aypn) eewVar28.h.get(), (aypn) eewVar28.c.get());
                c3.a();
                return c3;
            case 56:
                return azqy.ap();
            case 57:
                eew eewVar29 = this.b;
                ajca o = advr.o((aiwx) eewVar29.a.vf.get(), (aift) eewVar29.l.get(), (aemv) eewVar29.a.hC.get());
                o.a();
                return o;
            case 58:
                eew eewVar30 = this.b;
                aidi I = advr.I(new akpq(eewVar30.a.iW, eewVar30.d, (byte[]) null, (char[]) null));
                I.a((aypn) eewVar30.h.get());
                return I;
            case 59:
                eew eewVar31 = this.b;
                return ajgm.b(eewVar31.a.dE(), (aifv) eewVar31.d.get());
            case 60:
                eew eewVar32 = this.b;
                Context context7 = eewVar32.a.b.a;
                azqw azqwVar3 = (azqw) eewVar32.af.get();
                ayaw.k(azqwVar3);
                return azqwVar3;
            case 61:
                return azqy.ap();
            case 62:
                eew eewVar33 = this.b;
                Context context8 = eewVar33.a.b.a;
                azqw azqwVar4 = (azqw) eewVar33.j.get();
                ayaw.k(azqwVar4);
                return azqwVar4;
            case 63:
                return this.b.a();
            case 64:
                eew eewVar34 = this.b;
                return ajbg.b((Executor) eewVar34.a.i.get(), eewVar34.T, (aifk) eewVar34.a.fS.get(), (acpl) eewVar34.a.aw.get());
            case 65:
                eew eewVar35 = this.b;
                return advr.n(eewVar35.a.ii(), (aifk) eewVar35.a.fS.get(), (ahbv) eewVar35.a.bd.get());
            case 66:
                return ajbp.b();
            case 67:
                return aizl.b(this.b.a.av());
            case 68:
                eew eewVar36 = this.b;
                Context context9 = eewVar36.a.b.a;
                azqw azqwVar5 = (azqw) eewVar36.aa.get();
                ayaw.k(azqwVar5);
                return azqwVar5;
            case 69:
                eew eewVar37 = this.b;
                Context context10 = eewVar37.a.b.a;
                azqw azqwVar6 = (azqw) eewVar37.N.get();
                ayaw.k(azqwVar6);
                return azqwVar6;
            case 70:
                eew eewVar38 = this.b;
                Context context11 = eewVar38.a.b.a;
                azqv azqvVar = (azqv) eewVar38.b.get();
                ayaw.k(azqvVar);
                return azqvVar;
            case 71:
                eew eewVar39 = this.b;
                Context context12 = eewVar39.a.b.a;
                azqv azqvVar2 = (azqv) eewVar39.g.get();
                ayaw.k(azqvVar2);
                return azqvVar2;
            case 72:
                return new eft(this.a, this.b);
            case 73:
                eew eewVar40 = this.b;
                return new aihs((ypa) eewVar40.a.B.get(), (aiij) eewVar40.a.iX.get(), (aijp) eewVar40.a.fT.get(), (Executor) eewVar40.a.f.get(), (Executor) eewVar40.a.i.get(), eewVar40.c(), eewVar40.a.dT(), (shf) eewVar40.a.g.get(), (aaea) eewVar40.a.K.get(), (aifk) eewVar40.a.fS.get(), eewVar40.a.bY());
            case 74:
                eew eewVar41 = this.b;
                return new aiik((aifw) eewVar41.m.get(), (aigv) eewVar41.G.get());
            case 75:
                return this.b.d();
            case 76:
                eew eewVar42 = this.b;
                aivu b3 = aijh.b((aivo) eewVar42.a.jk.get(), (aifv) eewVar42.a.rX.get(), (aivs) eewVar42.a.vr.get(), (ypa) eewVar42.a.B.get());
                b3.a();
                return b3;
            case 77:
                return aifu.c((shf) this.b.a.g.get());
            case 78:
                eew eewVar43 = this.b;
                return new aivo(eewVar43.Q, eewVar43.T, (zbw) eewVar43.a.av.get(), (aifs) eewVar43.m.get(), (aivz) eewVar43.au.get(), (banw) eewVar43.a.uN.get());
            case 79:
                return aipa.b();
            case 80:
                return aifu.i((ahca) this.b.V.get());
            case 81:
                return aifu.j((aipd) this.b.E.get());
            default:
                eew eewVar44 = this.b;
                return aiog.d((ainy) eewVar44.Q.get(), (aimb) eewVar44.D.get());
        }
    }
}
