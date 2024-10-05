package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alea {
    public String a;
    private amsx b;
    private ammv c;

    public alea() {
    }

    public alea(byte[] bArr) {
        this.c = amlr.a;
    }

    public final aleb a() {
        amsx amsxVar;
        String str = this.a;
        if (str == null || (amsxVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" id");
            }
            if (this.b == null) {
                sb.append(" unmetRequirements");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aleb(str, amsxVar, this.c);
    }

    public final void b(ammv ammvVar) {
        if (ammvVar == null) {
            throw new NullPointerException("Null retryTime");
        }
        this.c = ammvVar;
    }

    public final void c(amsx amsxVar) {
        if (amsxVar == null) {
            throw new NullPointerException("Null unmetRequirements");
        }
        this.b = amsxVar;
    }
}
