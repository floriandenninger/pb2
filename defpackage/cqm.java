package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqm {
    private static final cql e = new cqk();
    public final Object a;
    public final cql b;
    public final String c;
    public volatile byte[] d;

    private cqm(String str, Object obj, cql cqlVar) {
        did.ar(str);
        this.c = str;
        this.a = obj;
        did.ap(cqlVar);
        this.b = cqlVar;
    }

    public static cqm a(String str, Object obj, cql cqlVar) {
        return new cqm(str, obj, cqlVar);
    }

    public static cqm b(String str) {
        return new cqm(str, null, e);
    }

    public static cqm c(String str, Object obj) {
        return new cqm(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqm) {
            return this.c.equals(((cqm) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Option{key='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
