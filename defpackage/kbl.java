package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kbl {
    public final int a;
    public final asxs b;

    public kbl(int i, asxs asxsVar) {
        this.a = i;
        if (asxsVar == null) {
            throw new NullPointerException("Null videoEntity");
        }
        this.b = asxsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kbl) {
            kbl kblVar = (kbl) obj;
            if (this.a == kblVar.a && this.b.equals(kblVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
        sb.append("SmartDownloadsVideoData{positionIndex=");
        sb.append(i);
        sb.append(", videoEntity=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public kbl() {
    }
}
