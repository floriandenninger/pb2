package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvd {
    public final String a;
    public final String b;
    public final int c;
    public final adle d;
    public final int e;

    public acvd() {
    }

    public acvd(String str, int i, String str2, int i2, adle adleVar) {
        this.a = str;
        this.e = i;
        this.b = str2;
        this.c = i2;
        this.d = adleVar;
    }

    public static acvc a() {
        acvc acvcVar = new acvc();
        acvcVar.e(1);
        acvcVar.d(0);
        return acvcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acvd) {
            acvd acvdVar = (acvd) obj;
            if (this.a.equals(acvdVar.a)) {
                int i = this.e;
                int i2 = acvdVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(acvdVar.b) && this.c == acvdVar.c && this.d.equals(acvdVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.e;
        amkq.cU(i);
        return ((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.e;
        String cT = i != 0 ? amkq.cT(i) : "null";
        String str2 = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 114 + cT.length() + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("MdxBackgroundPlaybackRequest{routeId=");
        sb.append(str);
        sb.append(", sessionType=");
        sb.append(cT);
        sb.append(", deviceName=");
        sb.append(str2);
        sb.append(", timeoutSeconds=");
        sb.append(i2);
        sb.append(", playbackDescriptor=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
