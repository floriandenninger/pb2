package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adit extends adlz implements aiwk, woh, ypd {
    private static final String t = zga.a("MDX.player.director");
    private final ajbk A;
    private PlaybackStartDescriptor C;
    private int D;
    private aanb F;
    private final adiv G;
    private adiv H;
    private final Map I;

    /* renamed from: J, reason: collision with root package name */
    private amru f34J;
    private final aigv K;
    public final ypa a;
    public final aypn b;
    public final Handler f;
    public final adlm g;
    public final aivu h;
    public aign i;
    public adlf j;
    public final ajbl k;
    public final adiv l;
    public ajbl m;
    public PlayerResponseModel n;
    public ajbl o;
    public final wnp p;
    public final aioc q;
    public aheg s;
    private final Context u;
    private final shf v;
    private final Executor w;
    private final aapf x;
    private final aiwl y;
    private final zgj z;
    final adis c = new adis(this);
    public final ayqw d = new ayqw();
    private final ajay B = new adio();
    private long E = 0;
    public boolean r = false;

    public adit(Context context, shf shfVar, Executor executor, ypa ypaVar, wno wnoVar, wyn wynVar, aypn aypnVar, adlm adlmVar, aigv aigvVar, aapf aapfVar, aiwl aiwlVar, aivu aivuVar, ajoy ajoyVar, zgj zgjVar, ajbk ajbkVar, aadw aadwVar, wpl wplVar, aioc aiocVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.u = context;
        shfVar.getClass();
        this.v = shfVar;
        this.w = executor;
        ypaVar.getClass();
        this.a = ypaVar;
        this.b = aypnVar;
        adlmVar.getClass();
        this.g = adlmVar;
        aigvVar.getClass();
        this.K = aigvVar;
        aapfVar.getClass();
        this.x = aapfVar;
        adiv adivVar = new adiv(this);
        this.l = adivVar;
        this.G = new adiv(this);
        this.H = adivVar;
        this.y = aiwlVar;
        this.h = aivuVar;
        this.z = zgjVar;
        this.A = ajbkVar;
        this.q = aiocVar;
        this.I = new HashMap();
        this.p = new wnp(this, wnoVar, wynVar, ajoyVar, aadwVar, wplVar, ypaVar, null, null, null, null);
        this.f = new adin(this, context.getMainLooper());
        ajbl ar = ar(zgjVar.a(), 0);
        this.k = ar;
        V(ar);
        aiwlVar.f(ar);
        this.i = aign.NEW;
        this.D = 4;
        Q(aign.PLAYBACK_PENDING, null);
        this.f34J = amru.q();
        adlmVar.A(this);
    }

    private final long ap() {
        if (this.g.e() != 0) {
            return this.g.e();
        }
        if (this.l.a != null) {
            return r0.a() * 1000;
        }
        return 0L;
    }

    private final adld aq() {
        adld c = adle.c();
        c.f(this.l.a.y());
        if (this.C != null) {
            c.b(adjd.a(this.l.a, this.s));
            c.b = this.C.i();
            c.c = this.C.j();
            c.d = this.C.y();
        }
        String c2 = this.K.c();
        if (c2 != null) {
            c.d(c2);
        }
        return c;
    }

    private final ajbl ar(String str, int i) {
        ajbk ajbkVar = this.A;
        efw efwVar = (efw) ajbkVar;
        efwVar.b(str);
        efwVar.h(i);
        efwVar.f(new adjc());
        efwVar.c(this.B);
        efwVar.d(false);
        ajbl a = ajbkVar.a();
        this.y.h(a);
        if (i == 1) {
            this.I.put(str, a);
        }
        return a;
    }

    private final void as(int i) {
        FormatStreamModel formatStreamModel;
        aanb[] aanbVarArr = new aanb[this.f34J.size()];
        this.f34J.toArray(aanbVarArr);
        aanb aanbVar = this.F;
        if (aanbVar == null) {
            amru amruVar = this.f34J;
            int size = amruVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aanbVar = null;
                    break;
                }
                aanb aanbVar2 = (aanb) amruVar.get(i2);
                i2++;
                if (aanbVar2.c) {
                    aanbVar = aanbVar2;
                    break;
                }
            }
        }
        if (aanbVar != null) {
            aong aongVar = (aong) aqxz.b.createBuilder();
            Uri.Builder builder = new Uri.Builder();
            String str = aanbVar.a;
            String str2 = aanbVar.b;
            boolean z = aanbVar.c;
            aone createBuilder = apgn.a.createBuilder();
            createBuilder.copyOnWrite();
            apgn apgnVar = (apgn) createBuilder.instance;
            str.getClass();
            apgnVar.b |= 2;
            apgnVar.d = str;
            createBuilder.copyOnWrite();
            apgn apgnVar2 = (apgn) createBuilder.instance;
            str2.getClass();
            apgnVar2.b |= 1;
            apgnVar2.c = str2;
            createBuilder.copyOnWrite();
            apgn apgnVar3 = (apgn) createBuilder.instance;
            apgnVar3.b |= 4;
            apgnVar3.e = z;
            aongVar.copyOnWrite();
            aqxz aqxzVar = (aqxz) aongVar.instance;
            apgn apgnVar4 = (apgn) createBuilder.build();
            apgnVar4.getClass();
            aqxzVar.v = apgnVar4;
            aqxzVar.c |= 262144;
            formatStreamModel = whu.W(builder, null, 0L, aongVar);
        } else {
            formatStreamModel = null;
        }
        aeqq aeqqVar = new aeqq(null, formatStreamModel, null, aeqq.a, aanbVarArr, 0);
        if (i == 0) {
            aiwl aiwlVar = this.y;
            ajbl ajblVar = this.o;
            Iterator it = aiwlVar.b.iterator();
            while (it.hasNext()) {
                ((ajbh) it.next()).h(aeqqVar, ajblVar.Z());
            }
            ajblVar.ad().c(aeqqVar);
            return;
        }
        this.y.n(aeqqVar, this.o.Z());
    }

    private final void at(int i, RemoteVideoAd remoteVideoAd) {
        PlayerResponseModel playerResponseModel = this.l.a;
        boolean z = playerResponseModel != null && playerResponseModel.C();
        this.G.a = this.n;
        if (remoteVideoAd != null && this.i.a(aign.INTERSTITIAL_PLAYING, aign.INTERSTITIAL_REQUESTED)) {
            String str = remoteVideoAd.m;
            ajbl ajblVar = this.m;
            if (ajblVar == null || !TextUtils.equals(ajblVar.Z(), str)) {
                ajbl ajblVar2 = (ajbl) this.I.get(str);
                this.m = ajblVar2;
                if (ajblVar2 == null) {
                    ajbl ar = ar(str, 1);
                    this.m = ar;
                    this.I.put(str, ar);
                }
            }
        } else if (remoteVideoAd == null && this.i.a(aign.INTERSTITIAL_PLAYING, aign.INTERSTITIAL_REQUESTED)) {
            String valueOf = String.valueOf(this.n);
            String valueOf2 = String.valueOf(this.j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 132 + String.valueOf(valueOf2).length());
            sb.append("MdxDirector setVideoStage ad null when playing interstitial | broadcastType: ");
            sb.append(i);
            sb.append(" | adPlayerResponse: ");
            sb.append(valueOf);
            sb.append(" | lastMdxPlayerState: ");
            sb.append(valueOf2);
            afsi.b(2, 21, sb.toString());
        } else if (remoteVideoAd != null) {
            String valueOf3 = String.valueOf(this.i);
            String valueOf4 = String.valueOf(this.j);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 134 + String.valueOf(valueOf4).length());
            sb2.append("MdxDirector setVideoStage ad should be null when videoStage is not an Ad state ");
            sb2.append(i);
            sb2.append(" | adPlayerResponse: ");
            sb2.append(valueOf3);
            sb2.append(" | lastMdxPlayerState: ");
            sb2.append(valueOf4);
            afsi.b(2, 21, sb2.toString());
            remoteVideoAd = null;
        }
        aign aignVar = this.i;
        PlayerResponseModel playerResponseModel2 = this.l.a;
        PlayerResponseModel playerResponseModel3 = this.G.a;
        adiv adivVar = aignVar.h() ? this.G : this.l;
        ajbl ajblVar3 = this.k;
        ahef ahefVar = new ahef(aignVar, playerResponseModel2, playerResponseModel3, adivVar, ajblVar3 != null ? ((efy) ajblVar3).a : null, remoteVideoAd == null ? null : remoteVideoAd.m, z);
        if (i == 0) {
            this.k.aD().c(ahefVar);
        } else {
            this.y.p(ahefVar);
        }
        if (!aignVar.h() || remoteVideoAd == null) {
            return;
        }
        if (this.n != null || this.l.a != null) {
            xgd s = remoteVideoAd.s();
            PlayerResponseModel playerResponseModel4 = this.n;
            if (playerResponseModel4 != null) {
                s.k = playerResponseModel4;
            }
            PlayerResponseModel playerResponseModel5 = this.l.a;
            if (playerResponseModel5 != null) {
                s.h = playerResponseModel5.G();
            }
            remoteVideoAd = s.a();
        }
        wnp wnpVar = this.p;
        ajbl ajblVar4 = this.k;
        String str2 = ajblVar4 != null ? ((efy) ajblVar4).a : null;
        PlayerResponseModel playerResponseModel6 = this.l.a;
        wnpVar.b(remoteVideoAd, str2, playerResponseModel6, false);
        new xah(wnpVar.a, remoteVideoAd, xfn.PRE_ROLL, playerResponseModel6, wnpVar, xcf.a).b(ahefVar.c(), ahefVar.e());
        if (remoteVideoAd.a) {
            x(0);
        }
    }

    private final void au(ajbl ajblVar, int i) {
        ahej ahejVar = new ahej(this.D);
        if (i == 0) {
            this.y.m(ahejVar, ajblVar);
        } else {
            this.y.r(ahejVar);
        }
    }

    private final void av() {
        for (ajbl ajblVar : this.I.values()) {
            if (ajblVar != this.k) {
                this.y.i(ajblVar);
            }
        }
        this.I.clear();
    }

    private final void aw() {
        if (this.l.a == null) {
            zga.c(t, "Can not fling video, missing playerResponse.");
        } else {
            this.g.M(aq().a());
        }
    }

    private final void ax() {
        ajbl ajblVar = this.m;
        if (ajblVar != null) {
            this.y.i(ajblVar);
            this.I.remove(this.m.Z());
            this.m = null;
        }
    }

    @Override // defpackage.aiwk
    public final void A(PlayerResponseModel playerResponseModel, PlayerResponseModel playerResponseModel2) {
        C(playerResponseModel, null);
    }

    @Override // defpackage.aiwk
    public final void B(PlayerResponseModel playerResponseModel, aigr aigrVar) {
    }

    @Override // defpackage.aiwk
    public final void C(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor) {
        adjb adjbVar;
        if (this.g.a() != 1) {
            return;
        }
        this.l.a = playerResponseModel;
        this.k.p().e(playerResponseModel);
        aiwl.y(playerResponseModel, this.k);
        this.C = playbackStartDescriptor;
        boolean z = false;
        String.format(Locale.US, "Loading videoId %s\n playlistId %s\n playbackDescriptor %s\n", playerResponseModel.y(), this.K.c(), playbackStartDescriptor);
        this.n = null;
        Q(aign.PLAYBACK_LOADED, null);
        aryi q = playerResponseModel.q();
        boolean z2 = ahbx.l(q) || ahbx.k(q);
        aapf aapfVar = this.x;
        PlayerResponseModel playerResponseModel2 = playerResponseModel.j(aapfVar) != null ? playerResponseModel.j(aapfVar).a : null;
        if (playerResponseModel2 != null && ahbx.l(playerResponseModel2.q())) {
            z = true;
        }
        if (z2 || z) {
            String y = playerResponseModel.y();
            adlm adlmVar = this.g;
            if (!TextUtils.isEmpty(adlmVar.y()) || !adlmVar.w().equals(y)) {
                adjbVar = adjb.PLAYING_VIDEO;
            } else {
                adjbVar = adjb.SHOWING_TV_QUEUE;
            }
            String.valueOf(String.valueOf(adjbVar)).length();
            this.a.d(adjbVar);
            if (this.g.ai(playerResponseModel.y(), this.K.c())) {
                String valueOf = String.valueOf(playerResponseModel.y());
                if (valueOf.length() != 0) {
                    "MdxDirector: flinging video ".concat(valueOf);
                }
                aw();
                if (aa()) {
                    z(this.g.m());
                    return;
                }
                return;
            }
            String str = true != playerResponseModel.y().equals(this.g.y()) ? "Showing TV queue with first video id " : "Remote screen already playing ";
            String valueOf2 = String.valueOf(playerResponseModel.y());
            if (valueOf2.length() != 0) {
                str.concat(valueOf2);
            }
            z(this.g.m());
            return;
        }
        G();
    }

    @Override // defpackage.aiwk
    public final void D(aigr aigrVar) {
    }

    @Override // defpackage.aiwk
    public final void E() {
        if (aa()) {
            this.g.K();
        }
    }

    @Override // defpackage.aiwk
    public final void F() {
        if (aa()) {
            this.g.L();
        } else {
            aw();
        }
    }

    public final void G() {
        aigr aigrVar = new aigr(3, adkw.UNPLAYABLE.j, this.u.getString(adkw.UNPLAYABLE.i));
        this.k.p().l = aigrVar;
        this.y.t(aigrVar, this.o, 4);
    }

    @Override // defpackage.aiwk
    public final void H(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, String str) {
    }

    @Override // defpackage.aiwk
    public final void I(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
    }

    @Override // defpackage.aiwk
    public final void J() {
        at(1, this.g.h());
        au(this.o, 1);
        x(1);
        as(1);
    }

    @Override // defpackage.aiwk
    public final void K() {
        this.l.g();
        this.G.g();
        this.n = null;
        ax();
        this.k.p().e(null);
        this.k.p().l = null;
        ax();
        av();
        this.l.a = null;
        this.G.a = null;
        this.n = null;
        this.C = null;
        this.E = 0L;
        this.F = null;
        this.f34J = amru.q();
        Q(aign.NEW, null);
        S(null, 4);
        this.f.removeMessages(1);
        this.d.c();
        this.a.m(this);
        this.g.O(this);
        Q(aign.NEW, null);
        this.h.c(null);
        this.h.b(null);
        this.y.j();
        this.y.i(this.k);
        this.y.a();
        av();
        this.r = true;
    }

    @Override // defpackage.aiwk
    public final void L() {
        if (aa()) {
            this.g.L();
        } else if (TextUtils.isEmpty(this.g.y())) {
            aw();
        }
    }

    @Override // defpackage.aiwk
    public final void M(String str) {
        if (aa()) {
            this.g.S(str);
        }
    }

    @Override // defpackage.aiwk
    public final void N(float f) {
    }

    @Override // defpackage.aiwk
    public final void O(int i) {
    }

    @Override // defpackage.aiwk
    public final void P(avzr avzrVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(aign aignVar, RemoteVideoAd remoteVideoAd) {
        if (this.i == aignVar) {
            return;
        }
        this.i = aignVar;
        String.valueOf(String.valueOf(aignVar)).length();
        if (ad()) {
            this.H = this.G;
        } else {
            this.H = this.l;
        }
        at(0, remoteVideoAd);
    }

    @Override // defpackage.aiwk
    public final void R(boolean z) {
    }

    public final void S(ajbl ajblVar, int i) {
        this.D = i;
        au(ajblVar, 0);
    }

    @Override // defpackage.aiwk
    public final void T() {
    }

    @Override // defpackage.aiwk
    public final void U() {
        this.g.Y();
    }

    public final void V(ajbl ajblVar) {
        if (ajblVar == null) {
            String valueOf = String.valueOf(this.m);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
            sb.append("MdxDirector Null singleVideoComponent given to updateCurrentComponent | adComponent ");
            sb.append(valueOf);
            String str = "non-null";
            if (sb.toString() == null) {
                String valueOf2 = String.valueOf(this.k);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
                sb2.append("null | contentComponent: ");
                sb2.append(valueOf2);
                if (sb2.toString() == null) {
                    str = "null";
                }
            }
            afsi.b(2, 21, str);
            return;
        }
        boolean containsKey = this.I.containsKey(ajblVar.Z());
        if (!containsKey) {
            this.I.put(ajblVar.Z(), ajblVar);
        }
        if (this.o == ajblVar && containsKey) {
            return;
        }
        this.o = ajblVar;
        this.y.b(ajblVar);
    }

    @Override // defpackage.aiwk
    public final void W() {
    }

    @Override // defpackage.aiwk
    public final boolean X(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        return false;
    }

    @Override // defpackage.aiwk
    public final boolean Y() {
        return true;
    }

    @Override // defpackage.aiwk
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void a() {
        RemoteVideoAd h = this.g.h();
        if (h != null && this.l.a != null) {
            xgd s = h.s();
            s.h = this.l.a.G();
            h = s.a();
        }
        if (h != null) {
            wnp wnpVar = this.p;
            ajbl ajblVar = this.k;
            wnpVar.b(h, ajblVar != null ? ((efy) ajblVar).a : null, this.l.a, true);
            return;
        }
        this.p.c(xce.VIDEO_ENDED);
    }

    public final boolean aa() {
        return amkq.b(v(), this.g.y());
    }

    @Override // defpackage.aiwk
    public final boolean ab() {
        return !ai(aign.ENDED);
    }

    @Override // defpackage.aiwk
    public final boolean ac() {
        return this.j == adlf.PLAYING || this.j == adlf.AD_PLAYING;
    }

    @Override // defpackage.aiwk
    public final boolean ad() {
        return ai(aign.INTERSTITIAL_PLAYING);
    }

    @Override // defpackage.aiwk
    public final boolean ae() {
        return ai(aign.VIDEO_PLAYING);
    }

    @Override // defpackage.aiwk
    public final boolean af() {
        return this.g.a() == 2;
    }

    public final boolean ag(long j) {
        if (aa()) {
            this.g.Q(Math.max(j, 0L));
            return true;
        }
        if (this.l.a == null || !TextUtils.isEmpty(this.g.y())) {
            return false;
        }
        adld aq = aq();
        aq.b(Math.max(j, 0L));
        this.g.M(aq.a());
        return true;
    }

    @Override // defpackage.aiwk
    public final boolean ah(long j, aupb aupbVar) {
        return ag(j);
    }

    @Override // defpackage.aiwk
    public final boolean ai(aign aignVar) {
        return this.i.a(aignVar);
    }

    @Override // defpackage.aiwk
    public final boolean aj(aign aignVar) {
        return this.i.c(aignVar);
    }

    @Override // defpackage.aiwk
    public final void ak() {
    }

    @Override // defpackage.aiwk
    public final ajbf al() {
        return null;
    }

    @Override // defpackage.aiwk
    public final void am() {
    }

    @Override // defpackage.aiwk
    public final void an(long j, aupb aupbVar) {
        ag(this.g.c() + j);
    }

    @Override // defpackage.aiwk
    public final dsm ao() {
        PlayerResponseModel playerResponseModel = this.l.a;
        return aemv.h;
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void b(aanb aanbVar) {
        this.F = aanbVar;
        as(0);
    }

    @Override // defpackage.adlz, defpackage.adlq
    public final void c(List list) {
        this.f34J = amru.o(list);
        as(0);
    }

    @Override // defpackage.xci
    public final void d(int i, int i2) {
        this.g.X();
    }

    @Override // defpackage.xci
    public final void e() {
    }

    @Override // defpackage.aiwk
    public final float j() {
        return 1.0f;
    }

    @Override // defpackage.aiwk
    public final long k() {
        if (aa() && this.g.a() == 1) {
            this.E = this.g.c();
        }
        return this.E;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xbi.class, adlg.class};
        }
        if (i == 0) {
            d(-1, -1);
            return null;
        }
        if (i == 1) {
            adlg adlgVar = (adlg) obj;
            if (!aj(aign.PLAYBACK_LOADED)) {
                return null;
            }
            if (!aa() && (!adlgVar.a().equals(adlf.ENDED) || !TextUtils.isEmpty(this.g.y()))) {
                return null;
            }
            z(adlgVar.a());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aiwk
    public final long l(long j) {
        return -1L;
    }

    @Override // defpackage.aiwk
    public final long n() {
        if (aa() && aj(aign.PLAYBACK_LOADED)) {
            return ap();
        }
        return 0L;
    }

    @Override // defpackage.aiwk
    public final PlayerResponseModel o() {
        return this.l.a;
    }

    @Override // defpackage.aiwk
    public final aigr p() {
        return this.k.p().l;
    }

    @Override // defpackage.aiwk
    public final aixh q() {
        return this.l;
    }

    @Override // defpackage.aiwk
    public final aixh r() {
        return this.H;
    }

    @Override // defpackage.aiwk
    public final ajbl s() {
        return this.k;
    }

    @Override // defpackage.aiwk
    public final DirectorSavedState t(int i) {
        return null;
    }

    @Override // defpackage.aiwk
    public final String u() {
        ajbl ajblVar = this.k;
        if (ajblVar != null) {
            return ((efy) ajblVar).a;
        }
        return null;
    }

    @Override // defpackage.aiwk
    public final String v() {
        PlayerResponseModel playerResponseModel = this.l.a;
        if (playerResponseModel == null) {
            return null;
        }
        return playerResponseModel.y();
    }

    @Override // defpackage.aiwk
    public final void w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r27) {
        /*
            r26 = this;
            r0 = r26
            adlm r1 = r0.g
            com.google.android.libraries.youtube.ads.model.RemoteVideoAd r1 = r1.h()
            if (r1 == 0) goto Lf
            int r1 = r1.b
            int r1 = r1 * 1000
            goto L10
        Lf:
            r1 = 0
        L10:
            long r2 = r26.ap()
            adlf r4 = defpackage.adlf.UNSTARTED
            aign r4 = defpackage.aign.NEW
            aign r4 = r0.i
            int r4 = r4.ordinal()
            r5 = 0
            r7 = -1
            if (r4 == 0) goto L72
            r9 = 1
            if (r4 == r9) goto L72
            r9 = 2
            if (r4 == r9) goto L5f
            r5 = 5
            if (r4 == r5) goto L53
            r1 = 8
            if (r4 == r1) goto L3e
            r1 = 9
            if (r4 != r1) goto L38
            r0.E = r2
            goto L5c
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L3e:
            adlm r1 = r0.g
            long r4 = r1.c()
            r0.E = r4
            adlm r1 = r0.g
            long r7 = r1.g()
            adlm r1 = r0.g
            long r4 = r1.d()
            goto L6d
        L53:
            long r2 = (long) r1
            adlm r1 = r0.g
            long r4 = r1.c()
            r0.E = r4
        L5c:
            r16 = r2
            goto L76
        L5f:
            r0.E = r5
            adlm r1 = r0.g
            long r7 = r1.g()
            adlm r1 = r0.g
            long r4 = r1.d()
        L6d:
            r16 = r2
            r12 = r4
            r14 = r7
            goto L78
        L72:
            r0.E = r5
            r16 = r5
        L76:
            r12 = r7
            r14 = r12
        L78:
            aheg r1 = new aheg
            r9 = r1
            long r10 = r0.E
            r18 = 0
            r20 = -1
            shf r2 = r0.v
            long r22 = r2.d()
            r24 = 0
            ajbl r2 = r0.o
            java.lang.String r25 = r2.Z()
            r9.<init>(r10, r12, r14, r16, r18, r20, r22, r24, r25)
            if (r27 != 0) goto L9d
            aiwl r2 = r0.y
            ajbl r3 = r0.o
            r4 = 4
            r2.u(r3, r1, r4)
            return
        L9d:
            aiwl r2 = r0.y
            r2.q(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adit.x(int):void");
    }

    @Override // defpackage.aiwk
    public final void y() {
    }

    final void z(adlf adlfVar) {
        String.valueOf(String.valueOf(adlfVar)).length();
        this.w.execute(new adim(this, adlfVar, this.g.h(), 0));
    }
}
