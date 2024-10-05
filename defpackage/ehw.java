package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchResultsController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxAssistedTvSignInDialogFragmentController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import defpackage.aok;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehw implements axpm, axqf, axqj {
    public final azrw A;
    public final azrw B;
    public final azrw C;
    public final azrw D;
    public final azrw E;
    public final azrw F;
    public final azrw G;
    public final azrw H;
    public final azrw I;

    /* renamed from: J, reason: collision with root package name */
    public final azrw f212J;
    public final azrw K;
    public final azrw L;
    public final azrw M;
    public final azrw N;
    public final azrw O;
    public final azrw P;
    public final azrw Q;
    public final azrw R;
    public final azrw S;
    public final azrw T;
    public final azrw U;
    public final azrw V;
    public final azrw W;
    public final azrw X;
    public final azrw Y;
    public final azrw Z;
    public final ce a;
    public final azrw aA;
    public final azrw aB;
    public final azrw aC;
    public final azrw aD;
    public final azrw aE;
    public final azrw aF;
    public final azrw aG;
    public final azrw aH;
    public final azrw aI;
    public final azrw aJ;
    public final azrw aK;
    public final azrw aL;
    public final azrw aM;
    public final azrw aN;
    public final azrw aO;
    public final azrw aP;
    public final azrw aQ;
    public final azrw aR;
    public final ehu aS;
    private final azrw aT;
    private final azrw aU;
    private final azrw aV;
    private final azrw aW;
    private final azrw aX;
    private final azrw aY;
    private final azrw aZ;
    public final azrw aa;
    public final azrw ab;
    public final azrw ac;
    public final azrw ad;
    public final azrw ae;
    public final azrw af;
    public final azrw ag;
    public final azrw ah;
    public final azrw ai;
    public final azrw aj;
    public final azrw ak;
    public final azrw al;
    public final azrw am;
    public final azrw an;
    public final azrw ao;
    public final azrw ap;
    public final azrw aq;
    public final azrw ar;
    public final azrw as;
    public final azrw at;
    public final azrw au;
    public final azrw av;
    public final azrw aw;
    public final azrw ax;
    public final azrw ay;
    public final azrw az;
    public final efz b;
    private final azrw ba;
    private final azrw bb;
    private final azrw bc;
    private final azrw bd;
    private final azrw be;
    private final azrw bf;
    private final azrw bg;
    private final azrw bh;
    private final azrw bi;
    private final azrw bj;
    private final azrw bk;
    private final azrw bl;
    private final azrw bm;
    private final azrw bn;
    private final azrw bo;
    private final azrw bp;
    private final ehw bq;
    public final eed c;
    public final azrw d;
    public final azrw e;
    public final azrw f;
    public final azrw g;
    public final azrw h;
    public final azrw i;
    public final azrw j;
    public final azrw k;
    public final azrw l;
    public final azrw m;
    public final azrw n;
    public final azrw o;
    public final azrw p;
    public final azrw q;
    public final azrw r;
    public final azrw s;
    public final azrw t;
    public final azrw u;
    public final azrw v;
    public final azrw w;
    public final azrw x;
    public final azrw y;
    public final azrw z;

    public ehw() {
    }

    public ehw(efz efzVar, ehu ehuVar, eed eedVar, ce ceVar) {
        this();
        this.bq = this;
        this.b = efzVar;
        this.aS = ehuVar;
        this.c = eedVar;
        this.a = ceVar;
        this.d = new een(this, 0);
        this.e = new een(this, 1);
        this.f = new een(this, 2);
        this.g = axqq.b(new een(this, 4));
        this.h = axqq.b(new een(this, 3));
        this.i = axqq.b(new een(this, 5));
        this.j = axqq.b(new een(this, 6));
        this.k = axqq.b(new een(this, 7));
        axqp axqpVar = new axqp();
        this.l = axqpVar;
        this.m = new een(this, 9);
        this.n = axqx.a(new een(this, 11));
        this.o = axqx.a(new een(this, 12));
        this.aT = axqq.b(new een(this, 14));
        this.aU = axqq.b(new een(this, 15));
        this.p = axqq.b(new een(this, 13));
        this.q = axqq.b(new een(this, 16));
        axqp axqpVar2 = new axqp();
        this.r = axqpVar2;
        this.s = axqq.b(new een(this, 19));
        this.t = new een(this, 18);
        axqp.a(axqpVar2, axqq.b(new een(this, 17)));
        this.u = new een(this, 20);
        this.aV = new een(this, 10);
        axqp.a(axqpVar, axqq.b(new een(this, 8)));
        this.v = axqq.b(new een(this, 21));
        this.w = axqq.b(new een(this, 22));
        this.x = axqq.b(new een(this, 23));
        this.y = axqq.b(new een(this, 24));
        this.z = axqq.b(new een(this, 25));
        this.A = axqq.b(new een(this, 26));
        this.B = axqq.b(new een(this, 27));
        this.C = axqq.b(new een(this, 28));
        this.D = axqq.b(new een(this, 30));
        this.E = axqq.b(new een(this, 32));
        this.F = axqq.b(new een(this, 31));
        this.G = axqq.b(new een(this, 33));
        axqp axqpVar3 = new axqp();
        this.H = axqpVar3;
        this.I = axqq.b(new een(this, 35));
        this.f212J = new een(this, 34);
        this.K = new een(this, 36);
        this.L = axqq.b(new een(this, 37));
        axqp.a(axqpVar3, axqq.b(new een(this, 29)));
        this.M = new een(this, 38);
        this.N = new een(this, 39);
        this.O = new een(this, 40);
        this.P = new een(this, 42);
        this.Q = new een(this, 44);
        this.R = new een(this, 43);
        this.S = axqq.b(new een(this, 45));
        this.T = new een(this, 41);
        this.U = axqq.b(new een(this, 46));
        this.V = axqq.b(new een(this, 47));
        this.W = new een(this, 48);
        this.X = new een(this, 49);
        this.aW = new een(this, 51);
        this.aX = new een(this, 50);
        this.aY = axqq.b(new een(this, 52));
        this.Y = axqq.b(new een(this, 53));
        this.aZ = new een(this, 54);
        this.Z = axqq.b(new een(this, 55));
        this.ba = axqq.b(new een(this, 57));
        this.aa = axqq.b(new een(this, 56));
        this.ab = axqq.b(new een(this, 58));
        een eenVar = new een(this, 59);
        this.bb = eenVar;
        this.ac = axqq.b(eenVar);
        this.ad = new een(this, 60);
        this.ae = axqq.b(new een(this, 61));
        this.af = axqq.b(new een(this, 62));
        this.ag = new een(this, 63);
        this.ah = new een(this, 64);
        this.ai = new een(this, 65);
        this.bc = axqq.b(new een(this, 67));
        this.bd = axqq.b(new een(this, 70));
        this.be = axqq.b(new een(this, 69));
        this.bf = axqq.b(new een(this, 75));
        this.aj = axqq.b(new een(this, 74));
        this.ak = axqx.a(new een(this, 76));
        this.bg = axqq.b(new een(this, 73));
        axqp axqpVar4 = new axqp();
        this.al = axqpVar4;
        this.am = axqq.b(new een(this, 72));
        this.bh = axqq.b(new een(this, 71));
        this.bi = axqq.b(new een(this, 68));
        axqp.a(axqpVar4, axqq.b(new een(this, 66)));
        this.bj = new een(this, 78);
        this.bk = new een(this, 79);
        this.an = new een(this, 81);
        this.bl = new een(this, 80);
        this.bm = new een(this, 82);
        this.ao = new een(this, 77);
        this.ap = new een(this, 83);
        this.aq = new een(this, 84);
        this.ar = new een(this, 85);
        this.as = new een(this, 86);
        this.at = axqq.b(new een(this, 87));
        this.au = axqq.b(new een(this, 88));
        this.av = axqq.b(new een(this, 89));
        this.aw = axqq.b(new een(this, 90));
        this.ax = axqq.b(new een(this, 91));
        this.ay = new een(this, 92);
        this.az = new een(this, 93);
        this.aA = new een(this, 94);
        this.aB = new een(this, 95);
        this.aC = new een(this, 96);
        this.bn = new een(this, 98);
        this.aD = new een(this, 97);
        this.aE = new een(this, 99);
        this.aF = new een(this, 100);
        this.bo = new een(this, 101);
        this.aG = new een(this, 102);
        this.aH = new een(this, 103);
        this.bp = new een(this, 104);
        this.aI = new een(this, 105);
        this.aJ = axqq.b(new een(this, 107));
        this.aK = axqq.b(new een(this, 106));
        this.aL = axqq.b(new een(this, 109));
        this.aM = axqq.b(new een(this, 108));
        this.aN = new een(this, 110);
        this.aO = new een(this, 111);
        this.aP = axqq.b(new een(this, 112));
        this.aQ = axqq.b(new een(this, 113));
        this.aR = axqq.b(new een(this, 114));
    }

    public final icq A() {
        icq icqVar = (icq) gfw.B(this.a, icq.class);
        ayaw.k(icqVar);
        return icqVar;
    }

    public final ida B() {
        return new ida(this.a, (zry) this.aT.get(), new idm(this.c.a()), new hbg(), (icz) this.aU.get(), this.b.cO(), (aaea) this.b.K.get(), new idj((acqz) this.c.P.get(), new idf(this.c.a()), new idn(this.c.a())), (akcy) this.c.aj.get(), (vgz) this.b.a.aq.get(), this.c.mW(), null, null, null, null);
    }

    public final ivj C() {
        ivj ivjVar = (ivj) this.a;
        ayaw.k(ivjVar);
        return ivjVar;
    }

    public final MdxAssistedTvSignInDialogFragmentController D() {
        return new MdxAssistedTvSignInDialogFragmentController((ci) this.c.s.get(), (adsw) this.c.jS.get(), (adsq) this.b.a.bo.get(), (SharedPreferences) this.b.z.get(), (acun) this.b.iu.get(), (shf) this.b.g.get());
    }

    public final jei E() {
        axpg a = axqq.a(this.aZ);
        axpg a2 = axqq.a(this.c.A);
        axpg a3 = axqq.a(this.c.mV);
        axpg a4 = axqq.a(this.c.j);
        axpg a5 = axqq.a(this.b.ja);
        axpg a6 = axqq.a(this.b.a.A);
        axpg a7 = axqq.a(this.c.ec);
        efz efzVar = this.b;
        return new jei(a, a2, a3, a4, a5, a6, a7, efzVar.a.cs, axqq.a(efzVar.fq), (Executor) this.b.f.get(), (acue) this.b.mj.get());
    }

    public final jey F() {
        Activity a = this.c.a();
        efz efzVar = this.b;
        azrw azrwVar = efzVar.jV;
        return new jey(a, azrwVar);
    }

    public final jff G() {
        return new jff((adlt) this.b.ja.get(), this.c.ji(), this.c.jg(), (ahxe) this.bd.get());
    }

    public final jfk H() {
        return new jfk((aahd) this.c.I.get(), (aagx) this.bg.get(), (adlt) this.b.ja.get(), axqq.a(this.al));
    }

    public final jfp I() {
        Activity a = this.c.a();
        ypa ypaVar = (ypa) this.b.B.get();
        adlt adltVar = (adlt) this.b.ja.get();
        azrw azrwVar = this.bc;
        jfg jfgVar = (jfg) this.bi.get();
        jgf jgfVar = (jgf) this.c.af.get();
        nnf nnfVar = (nnf) this.c.nm.get();
        fzi fziVar = (fzi) this.c.ex.get();
        jgg jggVar = (jgg) this.c.nn.get();
        jfq jfqVar = (jfq) this.c.iZ.get();
        gje gjeVar = (gje) this.c.l.get();
        oja ojaVar = (oja) this.c.aI.get();
        Activity a2 = this.c.a();
        efz efzVar = this.b;
        azrw azrwVar2 = efzVar.jV;
        adlt adltVar2 = (adlt) efzVar.ja.get();
        eed eedVar = this.c;
        return new jfp(a, ypaVar, adltVar, azrwVar, jfgVar, jgfVar, nnfVar, fziVar, jggVar, jfqVar, gjeVar, ojaVar, new oau(a2, azrwVar2, adltVar2, eedVar.o, (nne) eedVar.af.get(), (aadw) this.b.D.get()), (obr) this.c.r.get(), this.c.hz);
    }

    public final jsg J() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        azrw azrwVar2 = eedVar.jj;
        efz efzVar = this.b;
        return new jsg(azrwVar, azrwVar2, efzVar.B, efzVar.gH, efzVar.gq, efzVar.kp, eedVar.mc, efzVar.a.bS, eedVar.I, efzVar.nM, eedVar.lG, efzVar.ni, efzVar.g, efzVar.nj, efzVar.kK, efzVar.ku);
    }

    public final jzp K() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.dG;
        azrw azrwVar2 = eedVar.hG;
        efz efzVar = this.b;
        efc efcVar = efzVar.a;
        return new jzp(azrwVar, azrwVar2, efcVar.cv, efzVar.B, efzVar.iN, eedVar.iq, eedVar.il, efzVar.K, efzVar.yh, efcVar.bX);
    }

    public final kcq L() {
        return new kcq((fgq) this.c.A.get(), (aivq) this.b.js.get());
    }

    public final mad M() {
        return new mad((aahd) this.c.I.get(), (mda) this.b.xB.get(), (acqz) this.c.P.get());
    }

    public final mbn N() {
        Activity a = this.c.a();
        ivj ivjVar = (ivj) this.ba.get();
        LinearLayout linearLayout = (LinearLayout) this.c.eA.get();
        ajvb ajvbVar = (ajvb) this.c.al.get();
        ajoy jz = this.c.jz();
        aahd aahdVar = (aahd) this.c.I.get();
        azrw azrwVar = this.c.nf;
        return new mcd(a, linearLayout, ajvbVar, aahdVar, jz, (ajpt) azrwVar.get(), whu.T(ivjVar.aN()), (aadw) this.b.D.get(), axqq.a(this.c.ch), this.c.jp(), (LayerableFilterEntityController) this.c.jP.get());
    }

    public final mdt O() {
        return new mdt(this.c.jy(), (ViewGroup) this.c.ni.get());
    }

    public final mky P() {
        return new mky(this.c.a(), (fzb) this.c.et.get(), (ajut) this.c.dB.get(), this.c.jB(), this.c.jG(), (ajjz) this.b.kp.get(), (gni) this.b.eA.get());
    }

    public final mmn Q() {
        Activity a = this.c.a();
        ajjz ajjzVar = (ajjz) this.b.kp.get();
        ajut ajutVar = (ajut) this.b.lE.get();
        aahd aahdVar = (aahd) this.c.I.get();
        gma bc = this.c.bc();
        return new mmn(a, ajjzVar, ajutVar, aahdVar, bc, (akbu) this.c.dw.get(), (fhz) this.c.lC.get(), (akbd) this.c.lD.get(), aE(), (acqz) this.c.P.get(), null);
    }

    public final nmc R() {
        efz efzVar = this.b;
        azrw azrwVar = efzVar.ig;
        eed eedVar = this.c;
        return new nmc(azrwVar, eedVar.ae, efzVar.B, eedVar.mT, eedVar.I, efzVar.lO, efzVar.a.F, efzVar.wp, efzVar.xB);
    }

    public final PlayerCollapsedStateMonitor S() {
        eed eedVar = this.c;
        return new PlayerCollapsedStateMonitor(eedVar.hz, (CreatorEndscreenOverlayPresenter) eedVar.fq.get(), (ahvc) this.c.bC.get(), (ypa) this.b.B.get(), (aioc) this.c.n.get(), (aadw) this.b.D.get());
    }

    public final wft T() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        azrw azrwVar2 = this.bp;
        efz efzVar = this.b;
        azrw azrwVar3 = efzVar.au;
        return new wft(azrwVar, azrwVar2, azrwVar3, azrwVar3, efzVar.kp, efzVar.a.cL, azrwVar, eedVar.cu, eedVar.I, efzVar.an);
    }

    public final wgj U() {
        wgg wggVar = new wgg();
        efz efzVar = this.b;
        wggVar.a = efzVar.b.a;
        wggVar.b = (wco) efzVar.dc.get();
        wggVar.c = (zfm) this.b.dw.get();
        wggVar.d = (ysl) this.b.fN.get();
        return new wgj(wggVar, (Executor) this.b.f.get());
    }

    public final whp V() {
        whp q = szr.q(this.c.a(), (aftn) this.b.uZ.get(), (ajjz) this.b.kp.get(), (ysy) this.b.as.get(), (afsy) this.b.au.get(), this.bn, (zbi) this.b.iL.get(), (wkk) this.b.da.get(), (wiz) this.b.mr.get(), (aatg) this.b.mq.get(), this.c.ml(), (ajut) this.b.lE.get(), (acqz) this.c.P.get());
        q.j = (ajcx) this.b.fQ.get();
        return q;
    }

    public final why W() {
        return szr.h(this.c.a(), (ajjz) this.b.kp.get(), (ajut) this.b.lE.get(), (aahd) this.c.I.get(), (acqz) this.c.P.get());
    }

    public final wlu X() {
        return szr.i(this.c.a(), this.c.kN());
    }

    public final yqw Y() {
        aof lifecycle = this.a.getLifecycle();
        ayaw.k(lifecycle);
        return new yqw(lifecycle);
    }

    public final absm Z() {
        return new absm(this.c.a());
    }

    public final aoj a() {
        azrw azrwVar = this.b.D;
        aoj aojVar = (SfvAudioItemPlaybackController) this.c.hd.get();
        aujl aujlVar = ((aadw) azrwVar.get()).b().E;
        if (aujlVar == null) {
            aujlVar = aujl.a;
        }
        if (!aujlVar.c) {
            aojVar = new any() { // from class: com.google.android.apps.youtube.app.fragments.BrowseFragmentModule$1
                @Override // defpackage.aoa
                public final /* synthetic */ void lc(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void lg(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void lh(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void nu(aok aokVar) {
                }

                @Override // defpackage.aoa
                public final /* synthetic */ void nv(aok aokVar) {
                }

                @Override // defpackage.any, defpackage.aoa
                public final /* synthetic */ void ot(aok aokVar) {
                }
            };
        }
        ayaw.k(aojVar);
        return aojVar;
    }

    public final abwz aA() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        efz efzVar = this.b;
        azrw azrwVar2 = efzVar.iN;
        azrw azrwVar3 = eedVar.aw;
        azrw azrwVar4 = eedVar.dP;
        azrw azrwVar5 = eedVar.hj;
        azrw azrwVar6 = eedVar.hC;
        azrw azrwVar7 = eedVar.P;
        azrw azrwVar8 = eedVar.er;
        azrw azrwVar9 = efzVar.xC;
        azrw azrwVar10 = eedVar.I;
        azrw azrwVar11 = eedVar.au;
        azrw azrwVar12 = eedVar.af;
        return new abwz(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5, azrwVar6, azrwVar7, azrwVar8, azrwVar9, azrwVar10, azrwVar11, azrwVar12, azrwVar12, efzVar.a.as, eedVar.mW, null, null);
    }

    public final nmc aB() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        efz efzVar = this.b;
        return new nmc(azrwVar, efzVar.kp, eedVar.lB, eedVar.gr, this.bl, this.bm, efzVar.gH, efzVar.K, eedVar.cu, (char[]) null);
    }

    public final nrp aC() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.al;
        efz efzVar = this.b;
        return new nrp(azrwVar, efzVar.B, efzVar.iN, eedVar.df, efzVar.g, eedVar.iv, eedVar.iD, eedVar.iu, (short[]) null);
    }

    public final oiy aD() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.I;
        azrw azrwVar2 = eedVar.mS;
        azrw azrwVar3 = this.aX;
        efz efzVar = this.b;
        return new oiy(azrwVar, azrwVar2, azrwVar3, efzVar.mM, efzVar.i, eedVar.hs, (char[]) null);
    }

    public final akht aE() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.I;
        efz efzVar = this.b;
        return new akht(azrwVar, efzVar.lE, efzVar.dB, efzVar.yz, axqv.b(eedVar.er), (char[]) null);
    }

    public final jlb aF() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.s;
        azrw azrwVar2 = eedVar.gP;
        azrw azrwVar3 = eedVar.hR;
        efz efzVar = this.b;
        return new jlb(azrwVar, azrwVar2, azrwVar3, efzVar.kp, eedVar.mE, efzVar.a.S, (byte[]) null, (char[]) null);
    }

    public final agcm aG() {
        return new agcm((vgz) this.b.a.aq.get());
    }

    public final ohg aH() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.I;
        azrw azrwVar2 = eedVar.mS;
        azrw azrwVar3 = this.aX;
        efz efzVar = this.b;
        return new ohg(azrwVar, azrwVar2, azrwVar3, efzVar.mM, efzVar.i, eedVar.hs, eedVar.bf, (char[]) null);
    }

    public final trp aI() {
        return new trp(this.c.a(), (int[]) null);
    }

    public final ogx aJ() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.dw;
        efz efzVar = this.b;
        return new ogx(azrwVar, efzVar.lE, efzVar.lS, eedVar.ai, (char[]) null);
    }

    public final ogx aK() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        azrw azrwVar2 = eedVar.I;
        efz efzVar = this.b;
        return new ogx(azrwVar, azrwVar2, efzVar.B, efzVar.lE, (byte[]) null, (char[]) null);
    }

    public final akht aL() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.I;
        efz efzVar = this.b;
        return new akht(azrwVar, efzVar.B, efzVar.xB, eedVar.mS, this.aX, (byte[]) null, (int[]) null);
    }

    public final akht aM() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.I;
        efz efzVar = this.b;
        return new akht(azrwVar, efzVar.B, efzVar.xB, eedVar.mS, this.aX, (char[]) null, (short[]) null);
    }

    public final akht aN() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.I;
        efz efzVar = this.b;
        return new akht(azrwVar, efzVar.xB, efzVar.B, eedVar.mS, this.aX, (byte[]) null, (byte[]) null, (short[]) null);
    }

    public final ogx aO() {
        eed eedVar = this.c;
        return new ogx(eedVar.al, this.b.B, eedVar.iC, eedVar.ch, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public final ajyw aP() {
        eed eedVar = this.c;
        return new ajyw(eedVar.f, this.b.a.Q, eedVar.I, (byte[]) null, (short[]) null, (byte[]) null);
    }

    public final ajyw aQ() {
        azrw azrwVar = this.c.lo;
        efc efcVar = this.b.a;
        return new ajyw(azrwVar, efcVar.aX, efcVar.cd, (char[]) null, (char[]) null, (byte[]) null);
    }

    public final c aR() {
        return new c(this.c.I, this.b.lE, (byte[]) null, (byte[]) null, (char[]) null);
    }

    public final ajyw aS() {
        azrw azrwVar = this.c.lo;
        efc efcVar = this.b.a;
        return new ajyw(azrwVar, efcVar.aX, efcVar.cd, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
    }

    public final ajoy aT() {
        return new ajoy(this.c.f, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
    }

    public final ajoy aU() {
        return new ajoy(this.c.f, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
    }

    public final ajoy aV() {
        return new ajoy(this.b.a.bG, (boolean[]) null);
    }

    public final ajyw aW() {
        eed eedVar = this.c;
        return new ajyw(eedVar.I, eedVar.mS, this.aX, (byte[]) null, (byte[]) null, (int[]) null);
    }

    public final ajyw aX() {
        return new ajyw(this.b.xB, this.c.f, this.aW, (byte[]) null, (char[]) null, (short[]) null);
    }

    public final ajyw aY() {
        azrw b = axqv.b(this.c.et);
        eed eedVar = this.c;
        return new ajyw(b, eedVar.eh, eedVar.eg, (char[]) null, (byte[]) null, (short[]) null);
    }

    public final ajyw aZ() {
        return new ajyw(axqv.b(this.c.et), axqv.b(this.c.eh), axqv.b(this.c.eg), (byte[]) null, (byte[]) null, (byte[]) null, (short[]) null);
    }

    public final adat aa() {
        return new adat(this.a, this.b.cO(), (adlj) this.b.ju.get());
    }

    public final adrs ab() {
        return new adrs(this.a, (wdm) this.b.au.get(), (ajjz) this.b.kp.get(), (afsy) this.b.au.get(), (adsq) this.b.a.bo.get(), this.b.cO());
    }

    public final adso ac() {
        adsq adsqVar = (adsq) this.b.a.bo.get();
        acqq cO = this.b.cO();
        ce ceVar = this.a;
        anib anibVar = (anib) this.b.f.get();
        afsy afsyVar = (afsy) this.b.au.get();
        acun acunVar = (acun) this.b.iu.get();
        efz efzVar = this.b;
        return new adso(adsqVar, cO, ceVar, anibVar, afsyVar, acunVar, efzVar.b.a, (ainy) efzVar.fX.get(), (adlt) this.b.ja.get());
    }

    public final aila ad() {
        Activity a = this.c.a();
        return new aila(a, new aikx(a, (ScheduledExecutorService) this.b.f.get(), (afsy) this.b.au.get(), (wcf) this.b.hM.get()));
    }

    public final akbv ae() {
        return new akbu((akcy) this.aL.get(), (aahd) this.c.I.get(), (gnn) this.c.dv.get(), (aadw) this.b.D.get());
    }

    public final akbv af() {
        return new akbu((akcy) this.aJ.get(), (aahd) this.c.I.get(), (gnn) this.c.dv.get(), (aadw) this.b.D.get());
    }

    public final akcy ag() {
        return new akcy(this.c.jO(), (aahd) this.c.I.get(), (acqz) this.c.P.get());
    }

    public final akcy ah() {
        return new akcy(this.c.jO(), (aahd) this.c.I.get(), (acqz) this.c.P.get());
    }

    @Override // defpackage.axpm
    public final axpn ai() {
        return this.c.kh();
    }

    public final Optional aj() {
        return Optional.ofNullable(((ijo) this.E.get()).bb);
    }

    public final Object ak() {
        return new hiy(((hmw) this.c.hR.get()).b(), (ayqi) this.b.im.get());
    }

    public final Object al() {
        return new hja((ajjz) this.b.kp.get());
    }

    public final Object am() {
        azrw azrwVar = this.l;
        azrw azrwVar2 = this.k;
        azrw azrwVar3 = this.m;
        efc efcVar = this.b.a;
        ohg ohgVar = new ohg(azrwVar, azrwVar2, azrwVar3, efcVar.aX, efcVar.aY, efcVar.cd, efcVar.S, null, null, null, null);
        azrw azrwVar4 = this.aV;
        azrw azrwVar5 = this.k;
        azrw azrwVar6 = this.r;
        acqq cO = this.b.cO();
        yqw Y = Y();
        ayqi ayqiVar = (ayqi) this.b.im.get();
        hrv hrvVar = (hrv) this.b.a.S.get();
        return new hjf(ohgVar, azrwVar4, azrwVar5, azrwVar6, cO, Y, ayqiVar, hrvVar, null, null, null, null);
    }

    public final Object an() {
        Activity a = this.c.a();
        azrw azrwVar = this.b.jV;
        jgj jgjVar = new jgj();
        azrw azrwVar2 = this.be;
        efz efzVar = this.b;
        jgp jgpVar = new jgp(efzVar.ja, efzVar.jV);
        ajoy ajoyVar = new ajoy(this.b.ja, (int[]) null, (byte[]) null, (byte[]) null);
        ajuw jD = this.c.jD();
        return new jfa(a, azrwVar, jgjVar, azrwVar2, jgpVar, ajoyVar, jD, (oix) this.bh.get(), (acun) this.b.iu.get(), (aioc) this.c.n.get(), this.c.I, null, null, null);
    }

    public final Object ao() {
        ainy ji = this.c.ji();
        ainl jg = this.c.jg();
        this.c.a();
        efz efzVar = this.b;
        ajyw ajywVar = new ajyw(efzVar.fX, efzVar.B, efzVar.jk, (short[]) null);
        adlt adltVar = (adlt) this.b.ja.get();
        this.b.cO();
        jfb jfbVar = new jfb(adltVar);
        jfbVar.h(ajywVar.b(jfbVar, jfbVar));
        Optional.of(new jff(adltVar, ji, jg, jfbVar));
        return jfbVar;
    }

    public final Object ap() {
        return new jfh(this.c.ji(), this.bf, (zaw) this.b.iN.get());
    }

    public final Object aq() {
        return new jfi((jgf) this.c.af.get());
    }

    public final Map ar() {
        amrw i = amrz.i(40);
        i.g("EnableInteractionLoggingCrashes", new zeg((ywr) this.b.a.dm.c.fy.get(), abea.r, aczu.b));
        vgz vgzVar = (vgz) this.b.xa.get();
        final kqh am = this.b.am();
        i.g("accessibility_player_setting_key", new zdv(vgzVar, fkp.r, new amml() { // from class: lnm
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return Boolean.valueOf(kqh.this.a((kqs) obj));
            }
        }));
        vgz vgzVar2 = (vgz) this.b.xa.get();
        this.b.am();
        i.g("accessibility_hide_player_controls_setting_key", new zdv(vgzVar2, fkp.s, new kfq(20)));
        i.g("data_saving_mode_key", new zeg((ywr) this.b.a.be.get(), fkp.u, loc.b));
        i.g("data_saving_pref_video_quality_key", new lon((ywr) this.b.a.be.get(), (ywr) this.b.ge.get(), 1));
        efz efzVar = this.b;
        i.g("data_saving_pref_download_quality_key", new loh((ywr) efzVar.a.be.get(), efzVar.gU, (SharedPreferences) this.b.z.get()));
        i.g("data_saving_pref_download_wifi_only_key", new loi((SharedPreferences) this.b.z.get(), (ywr) this.b.a.be.get()));
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.z.get();
        efz efzVar2 = this.b;
        i.g("data_saving_pref_upload_wifi_only_key", new loj(sharedPreferences, efzVar2.b.a, (ywr) efzVar2.a.be.get()));
        i.g("data_saving_imp_wifi_only_key", new lon((ywr) this.b.a.be.get(), (ywr) this.b.il.get(), 0));
        i.g("data_saving_pref_select_quality_every_video_key", new zeg((ywr) this.b.a.be.get(), fkp.t, loc.a));
        i.g(ahbx.QUICK_SEEK_PREFERENCE_STRING, new zeg((ywr) this.b.hL.get(), afrl.k, aidf.f));
        i.g(ahbw.NERD_STATS_ENABLED, new zeg((ywr) this.b.hL.get(), afrl.j, aidf.e));
        ywr ywrVar = (ywr) this.b.hL.get();
        final WillAutonavInformer willAutonavInformer = (WillAutonavInformer) this.b.hO.get();
        afrl afrlVar = afrl.i;
        willAutonavInformer.getClass();
        i.g(ahbw.AUTONAV, new zeg(ywrVar, afrlVar, new amml() { // from class: aids
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return Boolean.valueOf(WillAutonavInformer.this.g((awwk) obj));
            }
        }));
        i.g("BypassFrequencyCap", new zeg((ywr) this.b.xU.get(), afrl.o, aipq.r));
        i.g("SetCustomInterval", new zeg((ywr) this.b.xU.get(), afrl.p, aipq.s));
        i.g("voice_language", new zdv((vgz) this.b.a.ba.get(), fkp.o, kfq.o));
        i.g(fav.PIP_POLICY, new lkm(this.b.xt, 0));
        ywr ywrVar2 = (ywr) this.b.vh.get();
        final trp trpVar = (trp) this.b.hw();
        final byte[] bArr = null;
        i.g(evr.BACKGROUND_AUDIO_POLICY, new zeg(ywrVar2, new ykr(bArr, bArr, bArr) { // from class: evs
            @Override // defpackage.ykr
            public final Object a(Object obj, Object obj2) {
                aone builder = ((evq) obj).toBuilder();
                evp l = trp.this.l((String) obj2);
                builder.copyOnWrite();
                evq evqVar = (evq) builder.instance;
                evqVar.c = l.e;
                evqVar.b |= 1;
                return (evq) builder.build();
            }
        }, new amml(bArr, bArr, bArr) { // from class: evt
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                trp trpVar2 = trp.this;
                evp a = evp.a(((evq) obj).c);
                if (a == null) {
                    a = evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
                }
                return trpVar2.m(a);
            }
        }));
        ywr ywrVar3 = (ywr) this.b.il.get();
        final aaea aaeaVar = (aaea) this.b.K.get();
        i.g("inline_global_play_pause", new zeg(ywrVar3, fkp.p, new amml() { // from class: lky
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                fof fofVar = (fof) obj;
                return (fofVar.b & 4) != 0 ? String.valueOf(fofVar.e) : String.valueOf(gfy.a(aaea.this));
            }
        }));
        i.g("innertube_safety_mode_enabled", new aaew((abep) this.b.x.get()));
        i.g("offline_recs_enabled", new lkm(this.b.gN, 1));
        efz efzVar3 = this.b;
        i.g("smart_downloads_opted_in", new fki(efzVar3.gN, efzVar3.au));
        i.g("premium_filters_hd", new zeg((ywr) this.b.a.cH.get(), lyk.j, wgr.o));
        i.g("premium_filters_live", new zeg((ywr) this.b.a.cH.get(), lyk.k, wgr.p));
        i.g("premium_filters_360", new zeg((ywr) this.b.a.cH.get(), lyk.h, wgr.u));
        i.g("premium_filters_4k", new zeg((ywr) this.b.a.cH.get(), lyk.i, yml.b));
        i.g("premium_filters_recent_upload_one_day", new zeg((ywr) this.b.a.cH.get(), lyk.m, wgr.r));
        i.g("premium_filters_recent_upload_one_week", new zeg((ywr) this.b.a.cH.get(), lyk.n, wgr.s));
        i.g("premium_filters_short_video", new zeg((ywr) this.b.a.cH.get(), lyk.o, wgr.t));
        i.g("premium_filters_long_video", new zeg((ywr) this.b.a.cH.get(), lyk.l, wgr.q));
        i.g("snap_zoom_initially_zoomed", new zeg((ywr) this.b.il.get(), fkp.q, kfq.t));
        i.g("app_theme_dark", new zeg((ywr) this.b.ez.get(), fkp.i, gbr.g));
        i.g("app_theme_appearance", new zeg((ywr) this.b.ez.get(), fkp.j, gbr.f));
        i.g(adyu.LIMIT_MOBILE_DATA_USAGE, new zeg((ywr) this.b.ge.get(), lyk.b, loc.g));
        i.g("mobile_video_quality_auto_key", mcy.i((ywr) this.b.ge.get(), avzr.VIDEO_QUALITY_SETTING_UNKNOWN));
        i.g("mobile_video_quality_high_key", mcy.i((ywr) this.b.ge.get(), avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY));
        i.g("mobile_video_quality_low_key", mcy.i((ywr) this.b.ge.get(), avzr.VIDEO_QUALITY_SETTING_DATA_SAVER));
        i.g("wifi_video_quality_auto_key", mcy.j((ywr) this.b.ge.get(), avzr.VIDEO_QUALITY_SETTING_UNKNOWN));
        i.g("wifi_video_quality_high_key", mcy.j((ywr) this.b.ge.get(), avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY));
        i.g("wifi_video_quality_low_key", mcy.j((ywr) this.b.ge.get(), avzr.VIDEO_QUALITY_SETTING_DATA_SAVER));
        return i.c();
    }

    public final Set as() {
        return amsx.r((aoj) this.aY.get());
    }

    @Override // defpackage.axqf
    public final efp at() {
        return new efp(this.b, this.c, this.bq);
    }

    public final mna au() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        efz efzVar = this.b;
        return new mna(azrwVar, efzVar.B, eedVar.jj, efzVar.kp, efzVar.gH, efzVar.as, efzVar.gU, eedVar.I, eedVar.lG, efzVar.ni, 1, (byte[]) null);
    }

    public final jqr av() {
        return ((hjs) this.l.get()).j();
    }

    public final jzp aw() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        efz efzVar = this.b;
        return new jzp(azrwVar, efzVar.kp, eedVar.lB, eedVar.gr, this.bj, this.bk, this.bl, this.bm, efzVar.gH, efzVar.K, null);
    }

    public final upp ax() {
        azrw azrwVar = this.bo;
        eed eedVar = this.c;
        return new upp(azrwVar, eedVar.lj, eedVar.nK, this.aG, eedVar.nL, eedVar.lv, (byte[]) null);
    }

    public final upp ay() {
        eed eedVar = this.c;
        azrw azrwVar = eedVar.f;
        azrw azrwVar2 = this.bp;
        azrw azrwVar3 = eedVar.cu;
        efz efzVar = this.b;
        return new upp(azrwVar, azrwVar2, azrwVar, azrwVar3, efzVar.an, efzVar.I, (char[]) null);
    }

    public final yfl az() {
        eed eedVar = this.c;
        return new yfl(eedVar.f, eedVar.cu, (char[]) null);
    }

    public final aps b() {
        return new aps(this.a, this.c.fF());
    }

    public final ajoy ba() {
        return new ajoy(this.Y, (byte[]) null, (byte[]) null, (char[]) null, (char[]) null);
    }

    public final ajoy bb() {
        return new ajoy(this.Y, (short[]) null, (byte[]) null, (char[]) null);
    }

    public final ajoy bc() {
        return new ajoy(this.c.k, (char[]) null, (short[]) null, (byte[]) null);
    }

    public final ajoy bd() {
        return new ajoy(this.c.ei, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [evh, java.lang.Object] */
    public final evb c() {
        PackageManager packageManager = (PackageManager) this.b.a.cy.get();
        ?? hx = this.b.hx();
        evd evdVar = (evd) this.c.fE.get();
        eed eedVar = this.c;
        return new evb(packageManager, hx, evdVar, eedVar.o, eedVar.nx, this.b.mi);
    }

    public final fsy d() {
        return new fsy(this.c.a(), this.c.bc(), this.c.jy());
    }

    public final gbh e() {
        return new gap((aadw) this.b.D.get(), this.c.mD(), null, null);
    }

    public final gcl f() {
        return new gcl((gbh) this.ae.get(), (Handler) this.b.an.get());
    }

    public final ggy g() {
        return new ggy(h());
    }

    public final ghd h() {
        return ghe.a(this.c.a(), (afsy) this.b.au.get(), (aftn) this.b.uZ.get(), (aayg) this.b.jq.get(), (zaw) this.b.iN.get(), (ypa) this.b.B.get(), (ysy) this.b.as.get(), (zbi) this.b.iL.get(), (aahd) this.c.I.get(), (Executor) this.b.i.get());
    }

    public final ghi i() {
        return new ghi(this.c.a(), new ajpe(), (ypa) this.b.B.get());
    }

    public final hgk j() {
        return new hgk(this.a, amrz.l(1, new hjz(this.l), 0, new hgm(this.p, (hik) this.q.get(), (hgo) this.k.get())), (hgo) this.k.get(), (hik) this.q.get());
    }

    public final hkz k() {
        return new hkz((ci) this.c.s.get());
    }

    public final hoj l() {
        return new hoj(this.c.g(), (Executor) this.b.i.get(), this.b.cO(), (hmw) this.c.hR.get(), (hmg) this.c.hP.get(), (ajjz) this.b.kp.get(), (hrv) this.b.a.S.get(), (dd) this.c.t.get(), (orr) this.c.mE.get(), null);
    }

    public final MusicSearchResultsController m() {
        return new MusicSearchResultsController(this.c.a(), this.c.jz(), new ajvq(), (ypa) this.b.B.get(), (acqz) this.c.P.get(), this.c.jF(), (zaw) this.b.iN.get(), (ajvb) this.c.al.get(), (aaea) this.b.K.get(), (aypn) this.b.yh.get(), (abcs) this.b.a.cf.get(), (Executor) this.b.f.get(), (Executor) this.b.i.get(), (akei) this.c.mH.get(), this.c.mm(), this.c.jx(), (sxw) this.b.xp.get(), null, null);
    }

    public final MusicSearchSuggestionsController n() {
        return new MusicSearchSuggestionsController(this.c.a(), this.c.jz(), new ajvq(), (ypa) this.b.B.get(), (acqz) this.c.P.get(), this.c.jF(), (zaw) this.b.iN.get(), (ajvb) this.c.al.get(), (aaea) this.b.K.get(), (aypn) this.b.yh.get(), this.c.jV(), this.c.mi(), null);
    }

    public final hpy o() {
        return new hpy((aahd) this.c.I.get(), (ajut) this.b.lE.get(), (acqz) this.c.P.get());
    }

    public final hve p() {
        hve hveVar = (hve) gfw.B(this.a, hve.class);
        ayaw.k(hveVar);
        return hveVar;
    }

    public final hxx q() {
        hxx J2 = etx.J(this.a);
        ayaw.k(J2);
        return J2;
    }

    public final hye r() {
        hye hyeVar = (hye) ((efk) q()).d.get();
        ayaw.k(hyeVar);
        return hyeVar;
    }

    public final hyh s() {
        hyh hyhVar = (hyh) ((efk) q()).f.get();
        ayaw.k(hyhVar);
        return hyhVar;
    }

    public final hza t() {
        hyz hyzVar;
        Activity a = this.c.a();
        ajjz ajjzVar = (ajjz) this.b.kp.get();
        try {
            hyzVar = (hyz) gfw.B(this.a, hyz.class);
        } catch (IllegalStateException unused) {
            hyzVar = new hyz() { // from class: htx
                @Override // defpackage.hyz
                public final void a(axdk axdkVar) {
                }
            };
        }
        ayaw.k(hyzVar);
        return new hza(a, ajjzVar, hyzVar);
    }

    public final hzu u() {
        hzu hzuVar = (hzu) ((efk) q()).g.get();
        ayaw.k(hzuVar);
        return hzuVar;
    }

    public final iax v() {
        iax iaxVar = (iax) ((efk) q()).e.get();
        ayaw.k(iaxVar);
        return iaxVar;
    }

    public final ibe w() {
        ibe ibeVar = (ibe) ((efk) q()).h.get();
        ayaw.k(ibeVar);
        return ibeVar;
    }

    public final ibq x() {
        ibq ibqVar = (ibq) ((efk) q()).i.get();
        ayaw.k(ibqVar);
        return ibqVar;
    }

    public final ibw y() {
        ibw ibwVar = (ibw) ((efk) q()).l.get();
        ayaw.k(ibwVar);
        return ibwVar;
    }

    public final icg z() {
        icg icgVar = (icg) ((efk) q()).n.get();
        ayaw.k(icgVar);
        return icgVar;
    }
}
