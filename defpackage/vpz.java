package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpz {
    public final amru a;
    public final int b;

    public vpz(amru amruVar, int i) {
        if (amruVar == null) {
            throw new NullPointerException("Null sections");
        }
        this.a = amruVar;
        this.b = i;
    }

    public static vpz a(int i) {
        return new vpz(amru.q(), i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vpz) {
            vpz vpzVar = (vpz) obj;
            if (amkq.aV(this.a, vpzVar.a) && this.b == vpzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        vls.b(i);
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a = vls.a(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + a.length());
        sb.append("GooglePhotosResult{sections=");
        sb.append(valueOf);
        sb.append(", state=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }

    public vpz() {
    }
}
