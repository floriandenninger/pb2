package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkp {
    private Long a;
    private Long b;
    private Long c;
    private Boolean d;

    public final adkq a() {
        Long l = this.a;
        if (l == null || this.b == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" lastConnectedTimeMs");
            }
            if (this.b == null) {
                sb.append(" firstConnectedTimeMs");
            }
            if (this.c == null) {
                sb.append(" recoveryExpirationTimeMs");
            }
            if (this.d == null) {
                sb.append(" shouldSkipRecoveryExpiration");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adkq(l.longValue(), this.b.longValue(), this.c.longValue(), this.d.booleanValue());
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }

    public final void c(long j) {
        this.a = Long.valueOf(j);
    }

    public final void d(long j) {
        this.c = Long.valueOf(j);
    }

    public final void e(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
