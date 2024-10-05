package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.navigation.HomePageMonitor;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
class ivo extends ivj {
    private ContextWrapper ct;
    private boolean cu = false;

    private final void bG() {
        if (this.ct == null) {
            this.ct = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ivn, defpackage.gir, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ct;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        bG();
        bF();
    }

    @Override // defpackage.ivn
    protected final void bF() {
        if (this.cu) {
            return;
        }
        this.cu = true;
        iwa iwaVar = (iwa) this;
        ehw ehwVar = (ehw) lM();
        iwaVar.ar = axqq.a(ehwVar.b.lO);
        iwaVar.av = (aadw) ehwVar.b.D.get();
        iwaVar.as = (gad) ehwVar.c.eo.get();
        iwaVar.at = (giv) ehwVar.c.ae.get();
        iwaVar.au = (gje) ehwVar.c.l.get();
        iwaVar.ae = (gfi) ehwVar.c.kj.get();
        iwaVar.al = axqq.a(ehwVar.c.et);
        iwaVar.am = (lza) ehwVar.c.eu.get();
        iwaVar.aC = (gnf) ehwVar.b.ny.get();
        iwaVar.bX = (rxm) ehwVar.c.ei.get();
        iwaVar.aE = (aaue) ehwVar.b.ka.get();
        iwaVar.aF = (izr) ehwVar.b.nP.get();
        iwaVar.aG = axqq.a(ehwVar.b.nh);
        iwaVar.aH = (ajjz) ehwVar.b.kp.get();
        iwaVar.aI = (zaw) ehwVar.b.iN.get();
        iwaVar.aJ = (shf) ehwVar.b.g.get();
        iwaVar.aK = ehwVar.c.mq;
        iwaVar.aL = (ypa) ehwVar.b.B.get();
        iwaVar.aM = (ajvb) ehwVar.c.al.get();
        iwaVar.aN = (afzq) ehwVar.b.lI.get();
        iwaVar.aO = (Handler) ehwVar.b.an.get();
        efz efzVar = ehwVar.b;
        iwaVar.aP = efzVar.ks;
        iwaVar.aQ = (afzp) ehwVar.b.lS.get();
        iwaVar.aR = (AppTabsBar) ehwVar.c.eh.get();
        iwaVar.cb = ehwVar.aD();
        iwaVar.cd = ehwVar.aH();
        iwaVar.cj = ehwVar.aW();
        iwaVar.aS = ehwVar.R();
        iwaVar.cg = ehwVar.aM();
        iwaVar.ch = ehwVar.aN();
        iwaVar.aT = ehwVar.as();
        iwaVar.co = ehwVar.bb();
        iwaVar.cn = ehwVar.ba();
        iwaVar.aU = (nko) ehwVar.c.aw.get();
        iwaVar.cf = ehwVar.aL();
        iwaVar.cr = ehwVar.bd();
        iwaVar.aV = (aahd) ehwVar.c.I.get();
        iwaVar.aW = ehwVar.c.el;
        iwaVar.aX = (mad) ehwVar.Y.get();
        iwaVar.bU = (lso) ehwVar.c.dS.get();
        iwaVar.cl = ehwVar.aZ();
        iwaVar.ck = ehwVar.aY();
        iwaVar.ce = ehwVar.aJ();
        iwaVar.aY = (zbi) ehwVar.b.iL.get();
        iwaVar.cm = (aoae) ehwVar.b.xK.get();
        iwaVar.bV = (aadw) ehwVar.b.D.get();
        iwaVar.aZ = (aaea) ehwVar.b.K.get();
        iwaVar.bZ = (aifh) ehwVar.c.mU.get();
        iwaVar.ba = (InlinePlaybackLifecycleController) ehwVar.c.x.get();
        iwaVar.bb = ehwVar.c.jF();
        iwaVar.bc = (ActiveStateScrollSelectionController) ehwVar.c.eO.get();
        iwaVar.bd = ehwVar.c.jE();
        iwaVar.be = ehwVar.c.eC();
        iwaVar.bf = ehwVar.c.eB();
        iwaVar.bg = ehwVar.E();
        iwaVar.bh = (zki) ehwVar.b.lW.get();
        iwaVar.bi = (aamb) ehwVar.b.eJ.get();
        iwaVar.bj = ehwVar.c.jz();
        iwaVar.ca = ehwVar.aA();
        iwaVar.cp = ehwVar.bc();
        iwaVar.bk = (akcp) ehwVar.c.er.get();
        iwaVar.bl = (jsk) ehwVar.b.a.f.get();
        iwaVar.bm = (fjm) ehwVar.b.nM.get();
        iwaVar.bn = (acpl) ehwVar.b.aw.get();
        iwaVar.bo = ehwVar.c.nf;
        iwaVar.bp = (ScheduledExecutorService) ehwVar.b.f.get();
        iwaVar.bq = (gdz) ehwVar.c.hx.get();
        iwaVar.br = (gej) ehwVar.Z.get();
        efz efzVar2 = ehwVar.b;
        iwaVar.bs = efzVar2.lB;
        iwaVar.bt = efzVar2.as;
        iwaVar.bW = (fab) ehwVar.c.ng.get();
        iwaVar.bu = Optional.empty();
        eed eedVar = ehwVar.c;
        iwaVar.bv = eedVar.iZ;
        iwaVar.bw = (nka) eedVar.aH.get();
        iwaVar.bx = (acsy) ehwVar.b.ee.get();
        iwaVar.by = (fgz) ehwVar.b.a.cb.get();
        iwaVar.bz = (LayerableFilterEntityController) ehwVar.c.jP.get();
        iwaVar.cq = (aoae) ehwVar.c.gF.get();
        iwaVar.bA = (mbn) ehwVar.aa.get();
        iwaVar.bB = (mbb) ehwVar.ab.get();
        iwaVar.bC = (mdq) ehwVar.ac.get();
        iwaVar.bD = (sxw) ehwVar.b.a.ct.get();
        iwaVar.bE = (ajti) ehwVar.c.kg.get();
        iwaVar.bF = (ajzi) ehwVar.b.cK.get();
        iwaVar.bG = (aksl) ehwVar.b.ha.get();
        iwaVar.bH = (gni) ehwVar.b.eA.get();
        iwaVar.ci = ehwVar.c.mM();
        iwaVar.cc = ehwVar.c.my();
        iwaVar.bI = ghe.h();
        iwaVar.bJ = (nqp) ehwVar.c.gD.get();
        iwaVar.bK = (mfr) ehwVar.c.hE.get();
        iwaVar.bL = axqq.a(ehwVar.c.gi);
        iwaVar.bY = (axzg) ehwVar.b.wB.get();
        iwaVar.bM = (zgi) ehwVar.b.fH.get();
        iwaVar.bN = (HomePageMonitor) ehwVar.c.jJ.get();
        iwaVar.ct = ehwVar.b.x();
        iwaVar.cu = (fjs) ehwVar.b.kv.get();
        iwaVar.cv = axqq.a(ehwVar.c.jM);
    }

    @Override // defpackage.ivn, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        bG();
        bF();
    }

    @Override // defpackage.ivn, defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(super.lW(bundle), this));
    }

    @Override // defpackage.ivj, defpackage.ivn, defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.ct == null) {
            return null;
        }
        bG();
        return this.ct;
    }
}
