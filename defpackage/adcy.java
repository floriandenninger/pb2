package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcy {
    private Boolean a;
    private aibu b;

    public final adcz a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" isUnselectUserInitiated");
            }
            if (this.b == null) {
                sb.append(" queueTransferType");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adcz(bool.booleanValue(), this.b);
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(aibu aibuVar) {
        if (aibuVar == null) {
            throw new NullPointerException("Null queueTransferType");
        }
        this.b = aibuVar;
    }
}
