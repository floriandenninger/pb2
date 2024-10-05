package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzc {
    public final double a;
    public final int b;

    private rzc(int i, double d) {
        this.b = i;
        this.a = d;
    }

    public static rzc a() {
        return new rzc(1, 0.0d);
    }

    public static rzc b() {
        return c(1);
    }

    public static rzc c(int i) {
        return new rzc(5, rzm.e(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rzc rzcVar = (rzc) obj;
        return Double.compare(rzcVar.a, this.a) == 0 && this.b == rzcVar.b;
    }

    public final int hashCode() {
        int i = this.b;
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }
}
