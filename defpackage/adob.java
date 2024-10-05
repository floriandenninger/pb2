package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adob extends adot {
    public static final String a = zga.a("MDX.Dial");
    private final MdxSessionFactory A;
    private final int B;
    private final acsx C;
    private final long D;
    private final adkv E;
    public final SharedPreferences b;
    public final aczh c;
    public final acyg d;
    public final adhv e;
    public final acys f;
    public final adrp g;
    public final acun h;
    public final String i;
    volatile Handler j;
    volatile Handler k;
    public Uri l;
    public volatile adfy m;
    public volatile aczf n;
    public final acsx o;
    public final AtomicBoolean p;
    public final long q;
    public long r;
    public int s;
    private final adie t;
    private final aczg u;
    private volatile HandlerThread v;
    private volatile HandlerThread w;
    private boolean x;
    private boolean y;
    private long z;

    public adob(adfy adfyVar, MdxSessionFactory mdxSessionFactory, Context context, adpf adpfVar, adln adlnVar, zaw zawVar, SharedPreferences sharedPreferences, aczh aczhVar, acyg acygVar, adhv adhvVar, adie adieVar, acys acysVar, String str, acsx acsxVar, acsx acsxVar2, aczg aczgVar, int i, adrp adrpVar, int i2, Optional optional, adkv adkvVar, acun acunVar, atbj atbjVar) {
        super(context, adpfVar, adlnVar, zawVar, acunVar, atbjVar);
        this.p = new AtomicBoolean(false);
        this.m = adfyVar;
        this.A = mdxSessionFactory;
        this.b = sharedPreferences;
        this.c = aczhVar;
        this.d = acygVar;
        this.e = adhvVar;
        this.t = adieVar;
        this.f = acysVar;
        this.i = str;
        this.o = acsxVar;
        this.C = acsxVar2;
        this.u = aczgVar;
        this.g = adrpVar;
        this.B = i;
        this.h = acunVar;
        this.E = adkvVar;
        int i3 = acunVar.Y;
        this.q = i3 > 0 ? i3 : 5000L;
        int i4 = acunVar.Z;
        this.D = i4 > 0 ? i4 : 30000L;
        adlo a2 = adlp.a();
        a2.i(3);
        a2.e(adfyVar.d);
        a2.d(adcp.f(adfyVar));
        a2.f(i2);
        adkr a3 = adks.a();
        a3.b(adfyVar.n);
        a2.a = a3.a();
        if (optional.isPresent()) {
            a2.g((String) optional.get());
        }
        this.aq = a2.a();
    }

    private final void aJ() {
        aczf aczfVar = this.n;
        if (aczfVar != null) {
            aczfVar.b();
            this.n = null;
        }
        this.c.a();
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private final void aK() {
        if (this.B == 1 && this.k != null) {
            this.k.post(new adnv(this, 0));
        }
    }

    private final synchronized void aL() {
        if (this.v == null) {
            this.v = new HandlerThread(getClass().getName(), 10);
            this.v.start();
            this.j = new Handler(this.v.getLooper());
        }
    }

    private final synchronized void aS() {
        if (this.w == null) {
            this.w = new HandlerThread(getClass().getName(), 10);
            this.w.start();
            this.k = new Handler(this.w.getLooper());
        }
    }

    private final boolean aT(atbi atbiVar) {
        return !this.an.au.contains(Integer.valueOf(atbiVar.D)) && this.al < this.am;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aA(atbi atbiVar) {
        if (this.an.aB.contains(Integer.valueOf(atbiVar.D))) {
            long max = Math.max(0L, this.h.aC - Math.max(0L, SystemClock.elapsedRealtime() - this.z));
            if (this.j != null && max > 0) {
                this.j.postDelayed(new adnv(this, 2), max);
                return;
            }
        }
        az();
    }

    public final void aB() {
        if (this.j == null) {
            return;
        }
        this.j.post(new adnv(this, 4));
    }

    public final void aC(final long j) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.j == null) {
            return;
        }
        this.j.postDelayed(new Runnable() { // from class: adnx
            @Override // java.lang.Runnable
            public final void run() {
                final adob adobVar = adob.this;
                long j2 = elapsedRealtime;
                long j3 = j;
                final adfy adfyVar = adobVar.m;
                if (adobVar.p.get() || adobVar.r <= 0) {
                    if (adobVar.p.get() || adobVar.r > 0) {
                        return;
                    }
                    adkw adkwVar = adkw.LAUNCH_FAIL_TIMEOUT;
                    String str = adob.a;
                    String valueOf = String.valueOf(adfyVar);
                    String valueOf2 = String.valueOf(adkwVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
                    sb.append("Could not wake up DIAL device  ");
                    sb.append(valueOf);
                    sb.append(" ");
                    sb.append(valueOf2);
                    zga.c(str, sb.toString());
                    adobVar.o.c("d_lwf");
                    adobVar.ao(adkwVar, atbi.MDX_SESSION_DISCONNECT_REASON_DIAL_WAKE_ON_LAN_FAILED);
                    return;
                }
                adobVar.f.c(new acyp() { // from class: adnt
                    @Override // defpackage.acyp
                    public final void a(adfy adfyVar2) {
                        adob adobVar2 = adob.this;
                        adfy adfyVar3 = adfyVar;
                        if (!adfyVar2.n.equals(adfyVar3.n) || adobVar2.p.getAndSet(true)) {
                            return;
                        }
                        String valueOf3 = String.valueOf(adfyVar2.d);
                        if (valueOf3.length() != 0) {
                            "Successful wake-up of ".concat(valueOf3);
                        }
                        aczf aczfVar = adobVar2.n;
                        if (aczfVar != null) {
                            aczfVar.b();
                            adobVar2.n = null;
                        }
                        adfx k = adfyVar2.k();
                        k.e(adfyVar3.l);
                        adobVar2.m = k.a();
                        adobVar2.o.c("d_lws");
                        adobVar2.ao.e(16);
                        adobVar2.aB();
                    }

                    @Override // defpackage.acyp
                    public final /* synthetic */ void b() {
                    }
                }, false);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
                long j4 = adobVar.r;
                if (elapsedRealtime2 > 0) {
                    j3 = elapsedRealtime2;
                }
                adobVar.r = j4 - j3;
                adobVar.aC(adobVar.q);
            }
        }, j);
    }

    public final synchronized void aD() {
        if (this.v != null) {
            this.v.quit();
            this.v = null;
            this.j = null;
        }
    }

    public final synchronized void aE() {
        if (this.w != null) {
            this.w.quit();
            this.w = null;
            this.k = null;
        }
    }

    public final boolean aF() {
        return this.m.a.a() == 1;
    }

    public final boolean aG(adfw adfwVar) {
        Map a2 = this.t.a(Collections.singletonList(adfwVar));
        return a2.containsKey(adfwVar) && !((Set) a2.get(adfwVar)).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ao(adkw adkwVar, atbi atbiVar) {
        ar(adkwVar, atbiVar, -1);
    }

    public final void ar(adkw adkwVar, atbi atbiVar, Integer num) {
        aJ();
        this.o.c("d_laf");
        if (aT(atbiVar)) {
            String str = a;
            String valueOf = String.valueOf(adkwVar);
            String valueOf2 = String.valueOf(atbiVar);
            String valueOf3 = String.valueOf(num);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb.append("Initial connection failed with error: ");
            sb.append(valueOf);
            sb.append(", reason: ");
            sb.append(valueOf2);
            sb.append(", status code: ");
            sb.append(valueOf3);
            sb.append(". attempting retry.");
            zga.m(str, sb.toString());
            Uri uri = this.m.b;
            if (uri != null) {
                acyg acygVar = this.d;
                boolean n = this.m.n();
                adns adnsVar = new adns(this, atbiVar);
                ysj b = ysk.b(uri.toString());
                b.c("Origin", "package:com.google.android.youtube");
                new afvf(acygVar.b, new afqz(new acyf(acygVar, b.a().a, n))).c(uri, new acye(adnsVar));
                return;
            }
            aA(atbiVar);
            return;
        }
        if (num.intValue() == -1) {
            aQ(adkwVar);
            aP(atbiVar, Optional.empty());
            return;
        }
        if (this.h.m) {
            adkv adkvVar = this.E;
            int intValue = num.intValue();
            String str2 = this.m.d;
            ci ciVar = adkvVar.c;
            if (ciVar == null) {
                adkvVar.b.d(adkvVar.a.getString(adkwVar.i, str2));
            } else {
                adku.aF(intValue, str2).qh(ciVar.getSupportFragmentManager(), adku.class.getCanonicalName());
            }
            aP(atbiVar, Optional.of(num));
            return;
        }
        aQ(adkwVar);
        aP(atbiVar, Optional.of(num));
    }

    public final void as(adfw adfwVar) {
        this.y = true;
        adfy adfyVar = this.m;
        if (!adyu.bW(this.i)) {
            String valueOf = String.valueOf(adfwVar.f);
            String valueOf2 = String.valueOf(adfwVar.g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(",");
            sb.append(valueOf2);
            this.b.edit().putString(adfyVar.n.c, sb.toString()).apply();
        }
        this.o.c("d_las");
        adgn adgnVar = adfwVar.h;
        if (adgnVar != null) {
            adlo b = this.aq.b();
            b.b = adgnVar;
            this.aq = b.a();
        }
        MdxSessionFactory mdxSessionFactory = this.A;
        adpf aM = aM();
        adln adlnVar = this.ao;
        acsx acsxVar = this.o;
        acsx acsxVar2 = this.C;
        int i = this.aq.h;
        Optional.of(this.aq.g);
        aR(mdxSessionFactory.h(adfwVar, aM, adlnVar, this, acsxVar, acsxVar2, new acyt(this.m, this.d)));
    }

    @Override // defpackage.adot
    public final void at() {
        if (this.x) {
            zga.c(a, "Cannot call launchApp() more than once.");
            return;
        }
        this.z = SystemClock.elapsedRealtime();
        this.ao.e(3);
        int i = 1;
        this.x = true;
        aL();
        if (this.B == 1) {
            aS();
            if (this.k != null) {
                this.k.post(new adnv(this, i));
            }
        }
        this.s = 0;
        if (this.m.o()) {
            if (aj()) {
                aP(atbi.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED, Optional.empty());
                return;
            }
            this.ao.e(4);
            this.o.c("d_lw");
            adfy adfyVar = this.m;
            long j = this.D;
            long j2 = adfyVar.k;
            this.r = Math.max(j, (j2 + j2) * 1000);
            aczg aczgVar = this.u;
            aczf aczfVar = new aczf(aczgVar.a, this.m.j, aczgVar.b);
            aczfVar.a();
            this.n = aczfVar;
            aC(0L);
            return;
        }
        this.o.c("d_l");
        if (this.j == null) {
            return;
        }
        this.j.post(new Runnable() { // from class: adnw
            @Override // java.lang.Runnable
            public final void run() {
                adoa adoaVar;
                ScreenId screenId;
                adfs adfsVar;
                String string;
                adfs adfsVar2;
                adob adobVar = adob.this;
                Uri uri = adobVar.m.b;
                if (uri != null) {
                    adobVar.m = adobVar.m.l(adobVar.d.a(uri, adobVar.m.n()));
                }
                boolean aj = adobVar.aj();
                if (adobVar.aF()) {
                    adobVar.o.c("d_lar");
                    adfw adfwVar = null;
                    if (adobVar.aF()) {
                        adfy adfyVar2 = adobVar.m;
                        boolean z = (adfyVar2.a.f() == null || adfyVar2.g() == null) ? false : true;
                        if (adyu.bW(adobVar.i) || adobVar.h.ac || (string = adobVar.b.getString(adfyVar2.n.c, null)) == null || !string.contains(",")) {
                            adoaVar = null;
                        } else {
                            List h = amnm.b(',').h(string);
                            adnz adnzVar = new adnz();
                            adnzVar.a = new ScreenId((String) h.get(0));
                            adnzVar.b = new adfs((String) h.get(1));
                            ScreenId screenId2 = adnzVar.a;
                            if (screenId2 == null || (adfsVar2 = adnzVar.b) == null) {
                                StringBuilder sb = new StringBuilder();
                                if (adnzVar.a == null) {
                                    sb.append(" screenId");
                                }
                                if (adnzVar.b == null) {
                                    sb.append(" loungeDeviceId");
                                }
                                String valueOf = String.valueOf(sb);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                                sb2.append("Missing required properties:");
                                sb2.append(valueOf);
                                throw new IllegalStateException(sb2.toString());
                            }
                            adoaVar = new adoa(screenId2, adfsVar2);
                        }
                        if (z || adoaVar != null) {
                            if (z) {
                                screenId = adfyVar2.a.f();
                                adfsVar = adfyVar2.g();
                            } else {
                                screenId = adoaVar.a;
                                adfsVar = adoaVar.b;
                            }
                            adobVar.ao.e(9);
                            adgg adggVar = new adgg(2, adfyVar2.a.k());
                            String str = adfyVar2.g;
                            String str2 = adfyVar2.f;
                            String str3 = adfyVar2.i;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(str2).length() + String.valueOf(str3).length());
                            sb3.append("modelName: ");
                            sb3.append(str);
                            sb3.append(" | manufacturer: ");
                            sb3.append(str2);
                            sb3.append(" | deviceVersion: ");
                            sb3.append(str3);
                            String sb4 = sb3.toString();
                            Optional g = adfyVar2.a.g();
                            if (g.isPresent() && adobVar.h.H) {
                                adobVar.ao.e(11);
                                adfv f = adfw.f();
                                f.c(screenId);
                                f.b(adfsVar);
                                f.e(adfyVar2.d);
                                f.c = adggVar;
                                f.b = sb4;
                                f.d((adgm) g.get());
                                adfw a2 = f.a();
                                if (adobVar.aG(a2)) {
                                    adfwVar = a2;
                                }
                            }
                            adft adftVar = (adft) adobVar.e.b(Arrays.asList(screenId), true != z ? 5 : 6).get(screenId);
                            if (adftVar == null) {
                                String str4 = adob.a;
                                String valueOf2 = String.valueOf(screenId);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                                sb5.append("Unable to retrieve lounge token for screenId ");
                                sb5.append(valueOf2);
                                zga.c(str4, sb5.toString());
                            } else {
                                adobVar.ao.e(11);
                                adfv f2 = adfw.f();
                                f2.c(screenId);
                                f2.e(adfyVar2.d);
                                f2.b(adfsVar);
                                f2.b = sb4;
                                f2.a = adftVar;
                                f2.c = adggVar;
                                adfw a3 = f2.a();
                                if (adobVar.aG(a3)) {
                                    adfwVar = a3;
                                }
                            }
                            adfwVar = null;
                        }
                    }
                    if (adfwVar != null) {
                        adobVar.ao.e(17);
                        adobVar.as(adfwVar);
                        return;
                    } else if (aj) {
                        adobVar.aP(atbi.MDX_SESSION_DISCONNECT_REASON_CLOUD_SCREEN_NOT_FOUND, Optional.empty());
                        return;
                    }
                } else if (aj) {
                    adobVar.aP(atbi.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED, Optional.empty());
                    return;
                }
                adobVar.aB();
            }
        });
    }

    @Override // defpackage.adot
    public final boolean aw() {
        return true;
    }

    @Override // defpackage.adot
    public final void ax(boolean z) {
        aJ();
        if (this.v != null) {
            if (!z || !this.y) {
                aD();
            } else if (this.j != null) {
                this.j.post(new adnv(this, 3));
            }
        }
        aK();
    }

    public final void az() {
        aD();
        aK();
        this.x = false;
        this.al++;
        ay(this.aj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ anhy f(Optional optional, Boolean bool) {
        if (bool.booleanValue()) {
            return anaf.O(false);
        }
        return super.q(atbi.MDX_SESSION_DISCONNECT_REASON_RECEIVER_DEAD_AFTER_RECEIVER_PING, optional);
    }

    @Override // defpackage.adlm
    public final adgb k() {
        return this.m;
    }

    @Override // defpackage.adot, defpackage.adlm
    public final anhy q(atbi atbiVar, final Optional optional) {
        if (a() != 0 || !this.an.ar.contains(Integer.valueOf(atbiVar.D)) || !aT(atbiVar)) {
            if (a() == 1) {
                acun acunVar = this.h;
                if (acunVar.ax && acunVar.ay.contains(Integer.valueOf(atbiVar.D))) {
                    return anfq.i(anht.q(aN()), new anfz() { // from class: adnu
                        @Override // defpackage.anfz
                        public final anhy a(Object obj) {
                            return adob.this.f(optional, (Boolean) obj);
                        }
                    }, angq.a);
                }
            }
            return super.q(atbiVar, optional);
        }
        String str = a;
        String valueOf = String.valueOf(atbiVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
        sb.append("Disconnected with reason ");
        sb.append(valueOf);
        sb.append("while still connecting. attempting forceful retry.");
        zga.m(str, sb.toString());
        aA(atbiVar);
        return anaf.O(false);
    }

    @Override // defpackage.adot
    public final int re() {
        return this.s;
    }

    public static final atbi aH(int i) {
        if (i == 0) {
            return atbi.MDX_SESSION_DISCONNECT_REASON_DIAL_SERVER_ERROR;
        }
        if (i == 2) {
            return atbi.MDX_SESSION_DISCONNECT_REASON_DIAL_CLIENT_ERROR;
        }
        if (i == 3) {
            return atbi.MDX_SESSION_DISCONNECT_REASON_CONNECTION_TIMEOUT;
        }
        if (i == 4) {
            return atbi.MDX_SESSION_DISCONNECT_REASON_NETWORK;
        }
        return atbi.MDX_SESSION_DISCONNECT_REASON_UNKNOWN;
    }
}
