package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnd extends adot implements adqn, adky, ypd {
    public static final String a = zga.a("MDX.Cloud");
    public static final long b = TimeUnit.MINUTES.toMillis(15);
    static final IntentFilter c;
    public final azrh A;
    public final azrh B;
    public final azrh C;
    public final azrh D;
    public final adll E;
    public adle F;
    public Set G;
    final Handler H;
    volatile Handler I;

    /* renamed from: J, reason: collision with root package name */
    final admy f35J;
    public int K;
    public adlf L;
    public adle M;
    public RemoteVideoAd N;
    public ykm O;
    public String P;
    public String Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public long U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public final String Z;
    private final aksl aA;
    private boolean aB;
    private volatile HandlerThread aC;
    private long aD;
    private final boolean aE;
    public boolean aa;
    public int ab;
    public List ac;
    public aanb ad;
    adnc ae;
    public adkt af;
    public ania ag;
    public int ah;
    private final adpf au;
    private final zaw av;
    private final adhv aw;
    private final int ax;
    private final Optional ay;
    private final String az;
    public final anhy d;
    public final Context e;
    final Handler f;
    public final ypa g;
    public final zgj h;
    public final shf i;
    public final adqp j;
    public final xle k;
    public final ysy l;
    public final aiuy m;
    public final List n;
    public final acsx o;
    public final acsx p;
    public final adrp q;
    public final adtv r;
    public final afsy s;
    public final boolean t;
    public final adkz u;
    public final anic v;
    public final adot w;
    public final adfw x;
    public adgl y;
    public adgl z;

    static {
        IntentFilter intentFilter = new IntentFilter();
        c = intentFilter;
        intentFilter.addAction(adfr.LOUNGE_SERVER_CONNECTION_ERROR.toString());
        intentFilter.addAction(adfr.CLOUD_SERVICE_NO_NETWORK.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x012a, code lost:
    
        if (defpackage.adtv.e(r2) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public adnd(android.content.Context r13, defpackage.adpf r14, defpackage.adln r15, defpackage.ypa r16, defpackage.zgj r17, defpackage.shf r18, defpackage.zaw r19, defpackage.ysy r20, defpackage.aiuy r21, android.os.Handler r22, defpackage.adhv r23, defpackage.adfw r24, defpackage.adot r25, defpackage.adqp r26, defpackage.xle r27, defpackage.anhy r28, defpackage.acsx r29, defpackage.acsx r30, defpackage.adrp r31, int r32, defpackage.adtv r33, defpackage.afsy r34, defpackage.adkz r35, boolean r36, defpackage.acun r37, j$.util.Optional r38, defpackage.anic r39, java.lang.String r40, defpackage.atbj r41, defpackage.aksl r42) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnd.<init>(android.content.Context, adpf, adln, ypa, zgj, shf, zaw, ysy, aiuy, android.os.Handler, adhv, adfw, adot, adqp, xle, anhy, acsx, acsx, adrp, int, adtv, afsy, adkz, boolean, acun, j$.util.Optional, anic, java.lang.String, atbj, aksl):void");
    }

    static final adle aL(adle adleVar) {
        if (!adleVar.g()) {
            return adle.a;
        }
        long j = adleVar.c;
        if (j != -1 && j < 5000) {
            j = 0;
        }
        adld j2 = adleVar.j();
        j2.b(j);
        return j2.a();
    }

    private final adgj aS(adle adleVar) {
        adgj adgjVar = new adgj();
        adgjVar.a("videoId", adleVar.b);
        adgjVar.a("listId", adleVar.e);
        adgjVar.a("currentIndex", Integer.toString(adle.b(adleVar.f)));
        long j = adleVar.c;
        if (j != -1) {
            adgjVar.a("currentTime", Long.toString(j / 1000));
        }
        String str = adleVar.g;
        if (str != null) {
            adgjVar.a("params", str);
        }
        String str2 = adleVar.h;
        if (str2 != null) {
            adgjVar.a("playerParams", str2);
        }
        if (adleVar.i) {
            adgjVar.a("forceReloadPlayback", String.valueOf(true));
        }
        byte[] bArr = adleVar.j;
        if (bArr != null) {
            adgjVar.a("clickTrackingParams", Base64.encodeToString(bArr, 10));
        }
        adgjVar.a("audioOnly", "false");
        if (this.aE) {
            adgjVar.a("prioritizeMobileSenderPlaybackStateOnConnection", "true");
        }
        return adgjVar;
    }

    private final void aT() {
        if (!this.t) {
            throw new UnsupportedOperationException();
        }
    }

    private final void aU() {
        adgj adgjVar = new adgj();
        adgjVar.a("loopEnabled", String.valueOf(this.R));
        adgjVar.a("shuffleEnabled", String.valueOf(this.S));
        aA(adgf.SET_PLAYLIST_MODE, adgjVar);
    }

    private final synchronized void aV() {
        if (this.aC == null) {
            this.aC = new HandlerThread(getClass().getName(), 10);
            this.aC.start();
            this.I = new Handler(this.aC.getLooper());
        }
    }

    private final boolean aW(adfw adfwVar) {
        if (adfwVar.b.isPresent() && this.ay.isPresent()) {
            adot adotVar = this.w;
            int i = adotVar.aq.i;
            if (i == 4) {
                return false;
            }
            if (i == 3) {
                return this.an.H && ((adfy) adotVar.k()).b != null;
            }
            if (i == 2 && this.an.I) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void A(adlq adlqVar) {
        this.n.add(adlqVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void B(String str) {
        aT();
        adgj adgjVar = new adgj();
        adgjVar.a("videoId", str);
        adgjVar.a("videoSources", "XX");
        aA(adgf.ADD_VIDEO, adgjVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void C() {
        aT();
        if (aJ() && !TextUtils.isEmpty(y())) {
            Y();
        }
        aA(adgf.CLEAR_PLAYLIST, adgj.a);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void E() {
        aA(adgf.DISMISS_AUTONAV, adgj.a);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void F(String str) {
        aT();
        adgj adgjVar = new adgj();
        adgjVar.a("listId", str);
        aA(adgf.INSERT_VIDEOS, adgjVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void G(String str) {
        aT();
        adgj adgjVar = new adgj();
        adgjVar.a("videoId", str);
        aA(adgf.INSERT_VIDEO, adgjVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void H() {
        if (aJ()) {
            aA(adgf.NEXT, adgj.a);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void I() {
        aA(adgf.ON_USER_ACTIVITY, adgj.a);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void J() {
        if (this.w == null) {
            super.J();
            return;
        }
        Message obtain = Message.obtain(this.H, 6);
        this.H.removeMessages(3);
        this.H.sendMessage(obtain);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void K() {
        if (aJ()) {
            aA(adgf.PAUSE, adgj.a);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void L() {
        if (aJ()) {
            aA(adgf.PLAY, adgj.a);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void M(adle adleVar) {
        amkq.E(adleVar.g());
        adle aL = aL(adleVar);
        if (ac()) {
            this.F = adleVar;
            return;
        }
        adle adleVar2 = this.M;
        if (!adleVar2.i(aL.b) || !adleVar2.h(aL.e) || aL.i) {
            aA(adgf.SET_PLAYLIST, aS(aL));
        } else if (this.L != adlf.PLAYING) {
            L();
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void N() {
        if (aJ()) {
            aA(adgf.PREVIOUS, adgj.a);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void O(adlq adlqVar) {
        this.n.remove(adlqVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void P(String str) {
        aT();
        adgj adgjVar = new adgj();
        adgjVar.a("videoId", str);
        aA(adgf.REMOVE_VIDEO, adgjVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void Q(long j) {
        if (aJ()) {
            this.aD += j - c();
            adgj adgjVar = new adgj();
            adgjVar.a("newTime", String.valueOf(j / 1000));
            aA(adgf.SEEK_TO, adgjVar);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void R(int i, String str, String str2) {
        adgj adgjVar = new adgj();
        if (i == 0) {
            adgjVar.a("status", "INITIATED");
        } else if (i == 1) {
            str.getClass();
            str2.getClass();
            adgjVar.a("status", "UPDATED");
            adgjVar.a("text", str);
            adgjVar.a("unstable speech", str2);
        } else if (i != 2) {
            adgjVar.a("status", "CANCELED");
        } else {
            str.getClass();
            adgjVar.a("status", "COMPLETED");
            adgjVar.a("text", str);
        }
        aA(adgf.VOICE_COMMAND, adgjVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void S(String str) {
        if (!this.M.f()) {
            zga.c(a, "Cannot send audio track, no confirmed video.");
            return;
        }
        adgj adgjVar = new adgj();
        adgjVar.a("audioTrackId", str);
        adgjVar.a("videoId", this.M.b);
        aA(adgf.SET_AUDIO_TRACK, adgjVar);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void T(boolean z) {
        this.R = z;
        aU();
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void U(boolean z) {
        this.S = z;
        aU();
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void V(SubtitleTrack subtitleTrack) {
        adnc adncVar = this.ae;
        if (adncVar != null) {
            this.f.removeCallbacks(adncVar);
        }
        adnc adncVar2 = new adnc(this, subtitleTrack);
        this.ae = adncVar2;
        this.f.postDelayed(adncVar2, 300L);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void W(int i) {
        if (aJ()) {
            adgj adgjVar = new adgj();
            adgjVar.a("volume", String.valueOf(i));
            aA(adgf.SET_VOLUME, adgjVar);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    @Deprecated
    public final void X() {
        aA(adgf.SKIP_AD, adgj.a);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void Y() {
        aA(adgf.STOP, adgj.a);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void Z(int i, int i2) {
        if (aJ()) {
            adgj adgjVar = new adgj();
            adgjVar.a("delta", String.valueOf(i2));
            adgjVar.a("volume", String.valueOf(i));
            aA(adgf.SET_VOLUME, adgjVar);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final int a() {
        int i = this.K;
        if (i == -1 || i == 0) {
            return 0;
        }
        return i != 2 ? 1 : 2;
    }

    public final void aA(adgf adgfVar, adgj adgjVar) {
        String str = a;
        String valueOf = String.valueOf(adgfVar);
        String adgjVar2 = adgjVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(adgjVar2).length());
        sb.append("Sending ");
        sb.append(valueOf);
        sb.append(": ");
        sb.append(adgjVar2);
        zga.h(str, sb.toString());
        this.j.e(adgfVar, adgjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aB(adle adleVar, boolean z) {
        boolean z2 = !amkq.b(adleVar.b, this.M.b);
        if (!z) {
            this.g.d(new adlc(adleVar, 2));
        } else if (z2) {
            this.M = adleVar;
            this.g.d(new adlc(adleVar, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aC(adlf adlfVar) {
        if (this.L == adlfVar) {
            return;
        }
        this.L = adlfVar;
        String str = a;
        String valueOf = String.valueOf(adlfVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("MDx player state moved to ");
        sb.append(valueOf);
        zga.h(str, sb.toString());
        if (!adlfVar.b()) {
            this.N = null;
            this.O = null;
        }
        this.g.d(new adlg(this.L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aD(int i) {
        int i2 = this.K;
        boolean z = true;
        if (i < i2 && i2 != 3) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Retrograde MDX session status change (");
        sb.append(i2);
        sb.append(" => ");
        sb.append(i);
        sb.append(")");
        amkq.O(z, sb.toString());
        if (this.K == i) {
            return;
        }
        this.K = i;
        String str = a;
        String valueOf = String.valueOf(this.x);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("MDX cloud session status moved to ");
        sb2.append(i);
        sb2.append(" on ");
        sb2.append(valueOf);
        zga.h(str, sb2.toString());
        if (i != 3) {
            this.au.a(this);
        }
    }

    public final void aE(adkw adkwVar, atbi atbiVar, int i) {
        this.av.d(this.e.getString(adkwVar.i, this.x.e));
        aP(atbiVar, Optional.of(Integer.valueOf(i)));
    }

    public final synchronized void aF() {
        if (this.aC != null) {
            this.aC.quit();
            this.aC = null;
            this.I = null;
        }
    }

    public final boolean aG() {
        return this.K == 2;
    }

    public final boolean aH() {
        return this.K == 3;
    }

    @Override // defpackage.adot
    public final boolean aI() {
        return this.w.aj();
    }

    public final boolean aJ() {
        return (ac() || aG() || aH()) ? false : true;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean aa() {
        return !TextUtils.isEmpty(this.Q);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ab() {
        return false;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ac() {
        int i = this.K;
        return i == -1 || i == 0;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ad() {
        return this.R;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ae() {
        return this.G.size() == 0;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean af() {
        return this.S;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ag(String str) {
        adgl adglVar = this.y;
        return adglVar != null && adglVar.a.d.contains(str);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ah(adlk adlkVar) {
        if (!aJ()) {
            return false;
        }
        adgj adgjVar = new adgj();
        adgjVar.a("key", adlkVar.g);
        aA(adgf.DPAD_COMMAND, adgjVar);
        return true;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean ai(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = this.P;
        }
        if (!TextUtils.isEmpty(y()) && y().equals(str) && u().equals(str2)) {
            return false;
        }
        return (TextUtils.isEmpty(y()) && aa() && this.Q.equals(str)) ? false : true;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final boolean aj() {
        return this.w.aj();
    }

    @Override // defpackage.adot, defpackage.adlm
    public final int ak() {
        return this.ah;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void al(int i) {
        adgf adgfVar = adgf.SET_AUTONAV_MODE;
        adgj adgjVar = new adgj();
        adgjVar.a("autoplayMode", adyu.bX(i));
        aA(adgfVar, adgjVar);
        this.ah = i;
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((adlq) it.next()).g(this.ah);
        }
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void am() {
        adgj adgjVar = new adgj();
        adgjVar.a("debugCommand", "stats4nerds ");
        aA(adgf.SEND_DEBUG_COMMAND, adgjVar);
    }

    public final adfw ao(adfw adfwVar) {
        if ((aW(adfwVar) && adfwVar.b.isPresent()) || adfwVar.a != null) {
            return adfwVar;
        }
        ScreenId screenId = adfwVar.f;
        adft adftVar = (adft) this.aw.b(Arrays.asList(screenId), 1).get(screenId);
        if (adftVar == null) {
            String str = a;
            String valueOf = String.valueOf(adfwVar.f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Unable to retrieve lounge token for screenId ");
            sb.append(valueOf);
            zga.c(str, sb.toString());
            return null;
        }
        adfv g = adfwVar.g();
        g.a = adftVar;
        return g.a();
    }

    public final void ar(Context context, boolean z) {
        if (this.j.a() != 0) {
            this.j.j(z);
        }
        if (this.aB) {
            context.unregisterReceiver(this.f35J);
            this.aB = false;
        }
        this.g.m(this);
    }

    public final void as(adfw adfwVar, adle adleVar) {
        if (!this.aB) {
            this.e.registerReceiver(this.f35J, c);
            this.aB = true;
        }
        String d = this.w.k().d();
        adft adftVar = adfwVar.a;
        if (adftVar != null) {
            this.af = new adkt(adftVar);
        }
        if (aW(adfwVar)) {
            admd admdVar = new admd((adgm) adfwVar.b.get(), (admf) this.ay.get(), this.v, this.aA, adfwVar.d, this.w.aq.i == 3 ? this.an.L : this.an.M, this.aq.g);
            this.af = admdVar;
            admdVar.c();
            this.af.d();
        }
        adqr adqrVar = new adqr();
        adqrVar.b(false);
        adqrVar.c = adfwVar.d;
        adkt adktVar = this.af;
        if (adktVar != null) {
            adqrVar.d = adktVar;
            if (d != null) {
                adqrVar.e = d;
                if (!aj() && adleVar.g()) {
                    adqrVar.a = adgf.SET_PLAYLIST;
                    adqrVar.b = aS(adleVar);
                }
                adqrVar.b(true);
                adqs a2 = adqrVar.a();
                StringBuilder sb = new StringBuilder(String.format("Connecting to %s with ", adfwVar.f));
                if (a2.a()) {
                    Object[] objArr = new Object[2];
                    objArr[0] = a2.a;
                    objArr[1] = a2.b() ? a2.b : "{}";
                    sb.append(String.format("%s : %s", objArr));
                } else {
                    sb.append("no message.");
                }
                zga.h(a, sb.toString());
                this.j.n(a2);
                this.j.m(this);
                this.j.b(new admx(this));
                return;
            }
            throw new NullPointerException("Null magmaKey");
        }
        throw new NullPointerException("Null loungeTokenProvider");
    }

    @Override // defpackage.adot
    public final void at() {
        throw new RuntimeException("Execution reach unexpected point.");
    }

    @Override // defpackage.adot
    public final boolean aw() {
        throw new RuntimeException("Execution reach unexpected point.");
    }

    @Override // defpackage.adot
    public final void ax(boolean z) {
        throw new RuntimeException("Execution reach unexpected point.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adot
    public final void ay(adle adleVar) {
        amkq.N(this.F == adle.a);
        amkq.N(this.K == -1);
        this.F = aL(adleVar);
        aD(0);
        this.o.c("c_c");
        Handler handler = this.H;
        handler.sendMessage(Message.obtain(handler, 3));
    }

    public final void az() {
        if (this.ax != 1 || this.I == null) {
            return;
        }
        this.I.post(new admv(this, 0));
    }

    @Override // defpackage.adot, defpackage.adlm
    public final int b() {
        return this.ab;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final long c() {
        return this.L.a() ? ((this.V + this.aD) + this.i.d()) - this.U : this.V + this.aD;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final long d() {
        long j = this.Y;
        return j != -1 ? ((j + this.aD) + this.i.d()) - this.U : j;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final long e() {
        return (!this.aa || "up".equals(this.az)) ? this.W : (this.W + this.i.d()) - this.U;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final long g() {
        return (this.X <= 0 || "up".equals(this.az)) ? this.X : (this.X + this.i.d()) - this.U;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final RemoteVideoAd h() {
        return this.N;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final ykm i() {
        return this.O;
    }

    @Override // defpackage.adlm
    public final adgb k() {
        return this.x;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adtl.class};
        }
        if (i == 0) {
            int i2 = 2;
            if (this.j.a() != 2 || this.s.c().g()) {
                return null;
            }
            this.H.post(new admv(this, i2));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.adot, defpackage.adlm
    public final adlf m() {
        return this.L;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final adll n() {
        return this.E;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final aibu p() {
        return this.w.p();
    }

    @Override // defpackage.adot, defpackage.adlm
    public final anhy r(final String str) {
        return !aJ() ? anaf.N(new Throwable("MDx session was not ready to send messages yet.")) : anfq.h(this.d, new amml() { // from class: admu
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                adnd adndVar = adnd.this;
                String str2 = str;
                adgj adgjVar = new adgj();
                adgjVar.a("signInSessionId", str2);
                adgjVar.a("deviceId", (String) obj);
                adndVar.aA(adgf.START_SIGN_IN, adgjVar);
                return true;
            }
        }, angq.a);
    }

    @Override // defpackage.adot
    public final /* bridge */ /* synthetic */ int re() {
        return 0;
    }

    @Override // defpackage.adot
    public final String rf() {
        adgl adglVar = this.y;
        if (adglVar != null) {
            return adglVar.b;
        }
        return null;
    }

    @Override // defpackage.adot
    public final String rg() {
        adgl adglVar = this.y;
        if (adglVar != null) {
            return adglVar.c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adot
    public final void rh() {
        if (aG()) {
            return;
        }
        atbi s = s();
        String str = a;
        String valueOf = String.valueOf(s);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("disconnect() with reason: ");
        sb.append(valueOf);
        zga.j(str, sb.toString(), new Throwable());
        adkz adkzVar = this.u;
        anhy anhyVar = adkzVar.h;
        if (anhyVar != null) {
            anhyVar.cancel(false);
            adkzVar.h = null;
        }
        adkzVar.g = null;
        adkt adktVar = this.af;
        if (adktVar != null) {
            adktVar.e();
        }
        Message obtain = Message.obtain(this.H, 4, new ansv(s == atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER));
        this.H.removeMessages(3);
        this.H.sendMessage(obtain);
    }

    @Override // defpackage.adot, defpackage.adlm
    public final String t() {
        adgn adgnVar = this.x.i;
        if (adgnVar == null) {
            return null;
        }
        return adgnVar.c;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final String u() {
        return this.M.e;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final String v() {
        adgl adglVar = this.z;
        return adglVar != null ? adglVar.a.c : super.v();
    }

    @Override // defpackage.adot, defpackage.adlm
    public final String w() {
        return this.Q;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final String x() {
        return this.P;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final String y() {
        return this.M.b;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final void z(String str) {
        aT();
        adgj adgjVar = new adgj();
        adgjVar.a("listId", str);
        aA(adgf.ADD_VIDEOS, adgjVar);
    }
}
