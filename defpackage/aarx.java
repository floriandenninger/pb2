package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aarx {
    public final int a;
    public final amru b;

    public aarx() {
    }

    public aarx(int i, amru amruVar) {
        this.a = i;
        this.b = amruVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aarx) {
            aarx aarxVar = (aarx) obj;
            if (this.a == aarxVar.a && amkq.aV(this.b, aarxVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
        sb.append("NetworkErrorResponseInfo{rpcStatusCode=");
        sb.append(i);
        sb.append(", rpcTypeUrls=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
