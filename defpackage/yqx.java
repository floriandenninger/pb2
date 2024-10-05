package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yqx {
    public Boolean a;
    private Integer b;
    private Integer c;
    private Boolean d;

    public final yry a() {
        Integer num = this.b;
        if (num == null || this.c == null || this.d == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" connectionTimeoutMs");
            }
            if (this.c == null) {
                sb.append(" readTimeoutMs");
            }
            if (this.d == null) {
                sb.append(" installSecureRequestEnforcer");
            }
            if (this.a == null) {
                sb.append(" followRedirects");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new yry(num.intValue(), this.c.intValue(), this.d.booleanValue(), this.a.booleanValue());
    }

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }
}
