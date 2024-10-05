package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjw {
    public final xjo a;

    public xjw() {
    }

    public xjw(xjo xjoVar) {
        this.a = xjoVar;
    }

    public static xjv a() {
        xjv xjvVar = new xjv();
        xjvVar.a = xjo.a;
        return xjvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xjw) {
            return this.a.equals(((xjw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("AdTitleOverlayState{adOverlayMetadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
