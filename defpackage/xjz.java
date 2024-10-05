package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjz {
    private Boolean a;
    private Boolean b;
    private CharSequence c;

    public final xka a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" learnMoreCtaHidden");
            }
            if (this.b == null) {
                sb.append(" learnMoreCtaEnabled");
            }
            if (this.c == null) {
                sb.append(" learnMoreText");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xka(bool.booleanValue(), this.b.booleanValue(), this.c);
    }

    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void d(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null learnMoreText");
        }
        this.c = charSequence;
    }
}
