package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiwq implements aiwk, aipy, ajat, ajay, aixu, aiww {
    public static final ncf r = new ncf();
    private final axpg A;
    private final afgb B;
    private long C;
    private final Map D;
    private final aigv E;
    private final aadw F;
    private final airs G;
    private final ajoy H;
    private final aoae I;
    public final shf a;
    public final aiwl b;
    public final aifs c;
    public final zgj d;
    public final aaea e;
    public final aixe g;
    public final aifk h;
    public aixg i;
    public ajbr j;
    public aixg k;
    public ajbr l;
    public aixg m;
    public boolean o;
    public boolean p;
    public int q;
    private final aemv s;
    private final afjo t;
    private final aigt u;
    private final aaoz v;
    private final aiwt w;
    private final boolean x;
    private final ajbk y;
    private final aiwx z;
    public aign n = aign.NEW;
    public final ajbv f = new ajbv(this, new amml() { // from class: aiwm
        @Override // defpackage.amml
        public final Object apply(Object obj) {
            aiwq.this.aA(false);
            return null;
        }
    });

    public aiwq(shf shfVar, aemv aemvVar, afjo afjoVar, ajoy ajoyVar, aigt aigtVar, aiwl aiwlVar, aifs aifsVar, aigv aigvVar, aaoz aaozVar, zgj zgjVar, aoae aoaeVar, aiwt aiwtVar, aaea aaeaVar, aadw aadwVar, ajbk ajbkVar, aiwx aiwxVar, axpg axpgVar, airs airsVar, aifk aifkVar, afgb afgbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = shfVar;
        this.s = aemvVar;
        this.t = afjoVar;
        this.H = ajoyVar;
        this.u = aigtVar;
        this.b = aiwlVar;
        this.c = aifsVar;
        this.E = aigvVar;
        this.v = aaozVar;
        this.d = zgjVar;
        this.I = aoaeVar;
        this.w = aiwtVar;
        this.e = aaeaVar;
        this.F = aadwVar;
        this.z = aiwxVar;
        this.A = axpgVar;
        this.G = airsVar;
        this.h = aifkVar;
        this.B = afgbVar;
        this.g = new aixe(shfVar, aaeaVar, new Handler(Looper.getMainLooper()), new azrw() { // from class: aiwn
            @Override // defpackage.azrw
            public final Object get() {
                return aiwq.this.m;
            }
        });
        this.x = aifk.b(aaeaVar, aihs.b) > 15000;
        this.y = ajbkVar;
        this.D = new HashMap();
    }

    private final float aB(PlayerConfigModel playerConfigModel) {
        if (aiqm.u(playerConfigModel, this.c)) {
            return 0.0f;
        }
        float c = playerConfigModel == null ? 1.0f : playerConfigModel.c();
        if (playerConfigModel == null || !playerConfigModel.ah()) {
            return c * this.c.a();
        }
        return this.c.a();
    }

    private static float aC(aixg aixgVar) {
        return aixgVar.a.p().d;
    }

    private final int aD(boolean z, boolean z2) {
        int i = this.c.r == owg.AUDIO_ROUTE_ALARM ? 1 : 0;
        if (z) {
            i |= 2;
        }
        if (z2) {
            i |= 4;
        }
        if (this.c.g() == aigf.INLINE_IN_FEED) {
            i |= 16;
        }
        return this.c.l ? i | 8 : i;
    }

    private final int aE(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null || playerResponseModel.c != null) {
            return ahbj.E(this.c, playerResponseModel) ? 2 : 0;
        }
        afsi.b(1, 10, "playVideo called on player response with no videoStreamingData.");
        return 1;
    }

    private final long aF() {
        if (!this.n.f() || as() || ahbj.D(this.m.a)) {
            if (ai(aign.ENDED)) {
                return n();
            }
            return ahbj.w(s());
        }
        return ahbj.x(this.s);
    }

    private final long aG() {
        aixg aixgVar = this.m;
        String A = aixgVar.A();
        return this.f.d(A) != null ? this.f.a(A, ahbj.w(aixgVar.a)) : this.C;
    }

    private final PlayerResponseModel aH() {
        return aN().c();
    }

    private final afjf aI(acsx acsxVar) {
        afjf afjfVar = this.t;
        if (acsxVar != null && !(acsxVar instanceof acsz)) {
            atcl atclVar = this.e.a().i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            aqvb aqvbVar = atclVar.h;
            if (aqvbVar == null) {
                aqvbVar = aqvb.b;
            }
            if (aqvbVar.B) {
                afjfVar = this.H.m(acsxVar);
            }
            afjfVar.D();
        }
        return afjfVar;
    }

    private final afjf aJ(aixg aixgVar) {
        return aI((acsx) aixgVar.a.b().a());
    }

    private final afkl aK() {
        aifs aifsVar = this.c;
        if (aifsVar.l) {
            return null;
        }
        return aifsVar.f;
    }

    private final aixg aL(String str, int i, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, boolean z) {
        aemv aemvVar = this.s;
        aixe aixeVar = this.g;
        aiwl aiwlVar = this.b;
        aifs aifsVar = this.c;
        aiwt aiwtVar = this.w;
        aigt aigtVar = this.u;
        aiws aiwsVar = new aiws(this);
        shf shfVar = this.a;
        ajbk ajbkVar = this.y;
        ajbkVar.b(str);
        ajbkVar.h(i);
        ajbkVar.f(this.f);
        ajbkVar.c(this);
        ajbkVar.d(z);
        ajbkVar.e(aigdVar != null ? aigdVar.b : null);
        ajbkVar.g(this.B.b());
        aixg aixgVar = new aixg(aemvVar, aixeVar, aiwlVar, aifsVar, aiwtVar, aigtVar, aiwsVar, shfVar, ajbkVar.a(), new aiwo(this), this.h, this.F, this.e);
        aixgVar.a.i().a.i = this;
        aixgVar.a.p().a = playbackStartDescriptor;
        aixgVar.a.p().b = aigdVar;
        this.b.h(aixgVar.a);
        if (i != 0) {
            this.D.put(str, aixgVar);
        }
        return aixgVar;
    }

    private final aixh aM(aign aignVar) {
        aixg aixgVar = this.k;
        return (!aignVar.h() || aixgVar == null) ? this.i.b : aixgVar.b;
    }

    private final ajbl aN() {
        aixg aixgVar;
        if (this.f.g()) {
            ajbu o = this.f.o();
            if (o == null) {
                aixgVar = this.i;
            } else {
                aixgVar = (aixg) this.D.get(o.e);
                if (aixgVar == null || (aixgVar.a.a() != 3 && !this.h.C())) {
                    aixgVar = this.i;
                }
            }
        } else {
            aixgVar = this.i;
        }
        return aixgVar.a;
    }

    private final void aO(boolean z, int i, ajbl ajblVar, long j) {
        aixg aixgVar = this.k;
        aheg ahegVar = null;
        if (!this.n.h() || aixgVar == null) {
            this.g.e = ajblVar.m().b(j, z);
            if (bc()) {
                aheg ahegVar2 = new aheg(j, -1L, ajblVar.p().g, ahbj.v(ajblVar), ajblVar.p().i, ajblVar.p().j, this.a.d(), false, ajblVar.Z());
                this.m.a.i().k(ahegVar2);
                ahegVar = ahegVar2;
            }
        } else {
            long b = aixgVar.a.m().b(j, z);
            PlayerResponseModel c = aixgVar.a.c();
            if (c == null) {
                return;
            }
            int a = c.a();
            this.g.e = b;
            aheg ahegVar3 = new aheg(j, -1L, -1L, TimeUnit.SECONDS.toMillis(a), 0L, -1L, this.a.d(), false, ajblVar != null ? ajblVar.Z() : null);
            aixgVar.a.i().k(ahegVar3);
            ahegVar = ahegVar3;
        }
        if (ahegVar != null) {
            bg(i, ajblVar, ahegVar, 4);
        }
    }

    private final void aP() {
        this.m.a.am().c(new ahcs());
    }

    private final void aQ() {
        ahcy ahcyVar = new ahcy(null);
        ahcyVar.b(this.a.c());
        this.m.a.an().c(ahcyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aR(defpackage.aixg r10, com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwq.aR(aixg, com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor):void");
    }

    private final void aS() {
        afkl aK = aK();
        if (aK != null && this.x && (aK instanceof afky)) {
            ((afky) aK).rE(2);
        }
    }

    private final void aT(aixg aixgVar) {
        PlayerResponseModel playerResponseModel;
        aiwq aiwqVar = this;
        PlayerResponseModel a = aixgVar.a();
        if (aiwqVar.aE(a) == 0) {
            aiwqVar.ag(aign.INTERSTITIAL_REQUESTED);
            ay(aigj.VIDEO_REQUESTED, aixgVar.a);
            PlayerResponseModel a2 = aixgVar.a();
            if (a2 == null) {
                playerResponseModel = a;
            } else {
                PlayerConfigModel c = a2.c();
                aiwqVar.g.g = false;
                aiwqVar.x(aixgVar.a.a() != 1, 0, aixgVar.a);
                aiwqVar.c.q(ar(a2.c));
                aiwl.z(new ahdi(c.au()), s());
                aemv aemvVar = aiwqVar.s;
                aesj aesjVar = new aesj();
                playerResponseModel = a;
                aesjVar.q(a2.c, aemv.k(ahbj.w(aixgVar.a), c.H(), c.G()), aixgVar.A(), c, aK(), aixgVar, aesm.b, aiwqVar.aB(c), aC(aixgVar), aiwqVar.aD(true, aZ(aixgVar.b())), aJ(aixgVar), aixgVar.a.d(), bh(aixgVar));
                aemvVar.t(aesjVar);
                ap(aixgVar);
                aiwqVar = this;
                aiwqVar.g.a();
                aiwqVar.z.a(aiwqVar);
            }
            aixg aixgVar2 = aiwqVar.k;
            PlayerResponseModel playerResponseModel2 = playerResponseModel;
            if (playerResponseModel2 == null || aixgVar2 == null) {
                zga.b("Interstitial Video failed to load; Interstitial SingleVideoController was nulled during medialib load");
                return;
            } else {
                aixgVar2.a.i().d(s().Z(), playerResponseModel2, aixgVar.A(), 1);
                return;
            }
        }
        afsi.b(1, 10, "Interstitial Video was unplayable");
    }

    private final void aU(String str) {
        aixg aixgVar = (aixg) this.D.remove(str);
        if (aixgVar != null) {
            aixgVar.C();
            this.b.i(aixgVar.a);
        }
    }

    private final void aV(List list, boolean z, boolean z2) {
        aixg aixgVar;
        aeqr j;
        Iterator it;
        this.s.p();
        if (list.isEmpty()) {
            return;
        }
        ajbt ajbtVar = (ajbt) list.remove(0);
        boolean z3 = !ba();
        String str = null;
        if (z || !this.m.a.Z().equals(ajbtVar.b()) || z3) {
            str = ajbtVar.b();
            aixgVar = (aixg) this.D.get(ajbtVar.b());
            if (aixgVar == null && ajbtVar.b().equals(this.i.A())) {
                aixgVar = this.i;
            }
            PlayerResponseModel a = ajbtVar.a();
            if (aixgVar != null && a != null) {
                PlayerConfigModel c = a.c();
                this.c.q(ar(a.c));
                aiwl.z(new ahdi(c.au()), aixgVar.a);
                this.g.g = false;
                aesm aesmVar = aesm.b;
                if (c.aj()) {
                    aesmVar = (aesm) this.A.get();
                }
                aesm aesmVar2 = aesmVar;
                aemv aemvVar = this.s;
                aesj aesjVar = new aesj();
                VideoStreamingData videoStreamingData = a.c;
                if (!z2) {
                    j = aemv.j(ajbtVar.a);
                } else {
                    j = aemv.k(ajbtVar.a, c.H(), c.G());
                }
                aesjVar.q(videoStreamingData, j, ajbtVar.b(), c, aK(), ajbtVar.d, aesmVar2, aB(c), aC(this.i), aD(true, aZ(this.i.b())), aJ(this.i), this.i.a.d(), bh(this.i));
                aemvVar.t(aesjVar);
                this.g.a();
                this.z.a(this);
            } else if (a == null) {
                afsi.b(2, 10, "LocalDirector loading a media segment with no PlayerResponse.");
            } else {
                afsi.b(2, 10, "LocalDirector loading a CPN which does not have a component.");
            }
            if (aixgVar != null) {
                ap(aixgVar);
                ahbj.z(aixgVar.a, ajbtVar.a);
            }
        } else {
            aixgVar = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ajbt ajbtVar2 = (ajbt) it2.next();
            aesm aesmVar3 = aesm.b;
            PlayerResponseModel a2 = ajbtVar2.a();
            if (a2 != null) {
                if (a2.c().aj()) {
                    aesmVar3 = (aesm) this.A.get();
                }
                aesm aesmVar4 = aesmVar3;
                aemv aemvVar2 = this.s;
                aesj aesjVar2 = new aesj();
                it = it2;
                aesjVar2.q(a2.c, aemv.j(ajbtVar2.a), ajbtVar2.b(), a2.c(), aK(), ajbtVar2.d, aesmVar4, aB(a2.c()), aC(this.i), aD(true, aZ(ajbtVar2.d.b())), aJ(this.i), this.i.a.d(), bh(this.i));
                aemvVar2.x(aesjVar2, ajbtVar.c ? -1L : ajbtVar.b);
            } else {
                it = it2;
            }
            it2 = it;
            ajbtVar = ajbtVar2;
        }
        if (aixgVar == null || str == null) {
            return;
        }
        if (aixgVar.a.a() != 1) {
            if (!this.n.f()) {
                ag(aign.VIDEO_REQUESTED);
            }
        } else if (!this.n.h()) {
            aixg h = h(str);
            ag(aign.INTERSTITIAL_REQUESTED);
            ay(aigj.VIDEO_REQUESTED, h.a);
            PlayerResponseModel c2 = h.a.c();
            if (c2 != null) {
                h.a.i().d(s().Z(), c2, h.a.Z(), h.a.a());
            }
        }
        if (ahbj.B(s())) {
            return;
        }
        x(aixgVar.a.a() != 1, 0, aixgVar.a);
    }

    private final void aW() {
        boolean z;
        if (aifk.E(this.e)) {
            z = bb(this.m.a);
        } else {
            z = this.q != 1;
        }
        if (as() || this.n.a(aign.PLAYBACK_INTERRUPTED) || !z || ahbj.D(this.m.a)) {
            return;
        }
        this.m.a.p().e = ahbj.x(this.s);
    }

    private final void aX(boolean z) {
        aW();
        if (this.z.b(this)) {
            this.g.g = true;
            if (z) {
                this.s.o();
            } else {
                this.s.F();
            }
        }
        if (this.n == aign.VIDEO_REQUESTED) {
            ag(aign.READY);
        }
    }

    private final void aY(long j, boolean z) {
        aV(ajbv.s(this.f, null, j, Long.MAX_VALUE), z, true);
    }

    private static boolean aZ(aigd aigdVar) {
        if (aigdVar == null) {
            return false;
        }
        return aigdVar.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ar(VideoStreamingData videoStreamingData) {
        return videoStreamingData != null && videoStreamingData.x();
    }

    public static final void ay(aigj aigjVar, ajbl ajblVar) {
        String valueOf = String.valueOf(aigjVar);
        String Z = ajblVar.Z();
        String.valueOf(valueOf).length();
        String.valueOf(Z).length();
        ajblVar.av().c(new ahds(aigjVar, ajblVar.e(), ajblVar.Z()));
    }

    private final boolean ba() {
        if (aifk.E(this.e)) {
            return bb(this.m.a);
        }
        return this.q != 1;
    }

    private final boolean bb(ajbl ajblVar) {
        return TextUtils.equals(this.s.m(), ajblVar.Z());
    }

    private final boolean bc() {
        PlayerResponseModel c = this.i.a.c();
        return (c != null && c.c() != null && c.c().aV() && c.C() && aifk.e(this.e).f && !this.n.h() && ((ahbj.w(m()) == 0 && ahbj.v(m()) == 0) || m().p().f == -1)) ? false : true;
    }

    private final boolean bd() {
        return ab() || (!as() && this.n.a(aign.NEW, aign.PLAYBACK_LOADED, aign.INTERSTITIAL_REQUESTED, aign.PLAYBACK_PENDING, aign.READY));
    }

    private final void be(ajbl ajblVar, long j, long j2, long j3, long j4, boolean z, int i, int i2) {
        if (au(aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING, aign.VIDEO_REQUESTED, aign.VIDEO_PLAYING, aign.ENDED)) {
            if (bc()) {
                aheg ahegVar = new aheg(j2, j, ajblVar.p().g, ajblVar.p().h, j3, j4, this.a.d(), z, ajblVar.Z());
                this.m.a.i().k(ahegVar);
                bg(i2, ajblVar, ahegVar, i);
                return;
            }
            return;
        }
        String valueOf = String.valueOf(this.n.name());
        zga.b(valueOf.length() != 0 ? "Media progress reported outside media playback: ".concat(valueOf) : new String("Media progress reported outside media playback: "));
    }

    private final void bf(aigr aigrVar, int i, int i2) {
        if (aigrVar != null) {
            if (aigrVar != s().p().l) {
                aigt aigtVar = this.u;
                String A = this.m.A();
                String string = aigtVar.b.getString(R.string.cpn_msg_on_error);
                if (!TextUtils.equals(A, aigrVar.b)) {
                    aigrVar.b = A;
                    if (!TextUtils.isEmpty(A) && !TextUtils.isEmpty(string)) {
                        String str = aigrVar.d;
                        String format = String.format(string, A);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(format).length());
                        sb.append(str);
                        sb.append("\n");
                        sb.append(format);
                        aigrVar.d = sb.toString();
                    }
                }
            }
            if (i2 == 0) {
                this.b.t(aigrVar, this.m.a, i);
            } else {
                aiwl aiwlVar = this.b;
                Iterator it = aiwlVar.b.iterator();
                while (it.hasNext()) {
                    ((ajbh) it.next()).r(aigrVar);
                }
                aiwlVar.a.d(aigrVar);
            }
        }
        if (aigrVar == null || ahbl.d(aigrVar.i)) {
            s().p().l = aigrVar;
        }
    }

    private final void bg(int i, ajbl ajblVar, aheg ahegVar, int i2) {
        if (!au(aign.INTERSTITIAL_PLAYING, aign.INTERSTITIAL_REQUESTED) || !ahbj.B(s())) {
            if (s().a() == 0) {
                this.C = ahegVar.g();
            }
            if (i == 0) {
                this.b.s(ajblVar, ahegVar, i2);
            } else {
                this.b.o(ahegVar);
            }
        } else {
            aheg ahegVar2 = new aheg(ahegVar, ahegVar.j(), ajblVar.Z());
            aheg ahegVar3 = new aheg(this.f.l(ahegVar, ajblVar.Z()), ahegVar.j(), this.i.a.Z());
            this.C = ahegVar3.g();
            if (i == 0) {
                this.b.s(ajblVar, ahegVar2, i2);
            } else {
                this.b.o(ahegVar2);
            }
            ahegVar = ahegVar3;
        }
        if (i == 0) {
            this.b.u(ajblVar, ahegVar, i2);
        } else {
            this.b.q(ahegVar);
        }
    }

    private static final byte[] bh(aixg aixgVar) {
        PlaybackStartDescriptor g = aixgVar.a.g();
        if (g != null) {
            return g.z();
        }
        return null;
    }

    private final ajbr bi(boolean z, boolean z2) {
        return az(z, z2, false);
    }

    private static final void bj(ajbl ajblVar, PlayerResponseModel playerResponseModel) {
        ajblVar.p().e(playerResponseModel);
    }

    private final void bk(ajbl ajblVar, boolean z) {
        bl(ajblVar, ajblVar.p().e, z);
    }

    private final void bl(ajbl ajblVar, long j, boolean z) {
        if (ahbj.F(m())) {
            long j2 = s().p().g;
            PlayerResponseModel o = o();
            if (j > j2 && o != null) {
                VideoStreamingData videoStreamingData = o.c;
                List list = videoStreamingData.q;
                List list2 = videoStreamingData.r;
                boolean z2 = this.c.l;
                if (list.size() == 1 && (z2 || list2.size() == 1)) {
                    if (this.s.f((FormatStreamModel) list.get(0), z2 ? null : (FormatStreamModel) list2.get(0), j2, z2) < j) {
                        j = j2;
                    }
                } else {
                    int size = list.size();
                    int size2 = list2.size();
                    StringBuilder sb = new StringBuilder(127);
                    sb.append("syncTimelineToVideoComponent: unexpected offline playback stream count: ");
                    sb.append(size);
                    sb.append(" audio streams and ");
                    sb.append(size2);
                    sb.append(" video streams");
                    afsi.b(2, 10, sb.toString());
                }
            }
        }
        aV(ajbv.s(this.f, ajblVar.Z(), j, Long.MAX_VALUE), z, true);
    }

    @Override // defpackage.aiwk
    public final void A(PlayerResponseModel playerResponseModel, PlayerResponseModel playerResponseModel2) {
        if (!Y()) {
            throw new IllegalStateException("loadVideo() called on LocalDirector in wrong state");
        }
        bj(this.i.a, playerResponseModel);
        ag(aign.PLAYBACK_LOADED);
        this.i.a.o().e(true);
        aixg aL = aL(this.d.a(), 3, null, null, false);
        bj(aL.a, playerResponseModel2);
        aR(aL, null);
    }

    @Override // defpackage.aiwk
    public final void B(PlayerResponseModel playerResponseModel, aigr aigrVar) {
        bj(this.i.a, playerResponseModel);
        D(aigrVar);
    }

    @Override // defpackage.aiwk
    public final void C(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor) {
        if (!Y()) {
            throw new IllegalStateException("loadVideo() called on LocalDirector in wrong state");
        }
        boolean z = true;
        if (!ahbx.l(playerResponseModel.q()) && !ahbx.k(playerResponseModel.q())) {
            z = false;
        }
        amkq.N(z);
        bj(this.i.a, playerResponseModel);
        if (ahbj.B(this.i.a)) {
            this.i.a.q().j();
        }
        if (ahbx.k(playerResponseModel.q())) {
            this.i.a.aa().c(new ahdf());
            ag(aign.PLAYBACK_LOADED);
            return;
        }
        aR(this.i, playbackStartDescriptor);
    }

    @Override // defpackage.aiwk
    public final void D(aigr aigrVar) {
        if (this.e.a() != null) {
            atcl atclVar = this.e.a().i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            auij auijVar = atclVar.f;
            if (auijVar == null) {
                auijVar = auij.b;
            }
            if (auijVar.e && aigrVar.i == 4) {
                aw(aigrVar, 4);
                this.b.i(this.i.a);
                aS();
                return;
            }
        }
        aw(aigrVar, 3);
    }

    @Override // defpackage.aiwk
    public final void E() {
        if (ba()) {
            this.s.u();
            aW();
        }
    }

    @Override // defpackage.aiwk
    public final void F() {
        PlayerResponseModel a;
        PlayerResponseModel aH;
        if (!aj(aign.INTERSTITIAL_REQUESTED)) {
            zga.l("play() called when the player wasn't loaded.");
            return;
        }
        if (ahbj.E(this.c, aH())) {
            zga.l("play() blocked because Background Playability failed");
            return;
        }
        if (aq()) {
            return;
        }
        this.g.g = false;
        s().p().l = null;
        aixg aixgVar = this.k;
        if (at()) {
            int ordinal = this.n.ordinal();
            if (ordinal != 6) {
                if (ordinal == 9) {
                    ahbj.z(s(), 0L);
                }
                this.s.w();
                return;
            }
            this.m.a.m().m();
            ag(aign.VIDEO_PLAYING);
            this.s.w();
            return;
        }
        if (this.j == null || aixgVar == null || aixgVar.a.c() == null) {
            if (this.f.g() || this.f.i()) {
                if (this.o) {
                    aigr p = p();
                    if (p == null) {
                        afsi.b(2, 10, "maybeRegenerateCpnAndStatsClient called unexpectedly, but no error.");
                    } else {
                        String valueOf = String.valueOf(p.d);
                        afsi.c(2, 10, valueOf.length() != 0 ? "maybeRegenerateCpnAndStatsClient called unexpectedly. Error was: ".concat(valueOf) : new String("maybeRegenerateCpnAndStatsClient called unexpectedly. Error was: "), new Exception(p.f));
                    }
                    this.b.j();
                    String a2 = this.d.a();
                    PlayerResponseModel c = this.i.a.c();
                    PlaybackStartDescriptor g = this.i.a.g();
                    aigd h = this.i.a.h();
                    long j = this.i.a.p().e;
                    aixg g2 = g(a2, g, h, true);
                    this.i = g2;
                    this.m = g2;
                    ahbj.z(g2.a, j);
                    bj(this.i.a, c);
                    Iterator it = this.f.u().iterator();
                    while (it.hasNext()) {
                        aU((String) it.next());
                    }
                    PlayerResponseModel c2 = this.i.a.c();
                    if (c2 != null) {
                        ajbv ajbvVar = this.f;
                        ajbvVar.B(ajbvVar.m(c2, this.i.a.Z(), 0));
                    }
                    this.o = false;
                    Iterator it2 = this.b.b.iterator();
                    while (it2.hasNext()) {
                        ((ajbh) it2.next()).t();
                    }
                }
                if (aE(aH()) != 0 || (a = this.i.a()) == null || (aH = aH()) == null) {
                    return;
                }
                this.i.a.o().e(true);
                if (this.j == null || aifk.g(this.e)) {
                    atys e = aifk.e(this.e);
                    if (e == null || !e.B) {
                        if (a.C() && !a.D()) {
                            ahbj.z(s(), 0L);
                        }
                    } else if (((ajbq) this.i.c()).j != -1) {
                        ahbj.z(s(), 0L);
                    }
                    if (ai(aign.ENDED)) {
                        ag(aign.VIDEO_REQUESTED);
                        bl(aN(), 0L, true);
                    } else {
                        if (!aj(aign.VIDEO_REQUESTED)) {
                            ag(aign.VIDEO_REQUESTED);
                        }
                        if (aN().a() == 3 || this.h.C()) {
                            bk(aN(), true);
                        } else {
                            bk(this.m.a, true);
                        }
                    }
                    aN().i().e(aN().Z(), aH, aN().a());
                    return;
                }
                return;
            }
            afsi.b(2, 10, "Attempting to play with no data in PlaybackTimeline");
            return;
        }
        aT(aixgVar);
    }

    public final void G() {
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).E(this);
        }
        this.s.q();
        this.s.F();
        this.q = 1;
        this.g.g = false;
        this.p = false;
        this.c.t(1);
        Q();
        this.l = null;
        this.j = null;
    }

    @Override // defpackage.aiwk
    public final void H(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, String str) {
        if (playbackStartDescriptor == null || aigdVar == null) {
            return;
        }
        aaox h = aaox.h(this.e, playbackStartDescriptor.f(), str, playbackStartDescriptor.c(), aigdVar.h, playbackStartDescriptor.z());
        aesn a = this.G.a(str);
        if (h == null || TextUtils.isEmpty(playbackStartDescriptor.l())) {
            return;
        }
        h.f(playbackStartDescriptor.l());
        this.s.s(h, a, aI(aigdVar.b));
    }

    @Override // defpackage.aiwk
    public final void I(PlayerResponseModel playerResponseModel, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        if (this.n.a(aign.NEW, aign.PLAYBACK_PENDING, aign.ENDED)) {
            afsi.b(2, 10, "Attempting to queue video when video is not loaded and playing");
        }
        if (this.f.g()) {
            aixg g = g(playbackStartDescriptor.g(this.d), playbackStartDescriptor, aigdVar, false);
            g.a.p().e(playerResponseModel);
            this.D.put(g.A(), g);
            ajbv ajbvVar = this.f;
            Iterator it = ajbvVar.t(ajbvVar.d(this.i.A())).iterator();
            while (it.hasNext()) {
                aU((String) it.next());
            }
            ajbv ajbvVar2 = this.f;
            ajbvVar2.B(ajbvVar2.m(playerResponseModel, g.a.Z(), 0));
            this.f.x();
        }
    }

    @Override // defpackage.aiwk
    public final void J() {
        z(1);
        av(this.m.a, 4, 1);
        if (as()) {
            x(false, 1, this.m.a);
        } else {
            ajbl ajblVar = this.m.a;
            be(ajblVar, ajblVar.p().f, this.m.a.p().e, this.m.a.p().i, this.m.a.p().j, false, 4, 1);
        }
        bf(s().p().l, 4, 1);
        PlayerResponseModel c = this.i.a.c();
        if (c == null) {
            return;
        }
        VideoStreamingData videoStreamingData = c.c;
        PlayerConfigModel c2 = c.c();
        if (videoStreamingData == null || c2 == null) {
            return;
        }
        try {
            aeeu b = this.s.b(videoStreamingData, c2, this.c.l);
            aeqq aeqqVar = new aeqq(null, null, null, b.d, b.e, b.f, 0);
            this.m.a.i().c(aeqqVar);
            this.b.n(aeqqVar, this.m.a.Z());
        } catch (aeew unused) {
        }
    }

    @Override // defpackage.aiwk
    public final void K() {
        if (this.z.b(this)) {
            this.s.F();
        }
        this.g.g = true;
        aS();
        if (this.n != aign.NEW) {
            this.i.a.o().e(false);
            this.i.a.o().d();
            this.j = null;
            this.l = null;
            this.q = 1;
            if (this.z.b(this)) {
                this.s.q();
                this.s.p();
                this.s.F();
            }
            this.g.b();
            ag(aign.NEW);
            if (this.D.get(this.i.A()) == null) {
                this.i.C();
                this.b.i(this.i.a);
            }
            Iterator it = this.f.u().iterator();
            while (it.hasNext()) {
                aU((String) it.next());
            }
            Q();
            ArrayList arrayList = new ArrayList(this.D.values());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                aU(((aixg) arrayList.get(i)).A());
            }
            this.b.j();
            atyg F = aifk.F(this.F);
            if (F == null || !F.h) {
                this.c.i();
            }
            this.b.a();
        }
    }

    @Override // defpackage.aiwk
    public final void L() {
        F();
        for (ajbh ajbhVar : this.b.b) {
        }
    }

    @Override // defpackage.aiwk
    public final void M(String str) {
        FormatStreamModel h = this.s.h();
        this.s.z(str);
        if (h == null || this.n.g() || this.v.get() == null || !this.v.get().ah()) {
            return;
        }
        W();
    }

    @Override // defpackage.aiwk
    public final void N(float f) {
        s().p().d = f;
        if (this.n.h()) {
            return;
        }
        this.s.B(f);
    }

    @Override // defpackage.aiwk
    public final void O(int i) {
        FormatStreamModel h = this.s.h();
        this.s.C(i, u());
        if ((aifk.l(this.e) || h != null) && !this.n.g()) {
            this.b.d(new ahco(i), this.m.a);
        }
    }

    @Override // defpackage.aiwk
    public final void P(avzr avzrVar) {
        FormatStreamModel h = this.s.h();
        this.s.D(avzrVar, u());
        if ((aifk.l(this.e) || h != null) && !this.n.g()) {
            this.b.d(new ahco(avzrVar, true), this.m.a);
        }
    }

    public final void Q() {
        aixg aixgVar = this.k;
        if (aixgVar != null) {
            aU(aixgVar.a.Z());
            this.k = null;
            if (!this.n.a(aign.INTERSTITIAL_PLAYING, aign.INTERSTITIAL_REQUESTED) || this.i.a() == null) {
                return;
            }
            ag(aign.PLAYBACK_INTERRUPTED);
        }
    }

    @Override // defpackage.aiwk
    public final void R(boolean z) {
        this.g.g = z;
    }

    public final void S() {
        ag(aign.ENDED);
    }

    @Override // defpackage.aiwk
    public final void T() {
        aX(false);
    }

    @Override // defpackage.aiwk
    public final void U() {
        aixg aixgVar = this.m;
        aixg aixgVar2 = this.i;
        if (aixgVar != aixgVar2) {
            this.b.l(new ahcv(aixgVar.A()), this.m.a);
            this.i.B(true);
        } else {
            aixgVar2.B(false);
        }
    }

    public final void V(ajbr ajbrVar, PlayerResponseModel playerResponseModel, long j, float f) {
        if (ajbrVar == null) {
            zga.g("ContentVideoState is null but we're attempting to restore");
            return;
        }
        this.g.g = !ajbrVar.a;
        this.p = ajbrVar.b;
        this.i.a.p().e = ajbrVar.d;
        this.i.a.p().d = f;
        aixg aixgVar = this.k;
        if (aixgVar != null) {
            bj(aixgVar.a, playerResponseModel);
            aixgVar.a.p().e = j;
        }
        this.c.i();
        this.i.a.i().l();
        if (!ajbrVar.c) {
            this.i.a.i().b(ajbrVar.f);
        }
        PlaybackListenerStateRestorerState playbackListenerStateRestorerState = ajbrVar.g;
        if (playbackListenerStateRestorerState != null) {
            aoae aoaeVar = this.I;
            aixg aixgVar2 = this.i;
            aiws aiwsVar = aixgVar2.b;
            boolean z = ajbrVar.c;
            aixgVar2.a.Z();
            aoaeVar.v(playbackListenerStateRestorerState, new ansv(z));
        }
    }

    @Override // defpackage.aiwk
    public final void W() {
        this.s.E(aB(this.v.get()));
    }

    @Override // defpackage.aiwk
    public final boolean X(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        PlayerResponseModel a;
        if (aigdVar != null && aigdVar.c && this.m != null && this.f.g() && this.D != null) {
            ajbu p = this.f.p(this.m.A(), ((ajbq) this.m.c()).e);
            aixg aixgVar = p != null ? (aixg) this.D.get(p.e) : null;
            if (aixgVar != null && (a = aixgVar.a()) != null && playbackStartDescriptor.l().equals(a.y())) {
                aixgVar.a.p().a = playbackStartDescriptor;
                aixgVar.a.p().b = aigdVar;
                zih b = aixgVar.a.b();
                if (b instanceof aifl) {
                    ((aifl) b).a = aigdVar.b;
                }
                this.s.v();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aiwk
    public final boolean Y() {
        aign aignVar = this.n;
        return aignVar != null && aignVar.c(aign.PLAYBACK_PENDING);
    }

    @Override // defpackage.aiwk
    public final boolean Z() {
        return false;
    }

    @Override // defpackage.ajay
    public final void a() {
        V(this.j, null, 0L, aC(this.i));
        this.g.b();
        this.j = null;
        aixg aixgVar = this.m;
        aixg aixgVar2 = this.i;
        if (aixgVar != aixgVar2) {
            ap(aixgVar2);
        }
        Q();
        ag(this.p ? aign.ENDED : aign.READY);
        if (!as()) {
            this.q = 1;
            F();
            return;
        }
        if (this.p) {
            if (!this.f.g() || this.f.z(this.i.a.Z())) {
                PlayerResponseModel c = this.i.a.c();
                if (c == null) {
                    return;
                }
                aemv aemvVar = this.s;
                aesj aesjVar = new aesj();
                aesjVar.q(c.c, aemv.j(ahbj.w(s())), this.i.a.Z(), c.c(), aK(), this.i, aesm.b, aB(c.c()), aC(this.i), aD(false, aZ(this.i.b())), aJ(this.i), this.i.a.d(), bh(this.i));
                aemvVar.t(aesjVar);
                long v = ahbj.v(s());
                ax(s(), 4, -1L, v, v, -1L);
                return;
            }
            ajbu q = this.f.q(this.i.A());
            if (q != null) {
                aV(ajbv.s(this.f, q.e, 0L, Long.MAX_VALUE), true, true);
            }
        }
    }

    public final void aA(boolean z) {
        if (ahbj.B(s())) {
            aY(aG(), false);
            this.i.a.f().b();
        } else if (this.f.d(this.m.A()) != null) {
            bk(this.m.a, z);
        } else {
            bk(this.i.a, z);
        }
    }

    public final void aa(int i) {
        this.q = 1;
        aiwl aiwlVar = this.b;
        aifa aifaVar = new aifa(i);
        ajbl ajblVar = this.m.a;
        for (ajbh ajbhVar : aiwlVar.b) {
        }
        ajblVar.az().c(aifaVar);
    }

    @Override // defpackage.aiwk
    public final boolean ab() {
        return this.n.b() || (this.n.d() && this.s.G());
    }

    @Override // defpackage.aiwk
    public final boolean ac() {
        return this.s.G();
    }

    @Override // defpackage.aiwk
    public final boolean ad() {
        return this.n.h();
    }

    @Override // defpackage.aiwk
    public final boolean ae() {
        return au(aign.VIDEO_REQUESTED, aign.VIDEO_PLAYING);
    }

    @Override // defpackage.aiwk
    public final boolean af() {
        return aifk.E(this.e) ? this.s.m() == null : this.q == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ag(aign aignVar) {
        if (aignVar != aign.PLAYBACK_PENDING) {
            aS();
        } else {
            afkl aK = aK();
            if (aK != null && this.x && (aK() instanceof afky)) {
                ((afky) aK).g(2);
            }
        }
        this.n = aignVar;
        String valueOf = String.valueOf(aignVar.toString());
        if (valueOf.length() != 0) {
            "VideoStage: ".concat(valueOf);
        }
        int ordinal = aignVar.ordinal();
        if (ordinal == 2) {
            this.i.a.m().k();
        } else if (ordinal == 4) {
            aixg aixgVar = this.k;
            if (aixgVar != null) {
                aixgVar.a.m().k();
                aixgVar.a.m().m();
            }
        } else if (ordinal == 7) {
            this.i.a.m().m();
        }
        z(0);
        switch (aignVar.ordinal()) {
            case 1:
                ay(aigj.PLAYBACK_PENDING, this.i.a);
                return;
            case 2:
                ay(aigj.PLAYBACK_LOADED, this.i.a);
                return;
            case 3:
                ay(aigj.PLAYBACK_INTERRUPTED, this.i.a);
                return;
            case 4:
            case 5:
            default:
                return;
            case 6:
                ay(aigj.READY, this.i.a);
                return;
            case 7:
                ay(aigj.VIDEO_REQUESTED, this.i.a);
                return;
            case 8:
                ay(aigj.VIDEO_PLAYING, this.i.a);
                return;
            case 9:
                ay(aigj.ENDED, this.i.a);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c0  */
    @Override // defpackage.aiwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ah(long r25, defpackage.aupb r27) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwq.ah(long, aupb):boolean");
    }

    @Override // defpackage.aiwk
    public final boolean ai(aign aignVar) {
        return this.n == aignVar;
    }

    @Override // defpackage.aiwk
    public final boolean aj(aign aignVar) {
        return this.n.c(aignVar);
    }

    @Override // defpackage.aiwk
    public final void ak() {
        PlayerConfigModel playerConfigModel = this.v.get();
        if (playerConfigModel == null || !playerConfigModel.aO()) {
            this.c.t(3);
            W();
            aiqc i = this.m.a.i();
            aiqm aiqmVar = i.b;
            if (aiqmVar != null && i.f) {
                aiqmVar.p();
            }
            aiqs aiqsVar = i.c;
            if (aiqsVar != null) {
                if (aiqsVar.i) {
                    aiqsVar.b(false, aiqsVar.d.d());
                    aiqsVar.j = false;
                    aiqsVar.h(aiqsVar.d.d());
                } else if (aiqsVar.j) {
                    aiqsVar.j = false;
                }
            }
        }
    }

    @Override // defpackage.aiwk
    public final ajbf al() {
        return this.i.a.o();
    }

    @Override // defpackage.aiwk
    public final void am() {
        this.c.t(2);
        W();
        aiqc i = this.m.a.i();
        aiqm aiqmVar = i.b;
        if (aiqmVar != null && i.f) {
            aiqmVar.j();
        }
        aiqs aiqsVar = i.c;
        if (aiqsVar != null) {
            if (aiqsVar.i) {
                aiqsVar.b(false, aiqsVar.d.d());
                aiqsVar.j = true;
                aiqsVar.h(aiqsVar.d.d());
            } else {
                if (aiqsVar.j) {
                    return;
                }
                aiqsVar.j = true;
            }
        }
    }

    @Override // defpackage.aiwk
    public final void an(long j, aupb aupbVar) {
        long aF;
        if (this.f.g()) {
            ajbv ajbvVar = this.f;
            if (ajbvVar.d) {
                aF = ajbvVar.a(this.m.A(), this.m.a.p().e);
                ah(aF + j, aupbVar);
            }
        }
        aF = aF();
        ah(aF + j, aupbVar);
    }

    @Override // defpackage.aiwk
    public final dsm ao() {
        return ahbj.I(this.s, this.i.a.c());
    }

    public final void ap(aixg aixgVar) {
        aixg aixgVar2;
        boolean containsKey = this.D.containsKey(aixgVar.A());
        if (!containsKey) {
            this.D.put(aixgVar.A(), aixgVar);
        }
        if (aixgVar.a.a() == 0 && (aixgVar2 = this.i) != aixgVar) {
            this.i = aixgVar;
            this.b.f(aixgVar.a);
            Iterator it = this.f.e(aixgVar2.A()).iterator();
            while (it.hasNext()) {
                aU((String) it.next());
            }
            ag(aign.NEW);
            ag(aign.PLAYBACK_PENDING);
            ag(aign.PLAYBACK_LOADED);
            ag(aign.READY);
        }
        if (this.m == aixgVar && containsKey) {
            return;
        }
        this.m = aixgVar;
        this.b.b(aixgVar.a);
        aixg aixgVar3 = this.i;
        ajbl ajblVar = this.m.a;
        if (ajblVar.a() == 1) {
            aiwl aiwlVar = aixgVar3.c;
            String A = aixgVar3.A();
            String Z = ajblVar.Z();
            Iterator it2 = aiwlVar.b.iterator();
            while (it2.hasNext()) {
                ((ajbh) it2.next()).l(A, Z);
            }
            if (aifk.G(aixgVar3.e)) {
                aisa aisaVar = aixgVar3.d;
                String Z2 = ajblVar.Z();
                afgs afgsVar = aisaVar.s;
                if (afgsVar != null) {
                    afgsVar.m(Z2);
                }
            }
        }
    }

    public final boolean aq() {
        PlayerResponseModel c = this.i.a.c();
        boolean g = ahbl.g(this.i.a.c(), this.a);
        if (c != null && g) {
            VideoStreamingData videoStreamingData = c.c;
            long d = this.a.d();
            aa(!videoStreamingData.A(d) ? -1 : (int) TimeUnit.SECONDS.convert(d - videoStreamingData.e, TimeUnit.MILLISECONDS));
        }
        return g;
    }

    public final boolean as() {
        return this.g.g;
    }

    public final boolean at() {
        return ba() && this.n != aign.ENDED;
    }

    public final boolean au(aign... aignVarArr) {
        return this.n.a(aignVarArr);
    }

    public final void av(ajbl ajblVar, int i, int i2) {
        ahej ahejVar = new ahej(ahbj.u(ajblVar), ajblVar != null ? ajblVar.Z() : null);
        if (i2 == 0) {
            this.b.v(ahejVar, i, ajblVar);
        } else {
            this.b.r(ahejVar);
        }
    }

    public final void aw(aigr aigrVar, int i) {
        if (ahbl.d(aigrVar.i)) {
            this.o = true;
        }
        if (aj(aign.READY)) {
            ag(aign.READY);
        } else if (aj(aign.INTERSTITIAL_REQUESTED)) {
            ag(aign.PLAYBACK_LOADED);
        }
        bf(aigrVar, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ax(ajbl ajblVar, int i, long j, long j2, long j3, long j4) {
        if (j2 < 0) {
            return;
        }
        this.g.e = (aifk.m(this.e) && this.m.a.m().n()) ? Long.MAX_VALUE : ajblVar.m().a(j2);
        if (bb(ajblVar) || (ahbj.v(ajblVar) > 0 && ahbj.v(ajblVar) == j2)) {
            ajblVar.p().f = j;
            ahbj.z(ajblVar, j2);
            ajblVar.p().i = j3;
            ajblVar.p().j = j4;
        }
        if (i == 1) {
            return;
        }
        be(ajblVar, j, j2, j3, j4, true, i, 0);
    }

    public final ajbr az(boolean z, boolean z2, boolean z3) {
        ajbr ajbrVar = this.j;
        if (ajbrVar != null) {
            return new ajbr(false, ajbrVar.b || z3, z, ajbrVar.d, ajbrVar.f, ajbrVar.g, ajbrVar.e);
        }
        return new ajbr((z || z2 || !bd()) ? false : true, this.n == aign.ENDED || z3, z, Math.max(aF(), 0L), this.i.a.i().a(), this.I.d(), this.i.a.Z());
    }

    @Override // defpackage.ajay
    public final void b(PlayerResponseModel playerResponseModel, String str) {
        this.j.getClass();
        this.i.a.i().l();
        this.q = 1;
        aixg h = h(str);
        bj(h.a, playerResponseModel);
        ahbj.z(h.a, 0L);
        aiwl.y(playerResponseModel, h.a);
        this.b.e(this.i.a.Z());
        aT(h);
    }

    @Override // defpackage.ajay
    public final void c() {
        if (this.n.h()) {
            T();
            aixg aixgVar = this.k;
            if (aixgVar != null) {
                aixgVar.a.i().g();
            }
            Q();
            ap(this.i);
        }
    }

    @Override // defpackage.ajay
    public final void d() {
        this.j = bi(false, false);
        if (aifk.z(this.e)) {
            this.i.a.m().h();
        }
        E();
        this.g.b();
        ajbr ajbrVar = this.l;
        if (ajbrVar != null) {
            this.g.g = !ajbrVar.a;
            this.p = ajbrVar.b;
            if (!ajbrVar.c) {
                aixg h = h(ajbrVar.e);
                h.a.i().b(ajbrVar.f);
                ahbj.z(h.a, ajbrVar.d);
            }
            PlaybackListenerStateRestorerState playbackListenerStateRestorerState = ajbrVar.g;
            if (playbackListenerStateRestorerState != null) {
                aoae aoaeVar = this.I;
                aixg aixgVar = this.i;
                aiws aiwsVar = aixgVar.b;
                boolean z = ajbrVar.c;
                aixgVar.a.Z();
                aoaeVar.v(playbackListenerStateRestorerState, new ansv(z));
            }
        }
        this.l = null;
        ag(aign.PLAYBACK_INTERRUPTED);
    }

    @Override // defpackage.aipy, defpackage.ajat
    public final void e(aigr aigrVar) {
        String str;
        FormatStreamModel h = this.s.h();
        if (h == null) {
            h = this.s.g();
        }
        if (h == null || !h.J()) {
            aign aignVar = aign.NEW;
            int i = aigrVar.i;
            int i2 = i - 1;
            String str2 = "net.retryexhausted";
            if (i2 == 6) {
                str2 = "servererror";
            } else if (i2 != 7) {
                if (i2 != 8) {
                    switch (i) {
                        case 1:
                            str = "UNKNOWN";
                            break;
                        case 2:
                            str = "VIDEO_ERROR";
                            break;
                        case 3:
                            str = "UNPLAYABLE";
                            break;
                        case 4:
                            str = "REQUEST_FAILED";
                            break;
                        case 5:
                            str = "USER_AGE_CHECK_FAILED";
                            break;
                        case 6:
                            str = "USER_CONTENT_CHECK_FAILED";
                            break;
                        case 7:
                            str = "LICENSE_SERVER_ERROR";
                            break;
                        case 8:
                            str = "LICENSE_SERVER_NET_ERROR";
                            break;
                        case 9:
                            str = "LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR";
                            break;
                        case 10:
                            str = "PLAYER_ERROR";
                            break;
                        case 11:
                            str = "NO_STREAMS";
                            break;
                        case 12:
                            str = "WATCH_NEXT_ERROR";
                            break;
                        case 13:
                            str = "UNPLAYABLE_IN_BACKGROUND";
                            break;
                        case 14:
                            str = "UNPLAYABLE_BY_APP_POLICY";
                            break;
                        default:
                            str = "PARTIAL_PLAYBACK_DATA_EXHAUSTED";
                            break;
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 31);
                    sb.append("Unexpected heartbeat response: ");
                    sb.append(str);
                    afsi.b(2, 10, sb.toString());
                } else {
                    str2 = "stop";
                }
            }
            this.b.c(new afih(afif.HEARTBEAT, str2, this.s.i().b), this.m.a);
            T();
            aw(aigrVar, 4);
        }
    }

    final long f() {
        aixg aixgVar = this.k;
        ajbl ajblVar = aixgVar != null ? aixgVar.a : null;
        if (!this.n.h() || ajblVar == null) {
            return 0L;
        }
        if (as()) {
            return ahbj.w(ajblVar);
        }
        return ahbj.x(this.s);
    }

    public final aixg g(String str, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, boolean z) {
        return aL(str, 0, playbackStartDescriptor, aigdVar, z);
    }

    public final aixg h(String str) {
        aixg aixgVar = this.k;
        if (aixgVar == null || !TextUtils.equals(aixgVar.A(), str)) {
            aixgVar = (aixg) this.D.get(str);
            if (aixgVar == null) {
                aixgVar = aL(str, 1, null, null, false);
            }
            this.k = aixgVar;
        }
        return aixgVar;
    }

    @Override // defpackage.aixu
    public final aixt i(String str, PlayerResponseModel playerResponseModel, int i) {
        if (TextUtils.equals(str, u())) {
            return this.i;
        }
        aixg aixgVar = (aixg) this.D.get(str);
        if (aixgVar == null) {
            aixgVar = aL(str, i, null, null, false);
        }
        aixgVar.a.p().e(playerResponseModel);
        return aixgVar;
    }

    @Override // defpackage.aiwk
    public final float j() {
        aemv aemvVar = this.s;
        yjk.f();
        return aemvVar.c.a();
    }

    @Override // defpackage.aiwk
    public final long k() {
        if (ahbj.B(s())) {
            return aG();
        }
        if (this.n.h()) {
            return f();
        }
        return aF();
    }

    @Override // defpackage.aiwk
    public final long l(long j) {
        aemv aemvVar = this.s;
        yjk.f();
        return aemvVar.c.j(j);
    }

    final ajbl m() {
        return this.m.a;
    }

    @Override // defpackage.aiwk
    public final long n() {
        return ahbj.v(s());
    }

    @Override // defpackage.aiwk
    public final PlayerResponseModel o() {
        return this.i.a.c();
    }

    @Override // defpackage.aiwk
    public final aigr p() {
        return s().p().l;
    }

    @Override // defpackage.aiwk
    public final aixh q() {
        return this.i.b;
    }

    @Override // defpackage.aiwk
    public final aixh r() {
        return aM(this.n);
    }

    @Override // defpackage.aiwk
    public final ajbl s() {
        return this.i.a;
    }

    @Override // defpackage.aiwk
    public final DirectorSavedState t(int i) {
        PlayerResponseModel playerResponseModel;
        String str;
        ajbr ajbrVar;
        boolean z = i == 0;
        if (z && this.n.h()) {
            return null;
        }
        String Z = z ? null : this.i.a.Z();
        aixg aixgVar = this.k;
        if (z || this.j != null || aixgVar == null) {
            playerResponseModel = null;
            str = null;
        } else {
            PlayerResponseModel c = aixgVar.a.c();
            str = aixgVar.a.Z();
            playerResponseModel = c;
        }
        boolean z2 = this.E.j() ? !this.E.k() : false;
        boolean z3 = i != 1;
        ajbr bi = bi(z, z3);
        aixg aixgVar2 = this.k;
        if (this.j == null || aixgVar2 == null) {
            ajbrVar = null;
        } else {
            ajbrVar = new ajbr(!z3 && bd(), false, z, f(), aixgVar2.a.i().a(), this.I.d(), aixgVar2.a.Z());
        }
        return new DirectorSavedState(bi, ajbrVar, this.i.a.c(), this.i.a.g(), z2, playerResponseModel, str, f(), Z, aC(this.i), !z && this.o);
    }

    @Override // defpackage.aiwk
    public final String u() {
        return this.i.a.Z();
    }

    @Override // defpackage.aiwk
    public final String v() {
        PlayerResponseModel c = s().c();
        if (c != null) {
            return c.y();
        }
        return null;
    }

    @Override // defpackage.aiwk
    public final void w() {
        aX(true);
        this.q = 1;
        ahbj.A(m(), 4);
    }

    public final void x(boolean z, int i, ajbl ajblVar) {
        aO(z, i, ajblVar, ahbj.w(ajblVar));
    }

    @Override // defpackage.aiwk
    public final void y() {
        this.s.q();
    }

    public final void z(int i) {
        aixg aixgVar;
        aixg aixgVar2;
        aign aignVar = this.n;
        ahef ahefVar = new ahef(aignVar, aignVar.c(aign.PLAYBACK_LOADED) ? this.i.a.c() : null, (!aignVar.h() || (aixgVar2 = this.k) == null) ? null : aixgVar2.a.c(), aM(aignVar), aj(aign.PLAYBACK_LOADED) ? this.i.a.Z() : null, (!this.n.h() || (aixgVar = this.k) == null) ? null : aixgVar.a.Z(), ahbj.C(s()));
        if (i == 0) {
            this.b.k(ahefVar, this.i.a);
        } else {
            this.b.p(ahefVar);
        }
    }
}
