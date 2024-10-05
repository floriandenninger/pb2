package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqv {
    public final Optional a;
    public final boolean b;

    public gqv(Optional optional, boolean z) {
        if (optional == null) {
            throw new NullPointerException("Null downloadedVideo");
        }
        this.a = optional;
        this.b = z;
    }

    public static gqv a(Optional optional, boolean z) {
        return new gqv(optional, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqv) {
            gqv gqvVar = (gqv) obj;
            if (this.a.equals(gqvVar.a) && this.b == gqvVar.b) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("AsyncResolutionResult{downloadedVideo=");
        sb.append(valueOf);
        sb.append(", shouldCompleteResolve=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public gqv() {
    }
}
