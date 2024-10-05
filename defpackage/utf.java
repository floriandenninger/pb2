package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utf {
    public Boolean a;
    public ammv b;
    public int c;

    public utf() {
    }

    public utf(byte[] bArr) {
        this.b = amlr.a;
    }

    public final utg a() {
        Boolean bool;
        int i = this.c;
        if (i == 0 || (bool = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == 0) {
                sb.append(" enablement");
            }
            if (this.a == null) {
                sb.append(" manualCapture");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new utg(i, bool.booleanValue(), this.b);
    }

    public final void b(boolean z) {
        this.c = true != z ? 2 : 3;
    }
}
