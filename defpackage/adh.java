package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adh {
    public final String a;
    private final Class b;

    public adh(String str, Class cls) {
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
    }

    public static adh a(String str, Class cls) {
        return new adh(str, cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adh) {
            adh adhVar = (adh) obj;
            if (this.a.equals(adhVar.a) && this.b.equals(adhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + ((Object) null) + "}";
    }

    public adh() {
    }
}
