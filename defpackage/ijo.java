package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPauseLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import defpackage.aok;
import defpackage.igs;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ijo extends ifq implements iiq, ilw, ilx, ilm, ika, imv, imm, ihp, hax, haz, ijq, ekj, ihh {
    static final String a = String.valueOf(iio.class.getName()).concat("$ReelSequenceControllerStateKey");
    static final String b = String.valueOf(ijo.class.getName()).concat("$ReelSequenceControllerStateKey");
    public static final /* synthetic */ int bC = 0;
    public zaw aA;
    public Optional aB;
    public acqz aC;
    public ahqr aD;
    public axpg aE;
    public Context aF;
    public Handler aG;
    public ahxn aH;
    public SubtitlesOverlayPresenter aI;
    public ahxv aJ;
    public axpg aK;
    public axpg aL;
    public axpg aM;
    public axpg aN;
    public zfe aO;
    public ysy aP;
    public afhz aQ;
    public afqj aR;
    public aaea aS;
    public amnv aT;
    public amnv aU;
    public amnv aV;
    public acsh aW;
    public ajlx aX;
    public Set aY;
    public ywr aZ;
    public ihl ae;
    public ifz af;
    public imu ag;
    public ReelPlaybackErrorLogger ah;
    public ihq ai;
    public ihn aj;
    public ijr ak;
    public ili al;
    public ijz am;
    public ihy an;
    public ifw ao;
    public ekm ap;
    public ainy aq;
    public aifs ar;
    public ainl as;
    public aioc at;
    public shf au;
    public ypa av;
    public ajjz aw;
    public aahd ax;
    public afsy ay;
    public aftn az;
    public amsj bA;
    public aoae bB;
    private ReelRecyclerView bD;
    private apxf bE;
    private ijn bF;
    private apxf bN;
    private long bO;
    private long bP;
    private boolean bR;
    public arsd ba;
    public ill bb;
    public ReelPlayerView bc;
    public Bundle bd;
    public String be;
    public PlaybackStartDescriptor bf;
    public boolean bg;
    public ihz bi;
    public ijp bj;
    public String bk;
    public apxf bn;
    public Runnable bp;
    public boolean bq;
    public boolean br;
    public aigv bs;
    public aadw bt;
    public advv bu;
    public abig bv;
    public nmc bw;
    public jgp bx;
    public ammr by;
    public amsj bz;
    public ion d;
    public hbb e;
    public final afkn c = new ije(this);
    public int bh = 0;
    private boolean bG = false;
    private boolean bH = false;
    private boolean bI = false;
    final ijm bl = new ijm(this);
    final ijk bm = new ijk(this);
    private final ayqw bJ = new ayqw();
    private final azrj bK = azrj.W();
    private final azrs bL = azrh.e().aT();
    private final azrs bM = azrh.e().aT();
    public final Object bo = new Object();
    private boolean bQ = true;

    public static ijo aF(Bundle bundle) {
        bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor").getClass();
        ijo ijoVar = new ijo();
        ijoVar.af(bundle);
        return ijoVar;
    }

    static ily aH(Optional optional) {
        if (!optional.isPresent()) {
            return null;
        }
        iin iinVar = ((ihm) optional.get()).f;
        if (iinVar instanceof iim) {
            return ((iim) iinVar).v;
        }
        return null;
    }

    private final int bB(boolean z) {
        aulq aulqVar;
        arsd arsdVar = this.ba;
        if (arsdVar == null) {
            return 1;
        }
        aukf q = gfw.q(arsdVar);
        if (q == null || (q.b & 512) == 0) {
            aulqVar = null;
        } else {
            aulqVar = q.l;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
        }
        aomf o = gfw.o(aulqVar);
        arsd arsdVar2 = this.ba;
        if ((arsdVar2.b & 16) == 0) {
            if (z) {
                return bA(ihk.b(o));
            }
            return 1;
        }
        apxf apxfVar = arsdVar2.g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ba(apxfVar, 1, null);
        if (o != null) {
            bu(o);
        }
        aifz d = PlaybackStartDescriptor.d();
        d.a = this.bn;
        this.as.a(new aims(aimr.JUMP, d.a(), imu.a((acsx) this.aj.a().orElse(null), imu.g(aJ()), false, null)));
        ily aG = aG();
        if (aG == null) {
            return 2;
        }
        aG.d.e();
        return 2;
    }

    private final int bC(boolean z) {
        if (this.ba == null) {
            return 1;
        }
        int bi = bi(false, false);
        if (bi == 1 && z) {
            bi = bB(false);
        }
        if (bi != 1) {
            return bi;
        }
        if (this.ae.x) {
            return bh(ihk.a(2), false);
        }
        return bA(ihk.a(2));
    }

    private static final aukk bD(aukf aukfVar) {
        if (aukfVar == null) {
            return null;
        }
        aukl auklVar = aukfVar.h;
        if (auklVar == null) {
            auklVar = aukl.a;
        }
        if ((auklVar.b & 1) == 0) {
            return null;
        }
        aukl auklVar2 = aukfVar.h;
        if (auklVar2 == null) {
            auklVar2 = aukl.a;
        }
        aukk aukkVar = auklVar2.c;
        return aukkVar == null ? aukk.a : aukkVar;
    }

    private final int bo() {
        return hav.d(this.m).orElse(-1);
    }

    private final Optional bp() {
        if (bw()) {
            apxf apxfVar = this.bn;
            if (apxfVar == null) {
                return Optional.empty();
            }
            return Optional.of(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).d);
        }
        aryr aryrVar = ((arsd) Optional.ofNullable(this.ba).orElse(arsd.a)).e;
        if (aryrVar == null) {
            aryrVar = aryr.a;
        }
        aryx aryxVar = aryrVar.g;
        if (aryxVar == null) {
            aryxVar = aryx.a;
        }
        return Optional.of(aryxVar.c);
    }

    private final void bq(int i) {
        ily aG;
        ilb ilbVar;
        aujs aujsVar = this.aS.a().u;
        if (aujsVar == null) {
            aujsVar = aujs.a;
        }
        if (!aujsVar.l) {
            this.aD.m();
        }
        aI().I(3, new acqx(acsb.c(i)), null);
        this.aj.b();
        if (C() != null && (aG = aG()) != null && (ilbVar = aG.f) != null) {
            ilbVar.h();
        }
        apxf apxfVar = this.bE;
        if (apxfVar != null) {
            this.ax.a(apxfVar);
        }
    }

    private final void br() {
        if (!this.bH) {
            bt(1);
            return;
        }
        if (((gni) this.aE.get()).a() == gng.DARK) {
            bs();
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            C().getWindow().setStatusBarColor(wbs.Q(this.aF, R.attr.ytStatusBarBackground));
        } else {
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            View decorView = C().getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
    }

    private final void bs() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        View decorView = C().getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
    }

    private final void bt(int i) {
        Window window = C().getWindow();
        if (i == 0) {
            window.addFlags(1024);
            return;
        }
        if (i != 1) {
            window.clearFlags(1024);
            window.clearFlags(67108864);
            window.addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            window.setStatusBarColor(0);
            C().getWindow().getDecorView().setSystemUiVisibility(1280);
            bs();
            return;
        }
        window.clearFlags(-2080373760);
        this.O.setFitsSystemWindows(true);
    }

    private final void bu(aomf aomfVar) {
        apxf apxfVar = this.bn;
        if (apxfVar == null) {
            return;
        }
        if (aomfVar != null) {
            aI().u(new acqx(aomfVar), null);
            aong aongVar = (aong) this.bn.toBuilder();
            aongVar.copyOnWrite();
            apxf apxfVar2 = (apxf) aongVar.instance;
            apxfVar2.b |= 1;
            apxfVar2.c = aomfVar;
            this.bn = (apxf) aongVar.build();
            return;
        }
        aong aongVar2 = (aong) apxfVar.toBuilder();
        aongVar2.copyOnWrite();
        apxf apxfVar3 = (apxf) aongVar2.instance;
        apxfVar3.b &= -2;
        apxfVar3.c = apxf.a.c;
        this.bn = (apxf) aongVar2.build();
    }

    private final boolean bv() {
        return !this.aB.isPresent() || ((fla) this.aB.get()).b == fkw.REEL;
    }

    private final boolean bw() {
        return aJ().H;
    }

    private static boolean bx(PlaybackStartDescriptor playbackStartDescriptor) {
        return etx.al(etx.aa(playbackStartDescriptor)) == 12;
    }

    private final boolean by() {
        aujs aujsVar = this.aS.a().u;
        if (aujsVar == null) {
            aujsVar = aujs.a;
        }
        return aujsVar.j;
    }

    private final boolean bz() {
        return evr.au(this.bt) || bd();
    }

    @Override // defpackage.ifq, defpackage.ce
    public final void U(Activity activity) {
        this.bO = System.currentTimeMillis();
        super.U(activity);
    }

    @Override // defpackage.ce
    public final void X() {
        ci C;
        ImageView imageView;
        ily aG = aG();
        if (aG != null) {
            aG.e.d(true);
            aG.j.g();
            if (aG.s && aG.f != null && (C = C()) != null && !C.isFinishing()) {
                ilb ilbVar = aG.f;
                if (aJ().F && ((imageView = ilbVar.f) == null || imageView.getVisibility() != 0)) {
                    ilb ilbVar2 = aG.f;
                    ilbVar2.a(this.bc.d, Optional.empty());
                    ilbVar2.g();
                }
            }
        }
        if (this.bg) {
            this.ai.b();
        }
        if (this.an.e()) {
            this.an.b();
        }
        imu imuVar = this.ag;
        imuVar.k.c();
        imuVar.c();
        this.bB.L(this);
        ListIterator listIterator = this.bv.a.listIterator();
        while (listIterator.hasNext()) {
            imm immVar = (imm) ((WeakReference) listIterator.next()).get();
            if (immVar == this || immVar == null) {
                listIterator.remove();
            }
        }
        this.av.m(this.aj);
        this.bJ.c();
        this.av.m(this.bb.b.o);
        if (!bz()) {
            this.av.m(this.bl);
        }
        this.av.m(this.bm);
        if (bv()) {
            this.aq.a();
            this.aq.z(C().isFinishing());
        }
        this.aD.r(ahpe.a);
        super.X();
    }

    @Override // defpackage.ce
    public final void Z() {
        if (bg()) {
            this.aj.c("r_fr");
        }
        super.Z();
        this.bc.requestLayout();
        this.aB.ifPresent(gfd.l);
        if (bg()) {
            this.aj.c("r_fcp");
        }
        if (bz()) {
            this.bJ.g(this.bl.kI(this.at));
        } else {
            this.av.g(this.bl);
        }
        this.av.g(this.bm);
        if (by()) {
            this.bJ.g(this.aJ.kI(this.at));
            this.bJ.g(this.aI.kI(this.at));
        }
        this.bJ.g(this.bb.b.n.kI(this.at));
        this.bJ.g(this.bb.b.u.kI(this.at));
        this.av.g(this.bb.b.o);
        this.av.g(this.aj);
        ayqw ayqwVar = this.bJ;
        aypn M = this.at.V().n().M(gpd.i);
        ijm ijmVar = this.bl;
        ijmVar.getClass();
        aypn aypnVar = this.at.G().c;
        ijm ijmVar2 = this.bl;
        ijmVar2.getClass();
        ayqx Y = aypnVar.Y(new ijd(ijmVar2, 2), ggk.t);
        aypn ao = this.at.ao();
        ijm ijmVar3 = this.bl;
        ijmVar3.getClass();
        aypn ab = this.at.ab();
        ijm ijmVar4 = this.bl;
        ijmVar4.getClass();
        ayqwVar.g(M.X(new ijd(ijmVar, 0)), Y, ao.Y(new ijd(ijmVar3, 3), ggk.t), ab.Y(new ijd(ijmVar4, 1), ggk.t));
        this.bB.K(this);
        this.bv.c(this);
        PlaybackStartDescriptor playbackStartDescriptor = this.bf;
        if (playbackStartDescriptor != null) {
            ihl ihlVar = this.ae;
            final String l = playbackStartDescriptor.l();
            final String k = this.bf.k();
            if (l == null) {
                l = "";
            }
            if (k == null) {
                k = "";
            }
            final Long[] lArr = {Long.MIN_VALUE};
            ihlVar.n.J(new zfi() { // from class: igw
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    Long[] lArr2 = lArr;
                    String str = l;
                    String str2 = k;
                    ihm ihmVar = (ihm) obj;
                    if (lArr2[0].longValue() == Long.MIN_VALUE) {
                        ReelWatchEndpointOuterClass$ReelWatchEndpoint a2 = ihmVar.a();
                        if (str.equals(a2.d) && str2.equals(a2.e) && !ihmVar.b) {
                            lArr2[0] = Long.valueOf(ihmVar.a);
                        }
                    }
                }
            });
            long longValue = lArr[0].longValue();
            if (longValue != Long.MIN_VALUE) {
                ihl ihlVar2 = this.ae;
                iiv iivVar = new iiv(this);
                if (longValue != Long.MIN_VALUE) {
                    ihlVar2.H = iivVar;
                    int B = ihlVar2.n.B(longValue);
                    if (ihlVar2.w == Long.MIN_VALUE) {
                        ihlVar2.w = longValue;
                    }
                    if (B >= 0) {
                        ihlVar2.y = B;
                        ihlVar2.o.aa(B);
                    }
                }
            }
        }
        ily aG = aG();
        if (aG != null) {
            aG.d.e();
        }
        bt(true == this.bI ? 2 : 0);
        ijf ijfVar = new ijf(this);
        if (bg()) {
            this.aj.c("r_fgw");
        }
        this.bc.getViewTreeObserver().addOnGlobalLayoutListener(ijfVar);
        if (this.bc.getWidth() == 0 || this.bc.getHeight() == 0) {
            return;
        }
        ijfVar.onGlobalLayout();
    }

    @Override // defpackage.hax
    public final ayph a() {
        return this.bK.x();
    }

    @Override // defpackage.ilm
    public final ily aG() {
        return aH(this.ae.g());
    }

    public final acra aI() {
        return this.aC.mM();
    }

    public final aujz aJ() {
        arfd a2 = this.aS.a();
        if (a2 == null) {
            a2 = arfd.a;
        }
        aujs aujsVar = a2.u;
        if (aujsVar == null) {
            aujsVar = aujs.a;
        }
        aujz aujzVar = aujsVar.d;
        return aujzVar == null ? aujz.a : aujzVar;
    }

    public final aukf aK() {
        arsd arsdVar = this.ba;
        if (arsdVar == null) {
            return null;
        }
        aukg aukgVar = arsdVar.d;
        if (aukgVar == null) {
            aukgVar = aukg.a;
        }
        if ((aukgVar.b & 1) == 0) {
            return null;
        }
        aukg aukgVar2 = this.ba.d;
        if (aukgVar2 == null) {
            aukgVar2 = aukg.a;
        }
        aukf aukfVar = aukgVar2.c;
        return aukfVar == null ? aukf.a : aukfVar;
    }

    public final aukv aL() {
        Optional g = this.ae.g();
        if (!g.isPresent()) {
            return null;
        }
        ihm ihmVar = (ihm) g.get();
        if (!ihmVar.b) {
            return null;
        }
        aulq aulqVar = ihmVar.a().p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return (aukv) aulqVar.pX(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
    }

    public final void aM() {
        zev.c(qR(), this.bc, qR().getString(R.string.reel_accessibility_playback_ended));
    }

    public final void aN(int i) {
        bq(i);
        ci C = C();
        if (C != null) {
            aujl aujlVar = this.bt.b().E;
            if (aujlVar == null) {
                aujlVar = aujl.a;
            }
            if (!aujlVar.b) {
                C.finishAfterTransition();
                C.overridePendingTransition(0, true != this.bG ? R.anim.reel_activity_slide_down : R.anim.reel_activity_slide_out_right);
            }
            this.bK.sh();
        }
    }

    public final void aO() {
        PlaybackStartDescriptor playbackStartDescriptor = this.bf;
        if (playbackStartDescriptor == null) {
            gfw.v(1, "No playbackStartDescriptor available when loadPlaybackService called.");
            return;
        }
        playbackStartDescriptor.e = this.bR && !TextUtils.isEmpty(playbackStartDescriptor.l());
        this.bR = false;
        this.as.e(this.bf, imu.a((acsx) this.aj.a().orElse(null), imu.g(aJ()), false, null));
    }

    public final void aP() {
        Runnable runnable;
        synchronized (this.bo) {
            if ((this.bq || this.br) && ((this.bQ || !aJ().B) && (runnable = this.bp) != null)) {
                this.aG.post(runnable);
                this.bp = null;
            }
        }
    }

    @Override // defpackage.ilw
    public final void aQ() {
        C().onBackPressed();
    }

    @Override // defpackage.ilw
    public final void aR() {
        aukf aK = aK();
        if (aK != null) {
            auke aukeVar = aK.f;
            if (aukeVar == null) {
                aukeVar = auke.a;
            }
            aukd aukdVar = aukeVar.c;
            if (aukdVar == null) {
                aukdVar = aukd.a;
            }
            if ((aukdVar.b & 4) != 0) {
                auke aukeVar2 = aK.f;
                if (aukeVar2 == null) {
                    aukeVar2 = auke.a;
                }
                aukd aukdVar2 = aukeVar2.c;
                if (aukdVar2 == null) {
                    aukdVar2 = aukd.a;
                }
                if ((aukdVar2.b & 64) != 0) {
                    aI().I(3, new acqx(aukdVar2.h), null);
                }
                aahd aahdVar = this.ax;
                apxf apxfVar = aukdVar2.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        }
    }

    @Override // defpackage.imv
    public final void aS() {
        ijz ijzVar = this.am;
        acra mM = ijzVar.c.mM();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ijz.c(93504));
        arrayList.add(ijz.c(91958));
        arrayList.add(ijz.c(91957));
        arrayList.add(ijz.c(114670));
        arrayList.add(ijz.c(91955));
        arrayList.add(ijz.c(93502));
        arrayList.add(ijz.c(91953));
        arrayList.add(ijz.c(93500));
        arrayList.add(ijz.c(91956));
        arrayList.add(ijz.c(93503));
        arrayList.add(ijz.c(91954));
        arrayList.add(ijz.c(93501));
        if (ijzVar.h && ijzVar.g) {
            arrayList.add(ijz.c(134942));
        }
        mM.m(arrayList);
        if (this.bg) {
            ihq ihqVar = this.ai;
            if (ihqVar.h != null) {
                int i = ihqVar.a;
                if ((i & 1) == 0) {
                    ihqVar.a = i | 1;
                    ihqVar.c.mM().n(new acqx(ihqVar.h));
                    ihqVar.d();
                }
            }
        }
    }

    @Override // defpackage.imm
    public final void aT(aros arosVar, arot arotVar) {
        int bh = anaf.bh(arotVar.c);
        if (bh != 0 && bh == 2) {
            hbb hbbVar = this.e;
            String str = arosVar.d;
            synchronized (hbbVar.a) {
                hbbVar.a.remove(str);
            }
            if (bC(true) == 1) {
                aN(37419);
            }
        }
    }

    @Override // defpackage.imv
    public final void aU(final long j, final arsd arsdVar, boolean z) {
        String str;
        final long j2;
        if (bw()) {
            str = (String) bp().orElse("");
        } else {
            if (arsdVar != null) {
                aryr aryrVar = arsdVar.e;
                if (aryrVar == null) {
                    aryrVar = aryr.a;
                }
                if ((aryrVar.b & 8) != 0) {
                    aryr aryrVar2 = arsdVar.e;
                    if (aryrVar2 == null) {
                        aryrVar2 = aryr.a;
                    }
                    aryx aryxVar = aryrVar2.g;
                    if (aryxVar == null) {
                        aryxVar = aryx.a;
                    }
                    str = aryxVar.c;
                }
            }
            str = null;
        }
        if ((arsdVar.b & 4096) != 0) {
            apxf apxfVar = arsdVar.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            this.bN = apxfVar;
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (bw()) {
                str = reelWatchEndpointOuterClass$ReelWatchEndpoint.d;
            }
            apxf apxfVar2 = this.bN;
            this.bn = apxfVar2;
            ihl ihlVar = this.ae;
            ihlVar.o(j, apxfVar2);
            if (j == ihlVar.w && apxfVar2.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                ihlVar.D.a = !etx.aj(etx.Y((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)));
                ihlVar.D.b = ihl.s((aujz) ihlVar.c.get());
            }
            this.e.e(this.bN);
            this.bL.c(this.bN);
            this.aj.e(str);
            if (etx.al(reelWatchEndpointOuterClass$ReelWatchEndpoint) != 1) {
                ihn ihnVar = this.aj;
                int i = ihn.i(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                synchronized (ihnVar.a) {
                    if (ihnVar.c != null) {
                        int i2 = ihnVar.f;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i2 != i) {
                            ihnVar.f = i;
                            aone createBuilder = asmi.a.createBuilder();
                            createBuilder.copyOnWrite();
                            asmi asmiVar = (asmi) createBuilder.instance;
                            asmiVar.f = i - 1;
                            asmiVar.b |= 8;
                            asmi asmiVar2 = (asmi) createBuilder.build();
                            aone createBuilder2 = asmb.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            asmb asmbVar = (asmb) createBuilder2.instance;
                            asmiVar2.getClass();
                            asmbVar.y = asmiVar2;
                            asmbVar.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                            ihnVar.c.a((asmb) createBuilder2.build());
                        }
                    }
                }
            }
            ily aG = aG();
            if (aJ().G && this.al.d() && aG != null) {
                aG.f.f(reelWatchEndpointOuterClass$ReelWatchEndpoint);
            }
        }
        int bg = anaf.bg(arsdVar.h);
        if (bg == 0 || bg != 2) {
            synchronized (this.bo) {
                this.br = true;
            }
        }
        if ((arsdVar.b & 8192) != 0) {
            iij iijVar = this.ae.b;
            String str2 = arsdVar.l;
            if (!iijVar.l && !ammx.e(str2)) {
                iijVar.l = true;
                ioo a2 = iijVar.a.a();
                a2.a = str2;
                iijVar.a(iijVar.i, a2, 2);
            }
        }
        ihn ihnVar2 = this.aj;
        synchronized (ihnVar2.a) {
            if (ihnVar2.c == null || !ihnVar2.h(str)) {
                j2 = 0;
            } else {
                long c = ihnVar2.b.c();
                ihnVar2.c.c("ps_r");
                ihnVar2.c.c("r_wrr");
                aone createBuilder3 = asmi.a.createBuilder();
                int i3 = z ? 4 : 2;
                createBuilder3.copyOnWrite();
                asmi asmiVar3 = (asmi) createBuilder3.instance;
                asmiVar3.d = i3 - 1;
                asmiVar3.b = 2 | asmiVar3.b;
                asmi asmiVar4 = (asmi) createBuilder3.build();
                aone createBuilder4 = asmb.a.createBuilder();
                String str3 = true != z ? "warm" : "hot";
                createBuilder4.copyOnWrite();
                asmb asmbVar2 = (asmb) createBuilder4.instance;
                asmbVar2.b |= 16;
                asmbVar2.h = str3;
                createBuilder4.copyOnWrite();
                asmb asmbVar3 = (asmb) createBuilder4.instance;
                asmiVar4.getClass();
                asmbVar3.y = asmiVar4;
                asmbVar3.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                ihnVar2.c.a((asmb) createBuilder4.build());
                j2 = c - ihnVar2.d;
            }
        }
        if (aJ().x) {
            synchronized (this.bo) {
                if (this.bp != null) {
                    gfw.v(1, "Last delayed ReelItemPlayback not processed during playback");
                }
                final int i4 = 1;
                this.bp = new Runnable(this) { // from class: iiw
                    public final /* synthetic */ ijo a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i4 == 0) {
                            ijo ijoVar = this.a;
                            long j3 = j2;
                            long j4 = j;
                            arsd arsdVar2 = arsdVar;
                            ijoVar.bb.f(j3);
                            ijoVar.aV(j4, arsdVar2, j3);
                            return;
                        }
                        ijo ijoVar2 = this.a;
                        long j5 = j2;
                        long j6 = j;
                        arsd arsdVar3 = arsdVar;
                        ijoVar2.bb.f(j5);
                        ijoVar2.aV(j6, arsdVar3, j5);
                    }
                };
                aP();
            }
        } else {
            final int i5 = 0;
            C().runOnUiThread(new Runnable(this) { // from class: iiw
                public final /* synthetic */ ijo a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (i5 == 0) {
                        ijo ijoVar = this.a;
                        long j3 = j2;
                        long j4 = j;
                        arsd arsdVar2 = arsdVar;
                        ijoVar.bb.f(j3);
                        ijoVar.aV(j4, arsdVar2, j3);
                        return;
                    }
                    ijo ijoVar2 = this.a;
                    long j5 = j2;
                    long j6 = j;
                    arsd arsdVar3 = arsdVar;
                    ijoVar2.bb.f(j5);
                    ijoVar2.aV(j6, arsdVar3, j5);
                }
            });
        }
        if (arsdVar != null) {
            this.bM.c(arsdVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aV(long r16, defpackage.arsd r18, long r19) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijo.aV(long, arsd, long):void");
    }

    @Override // defpackage.imv
    public final void aW(final long j, final apxf apxfVar, final arsd arsdVar, final int i) {
        C().runOnUiThread(new Runnable() { // from class: iiu
            @Override // java.lang.Runnable
            public final void run() {
                ijo ijoVar = ijo.this;
                int i2 = i;
                arsd arsdVar2 = arsdVar;
                long j2 = j;
                apxf apxfVar2 = apxfVar;
                if (i2 == 0) {
                    if ((arsdVar2.b & 8) != 0) {
                        apxf apxfVar3 = arsdVar2.f;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        ijoVar.aZ(apxfVar3);
                        return;
                    }
                    return;
                }
                if (i2 == 1) {
                    if ((arsdVar2.b & 16) != 0) {
                        apxf apxfVar4 = arsdVar2.g;
                        if (apxfVar4 == null) {
                            apxfVar4 = apxf.a;
                        }
                        ijoVar.aZ(apxfVar4);
                        return;
                    }
                    return;
                }
                ihl ihlVar = ijoVar.ae;
                if (apxfVar2 == null || arsdVar2 == null) {
                    return;
                }
                Optional h = ihlVar.h(j2);
                if (h.isPresent()) {
                    ihm ihmVar = (ihm) h.get();
                    if (ihmVar.e == null) {
                        ihmVar.b(arsdVar2);
                        iin iinVar = ihmVar.f;
                        if (iinVar instanceof iim) {
                            ifw ifwVar = ihlVar.a;
                            apxf apxfVar5 = ihmVar.d;
                            aryr aryrVar = arsdVar2.e;
                            if (aryrVar == null) {
                                aryrVar = aryr.a;
                            }
                            ifwVar.d(apxfVar5, aryrVar);
                            String str = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) ihmVar.d.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).d;
                            ily ilyVar = ((iim) iinVar).v;
                            ilyVar.m(str, arsdVar2, j2, etx.ab(ihmVar.a()), ihmVar.c, ihmVar.a());
                            ilyVar.d.c();
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.imv
    public final void aX(apxf apxfVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = apxfVar == null ? null : (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        String str = reelWatchEndpointOuterClass$ReelWatchEndpoint == null ? null : reelWatchEndpointOuterClass$ReelWatchEndpoint.d;
        ijz ijzVar = this.am;
        ijzVar.f = this.ae.r;
        ijzVar.g = etx.ai(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        this.ak.a(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        ihn ihnVar = this.aj;
        synchronized (ihnVar.a) {
            if (ihnVar.c != null && ihnVar.h(str)) {
                ihnVar.c.c("r_wrs");
            }
        }
        this.by = null;
    }

    public final void aY() {
        AccessibilityManager accessibilityManager;
        iit iitVar = new iit(this, 2);
        if (!this.bg) {
            iitVar.run();
            return;
        }
        ihq ihqVar = this.ai;
        iiz iizVar = new iiz(iitVar, 0);
        ihqVar.g = null;
        if (ihqVar.d == null) {
            iizVar.run();
            return;
        }
        try {
            if (!((ioq) ihqVar.j.a().get(1000L, TimeUnit.MILLISECONDS)).b && (accessibilityManager = ihqVar.f) != null && !accessibilityManager.isTouchExplorationEnabled()) {
                ihqVar.g = iitVar;
                if (ihqVar.f()) {
                    ihqVar.a();
                    return;
                }
                etx.M(ihqVar.d, true);
                ihqVar.c(false);
                if (ihqVar.d != null && ihqVar.f() && ihqVar.i == 0) {
                    ihqVar.i = ihqVar.b.a();
                }
                ihqVar.h = acsb.c(84842);
                ihqVar.e();
                return;
            }
        } catch (Exception unused) {
        }
        ihqVar.a();
        iizVar.run();
    }

    public final void aZ(apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        ily aG = aG();
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 64) == 0 || aG == null) {
            return;
        }
        ilb ilbVar = aG.f;
        avgg avggVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        Uri C = ahbw.C(avggVar, ilbVar.e.getWidth(), ilbVar.e.getHeight());
        if (C != null) {
            ilbVar.a.l(C, ilbVar.l);
        }
    }

    @Override // defpackage.hax
    public final aypy b() {
        return this.bL.U();
    }

    public final void ba(apxf apxfVar, int i, acsx acsxVar) {
        this.bn = apxfVar;
        this.ba = null;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        String str = reelWatchEndpointOuterClass$ReelWatchEndpoint != null ? reelWatchEndpointOuterClass$ReelWatchEndpoint.d : null;
        this.aj.k(i, 4, reelWatchEndpointOuterClass$ReelWatchEndpoint, acsxVar, 0L);
        this.bb.e(0L);
        this.bb.f(0L);
        apxf apxfVar2 = this.bn;
        if (apxfVar2 != null && apxfVar2.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            ily aG = aG();
            if (aG != null) {
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint2.b & 64) != 0) {
                    aG.f.d(reelWatchEndpointOuterClass$ReelWatchEndpoint2);
                } else {
                    ilb ilbVar = aG.f;
                    ilbVar.j = false;
                    ilbVar.k = false;
                    ilbVar.i = null;
                    ilbVar.g.a(ilbVar.e);
                    whu.I(ilbVar.e, true);
                }
            }
        }
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
            this.ae.o(this.ae.f(), this.bn);
            this.e.e(this.bn);
        }
        this.aj.g(str, 0L);
    }

    public final void bb(final Runnable runnable) {
        runnable.getClass();
        int i = true != this.aP.o() ? R.string.reel_error_no_connection : R.string.reel_generic_error_message;
        final ily aG = aG();
        if (aG != null) {
            aG.d.d(O(i), new Runnable() { // from class: iiy
                @Override // java.lang.Runnable
                public final void run() {
                    ily ilyVar = ily.this;
                    Runnable runnable2 = runnable;
                    int i2 = ijo.bC;
                    ilyVar.d.b();
                    ilyVar.d.e();
                    runnable2.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean bd() {
        return this.at instanceof kvm;
    }

    @Override // defpackage.ika
    public final boolean be(long j) {
        ihl ihlVar = this.ae;
        return (ihlVar.r() && !ihlVar.b.k) || ihlVar.n.B(j) != ihlVar.n.z();
    }

    @Override // defpackage.ika
    public final boolean bf(long j) {
        ihl ihlVar = this.ae;
        return (ihlVar.r() && ihlVar.b.d()) || ihlVar.n.B(j) != ihlVar.n.y();
    }

    public final boolean bg() {
        aujz aujzVar;
        aaea aaeaVar = this.aS;
        if (aaeaVar == null) {
            aujzVar = null;
        } else {
            aujs aujsVar = aaeaVar.a().u;
            if (aujsVar == null) {
                aujsVar = aujs.a;
            }
            aujzVar = aujsVar.d;
            if (aujzVar == null) {
                aujzVar = aujz.a;
            }
        }
        return aujzVar != null && aujzVar.t;
    }

    public final int bh(ihk ihkVar, boolean z) {
        aukk bD;
        apxf apxfVar;
        if (this.aq.p() != null) {
            arsd arsdVar = this.ba;
            if (arsdVar != null && (apxfVar = this.bn) != null) {
                int i = arsdVar.b;
                if ((i & 16) == 0 && (i & 8) == 0) {
                    this.e.g(apxfVar);
                }
            }
            if (arsdVar != null) {
                int i2 = arsdVar.b;
                if ((i2 & 16) != 0 && (i2 & 8) == 0 && (bD = bD(aK())) != null) {
                    int i3 = bD.b;
                    if ((i3 & 1) != 0 && (i3 & 2) != 0 && bD.c == 2) {
                        hbb hbbVar = this.e;
                        apxf apxfVar2 = this.ba.g;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        hbbVar.g(apxfVar2);
                    }
                }
            }
            aone createBuilder = ReelWatchEndpointOuterClass$ReelWatchEndpoint.a.createBuilder();
            String p = this.aq.p();
            createBuilder.copyOnWrite();
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) createBuilder.instance;
            p.getClass();
            reelWatchEndpointOuterClass$ReelWatchEndpoint.b |= 8;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.e = p;
            createBuilder.copyOnWrite();
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) createBuilder.instance;
            reelWatchEndpointOuterClass$ReelWatchEndpoint2.b |= 16;
            reelWatchEndpointOuterClass$ReelWatchEndpoint2.f = 1;
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) createBuilder.build();
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, reelWatchEndpointOuterClass$ReelWatchEndpoint3);
            this.e.g((apxf) aongVar.build());
        }
        int t = this.ae.t(ihkVar);
        if (z && t == 1) {
            aM();
            if (!zev.e(qR())) {
                aN(37419);
                return 1;
            }
        }
        return t;
    }

    public final int bi(boolean z, boolean z2) {
        aulq aulqVar;
        aphc U;
        arsd arsdVar = this.ba;
        if (arsdVar == null) {
            return 1;
        }
        aukf q = gfw.q(arsdVar);
        if (q == null || (q.b & 256) == 0) {
            aulqVar = null;
        } else {
            aulqVar = q.k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
        }
        aomf o = gfw.o(aulqVar);
        arsd arsdVar2 = this.ba;
        if ((arsdVar2.b & 8) == 0) {
            if (!z2) {
                return 1;
            }
            if (!z) {
                return bh(ihk.b(o), true);
            }
            return bh(ihk.a(2), true);
        }
        apxf apxfVar = arsdVar2.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ba(apxfVar, true != z ? 2 : 5, null);
        if (z) {
            if (q != null && (q.b & 1024) != 0 && (U = etx.U(q)) != null) {
                bu(U.d);
            }
        } else if (o != null) {
            bu(o);
        }
        aifz d = PlaybackStartDescriptor.d();
        d.f = z;
        d.e = z;
        d.a = this.bn;
        this.as.a(new aims(aimr.JUMP, d.a(), imu.a((acsx) this.aj.a().orElse(null), imu.g(aJ()), false, null)));
        ily aG = aG();
        if (aG != null) {
            aG.d.e();
        }
        return 2;
    }

    @Override // defpackage.ika
    public final int bj() {
        arsd arsdVar;
        boolean z = true;
        if (this.ae.r && (arsdVar = this.ba) != null) {
            z = etx.aj(gfw.q(arsdVar));
        }
        return bi(false, z);
    }

    @Override // defpackage.ika
    public final int bk() {
        arsd arsdVar;
        boolean z = true;
        if (this.ae.r && (arsdVar = this.ba) != null) {
            aukf q = gfw.q(arsdVar);
            z = etx.aj(q);
            if ((this.ba.b & 16) == 0 && etx.aj(q)) {
                this.aq.U(0L);
                return 4;
            }
        }
        return bB(z);
    }

    @Override // defpackage.ika
    public final void bl() {
        bh(ihk.a(0), true);
    }

    @Override // defpackage.ika
    public final void bm() {
        bA(ihk.a(0));
    }

    @Override // defpackage.imv
    public final void bn(String str) {
        C().runOnUiThread(new iix(this, str, 1));
    }

    @Override // defpackage.hax
    public final void c() {
        br();
    }

    @Override // defpackage.hax
    public final void d() {
    }

    @Override // defpackage.hax
    public final boolean h() {
        if (this.ai.f()) {
            this.ai.b();
            return true;
        }
        if (this.an.e()) {
            this.an.b();
            return true;
        }
        if (bo() == 0) {
            bq(22156);
            return false;
        }
        br();
        return false;
    }

    @Override // defpackage.hax
    public final boolean k() {
        if (this.ai.f()) {
            this.ai.b();
            return false;
        }
        if (this.an.e()) {
            this.an.b();
            return false;
        }
        if (bo() == 0) {
            aN(22156);
            return false;
        }
        br();
        return true;
    }

    @Override // defpackage.ifq, defpackage.ce
    public final void ku(Context context) {
        this.bO = System.currentTimeMillis();
        super.ku(context);
    }

    @Override // defpackage.ce
    public final void lZ() {
        ihl ihlVar = this.ae;
        ihlVar.s = null;
        ihlVar.t = null;
        igu iguVar = ihlVar.n;
        synchronized (iguVar.d) {
            Iterator it = iguVar.d.iterator();
            while (it.hasNext()) {
                iin iinVar = ((ihm) it.next()).f;
                if (iinVar != null) {
                    iinVar.F();
                }
            }
            iguVar.d.clear();
        }
        iguVar.mw();
        this.bz.a.clear();
        this.ap.c(null);
        ion ionVar = this.d;
        if (ionVar.b == this.ae) {
            ionVar.b = null;
        }
        if (bv() && !this.aq.S()) {
            this.aq.s();
        }
        ReelRecyclerView reelRecyclerView = this.bD;
        if (reelRecyclerView != null) {
            this.aX.b(reelRecyclerView);
        }
        if (bd()) {
            this.bj.b(aI());
        }
        super.lZ();
    }

    @Override // defpackage.haz
    public final void m(Object obj) {
        if (obj instanceof ijn) {
            this.bF = (ijn) obj;
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        ReelToReelList reelToReelList;
        PlaybackStartDescriptor playbackStartDescriptor;
        aujz aujzVar = null;
        PlaybackServiceState l = bv() ? this.aq.l(true) : null;
        if (l != null && (playbackStartDescriptor = l.a) != null) {
            if (this.bN == null || !etx.af(playbackStartDescriptor)) {
                bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", l.a);
            } else {
                aifz d = PlaybackStartDescriptor.d();
                d.a = this.bN;
                bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", d.a());
            }
        }
        if (this.ae.r()) {
            aaea aaeaVar = this.aS;
            if (aaeaVar != null) {
                aujs aujsVar = aaeaVar.a().u;
                if (aujsVar == null) {
                    aujsVar = aujs.a;
                }
                aujzVar = aujsVar.d;
                if (aujzVar == null) {
                    aujzVar = aujz.a;
                }
            }
            if (aujzVar != null && aujzVar.y) {
                reelToReelList = new ReelToReelList(amru.q(), amru.q());
                bundle.putParcelable("ReelToReelListBundleKey", reelToReelList);
                String str = a;
                iij iijVar = this.ae.b;
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("ReelSequenceController.IS_INITIALIZED_KEY", iijVar.l);
                bundle2.putParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY", iijVar.h);
                bundle2.putParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY", iijVar.i);
                bundle2.putBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY", iijVar.k);
                bundle.putBundle(str, bundle2);
                bundle.putBoolean("UseRpcSequenceKey", this.ae.r());
                bundle.putString(b, this.aC.mM().k());
            }
        }
        reelToReelList = new ReelToReelList(this.ae.i(), this.ae.j());
        bundle.putParcelable("ReelToReelListBundleKey", reelToReelList);
        String str2 = a;
        iij iijVar2 = this.ae.b;
        Bundle bundle22 = new Bundle();
        bundle22.putBoolean("ReelSequenceController.IS_INITIALIZED_KEY", iijVar2.l);
        bundle22.putParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY", iijVar2.h);
        bundle22.putParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY", iijVar2.i);
        bundle22.putBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY", iijVar2.k);
        bundle.putBundle(str2, bundle22);
        bundle.putBoolean("UseRpcSequenceKey", this.ae.r());
        bundle.putString(b, this.aC.mM().k());
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        this.bP = this.au.c();
        super.mR(bundle);
        this.ak.h(this);
        this.bi = new ihz(this.aW, this.ag, this.d);
        this.bj = new ijp(this.aW, this.ag);
        amxd listIterator = ((amwf) this.aY).listIterator();
        while (listIterator.hasNext()) {
            this.X.b((aoj) listIterator.next());
        }
        if (bundle != null) {
            this.bd = bundle.getBundle(a);
            this.be = bundle.getString(b);
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        if (bg()) {
            this.aj.c("r_fs");
        }
        super.mS();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x03d2, code lost:
    
        if (r3.e != false) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f4 A[EDGE_INSN: B:123:0x02f4->B:124:0x02f4 BREAK  A[LOOP:3: B:112:0x02be->B:121:0x02f1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r34, android.view.ViewGroup r35, android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijo.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.ihh
    public final void n(int i) {
        synchronized (this.bo) {
            this.bQ = i == 0;
            aP();
        }
    }

    @Override // defpackage.iiq
    public final /* bridge */ /* synthetic */ aoj o() {
        jgp jgpVar = this.bx;
        ili iliVar = (ili) jgpVar.b.get();
        iliVar.getClass();
        ilm ilmVar = (ilm) jgpVar.a.get();
        ilmVar.getClass();
        return new ReelPauseLifecycleObserver(iliVar, ilmVar);
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ReelPlayerView reelPlayerView = this.bc;
        if (reelPlayerView == null) {
            afsi.b(2, 24, "null playerView in ReelWatchFragment#onConfigurationChanged");
            ci C = C();
            if (C != null) {
                C.finish();
                return;
            }
            return;
        }
        int width = reelPlayerView.getWidth();
        int height = this.bc.getHeight();
        ViewTreeObserver viewTreeObserver = this.bc.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ijg(this, width, height, viewTreeObserver));
    }

    @Override // defpackage.iiq
    public final aujq p() {
        return (aujq) this.ae.g().map(ham.n).map(ham.p).orElse(aujq.REEL_LOOP_BEHAVIOR_UNKNOWN);
    }

    @Override // defpackage.iiq
    public final void q(String str) {
        Optional bp = bp();
        if (!bp.isPresent() || !((String) bp.get()).equals(str)) {
            whu.K(qR(), R.string.reel_overflow_menu_error, 0);
            return;
        }
        asew asewVar = ((aukf) Optional.ofNullable(aK()).orElse(aukf.a)).i;
        if (asewVar == null) {
            asewVar = asew.a;
        }
        if (this.ay.t()) {
            bc(asewVar);
        } else {
            this.az.c(C(), null, new ijh(this, asewVar));
        }
    }

    @Override // defpackage.iiq
    public final void r(atdc atdcVar) {
        final aone builder = atdcVar.toBuilder();
        ynm.n(M(), this.aZ.a(), hue.m, new zfi() { // from class: ijb
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ijo ijoVar = ijo.this;
                aone aoneVar = builder;
                awwk awwkVar = (awwk) obj;
                if (awwkVar != null && awwkVar.d) {
                    aone createBuilder = atdb.a.createBuilder();
                    aqyg h = ajcq.h(ijoVar.qX().getString(R.string.reel_nerd_stats));
                    createBuilder.copyOnWrite();
                    atdb atdbVar = (atdb) createBuilder.instance;
                    h.getClass();
                    atdbVar.c = h;
                    atdbVar.b |= 1;
                    aong aongVar = (aong) arfs.a.createBuilder();
                    arfr arfrVar = arfr.NERD_STATS;
                    aongVar.copyOnWrite();
                    arfs arfsVar = (arfs) aongVar.instance;
                    arfsVar.c = arfrVar.pV;
                    arfsVar.b |= 1;
                    createBuilder.copyOnWrite();
                    atdb atdbVar2 = (atdb) createBuilder.instance;
                    arfs arfsVar2 = (arfs) aongVar.build();
                    arfsVar2.getClass();
                    atdbVar2.d = arfsVar2;
                    atdbVar2.b |= 2;
                    aong aongVar2 = (aong) apxf.a.createBuilder();
                    aongVar2.e(atmf.b, atmf.a);
                    createBuilder.copyOnWrite();
                    atdb atdbVar3 = (atdb) createBuilder.instance;
                    apxf apxfVar = (apxf) aongVar2.build();
                    apxfVar.getClass();
                    atdbVar3.e = apxfVar;
                    atdbVar3.b |= 4;
                    atdb atdbVar4 = (atdb) createBuilder.build();
                    aone createBuilder2 = atda.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    atda atdaVar = (atda) createBuilder2.instance;
                    atdbVar4.getClass();
                    atdaVar.c = atdbVar4;
                    atdaVar.b |= 1;
                    aoneVar.aE(createBuilder2);
                }
            }
        });
        atdc atdcVar2 = (atdc) builder.build();
        ci C = C();
        ily aG = aG();
        if (aG == null) {
            return;
        }
        ajxy ajxyVar = new ajxy() { // from class: ijc
            @Override // defpackage.ajxy
            public final void a(atda atdaVar) {
                ijo ijoVar = ijo.this;
                if (atdaVar == null || ijoVar.bg) {
                    return;
                }
                ijoVar.an.d();
            }
        };
        final igs igsVar = (igs) this.aL.get();
        final ilr ilrVar = aG.d;
        final Optional of = Optional.of(ajxyVar);
        if (igsVar.e != null || C.getSupportFragmentManager().Y()) {
            return;
        }
        igsVar.e = igt.aI(atdcVar2, igsVar.a, igsVar.d);
        igsVar.e.ag = new ajxy() { // from class: igr
            @Override // defpackage.ajxy
            public final void a(atda atdaVar) {
                igs igsVar2 = igs.this;
                Optional optional = of;
                HashMap hashMap = new HashMap();
                hashMap.put(acrc.b, Boolean.TRUE);
                if (adyu.dl(atdaVar) != null) {
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", igsVar2.e);
                    igsVar2.b.c(adyu.dl(atdaVar), hashMap);
                } else if (adyu.dk(atdaVar) != null) {
                    igsVar2.b.c(adyu.dk(atdaVar), hashMap);
                } else if (optional.isPresent()) {
                    ((ajxy) optional.get()).a(atdaVar);
                }
            }
        };
        igsVar.e.X.b(new any() { // from class: com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelMenuBottomSheetController$1
            private int c = 0;

            @Override // defpackage.aoa
            public final /* synthetic */ void lc(aok aokVar) {
            }

            @Override // defpackage.any, defpackage.aoa
            public final void lg(aok aokVar) {
                ilrVar.a(false);
                this.c = igs.this.c.b();
            }

            @Override // defpackage.any, defpackage.aoa
            public final void lh(aok aokVar) {
                ilrVar.a(true);
                igs.this.c.c(this.c);
                this.c = 0;
                igs.this.e = null;
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
        });
        igsVar.e.qi(C.getSupportFragmentManager(), null);
    }

    @Override // defpackage.iiq
    public final void s() {
        ahwu ahwuVar = this.bb.b;
        ahwuVar.f();
        this.bb.g(ahwuVar.p);
    }

    private final int bA(ihk ihkVar) {
        ihl ihlVar = this.ae;
        int i = ihlVar.y;
        if (i <= 0) {
            this.aq.U(0L);
            return 4;
        }
        ihlVar.g.g();
        ihlVar.A = ihkVar;
        ihlVar.o.a(true);
        int i2 = i - 1;
        ihlVar.z = i2;
        ihlVar.o.ak(i2);
        return 3;
    }

    @Override // defpackage.haz
    public final Object l() {
        aujz aujzVar;
        aaea aaeaVar = this.aS;
        if (aaeaVar == null) {
            aujzVar = null;
        } else {
            aujs aujsVar = aaeaVar.a().u;
            if (aujsVar == null) {
                aujsVar = aujs.a;
            }
            aujzVar = aujsVar.d;
            if (aujzVar == null) {
                aujzVar = aujz.a;
            }
        }
        if (aujzVar == null || !aujzVar.z) {
            return null;
        }
        return new ijn(new ReelToReelList(this.ae.i(), this.ae.j()));
    }

    public final void bc(asew asewVar) {
        ily aG;
        atdc atdcVar;
        aumb aumbVar;
        int i = asewVar.b;
        if (i == 113762946) {
            ajrn ajrnVar = (ajrn) this.aM.get();
            if (asewVar.b == 113762946) {
                aumbVar = (aumb) asewVar.c;
            } else {
                aumbVar = aumb.a;
            }
            ajrnVar.c(aumbVar, this.aN.get());
            return;
        }
        if (i != 66439850 || (aG = aG()) == null) {
            return;
        }
        final iif iifVar = (iif) this.aK.get();
        ci C = C();
        View view = aG.a.j() == 4 ? aG.g : aG.h;
        final ilr ilrVar = aG.d;
        int j = aG.a.j();
        if (asewVar.b == 66439850) {
            atdcVar = (atdc) asewVar.c;
        } else {
            atdcVar = atdc.a;
        }
        final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C, R.style.ReelTheme_NoActionBar_FullScreen_Light);
        final AtomicReference atomicReference = new AtomicReference();
        ajnq ajnqVar = new ajnq();
        final ajuu ajuuVar = new ajuu() { // from class: iic
            @Override // defpackage.ajuu
            public final Map a() {
                return null;
            }
        };
        final ajuv ajuvVar = new ajuv() { // from class: iid
            @Override // defpackage.ajuv
            public final void a() {
                ((vh) atomicReference.get()).k();
            }
        };
        iie iieVar = new iie(ajnqVar, new ajoq() { // from class: iib
            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                iif iifVar2 = iif.this;
                return new ajvv(contextThemeWrapper, iifVar2.a, ajuuVar, ajuvVar);
            }
        });
        iieVar.a(atda.class);
        ajoa e = iifVar.d.e(iieVar.a);
        ajpd ajpdVar = new ajpd();
        e.h(ajpdVar);
        ajpdVar.addAll(atdcVar.c);
        int v = whu.v(contextThemeWrapper, e, new FrameLayout(contextThemeWrapper));
        float dimension = contextThemeWrapper.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp);
        vh vhVar = new vh(contextThemeWrapper);
        atomicReference.set(vhVar);
        vhVar.j = j != 4 ? 8388661 : 8388693;
        Resources resources = contextThemeWrapper.getResources();
        vhVar.r((int) whu.t(contextThemeWrapper, v, dimension));
        vhVar.g = -resources.getDimensionPixelOffset(R.dimen.reel_popup_menu_horizontal_offset);
        vhVar.j(-resources.getDimensionPixelOffset(R.dimen.reel_popup_menu_vertical_offset));
        vhVar.z();
        vhVar.y();
        vhVar.e(e);
        if (view != null) {
            vhVar.l = view;
        }
        iifVar.c = iifVar.b.a();
        ilrVar.a(false);
        vhVar.v(new PopupWindow.OnDismissListener() { // from class: iia
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                iif iifVar2 = iif.this;
                ilrVar.a(true);
                iifVar2.b.c(iifVar2.c);
                iifVar2.c = 0;
            }
        });
        vhVar.s();
    }
}
