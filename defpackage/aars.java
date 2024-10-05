package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aars {
    public zfi a;
    public zfo b;
    private ammy c;

    public final aart a() {
        zfo zfoVar;
        ammy ammyVar = this.c;
        if (ammyVar == null || (zfoVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" isErrorRetryable");
            }
            if (this.b == null) {
                sb.append(" exponentialBackoff");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aart(ammyVar, this.a, zfoVar);
    }

    public final void b(ammy ammyVar) {
        if (ammyVar == null) {
            throw new NullPointerException("Null isErrorRetryable");
        }
        this.c = ammyVar;
    }
}
