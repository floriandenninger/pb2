package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezf {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public afft G;
    public boolean H;
    public volatile boolean I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f40J;
    public aesa K;
    public final afhs L;
    private FormatStreamModel M;
    private boolean N;
    private affc O;
    private Integer P;
    private Integer Q;
    private boolean R;
    private aesm S;
    private aeeu T;
    private aeya U;
    public final String a;
    public aeru b;
    public final aezg c;
    public final aelf d;
    public final aeze e;
    public long f;
    public int g;
    public int h;
    public bbr i;
    public afeb j;
    public long k;
    public int l;
    public FormatStreamModel m;
    public afjd n;
    public afjc o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public PlayerConfigModel t;
    public boolean u;
    public VideoStreamingData v;
    public aezh w;
    public FormatStreamModel x;
    public int y;
    public aezf z;

    public aezf(aeze aezeVar, String str, PlayerConfigModel playerConfigModel, aeru aeruVar, VideoStreamingData videoStreamingData, aesm aesmVar, affc affcVar, afjd afjdVar, afjc afjcVar, aeeu aeeuVar, afhs afhsVar, aesa aesaVar, afft afftVar) {
        this(aezeVar, str, playerConfigModel, aeruVar, videoStreamingData, aesmVar, affcVar, afjdVar, afjcVar, aeeuVar, null, afhsVar, aesaVar, afftVar);
    }

    private final void z(aeex aeexVar, int i, aenk aenkVar) {
        aeru aeruVar = this.b;
        FormatStreamModel formatStreamModel = this.x;
        FormatStreamModel formatStreamModel2 = this.m;
        FormatStreamModel formatStreamModel3 = this.M;
        aeeu aeeuVar = this.T;
        aeruVar.h(new aeqq(formatStreamModel, formatStreamModel2, formatStreamModel3, aeeuVar.d, aeeuVar.e, aeexVar, i, aenkVar.b, aenkVar.c, aeqp.a(this.e.f(), this.e.g(), this.e.b())));
    }

    public final synchronized PlayerConfigModel a() {
        return this.t;
    }

    public final synchronized VideoStreamingData b() {
        return this.v;
    }

    public final synchronized aeeu c() {
        return this.T;
    }

    public final synchronized aesm d() {
        return this.S;
    }

    public final synchronized aeya e() {
        return this.U;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final synchronized aezh f() {
        return this.w;
    }

    public final synchronized affc g() {
        return this.O;
    }

    public final synchronized afjd h() {
        return this.n;
    }

    public final afqu i() {
        return this.F ? afqu.ANDROID_EXO2_SCRIPTED_MEDIA_FETCH : afqu.ANDROID_EXOPLAYER_V2;
    }

    public final synchronized Integer j() {
        return this.Q;
    }

    public final synchronized Integer k() {
        return this.P;
    }

    public final synchronized String l() {
        return this.v.c;
    }

    public final void m(String str, boolean z, aezh aezhVar, int i) {
        FormatStreamModel formatStreamModel = (FormatStreamModel) this.v.q().get(str);
        if (formatStreamModel == null) {
            return;
        }
        if (formatStreamModel.P()) {
            FormatStreamModel formatStreamModel2 = this.x;
            if (formatStreamModel2 != null && formatStreamModel2.equals(formatStreamModel)) {
                return;
            } else {
                this.x = formatStreamModel;
            }
        } else if (formatStreamModel.C()) {
            FormatStreamModel formatStreamModel3 = this.m;
            if (formatStreamModel3 != null && formatStreamModel3.equals(formatStreamModel)) {
                return;
            } else {
                this.m = formatStreamModel;
            }
        }
        if (this.p) {
            boolean z2 = !z || this.T.a.length <= 0;
            if (this.M == null && !z2) {
                this.M = this.T.c;
            }
            synchronized (this) {
                this.w = aezhVar;
            }
            if (this.m != null) {
                if (this.x != null || z2) {
                    this.N = true;
                    z(this.T.f, i, aezhVar.c);
                }
            }
        }
    }

    public final synchronized void n(aeya aeyaVar) {
        this.U = aeyaVar;
    }

    public final synchronized void o(boolean z) {
        this.R = z;
    }

    public final synchronized void p(Integer num) {
        this.Q = num;
    }

    public final synchronized void q(Integer num) {
        this.P = num;
    }

    public final synchronized void r(afjc afjcVar) {
        this.o = afjcVar;
    }

    public final synchronized void s(afjd afjdVar) {
        this.n = afjdVar;
    }

    public final synchronized void t(aeeu aeeuVar) {
        this.T = aeeuVar;
    }

    public final synchronized void u(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aesm aesmVar, affc affcVar, aeeu aeeuVar) {
        this.t = playerConfigModel;
        this.v = videoStreamingData;
        this.S = aesmVar;
        this.O = affcVar;
        this.T = aeeuVar;
    }

    public final synchronized boolean v() {
        return this.R;
    }

    public final synchronized boolean w() {
        return this.T.f.e();
    }

    public final boolean x() {
        if (this.L.o().C && this.v.D()) {
            FormatStreamModel formatStreamModel = this.x;
            if (formatStreamModel == null && this.v.r.size() == 1) {
                formatStreamModel = (FormatStreamModel) this.v.r.get(0);
            }
            if (formatStreamModel != null && !((aeut) this.e).t.f(formatStreamModel)) {
                return true;
            }
        }
        return false;
    }

    public aezf(aeze aezeVar, String str, PlayerConfigModel playerConfigModel, aeru aeruVar, VideoStreamingData videoStreamingData, aesm aesmVar, affc affcVar, afjd afjdVar, afjc afjcVar, aeeu aeeuVar, aelf aelfVar, afhs afhsVar, aesa aesaVar, afft afftVar) {
        boolean z = false;
        this.g = 0;
        this.k = -1L;
        this.l = 0;
        this.a = str;
        this.t = playerConfigModel;
        this.b = new aesc(aeruVar);
        this.v = videoStreamingData;
        this.S = aesmVar;
        this.O = affcVar;
        this.n = afjdVar;
        this.o = afjcVar;
        this.T = aeeuVar;
        this.d = aelfVar;
        this.e = aezeVar;
        this.z = null;
        afki.a(afhsVar);
        this.L = afhsVar;
        afki.a(aesaVar);
        this.K = aesaVar;
        this.G = afftVar;
        this.c = new aezg(this);
        if (aelfVar != null) {
            z = afhsVar.aF();
        } else if (afhsVar.aF() && playerConfigModel.ar()) {
            z = true;
        }
        this.F = z;
        if (!afhsVar.aL() || afhsVar.aF()) {
            return;
        }
        aesaVar.f("smfc", "p");
    }

    public final void y(afhs afhsVar, ysy ysyVar, afkm afkmVar, int i, boolean z) {
        aezh aezhVar = this.w;
        if (aezhVar == null || !this.p) {
            return;
        }
        aenk aenkVar = aezhVar.c;
        if (i == 0) {
            z(this.T.f, i, aenkVar);
            return;
        }
        if (i == 1) {
            boolean z2 = !z || this.T.a.length <= 0;
            if (this.m != null) {
                FormatStreamModel formatStreamModel = this.x;
                if (formatStreamModel != null) {
                    r5 = z2;
                } else if (!z2) {
                    return;
                }
                if (this.N) {
                    return;
                }
                if (formatStreamModel != null) {
                    this.x = (FormatStreamModel) this.v.q().get(formatStreamModel.e);
                }
                this.M = r5 ? null : this.T.c;
                z(this.T.f, i, aenkVar);
                return;
            }
            return;
        }
        if (i != 10001) {
            if (i != 10002) {
                return;
            }
            this.M = null;
            this.x = null;
            if (this.m != null) {
                z(null, i, aenkVar);
                return;
            }
            return;
        }
        if (this.x == null || this.m == null) {
            return;
        }
        FormatStreamModel[] formatStreamModelArr = this.T.b;
        int a = ysyVar.a();
        List asList = Arrays.asList(this.T.a);
        aeex aeexVar = this.T.f;
        PlayerConfigModel playerConfigModel = this.t;
        FormatStreamModel j = aeez.j(asList, aeexVar, ysyVar, playerConfigModel, afhsVar, formatStreamModelArr.length != 0 ? formatStreamModelArr[0].f : 0, afkmVar.c, afkmVar.d, playerConfigModel.e(), this.t.d(), a, afhsVar.h.b(this.a));
        boolean z3 = j == null;
        FormatStreamModel formatStreamModel2 = this.M;
        boolean z4 = z3 ^ (formatStreamModel2 == null);
        r5 = (j == null || formatStreamModel2 == null || formatStreamModel2.e() == j.e()) ? false : true;
        if (z4 || r5) {
            this.M = j;
            z(this.T.f, i, aenkVar);
        }
    }
}
