package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gsd {
    public final ammv a;
    public final boolean b;

    public gsd(ammv ammvVar, boolean z) {
        if (ammvVar == null) {
            throw new NullPointerException("Null snapshot");
        }
        this.a = ammvVar;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gsd a(ammv ammvVar, boolean z) {
        return new gsd(ammvVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gsd) {
            gsd gsdVar = (gsd) obj;
            if (this.a.equals(gsdVar.a) && this.b == gsdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AsyncResolutionResult{snapshot=");
        sb.append(valueOf);
        sb.append(", shouldCompleteResolve=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public gsd() {
    }
}
