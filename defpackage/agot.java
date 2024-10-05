package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agot {
    public int a;
    private Boolean b;
    private amru c;

    public final agou a() {
        Boolean bool;
        int i = this.a;
        if (i == 0 || (bool = this.b) == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" orchestrationActionResult");
            }
            if (this.b == null) {
                sb.append(" retryable");
            }
            if (this.c == null) {
                sb.append(" additionalActions");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        agou agouVar = new agou(i, bool.booleanValue(), this.c);
        amkq.E(agouVar.f != 1);
        return agouVar;
    }

    public final void b(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null additionalActions");
        }
        this.c = amruVar;
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }
}
