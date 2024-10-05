package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class kcm extends ce implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        r();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        a();
        r();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    @Override // defpackage.axql
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }

    protected final void r() {
        if (this.d) {
            return;
        }
        this.d = true;
        kcz kczVar = (kcz) this;
        ehw ehwVar = (ehw) lM();
        kczVar.a = (nys) ehwVar.c.dX.get();
        kczVar.b = (nyo) ehwVar.c.dX.get();
        kczVar.c = (zaw) ehwVar.b.iN.get();
        kczVar.d = (ypa) ehwVar.b.B.get();
        kczVar.e = (aioc) ehwVar.c.n.get();
        kczVar.ae = (YouTubePlayerOverlaysLayout) ehwVar.c.dm.get();
        kczVar.af = ehwVar.c.nx;
        kczVar.ag = (evb) ehwVar.at.get();
        kczVar.ah = ehwVar.c.M();
        kczVar.ai = (ahff) ehwVar.b.hU.get();
        kcp kcpVar = (kcp) ((aioc) ehwVar.c.n.get()).A();
        ayaw.k(kcpVar);
        kczVar.aj = kcpVar;
        kczVar.ak = (aila) ehwVar.au.get();
        kczVar.al = (kcg) ehwVar.c.ny.get();
        kczVar.am = (wmt) ehwVar.b.rZ.get();
        kczVar.an = (ahqr) ehwVar.b.rx.get();
        kczVar.ao = (acra) ehwVar.c.ay.get();
        kczVar.ap = (aiwu) ehwVar.b.vm.get();
        kczVar.aq = (addn) ehwVar.c.ed.get();
        eed eedVar = ehwVar.c;
        kczVar.ar = eedVar.bI;
        kczVar.as = eedVar.nz;
        kczVar.at = (ahor) eedVar.af.get();
        kczVar.au = (adlt) ehwVar.b.ja.get();
        kczVar.av = (PlayerCollapsedStateMonitor) ehwVar.av.get();
        kczVar.aw = (kce) ehwVar.c.nA.get();
        kczVar.ax = (kcq) ehwVar.aw.get();
        kczVar.ay = ehwVar.c.ji();
        aihl x = ((aioc) ehwVar.c.n.get()).x();
        ayaw.k(x);
        kczVar.az = x;
        kczVar.aA = ehwVar.c.jg();
        kczVar.aB = (ahhc) ehwVar.b.uz.get();
        kczVar.aC = (kcu) ehwVar.ax.get();
        kczVar.aD = ehwVar.c.dJ;
        kczVar.aE = (fcv) ehwVar.b.wZ.get();
        kczVar.aF = (gph) ehwVar.c.je.get();
        kczVar.aG = (zaz) ehwVar.c.B.get();
        kczVar.aH = (BandaidConnectionOpenerController) ehwVar.b.wx.get();
        kczVar.aI = ehwVar.b.wG;
        kczVar.aJ = (flc) ehwVar.c.ap.get();
        kczVar.aK = (ojg) ehwVar.c.bq.get();
        kczVar.aL = (fln) ehwVar.c.aZ.get();
        kczVar.aM = (okf) ehwVar.c.ao.get();
        kczVar.aN = (fgq) ehwVar.c.A.get();
        kczVar.aU = (aadw) ehwVar.b.D.get();
        kczVar.aO = (aaea) ehwVar.b.K.get();
        kczVar.aP = (Executor) ehwVar.b.Q.get();
        kczVar.aQ = (fuj) ehwVar.b.ri.get();
        kczVar.aV = ehwVar.c.gQ();
        kczVar.aR = (gni) ehwVar.b.eA.get();
        kczVar.aS = (gpe) ehwVar.c.by.get();
    }
}
