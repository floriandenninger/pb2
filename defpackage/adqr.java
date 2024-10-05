package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqr {
    public adgf a;
    public adgj b;
    public adgg c;
    public adkt d;
    public String e;
    private Boolean f;

    public adqr() {
    }

    public adqr(adqs adqsVar) {
        this.a = adqsVar.a;
        this.b = adqsVar.b;
        this.c = adqsVar.c;
        this.f = Boolean.valueOf(adqsVar.d);
        this.d = adqsVar.e;
        this.e = adqsVar.f;
    }

    public final adqs a() {
        Boolean bool = this.f;
        if (bool == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" userInitiated");
            }
            if (this.d == null) {
                sb.append(" loungeTokenProvider");
            }
            if (this.e == null) {
                sb.append(" magmaKey");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adqs(this.a, this.b, this.c, bool.booleanValue(), this.d, this.e);
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }
}
