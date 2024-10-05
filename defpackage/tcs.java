package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcs {
    public final Long a;
    public final Long b;
    public final int c;
    public final amrz d;
    public final boolean e;

    public tcs() {
    }

    public tcs(Long l, Long l2, int i, amrz amrzVar, boolean z) {
        this.a = l;
        this.b = l2;
        this.c = i;
        this.d = amrzVar;
        this.e = z;
    }

    public static tcr a() {
        tcr tcrVar = new tcr();
        tcrVar.c = false;
        tcrVar.c(0);
        return tcrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tcs) {
            tcs tcsVar = (tcs) obj;
            Long l = this.a;
            if (l != null ? l.equals(tcsVar.a) : tcsVar.a == null) {
                Long l2 = this.b;
                if (l2 != null ? l2.equals(tcsVar.b) : tcsVar.b == null) {
                    if (this.c == tcsVar.c && this.d.equals(tcsVar.d) && this.e == tcsVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        int length = "null".length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = "null".length();
        StringBuilder sb = new StringBuilder(length + 158 + length2 + length3 + length4 + "null".length() + String.valueOf(valueOf3).length());
        sb.append("HerrevadReport{latencyMicros=");
        sb.append("null");
        sb.append(", downloadMicros=");
        sb.append(valueOf);
        sb.append(", downloadBytes=");
        sb.append(valueOf2);
        sb.append(", uploadMicros=");
        sb.append("null");
        sb.append(", uploadBytes=");
        sb.append("null");
        sb.append(", measurementType=");
        sb.append(i);
        sb.append(", customParams=");
        sb.append(valueOf3);
        sb.append(", noConnectivity=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ (-721379959)) * 1000003;
        Long l2 = this.b;
        return ((((((hashCode ^ (l2 != null ? l2.hashCode() : 0)) * 583896283) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }
}
