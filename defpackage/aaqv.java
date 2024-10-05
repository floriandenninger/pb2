package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqv {
    public final Long a;
    public final int b;
    public final int c;
    public final amru d;
    public final aarx e;
    private final String f;

    public aaqv() {
    }

    public aaqv(Long l, String str, int i, int i2, amru amruVar, aarx aarxVar) {
        this.a = l;
        this.f = str;
        this.b = i;
        this.c = i2;
        this.d = amruVar;
        this.e = aarxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaqv) {
            aaqv aaqvVar = (aaqv) obj;
            if (this.a.equals(aaqvVar.a) && this.f.equals(aaqvVar.f) && this.b == aaqvVar.b && this.c == aaqvVar.c && amkq.aV(this.d, aaqvVar.d)) {
                aarx aarxVar = this.e;
                aarx aarxVar2 = aaqvVar.e;
                if (aarxVar != null ? aarxVar.equals(aarxVar2) : aarxVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
        aarx aarxVar = this.e;
        return hashCode ^ (aarxVar == null ? 0 : aarxVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.f;
        int i = this.b;
        int i2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 171 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ExecutedInnerTubeRequestInfo{parsingTimeMillis=");
        sb.append(valueOf);
        sb.append(", rpcName=");
        sb.append(str);
        sb.append(", responseProtoByteSize=");
        sb.append(i);
        sb.append(", retryCount=");
        sb.append(i2);
        sb.append(", networkHealthAnnotations=");
        sb.append(valueOf2);
        sb.append(", networkErrorResponseInfo=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
