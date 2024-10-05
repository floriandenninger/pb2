package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afex {
    public final int a;
    public final int b;

    public afex() {
    }

    public afex(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afex a(int i, int i2) {
        return new afex(i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afex) {
            afex afexVar = (afex) obj;
            if (this.a == afexVar.a && this.b == afexVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Size{width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
