package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zck {
    public final zbe a;

    public zck() {
    }

    public zck(zbe zbeVar) {
        this.a = zbeVar;
    }

    public static zck a(zbe zbeVar) {
        return new zck(zbeVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zck) {
            return this.a.equals(((zck) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("WindowInsets{insets=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
