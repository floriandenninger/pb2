package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbi {
    public final String a;

    public anbi(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbi) {
            return this.a.equals(((anbi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1809505057;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 20);
        sb.append("TrustedResourceUrl{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
