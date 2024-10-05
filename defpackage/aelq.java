package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelq {
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final ammv e;
    private final long f;
    private final ammv g;

    public aelq(String str, int i, long j, long j2, String str2, ammv ammvVar, ammv ammvVar2) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
        this.b = i;
        this.c = j;
        this.f = j2;
        if (str2 != null) {
            this.d = str2;
            this.g = ammvVar;
            this.e = ammvVar2;
            return;
        }
        throw new NullPointerException("Null xtags");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aelq) {
            aelq aelqVar = (aelq) obj;
            if (this.a.equals(aelqVar.a) && this.b == aelqVar.b && this.c == aelqVar.c && this.f == aelqVar.f && this.d.equals(aelqVar.d) && this.g.equals(aelqVar.g) && this.e.equals(aelqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        long j = this.c;
        long j2 = this.f;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        long j = this.c;
        long j2 = this.f;
        String str2 = this.d;
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.e);
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 169 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("OnesieStreamMetadata{videoId=");
        sb.append(str);
        sb.append(", itag=");
        sb.append(i);
        sb.append(", lastModifiedTime=");
        sb.append(j);
        sb.append(", seqNum=");
        sb.append(j2);
        sb.append(", xtags=");
        sb.append(str2);
        sb.append(", expectedMediaSizeBytes=");
        sb.append(valueOf);
        sb.append(", expectedTimeRange=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public aelq() {
    }
}
