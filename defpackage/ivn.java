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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ivn extends gir implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private void n() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        n();
        bF();
    }

    @Override // defpackage.axql
    /* renamed from: bE, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axqa(this);
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bF() {
        if (this.d) {
            return;
        }
        this.d = true;
        ivj ivjVar = (ivj) this;
        ehw ehwVar = (ehw) lM();
        ivjVar.ar = axqq.a(ehwVar.b.lO);
        ivjVar.av = (aadw) ehwVar.b.D.get();
        ivjVar.as = (gad) ehwVar.c.eo.get();
        ivjVar.at = (giv) ehwVar.c.ae.get();
        ivjVar.au = (gje) ehwVar.c.l.get();
        ivjVar.ae = (gfi) ehwVar.c.kj.get();
        ivjVar.al = axqq.a(ehwVar.c.et);
        ivjVar.am = (lza) ehwVar.c.eu.get();
        ivjVar.aC = (gnf) ehwVar.b.ny.get();
        ivjVar.bX = (rxm) ehwVar.c.ei.get();
        ivjVar.aE = (aaue) ehwVar.b.ka.get();
        ivjVar.aF = (izr) ehwVar.b.nP.get();
        ivjVar.aG = axqq.a(ehwVar.b.nh);
        ivjVar.aH = (ajjz) ehwVar.b.kp.get();
        ivjVar.aI = (zaw) ehwVar.b.iN.get();
        ivjVar.aJ = (shf) ehwVar.b.g.get();
        ivjVar.aK = ehwVar.c.mq;
        ivjVar.aL = (ypa) ehwVar.b.B.get();
        ivjVar.aM = (ajvb) ehwVar.c.al.get();
        ivjVar.aN = (afzq) ehwVar.b.lI.get();
        ivjVar.aO = (Handler) ehwVar.b.an.get();
        efz efzVar = ehwVar.b;
        ivjVar.aP = efzVar.ks;
        ivjVar.aQ = (afzp) ehwVar.b.lS.get();
        ivjVar.aR = (AppTabsBar) ehwVar.c.eh.get();
        ivjVar.cb = ehwVar.aD();
        ivjVar.cd = ehwVar.aH();
        ivjVar.cj = ehwVar.aW();
        ivjVar.aS = ehwVar.R();
        ivjVar.cg = ehwVar.aM();
        ivjVar.ch = ehwVar.aN();
        ivjVar.aT = ehwVar.as();
        ivjVar.co = ehwVar.bb();
        ivjVar.cn = ehwVar.ba();
        ivjVar.aU = (nko) ehwVar.c.aw.get();
        ivjVar.cf = ehwVar.aL();
        ivjVar.cr = ehwVar.bd();
        ivjVar.aV = (aahd) ehwVar.c.I.get();
        ivjVar.aW = ehwVar.c.el;
        ivjVar.aX = (mad) ehwVar.Y.get();
        ivjVar.bU = (lso) ehwVar.c.dS.get();
        ivjVar.cl = ehwVar.aZ();
        ivjVar.ck = ehwVar.aY();
        ivjVar.ce = ehwVar.aJ();
        ivjVar.aY = (zbi) ehwVar.b.iL.get();
        ivjVar.cm = (aoae) ehwVar.b.xK.get();
        ivjVar.bV = (aadw) ehwVar.b.D.get();
        ivjVar.aZ = (aaea) ehwVar.b.K.get();
        ivjVar.bZ = (aifh) ehwVar.c.mU.get();
        ivjVar.ba = (InlinePlaybackLifecycleController) ehwVar.c.x.get();
        ivjVar.bb = ehwVar.c.jF();
        ivjVar.bc = (ActiveStateScrollSelectionController) ehwVar.c.eO.get();
        ivjVar.bd = ehwVar.c.jE();
        ivjVar.be = ehwVar.c.eC();
        ivjVar.bf = ehwVar.c.eB();
        ivjVar.bg = ehwVar.E();
        ivjVar.bh = (zki) ehwVar.b.lW.get();
        ivjVar.bi = (aamb) ehwVar.b.eJ.get();
        ivjVar.bj = ehwVar.c.jz();
        ivjVar.ca = ehwVar.aA();
        ivjVar.cp = ehwVar.bc();
        ivjVar.bk = (akcp) ehwVar.c.er.get();
        ivjVar.bl = (jsk) ehwVar.b.a.f.get();
        ivjVar.bm = (fjm) ehwVar.b.nM.get();
        ivjVar.bn = (acpl) ehwVar.b.aw.get();
        ivjVar.bo = ehwVar.c.nf;
        ivjVar.bp = (ScheduledExecutorService) ehwVar.b.f.get();
        ivjVar.bq = (gdz) ehwVar.c.hx.get();
        ivjVar.br = (gej) ehwVar.Z.get();
        efz efzVar2 = ehwVar.b;
        ivjVar.bs = efzVar2.lB;
        ivjVar.bt = efzVar2.as;
        ivjVar.bW = (fab) ehwVar.c.ng.get();
        ivjVar.bu = Optional.empty();
        eed eedVar = ehwVar.c;
        ivjVar.bv = eedVar.iZ;
        ivjVar.bw = (nka) eedVar.aH.get();
        ivjVar.bx = (acsy) ehwVar.b.ee.get();
        ivjVar.by = (fgz) ehwVar.b.a.cb.get();
        ivjVar.bz = (LayerableFilterEntityController) ehwVar.c.jP.get();
        ivjVar.cq = (aoae) ehwVar.c.gF.get();
        ivjVar.bA = (mbn) ehwVar.aa.get();
        ivjVar.bB = (mbb) ehwVar.ab.get();
        ivjVar.bC = (mdq) ehwVar.ac.get();
        ivjVar.bD = (sxw) ehwVar.b.a.ct.get();
        ivjVar.bE = (ajti) ehwVar.c.kg.get();
        ivjVar.bF = (ajzi) ehwVar.b.cK.get();
        ivjVar.bG = (aksl) ehwVar.b.ha.get();
        ivjVar.bH = (gni) ehwVar.b.eA.get();
        ivjVar.ci = ehwVar.c.mM();
        ivjVar.cc = ehwVar.c.my();
        ivjVar.bI = ghe.h();
        ivjVar.bJ = (nqp) ehwVar.c.gD.get();
        ivjVar.bK = (mfr) ehwVar.c.hE.get();
        ivjVar.bL = axqq.a(ehwVar.c.gi);
        ivjVar.bY = (axzg) ehwVar.b.wB.get();
        ivjVar.bM = (zgi) ehwVar.b.fH.get();
        ivjVar.bN = (HomePageMonitor) ehwVar.c.jJ.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public void ku(Context context) {
        super.ku(context);
        n();
        bF();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    @Override // defpackage.ce
    public Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        n();
        return this.a;
    }
}
