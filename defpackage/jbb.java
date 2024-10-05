package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jbb {
    public asra a;
    private fhg b;
    private Boolean c;

    public final jbc a() {
        Boolean bool;
        fhg fhgVar = this.b;
        if (fhgVar == null || (bool = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" playerViewMode");
            }
            if (this.c == null) {
                sb.append(" isEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new jbc(fhgVar, bool.booleanValue(), this.a);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(fhg fhgVar) {
        if (fhgVar == null) {
            throw new NullPointerException("Null playerViewMode");
        }
        this.b = fhgVar;
    }
}
