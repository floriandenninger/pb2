package defpackage;

import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afgs implements Observer {
    private PlayerConfigModel A;
    private final awdi B;
    private ScheduledFuture C;
    private volatile ScheduledFuture D;
    private String F;
    private int G;
    private int H;
    private String I;

    /* renamed from: J, reason: collision with root package name */
    private String f44J;
    private boolean L;
    private boolean O;
    private long P;
    private boolean Q;
    private long R;
    private zhy S;
    private float T;
    private final boolean V;
    private long W;
    private boolean X;
    private final boolean Y;
    private avzr Z;
    private final afgy aa;
    private int ab;
    private final zfe ac;
    private long ad;
    private long ae;
    private ayqx af;
    public final afgw b;
    public final afgg c;
    public final afgi d;
    public final afgq e;
    public final CountDownLatch f;
    public final afgh g;
    public final auij h;
    public afgn i;
    public int j;
    public long l;
    public boolean m;
    public int n;
    public boolean o;
    public VideoStreamingData p;
    public final boolean q;
    public Integer r;
    public final List s;
    private final long u;
    private final shf v;
    private final afgk w;
    private final String z;
    private static final long t = TimeUnit.MINUTES.toMillis(10);
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    private final Runnable x = new afge(this, 1);
    private final Runnable y = new afge(this, 2);
    private int E = -1;
    public int k = -1;
    private int K = -1;
    private int M = -1;
    private int N = -1;
    private boolean U = true;

    public afgs(final afgw afgwVar, shf shfVar, TrackingUrlModel trackingUrlModel, zhy zhyVar, boolean z, String str, awdi awdiVar, auij auijVar, PlayerConfigModel playerConfigModel, int i, boolean z2, zfe zfeVar, afgy afgyVar) {
        CountDownLatch countDownLatch;
        afgp[] afgpVarArr;
        long j = t;
        this.W = j;
        this.s = new ArrayList();
        this.aa = afgyVar;
        this.q = z2;
        this.A = playerConfigModel;
        this.z = str;
        this.B = awdiVar;
        this.v = shfVar;
        this.b = afgwVar;
        this.c = new afgg(this);
        afgk afgkVar = new afgk(this);
        this.w = afgkVar;
        this.d = new afgi(this);
        this.S = zhyVar;
        afgh afghVar = new afgh(this);
        this.g = afghVar;
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        this.f = countDownLatch2;
        boolean z3 = auijVar.A;
        this.V = z3;
        this.Y = !auijVar.E;
        this.h = auijVar;
        if (z2) {
            countDownLatch = countDownLatch2;
            afgpVarArr = new afgp[]{new afgl(this, afgwVar.i, false), afghVar};
        } else {
            countDownLatch = countDownLatch2;
            afgpVarArr = new afgp[]{new afgl(this, afgwVar.i, z3), afghVar, afgkVar};
        }
        afgq afgqVar = new afgq(afgwVar.k, afgwVar.l, afgwVar.j, afgwVar.m, countDownLatch, auijVar, afgpVarArr);
        this.e = afgqVar;
        afgqVar.f(auijVar.B);
        afgqVar.d(playerConfigModel.ad());
        this.u = shfVar.d();
        afgqVar.e(trackingUrlModel);
        afgqVar.a("vc", String.valueOf(i));
        this.R = a;
        this.ac = zfeVar;
        if (z2) {
            return;
        }
        this.n = 1;
        this.Z = afgwVar.p.h.b(str);
        this.W = ((auijVar.c & 64) == 0 || auijVar.h <= 0) ? j : TimeUnit.SECONDS.toMillis(auijVar.h);
        String valueOf = String.valueOf(afgn.NOT_STARTED);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append("0.000:");
        sb.append(valueOf);
        afgqVar.a("vps", sb.toString());
        this.i = afgn.NOT_STARTED;
        if (z) {
            afgqVar.a("ctmp", "ttr");
        }
        this.Q = false;
        this.j = -1;
        this.H = -1;
        this.ab = -1;
        afgwVar.j.execute(new Runnable() { // from class: afgf
            @Override // java.lang.Runnable
            public final void run() {
                adxw adxwVar;
                afgs afgsVar = afgs.this;
                afgw afgwVar2 = afgwVar;
                afgi afgiVar = afgsVar.d;
                adxx adxxVar = afgwVar2.o;
                phk phkVar = adxxVar.b;
                long d = phkVar != null ? phkVar.d() : -1L;
                phk phkVar2 = adxxVar.b;
                long e = phkVar2 != null ? phkVar2.e() : -1L;
                azrw azrwVar = adxxVar.a;
                File file = azrwVar != null ? (File) azrwVar.get() : null;
                if (file == null) {
                    adxwVar = new adxw(d, e, -1L, -1L);
                } else {
                    adxwVar = new adxw(d, e, file.getFreeSpace(), file.getTotalSpace());
                }
                long j2 = adxwVar.a;
                if (j2 != -1) {
                    long j3 = adxwVar.b;
                    if (j3 != -1) {
                        long j4 = adxwVar.c;
                        if (j4 != -1) {
                            long j5 = adxwVar.d;
                            if (j5 != -1) {
                                StringBuilder sb2 = new StringBuilder(97);
                                sb2.append("du:used.");
                                sb2.append(j2);
                                sb2.append(".");
                                sb2.append(j3);
                                sb2.append(";avail.");
                                sb2.append(j4);
                                sb2.append(".");
                                sb2.append(j5);
                                afgiVar.b.e.a("ctmp", sb2.toString());
                            }
                        }
                    }
                }
            }
        });
    }

    private final synchronized String K(String str, afgn afgnVar) {
        if (this.s.isEmpty()) {
            String valueOf = String.valueOf(afgnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(":");
            sb.append(valueOf);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(":");
        sb2.append(afgnVar);
        sb2.append(":");
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(";");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    private final void L(String str) {
        String d = d();
        if (d != null) {
            afgq afgqVar = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + d.length());
            sb.append(str);
            sb.append(":");
            sb.append(d);
            afgqVar.a("cmt", sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0102 A[Catch: all -> 0x019a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0052, B:8:0x0058, B:9:0x005a, B:11:0x005f, B:13:0x0065, B:14:0x0067, B:16:0x006b, B:18:0x0071, B:19:0x0073, B:22:0x00fe, B:24:0x0102, B:26:0x010a, B:27:0x0131, B:31:0x013b, B:33:0x013f, B:35:0x0149, B:36:0x0152, B:38:0x016a, B:39:0x014e, B:41:0x017d, B:45:0x0182, B:47:0x0186, B:49:0x018c, B:54:0x0079, B:56:0x008c, B:57:0x008e, B:59:0x0092, B:60:0x00aa, B:62:0x00b0, B:63:0x00b2, B:65:0x00b6, B:68:0x00cb, B:69:0x00c3, B:70:0x00ce, B:72:0x00d4, B:73:0x00d6, B:75:0x00da, B:78:0x00f0, B:79:0x00e7, B:80:0x00f3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0052, B:8:0x0058, B:9:0x005a, B:11:0x005f, B:13:0x0065, B:14:0x0067, B:16:0x006b, B:18:0x0071, B:19:0x0073, B:22:0x00fe, B:24:0x0102, B:26:0x010a, B:27:0x0131, B:31:0x013b, B:33:0x013f, B:35:0x0149, B:36:0x0152, B:38:0x016a, B:39:0x014e, B:41:0x017d, B:45:0x0182, B:47:0x0186, B:49:0x018c, B:54:0x0079, B:56:0x008c, B:57:0x008e, B:59:0x0092, B:60:0x00aa, B:62:0x00b0, B:63:0x00b2, B:65:0x00b6, B:68:0x00cb, B:69:0x00c3, B:70:0x00ce, B:72:0x00d4, B:73:0x00d6, B:75:0x00da, B:78:0x00f0, B:79:0x00e7, B:80:0x00f3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0182 A[Catch: all -> 0x019a, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0052, B:8:0x0058, B:9:0x005a, B:11:0x005f, B:13:0x0065, B:14:0x0067, B:16:0x006b, B:18:0x0071, B:19:0x0073, B:22:0x00fe, B:24:0x0102, B:26:0x010a, B:27:0x0131, B:31:0x013b, B:33:0x013f, B:35:0x0149, B:36:0x0152, B:38:0x016a, B:39:0x014e, B:41:0x017d, B:45:0x0182, B:47:0x0186, B:49:0x018c, B:54:0x0079, B:56:0x008c, B:57:0x008e, B:59:0x0092, B:60:0x00aa, B:62:0x00b0, B:63:0x00b2, B:65:0x00b6, B:68:0x00cb, B:69:0x00c3, B:70:0x00ce, B:72:0x00d4, B:73:0x00d6, B:75:0x00da, B:78:0x00f0, B:79:0x00e7, B:80:0x00f3), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void M(java.lang.String r12, defpackage.aefq r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgs.M(java.lang.String, aefq, boolean):void");
    }

    private final synchronized void N(afgn afgnVar) {
        O(afgnVar, true);
    }

    private final synchronized void O(afgn afgnVar, boolean z) {
        if (this.i.equals(afgnVar)) {
            return;
        }
        ScheduledFuture scheduledFuture = this.C;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.C = null;
        }
        if (afgnVar != afgn.SEEKING) {
            this.s.clear();
        }
        String e = e();
        M(e, (aefq) ((amnv) this.b.f.get()).get(), z);
        this.e.a("vps", K(e, afgnVar));
        this.i = afgnVar;
        if (afgnVar == afgn.PLAYING) {
            if (this.n == 1 && (this.V || this.A.ad())) {
                this.e.h();
            }
            Q();
        }
    }

    private final synchronized void P() {
        BatteryManager batteryManager;
        int intProperty;
        this.D = this.b.e.schedule(this.y, this.R, TimeUnit.MILLISECONDS);
        apep apepVar = this.h.C;
        if (apepVar == null) {
            apepVar = apep.a;
        }
        if (apepVar.d && this.af == null && (batteryManager = this.ac.a) != null && (intProperty = batteryManager.getIntProperty(2)) != Integer.MIN_VALUE && (Build.VERSION.SDK_INT >= 28 || intProperty != 0)) {
            this.af = this.ac.c.ax(new ayrs() { // from class: afgd
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    afgs.this.n((zfb) obj);
                }
            });
        }
    }

    private final synchronized void Q() {
        this.C = this.b.e.schedule(this.x, this.W, TimeUnit.MILLISECONDS);
    }

    private static boolean R(auij auijVar, auii auiiVar) {
        return new aonw(auijVar.D, auij.a).contains(auiiVar);
    }

    public final void A() {
        this.Q = false;
        N(afgn.PLAYING);
        if (Build.VERSION.SDK_INT >= 23) {
            apep apepVar = this.h.C;
            if (apepVar == null) {
                apepVar = apep.a;
            }
            if (apepVar.b) {
                H(((adxl) this.b.n.get()).a().n);
            }
        }
    }

    public final void B() {
        N(afgn.SEEKING);
    }

    public final void C(String str, String str2) {
        if (TextUtils.equals("cat", str)) {
            this.e.a("cat", ammx.d(str2));
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            this.e.a("ctmp", str);
            return;
        }
        afgq afgqVar = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        afgqVar.a("ctmp", sb.toString());
    }

    public final void D(int i) {
        if (i != this.E) {
            afgq afgqVar = this.e;
            String e = e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
            sb.append(e);
            sb.append(":");
            sb.append(i);
            afgqVar.a("sur", sb.toString());
            this.E = i;
        }
    }

    public final void E(avzr avzrVar) {
        String str;
        this.Z = avzrVar;
        avzr avzrVar2 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
        int ordinal = avzrVar.ordinal();
        if (ordinal == 1) {
            str = "Q";
        } else if (ordinal == 2) {
            str = "Z";
        } else if (ordinal != 3) {
            return;
        } else {
            str = "M";
        }
        this.e.a("vfs", e() + ":" + this.j + "::" + this.j + ":" + str);
    }

    public final void F(boolean z, long j, long j2) {
        boolean z2 = true;
        if (!z && !this.O) {
            z2 = false;
        }
        this.O = z2;
        if (z2) {
            this.l = j;
            this.P = j2;
        }
        long j3 = ((aefq) ((amnv) this.b.f.get()).get()).f;
        if (j3 == -1 || this.w.b() <= 6283) {
            return;
        }
        this.w.d(j3);
    }

    public final synchronized void G() {
        if (this.D == null) {
            return;
        }
        try {
            M(e(), (aefq) ((amnv) this.b.g.get()).get(), true);
        } catch (Exception e) {
            v(new afih(afif.DEFAULT, "qoe.client", this.l, e));
        }
        VideoStreamingData videoStreamingData = this.p;
        if (videoStreamingData == null || !videoStreamingData.B()) {
            return;
        }
        this.e.h();
    }

    public final void H(int i) {
        apep apepVar = this.h.C;
        if (apepVar == null) {
            apepVar = apep.a;
        }
        if (apepVar.b) {
            int i2 = this.ab;
            if (i2 == -1 || i2 != i) {
                this.ab = i;
                String e = e();
                afgq afgqVar = this.e;
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
                sb.append(e);
                sb.append(":");
                sb.append(i);
                afgqVar.a("aur", sb.toString());
            }
        }
    }

    public final synchronized void I() {
        if (this.i == afgn.PLAYING) {
            afgn afgnVar = afgn.PLAYING;
            String e = e();
            afgq afgqVar = this.e;
            String valueOf = String.valueOf(afgnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(valueOf).length());
            sb.append(e);
            sb.append(":");
            sb.append(valueOf);
            afgqVar.a("vps", sb.toString());
            L(e);
            if (this.V) {
                this.e.h();
            }
            Q();
        }
    }

    public final void J(long j) {
        afgq afgqVar = this.e;
        String e = e();
        String c = c(j);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 10 + String.valueOf(c).length());
        sb.append(e);
        sb.append(":feedback:");
        sb.append(c);
        afgqVar.a("error", sb.toString());
        this.e.h();
    }

    public final long a() {
        if (this.u >= 0) {
            return this.v.d() - this.u;
        }
        return 0L;
    }

    public final String b(double d, int i) {
        if (!R(this.h, auii.QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME)) {
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(14);
            sb.append("%.");
            sb.append(i);
            sb.append("f");
            return String.format(locale, sb.toString(), Double.valueOf(d));
        }
        double d2 = i != 2 ? 1000.0d : 100.0d;
        double round = Math.round(d * d2);
        Double.isNaN(round);
        double d3 = round / d2;
        long j = (long) d3;
        if (d3 == j) {
            return Long.toString(j);
        }
        return Double.toString(d3);
    }

    public final String c(long j) {
        double d = j;
        Double.isNaN(d);
        double d2 = d / 1000.0d;
        if (R(this.h, auii.QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME)) {
            return b(d2, 3);
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        if (!(numberInstance instanceof DecimalFormat)) {
            return String.format(Locale.US, "%.3f", Double.valueOf(d2));
        }
        ((DecimalFormat) numberInstance).applyLocalizedPattern("0.000");
        return numberInstance.format(d2);
    }

    public final String d() {
        if (this.O) {
            return c(this.l);
        }
        return null;
    }

    public final String e() {
        return c(a());
    }

    final synchronized void f() {
        if (this.D != null) {
            this.D.cancel(false);
            this.D = null;
        }
    }

    public final void g() {
        afgy afgyVar = this.aa;
        ((afgt) afgyVar).a.remove(this.z);
        if (!this.q) {
            if (!this.m) {
                h(this.e.h, this.z, null, null, "", this.p, this.A);
                v(new afih(afif.DEFAULT, "qoe.client", this.l, "ForcedFinishCreate"));
            }
            O(afgn.NOT_STARTED, false);
            this.b.d.e(this.d);
        } else {
            M(e(), null, false);
        }
        this.b.d.e(this.c);
        this.e.h();
        this.e.b();
        if (this.q) {
            return;
        }
        Iterator it = this.b.h.iterator();
        while (it.hasNext()) {
            ((afgm) it.next()).a.remove(this);
        }
    }

    public final void i(int i) {
        afgq afgqVar = this.e;
        String e = e();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
        sb.append(e);
        sb.append(":");
        sb.append(i);
        afgqVar.a("conn", sb.toString());
    }

    public final void j(float f) {
        if (Float.compare(this.T, f) == 0) {
            return;
        }
        this.T = f;
        String e = e();
        afgq afgqVar = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 16);
        sb.append(e);
        sb.append(":");
        sb.append(f);
        afgqVar.a("rate", sb.toString());
        M(e, (aefq) ((amnv) this.b.f.get()).get(), true);
    }

    public final void k(int i, boolean z, int i2, int i3) {
        if (i >= 0 && this.K != i) {
            this.K = i;
            afgq afgqVar = this.e;
            String e = e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 12);
            sb.append(e);
            sb.append(":");
            sb.append(i);
            afgqVar.a("vis", sb.toString());
        }
        this.L = z;
        this.N = i2;
        this.M = i3;
    }

    public final void l(String str, int i) {
        int i2 = i - this.k;
        if (this.A.aB(aqux.EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING) && i2 != 0) {
            String valueOf = String.valueOf(this.i);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(";");
            sb.append(valueOf);
            sb.append(";");
            sb.append(i2);
            C("drop", sb.toString());
        }
        if (i == -1 || this.k == -1) {
            return;
        }
        if (this.i != afgn.PLAYING) {
            this.k = i;
            return;
        }
        if (this.k > i) {
            if (this.Y) {
                afsi.e(2, 6, "QoeStatsClient: Unexpected drop in dropped frames count.", 0.01d);
            }
            afid.a(afic.QOE, "QoeStatsClient: Unexpected drop in dropped frames count.");
            return;
        }
        afgq afgqVar = this.e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append(str);
        sb2.append(":");
        sb2.append(i2);
        afgqVar.a("df", sb2.toString());
        afic aficVar = afic.ABR;
        this.k = i;
    }

    public final void m(String str) {
        afgq afgqVar = this.e;
        String e = e();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 3 + String.valueOf(str).length());
        sb.append(e);
        sb.append(":");
        sb.append(str);
        sb.append("::");
        afgqVar.a("ad_playback", sb.toString());
        this.e.h();
    }

    public final synchronized void n(zfb zfbVar) {
        int i = zfbVar.a;
        if (i != 0 && i != Integer.MIN_VALUE) {
            long j = this.ae;
            long j2 = zfbVar.b;
            this.ae = j + j2;
            this.ad -= j2 * i;
        }
    }

    public final void o() {
        N(afgn.BUFFERING);
    }

    public final void p(long j, boolean z, boolean z2, String str, String str2, String str3, String str4) {
        int p;
        if (!z2) {
            p = z ? aedn.p(2) : aedn.p(1);
        } else if (z) {
            p = aedn.p(4);
        } else {
            p = aedn.p(3);
        }
        String e = e();
        this.e.a("xvt", String.format(Locale.US, "t.%s;m.%s;g.%d;tt.%d;np.%d;c.%s;d.%s", e, c(j), 2, Integer.valueOf(p), 0, str3, str4));
        if (!str.equals(this.z)) {
            this.e.a("adcpn", str);
            this.e.a("addocid", str2);
        }
        if (p == aedn.p(2) || p == aedn.p(4)) {
            afgq afgqVar = this.e;
            String valueOf = String.valueOf(this.i);
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(valueOf).length());
            sb.append(e);
            sb.append(":");
            sb.append(valueOf);
            afgqVar.a("vps", sb.toString());
            afgq afgqVar2 = this.e;
            int i = this.K;
            StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 12);
            sb2.append(e);
            sb2.append(":");
            sb2.append(i);
            afgqVar2.a("vis", sb2.toString());
            String str5 = this.f44J;
            if (str5 != null) {
                this.e.a("fexp", str5);
            }
        }
        this.e.h();
    }

    public final void q() {
        N(afgn.ENDED);
        this.e.h();
        this.Q = true;
    }

    public final void r(aeqq aeqqVar) {
        String bO;
        Object obj;
        int i;
        int i2;
        FormatStreamModel f = aeqqVar.f();
        int e = f != null ? f.e() : 0;
        String w = f != null ? f.w() : "";
        FormatStreamModel e2 = aeqqVar.e();
        int e3 = e2 != null ? e2.e() : 0;
        String w2 = e2 != null ? e2.w() : "";
        FormatStreamModel d = aeqqVar.d();
        int e4 = d != null ? d.e() : 0;
        int b = aeqqVar.b();
        aeex g = aeqqVar.g();
        if (this.Z == avzr.VIDEO_QUALITY_SETTING_DATA_SAVER) {
            bO = "z";
        } else if (this.Z == avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY) {
            bO = "q";
        } else {
            if (g != null) {
                if (g.c() || (this.U && g.e())) {
                    bO = "s";
                } else if (this.U) {
                    bO = "i";
                } else if (g.d()) {
                    bO = "m";
                }
            }
            bO = (this.U || !(b == 1 || b == 10000)) ? adyu.bO(b) : "a";
        }
        String e5 = e();
        if (TextUtils.isEmpty(bO)) {
            return;
        }
        if (f == null && e2 == null) {
            return;
        }
        if ((e < 0 || e == this.j) && ((e4 <= 0 || e4 == this.G) && (w == null || w.equals(this.F)))) {
            obj = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(e5);
            sb.append(":");
            sb.append(e);
            if (!TextUtils.isEmpty(w)) {
                sb.append(";");
                sb.append(w);
            }
            sb.append(":");
            sb.append(e4 != 0 ? Integer.valueOf(e4) : "");
            sb.append(":");
            int i3 = this.j;
            sb.append(i3 < 0 ? "" : Integer.valueOf(i3));
            sb.append(":");
            sb.append(bO);
            this.e.a("vfs", sb.toString());
            this.G = e4;
            this.j = e;
            this.F = w;
            aeqp h = aeqqVar.h();
            if (h != null) {
                long j = h.a;
                if (this.O) {
                    afgq afgqVar = this.e;
                    Locale locale = Locale.US;
                    obj = "";
                    double d2 = j;
                    Double.isNaN(d2);
                    afgqVar.a("bh", String.format(locale, "%s:%s", e5, b(d2 / 1000.0d, 2)));
                } else {
                    obj = "";
                }
                l(e5, h.b);
            } else {
                obj = "";
            }
            long c = aeqqVar.c();
            if (c > 0) {
                afgq afgqVar2 = this.e;
                Locale locale2 = Locale.US;
                double d3 = c;
                Double.isNaN(d3);
                afgqVar2.a("bwe", String.format(locale2, "%s:%s", e5, b(d3 / 8.0d, 2)));
                if (this.U) {
                    afgq afgqVar3 = this.e;
                    int a2 = aeqqVar.a();
                    StringBuilder sb2 = new StringBuilder(16);
                    sb2.append("ibws:");
                    sb2.append(a2);
                    afgqVar3.a("ctmp", sb2.toString());
                }
            }
            if (this.K != -1 && this.L && (i = this.N) != -1 && (i2 = this.M) != -1) {
                afgq afgqVar4 = this.e;
                StringBuilder sb3 = new StringBuilder(String.valueOf(e5).length() + 24);
                sb3.append(e5);
                sb3.append(":");
                sb3.append(i);
                sb3.append(":");
                sb3.append(i2);
                afgqVar4.a("view", sb3.toString());
            }
        }
        if ((e3 < 0 || e3 == this.H) && (w2 == null || w2.equals(this.I))) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(e5);
        sb4.append(":");
        sb4.append(e3);
        if (!TextUtils.isEmpty(w2)) {
            sb4.append(";");
            sb4.append(w2);
        }
        sb4.append(":");
        int i4 = this.H;
        sb4.append(i4 < 0 ? obj : Integer.valueOf(i4));
        sb4.append(":");
        sb4.append(bO);
        this.e.a("afs", sb4.toString());
        this.H = e3;
        this.I = w2;
        this.U = false;
    }

    public final void s(String str, afgj afgjVar) {
        C(str, afgjVar.a(this.u));
    }

    public final void t(avzr avzrVar) {
        if (this.b.p.h.f()) {
            this.Z = avzrVar;
        }
    }

    public final void u() {
        if (this.X) {
            return;
        }
        this.e.a("user_intent", e());
        this.X = true;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        this.e.a("qoealert", "1");
    }

    public final void v(afih afihVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(e());
        sb.append(":");
        sb.append(afihVar.i());
        sb.append(":");
        if (afihVar.n()) {
            sb.append("fatal");
        }
        sb.append(":");
        sb.append(c(afihVar.a()));
        if (afihVar.k() != null) {
            sb.append(":");
            sb.append(afihVar.k());
        }
        this.e.a("error", sb.toString());
        if (afihVar.n()) {
            N(afgn.ERROR);
            this.e.h();
        }
    }

    public final void w() {
        N(afgn.PAUSED);
    }

    public final void x() {
        N(afgn.PAUSED_BUFFERING);
    }

    public final void y() {
        O(afgn.SUSPENDED, false);
        if (this.Q) {
            return;
        }
        this.e.h();
    }

    public final void z(String str, Throwable th) {
        zhy zhyVar;
        String str2 = str;
        if (!TextUtils.isEmpty(str) && (zhyVar = this.S) != null) {
            zhyVar.h("docid", str2);
        }
        if (!this.m) {
            if (str2 == null) {
                str2 = "";
            }
            h(this.e.h, this.z, null, null, str2, this.p, this.A);
        }
        v(new afih(afif.METADATA, "net.retryexhausted", 0L, th));
    }

    public final void h(TrackingUrlModel trackingUrlModel, String str, String str2, Integer num, String str3, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        boolean z;
        TrackingUrlModel trackingUrlModel2 = trackingUrlModel;
        if (this.m) {
            return;
        }
        this.m = true;
        this.A = playerConfigModel;
        if (trackingUrlModel2 == null) {
            trackingUrlModel2 = this.e.h;
            z = true;
        } else {
            this.e.e(trackingUrlModel);
            z = false;
        }
        if (this.q) {
            this.r = num;
        }
        Uri c = trackingUrlModel2.c();
        zhq.m(str);
        zhy o = aedn.o(c, str, str2, str3, this.b.i, this.B, playerConfigModel);
        this.S = o;
        this.e.c(o);
        this.f44J = this.S.d("fexp");
        this.p = videoStreamingData;
        long j = a;
        auik auikVar = playerConfigModel.c.y;
        if (auikVar == null) {
            auikVar = auik.a;
        }
        long j2 = auikVar.b;
        if (j2 != 0) {
            j = j2;
        }
        this.R = j;
        this.e.i();
        if (!this.q) {
            aqif aqifVar = playerConfigModel.c.z;
            if (aqifVar == null) {
                aqifVar = aqif.b;
            }
            if (aqifVar.h && this.b.a.m()) {
                afgq afgqVar = this.e;
                String e = e();
                aqif aqifVar2 = playerConfigModel.c.z;
                if (aqifVar2 == null) {
                    aqifVar2 = aqif.b;
                }
                long j3 = aqifVar2.d;
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 21);
                sb.append(e);
                sb.append(":");
                sb.append(j3 / 1000);
                afgqVar.a("dp", sb.toString());
            }
        }
        if (z) {
            v(new afih(afif.DEFAULT, "qoe.client", 0L, "NoTrackingUrl"));
        }
        this.e.d(playerConfigModel.ad());
        P();
    }
}
