package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnh {
    public String a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Integer l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;

    public final wni a() {
        Long l;
        String str = this.a;
        if (str == null || (l = this.b) == null || this.c == null || this.d == null || this.e == null || this.f == null || this.m == null || this.n == null || this.o == null || this.p == null || this.q == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" getAppVersionForAds");
            }
            if (this.b == null) {
                sb.append(" getMidrollAdsFreqCapMillis");
            }
            if (this.c == null) {
                sb.append(" getImmediateAdExpireTimeMillis");
            }
            if (this.d == null) {
                sb.append(" getAdsTimeoutMillis");
            }
            if (this.e == null) {
                sb.append(" getAdWarningMillis");
            }
            if (this.f == null) {
                sb.append(" getMidrollPrefetchMillis");
            }
            if (this.m == null) {
                sb.append(" trackUserPresence");
            }
            if (this.n == null) {
                sb.append(" shouldAllowInnertubeCaching");
            }
            if (this.o == null) {
                sb.append(" shouldEmitAdClickthroughReportedEvent");
            }
            if (this.p == null) {
                sb.append(" shouldPreventYoutubeHeaders");
            }
            if (this.q == null) {
                sb.append(" shouldPreventAdsHeaders");
            }
            if (this.g == null) {
                sb.append(" shouldBlockAds");
            }
            if (this.h == null) {
                sb.append(" shouldBlockOfflineAds");
            }
            if (this.i == null) {
                sb.append(" shouldGenerateDebugSlotIds");
            }
            if (this.j == null) {
                sb.append(" shouldGenerateDebugLayoutIds");
            }
            if (this.k == null) {
                sb.append(" shouldSendAdsClientMonitoringLogsAsync");
            }
            if (this.l == null) {
                sb.append(" getAdsClientMonitoringDelayLogMs");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new wni(str, l.longValue(), this.c.longValue(), this.d.longValue(), this.e.longValue(), this.f.longValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.intValue());
    }

    public final void b(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.m = Boolean.valueOf(z);
    }
}
