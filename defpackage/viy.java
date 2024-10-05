package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class viy {
    public final String a;
    public final Class b;

    public viy(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public static viy a(String str) {
        return new viy(str, Boolean.class);
    }

    public static viy b(String str) {
        return new viy(str, Integer.class);
    }

    public static viy c(String str) {
        return new viy(str, String.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof viy) {
            viy viyVar = (viy) obj;
            if (this.b == viyVar.b && this.a.equals(viyVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
