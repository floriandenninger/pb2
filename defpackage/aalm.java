package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalm {
    public aakt a;
    private aaku b;
    private aoqa c;

    public final aaln a() {
        aoqa aoqaVar;
        aaku aakuVar = this.b;
        if (aakuVar == null || (aoqaVar = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" metadata");
            }
            if (this.c == null) {
                sb.append(" applicability");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aaln(this.a, aakuVar, aoqaVar);
    }

    public final void b(aoqa aoqaVar) {
        if (aoqaVar == null) {
            throw new NullPointerException("Null applicability");
        }
        this.c = aoqaVar;
    }

    public final void c(aaku aakuVar) {
        if (aakuVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.b = aakuVar;
    }
}
