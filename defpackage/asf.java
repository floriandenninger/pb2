package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asf implements plg {
    public static final plf a = ppn.b;
    public final int b;
    public final int c;
    public final int d;
    public final byte[] e;
    private int f;

    public asf(int i, int i2, int i3, byte[] bArr) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bArr;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String c(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asf asfVar = (asf) obj;
            if (this.b == asfVar.b && this.c == asfVar.c && this.d == asfVar.d && Arrays.equals(this.e, asfVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.e);
        this.f = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        boolean z = this.e != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
