package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ifq extends iio implements axql {
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
    public void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        mC();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public void ku(Context context) {
        super.ku(context);
        a();
        mC();
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
    /* renamed from: mB, reason: merged with bridge method [inline-methods] */
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

    protected final void mC() {
        if (this.d) {
            return;
        }
        this.d = true;
        ijo ijoVar = (ijo) this;
        ehw ehwVar = (ehw) lM();
        ijoVar.d = (ion) ehwVar.b.vG.get();
        ijoVar.bv = (abig) ehwVar.b.vI.get();
        ijoVar.e = (hbb) ehwVar.b.lN.get();
        ijoVar.ae = (ihl) ehwVar.H.get();
        ijoVar.af = (ifz) ehwVar.c.hK.get();
        ijoVar.bB = (aoae) ehwVar.b.vu.get();
        ijoVar.ag = (imu) ehwVar.b.a.cl.get();
        ijoVar.bA = (amsj) ehwVar.c.mM.get();
        ijoVar.ah = (ReelPlaybackErrorLogger) ehwVar.c.mN.get();
        ijoVar.ai = new ihq((ili) ehwVar.c.hD.get(), (vgz) ehwVar.b.a.cm.get(), (acqz) ehwVar.c.P.get(), (ilm) ehwVar.E.get());
        eed eedVar = ehwVar.c;
        ijoVar.bw = new nmc(eedVar.f, ehwVar.b.kp, eedVar.mO, eedVar.P, ehwVar.M, ehwVar.E, ehwVar.N, ehwVar.O, ehwVar.T, (byte[]) null, (byte[]) null);
        ijoVar.aj = (ihn) ehwVar.b.lM.get();
        ijoVar.ak = (ijr) ehwVar.I.get();
        ijoVar.al = (ili) ehwVar.c.hD.get();
        ijoVar.am = (ijz) ehwVar.D.get();
        ijoVar.an = new ihy((acqz) ehwVar.c.P.get(), (ilm) ehwVar.E.get(), (ilp) ehwVar.G.get());
        ijoVar.bx = new jgp(ehwVar.c.hD, ehwVar.E, (short[]) null);
        ijoVar.ao = (ifw) ehwVar.b.a.aZ.get();
        ijoVar.bz = (amsj) ehwVar.S.get();
        ijoVar.ap = (ekm) ehwVar.b.rB.get();
        ijoVar.aq = ehwVar.c.jh();
        aigv aH = ((aioc) ehwVar.c.a.vH.get()).aH();
        ayaw.k(aH);
        ijoVar.bs = aH;
        aifs s = ((aioc) ehwVar.c.a.vH.get()).s();
        ayaw.k(s);
        ijoVar.ar = s;
        ijoVar.as = ehwVar.c.jf();
        ijoVar.at = (aioc) ehwVar.b.vH.get();
        ijoVar.au = (shf) ehwVar.b.g.get();
        ijoVar.av = (ypa) ehwVar.b.B.get();
        ijoVar.aw = (ajjz) ehwVar.b.kp.get();
        ijoVar.ax = (aahd) ehwVar.c.I.get();
        ijoVar.ay = (afsy) ehwVar.b.au.get();
        ijoVar.az = (aftn) ehwVar.b.uZ.get();
        ijoVar.aA = (zaw) ehwVar.b.iN.get();
        ijoVar.aB = ehwVar.c.kk();
        ijoVar.aC = (acqz) ehwVar.c.P.get();
        ijoVar.aD = (ahqr) ehwVar.b.rx.get();
        ijoVar.aE = axqq.a(ehwVar.b.eA);
        ijoVar.aF = ehwVar.c.g();
        ijoVar.aG = (Handler) ehwVar.b.an.get();
        ijoVar.aH = (ahxn) ehwVar.U.get();
        ijoVar.aI = (SubtitlesOverlayPresenter) ehwVar.V.get();
        ijoVar.aJ = (ahxv) ehwVar.c.mQ.get();
        ijoVar.aK = axqq.a(ehwVar.W);
        ijoVar.aL = axqq.a(ehwVar.X);
        ijoVar.aM = axqq.a(ehwVar.c.cE);
        ijoVar.aN = axqq.a(ehwVar.c.mR);
        ijoVar.aO = (zfe) ehwVar.b.hB.get();
        ijoVar.aP = (ysy) ehwVar.b.as.get();
        ijoVar.aQ = (afhz) ehwVar.b.gs.get();
        ijoVar.bu = ehwVar.b.kr();
        ijoVar.aR = (afqj) ehwVar.b.hk.get();
        ijoVar.bt = (aadw) ehwVar.b.D.get();
        ijoVar.aS = (aaea) ehwVar.b.K.get();
        ijoVar.aT = ehwVar.b.gU();
        ijoVar.aU = ehwVar.b.gW();
        ijoVar.aV = ehwVar.b.gX();
        ijoVar.aW = (acsh) ehwVar.b.a.s.get();
        ijoVar.aX = ehwVar.c.jx();
        ijoVar.aY = amsx.r((aoj) ehwVar.c.mN.get());
        ijoVar.aZ = (ywr) ehwVar.b.hL.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
