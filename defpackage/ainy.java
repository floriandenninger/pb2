package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.ConditionVariable;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ainy implements ahav, ajas, aixb, aivl, ypd {
    private final ainw A;
    public final Context a;
    public final ypa b;
    public final aemv c;
    public final ainv d;
    public final ahbh e;
    public final aifs f;
    public final aisf g;
    public final ahaw h;
    public final aifk i;
    public final ahar j;
    public aint k;
    public final aife l;
    public final ainx m = new ainx(this);
    public final aiih n;
    public final aipn o;
    public final aipd p;
    public final aiow q;
    public final aiou r;
    public final aigv s;
    private final Handler t;
    private final aixc u;
    private final aiwg v;
    private final aaea w;
    private final banw x;
    private final Runnable y;
    private final ahaz z;

    public ainy(Context context, ypa ypaVar, aemv aemvVar, final aisf aisfVar, aixc aixcVar, ahbh ahbhVar, final aifs aifsVar, aigv aigvVar, final aiwz aiwzVar, ahaw ahawVar, aiwg aiwgVar, afqj afqjVar, aaea aaeaVar, aife aifeVar, final aiih aiihVar, aipn aipnVar, final aipd aipdVar, aiow aiowVar, aimx aimxVar, banw banwVar, banw banwVar2, final aioo aiooVar, ahaz ahazVar, aifk aifkVar) {
        this.A = new ainw(this, aiooVar);
        this.a = context;
        this.b = ypaVar;
        this.c = aemvVar;
        this.e = ahbhVar;
        this.f = aifsVar;
        this.s = aigvVar;
        this.v = aiwgVar;
        this.w = aaeaVar;
        this.h = ahawVar;
        this.z = ahazVar;
        this.x = banwVar2;
        this.i = aifkVar;
        afqjVar.a = aemvVar.d;
        this.g = aisfVar;
        this.u = aixcVar;
        this.l = aifeVar;
        this.n = aiihVar;
        this.o = aipnVar;
        this.p = aipdVar;
        this.q = aiowVar;
        this.r = new aiou(banwVar, aimxVar, ypaVar, aigvVar, aiowVar, aiihVar, aipnVar, aipdVar, aifkVar);
        this.d = new ainv(this);
        this.t = new Handler(context.getMainLooper());
        this.j = new ahar(context);
        this.k = new aint(this);
        this.y = new Runnable() { // from class: ainr
            @Override // java.lang.Runnable
            public final void run() {
                ainy ainyVar = ainy.this;
                aipd aipdVar2 = aipdVar;
                aiwz aiwzVar2 = aiwzVar;
                aifs aifsVar2 = aifsVar;
                aioo aiooVar2 = aiooVar;
                aiih aiihVar2 = aiihVar;
                aisf aisfVar2 = aisfVar;
                aiwk aiwkVar = aipdVar2.a;
                if (aiwkVar != null) {
                    aiwkVar.J();
                } else {
                    aiwzVar2.a.k(aiwzVar2.b, null);
                    aiwzVar2.a.m(aiwzVar2.c, null);
                }
                aifsVar2.i();
                aifsVar2.j();
                aimk a = aiooVar2.a();
                if (a != null) {
                    ((aimg) a).a();
                    aiihVar2.c();
                    ainyVar.q.a();
                }
                aisfVar2.a.f(new ahdy(aisfVar2.m));
                aisfVar2.a.d(new ahdz(aisfVar2.l));
            }
        };
    }

    private final PlaybackServiceState ac(int i) {
        ainw ainwVar = this.A;
        ainy ainyVar = ainwVar.b;
        aiwk aiwkVar = ainyVar.p.a;
        if (aiwkVar == null) {
            return new PlaybackServiceState(null, ainyVar.f.e(), null, null, ainwVar.b.h.i);
        }
        aimk a = ainwVar.a.a();
        PlaybackStartDescriptor j = ainwVar.b.j();
        OmegaSequencerState omegaSequencerState = null;
        PlaybackModalityState e = i == 0 ? null : ainwVar.b.f.e();
        if (a != null) {
            aimg aimgVar = (aimg) a;
            PlayerResponseModel playerResponseModel = aimgVar.c.p;
            WatchNextResponseModel watchNextResponseModel = aimgVar.c.q;
            aiih aiihVar = aimgVar.c;
            omegaSequencerState = new OmegaSequencerState(playerResponseModel, watchNextResponseModel, aiihVar.n, aiihVar.o, aiihVar.r, aimgVar.b.d());
        }
        return new PlaybackServiceState(j, e, omegaSequencerState, aiwkVar.t(i), ainwVar.b.h.i);
    }

    private final void ad() {
        this.x.c(new ahcu(false));
    }

    private final void ae(boolean z) {
        yjk.f();
        if (N()) {
            this.s.e(false);
            aiwk aiwkVar = this.p.a;
            if (aiwkVar != null) {
                if (z) {
                    aiwkVar.w();
                } else {
                    aiwkVar.T();
                }
            }
            this.v.f(false);
        }
        ainv ainvVar = this.d;
        if (ainvVar.a) {
            ainvVar.b.a.unregisterReceiver(ainvVar);
            ainvVar.a = false;
        }
        ahat ahatVar = this.h.g;
        if (ahatVar.a) {
            try {
                ahatVar.b.a.unregisterReceiver(ahatVar);
            } catch (IllegalArgumentException unused) {
                zga.b("Trying to unregister AudioBecomingNoisy Receiver, but was already unregistered");
            }
            ahatVar.a = false;
        }
    }

    private final void af(boolean z) {
        this.b.f(new ahda());
        this.e.f();
        if (z) {
            s();
            return;
        }
        r();
        aiwk aiwkVar = this.p.a;
        if (aiwkVar != null) {
            aiwkVar.U();
        }
    }

    private static boolean ag(aiwk aiwkVar) {
        return aiwkVar.p() == null;
    }

    public final void A() {
        this.t.post(this.y);
    }

    @Override // defpackage.aivl
    public final void B() {
        yjk.f();
        if (N()) {
            this.s.e(true);
            aiwk aiwkVar = this.p.a;
            if (aiwkVar == null || !ag(aiwkVar)) {
                return;
            }
            aiwkVar.L();
        }
    }

    public final void C(ykl yklVar) {
        aisf aisfVar = this.g;
        String string = aisfVar.b.getString(R.string.turn_off_subtitles);
        PlayerResponseModel playerResponseModel = aisfVar.q;
        if (playerResponseModel == null || !aisfVar.j()) {
            aitf aitfVar = aisfVar.p;
            if (aitfVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(SubtitleTrack.o(string));
                arrayList.addAll(aitfVar.a());
                yklVar.b(null, arrayList);
                return;
            }
            aiuj aiujVar = aisfVar.n;
            if (aiujVar != null) {
                yklVar.b(null, aiujVar.g());
                return;
            } else {
                yklVar.a(null, null);
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(SubtitleTrack.o(string));
        arrayList2.addAll(ahbj.H(playerResponseModel, aisfVar.a()));
        yklVar.b(null, arrayList2);
    }

    public final void D() {
        ainw ainwVar = this.A;
        yjk.f();
        aimk a = ainwVar.a.a();
        if (a == null) {
            return;
        }
        aiwk aiwkVar = ainwVar.b.p.a;
        if (aiwkVar != null) {
            aiwkVar.K();
        }
        a.f();
        ainwVar.b.o.b();
        ainwVar.b.n.d();
        ainwVar.b.o.e();
        ainwVar.b.n.k();
        ainwVar.b.p.a();
        ainwVar.a.c();
        ainwVar.b.J();
    }

    @Override // defpackage.aivl
    public final void E(boolean z) {
        aifs aifsVar = this.f;
        if (z != aifsVar.h) {
            aifsVar.h = z;
            aifsVar.i();
        }
    }

    @Override // defpackage.aixb
    public final void F(float f) {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.N(f);
    }

    public final void G(SubtitleTrack subtitleTrack) {
        H(subtitleTrack, true);
    }

    public final void H(SubtitleTrack subtitleTrack, boolean z) {
        this.g.g(subtitleTrack, z);
    }

    public final void I(float f) {
        this.f.d = f;
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.W();
    }

    public final void J() {
        ae(false);
    }

    @Deprecated
    public final void K() {
        ahau ahauVar = this.h.e;
        int i = ahau.e;
        ahauVar.a = false;
        ahauVar.b = false;
    }

    @Override // defpackage.aivl
    public final void L() {
        af(false);
    }

    public final boolean M(PlaybackStartDescriptor playbackStartDescriptor) {
        PlaybackStartDescriptor j = j();
        if (playbackStartDescriptor == null || j == null) {
            return false;
        }
        return aigb.c(j, playbackStartDescriptor);
    }

    public final boolean N() {
        return this.A.a.f();
    }

    public final boolean O() {
        return this.f.k;
    }

    @Deprecated
    public final boolean P() {
        aifs aifsVar = this.f;
        return aifsVar.k || aifsVar.m;
    }

    public final boolean Q() {
        aiwk aiwkVar = this.p.a;
        return aiwkVar != null && aiwkVar.ad();
    }

    @Override // defpackage.aivl
    public final boolean R() {
        aiwk aiwkVar = this.p.a;
        return aiwkVar != null && aiwkVar.ae();
    }

    public final boolean S() {
        aiwk aiwkVar;
        if (!N()) {
            return false;
        }
        if (this.n.l.a(aigk.VIDEO_LOADING)) {
            return true;
        }
        if (!this.n.l.a(aigk.VIDEO_PLAYBACK_LOADED, aigk.VIDEO_WATCH_LOADED) || (aiwkVar = this.p.a) == null) {
            return false;
        }
        return aiwkVar.ab();
    }

    public final boolean T() {
        ainw ainwVar = this.A;
        yjk.f();
        aimk a = ainwVar.a.a();
        if (a == null) {
            return false;
        }
        ainy ainyVar = ainwVar.b;
        aipd aipdVar = ainyVar.p;
        aiwk aiwkVar = aipdVar.a;
        if (aiwkVar != null) {
            aipdVar.c(ainyVar.n.o, aigd.a().a());
        }
        ((aimg) a).d(aiey.RETRY);
        ainwVar.b.n.h(aiwkVar != null ? aiwkVar.u() : null, ainwVar.b.r.c());
        return true;
    }

    @Override // defpackage.aivl
    public final boolean U(long j) {
        return V(j, aupb.SEEK_SOURCE_UNKNOWN);
    }

    @Override // defpackage.aivl
    public final boolean V(long j, aupb aupbVar) {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null || !ag(aiwkVar)) {
            return false;
        }
        return aiwkVar.ah(j, aupbVar);
    }

    public final void W(int i) {
        ahau ahauVar = this.h.e;
        int i2 = ahau.e;
        ahauVar.d = i;
        if (ahauVar.b && ahauVar.a()) {
            ahauVar.b = false;
            if (ahauVar.c.h != null) {
                aifo.a(aifn.AUDIOMANAGER, "AudioFocus WindowFocusChanged, causing play", new Object[0]);
                ahauVar.c.h.b();
            }
        }
    }

    public final void X() {
        if (this.s.j()) {
            this.s.e(false);
        }
    }

    @Override // defpackage.ajas
    @Deprecated
    public final void Y() {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar != null) {
            aiwkVar.R(false);
        }
        T();
    }

    public final void Z() {
        if (N()) {
            aiwk aiwkVar = this.p.a;
            this.n.t(aiwkVar != null ? aiwkVar.u() : null, this.r.c());
        }
    }

    @Override // defpackage.ahav, defpackage.aivl
    public final void a() {
        ConditionVariable conditionVariable;
        yjk.f();
        if (N()) {
            this.s.e(false);
            this.b.d(new ahda());
            aiwk aiwkVar = this.p.a;
            if (aiwkVar == null) {
                return;
            }
            if (this.n.l == aigk.VIDEO_LOADING) {
                aiwkVar.R(true);
            } else if (this.n.l.a(aigk.VIDEO_PLAYBACK_LOADED, aigk.VIDEO_WATCH_LOADED)) {
                aiwkVar.E();
            }
            aiih aiihVar = this.n;
            aiiz aiizVar = aiihVar.h;
            if (aiizVar != null) {
                aiizVar.a();
            }
            if (aiihVar.j == null || (conditionVariable = aiihVar.k) == null) {
                return;
            }
            conditionVariable.open();
        }
    }

    @Override // defpackage.aivl
    public final void aa() {
        PlaybackStartDescriptor playbackStartDescriptor;
        yjk.f();
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null || !aiwkVar.aj(aign.READY)) {
            T();
            return;
        }
        yjk.f();
        aiwk aiwkVar2 = this.p.a;
        if (aiwkVar2 != null) {
            ajbl s = aiwkVar2.s();
            if (s.c() != null && (playbackStartDescriptor = this.n.o) != null) {
                aifz e = playbackStartDescriptor.e();
                e.k = s.p().e;
                PlaybackStartDescriptor a = e.a();
                this.p.c(a, aigd.a().a());
                this.o.a(s.c(), a, new ains(), null);
                return;
            }
        }
        T();
    }

    @Override // defpackage.aivl
    public final void ab(long j, aupb aupbVar) {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null || !ag(aiwkVar)) {
            return;
        }
        aiwkVar.an(j, aupbVar);
    }

    @Override // defpackage.ahav, defpackage.aivl
    public final void b() {
        yjk.f();
        if (N()) {
            this.s.e(true);
            this.v.e();
            aiwk aiwkVar = this.p.a;
            if (aiwkVar == null || !ag(aiwkVar)) {
                T();
                return;
            }
            if (this.n.l == aigk.VIDEO_LOADING) {
                aiwkVar.R(false);
            }
            aiwkVar.F();
        }
    }

    @Override // defpackage.ahav
    public final void c(boolean z) {
        this.f.e = z;
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.W();
    }

    @Override // defpackage.ahav
    public final boolean d() {
        aiwk aiwkVar = this.p.a;
        return aiwkVar != null && aiwkVar.ac();
    }

    @Override // defpackage.ahav
    public final void e() {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return;
        }
        aiwkVar.am();
    }

    public final int g() {
        yjk.f();
        PlaybackStartDescriptor j = j();
        if (j != null) {
            return j.a();
        }
        return -1;
    }

    public final long h() {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return 0L;
        }
        return aiwkVar.n();
    }

    @Deprecated
    public final long i() {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return 0L;
        }
        return aiwkVar.k();
    }

    public final PlaybackStartDescriptor j() {
        return this.n.o;
    }

    public final PlaybackServiceState k() {
        return ac(0);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdt.class, aigr.class};
        }
        if (i == 0) {
            X();
            return null;
        }
        if (i == 1) {
            u((aigr) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final PlaybackServiceState l(boolean z) {
        return ac(true == z ? 2 : 1);
    }

    public final SubtitleTrack m() {
        return this.g.m;
    }

    public final aixh n() {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return null;
        }
        return aiwkVar.q();
    }

    public final aixh o() {
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return null;
        }
        return aiwkVar.r();
    }

    public final String p() {
        yjk.f();
        PlaybackStartDescriptor j = j();
        if (j != null) {
            return j.k();
        }
        return null;
    }

    public final String q() {
        yjk.f();
        PlaybackStartDescriptor j = j();
        if (j != null) {
            return j.l();
        }
        return null;
    }

    public final void r() {
        ae(true);
    }

    public final void s() {
        yjk.f();
        this.u.y();
        this.b.d(new ahda());
        this.e.f();
        this.v.f(true);
        ad();
        D();
        this.j.b();
    }

    public final void t(boolean z) {
        af(z);
        aifs aifsVar = this.e.c;
        aifsVar.j = true;
        aifsVar.k();
        if (aifk.e(this.w).l) {
            return;
        }
        this.v.f(false);
        ad();
    }

    public final void u(aigr aigrVar) {
        if (this.s.j() && ahbl.d(aigrVar.i)) {
            this.s.e(false);
        }
    }

    public final void v(aiov aiovVar, aypn aypnVar, final aioo aiooVar, aifv aifvVar) {
        ahaz ahazVar;
        AudioDeviceCallback audioDeviceCallback;
        ayqw ayqwVar = new ayqw();
        final ahaw ahawVar = this.h;
        ahawVar.h = this;
        aypn aypnVar2 = aiovVar.a;
        ahawVar.getClass();
        final int i = 0;
        ayqwVar.d(aypnVar2.X(new ayrs() { // from class: ainn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlayerConfigModel playerConfigModel;
                int i2 = i;
                if (i2 == 0) {
                    ahaw ahawVar2 = ahawVar;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() == aign.VIDEO_REQUESTED) {
                        ahawVar2.k = ahefVar.b();
                        return;
                    } else if (ahefVar.c() == aign.INTERSTITIAL_REQUESTED) {
                        ahawVar2.k = ahefVar.a();
                        return;
                    } else {
                        if (ahefVar.c() == aign.PLAYBACK_LOADED) {
                            ahawVar2.g.a();
                            return;
                        }
                        return;
                    }
                }
                if (i2 != 1) {
                    ahaw ahawVar3 = ahawVar;
                    if (((ahej) obj).a() == 2) {
                        ahawVar3.g.a();
                        if (ahawVar3.j == 0) {
                            PlayerResponseModel playerResponseModel = ahawVar3.k;
                            if (playerResponseModel != null) {
                                playerConfigModel = playerResponseModel.c();
                            } else {
                                playerConfigModel = ahawVar3.c.get();
                            }
                            if (ahawVar3.b.a() == 0.0f || ahawVar3.b.u == 2) {
                                return;
                            }
                            if (playerConfigModel != null) {
                                if (playerConfigModel.aO()) {
                                    return;
                                }
                                if (playerConfigModel.aQ() && ahawVar3.b.u == 1) {
                                    return;
                                }
                            }
                            ahawVar3.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                ahaw ahawVar4 = ahawVar;
                if (!((ahdo) obj).a()) {
                    ahawVar4.a();
                } else {
                    aifo.a(aifn.AUDIOMANAGER, "AudioFocus Abandoned", new Object[0]);
                    ahawVar4.d.abandonAudioFocus(ahawVar4.e);
                }
            }
        }));
        aypn aypnVar3 = aiovVar.i;
        final ahaw ahawVar2 = this.h;
        ahawVar2.getClass();
        final int i2 = 2;
        ayqwVar.d(aypnVar3.X(new ayrs() { // from class: ainn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlayerConfigModel playerConfigModel;
                int i22 = i2;
                if (i22 == 0) {
                    ahaw ahawVar22 = ahawVar2;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() == aign.VIDEO_REQUESTED) {
                        ahawVar22.k = ahefVar.b();
                        return;
                    } else if (ahefVar.c() == aign.INTERSTITIAL_REQUESTED) {
                        ahawVar22.k = ahefVar.a();
                        return;
                    } else {
                        if (ahefVar.c() == aign.PLAYBACK_LOADED) {
                            ahawVar22.g.a();
                            return;
                        }
                        return;
                    }
                }
                if (i22 != 1) {
                    ahaw ahawVar3 = ahawVar2;
                    if (((ahej) obj).a() == 2) {
                        ahawVar3.g.a();
                        if (ahawVar3.j == 0) {
                            PlayerResponseModel playerResponseModel = ahawVar3.k;
                            if (playerResponseModel != null) {
                                playerConfigModel = playerResponseModel.c();
                            } else {
                                playerConfigModel = ahawVar3.c.get();
                            }
                            if (ahawVar3.b.a() == 0.0f || ahawVar3.b.u == 2) {
                                return;
                            }
                            if (playerConfigModel != null) {
                                if (playerConfigModel.aO()) {
                                    return;
                                }
                                if (playerConfigModel.aQ() && ahawVar3.b.u == 1) {
                                    return;
                                }
                            }
                            ahawVar3.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                ahaw ahawVar4 = ahawVar2;
                if (!((ahdo) obj).a()) {
                    ahawVar4.a();
                } else {
                    aifo.a(aifn.AUDIOMANAGER, "AudioFocus Abandoned", new Object[0]);
                    ahawVar4.d.abandonAudioFocus(ahawVar4.e);
                }
            }
        }));
        azqv azqvVar = aifvVar.d;
        final ahaw ahawVar3 = this.h;
        ahawVar3.getClass();
        final int i3 = 1;
        ayqwVar.d(azqvVar.X(new ayrs() { // from class: ainn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                PlayerConfigModel playerConfigModel;
                int i22 = i3;
                if (i22 == 0) {
                    ahaw ahawVar22 = ahawVar3;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() == aign.VIDEO_REQUESTED) {
                        ahawVar22.k = ahefVar.b();
                        return;
                    } else if (ahefVar.c() == aign.INTERSTITIAL_REQUESTED) {
                        ahawVar22.k = ahefVar.a();
                        return;
                    } else {
                        if (ahefVar.c() == aign.PLAYBACK_LOADED) {
                            ahawVar22.g.a();
                            return;
                        }
                        return;
                    }
                }
                if (i22 != 1) {
                    ahaw ahawVar32 = ahawVar3;
                    if (((ahej) obj).a() == 2) {
                        ahawVar32.g.a();
                        if (ahawVar32.j == 0) {
                            PlayerResponseModel playerResponseModel = ahawVar32.k;
                            if (playerResponseModel != null) {
                                playerConfigModel = playerResponseModel.c();
                            } else {
                                playerConfigModel = ahawVar32.c.get();
                            }
                            if (ahawVar32.b.a() == 0.0f || ahawVar32.b.u == 2) {
                                return;
                            }
                            if (playerConfigModel != null) {
                                if (playerConfigModel.aO()) {
                                    return;
                                }
                                if (playerConfigModel.aQ() && ahawVar32.b.u == 1) {
                                    return;
                                }
                            }
                            ahawVar32.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                ahaw ahawVar4 = ahawVar3;
                if (!((ahdo) obj).a()) {
                    ahawVar4.a();
                } else {
                    aifo.a(aifn.AUDIOMANAGER, "AudioFocus Abandoned", new Object[0]);
                    ahawVar4.d.abandonAudioFocus(ahawVar4.e);
                }
            }
        }));
        aypn aypnVar4 = aiovVar.i;
        final ahbh ahbhVar = this.e;
        ahbhVar.getClass();
        ayqwVar.d(aypnVar4.X(new ayrs() { // from class: aino
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahbh ahbhVar2 = ahbh.this;
                boolean f = ((ahej) obj).f();
                ahbhVar2.l = f;
                if (f) {
                    ahbhVar2.c();
                }
            }
        }));
        ayqwVar.d(aypnVar.X(new ayrs(this) { // from class: ainp
            public final /* synthetic */ ainy a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i3 == 0) {
                    this.a.u((aigr) obj);
                } else {
                    this.a.X();
                }
            }
        }));
        ayqwVar.d(aiovVar.f.X(new ayrs(this) { // from class: ainp
            public final /* synthetic */ ainy a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    this.a.u((aigr) obj);
                } else {
                    this.a.X();
                }
            }
        }));
        final aisf aisfVar = this.g;
        if (aisfVar != null) {
            ayqwVar.d(aiovVar.a.X(new ayrs() { // from class: ainq
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
                
                    if (r12 != false) goto L67;
                 */
                @Override // defpackage.ayrs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.Object r12) {
                    /*
                        Method dump skipped, instructions count: 484
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ainq.a(java.lang.Object):void");
                }
            }));
            aypn aypnVar5 = aiovVar.k;
            aisf aisfVar2 = this.g;
            aisfVar2.getClass();
            ayqwVar.d(aypnVar5.X(new aisc(aisfVar2, i3)));
        }
        auij auijVar = aifk.d(this.w).f;
        if (auijVar == null) {
            auijVar = auij.b;
        }
        apep apepVar = auijVar.C;
        if (apepVar == null) {
            apepVar = apep.a;
        }
        if (apepVar.b && (audioDeviceCallback = (ahazVar = this.z).c) != null) {
            ahazVar.a.b(audioDeviceCallback);
        }
        ahbh ahbhVar2 = this.e;
        aiooVar.getClass();
        ahbhVar2.f = new zih() { // from class: ainm
            @Override // defpackage.zih
            public final Object a() {
                return aioo.this.a();
            }
        };
        this.e.n = this.k;
    }

    public final void w(aigd aigdVar) {
        if (aigdVar == null || !aigdVar.g) {
            this.v.e();
        }
    }

    public final void x(afkl afklVar, aifp aifpVar) {
        yjk.f();
        ahbh ahbhVar = this.e;
        afklVar.getClass();
        aifpVar.getClass();
        ahbhVar.i(afklVar, aifpVar);
        aiwk aiwkVar = this.p.a;
        if (aiwkVar == null) {
            return;
        }
        aigd h = aiwkVar.s().h();
        if (h == null || !h.g) {
            this.v.e();
            y();
            if (d() || !this.n.l.a(aigk.VIDEO_PLAYBACK_LOADED, aigk.VIDEO_WATCH_LOADED)) {
                return;
            }
            this.v.d(1);
            return;
        }
        y();
    }

    public final void y() {
        this.x.c(new ahcu(true));
    }

    public final void z(boolean z) {
        yjk.f();
        if (P()) {
            return;
        }
        if (this.e.m != 3) {
            t(z);
            this.k = null;
            return;
        }
        aint aintVar = this.k;
        if (aintVar == null) {
            zga.l("In background pending state with no listener!");
        } else {
            aintVar.b = true;
            aintVar.a = z;
        }
    }
}
