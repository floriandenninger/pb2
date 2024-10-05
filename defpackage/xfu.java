package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfu {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xfu(String str, boolean z, boolean z2, boolean z3) {
        if (str == null) {
            throw new NullPointerException("Null contentCpn");
        }
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfu) {
            xfu xfuVar = (xfu) obj;
            if (this.a.equals(xfuVar.a) && this.b == xfuVar.b && this.c == xfuVar.c && this.d == xfuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 108);
        sb.append("OrganicPlaybackContextModel{contentCpn=");
        sb.append(str);
        sb.append(", isLivePlayback=");
        sb.append(z);
        sb.append(", isOfflinePlayback=");
        sb.append(z2);
        sb.append(", isMdxPlayback=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }

    public xfu() {
    }
}
