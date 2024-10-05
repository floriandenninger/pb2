package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anuu {
    public final Class a;
    public final int b;
    private final int c;

    public anuu(Class cls, int i, int i2) {
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    public static anuu a(Class cls) {
        return new anuu(cls, 0, 0);
    }

    public static anuu b(Class cls) {
        return new anuu(cls, 0, 1);
    }

    public static anuu c(Class cls) {
        return new anuu(cls, 1, 0);
    }

    public final boolean d() {
        return this.c == 0;
    }

    public final boolean e() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anuu) {
            anuu anuuVar = (anuu) obj;
            if (this.a == anuuVar.a && this.b == anuuVar.b && this.c == anuuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }
}
