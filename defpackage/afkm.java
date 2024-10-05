package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afkm {
    public static final afkm a = new afkm(-1, -1, false);
    public final boolean b;
    public final int c;
    public final int d;

    public afkm(int i, int i2) {
        this(i, i2, false);
    }

    public afkm(int i, int i2, boolean z) {
        this.c = i;
        this.d = i2;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afkm) {
            afkm afkmVar = (afkm) obj;
            if (this.c == afkmVar.c && this.d == afkmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c * 31) + this.d;
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.d;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(29);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("x");
        sb.append(z);
        return sb.toString();
    }
}
