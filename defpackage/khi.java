package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class khi {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public khi(int i, String str, boolean z, boolean z2) {
        this.d = i;
        if (str == null) {
            throw new NullPointerException("Null cpn");
        }
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof khi) {
            khi khiVar = (khi) obj;
            if (this.d == khiVar.d && this.a.equals(khiVar.a) && this.b == khiVar.b && this.c == khiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        String num = Integer.toString(this.d - 1);
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(num.length() + 95 + str.length());
        sb.append("VideoStageEventContext{audioRouteType=");
        sb.append(num);
        sb.append(", cpn=");
        sb.append(str);
        sb.append(", isOfflinePlayback=");
        sb.append(z);
        sb.append(", backgroundability=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public khi() {
    }
}
