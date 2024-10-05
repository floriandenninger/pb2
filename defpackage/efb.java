package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class efb implements azrw {
    private final int a;
    private final ehx b;

    public efb(ehx ehxVar, int i) {
        this.b = ehxVar;
        this.a = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        switch (this.a) {
            case 0:
                ehx ehxVar = this.b;
                afsy afsyVar = (afsy) ehxVar.a.au.get();
                agda agdaVar = (agda) ehxVar.a.lJ.get();
                agaf agafVar = (agaf) ehxVar.a.et.get();
                aftn aftnVar = (aftn) ehxVar.a.uZ.get();
                afxw afxwVar = (afxw) ehxVar.b.get();
                ajut ajutVar = (ajut) ehxVar.a.lE.get();
                efz efzVar = ehxVar.a;
                azrw azrwVar = efzVar.ha;
                aaea aaeaVar = (aaea) efzVar.K.get();
                afzy afzyVar = (afzy) ehxVar.a.lK.get();
                return new fht(afsyVar, agdaVar, agafVar, aftnVar, afxwVar, ajutVar, azrwVar, aaeaVar, afzyVar);
            case 1:
                ehx ehxVar2 = this.b;
                return new afxw((ajoy) ehxVar2.a.mS.get(), (axzf) ehxVar2.a.nw.get(), (ylf) ehxVar2.a.ai.get(), (agcm) ehxVar2.a.hW(), null, null, null, null, null);
            case 2:
                ehx ehxVar3 = this.b;
                efz efzVar2 = ehxVar3.a;
                Context context = efzVar2.b.a;
                zaw zawVar = (zaw) efzVar2.iN.get();
                acqq cO = ehxVar3.a.cO();
                ajut ajutVar2 = (ajut) ehxVar3.a.lE.get();
                ajjs ajjsVar = (ajjs) ehxVar3.a.km.get();
                efz efzVar3 = ehxVar3.a;
                azrw azrwVar2 = efzVar3.by;
                azrw azrwVar3 = efzVar3.xf;
                azrw azrwVar4 = efzVar3.xg;
                azrw azrwVar5 = efzVar3.lI;
                azrw azrwVar6 = efzVar3.B;
                azrw azrwVar7 = efzVar3.fX;
                azrw azrwVar8 = efzVar3.iN;
                azrw azrwVar9 = efzVar3.an;
                azrw azrwVar10 = efzVar3.xh;
                azrw azrwVar11 = efzVar3.xi;
                azrw azrwVar12 = ehxVar3.d;
                azrw azrwVar13 = ehxVar3.e;
                azrw azrwVar14 = ehxVar3.f;
                azrw azrwVar15 = efzVar3.dB;
                azrw azrwVar16 = ehxVar3.g;
                azrwVar2.getClass();
                azrwVar3.getClass();
                azrwVar4.getClass();
                azrwVar5.getClass();
                azrwVar6.getClass();
                azrwVar7.getClass();
                azrwVar8.getClass();
                azrwVar9.getClass();
                azrwVar10.getClass();
                azrwVar11.getClass();
                azrwVar12.getClass();
                azrwVar13.getClass();
                azrwVar14.getClass();
                azrwVar15.getClass();
                azrwVar16.getClass();
                abht df = adyu.df((abge) ehxVar3.h.get(), ehxVar3.a.cO(), ehxVar3.j(), azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, azrwVar15, azrwVar16);
                ajsd ajsdVar = (ajsd) ehxVar3.a.xj.get();
                sqq sqqVar = new sqq((sxt) ehxVar3.v.get());
                ehxVar3.d();
                acdw acdwVar = new acdw(context, zawVar, cO, ajutVar2, ajjsVar, df, ajsdVar, sqqVar, (ajgq) ehxVar3.a.dT.get(), (sxw) ehxVar3.a.xp.get(), ehxVar3.r, ehxVar3.h(), ehxVar3.p(), null, null, null, null);
                acdwVar.a = ehxVar3.w;
                acdwVar.b = ehxVar3.x;
                return acdwVar;
            case 3:
                return new abhf((Handler) this.b.a.an.get());
            case 4:
                efz efzVar4 = this.b.a;
                Context context2 = efzVar4.b.a;
                return new abia((Handler) efzVar4.an.get());
            case 5:
                ehx ehxVar4 = this.b;
                efz efzVar5 = ehxVar4.a;
                Context context3 = efzVar5.b.a;
                Executor executor = (Executor) efzVar5.aA.get();
                return new ajdy(executor, ammv.j((Boolean) ehxVar4.a.ec.get()));
            case 6:
                return this.b.p();
            case 7:
                ehx ehxVar5 = this.b;
                return new abge((aahd) ehxVar5.a.iM.get(), ehxVar5.j());
            case 8:
                ehx ehxVar6 = this.b;
                amrw i = amrz.i(9);
                syk sykVar = (syk) ehxVar6.o.get();
                sww swwVar = (sww) ehxVar6.i.get();
                szl f = ehxVar6.f();
                syd d = ehxVar6.d();
                Map n = ehx.n();
                sxh c = ehxVar6.c();
                ehxVar6.o();
                i.g(axpe.class, spp.k(sykVar, swwVar, f, d, n, c, ammv.j(Boolean.valueOf(ehxVar6.a.jm())), ammv.j(Boolean.valueOf(ehxVar6.a.jp()))));
                i.g(axok.class, spp.a((syk) ehxVar6.o.get()));
                i.g(axoq.class, spp.e((syk) ehxVar6.o.get()));
                i.g(axpb.class, spp.j((syk) ehxVar6.o.get(), (sww) ehxVar6.i.get(), ehxVar6.d()));
                i.g(axot.class, spp.h((syk) ehxVar6.o.get(), (sww) ehxVar6.i.get(), ehxVar6.f(), ehxVar6.d(), ehx.n(), ehxVar6.c()));
                i.g(axol.class, spp.c((syk) ehxVar6.o.get(), (sww) ehxVar6.i.get(), ehxVar6.a(), ammv.j(Boolean.valueOf(ehxVar6.a.jw())), ehxVar6.r, ehxVar6.g()));
                syk sykVar2 = (syk) ehxVar6.o.get();
                sww swwVar2 = (sww) ehxVar6.i.get();
                szl f2 = ehxVar6.f();
                syd d2 = ehxVar6.d();
                ehxVar6.o();
                i.g(axos.class, spp.g(sykVar2, swwVar2, f2, d2, ehx.n()));
                efz efzVar6 = ehxVar6.a;
                sot b = spp.b(ssv.m(efzVar6.b.a, ammv.j((Boolean) efzVar6.ec.get()), ammv.j((Boolean) ehxVar6.a.dQ.get()), ehxVar6.s, ehxVar6.j, ehxVar6.m), (sxd) ehxVar6.a.nx.get(), ammv.j(ehxVar6.a.yn), ehxVar6.d(), ssv.n(amlr.a), axqq.a(ehxVar6.s), (suz) ehxVar6.u.get(), ehxVar6.j, ehxVar6.m, ammv.j((Boolean) ehxVar6.a.dP.get()), amlr.a, ammv.j(Boolean.valueOf(ehxVar6.a.jA())), ammv.j(Boolean.valueOf(ehxVar6.a.jz())), ammv.j((Boolean) ehxVar6.a.dV.get()), ammv.j(Integer.valueOf(ehxVar6.a.b())), ammv.j((Boolean) ehxVar6.a.yp.get()), ammv.j(ehxVar6.a.yq));
                syk sykVar3 = (syk) ehxVar6.o.get();
                ehxVar6.f();
                ehxVar6.d();
                i.g(axop.class, spp.d(b, sykVar3));
                i.g(axow.class, spp.i(ssv.q((syk) ehxVar6.o.get(), ammv.j((ajzi) ehxVar6.a.cK.get()), ehxVar6.d(), (sww) ehxVar6.i.get(), spp.m(amrz.k(axoj.class, spp.l(ehxVar6.a.b.a, ehxVar6.d())), amvo.b, ehxVar6.d()), ammv.j(Boolean.valueOf(ehxVar6.a.ju())), ammv.j(Float.valueOf(ehxVar6.a.a()))), amlr.a));
                return ots.h(i.c(), amvo.b, amvs.a, ehxVar6.d(), ammv.j((Boolean) ehxVar6.a.dQ.get()), ammv.j(Boolean.valueOf(ehxVar6.a.jA())), ammv.j(Boolean.valueOf(ehxVar6.a.a.S())), ammv.j(Boolean.valueOf(ehxVar6.a.a.T())), ammv.j(Boolean.valueOf(ehxVar6.a.jw())));
            case 9:
                ehx ehxVar7 = this.b;
                return ssv.e(stb.b(ehxVar7.m()), stb.a(ehxVar7.m()), ssv.f(amvo.b, amvs.a), ehxVar7.d(), ammv.j((ammy) ehxVar7.a.ym.get()));
            case 10:
                ehx ehxVar8 = this.b;
                amrw i2 = amrz.i(13);
                i2.g(atpk.class, afhy.d((agpd) ehxVar8.a.a.dm.c.la.get()));
                i2.g(awpw.class, new aflv((sxd) ehxVar8.a.nx.get(), 1));
                i2.g(awpm.class, new stx(axqq.a(ehxVar8.i), ehxVar8.k(), 0));
                i2.g(awpn.class, ssv.k(axqq.a(ehxVar8.i), ammv.j(Boolean.valueOf(ehxVar8.a.jv())), ehxVar8.k()));
                i2.g(awpv.class, ssv.t(axqq.a(ehxVar8.i)));
                i2.g(awon.class, ssv.r(axqq.a(ehxVar8.i), ehxVar8.k()));
                i2.g(awqe.class, new sud((sxd) ehxVar8.a.nx.get(), ammv.j((Boolean) ehxVar8.a.dV.get()), 0));
                i2.g(awop.class, new stp((sxd) ehxVar8.a.nx.get(), axqq.a(ehxVar8.i), ammv.j((Boolean) ehxVar8.a.dV.get())));
                i2.g(awqa.class, new sud((sxd) ehxVar8.a.nx.get(), ammv.j((Boolean) ehxVar8.a.dV.get()), 1, null));
                i2.g(awnr.class, ehxVar8.a());
                i2.g(awox.class, ehxVar8.b());
                i2.g(awpo.class, ssv.s(szr.d(), axqq.a(ehxVar8.i)));
                i2.g(awov.class, ssv.j(ehxVar8.e()));
                return spp.s(i2.c(), amvs.a, szr.a(ammv.j((swy) ehxVar8.a.a.aC.get())), ehxVar8.d(), ehxVar8.l.get(), ehxVar8.m, ehxVar8.j, ammv.j((Boolean) ehxVar8.a.a.aD.get()), ammv.j(Boolean.valueOf(ehxVar8.a.a.R())), ammv.j((amml) ehxVar8.a.a.aE.get()), ehxVar8.k(), ehxVar8.n);
            case 11:
                return new svs(this.b.j);
            case 12:
                ehx ehxVar9 = this.b;
                return shr.d(ammv.j((Boolean) ehxVar9.a.dQ.get()), ehxVar9.l(), ehxVar9.k, ehxVar9.a.b.a);
            case 13:
                ehx ehxVar10 = this.b;
                ammv j = ammv.j((Boolean) ehxVar10.a.dQ.get());
                efz efzVar7 = ehxVar10.a;
                return shr.c(j, efzVar7.b.a, ehxVar10.j, ammv.j(efzVar7.az()));
            case 14:
                return spp.t(this.b.d());
            case 15:
                ehx ehxVar11 = this.b;
                return ssv.o(ammv.j((Boolean) ehxVar11.a.dQ.get()), ehxVar11.k);
            case 16:
                return this.b.b();
            case 17:
                return sxg.a;
            case 18:
                return spp.q(amrz.k(IntersectionObserver.class, this.b.q));
            case 19:
                return spp.p(this.b.p);
            case 20:
                return spp.o(this.b.d());
            case 21:
                ehx ehxVar12 = this.b;
                return svf.b(ammv.j((Boolean) ehxVar12.a.dP.get()), ammv.j((Boolean) ehxVar12.a.dQ.get()), ehxVar12.l(), ehxVar12.j, ammv.j((Boolean) ehxVar12.a.dV.get()), ammv.j(Integer.valueOf(ehxVar12.a.b())));
            case 22:
                ehx ehxVar13 = this.b;
                return new suz(ehxVar13.a.b.a, (sus) ehxVar13.t.get());
            case 23:
                return new sus((sxd) this.b.a.nx.get());
            case 24:
                ehx ehxVar14 = this.b;
                efz efzVar8 = ehxVar14.a;
                return new ackf(efzVar8.b.a, (ajjz) efzVar8.kp.get(), (ajut) ehxVar14.a.lE.get(), (aahd) ehxVar14.a.iM.get(), (afsy) ehxVar14.a.au.get(), (ajsd) ehxVar14.a.xj.get(), (abjk) ehxVar14.a.xi.get(), ehxVar14.h(), zim.a(R.style.Themed_YouTube_LiveChat_Dark));
            case 25:
                efz efzVar9 = this.b.a;
                return new ackb(efzVar9.b.a, (ajjz) efzVar9.kp.get());
            case 26:
                return new abtp(this.b.a.b.a);
            case 27:
                return this.b.i();
            case 28:
                return new absm(this.b.a.b.a);
            case 29:
                efz efzVar10 = this.b.a;
                return new advq(efzVar10.by, efzVar10.a.cQ, (byte[]) null, (byte[]) null);
            case 30:
                ehx ehxVar15 = this.b;
                adyu adyuVar = (adyu) ehxVar15.a.a.cR.get();
                efz efzVar11 = ehxVar15.a;
                Context context4 = efzVar11.b.a;
                ysl yslVar = (ysl) efzVar11.fN.get();
                axze am = ehxVar15.a.a.am();
                abrn abrnVar = (abrn) ehxVar15.D.get();
                ScreencastHostService i3 = ehxVar15.i();
                shf shfVar = (shf) ehxVar15.a.g.get();
                shfVar.getClass();
                nbq.d().b();
                return nbq.d().e(adyuVar, am.p(), context4, shfVar, yslVar, am, abrnVar, i3);
            case 31:
                return new abrn(null);
            case 32:
                ehx ehxVar16 = this.b;
                efz efzVar12 = ehxVar16.a;
                Context context5 = efzVar12.b.a;
                acqq cO2 = efzVar12.cO();
                efz efzVar13 = ehxVar16.a;
                efc efcVar = efzVar13.a;
                azrw azrwVar17 = efcVar.aa;
                azrw azrwVar18 = efcVar.ab;
                azrw azrwVar19 = efcVar.ac;
                azrw azrwVar20 = efcVar.ad;
                azrw azrwVar21 = efcVar.ae;
                azrw azrwVar22 = efcVar.af;
                azrw azrwVar23 = efcVar.ag;
                azrw azrwVar24 = efcVar.ah;
                azrw azrwVar25 = efcVar.ai;
                azrw azrwVar26 = efzVar13.wc;
                azrw azrwVar27 = efcVar.aj;
                azrw azrwVar28 = efcVar.ak;
                azrw azrwVar29 = efzVar13.vZ;
                azrw azrwVar30 = efzVar13.an;
                azrw azrwVar31 = efzVar13.i;
                azrw azrwVar32 = efzVar13.f;
                azrw azrwVar33 = efzVar13.g;
                azrwVar17.getClass();
                azrwVar18.getClass();
                azrwVar19.getClass();
                azrwVar20.getClass();
                azrwVar21.getClass();
                azrwVar22.getClass();
                azrwVar23.getClass();
                azrwVar24.getClass();
                azrwVar25.getClass();
                azrwVar26.getClass();
                azrwVar27.getClass();
                azrwVar28.getClass();
                azrwVar29.getClass();
                azrwVar30.getClass();
                azrwVar31.getClass();
                azrwVar32.getClass();
                azrwVar33.getClass();
                return adyu.cK(cO2, azrwVar17, azrwVar18, azrwVar19, azrwVar20, azrwVar21, azrwVar22, azrwVar23, azrwVar24, azrwVar25, azrwVar26, azrwVar27, azrwVar28, azrwVar29, azrwVar30, azrwVar31, azrwVar32, azrwVar33);
            case 33:
                efz efzVar14 = this.b.a;
                abzs h = abzs.h(efzVar14.b.a, (SharedPreferences) efzVar14.z.get());
                ayaw.k(h);
                return h;
            case 34:
                ehx ehxVar17 = this.b;
                return xuq.k(axqq.a(ehxVar17.H), axqq.a(ehxVar17.I), ehxVar17.a.b.a);
            case 35:
                return xuq.i();
            default:
                return xuq.j();
        }
    }
}
