package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class owt {
    private final String a = "proto";

    private owt() {
    }

    public static owt a() {
        return new owt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof owt) {
            return this.a.equals(((owt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("Encoding{name=\"");
        sb.append(str);
        sb.append("\"}");
        return sb.toString();
    }
}
