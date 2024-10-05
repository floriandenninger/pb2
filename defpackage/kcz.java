package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.vr.ndk.base.DaydreamApi;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kcz extends kcm implements flj, fgp, aiwt, flb, aioa, ypd {
    public nys a;
    public ainl aA;
    public ahhc aB;
    public kcu aC;
    public azrw aD;
    public fcv aE;
    public gph aF;
    public zaz aG;
    public BandaidConnectionOpenerController aH;
    public azrw aI;
    public flc aJ;
    public ojg aK;
    public fln aL;
    public okf aM;
    public fgq aN;
    public aaea aO;
    public Executor aP;
    public fuj aQ;
    public gni aR;
    public gpe aS;
    public YouTubePlayerViewNotForReflection aT;
    public aadw aU;
    public ykz aV;
    private final ayqw aW = new ayqw();
    private final Set aX = new HashSet();
    private ViewGroup aY;
    private flo aZ;
    public YouTubePlayerOverlaysLayout ae;
    public azrw af;
    public evb ag;
    public evg ah;
    public ahff ai;
    public kcp aj;
    public aila ak;
    public kcg al;
    public wmt am;
    public ahqr an;
    public acra ao;
    public aiwu ap;
    public addn aq;
    public azrw ar;
    public azrw as;
    public ahor at;
    public adlt au;
    public PlayerCollapsedStateMonitor av;
    public kce aw;
    public kcq ax;
    public ainy ay;
    public aihl az;
    public nyo b;
    private boolean ba;
    private gng bb;
    private boolean bc;
    private ayqx bd;
    private kcy be;
    public zaw c;
    public ypa d;
    public aioc e;

    private final void aN(boolean z) {
        if (!z || !this.ay.d() || this.aB.v || at()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 24 || !C().isInMultiWindowMode()) {
            this.aJ.a(3);
        }
    }

    private final void aO(PlaybackStartDescriptor playbackStartDescriptor, boolean z, PlaybackServiceState playbackServiceState, avgg avggVar, acsx acsxVar) {
        int i;
        ailf j = this.aj.j();
        if (j != null) {
            j.b();
        }
        if (this.aN.g() == fhg.WATCH_WHILE_MAXIMIZED) {
            arfd a = this.aO.a();
            aswb aswbVar = a.e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if ((aswbVar.d & 1) != 0) {
                aswb aswbVar2 = a.e;
                if (aswbVar2 == null) {
                    aswbVar2 = aswb.a;
                }
                i = aswbVar2.Q;
            }
            i = -1;
        } else {
            arfd a2 = this.aO.a();
            aswb aswbVar3 = a2.e;
            if (aswbVar3 == null) {
                aswbVar3 = aswb.a;
            }
            if ((aswbVar3.c & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                aswb aswbVar4 = a2.e;
                if (aswbVar4 == null) {
                    aswbVar4 = aswb.a;
                }
                i = aswbVar4.P;
            }
            i = -1;
        }
        aswb aswbVar5 = this.aO.a().e;
        if (aswbVar5 == null) {
            aswbVar5 = aswb.a;
        }
        int i2 = true == aswbVar5.R ? i : -1;
        boolean z2 = false;
        if (this.aN.g().d() && !z) {
            z2 = true;
        }
        aigc a3 = aigd.a();
        a3.h(i);
        a3.g(i2);
        a3.d(z2);
        apxf apxfVar = playbackStartDescriptor.b;
        if (apxfVar != null && apxfVar.pY(WatchEndpointOuterClass.watchEndpoint) && (((awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint)).c & 1) != 0) {
            awdn awdnVar = ((awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint)).y;
            if (awdnVar == null) {
                awdnVar = awdn.a;
            }
            if ((awdnVar.b & 1) != 0) {
                a3.c(awdnVar.c);
            }
            if ((awdnVar.b & 2) != 0) {
                avzr b = avzr.b(awdnVar.d);
                if (b == null) {
                    b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                a3.b(b);
            }
        }
        if (acsxVar != null) {
            a3.a = acsxVar;
            boolean z3 = this.e.s().k;
            aone createBuilder = asmb.a.createBuilder();
            createBuilder.copyOnWrite();
            asmb asmbVar = (asmb) createBuilder.instance;
            asmbVar.b |= 512;
            asmbVar.j = !z3;
            acsxVar.a((asmb) createBuilder.build());
        }
        if (playbackServiceState != null) {
            this.aA.g(playbackServiceState, a3.a());
        } else {
            this.aA.e(playbackStartDescriptor, a3.a());
        }
        Iterator it = this.aX.iterator();
        while (it.hasNext()) {
            ((flk) it.next()).j(fkc.e(playbackStartDescriptor), avggVar);
        }
    }

    private static final Optional aP(apxf apxfVar) {
        if (apxfVar == null || (apxfVar.b & 1) == 0 || !apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
            return Optional.empty();
        }
        awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
        awdh awdhVar = awdpVar.q;
        if (awdhVar == null) {
            awdhVar = awdh.a;
        }
        if ((awdhVar.b & 2) == 0) {
            return Optional.empty();
        }
        awdh awdhVar2 = awdpVar.q;
        if (awdhVar2 == null) {
            awdhVar2 = awdh.a;
        }
        aupb b = aupb.b(awdhVar2.c);
        if (b == null) {
            b = aupb.SEEK_SOURCE_UNKNOWN;
        }
        return Optional.of(b);
    }

    private final void aQ(PlaybackStartDescriptor playbackStartDescriptor, PlaybackServiceState playbackServiceState, acsx acsxVar) {
        aO(playbackStartDescriptor, false, playbackServiceState, null, acsxVar);
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.aJ.a(2);
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.aJ.a(1);
    }

    @Override // defpackage.flh
    public final void a() {
        if (fkc.c(this.ay) && !this.ay.T()) {
            fhf a = this.aK.a();
            PlaybackServiceState l = this.ay.l(false);
            if (a != null) {
                aifz d = PlaybackStartDescriptor.d();
                d.a = a.a();
                aM(d.a(), l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aF(ahdv ahdvVar) {
        PlayerConfigModel c;
        PlayerResponseModel b = ahdvVar.b();
        if (ahdvVar.c() != aigk.VIDEO_PLAYBACK_LOADED || b == null || (c = b.c()) == null || !c.aO()) {
            return;
        }
        this.c.c(R.string.force_muted_video);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aG(ahea aheaVar) {
        aN(aheaVar.a());
    }

    public final void aH(boolean z) {
        boolean c = fkc.c(this.ay);
        if (c == (this.aN.g() != fhg.NONE)) {
            return;
        }
        if (!c) {
            if (z) {
                this.aM.h(false);
                return;
            }
            return;
        }
        boolean d = this.ay.d();
        if (this.ba) {
            this.aM.l(false);
        } else {
            this.aM.m(false);
        }
        if (!d || this.ay.d()) {
            return;
        }
        this.ay.Z();
        ViewGroup viewGroup = this.aY;
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: kcv
                @Override // java.lang.Runnable
                public final void run() {
                    kcz.this.ay.b();
                }
            });
        }
    }

    public final void aI(boolean z) {
        adlm g = this.au.g();
        boolean z2 = false;
        if (!this.aL.b && this.ay.P()) {
            z2 = true;
        }
        if (g != null || z2) {
            return;
        }
        if (z) {
            this.a.h(true);
        }
        this.ay.J();
        this.ay.s();
        if (z) {
            return;
        }
        this.a.b();
        Iterator it = this.aX.iterator();
        while (it.hasNext()) {
            ((flk) it.next()).i();
        }
    }

    public final void aJ(PlaybackStartDescriptor playbackStartDescriptor, acsx acsxVar) {
        playbackStartDescriptor.p(!this.ay.d());
        aQ(playbackStartDescriptor, null, acsxVar);
    }

    @Override // defpackage.aiwt
    public final void aK(afih afihVar) {
        if ("surfaceunavailable".equals(afihVar.i())) {
            aN(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aL() {
        whu.K(C(), R.string.playlist_skipped_unavailable_videos, 1);
    }

    public final void aM(PlaybackStartDescriptor playbackStartDescriptor, PlaybackServiceState playbackServiceState) {
        aQ(playbackStartDescriptor, playbackServiceState, null);
    }

    @Override // defpackage.flh
    public final void b() {
        this.a.c();
        a();
    }

    @Override // defpackage.flb
    public final void c(boolean z) {
        this.ay.W(true == z ? 3 : 1);
    }

    @Override // defpackage.flb
    public final void d(boolean z) {
        aryi q;
        apii apiiVar;
        aphx aphxVar;
        apih apihVar;
        if (this.aN.g().d()) {
            this.aM.h(false);
            aI(false);
        } else if (z && !this.bc) {
            aI(true);
        }
        ahos ahosVar = (ahos) this.aI.get();
        ahosVar.a.k();
        if (ahosVar.a.v) {
            ahosVar.c();
        }
        ahosVar.g = null;
        ahosVar.j = null;
        ahosVar.i = null;
        ahoy ahoyVar = (ahoy) ahosVar.b;
        ahoyVar.b = null;
        ahoyVar.c = null;
        DaydreamApi daydreamApi = ahosVar.d;
        if (daydreamApi != null) {
            daydreamApi.close();
            ahosVar.d = null;
        }
        ahosVar.h(this.at);
        this.aH.h();
        evb evbVar = this.ag;
        evj evjVar = (evj) evbVar.b;
        evp a = evp.a(((evq) evjVar.a.c()).c);
        if (a == null) {
            a = evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
        }
        boolean d = evj.d(a, evjVar.c, (evp) evjVar.b.get());
        int i = 3;
        if (!d) {
            evd evdVar = evbVar.c;
            PlayerResponseModel playerResponseModel = evdVar.e;
            if (playerResponseModel == null || (apihVar = ahbx.f(playerResponseModel.q())) == null) {
                apihVar = null;
            }
            if (!evdVar.d(apihVar)) {
                evbVar.c.a();
            }
        } else if (Build.VERSION.SDK_INT < 28 || !evbVar.a.isPackageSuspended()) {
            ainy ainyVar = (ainy) evbVar.d.get();
            yjk.f();
            ahbq a2 = ainyVar.e.a();
            int i2 = a2.b;
            int i3 = i2 - 1;
            if (i3 == 1) {
                ((flo) evbVar.e.get()).a();
                evd evdVar2 = evbVar.c;
                evdVar2.b.e();
                if (evdVar2.a.c()) {
                    evg evgVar = evdVar2.b;
                    evgVar.t = 2;
                    evgVar.h = evgVar.f.c();
                    evgVar.d();
                    final eva evaVar = evdVar2.c;
                    if (!evaVar.h.a()) {
                        evaVar.b(null);
                    } else {
                        ynm.n(evaVar.e, evaVar.g.a(evaVar.f.c()), ept.c, new zfi() { // from class: euy
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                eva evaVar2 = eva.this;
                                AccountId accountId = (AccountId) obj;
                                accountId.getClass();
                                evaVar2.b(accountId);
                            }
                        });
                    }
                }
                evg evgVar2 = evdVar2.b;
                PlayerResponseModel playerResponseModel2 = evdVar2.e;
                if (playerResponseModel2 != null && (q = playerResponseModel2.q()) != null && (q.b & 1024) != 0) {
                    arxz arxzVar = q.j;
                    if (arxzVar == null) {
                        arxzVar = arxz.a;
                    }
                    if (arxzVar.b == 64657230) {
                        arxz arxzVar2 = q.j;
                        if (arxzVar2 == null) {
                            arxzVar2 = arxz.a;
                        }
                        if (arxzVar2.b == 64657230) {
                            apiiVar = (apii) arxzVar2.c;
                        } else {
                            apiiVar = apii.a;
                        }
                    } else {
                        apiiVar = null;
                    }
                    if (apiiVar != null) {
                        apih apihVar2 = apiiVar.d;
                        if (apihVar2 == null) {
                            apihVar2 = apih.a;
                        }
                        if ((apihVar2.b & 4) != 0) {
                            apih apihVar3 = apiiVar.d;
                            if (apihVar3 == null) {
                                apihVar3 = apih.a;
                            }
                            aphxVar = apihVar3.e;
                            if (aphxVar == null) {
                                aphxVar = aphx.a;
                            }
                            evgVar2.o = aphxVar;
                        }
                    }
                }
                aphxVar = null;
                evgVar2.o = aphxVar;
            } else if (i3 == 2) {
                ((adhd) evbVar.f.get()).i();
                evbVar.c.d(a2.a);
            } else if (i3 == 3) {
                evbVar.c.a();
            }
            i = i2;
        }
        boolean isFinishing = C().isFinishing();
        boolean z2 = this.ay.P() || i == 1;
        if (fkc.c(this.ay)) {
            if (isFinishing && !z2) {
                aI(false);
            } else if (!isFinishing) {
                this.a.h(false);
            }
        }
        if (!C().isChangingConfigurations() || Build.VERSION.SDK_INT < 24) {
            this.ay.z(isFinishing);
        } else if (!z2) {
            this.ay.a();
        }
        this.aE.b();
        this.ay.W(1);
        fln flnVar = this.aL;
        flnVar.b = false;
        Iterator it = flnVar.a.iterator();
        while (it.hasNext()) {
            ((flm) it.next()).kG();
        }
        this.aF.b(new kcy(this, (char[]) null));
    }

    @Override // defpackage.flb
    public final void h(boolean z) {
        this.aH.i();
        this.ay.A();
        ahos ahosVar = (ahos) this.aI.get();
        ahosVar.b(this.at);
        ci C = C();
        kcy kcyVar = this.be;
        ykz ykzVar = this.aV;
        C.getClass();
        ahosVar.g = C;
        kcyVar.getClass();
        ahosVar.j = kcyVar;
        ahosVar.i = ykzVar;
        ahosVar.a.l();
        ahosVar.d = DaydreamApi.create(ahosVar.g);
        ahoy ahoyVar = (ahoy) ahosVar.b;
        ahoyVar.b = ahosVar;
        ahoyVar.c = C;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = this.aT;
        if (youTubePlayerViewNotForReflection != null) {
            this.ay.x(youTubePlayerViewNotForReflection.d, (aifp) this.as.get());
        }
        this.ay.W(this.aN.g().e() ? 2 : true != z ? 1 : 3);
        fln flnVar = this.aL;
        flnVar.b = true;
        Iterator it = flnVar.a.iterator();
        while (it.hasNext()) {
            ((flm) it.next()).kH();
        }
        this.aC.b(this.aN.g());
        aH(false);
        if (fkc.c(this.ay)) {
            return;
        }
        this.aF.a(new kcy(this, (char[]) null));
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ae(jpt.t, jpt.u).Y(new kcx(this, 0), izw.q), aiocVar.ao().G().E(ayqr.a()).Y(new kcx(this, 1), izw.q), aiocVar.aq().Y(new kcx(this, 2), izw.q)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class, ahea.class, ahec.class};
        }
        if (i == 0) {
            aF((ahdv) obj);
            return null;
        }
        if (i == 1) {
            aG((ahea) obj);
            return null;
        }
        if (i == 2) {
            aL();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.flh
    public final void l() {
        this.ay.Z();
    }

    @Override // defpackage.ce
    public final void lZ() {
        super.lZ();
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = this.aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.d.D();
        }
        this.am.a = null;
        this.aB.f.clear();
        this.aX.remove(this.aQ);
    }

    @Override // defpackage.flj
    public final void m() {
        flo floVar = this.aZ;
        if (floVar == null) {
            return;
        }
        floVar.d();
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.aJ.a(4);
        this.ap.a(null);
        kcp kcpVar = this.aj;
        kcpVar.d = null;
        kcpVar.a = null;
        if (evr.au(this.aU)) {
            this.aW.c();
        } else {
            this.d.m(this);
        }
        kce kceVar = this.aw;
        kceVar.a.j(kceVar);
        kcq kcqVar = this.ax;
        kcqVar.a.j(kcqVar);
        ((Optional) this.aD.get()).ifPresent(new kcw(this, 0));
        Object obj = this.bd;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.bd = null;
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        this.a.g(bundle);
        evg evgVar = this.ah;
        int i = evgVar.t;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bundle.putInt("background_dialog_type", i2);
        int i3 = evgVar.t;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 2) {
            bundle.putByteArray("background_failed_dismissible_dialog", evgVar.l.toByteArray());
        } else if (i4 == 3) {
            bundle.putByteArray("background_failed_upsell_dialog", evgVar.j.toByteArray());
        } else if (i4 == 4) {
            bundle.putByteArray("background_failed_dismissible_snackbar", evgVar.m.toByteArray());
        } else if (i4 == 5) {
            bundle.putByteArray("background_failed_upsell_dialog_on_elements", evgVar.k.toByteArray());
        }
        bundle.putLong("background_start_time", evgVar.h);
        fhg g = this.aN.g();
        boolean z = true;
        if ((!g.h() || g.k()) && !g.g()) {
            z = false;
        }
        this.ba = z;
        bundle.putBoolean("is_player_maximized", z);
        gng gngVar = this.bb;
        if (gngVar != null) {
            bundle.putInt("PREVIOUS_THEME", gngVar.c);
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        this.ap.a(this);
        ((Optional) this.aD.get()).ifPresent(new kcw(this, 1));
        this.d.d(new fen());
        if (evr.au(this.aU)) {
            this.aW.g(kI(this.e));
        } else {
            this.d.g(this);
        }
        ahff ahffVar = this.ai;
        if (!ahffVar.d) {
            ahffVar.kI(ahffVar.b);
            ahffVar.d = true;
        }
        kce kceVar = this.aw;
        kceVar.a.i(kceVar);
        kcq kcqVar = this.ax;
        kcqVar.a.i(kcqVar);
        kcp kcpVar = this.aj;
        kcpVar.d = this.ak;
        kcpVar.a = this.al;
        this.aJ.a(0);
        aadw aadwVar = this.aU;
        if (evr.aE(aadwVar)) {
            asvu asvuVar = aadwVar.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.aM) {
                this.bd = this.aS.b.n().X(new kcx(this, 3));
            }
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.player_fragment, viewGroup, false);
        this.aY = viewGroup2;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = (YouTubePlayerViewNotForReflection) viewGroup2.findViewById(R.id.player_view);
        this.aT = youTubePlayerViewNotForReflection;
        youTubePlayerViewNotForReflection.g(this.aG);
        this.bb = this.aR.a();
        aujl aujlVar = this.aU.b().E;
        if (aujlVar == null) {
            aujlVar = aujl.a;
        }
        this.bc = aujlVar.d;
        this.a.e(bundle);
        if (bundle != null) {
            evg evgVar = this.ah;
            int i = bundle.getInt("background_dialog_type");
            if (i < 0) {
                etx.a();
            }
            evgVar.t = etx.a()[i];
            if (bundle.containsKey("background_failed_upsell_dialog")) {
                evgVar.j = (avul) aonm.parseFrom(avul.a, bundle.getByteArray("background_failed_upsell_dialog"), aomw.b());
            } else if (bundle.containsKey("background_failed_dismissible_dialog")) {
                evgVar.l = (aqkv) aonm.parseFrom(aqkv.a, bundle.getByteArray("background_failed_dismissible_dialog"), aomw.b());
            } else if (bundle.containsKey("background_failed_dismissible_snackbar")) {
                evgVar.m = (atnz) aonm.parseFrom(atnz.a, bundle.getByteArray("background_failed_dismissible_snackbar"), aomw.b());
            } else {
                if (bundle.containsKey("background_failed_upsell_dialog_on_elements")) {
                    evgVar.k = (apxi) aonm.parseFrom(apxi.a, bundle.getByteArray("background_failed_upsell_dialog_on_elements"), aomw.b());
                }
                evgVar.h = bundle.getLong("background_start_time");
                this.ba = bundle.getBoolean("is_player_maximized");
            }
            evgVar.h = bundle.getLong("background_start_time");
            this.ba = bundle.getBoolean("is_player_maximized");
        }
        this.aZ = (flo) this.af.get();
        this.b.l(new kcy(this));
        this.be = new kcy(this, (byte[]) null);
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection2 = this.aT;
        if (youTubePlayerViewNotForReflection2 != null) {
            this.am.a = youTubePlayerViewNotForReflection2;
        }
        ((zcd) this.ar.get()).b = this.ae;
        s(this.aK);
        this.aJ.c(this);
        s(this.aQ);
        this.aN.i(this);
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection3 = this.aT;
        if (youTubePlayerViewNotForReflection3 != null) {
            this.aN.i(youTubePlayerViewNotForReflection3);
        }
        this.aN.i(this.ae);
        this.aN.i(this.aZ);
        this.X.b(this.aH);
        this.X.b(this.av);
        return this.aY;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar == fhg.NONE) {
            aI(false);
        }
        this.aC.b(fhgVar);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0141  */
    @Override // defpackage.flj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.fhd r17, defpackage.fhg r18, boolean r19, defpackage.acsx r20) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcz.p(fhd, fhg, boolean, acsx):void");
    }

    public final void s(flk flkVar) {
        this.aX.add(flkVar);
    }
}
