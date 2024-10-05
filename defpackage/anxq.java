package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxq {
    public String a;
    public String b;
    public String c;
    public String d;
    private Long e;
    private Long f;
    private int g;

    public anxq() {
    }

    public anxq(anxr anxrVar) {
        this.a = anxrVar.a;
        this.g = anxrVar.g;
        this.b = anxrVar.b;
        this.c = anxrVar.c;
        this.e = Long.valueOf(anxrVar.d);
        this.f = Long.valueOf(anxrVar.e);
        this.d = anxrVar.f;
    }

    public final anxr a() {
        Long l;
        int i = this.g;
        if (i == 0 || (l = this.e) == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == 0) {
                sb.append(" registrationStatus");
            }
            if (this.e == null) {
                sb.append(" expiresInSecs");
            }
            if (this.f == null) {
                sb.append(" tokenCreationEpochInSecs");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new anxr(this.a, i, this.b, this.c, l.longValue(), this.f.longValue(), this.d);
    }

    public final void b(long j) {
        this.e = Long.valueOf(j);
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.g = i;
    }

    public final void d(long j) {
        this.f = Long.valueOf(j);
    }
}
