package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqm {
    public int A;
    public String B;
    public float C;
    public long D;
    public int E;
    public long F;
    public final String G;
    public final boolean H;
    public final afsx I;

    /* renamed from: J, reason: collision with root package name */
    public final String f56J;
    public final boolean K;
    public final boolean L;
    private final shf M;
    private final zhy N;
    private final zhy O;
    private final zhy P;
    private final awdj Q;
    private final afqj R;
    private final zbw S;
    private final ysy T;
    private final zez U;
    private final aiqq V;
    private final afxf W;
    private final boolean X;
    private final ScheduledExecutorService Y;
    private final aaea Z;
    public final TrackingUrlModel a;
    private ahcx aa;
    private aigm ab;
    private boolean ac;
    private boolean ad;
    private final ammv ae;
    private final Runnable af;
    private long ag;
    private long ah;
    private ScheduledFuture ai;
    private List aj;
    private final aiqu ak;
    public final TrackingUrlModel b;
    public final TrackingUrlModel c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final afuh m;
    public final afqm n;
    public final int o;
    public final int[] p;
    public int q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public volatile boolean y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aiqm(java.util.concurrent.ScheduledExecutorService r54, defpackage.afuh r55, defpackage.afqm r56, defpackage.shf r57, defpackage.ysy r58, defpackage.zez r59, defpackage.afqj r60, defpackage.afxf r61, defpackage.zbw r62, defpackage.ahbv r63, defpackage.afsy r64, defpackage.aaea r65, defpackage.aifs r66, defpackage.aigv r67, java.lang.String r68, defpackage.awdj r69, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r70, java.lang.String r71, int r72, boolean r73, boolean r74, boolean r75, defpackage.aiqu r76, defpackage.ammv r77) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqm.<init>(java.util.concurrent.ScheduledExecutorService, afuh, afqm, shf, ysy, zez, afqj, afxf, zbw, ahbv, afsy, aaea, aifs, aigv, java.lang.String, awdj, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel, java.lang.String, int, boolean, boolean, boolean, aiqu, ammv):void");
    }

    private final void A(zhy zhyVar, String str) {
        for (Map.Entry entry : this.R.a().entrySet()) {
            zhyVar.h((String) entry.getKey(), (String) entry.getValue());
        }
        zhyVar.h("rt", str);
        zhyVar.h("len", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.D)));
        zbw zbwVar = this.S;
        if (zbwVar != null) {
            zhyVar.h("lact", String.valueOf(zbwVar.a()));
        }
        if (this.A == 0 && this.z == 0) {
            zga.l("Warning: Sending VSS ping without a format parameter.");
        }
        int i = this.z;
        if (i > 0) {
            zhyVar.k("fmt", i);
        }
        int i2 = this.A;
        if (i2 > 0 && i2 != this.z) {
            zhyVar.k("afmt", i2);
        }
        awdj awdjVar = this.Q;
        if (awdjVar == null || (awdjVar.b & 1) == 0) {
            return;
        }
        zhyVar.e(awdjVar.c);
    }

    private final void B(zhy zhyVar) {
        if (zhyVar != null) {
            zhyVar.h("cpn", this.h);
            zhyVar.h("ns", "yt");
            zhyVar.h("docid", this.f);
            zhyVar.h("ver", "2");
            this.R.c(zhyVar);
            if (zhyVar.d("adformat") != null) {
                zhyVar.h("el", "adunit");
            } else {
                zhyVar.h("el", "detailpage");
                if (this.k && !TextUtils.isEmpty(this.i)) {
                    zhyVar.h(ahbw.AUTONAV, "1");
                }
            }
            if (!TextUtils.isEmpty(this.g)) {
                zhyVar.h("host_cpn", this.g);
            }
            if (!TextUtils.isEmpty(this.i)) {
                zhyVar.h("list", this.i);
            }
            if (this.k) {
                zhyVar.h("autoplay", "1");
            }
            if (this.l) {
                zhyVar.h("splay", "1");
            }
            if (!this.X) {
                zhyVar.h("dnc", "1");
            }
            if (TextUtils.isEmpty(this.G)) {
                return;
            }
            zhyVar.h("referring_app", this.G);
        }
    }

    private final synchronized void C() {
        if (!this.ad || this.aj.isEmpty()) {
            return;
        }
        ((aiql) this.aj.get(r0.size() - 1)).b = y(w());
        this.ad = false;
    }

    private final void D() {
        TrackingUrlModel trackingUrlModel;
        int i;
        zhy zhyVar = this.O;
        if (zhyVar == null || (trackingUrlModel = this.b) == null || this.u || (i = this.j) == 0 || this.t < i * 1000) {
            return;
        }
        this.u = true;
        F(zhyVar, trackingUrlModel, false);
    }

    private final void E(final zhy zhyVar, final afve afveVar) {
        if (!this.v) {
            if (!this.y) {
                this.Y.execute(new Runnable() { // from class: aiqk
                    @Override // java.lang.Runnable
                    public final void run() {
                        final aiqm aiqmVar = aiqm.this;
                        zhy zhyVar2 = zhyVar;
                        afve afveVar2 = afveVar;
                        Uri a = zhyVar2.a();
                        afug d = afuh.d("vss");
                        d.b(a);
                        d.d = true;
                        d.a(afveVar2);
                        d.g = aiqmVar.I;
                        d.h = aiqmVar.f56J;
                        aiqmVar.m.b(aiqmVar.n, d, new cnk() { // from class: aiqi
                            @Override // defpackage.cnk
                            public final void kY(cnq cnqVar) {
                                aiqm.this.y = true;
                            }
                        });
                    }
                });
                return;
            } else {
                String.valueOf(this.h).length();
                return;
            }
        }
        String str = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("Final ping for playback ");
        sb.append(str);
        sb.append(" has already been sent - Ignoring request");
        zga.l(sb.toString());
    }

    private final void F(zhy zhyVar, TrackingUrlModel trackingUrlModel, boolean z) {
        long x = x();
        String y = y(x);
        zhy c = zhy.c(zhyVar);
        A(c, y);
        c.h("cmt", y(w()));
        c.k("conn", this.T.a());
        c.h("vis", this.aa.d().a());
        c.h("uao", this.ab.a());
        c.h("muted", true != this.x ? "0" : "1");
        c.h("volume", String.valueOf(v()));
        int i = this.j;
        if (i > 0) {
            c.k("delay", i);
        }
        if (!TextUtils.equals(this.B, "-")) {
            c.h("cc", this.B);
        }
        float f = this.C;
        if (f != 1.0f) {
            c.h("rate", String.valueOf(f));
        }
        if (this.d) {
            c.k("reuse", 1);
        }
        if (!TextUtils.equals("-", this.ak.a)) {
            c.h("clipid", this.ak.a);
        }
        if (z) {
            M(c, 1, x);
        }
        E(c, new acub(trackingUrlModel, 1));
    }

    private final void G(boolean z) {
        this.ac = z;
        this.V.c = z;
    }

    private final synchronized void H() {
        this.ad = true;
        aiql aiqlVar = new aiql();
        aiqlVar.a = y(w());
        aiqlVar.c = String.valueOf(this.T.a());
        aiqlVar.e = this.B;
        aiqlVar.i = this.C;
        aiqlVar.d = this.aa.d().a();
        aiqlVar.f = this.ab.a();
        aiqlVar.g = true != this.aa.e() ? "0" : "1";
        aiqlVar.j = v();
        aiqlVar.h = true != this.x ? "0" : "1";
        aiqu aiquVar = this.ak;
        aiqlVar.k = aiquVar.a;
        aiqlVar.l = aiquVar.b;
        this.aj.add(aiqlVar);
    }

    private final synchronized void I() {
        if (!this.ac || this.ad) {
            return;
        }
        H();
    }

    private static boolean J(int i) {
        return i == 0;
    }

    private final boolean K() {
        int[] iArr;
        return this.o > 0 || ((iArr = this.p) != null && this.q < iArr.length);
    }

    private final boolean L() {
        return this.F != -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r0 <= r12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r0 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r11 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r11 != 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9.ac != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r9.M.d() >= r9.ag) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.ac != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r9.ai = null;
        r9.ah = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r11 != 4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r10 = r9.ai;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r10 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        r10.cancel(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r10.h("rtn", y(r0));
        r9.ah = r0;
        r10 = r9.ai;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        r10.cancel(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        r9.ai = r9.Y.schedule(r9.af, r0 - r12, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0037, code lost:
    
        if (r9.o <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0039, code lost:
    
        r0 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r9.o) + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0044, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r9.p != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r9.q >= r9.p.length) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r0 = java.util.concurrent.TimeUnit.SECONDS;
        r1 = r9.p;
        r9.q = r9.q + 1;
        r0 = r0.toMillis(r1[r5]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void M(defpackage.zhy r10, int r11, long r12) {
        /*
            r9 = this;
            long r0 = r9.ah
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L14
            if (r11 == r4) goto L14
            java.lang.String r0 = y(r0)
            java.lang.String r1 = "rti"
            r10.h(r1, r0)
        L14:
            int[] r0 = r9.p
            if (r0 == 0) goto L35
        L18:
            int r0 = r9.q
            int[] r1 = r9.p
            int r1 = r1.length
            if (r0 >= r1) goto L35
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            int[] r1 = r9.p
            int r5 = r9.q
            int r6 = r5 + 1
            r9.q = r6
            r1 = r1[r5]
            long r5 = (long) r1
            long r0 = r0.toMillis(r5)
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L18
            goto L45
        L35:
            int r0 = r9.o
            if (r0 <= 0) goto L44
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            int r1 = r9.o
            long r5 = (long) r1
            long r0 = r0.toMillis(r5)
            long r0 = r0 + r12
            goto L45
        L44:
            r0 = r2
        L45:
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L92
            if (r11 == r4) goto L73
            r5 = 2
            if (r11 != r5) goto L63
            boolean r11 = r9.ac
            if (r11 != 0) goto L73
            shf r11 = r9.M
            long r5 = r11.d()
            long r7 = r9.ag
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L6d
            boolean r11 = r9.ac
            if (r11 != 0) goto L6d
            goto L73
        L63:
            r10 = 4
            if (r11 != r10) goto L6d
            java.util.concurrent.ScheduledFuture r10 = r9.ai
            if (r10 == 0) goto L6d
            r10.cancel(r4)
        L6d:
            r10 = 0
            r9.ai = r10
            r9.ah = r2
            return
        L73:
            java.lang.String r11 = y(r0)
            java.lang.String r2 = "rtn"
            r10.h(r2, r11)
            r9.ah = r0
            java.util.concurrent.ScheduledFuture r10 = r9.ai
            if (r10 == 0) goto L85
            r10.cancel(r4)
        L85:
            java.util.concurrent.ScheduledExecutorService r10 = r9.Y
            java.lang.Runnable r11 = r9.af
            long r0 = r0 - r12
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r10 = r10.schedule(r11, r0, r12)
            r9.ai = r10
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqm.M(zhy, int, long):void");
    }

    private final synchronized void N(int i) {
        if (this.L) {
            return;
        }
        long x = x();
        String y = y(x);
        zhy c = zhy.c(this.P);
        A(c, y);
        List<aiql> z = z();
        int i2 = 1;
        c.h("state", true != this.ac ? "paused" : "playing");
        if (this.H) {
            long j = this.s;
            if (j > 0) {
                c.g("lio", y(j));
            }
        }
        if (this.K) {
            c.h("dl", "1");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("st", new StringBuilder());
        hashMap.put("et", new StringBuilder());
        hashMap.put("conn", new StringBuilder());
        hashMap.put("vis", new StringBuilder());
        hashMap.put("uao", new StringBuilder());
        hashMap.put("cc", new StringBuilder());
        hashMap.put("rate", new StringBuilder());
        hashMap.put("blo", new StringBuilder());
        hashMap.put("muted", new StringBuilder());
        hashMap.put("volume", new StringBuilder());
        hashMap.put("clipid", new StringBuilder());
        hashMap.put("als", new StringBuilder());
        String str = "";
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (aiql aiqlVar : z) {
            if (z.size() == i2 || !aiqlVar.a.equals(aiqlVar.b)) {
                StringBuilder sb = (StringBuilder) hashMap.get("st");
                sb.append(str);
                sb.append(aiqlVar.a);
                StringBuilder sb2 = (StringBuilder) hashMap.get("et");
                sb2.append(str);
                sb2.append(aiqlVar.b);
                StringBuilder sb3 = (StringBuilder) hashMap.get("conn");
                sb3.append(str);
                sb3.append(aiqlVar.c);
                StringBuilder sb4 = (StringBuilder) hashMap.get("vis");
                sb4.append(str);
                sb4.append(aiqlVar.d);
                StringBuilder sb5 = (StringBuilder) hashMap.get("uao");
                sb5.append(str);
                sb5.append(aiqlVar.f);
                StringBuilder sb6 = (StringBuilder) hashMap.get("cc");
                sb6.append(str);
                sb6.append(aiqlVar.e);
                StringBuilder sb7 = (StringBuilder) hashMap.get("rate");
                sb7.append(str);
                sb7.append(aiqlVar.i);
                StringBuilder sb8 = (StringBuilder) hashMap.get("blo");
                sb8.append(str);
                sb8.append(aiqlVar.g);
                StringBuilder sb9 = (StringBuilder) hashMap.get("muted");
                sb9.append(str);
                sb9.append(aiqlVar.h);
                StringBuilder sb10 = (StringBuilder) hashMap.get("volume");
                sb10.append(str);
                sb10.append(aiqlVar.j);
                StringBuilder sb11 = (StringBuilder) hashMap.get("clipid");
                sb11.append(str);
                sb11.append(aiqlVar.k);
                StringBuilder sb12 = (StringBuilder) hashMap.get("als");
                sb12.append(str);
                sb12.append(aiqlVar.l);
                z2 |= !aiqlVar.e.equals("-");
                z3 |= !(aiqlVar.i == 1.0f);
                z4 |= !TextUtils.equals("0", aiqlVar.g);
                z5 |= !TextUtils.equals("-", aiqlVar.k);
                str = ",";
            }
            i2 = 1;
        }
        if (!z2) {
            hashMap.remove("cc");
        }
        if (!z3) {
            hashMap.remove("rate");
        }
        if (!z4) {
            hashMap.remove("blo");
        }
        if (!z5) {
            hashMap.remove("clipid");
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((StringBuilder) entry.getValue()).toString().length() > 0) {
                c.i((String) entry.getKey(), ((StringBuilder) entry.getValue()).toString(), ",:");
            }
        }
        boolean z6 = i != 3;
        if (i == 3) {
            c.h("final", "1");
        }
        if (K()) {
            M(c, i, x);
        }
        E(c, new acub(this.c, 1));
        this.v |= !z6;
    }

    public static boolean u(PlayerConfigModel playerConfigModel, aifs aifsVar) {
        if (aifsVar.u != 2) {
            if (playerConfigModel == null) {
                return false;
            }
            if (!playerConfigModel.aO() && (!playerConfigModel.aQ() || aifsVar.u != 1)) {
                return false;
            }
        }
        return true;
    }

    private final int v() {
        Integer num;
        anhy anhyVar;
        if (this.ae.h()) {
            try {
                zif zifVar = (zif) this.ae.c();
                synchronized (zifVar) {
                    num = zifVar.e;
                    anhyVar = zifVar.f;
                }
                if (zifVar.d.get() != 0 && anhyVar != null) {
                    if (num != null) {
                        return num.intValue();
                    }
                    return ((Integer) anhyVar.get()).intValue();
                }
                return -1000;
            } catch (InterruptedException | ExecutionException unused) {
                return -1000;
            }
        }
        return this.U.a();
    }

    private final long w() {
        if (!this.H || !aifk.e(this.Z).g) {
            long j = this.r;
            long j2 = this.D;
            if (j > j2 && j2 != 0) {
                StringBuilder sb = new StringBuilder(110);
                sb.append("Reported playback position ");
                sb.append(j);
                sb.append(" is greater than the duration of the video ");
                sb.append(j2);
                zga.l(sb.toString());
                return this.D;
            }
        }
        return this.r;
    }

    private final long x() {
        return this.M.d() - this.e;
    }

    private static String y(long j) {
        long j2 = j + 50;
        String valueOf = String.valueOf(j2 / 1000);
        String valueOf2 = String.valueOf((j2 % 1000) / 100);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".");
        sb.append(valueOf2);
        return sb.toString();
    }

    private final synchronized List z() {
        List list;
        if (this.aj.isEmpty()) {
            H();
            C();
        }
        list = this.aj;
        this.aj = new ArrayList();
        return list;
    }

    public final aiqb a() {
        return new aiqb(this.w, this.u, this.v);
    }

    public final void b() {
        C();
        I();
    }

    public final void c(ahcr ahcrVar) {
        if (this.C != ahcrVar.a()) {
            this.C = ahcrVar.a();
            C();
            I();
        }
    }

    public final void d(ahcx ahcxVar) {
        this.V.a = ahcxVar.d();
        ahcx ahcxVar2 = this.aa;
        if (ahcxVar2 != null && ahcxVar2.d() == ahcxVar.d() && this.aa.e() == ahcxVar.e()) {
            return;
        }
        C();
        this.aa = ahcxVar;
        I();
    }

    public final void e(ahdy ahdyVar) {
        if (TextUtils.equals(this.B, ahdyVar.b())) {
            return;
        }
        this.B = ahdyVar.b();
        C();
        I();
    }

    public final void f(ahed ahedVar) {
        if (this.ab != ahedVar.a()) {
            C();
            this.ab = ahedVar.a();
            I();
        }
    }

    public final void g(aeqq aeqqVar) {
        FormatStreamModel e = aeqqVar.e();
        FormatStreamModel f = aeqqVar.f();
        this.z = f == null ? 0 : f.e();
        this.A = e != null ? e.e() : 0;
    }

    public final void h() {
        C();
        if (this.w) {
            N(3);
        }
    }

    public final void i() {
        ScheduledFuture scheduledFuture;
        G(false);
        D();
        C();
        if (this.t > 0) {
            if (K() && (scheduledFuture = this.ai) != null) {
                scheduledFuture.cancel(true);
                this.ai = null;
            }
            N(2);
        }
    }

    public final void j() {
        if (this.ac) {
            C();
            this.x = true;
            I();
        }
    }

    public final void k() {
        G(false);
    }

    public final void l(long j) {
        C();
        this.r = j;
        I();
    }

    public final void m(long j) {
        if (!this.ac) {
            G(true);
            this.r = j;
            return;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Warning: unexpected playback play ");
        sb.append(j);
        sb.append(" surpressed");
        zga.l(sb.toString());
    }

    public final void n() {
        G(false);
    }

    public final void o() {
        C();
        if (this.w) {
            N(4);
        }
    }

    public final void p() {
        if (this.ac) {
            C();
            this.x = false;
            I();
        }
    }

    public final void q(aheg ahegVar) {
        if (ahegVar.f() > 0) {
            this.D = ahegVar.f();
        }
        if (ahegVar.j()) {
            long e = ahegVar.e();
            long j = this.r;
            if (e < (-5000) + j || e > 5000 + j) {
                StringBuilder sb = new StringBuilder(109);
                sb.append("Warning: unexpected playback progress ");
                sb.append(e);
                sb.append(" for current playback position ");
                sb.append(j);
                zga.l(sb.toString());
                l(e);
                return;
            }
            if (e < j) {
                return;
            }
            this.t += e - j;
            this.r = e;
            this.s = ahegVar.b() - ahegVar.e();
            this.ag = ahegVar.c() + 30000;
            this.V.b = this.r;
            long j2 = this.t;
            int v = v();
            if (v != -1000) {
                if (v != this.E && !L()) {
                    this.E = v;
                    this.F = j2;
                }
                long j3 = j2 - this.F;
                if (L() && j3 > 2000) {
                    this.F = -1L;
                    this.E = v;
                    C();
                    I();
                }
            }
            if (!this.w) {
                this.w = true;
                F(this.N, this.a, K());
            } else if (K() && this.ai == null) {
                s();
            }
            I();
            D();
        }
    }

    public final void r() {
        if (this.ad) {
            zga.n("VSS2 client released unexpectedly", new Exception());
            o();
        }
        this.W.g(this.V);
        if (this.ae.h()) {
            zif zifVar = (zif) this.ae.c();
            if (zifVar.d.decrementAndGet() == 0) {
                zifVar.b.unregisterContentObserver(zifVar);
            }
        }
    }

    public final synchronized void s() {
        if (this.v) {
            return;
        }
        C();
        N(2);
        I();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        C();
        I();
    }

    public aiqm(ScheduledExecutorService scheduledExecutorService, afuh afuhVar, afqm afqmVar, shf shfVar, ysy ysyVar, zez zezVar, afqj afqjVar, afxf afxfVar, zbw zbwVar, ahbv ahbvVar, afsy afsyVar, aaea aaeaVar, aifs aifsVar, awdj awdjVar, VideoStats2Client$VideoStats2ClientState videoStats2Client$VideoStats2ClientState, aiqu aiquVar, ammv ammvVar) {
        this(scheduledExecutorService, afuhVar, afqmVar, shfVar, videoStats2Client$VideoStats2ClientState.a, videoStats2Client$VideoStats2ClientState.b, videoStats2Client$VideoStats2ClientState.c, videoStats2Client$VideoStats2ClientState.d, videoStats2Client$VideoStats2ClientState.h, videoStats2Client$VideoStats2ClientState.g, videoStats2Client$VideoStats2ClientState.l, videoStats2Client$VideoStats2ClientState.o, videoStats2Client$VideoStats2ClientState.p, videoStats2Client$VideoStats2ClientState.u, videoStats2Client$VideoStats2ClientState.v, videoStats2Client$VideoStats2ClientState.i, videoStats2Client$VideoStats2ClientState.j, videoStats2Client$VideoStats2ClientState.k, videoStats2Client$VideoStats2ClientState.e, videoStats2Client$VideoStats2ClientState.A, videoStats2Client$VideoStats2ClientState.B, aifsVar.c(), aifsVar.t, ysyVar, zezVar, afqjVar, zbwVar, afxfVar, videoStats2Client$VideoStats2ClientState.C, videoStats2Client$VideoStats2ClientState.D, videoStats2Client$VideoStats2ClientState.E, ahbvVar.b, videoStats2Client$VideoStats2ClientState.F, afsyVar, aaeaVar, videoStats2Client$VideoStats2ClientState.y, videoStats2Client$VideoStats2ClientState.z, aiquVar, videoStats2Client$VideoStats2ClientState.G, videoStats2Client$VideoStats2ClientState.r, videoStats2Client$VideoStats2ClientState.q, videoStats2Client$VideoStats2ClientState.s, ammvVar, videoStats2Client$VideoStats2ClientState.H, awdjVar);
        this.r = videoStats2Client$VideoStats2ClientState.f;
        this.t = videoStats2Client$VideoStats2ClientState.m;
        this.y = videoStats2Client$VideoStats2ClientState.t;
        this.z = videoStats2Client$VideoStats2ClientState.w;
        this.A = videoStats2Client$VideoStats2ClientState.x;
    }

    @Deprecated
    public aiqm(ScheduledExecutorService scheduledExecutorService, afuh afuhVar, afqm afqmVar, shf shfVar, TrackingUrlModel trackingUrlModel, TrackingUrlModel trackingUrlModel2, TrackingUrlModel trackingUrlModel3, boolean z, String str, long j, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, long j2, String str5, float f, ahcx ahcxVar, aigm aigmVar, ysy ysyVar, zez zezVar, afqj afqjVar, zbw zbwVar, afxf afxfVar, int i2, int[] iArr, int i3, boolean z6, String str6, afsy afsyVar, aaea aaeaVar, int i4, long j3, aiqu aiquVar, boolean z7, boolean z8, boolean z9, boolean z10, ammv ammvVar, boolean z11, awdj awdjVar) {
        this.af = new Runnable() { // from class: aiqj
            @Override // java.lang.Runnable
            public final void run() {
                aiqm.this.s();
            }
        };
        this.Y = scheduledExecutorService;
        this.m = afuhVar;
        this.n = afqmVar;
        this.M = shfVar;
        trackingUrlModel.getClass();
        this.a = trackingUrlModel;
        zhy b = zhy.b(trackingUrlModel.c());
        this.N = b;
        this.b = trackingUrlModel2;
        zhy b2 = trackingUrlModel2 != null ? zhy.b(trackingUrlModel2.c()) : null;
        this.O = b2;
        trackingUrlModel3.getClass();
        this.c = trackingUrlModel3;
        zhy b3 = zhy.b(trackingUrlModel3.c());
        this.P = b3;
        this.d = z;
        this.Z = aaeaVar;
        this.f = str;
        this.D = j;
        this.j = i;
        this.k = z2;
        this.l = z3;
        this.H = z4;
        this.x = z5;
        this.g = str2;
        this.h = str3;
        this.e = j2;
        this.B = str5;
        this.C = f;
        this.aa = ahcxVar;
        this.ab = aigmVar;
        this.T = ysyVar;
        this.U = zezVar;
        this.R = afqjVar;
        this.i = str4;
        this.t = 0L;
        this.S = zbwVar;
        this.W = afxfVar;
        this.X = z6;
        aiqq aiqqVar = new aiqq(ysyVar, ahcxVar.d(), aigmVar, shfVar, j2, str3);
        this.V = aiqqVar;
        afxfVar.e(aiqqVar);
        this.o = i2;
        this.p = iArr;
        this.q = i3;
        this.aj = new ArrayList();
        this.G = str6 != null ? str6 : "";
        this.E = i4;
        this.F = j3;
        this.ak = aiquVar;
        this.K = z7;
        this.L = z11;
        this.w = z8;
        this.u = z9;
        this.v = z10;
        this.ae = ammvVar;
        this.I = afsyVar.c();
        this.f56J = afsyVar.g();
        this.Q = awdjVar;
        if (ammvVar.h()) {
            final zif zifVar = (zif) ammvVar.c();
            if (zifVar.d.incrementAndGet() == 1) {
                zifVar.f = aci.c(new aeu() { // from class: zid
                    @Override // defpackage.aeu
                    public final Object a(final aes aesVar) {
                        final zif zifVar2 = zif.this;
                        zifVar2.c.post(new Runnable() { // from class: zie
                            @Override // java.lang.Runnable
                            public final void run() {
                                zif zifVar3 = zif.this;
                                aes aesVar2 = aesVar;
                                zifVar3.a();
                                aesVar2.c(zifVar3.e);
                            }
                        });
                        return "updateVolume";
                    }
                });
            }
            zifVar.b.registerContentObserver(zif.a, true, zifVar);
        }
        B(b);
        B(b3);
        B(b2);
    }
}
