package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cry implements cqi {
    private final cqi b;
    private final cqi c;

    public cry(cqi cqiVar, cqi cqiVar2) {
        this.b = cqiVar;
        this.c = cqiVar2;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof cry) {
            cry cryVar = (cry) obj;
            if (this.b.equals(cryVar.b) && this.c.equals(cryVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("DataCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
