package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcz implements cqi {
    private final Object b;

    public dcz(Object obj) {
        did.ap(obj);
        this.b = obj;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof dcz) {
            return this.b.equals(((dcz) obj).b);
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ObjectKey{object=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
