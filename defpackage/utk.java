package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utk {
    public Integer a;
    public Float b;
    public ammv c;
    public int d;

    public utk() {
    }

    public utk(byte[] bArr) {
        this.c = amlr.a;
    }

    public final utl a() {
        Integer num;
        int i = this.d;
        if (i == 0 || (num = this.a) == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == 0) {
                sb.append(" enablement");
            }
            if (this.a == null) {
                sb.append(" rateLimitPerSecond");
            }
            if (this.b == null) {
                sb.append(" samplingProbability");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        utl utlVar = new utl(i, num.intValue(), this.b.floatValue(), this.c);
        amkq.O(utlVar.a >= 0, "Rate limit per second must be >= 0");
        float f = utlVar.b;
        amkq.O(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
        return utlVar;
    }

    public final void b(boolean z) {
        this.d = true != z ? 2 : 3;
    }
}
