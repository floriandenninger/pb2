package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcf {
    public static final xcf a = a(0, 0, 0, false, amlr.a, amlr.a);
    public final int b;
    public final int c;
    public final boolean d;
    public final ammv e;
    public final ammv f;
    private final int g;

    public xcf() {
    }

    public xcf(int i, int i2, int i3, boolean z, ammv ammvVar, ammv ammvVar2) {
        this.b = i;
        this.c = i2;
        this.g = i3;
        this.d = z;
        this.e = ammvVar;
        this.f = ammvVar2;
    }

    public static xcf a(int i, int i2, int i3, boolean z, ammv ammvVar, ammv ammvVar2) {
        return new xcf(i, i2, i3, z, ammvVar, ammvVar2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xcf)) {
            return false;
        }
        xcf xcfVar = (xcf) obj;
        return this.b == xcfVar.b && this.c == xcfVar.c && this.g == xcfVar.g && this.d == xcfVar.d && this.e.equals(xcfVar.e) && this.f.equals(xcfVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.g), Boolean.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.g;
        StringBuilder sb = new StringBuilder(54);
        sb.append("AdCountMetadata[");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }
}
