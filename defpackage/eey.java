package defpackage;

import android.content.Context;
import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eey implements azrw {
    private final efz a;
    private final eez b;
    private final int c;

    public eey(efz efzVar, eez eezVar, int i) {
        this.a = efzVar;
        this.b = eezVar;
        this.c = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        switch (this.c) {
            case 0:
                eez eezVar = this.b;
                return new kvg(new ajoy(eezVar.a.vu, (byte[]) null, (short[]) null, (byte[]) null, (byte[]) null), new alor(eezVar.b, eezVar.d, eezVar.o, eezVar.p, eezVar.u, eezVar.a.fS), null, null, null, null);
            case 1:
                return azqy.ap();
            case 2:
                return aifu.l((azqv) this.b.c.get());
            case 3:
                return azqv.ap();
            case 4:
                eez eezVar2 = this.b;
                return acqm.d((azqw) eezVar2.e.get(), (azqw) eezVar2.f.get(), (azqw) eezVar2.g.get(), (azqw) eezVar2.h.get(), (azqw) eezVar2.i.get(), (azqw) eezVar2.j.get(), (azqw) eezVar2.k.get(), (azqw) eezVar2.l.get(), (azqw) eezVar2.m.get(), (azqw) eezVar2.n.get());
            case 5:
                return azqy.ap();
            case 6:
                return azqy.ap();
            case 7:
                return azqv.ap();
            case 8:
                return azqy.ap();
            case 9:
                return azqy.ap();
            case 10:
                return azqy.ap();
            case 11:
                return azqv.ap();
            case 12:
                return azqy.ap();
            case 13:
                return azqy.ap();
            case 14:
                return azqy.ap();
            case 15:
                return new aigv((ypa) this.b.a.B.get());
            case 16:
                eez eezVar3 = this.b;
                ypa ypaVar = (ypa) eezVar3.a.B.get();
                axpg a = axqq.a(eezVar3.q);
                Handler handler = (Handler) eezVar3.a.an.get();
                zaw zawVar = (zaw) eezVar3.a.iN.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eezVar3.a.Q.get();
                Executor executor = (Executor) eezVar3.a.i.get();
                aimx aimxVar = (aimx) eezVar3.o.get();
                ahbg d = eezVar3.d();
                aaea aaeaVar = (aaea) eezVar3.a.K.get();
                aadw aadwVar = (aadw) eezVar3.a.D.get();
                return new aiih(ypaVar, a, handler, zawVar, scheduledExecutorService, executor, aimxVar, d, aaeaVar, aadwVar, (aifk) eezVar3.a.fS.get());
            case 17:
                efz efzVar = this.b.a;
                return new kvo(new ogx(efzVar.vK, efzVar.vL, efzVar.K, efzVar.vM, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null), 0, null, null, null, null);
            case 18:
                eez eezVar4 = this.b;
                efz efzVar2 = eezVar4.a;
                return new ahbh(efzVar2.b.a, efzVar2.uJ, (aifs) eezVar4.t.get(), eezVar4.u, eezVar4.ad, (aimb) eezVar4.as.get(), (ajbh) eezVar4.a.uK.get(), (aipd) eezVar4.f202J.get(), (aaea) eezVar4.a.K.get(), axqq.a(eezVar4.a.uS), (aifk) eezVar4.a.fS.get(), null);
            case 19:
                eez eezVar5 = this.b;
                return aiog.b((aifv) eezVar5.r.get(), (aift) eezVar5.s.get());
            case 20:
                Context context = this.b.a.b.a;
                return aifu.h();
            case 21:
                Context context2 = this.b.a.b.a;
                return new aift();
            case 22:
                eez eezVar6 = this.b;
                return new aiow((banw) eezVar6.w.get(), eezVar6.e(), (aiih) eezVar6.u.get(), (aipd) eezVar6.f202J.get(), null);
            case 23:
                eez eezVar7 = this.b;
                Context context3 = eezVar7.a.b.a;
                azqw azqwVar = (azqw) eezVar7.v.get();
                ayaw.k(azqwVar);
                return azqwVar;
            case 24:
                return azqy.ap();
            case 25:
                return new aipd((aimb) this.b.as.get());
            case 26:
                eez eezVar8 = this.b;
                efz efzVar3 = eezVar8.a;
                azrw azrwVar = efzVar3.g;
                azrw azrwVar2 = efzVar3.hC;
                azrw azrwVar3 = efzVar3.gh;
                azrw azrwVar4 = efzVar3.uC;
                azrw azrwVar5 = efzVar3.uD;
                azrw azrwVar6 = eezVar8.E;
                azrw azrwVar7 = eezVar8.t;
                azrw azrwVar8 = eezVar8.p;
                azrw azrwVar9 = efzVar3.gc;
                azrw azrwVar10 = efzVar3.hl;
                azrw azrwVar11 = efzVar3.vl;
                azrw azrwVar12 = efzVar3.vm;
                azrw azrwVar13 = efzVar3.K;
                azrw azrwVar14 = efzVar3.D;
                azrw azrwVar15 = eezVar8.ar;
                azrw azrwVar16 = efzVar3.vf;
                azrw b = axqv.b(eezVar8.B);
                efz efzVar4 = eezVar8.a;
                return aifu.e(new aiwp(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16, b, efzVar4.iU, efzVar4.fS, efzVar4.gD));
            case 27:
                eez eezVar9 = this.b;
                return new aiwl((ypa) eezVar9.a.B.get(), eezVar9.c(), (banw) eezVar9.an.get(), (banw) eezVar9.ao.get(), (banw) eezVar9.ap.get(), (banw) eezVar9.aq.get());
            case 28:
                eez eezVar10 = this.b;
                return aiog.e((airx) eezVar10.A.get(), (aadw) eezVar10.a.D.get());
            case 29:
                eez eezVar11 = this.b;
                return new airx((afgt) eezVar11.a.hI.get(), (aypn) eezVar11.z.get(), (aifv) eezVar11.r.get(), (aypn) eezVar11.a.gf.get(), (shf) eezVar11.a.g.get(), (ajby) eezVar11.a.uE.get(), (aaea) eezVar11.a.K.get());
            case 30:
                return aifu.k((azqv) this.b.y.get());
            case 31:
                return azqv.ap();
            case 32:
                eez eezVar12 = this.b;
                efz efzVar5 = eezVar12.a;
                ajae c = aajo.c(efzVar5.uF, (ScheduledExecutorService) efzVar5.f.get(), eezVar12.am, (aiow) eezVar12.a.uG.get(), (Handler) eezVar12.a.an.get(), (Executor) eezVar12.a.i.get(), (aaea) eezVar12.a.K.get(), (aifk) eezVar12.a.fS.get(), (SecureRandom) eezVar12.a.ea.get(), eezVar12.a.cp(), (acpl) eezVar12.a.aw.get());
                c.z((aypn) eezVar12.z.get(), (aypn) eezVar12.d.get());
                return c;
            case 33:
                eez eezVar13 = this.b;
                return amsx.v((ajai) eezVar13.ah.get(), (ajai) eezVar13.ai.get(), (ajai) eezVar13.aj.get(), (ajai) eezVar13.ak.get(), (ajai) eezVar13.al.get());
            case 34:
                eez eezVar14 = this.b;
                return aifi.d((aiow) eezVar14.a.uG.get(), (Executor) eezVar14.a.i.get(), eezVar14.O, eezVar14.R, (acpl) eezVar14.a.aw.get(), (aifk) eezVar14.a.fS.get());
            case 35:
                eez eezVar15 = this.b;
                efz efzVar6 = eezVar15.a;
                Context context4 = efzVar6.b.a;
                ypa ypaVar2 = (ypa) efzVar6.B.get();
                aemv aemvVar = (aemv) eezVar15.a.hC.get();
                aisf aisfVar = (aisf) eezVar15.D.get();
                aixc aixcVar = (aixc) eezVar15.a.uI.get();
                ahbh ahbhVar = (ahbh) eezVar15.x.get();
                aifs aifsVar = (aifs) eezVar15.t.get();
                aigv aigvVar = (aigv) eezVar15.p.get();
                aiwz aiwzVar = (aiwz) eezVar15.F.get();
                ahaw ahawVar = new ahaw(eezVar15.a.b.a, (aifs) eezVar15.t.get(), (aaoz) eezVar15.a.gc.get(), (Executor) eezVar15.a.f.get(), (banw) eezVar15.H.get());
                aiwg aiwgVar = (aiwg) eezVar15.a.jn.get();
                afqj afqjVar = (afqj) eezVar15.a.hk.get();
                aaea aaeaVar2 = (aaea) eezVar15.a.K.get();
                aife aifeVar = (aife) eezVar15.M.get();
                amsx.w(eezVar15.S.get(), eezVar15.T.get(), eezVar15.U.get(), eezVar15.W.get(), eezVar15.X.get(), eezVar15.Z.get(), eezVar15.aa.get(), eezVar15.ab.get(), eezVar15.ac.get());
                ainy b2 = aiop.b(context4, ypaVar2, aemvVar, aisfVar, aixcVar, ahbhVar, aifsVar, aigvVar, aiwzVar, ahawVar, aiwgVar, afqjVar, aaeaVar2, aifeVar, (aiih) eezVar15.u.get(), (aipn) eezVar15.K.get(), (aipd) eezVar15.f202J.get(), (aiow) eezVar15.ad.get(), (aimx) eezVar15.o.get(), (banw) eezVar15.ae.get(), (banw) eezVar15.af.get(), (aioo) eezVar15.Q.get(), (ahaz) eezVar15.ag.get(), (aifk) eezVar15.a.fS.get());
                b2.v((aiov) eezVar15.N.get(), (aypn) eezVar15.e.get(), (aioo) eezVar15.Q.get(), (aifv) eezVar15.r.get());
                return b2;
            case 36:
                return this.b.b();
            case 37:
                eez eezVar16 = this.b;
                return new aitb((ScheduledExecutorService) eezVar16.a.f.get(), (Executor) eezVar16.a.f.get(), (zjl) eezVar16.a.uH.get());
            case 38:
                return aifu.b((aypn) this.b.d.get());
            case 39:
                return azqy.ap();
            case 40:
                return new aiwz((aiwl) this.b.E.get());
            case 41:
                eez eezVar17 = this.b;
                Context context5 = eezVar17.a.b.a;
                azqw azqwVar2 = (azqw) eezVar17.G.get();
                ayaw.k(azqwVar2);
                return azqwVar2;
            case 42:
                return azqy.ap();
            case 43:
                eez eezVar18 = this.b;
                zgj bY = eezVar18.a.bY();
                aipn aipnVar = (aipn) eezVar18.K.get();
                aypn aypnVar = (aypn) eezVar18.d.get();
                aypn aypnVar2 = (aypn) eezVar18.L.get();
                aiih aiihVar = (aiih) eezVar18.u.get();
                aimx aimxVar2 = (aimx) eezVar18.o.get();
                axqq.a(eezVar18.q);
                return new aife(bY, aipnVar, aypnVar, aypnVar2, aiihVar, aimxVar2);
            case 44:
                eez eezVar19 = this.b;
                return new aipn(eezVar19.a.cp(), (aimx) eezVar19.o.get(), (aild) eezVar19.I.get(), (aipd) eezVar19.f202J.get(), (Executor) eezVar19.a.f.get(), (Executor) eezVar19.a.i.get(), (aaea) eezVar19.a.K.get(), eezVar19.e(), (aiih) eezVar19.u.get(), (aifk) eezVar19.a.fS.get(), eezVar19.d(), null);
            case 45:
                eez eezVar20 = this.b;
                Context context6 = eezVar20.a.b.a;
                aifs aifsVar2 = (aifs) eezVar20.t.get();
                afsy afsyVar = (afsy) eezVar20.a.au.get();
                efz efzVar7 = eezVar20.a;
                ailk a2 = aijm.a(context6, aifsVar2, afsyVar, efzVar7.uZ, (aili) efzVar7.vb.get());
                a2.g();
                return a2;
            case 46:
                return azqy.ap();
            case 47:
                return this.b.a();
            case 48:
                eez eezVar21 = this.b;
                return new aiov((aypn) eezVar21.z.get(), (aypn) eezVar21.d.get(), (aypn) eezVar21.v.get());
            case 49:
                eez eezVar22 = this.b;
                return afqe.m((ainy) eezVar22.O.get(), (aioo) eezVar22.Q.get());
            case 50:
                return aifu.g(this.b.P);
            case 51:
                eez eezVar23 = this.b;
                ahca j = aash.j((afhz) eezVar23.a.gs.get());
                j.b((aypn) eezVar23.c.get(), (aypn) eezVar23.d.get(), (aypn) eezVar23.z.get());
                return j;
            case 52:
                eez eezVar24 = this.b;
                return new aior((aigv) eezVar24.p.get(), (aild) eezVar24.I.get(), (ajby) eezVar24.a.uE.get(), (ypa) eezVar24.a.B.get(), amsx.r(new inj()), (aiov) eezVar24.N.get(), amvs.a);
            case 53:
                eez eezVar25 = this.b;
                aimx aimxVar3 = (aimx) eezVar25.o.get();
                ahbv ahbvVar = (ahbv) eezVar25.a.bd.get();
                Handler handler2 = (Handler) eezVar25.a.an.get();
                axpg a3 = axqq.a(eezVar25.R);
                aypn aypnVar3 = (aypn) eezVar25.i.get();
                aypn aypnVar4 = (aypn) eezVar25.V.get();
                aypn aypnVar5 = (aypn) eezVar25.e.get();
                aiov aiovVar = (aiov) eezVar25.N.get();
                efz efzVar8 = eezVar25.a;
                aimo c2 = acqm.c(aimxVar3, ahbvVar, handler2, a3, aypnVar3, aypnVar4, aypnVar5, aiovVar, efzVar8.vc, efzVar8.vd);
                c2.b();
                return c2;
            case 54:
                return aifu.f((azqw) this.b.k.get());
            case 55:
                eez eezVar26 = this.b;
                efz efzVar9 = eezVar26.a;
                airh z = aiog.z(new ajyw(efzVar9.ay, efzVar9.kY, efzVar9.gE, (byte[]) null, (byte[]) null), (aiov) eezVar26.N.get());
                z.a();
                return z;
            case 56:
                eez eezVar27 = this.b;
                airr c3 = aifi.c(airp.b((shf) eezVar27.a.g.get(), (Executor) eezVar27.a.f.get(), (afhz) eezVar27.a.gs.get(), airj.c((tcu) eezVar27.a.ve.get()), (aaea) eezVar27.a.K.get(), (ScheduledExecutorService) eezVar27.a.f.get()), (aiov) eezVar27.N.get(), (aypn) eezVar27.Y.get(), (aypn) eezVar27.L.get(), (aypn) eezVar27.d.get(), (aypn) eezVar27.z.get());
                c3.a();
                return c3;
            case 57:
                return azqy.ap();
            case 58:
                eez eezVar28 = this.b;
                ajca o = advr.o((aiwx) eezVar28.a.vf.get(), (aift) eezVar28.s.get(), (aemv) eezVar28.a.hC.get());
                o.a();
                return o;
            case 59:
                eez eezVar29 = this.b;
                aidi I = advr.I(new akpq(eezVar29.a.iW, eezVar29.r, (byte[]) null, (char[]) null));
                I.a((aypn) eezVar29.d.get());
                return I;
            case 60:
                eez eezVar30 = this.b;
                return ajgm.b(eezVar30.a.dE(), (aifv) eezVar30.r.get());
            case 61:
                eez eezVar31 = this.b;
                Context context7 = eezVar31.a.b.a;
                azqw azqwVar3 = (azqw) eezVar31.b.get();
                ayaw.k(azqwVar3);
                return azqwVar3;
            case 62:
                eez eezVar32 = this.b;
                Context context8 = eezVar32.a.b.a;
                azqw azqwVar4 = (azqw) eezVar32.C.get();
                ayaw.k(azqwVar4);
                return azqwVar4;
            case 63:
                eez eezVar33 = this.b;
                return afqe.n((adxl) eezVar33.a.gx.get(), (aifs) eezVar33.t.get());
            case 64:
                eez eezVar34 = this.b;
                return ajbg.b((Executor) eezVar34.a.i.get(), eezVar34.R, (aifk) eezVar34.a.fS.get(), (acpl) eezVar34.a.aw.get());
            case 65:
                eez eezVar35 = this.b;
                return advr.n(eezVar35.a.ii(), (aifk) eezVar35.a.fS.get(), (ahbv) eezVar35.a.bd.get());
            case 66:
                return ajbp.b();
            case 67:
                return aizl.b(this.b.a.av());
            case 68:
                eez eezVar36 = this.b;
                Context context9 = eezVar36.a.b.a;
                azqw azqwVar5 = (azqw) eezVar36.Y.get();
                ayaw.k(azqwVar5);
                return azqwVar5;
            case 69:
                eez eezVar37 = this.b;
                Context context10 = eezVar37.a.b.a;
                azqw azqwVar6 = (azqw) eezVar37.L.get();
                ayaw.k(azqwVar6);
                return azqwVar6;
            case 70:
                eez eezVar38 = this.b;
                Context context11 = eezVar38.a.b.a;
                azqv azqvVar = (azqv) eezVar38.y.get();
                ayaw.k(azqvVar);
                return azqvVar;
            case 71:
                eez eezVar39 = this.b;
                Context context12 = eezVar39.a.b.a;
                azqv azqvVar2 = (azqv) eezVar39.c.get();
                ayaw.k(azqvVar2);
                return azqvVar2;
            case 72:
                return new efq(this.a, this.b);
            case 73:
                eez eezVar40 = this.b;
                ypa ypaVar3 = (ypa) eezVar40.a.B.get();
                aiij aiijVar = (aiij) eezVar40.a.iX.get();
                aijp aijpVar = (aijp) eezVar40.a.fT.get();
                Executor executor2 = (Executor) eezVar40.a.f.get();
                Executor executor3 = (Executor) eezVar40.a.i.get();
                amsv j2 = amsx.j(9);
                j2.c((aijo) eezVar40.a.vv.get());
                j2.c((aijo) eezVar40.a.vw.get());
                j2.c(eezVar40.a.br());
                j2.c((aijo) eezVar40.a.vx.get());
                j2.c((aijo) eezVar40.a.vy.get());
                j2.c(eezVar40.a.dh());
                j2.c((aijo) eezVar40.a.fU.get());
                j2.c((aijo) eezVar40.a.vz.get());
                j2.j(aiog.c((aiik) eezVar40.at.get(), (aijo) eezVar40.a.kW.get()));
                return new aihs(ypaVar3, aiijVar, aijpVar, executor2, executor3, j2.g(), eezVar40.a.dT(), (shf) eezVar40.a.g.get(), (aaea) eezVar40.a.K.get(), (aifk) eezVar40.a.fS.get(), eezVar40.a.bY());
            case 74:
                eez eezVar41 = this.b;
                return new aiik((aifw) eezVar41.t.get(), (aigv) eezVar41.p.get());
            case 75:
                return this.b.c();
            case 76:
                eez eezVar42 = this.b;
                aivu b3 = aijh.b((aivo) eezVar42.a.jk.get(), (aifv) eezVar42.a.rX.get(), (aivs) eezVar42.a.vr.get(), (ypa) eezVar42.a.B.get());
                b3.a();
                return b3;
            case 77:
                eez eezVar43 = this.b;
                return new aivo(eezVar43.O, eezVar43.R, (zbw) eezVar43.a.av.get(), (aifs) eezVar43.t.get(), (aivz) eezVar43.au.get(), (banw) eezVar43.a.uN.get());
            case 78:
                return aipa.b();
            case 79:
                return aifu.i((ahca) this.b.T.get());
            case 80:
                return aifu.j((aipd) this.b.f202J.get());
            default:
                eez eezVar44 = this.b;
                return aiog.d((ainy) eezVar44.O.get(), (aimb) eezVar44.as.get());
        }
    }
}
