package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmf {
    public Boolean a;
    public Boolean b;
    public Boolean c;

    public tmf() {
    }

    public tmf(kii kiiVar) {
        this.b = Boolean.valueOf(kiiVar.a);
        this.c = Boolean.valueOf(kiiVar.b);
        this.a = Boolean.valueOf(kiiVar.c);
    }

    public final kii a() {
        Boolean bool = this.b;
        if (bool == null || this.c == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" isControlsOverlayVisible");
            }
            if (this.c == null) {
                sb.append(" isChangeAnimated");
            }
            if (this.a == null) {
                sb.append(" shouldCancelHiding");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new kii(bool.booleanValue(), this.c.booleanValue(), this.a.booleanValue());
    }

    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
