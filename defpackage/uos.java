package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uos {
    public int a;
    public uor b;

    public final uot a() {
        uor uorVar;
        int i = this.a;
        if (i == 0 || (uorVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" enablement");
            }
            if (this.b == null) {
                sb.append(" metricExtensionProvider");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uot(i, uorVar);
    }

    public final void b(boolean z) {
        this.a = true != z ? 2 : 3;
    }
}
