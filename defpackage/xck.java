package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xck {
    public final String a;

    public xck() {
    }

    public static xck a() {
        return new xck("");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xck) {
            return this.a.equals(((xck) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append("AdVideoPlaybackContextModel{adVideoCpn=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public xck(String str) {
        if (str == null) {
            throw new NullPointerException("Null adVideoCpn");
        }
        this.a = str;
    }
}
