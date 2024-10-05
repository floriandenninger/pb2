package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vqa {
    public vqb a;
    public amru b;
    private Boolean c;

    public final vqc a() {
        Boolean bool;
        vqb vqbVar = this.a;
        if (vqbVar == null || (bool = this.c) == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" content");
            }
            if (this.c == null) {
                sb.append(" hasMore");
            }
            if (this.b == null) {
                sb.append(" eventLogs");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new vqc(vqbVar, bool.booleanValue(), this.b);
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
