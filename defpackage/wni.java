package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wni {
    public static final long a = TimeUnit.MINUTES.toMillis(7);
    public static final long b = TimeUnit.MINUTES.toMillis(15);
    public static final long c = TimeUnit.SECONDS.toMillis(15);
    public static final long d = TimeUnit.SECONDS.toMillis(15);
    public final String e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    private final long o;
    private final long p;
    private final long q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;

    public wni() {
    }

    public wni(String str, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i) {
        this.e = str;
        this.o = j;
        this.p = j2;
        this.f = j3;
        this.q = j4;
        this.g = j5;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.r = z4;
        this.s = z5;
        this.k = z6;
        this.t = z7;
        this.l = z8;
        this.u = z9;
        this.m = z10;
        this.n = i;
    }

    public static wnh a(String str) {
        wnh wnhVar = new wnh();
        if (str == null) {
            throw new NullPointerException("Null getAppVersionForAds");
        }
        wnhVar.a = str;
        wnhVar.b = Long.valueOf(a);
        wnhVar.c = Long.valueOf(b);
        wnhVar.d = Long.valueOf(c);
        wnhVar.e = 0L;
        wnhVar.f = Long.valueOf(d);
        wnhVar.f(false);
        wnhVar.b(false);
        wnhVar.c(false);
        wnhVar.e(false);
        wnhVar.d(false);
        wnhVar.g = false;
        wnhVar.h = false;
        wnhVar.i = false;
        wnhVar.j = false;
        wnhVar.k = true;
        wnhVar.l = 1000;
        return wnhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wni) {
            wni wniVar = (wni) obj;
            if (this.e.equals(wniVar.e) && this.o == wniVar.o && this.p == wniVar.p && this.f == wniVar.f && this.q == wniVar.q && this.g == wniVar.g && this.h == wniVar.h && this.i == wniVar.i && this.j == wniVar.j && this.r == wniVar.r && this.s == wniVar.s && this.k == wniVar.k && this.t == wniVar.t && this.l == wniVar.l && this.u == wniVar.u && this.m == wniVar.m && this.n == wniVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        long j = this.o;
        long j2 = this.p;
        long j3 = this.f;
        long j4 = this.q;
        long j5 = this.g;
        return ((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ this.n;
    }

    public final String toString() {
        String str = this.e;
        long j = this.o;
        long j2 = this.p;
        long j3 = this.f;
        long j4 = this.q;
        long j5 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        boolean z4 = this.r;
        boolean z5 = this.s;
        boolean z6 = this.k;
        boolean z7 = this.t;
        boolean z8 = this.l;
        boolean z9 = this.u;
        boolean z10 = this.m;
        int i = this.n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 653);
        sb.append("AdsModuleConfig{getAppVersionForAds=");
        sb.append(str);
        sb.append(", getMidrollAdsFreqCapMillis=");
        sb.append(j);
        sb.append(", getImmediateAdExpireTimeMillis=");
        sb.append(j2);
        sb.append(", getAdsTimeoutMillis=");
        sb.append(j3);
        sb.append(", getAdWarningMillis=");
        sb.append(j4);
        sb.append(", getMidrollPrefetchMillis=");
        sb.append(j5);
        sb.append(", trackUserPresence=");
        sb.append(z);
        sb.append(", shouldAllowInnertubeCaching=");
        sb.append(z2);
        sb.append(", shouldEmitAdClickthroughReportedEvent=");
        sb.append(z3);
        sb.append(", shouldPreventYoutubeHeaders=");
        sb.append(z4);
        sb.append(", shouldPreventAdsHeaders=");
        sb.append(z5);
        sb.append(", shouldBlockAds=");
        sb.append(z6);
        sb.append(", shouldBlockOfflineAds=");
        sb.append(z7);
        sb.append(", shouldGenerateDebugSlotIds=");
        sb.append(z8);
        sb.append(", shouldGenerateDebugLayoutIds=");
        sb.append(z9);
        sb.append(", shouldSendAdsClientMonitoringLogsAsync=");
        sb.append(z10);
        sb.append(", getAdsClientMonitoringDelayLogMs=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
