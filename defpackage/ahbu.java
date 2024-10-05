package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahbu {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Integer d;
    public Integer e;
    private Boolean f;
    private zih g;
    private Boolean h;

    public final ahbv a() {
        Boolean bool = this.f;
        if (bool == null || this.a == null || this.b == null || this.c == null || this.d == null || this.g == null || this.e == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" onesieEnabled");
            }
            if (this.a == null) {
                sb.append(" enableVss2StatsTracking");
            }
            if (this.b == null) {
                sb.append(" enableRawCcSupport");
            }
            if (this.c == null) {
                sb.append(" enableLegacyHeartbeatFlow");
            }
            if (this.d == null) {
                sb.append(" backgroundNotificationIconResourceId");
            }
            if (this.g == null) {
                sb.append(" referringAppProvider");
            }
            if (this.e == null) {
                sb.append(" maximumConsecutiveSkippedUnplayableVideos");
            }
            if (this.h == null) {
                sb.append(" enableVss2UserPresenceTracking");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ahbv(bool.booleanValue(), this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.intValue(), this.g, this.e.intValue(), this.h.booleanValue());
    }

    public final void b() {
        this.h = true;
    }

    public final void c(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void d(zih zihVar) {
        if (zihVar == null) {
            throw new NullPointerException("Null referringAppProvider");
        }
        this.g = zihVar;
    }
}
