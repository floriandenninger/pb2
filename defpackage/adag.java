package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adag {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;

    public final adah a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null || this.c == null || this.d == null || this.e == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" isEnabled");
            }
            if (this.b == null) {
                sb.append(" shouldDisplayPrompt");
            }
            if (this.c == null) {
                sb.append(" isRateLimited");
            }
            if (this.d == null) {
                sb.append(" shouldTreatIgnoreLikeDismiss");
            }
            if (this.e == null) {
                sb.append(" shouldUseNewDismissTextCopy");
            }
            if (this.f == null) {
                sb.append(" shouldUseNewTitleDetailsTextCopy");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adah(bool.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue());
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void e(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void g(boolean z) {
        this.f = Boolean.valueOf(z);
    }
}
