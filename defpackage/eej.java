package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.engagementpanel.size.EngagementPanelSizeBehavior;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eej implements azrw {
    private final eek a;
    private final int b;

    public eej(eek eekVar, int i) {
        this.a = eekVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        final int i = 1;
        switch (this.b) {
            case 0:
                eek eekVar = this.a;
                return new nwx((nwr) eekVar.u.get(), (EngagementPanelSizeBehavior) eekVar.r.get(), (nvz) eekVar.n.get(), (nwy) eekVar.h.get(), (nxp) eekVar.q.get(), (nxl) eekVar.t.get(), (nxg) eekVar.v.get(), (nxc) eekVar.w.get(), (nwh) eekVar.x.get(), (nyk) eekVar.s.get(), new nvy((nxl) eekVar.t.get()), null);
            case 1:
                eek eekVar2 = this.a;
                return new nwr(eekVar2.c.a(), (nwy) eekVar2.h.get(), (nxl) eekVar2.t.get(), (nxm) eekVar2.p.get());
            case 2:
                eek eekVar3 = this.a;
                nwy nwyVar = eekVar3.a.booleanValue() ? (nwy) eekVar3.d.get() : ((axzf) eekVar3.b.yt.get()).e().booleanValue() ? (nwy) eekVar3.g.get() : (nwy) eekVar3.e.get();
                ayaw.k(nwyVar);
                return nwyVar;
            case 3:
                eek eekVar4 = this.a;
                nuv nuvVar = (nuv) eekVar4.c.hB.get();
                nuu nuuVar = nuu.LANDSCAPE_PLAYER_OVERLAY;
                nxr nxrVar = new nxr();
                ((nsu) eekVar4.c.bA.get()).C(nxrVar);
                return new nyg(nuvVar, amrz.l(nuuVar, nxrVar, nuu.PORTRAIT_WATCH_PANEL, new nxz((oel) eekVar4.c.hA.get(), (gpe) eekVar4.c.by.get())));
            case 4:
                return new nvw((ViewGroup) this.a.c.aG.get());
            case 5:
                eek eekVar5 = this.a;
                return new nyb((ViewGroup) eekVar5.c.aG.get(), (ayqi) eekVar5.b.im.get(), (ntv) eekVar5.f.get());
            case 6:
                return new ntv();
            case 7:
                eek eekVar6 = this.a;
                return new nxl((nxm) eekVar6.p.get(), (nvz) eekVar6.n.get(), (nyk) eekVar6.s.get(), null);
            case 8:
                eek eekVar7 = this.a;
                nxm nxmVar = (eekVar7.a.booleanValue() || ((axzf) eekVar7.b.yt.get()).e().booleanValue()) ? (nxm) eekVar7.o.get() : (nxm) eekVar7.i.get();
                ayaw.k(nxmVar);
                return nxmVar;
            case 9:
                return new nvx((nwy) this.a.h.get());
            case 10:
                eek eekVar8 = this.a;
                return new nxn((nwy) eekVar8.h.get(), (nvz) eekVar8.n.get());
            case 11:
                eek eekVar9 = this.a;
                boolean booleanValue = eekVar9.a.booleanValue();
                azrw azrwVar = eekVar9.k;
                azrw azrwVar2 = eekVar9.l;
                nvz nvzVar = booleanValue ? (nvz) azrwVar.get() : ((axzf) eekVar9.b.yt.get()).e().booleanValue() ? (nvz) eekVar9.m.get() : (nvz) azrwVar2.get();
                ayaw.k(nvzVar);
                return nvzVar;
            case 12:
                eek eekVar10 = this.a;
                return new nyd((gpe) eekVar10.c.by.get(), (ntv) eekVar10.f.get(), (nuv) eekVar10.c.hB.get(), (nuo) eekVar10.j.get());
            case 13:
                return new nuo();
            case 14:
                return new nvt();
            case 15:
                return new nxw((nuo) this.a.j.get());
            case 16:
                eek eekVar11 = this.a;
                return new nyk((nxp) eekVar11.q.get(), (EngagementPanelSizeBehavior) eekVar11.r.get());
            case 17:
                return new nxp(this.a.c.a());
            case 18:
                eek eekVar12 = this.a;
                return new EngagementPanelSizeBehavior(eekVar12.b.b.a, (nuo) eekVar12.j.get(), (nvz) eekVar12.n.get(), (nwy) eekVar12.h.get());
            case 19:
                eek eekVar13 = this.a;
                return new nxg((aioc) eekVar13.c.n.get(), (nuv) eekVar13.c.hB.get(), eekVar13.c.ji(), (fma) eekVar13.b.wk.get(), (gfz) eekVar13.c.aq.get());
            case 20:
                eek eekVar14 = this.a;
                return new nxc((nuo) eekVar14.j.get(), (nvz) eekVar14.n.get());
            case 21:
                eek eekVar15 = this.a;
                return new nwh((nxl) eekVar15.t.get(), (nxm) eekVar15.p.get(), (nvz) eekVar15.n.get());
            case 22:
                return new nql();
            case 23:
                eek eekVar16 = this.a;
                azrw azrwVar3 = eekVar16.G;
                eed eedVar = eekVar16.c;
                azrw azrwVar4 = eedVar.f;
                efz efzVar = eekVar16.b;
                nsj nsjVar = new nsj(azrwVar4, efzVar.lO, eekVar16.H, eedVar.al, eekVar16.I, eekVar16.F, eekVar16.f199J, eekVar16.K, eekVar16.L, eekVar16.M, eedVar.mA, eekVar16.N, efzVar.xp, eedVar.mB, efzVar.B, efzVar.iN, eedVar.I, eekVar16.O, efzVar.D, efzVar.K, eekVar16.P, efzVar.yB, eedVar.aZ, eekVar16.Q);
                eed eedVar2 = eekVar16.c;
                azrw azrwVar5 = eedVar2.f;
                efz efzVar2 = eekVar16.b;
                return new nra(azrwVar3, nsjVar, new agus(azrwVar5, efzVar2.lO, eekVar16.H, eekVar16.F, eekVar16.f199J, eekVar16.K, eekVar16.L, eekVar16.M, eekVar16.N, eedVar2.mB, efzVar2.B, efzVar2.iN, eedVar2.I, eekVar16.O, efzVar2.D, efzVar2.K, eekVar16.P, efzVar2.yB, eedVar2.aZ, eekVar16.Q, eekVar16.R, eekVar16.S, eekVar16.T, null), eekVar16.c.cZ(), (aaue) eekVar16.b.ka.get(), (abal) eekVar16.b.yi.get(), eekVar16.U, eekVar16.V, eekVar16.W, (ammv) eekVar16.X.get(), (axzf) eekVar16.b.yC.get(), eekVar16.Y, null);
            case 24:
                eek eekVar17 = this.a;
                ypa ypaVar = (ypa) eekVar17.b.B.get();
                Context e = eekVar17.c.e();
                azrw azrwVar6 = eekVar17.A;
                azrw azrwVar7 = eekVar17.B;
                azrw azrwVar8 = eekVar17.C;
                eed eedVar3 = eekVar17.c;
                final ntb ntbVar = new ntb(ypaVar, e, new abie(azrwVar6, azrwVar7, azrwVar8, eedVar3.mw, eekVar17.D, eedVar3.mx), (abht) eekVar17.c.cp.get(), (abic) eekVar17.c.it.get(), eekVar17.F, (fln) eekVar17.c.aZ.get(), (fgm) eekVar17.c.bq.get(), (fgq) eekVar17.c.A.get(), (fyx) eekVar17.c.dy.get(), (aaea) eekVar17.b.K.get(), (akcy) eekVar17.c.aj.get(), eekVar17.d(), null, null);
                final aahv aahvVar = (aahv) eekVar17.b.dB.get();
                ntv ntvVar = (ntv) eekVar17.f.get();
                final abjb abjbVar = (abjb) eekVar17.c.fo.get();
                axze axzeVar = (axze) eekVar17.b.yk.get();
                ntbVar.d.a(ntbVar);
                if (evr.Y(ntbVar.f)) {
                    ntbVar.m = ntbVar.g.aj(new ayrv() { // from class: nta
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            aahv aahvVar2 = aahv.this;
                            return aahvVar2.c().h(aalt.f(194, (String) obj), true).L(niy.j).Y(mmt.n).k(awaq.class).ab(ayqr.a());
                        }
                    }).ax(new ayrs() { // from class: nsy
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            if (i == 0) {
                                ntbVar.l = ((Boolean) obj).booleanValue();
                                return;
                            }
                            ntb ntbVar2 = ntbVar;
                            awaq awaqVar = (awaq) obj;
                            if ((awaqVar.b.b & 8) != 0) {
                                ntbVar2.i = ajcq.b(awaqVar.getExtraShortViewCount());
                                ntbVar2.f();
                            }
                        }
                    });
                    fhf a = ntbVar.e.a();
                    if (a != null) {
                        ntbVar.g.c(a.c());
                    }
                }
                ntvVar.b.X(new ayrs() { // from class: nsz
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        abjb abjbVar2 = abjb.this;
                        ammv ammvVar = (ammv) obj;
                        boolean h = ammvVar.h();
                        boolean z = false;
                        if (h && ((nqg) ammvVar.c()).u()) {
                            z = true;
                        }
                        abjbVar2.a(h, z);
                    }
                });
                final int i2 = 0;
                ntbVar.h = axzeVar.a.a.Y(axzb.p).B().ax(new ayrs() { // from class: nsy
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            ntbVar.l = ((Boolean) obj).booleanValue();
                            return;
                        }
                        ntb ntbVar2 = ntbVar;
                        awaq awaqVar = (awaq) obj;
                        if ((awaqVar.b.b & 8) != 0) {
                            ntbVar2.i = ajcq.b(awaqVar.getExtraShortViewCount());
                            ntbVar2.f();
                        }
                    }
                });
                return ntbVar;
            case 25:
                eed eedVar4 = this.a.c;
                return new adyu(eedVar4.f, eedVar4.ms, eedVar4.mu, eedVar4.da);
            case 26:
                eek eekVar18 = this.a;
                eed eedVar5 = eekVar18.c;
                azrw azrwVar9 = eedVar5.f;
                azrw azrwVar10 = eedVar5.cX;
                azrw azrwVar11 = eedVar5.dG;
                azrw azrwVar12 = eedVar5.P;
                azrw azrwVar13 = eedVar5.gl;
                azrw azrwVar14 = eedVar5.hH;
                efz efzVar3 = eekVar18.b;
                return new agcd(azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar13, azrwVar14, efzVar3.dT, efzVar3.xp, eedVar5.aP, eedVar5.mv, null, null);
            case 27:
                return new ajoy(this.a.c.mu, (byte[]) null, (byte[]) null, (short[]) null);
            case 28:
                eek eekVar19 = this.a;
                eed eedVar6 = eekVar19.c;
                azrw azrwVar15 = eedVar6.f;
                efz efzVar4 = eekVar19.b;
                return new agcd(azrwVar15, efzVar4.lE, efzVar4.kp, eedVar6.I, efzVar4.an, eedVar6.cp, eedVar6.ai, efzVar4.xn, efzVar4.dB, eedVar6.co, (byte[]) null);
            case 29:
                eek eekVar20 = this.a;
                Activity a2 = eekVar20.c.a();
                ajvb ajvbVar = (ajvb) eekVar20.c.al.get();
                ajdw jp = eekVar20.c.jp();
                axpg a3 = axqq.a(eekVar20.c.ch);
                ajoy mp = eekVar20.c.mp();
                aahd aahdVar = (aahd) eekVar20.c.I.get();
                ajuw jD = eekVar20.c.jD();
                ajut ajutVar = (ajut) eekVar20.b.lE.get();
                ajjz ajjzVar = (ajjz) eekVar20.b.kp.get();
                akbu akbuVar = (akbu) eekVar20.c.dw.get();
                acqq cO = eekVar20.b.cO();
                ajun ajunVar = (ajun) eekVar20.b.yj.get();
                eed eedVar7 = eekVar20.c;
                azrw azrwVar16 = eedVar7.I;
                efz efzVar5 = eekVar20.b;
                return new nrx(a2, ajvbVar, jp, a3, mp, aahdVar, jD, ajutVar, ajjzVar, akbuVar, cO, ajunVar, new akht(azrwVar16, efzVar5.lE, efzVar5.dB, efzVar5.yz, axqv.b(eedVar7.er), (char[]) null), eekVar20.c.mZ(), (ypa) eekVar20.b.B.get(), (akcp) eekVar20.c.er.get(), (nrk) eekVar20.E.get(), (nwx) eekVar20.y.get(), (axzf) eekVar20.b.yt.get(), null, null, null, null, null, null);
            case 30:
                eek eekVar21 = this.a;
                return new nrk((nql) eekVar21.z.get(), (ntv) eekVar21.f.get(), (aadw) eekVar21.b.D.get());
            case 31:
                eek eekVar22 = this.a;
                eed eedVar8 = eekVar22.c;
                azrw azrwVar17 = eedVar8.il;
                azrw azrwVar18 = eedVar8.iy;
                azrw azrwVar19 = eedVar8.iw;
                azrw azrwVar20 = eedVar8.iM;
                efz efzVar6 = eekVar22.b;
                return new nrp(azrwVar17, azrwVar18, azrwVar19, azrwVar20, efzVar6.B, efzVar6.iN, eedVar8.my, efzVar6.D);
            case 32:
                return this.a.g();
            case 33:
                eek eekVar23 = this.a;
                return new ntj(eekVar23.c.a(), (ajut) eekVar23.b.lE.get());
            case 34:
                eek eekVar24 = this.a;
                eed eedVar9 = eekVar24.c;
                azrw azrwVar21 = eedVar9.f;
                efz efzVar7 = eekVar24.b;
                return new akht(azrwVar21, efzVar7.kp, eedVar9.I, efzVar7.rQ, eedVar9.mz, (int[]) null);
            case 35:
                return this.a.f();
            case 36:
                eek eekVar25 = this.a;
                return new c(eekVar25.c.f, eekVar25.b.kp, (short[]) null);
            case 37:
                return this.a.e();
            case 38:
                eek eekVar26 = this.a;
                return new nrn((aahv) eekVar26.b.dB.get(), (aadw) eekVar26.b.D.get(), (ayqi) eekVar26.b.im.get());
            case 39:
                eek eekVar27 = this.a;
                return new nsq(new nuj(eekVar27.c.a(), (aahv) eekVar27.b.dB.get(), (acra) eekVar27.c.ay.get()), (ntt) eekVar27.c.my.get(), (aadw) eekVar27.b.D.get());
            case 40:
                return this.a.d();
            case 41:
                eek eekVar28 = this.a;
                eed eedVar10 = eekVar28.c;
                azrw azrwVar22 = eedVar10.f;
                efz efzVar8 = eekVar28.b;
                return new oiy(azrwVar22, efzVar8.lO, eedVar10.al, eedVar10.mA, eekVar28.I, efzVar8.xp, (byte[]) null);
            case 42:
                eek eekVar29 = this.a;
                eed eedVar11 = eekVar29.c;
                return new ogx(eedVar11.f, eedVar11.ev, eedVar11.ai, eekVar29.R, (byte[]) null, (byte[]) null);
            case 43:
                return new ajoy(this.a.c.ho, (char[]) null, (char[]) null, (byte[]) null);
            case 44:
                eek eekVar30 = this.a;
                return new npw(eekVar30.c.a(), eekVar30.F, eekVar30.c.a(), (ajjz) eekVar30.b.kp.get(), (aahd) eekVar30.c.I.get(), eekVar30.b.cO(), (afsy) eekVar30.b.au.get(), (aftn) eekVar30.b.uZ.get(), (fyx) eekVar30.c.dy.get(), (aaea) eekVar30.b.K.get());
            case 45:
                eek eekVar31 = this.a;
                return new nul(eekVar31.c.jp(), axqq.a(eekVar31.c.bf), eekVar31.F, (aahv) eekVar31.b.dB.get(), (afsy) eekVar31.b.au.get(), eekVar31.b.cO(), (aaea) eekVar31.b.K.get(), eekVar31.d(), (aioc) eekVar31.c.n.get(), null, null);
            case 46:
                eek eekVar32 = this.a;
                return new nss(eekVar32.c.a(), eekVar32.F, eekVar32.e(), (itm) eekVar32.c.ho.get(), eekVar32.b.cO(), (aaea) eekVar32.b.K.get(), null, null);
            case 47:
                return this.a.a.booleanValue() ? ammv.j(fav.m()) : amlr.a;
            case 48:
                eek eekVar33 = this.a;
                return new nst(eekVar33.c.a(), eekVar33.f(), (acqz) eekVar33.c.P.get(), (aaea) eekVar33.b.K.get(), (ajcx) eekVar33.b.fQ.get(), (aahd) eekVar33.c.I.get(), (fgq) eekVar33.c.A.get(), (nwy) eekVar33.h.get(), (Executor) eekVar33.b.i.get(), null, null);
            case 49:
                eek eekVar34 = this.a;
                return new nrf(eekVar34.Z, eekVar34.aa, (aoae) eekVar34.c.mB.get(), null, null, null, null);
            case 50:
                eek eekVar35 = this.a;
                return new npj(eekVar35.c.a(), (aaue) eekVar35.b.ka.get(), (zaw) eekVar35.b.iN.get(), (ypa) eekVar35.b.B.get(), eekVar35.c.jz(), (ajvb) eekVar35.c.al.get(), eekVar35.c.mo(), (Executor) eekVar35.b.i.get(), eekVar35.b.cO(), (aahd) eekVar35.c.I.get(), eekVar35.g(), (zbi) eekVar35.b.iL.get(), eekVar35.c.mj(), eekVar35.F, (yaq) eekVar35.b.yf.get(), (yap) eekVar35.b.yg.get(), (aaea) eekVar35.b.K.get(), (aypn) eekVar35.b.yh.get(), eekVar35.e(), (etv) eekVar35.b.yB.get(), (aadw) eekVar35.b.D.get(), null, null, null, null, null, null);
            case 51:
                eek eekVar36 = this.a;
                Activity a4 = eekVar36.c.a();
                azrw azrwVar23 = eekVar36.F;
                acqz acqzVar = (acqz) eekVar36.c.P.get();
                zaw zawVar = (zaw) eekVar36.b.iN.get();
                aaxn mU = eekVar36.c.mU();
                ajoy jz = eekVar36.c.jz();
                jas cZ = eekVar36.c.cZ();
                ypa ypaVar2 = (ypa) eekVar36.b.B.get();
                ajxj jF = eekVar36.c.jF();
                azrw azrwVar24 = eekVar36.c.al;
                aoae aoaeVar = (aoae) eekVar36.b.xK.get();
                ci ciVar = (ci) eekVar36.c.s.get();
                aaea aaeaVar = (aaea) eekVar36.b.K.get();
                aypn aypnVar = (aypn) eekVar36.b.yh.get();
                return new nug(a4, azrwVar23, acqzVar, zawVar, mU, jz, cZ, ypaVar2, jF, azrwVar24, aoaeVar, ciVar, aaeaVar, aypnVar, (akcy) eekVar36.c.aj.get(), null, null, null);
            case 52:
                eek eekVar37 = this.a;
                return new nrq((nql) eekVar37.z.get(), (ntv) eekVar37.f.get(), (aadw) eekVar37.b.D.get());
            case 53:
                eek eekVar38 = this.a;
                return eekVar38.a.booleanValue() ? ammv.j((nur) eekVar38.ab.get()) : amlr.a;
            case 54:
                eek eekVar39 = this.a;
                return new nur((ayqi) eekVar39.b.im.get(), (ntv) eekVar39.f.get(), (nuv) eekVar39.c.hB.get(), (aadw) eekVar39.b.D.get(), (aaea) eekVar39.b.K.get());
            case 55:
                eek eekVar40 = this.a;
                return eekVar40.a.booleanValue() ? ammv.j((nub) eekVar40.c.iJ.get()) : amlr.a;
            default:
                return new nri((nwx) this.a.y.get());
        }
    }
}
