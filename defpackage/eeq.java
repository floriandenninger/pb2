package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eeq implements kvl {
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
    public final azrw f200J;
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
    public final efz a;
    private final azrw aA;
    private final azrw aB;
    private final azrw aC;
    private final azrw aD;
    private final azrw aE;
    private final azrw aF;
    private final azrw aG;
    private final azrw aH;
    private final azrw aI;
    private final azrw aJ;
    private final azrw aK;
    private final azrw aL;
    private final azrw aM;
    private final azrw aN;
    private final azrw aO;
    private final azrw aP;
    private final azrw aQ;
    private final azrw aR;
    private final azrw aS;
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
    private final eeq ao = this;
    private final azrw ap;
    private final azrw aq;
    private final azrw ar;
    private final azrw as;
    private final azrw at;
    private final azrw au;
    private final azrw av;
    private final azrw aw;
    private final azrw ax;
    private final azrw ay;
    private final azrw az;
    public final azrw b;
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
    public final azrw c;
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

    public eeq(efz efzVar) {
        this.a = efzVar;
        this.ap = axqq.b(new eep(efzVar, this, 7));
        this.b = axqq.b(new eep(efzVar, this, 6));
        this.c = axqq.b(new eep(efzVar, this, 8));
        this.d = axqq.b(new eep(efzVar, this, 5));
        this.aq = axqq.b(new eep(efzVar, this, 4));
        this.ar = axqq.b(new eep(efzVar, this, 14));
        this.as = axqq.b(new eep(efzVar, this, 17));
        this.e = axqq.b(new eep(efzVar, this, 16));
        this.f = axqq.b(new eep(efzVar, this, 15));
        this.g = axqq.b(new eep(efzVar, this, 18));
        this.h = axqq.b(new eep(efzVar, this, 13));
        this.i = axqq.b(new eep(efzVar, this, 21));
        this.j = axqq.b(new eep(efzVar, this, 20));
        axqp axqpVar = new axqp();
        this.k = axqpVar;
        this.l = axqq.b(new eep(efzVar, this, 24));
        this.m = axqq.b(new eep(efzVar, this, 25));
        this.n = axqq.b(new eep(efzVar, this, 26));
        this.o = axqq.b(new eep(efzVar, this, 27));
        this.p = axqq.b(new eep(efzVar, this, 28));
        this.q = axqq.b(new eep(efzVar, this, 29));
        this.r = axqq.b(new eep(efzVar, this, 30));
        this.s = axqq.b(new eep(efzVar, this, 31));
        this.t = axqq.b(new eep(efzVar, this, 32));
        this.u = axqq.b(new eep(efzVar, this, 33));
        this.v = axqq.b(new eep(efzVar, this, 23));
        axqp axqpVar2 = new axqp();
        this.w = axqpVar2;
        this.x = axqq.b(new eep(efzVar, this, 22));
        this.y = axqq.b(new eep(efzVar, this, 36));
        this.z = axqq.b(new eep(efzVar, this, 35));
        axqp axqpVar3 = new axqp();
        this.A = axqpVar3;
        this.B = axqq.b(new eep(efzVar, this, 37));
        this.C = axqq.b(new eep(efzVar, this, 34));
        axqp.a(axqpVar2, axqq.b(new eep(efzVar, this, 19)));
        eep eepVar = new eep(efzVar, this, 38);
        this.at = eepVar;
        this.D = axqq.b(eepVar);
        axqp axqpVar4 = new axqp();
        this.E = axqpVar4;
        this.F = axqq.b(new eep(efzVar, this, 39));
        this.G = axqq.b(new eep(efzVar, this, 41));
        this.H = axqq.b(new eep(efzVar, this, 40));
        this.I = axqq.b(new eep(efzVar, this, 44));
        this.f200J = axqq.b(new eep(efzVar, this, 43));
        this.au = axqq.b(new eep(efzVar, this, 45));
        this.K = axqq.b(new eep(efzVar, this, 42));
        this.L = axqq.b(new eep(efzVar, this, 47));
        axqp axqpVar5 = new axqp();
        this.M = axqpVar5;
        this.N = axqq.b(new eep(efzVar, this, 49));
        this.O = axqq.b(new eep(efzVar, this, 48));
        this.P = axqq.b(new eep(efzVar, this, 46));
        this.Q = axqq.b(new eep(efzVar, this, 50));
        this.R = axqq.b(new eep(efzVar, this, 52));
        this.S = axqq.b(new eep(efzVar, this, 51));
        this.T = axqq.b(new eep(efzVar, this, 54));
        eep eepVar2 = new eep(efzVar, this, 53);
        this.av = eepVar2;
        this.U = axqq.b(eepVar2);
        this.V = axqq.b(new eep(efzVar, this, 55));
        this.aw = axqq.b(new eep(efzVar, this, 57));
        this.W = axqq.b(new eep(efzVar, this, 56));
        this.X = axqq.b(new eep(efzVar, this, 58));
        eep eepVar3 = new eep(efzVar, this, 59);
        this.ax = eepVar3;
        this.Y = axqq.b(eepVar3);
        eep eepVar4 = new eep(efzVar, this, 60);
        this.ay = eepVar4;
        this.Z = axqq.b(eepVar4);
        this.az = axqq.b(new eep(efzVar, this, 62));
        this.aA = axqq.b(new eep(efzVar, this, 63));
        this.aB = axqq.b(new eep(efzVar, this, 64));
        this.aa = axqq.b(new eep(efzVar, this, 61));
        this.aC = axqq.b(new eep(efzVar, this, 66));
        this.ab = axqq.b(new eep(efzVar, this, 65));
        this.ac = axqq.b(new eep(efzVar, this, 67));
        this.ad = axqq.b(new eep(efzVar, this, 68));
        axqp.a(axqpVar5, axqq.b(new eep(efzVar, this, 12)));
        this.ae = axqq.b(new eep(efzVar, this, 11));
        eep eepVar5 = new eep(efzVar, this, 69);
        this.aD = eepVar5;
        this.af = axqq.b(eepVar5);
        eep eepVar6 = new eep(efzVar, this, 70);
        this.aE = eepVar6;
        this.ag = axqq.b(eepVar6);
        eep eepVar7 = new eep(efzVar, this, 71);
        this.aF = eepVar7;
        this.ah = axqq.b(eepVar7);
        eep eepVar8 = new eep(efzVar, this, 72);
        this.aG = eepVar8;
        this.ai = axqq.b(eepVar8);
        this.aH = new eep(efzVar, this, 10);
        this.aI = axqq.b(new eep(efzVar, this, 9));
        eep eepVar9 = new eep(efzVar, this, 73);
        this.aJ = eepVar9;
        this.aK = axqq.b(eepVar9);
        this.aL = axqq.b(new eep(efzVar, this, 74));
        this.aM = axqq.b(new eep(efzVar, this, 75));
        this.aN = axqq.b(new eep(efzVar, this, 76));
        this.aO = axqq.b(new eep(efzVar, this, 77));
        axqp.a(axqpVar4, axqq.b(new eep(efzVar, this, 3)));
        this.aj = new eep(efzVar, this, 78);
        this.aP = axqq.b(new eep(efzVar, this, 80));
        this.aQ = axqq.b(new eep(efzVar, this, 81));
        this.ak = axqq.b(new eep(efzVar, this, 79));
        axqp.a(axqpVar3, axqq.b(new eep(efzVar, this, 2)));
        this.aR = axqq.b(new eep(efzVar, this, 82));
        eep eepVar10 = new eep(efzVar, this, 1);
        this.aS = eepVar10;
        this.aT = axqq.b(eepVar10);
        eep eepVar11 = new eep(efzVar, this, 83);
        this.aU = eepVar11;
        this.aV = axqq.b(eepVar11);
        this.aW = axqq.b(new eep(efzVar, this, 86));
        this.aX = axqq.b(new eep(efzVar, this, 85));
        this.aY = new eep(efzVar, this, 87);
        this.aZ = axqq.b(new eep(efzVar, this, 88));
        this.ba = new eep(efzVar, this, 89);
        this.bb = new eep(efzVar, this, 90);
        this.bc = new eep(efzVar, this, 91);
        eep eepVar12 = new eep(efzVar, this, 93);
        this.bd = eepVar12;
        this.be = axqq.b(eepVar12);
        this.bf = new eep(efzVar, this, 92);
        this.bg = new eep(efzVar, this, 94);
        eep eepVar13 = new eep(efzVar, this, 84);
        this.bh = eepVar13;
        this.bi = axqq.b(eepVar13);
        this.bj = axqq.b(new eep(efzVar, this, 95));
        axqp.a(axqpVar, axqq.b(new eep(efzVar, this, 0)));
        new eep(efzVar, this, 96);
        this.al = axqq.b(new eep(efzVar, this, 98));
        this.bk = axqq.b(new eep(efzVar, this, 97));
        this.bl = axqq.b(new eep(efzVar, this, 99));
        this.bm = axqq.b(new eep(efzVar, this, 100));
        this.bn = axqq.b(new eep(efzVar, this, 101));
        this.am = axqq.b(new eep(efzVar, this, 103));
        this.an = axqq.b(new eep(efzVar, this, 104));
        eep eepVar14 = new eep(efzVar, this, 102);
        this.bo = eepVar14;
        this.bp = axqq.b(eepVar14);
    }

    private final alor aM() {
        return new alor(this.aC, this.e, this.v, this.D, this.x, this.a.fS);
    }

    @Override // defpackage.aioc
    public final aild A() {
        return (aild) this.I.get();
    }

    @Override // defpackage.ainz
    public final aimb B() {
        return (aimb) this.A.get();
    }

    @Override // defpackage.ainz
    public final aiml C() {
        return (aiml) this.k.get();
    }

    @Override // defpackage.aioc
    public final ainl D() {
        return (ainl) this.O.get();
    }

    @Override // defpackage.aioc
    public final ainy E() {
        return (ainy) this.M.get();
    }

    @Override // defpackage.aioc
    public final aior F() {
        return (aior) this.S.get();
    }

    @Override // defpackage.aioc
    public final aiov G() {
        return (aiov) this.L.get();
    }

    public final aipd H() {
        return new aipd((aimb) this.A.get());
    }

    public final airh I() {
        efz efzVar = this.a;
        airh z = aiog.z(new ajyw(efzVar.ay, efzVar.kY, efzVar.gE, (byte[]) null, (byte[]) null), (aiov) this.L.get());
        z.a();
        return z;
    }

    public final airr J() {
        airr c = aifi.c(airp.b((shf) this.a.g.get(), (Executor) this.a.f.get(), (afhz) this.a.gs.get(), airj.c((tcu) this.a.ve.get()), (aaea) this.a.K.get(), (ScheduledExecutorService) this.a.f.get()), (aiov) this.L.get(), (aypn) this.aw.get(), (aypn) this.au.get(), (aypn) this.e.get(), (aypn) this.b.get());
        c.a();
        return c;
    }

    @Override // defpackage.aioc
    public final airx K() {
        return (airx) this.d.get();
    }

    public final aisf L() {
        ypa ypaVar = (ypa) this.a.B.get();
        efz efzVar = this.a;
        aisf a = aisg.a(ypaVar, efzVar.b.a, (aipt) efzVar.iB.get(), (aitb) this.ar.get(), (ahbv) this.a.bd.get(), (ScheduledExecutorService) this.a.f.get(), (String) this.a.fv.get(), (anhy) this.a.lq.get(), axqq.a(this.f), (aifk) this.a.fS.get());
        a.b((aypn) this.e.get(), (aypn) this.b.get(), (aypn) this.g.get(), (aifk) this.a.fS.get());
        return a;
    }

    @Override // defpackage.aioc
    public final aisf M() {
        return (aisf) this.h.get();
    }

    public final aitb N() {
        return new aitb((ScheduledExecutorService) this.a.f.get(), (Executor) this.a.f.get(), (zjl) this.a.uH.get());
    }

    @Override // defpackage.aioc
    public final aivo O() {
        return (aivo) this.bk.get();
    }

    @Override // defpackage.ainz
    public final aivu P() {
        return (aivu) this.aP.get();
    }

    public final aiwl Q() {
        return new aiwl((ypa) this.a.B.get(), as(), (banw) this.aL.get(), (banw) this.aM.get(), (banw) this.aN.get(), (banw) this.aO.get());
    }

    public final aizu R() {
        return advr.n(this.a.ii(), (aifk) this.a.fS.get(), (ahbv) this.a.bd.get());
    }

    @Override // defpackage.aioc
    public final ajae S() {
        return (ajae) this.aI.get();
    }

    public final ajae T() {
        efz efzVar = this.a;
        ajae c = aajo.c(efzVar.uF, (ScheduledExecutorService) efzVar.f.get(), this.aH, (aiow) this.a.uG.get(), (Handler) this.a.an.get(), (Executor) this.a.i.get(), (aaea) this.a.K.get(), (aifk) this.a.fS.get(), (SecureRandom) this.a.ea.get(), this.a.cp(), (acpl) this.a.aw.get());
        c.z((aypn) this.b.get(), (aypn) this.e.get());
        return c;
    }

    public final aypn U() {
        return aifu.f((azqw) this.r.get());
    }

    @Override // defpackage.aiox
    public final aypn V() {
        return (aypn) this.b.get();
    }

    @Override // defpackage.aioc
    public final aypn W() {
        return (aypn) this.G.get();
    }

    @Override // defpackage.kvl
    public final aypn X() {
        return (aypn) this.am.get();
    }

    @Override // defpackage.kvl
    public final aypn Y() {
        return (aypn) this.an.get();
    }

    @Override // defpackage.aioc
    public final aypn Z() {
        return (aypn) this.y.get();
    }

    public final fla a() {
        return new fla(axqq.a(this.a.fX), this.aT, this.aV, axqq.a(this.bi), axqq.a(this.bj), (aadw) this.a.D.get());
    }

    public final banw aA() {
        Context context = this.a.b.a;
        azqw azqwVar = (azqw) this.aw.get();
        ayaw.k(azqwVar);
        return azqwVar;
    }

    public final banw aB() {
        Context context = this.a.b.a;
        azqw azqwVar = (azqw) this.au.get();
        ayaw.k(azqwVar);
        return azqwVar;
    }

    @Override // defpackage.aioc
    public final aadw aC() {
        return (aadw) this.a.D.get();
    }

    @Override // defpackage.aioc
    public final aiod aD() {
        return (aiod) this.bl.get();
    }

    public final aiod aE() {
        return aifu.i((ahca) this.Q.get());
    }

    @Override // defpackage.aioc
    public final aiof aF() {
        return (aiof) this.bm.get();
    }

    @Override // defpackage.aioc
    public final aiow aG() {
        return (aiow) this.C.get();
    }

    @Override // defpackage.aioc
    public final aigv aH() {
        return (aigv) this.D.get();
    }

    public final ahbg aI() {
        return aiok.c((ahbh) this.w.get());
    }

    @Override // defpackage.aioc
    public final aioe aJ() {
        return (aioe) this.bn.get();
    }

    @Override // defpackage.aioc
    public final aivz aK() {
        return (aivz) this.al.get();
    }

    public final ahbg aL() {
        return aioj.c((ahbh) this.w.get());
    }

    @Override // defpackage.aioc
    public final aypn aa() {
        return (aypn) this.g.get();
    }

    @Override // defpackage.aiox
    public final aypn ab() {
        return (aypn) this.e.get();
    }

    @Override // defpackage.aiox
    public final aypn ac() {
        return (aypn) this.aw.get();
    }

    @Override // defpackage.aiox
    public final aypn ad() {
        return (aypn) this.au.get();
    }

    @Override // defpackage.aioc
    public final /* synthetic */ aypn ae(amml ammlVar, amml ammlVar2) {
        return ahbw.h(this, ammlVar, ammlVar2);
    }

    public final aypn af() {
        return aifu.k((azqv) this.ap.get());
    }

    public final aypn ag() {
        return aifu.l((azqv) this.as.get());
    }

    @Override // defpackage.aimw
    public final aypn ah() {
        return (aypn) this.m.get();
    }

    @Override // defpackage.aimw
    public final aypn ai() {
        return (aypn) this.o.get();
    }

    @Override // defpackage.aimw
    public final aypn aj() {
        return (aypn) this.u.get();
    }

    @Override // defpackage.aimw
    public final aypn ak() {
        return (aypn) this.t.get();
    }

    @Override // defpackage.aimw
    public final aypn al() {
        return (aypn) this.l.get();
    }

    @Override // defpackage.aimw
    public final aypn am() {
        return (aypn) this.n.get();
    }

    @Override // defpackage.aimw
    public final aypn an() {
        return (aypn) this.p.get();
    }

    @Override // defpackage.aimw
    public final aypn ao() {
        return (aypn) this.T.get();
    }

    @Override // defpackage.aimw
    public final aypn ap() {
        return (aypn) this.s.get();
    }

    @Override // defpackage.aimw
    public final aypn aq() {
        return (aypn) this.q.get();
    }

    public final Set ar() {
        amsv j = amsx.j(9);
        j.c((aijo) this.a.vv.get());
        j.c((aijo) this.a.vw.get());
        j.c(this.a.br());
        j.c((aijo) this.a.vx.get());
        j.c((aijo) this.a.vy.get());
        j.c(this.a.dh());
        j.c((aijo) this.a.fU.get());
        j.c((aijo) this.a.vz.get());
        j.j(aiog.c((aiik) this.aW.get(), (aijo) this.a.kW.get()));
        return j.g();
    }

    public final Set as() {
        amsv j = amsx.j(3);
        j.c((ajbh) this.aq.get());
        j.c((ajbh) this.aI.get());
        j.j((Iterable) this.aK.get());
        return j.g();
    }

    public final banw at() {
        Context context = this.a.b.a;
        azqw azqwVar = (azqw) this.aC.get();
        ayaw.k(azqwVar);
        return azqwVar;
    }

    @Override // defpackage.aiox
    public final banw au() {
        return (banw) this.aN.get();
    }

    @Override // defpackage.aiox
    public final banw av() {
        return (banw) this.aO.get();
    }

    @Override // defpackage.aiox
    public final banw aw() {
        return (banw) this.aL.get();
    }

    @Override // defpackage.aiox
    public final banw ax() {
        return (banw) this.aM.get();
    }

    public final banw ay() {
        Context context = this.a.b.a;
        azqv azqvVar = (azqv) this.ap.get();
        ayaw.k(azqvVar);
        return azqvVar;
    }

    public final banw az() {
        Context context = this.a.b.a;
        azqv azqvVar = (azqv) this.as.get();
        ayaw.k(azqvVar);
        return azqvVar;
    }

    public final kcp b() {
        efz efzVar = this.a;
        Context context = efzVar.b.a;
        aifs aifsVar = (aifs) efzVar.gw.get();
        afsy afsyVar = (afsy) this.a.au.get();
        efz efzVar2 = this.a;
        return new kcp(context, aifsVar, afsyVar, efzVar2.uZ, (aili) efzVar2.vb.get(), (shf) this.a.g.get(), (aadw) this.a.D.get(), (aaea) this.a.K.get());
    }

    public final khb c() {
        return new khb((aioc) this.a.fY.get(), (aypn) this.a.vi.get(), (aypn) this.a.vj.get(), (aypn) this.a.uN.get());
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [evh, java.lang.Object] */
    public final khj d() {
        efz efzVar = this.a;
        final khj khjVar = new khj(efzVar.b.a, (acpl) efzVar.aw.get(), (ysy) this.a.as.get(), (aifs) this.a.gw.get(), this.a.hx(), (aioc) this.a.fY.get(), amsx.t((khn) this.az.get(), (khn) this.aA.get(), (khn) this.aB.get()));
        khjVar.g.X(new ayrs() { // from class: khc
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                khj khjVar2 = khj.this;
                khh khhVar = (khh) obj;
                aone createBuilder = atxe.a.createBuilder();
                evp a = evp.a(((evq) ((evj) khjVar2.f).a.c()).c);
                if (a == null) {
                    a = evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
                }
                int i = 1;
                boolean z = a == evp.BACKGROUND_AUDIO_POLICY_ON;
                createBuilder.copyOnWrite();
                atxe atxeVar = (atxe) createBuilder.instance;
                atxeVar.b |= 1;
                atxeVar.c = z;
                evp a2 = evp.a(((evq) ((evj) khjVar2.f).a.c()).c);
                if (a2 == null) {
                    a2 = evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
                }
                boolean z2 = a2 == evp.BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES;
                createBuilder.copyOnWrite();
                atxe atxeVar2 = (atxe) createBuilder.instance;
                atxeVar2.b |= 2;
                atxeVar2.d = z2;
                atxe atxeVar3 = (atxe) createBuilder.build();
                khg a3 = khhVar.a();
                aone createBuilder2 = atxf.a.createBuilder();
                boolean z3 = a3.a.b;
                createBuilder2.copyOnWrite();
                atxf atxfVar = (atxf) createBuilder2.instance;
                atxfVar.b |= 1;
                atxfVar.c = z3;
                boolean z4 = khjVar2.e.k;
                createBuilder2.copyOnWrite();
                atxf atxfVar2 = (atxf) createBuilder2.instance;
                atxfVar2.b |= 2;
                atxfVar2.d = z4;
                boolean z5 = a3.a.c;
                createBuilder2.copyOnWrite();
                atxf atxfVar3 = (atxf) createBuilder2.instance;
                atxfVar3.b |= 4;
                atxfVar3.e = z5;
                int i2 = a3.a.d;
                createBuilder2.copyOnWrite();
                atxf atxfVar4 = (atxf) createBuilder2.instance;
                atxfVar4.g = i2 - 1;
                atxfVar4.b |= 16;
                createBuilder2.copyOnWrite();
                atxf atxfVar5 = (atxf) createBuilder2.instance;
                atxeVar3.getClass();
                atxfVar5.f = atxeVar3;
                atxfVar5.b |= 8;
                int i3 = a3.b;
                if (i3 != 0) {
                    switch (i3) {
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 9;
                            break;
                        case 9:
                            i = 10;
                            break;
                        case 10:
                            i = 11;
                            break;
                    }
                } else {
                    i = 2;
                }
                createBuilder2.copyOnWrite();
                atxf atxfVar6 = (atxf) createBuilder2.instance;
                atxfVar6.h = i - 1;
                atxfVar6.b |= 32;
                boolean isPowerSaveMode = khjVar2.d.isPowerSaveMode();
                createBuilder2.copyOnWrite();
                atxf atxfVar7 = (atxf) createBuilder2.instance;
                atxfVar7.b |= 128;
                atxfVar7.j = isPowerSaveMode;
                if (Build.VERSION.SDK_INT >= 23) {
                    boolean isDeviceIdleMode = khjVar2.d.isDeviceIdleMode();
                    createBuilder2.copyOnWrite();
                    atxf atxfVar8 = (atxf) createBuilder2.instance;
                    atxfVar8.b |= 64;
                    atxfVar8.i = isDeviceIdleMode;
                }
                atxg a4 = khhVar.b().a();
                aqjw f = khjVar2.b.f();
                a4.copyOnWrite();
                ((atxh) a4.instance).i(f);
                String str = a3.a.a;
                a4.copyOnWrite();
                ((atxh) a4.instance).h(str);
                a4.copyOnWrite();
                ((atxh) a4.instance).l((atxf) createBuilder2.build());
                arpn a5 = arpp.a();
                a5.copyOnWrite();
                ((arpp) a5.instance).dw((atxh) a4.build());
                khjVar2.a.c((arpp) a5.build());
            }
        });
        return khjVar;
    }

    public final kvg e() {
        return new kvg(new ajoy(this.a.vu, (byte[]) null, (short[]) null, (byte[]) null, (byte[]) null), aM(), null, null, null, null);
    }

    public final kvj f() {
        agrd agrdVar;
        efz efzVar = this.a;
        akfq akfqVar = new akfq(efzVar.hl, this.aX, efzVar.vB, this.aY, this.aZ, this.ba, efzVar.K, efzVar.fS, (char[]) null);
        efz efzVar2 = this.a;
        agqo agqoVar = new agqo(efzVar2.hl, this.aX, efzVar2.vB, this.aY, this.aZ, this.ba, this.bb, efzVar2.K, this.bc, efzVar2.gW, efzVar2.gG, efzVar2.gU, efzVar2.fS);
        agqv j = j();
        axzg axzgVar = (axzg) this.a.kt.get();
        azrw azrwVar = this.bf;
        azrw azrwVar2 = this.bg;
        if (axzgVar.o().booleanValue()) {
            agrdVar = (agrd) azrwVar.get();
        } else {
            agrdVar = (agrd) azrwVar2.get();
        }
        agrd agrdVar2 = agrdVar;
        ayaw.k(agrdVar2);
        return new kvj(akfqVar, agqoVar, j, agrdVar2, (aaea) this.a.K.get(), (anic) this.a.f.get(), null, null);
    }

    public final kvk g() {
        return new kvk((aimb) this.A.get(), aM(), (aibl) this.aR.get(), (axzf) this.a.vt.get(), null, null, null);
    }

    public final adiu h() {
        efz efzVar = this.a;
        Context context = efzVar.b.a;
        shf shfVar = (shf) efzVar.g.get();
        Executor E = anaf.E((Executor) this.a.f.get());
        ypa ypaVar = (ypa) this.a.B.get();
        efz efzVar2 = this.a;
        azrw azrwVar = efzVar2.rC;
        azrw azrwVar2 = efzVar2.sC;
        azrw azrwVar3 = efzVar2.ty;
        aypn aypnVar = (aypn) this.b.get();
        azrw azrwVar4 = this.a.ja;
        aigv aigvVar = (aigv) this.D.get();
        efz efzVar3 = this.a;
        return new adiu(context, shfVar, E, ypaVar, azrwVar, azrwVar2, azrwVar3, aypnVar, azrwVar4, aigvVar, efzVar3.iP, (banw) efzVar3.vn.get(), (banw) this.a.vo.get(), (banw) this.a.vp.get(), (banw) this.a.vq.get(), (aivu) this.aP.get(), (ajoy) this.a.sA.get(), this.a.bY(), new efw(this.a, this.ao), (aadw) this.a.D.get(), (wpl) this.a.rO.get(), (aioc) this.aQ.get(), null, null, null, null);
    }

    public final agpp i() {
        return new agpp(afhy.j((ajkn) this.a.ed.get(), this.a.d()), (ajkn) this.a.ed.get(), this.a.d(), (axzg) this.a.gO.get(), null, null, null);
    }

    public final agqv j() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.f.get();
        efz efzVar = this.a;
        azrw azrwVar = efzVar.gH;
        shf shfVar = (shf) efzVar.g.get();
        efz efzVar2 = this.a;
        azrw azrwVar2 = efzVar2.he;
        aais aaisVar = (aais) efzVar2.dJ.get();
        afsy afsyVar = (afsy) this.a.au.get();
        efz efzVar3 = this.a;
        return new agqv(scheduledExecutorService, azrwVar, new agqu(shfVar, azrwVar2, aaisVar, afsyVar, efzVar3.iP, (agzs) efzVar3.vC.get()), (zaw) this.a.iN.get(), (jqv) this.a.vD.get(), (aaea) this.a.K.get(), (axzg) this.a.gO.get(), null, null, null);
    }

    public final agqz k() {
        efz efzVar = this.a;
        return new agqz(efzVar.b.a, (Executor) efzVar.Q.get(), (aijg) this.a.vB.get(), (jqv) this.a.vD.get(), (ysy) this.a.as.get(), (agri) this.a.vE.get(), (agqx) this.be.get(), this.a.gH);
    }

    public final ahaz l() {
        return afqe.n((adxl) this.a.gx.get(), (aifs) this.j.get());
    }

    public final ahbc m() {
        ahbc e = wmn.e((aimx) this.v.get(), (aiov) this.L.get(), axqq.a(this.O), (Executor) this.a.i.get(), this.a.vc, (aypn) this.b.get(), (aypn) this.e.get());
        e.a();
        return e;
    }

    public final ahbh n() {
        efz efzVar = this.a;
        return new ahbh(efzVar.b.a, efzVar.uJ, (aifs) this.j.get(), this.x, this.C, (aimb) this.A.get(), (ajbh) this.a.uK.get(), (aipd) this.B.get(), (aaea) this.a.K.get(), axqq.a(this.a.uS), (aifk) this.a.fS.get(), null);
    }

    public final ahca o() {
        ahca j = aash.j((afhz) this.a.gs.get());
        j.b((aypn) this.as.get(), (aypn) this.e.get(), (aypn) this.b.get());
        return j;
    }

    public final ahqx p() {
        final ahqx ahqxVar = new ahqx(this.a.bY(), this.a.cp(), (Executor) this.a.f.get(), (aarr) this.a.hV.get(), (aiov) this.L.get());
        new ayqw().d(ahqxVar.b.a.X(new ayrs() { // from class: ahqu
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahqx ahqxVar2 = ahqx.this;
                ahef ahefVar = (ahef) obj;
                if (!ahefVar.c().a(aign.PLAYBACK_LOADED) || ahefVar.d().h() == null || ahefVar.d().e() == null || ahefVar.d().e().y() || ahefVar.b().a.F.isEmpty()) {
                    return;
                }
                ahefVar.d().h().c(new ahqw(ahqxVar2, ahefVar));
            }
        }));
        return ahqxVar;
    }

    @Override // defpackage.kvl
    public final ahsq q() {
        return (ahsq) this.bp.get();
    }

    public final aife r() {
        zgj bY = this.a.bY();
        aipn aipnVar = (aipn) this.f200J.get();
        aypn aypnVar = (aypn) this.e.get();
        aypn aypnVar2 = (aypn) this.au.get();
        aiih aiihVar = (aiih) this.x.get();
        aimx aimxVar = (aimx) this.v.get();
        axqq.a(this.k);
        return new aife(bY, aipnVar, aypnVar, aypnVar2, aiihVar, aimxVar);
    }

    @Override // defpackage.aioc
    public final aifs s() {
        return (aifs) this.j.get();
    }

    @Override // defpackage.aioc
    public final aifv t() {
        return (aifv) this.c.get();
    }

    @Override // defpackage.aioc
    public final aifw u() {
        return (aifw) this.j.get();
    }

    public final aigv v() {
        return new aigv((ypa) this.a.B.get());
    }

    public final aihc w() {
        return aifu.c((shf) this.a.g.get());
    }

    @Override // defpackage.ainz
    public final aihl x() {
        return (aihl) this.k.get();
    }

    @Override // defpackage.ainz
    public final aihs y() {
        return (aihs) this.aX.get();
    }

    @Override // defpackage.aioc
    public final aiik z() {
        return (aiik) this.aW.get();
    }
}
