package defpackage;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class q extends Number implements Comparable {
    private static final long serialVersionUID = -4756200506571685661L;

    @Deprecated
    public final double a;

    @Deprecated
    public final int b;

    @Deprecated
    public final int c;

    @Deprecated
    public final long d;

    @Deprecated
    public final long e;

    @Deprecated
    public final long f;

    @Deprecated
    public final boolean g;

    @Deprecated
    public q(double d, int i) {
        int round;
        if (i == 0) {
            round = 0;
        } else {
            double d2 = d < 0.0d ? -d : d;
            int pow = (int) Math.pow(10.0d, i);
            double d3 = pow;
            Double.isNaN(d3);
            round = (int) (Math.round(d2 * d3) % pow);
        }
        long j = round;
        boolean z = d < 0.0d;
        this.g = z;
        this.a = z ? -d : d;
        this.b = i;
        this.d = j;
        this.f = d > 1.0E18d ? 1000000000000000000L : (long) d;
        if (j == 0) {
            this.e = 0L;
            this.c = 0;
        } else {
            int i2 = i;
            while (j % 10 == 0) {
                j /= 10;
                i2--;
            }
            this.e = j;
            this.c = i2;
        }
        Math.pow(10.0d, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new NotSerializableException();
    }

    @Override // java.lang.Comparable
    @Deprecated
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        q qVar = (q) obj;
        long j = this.f;
        long j2 = qVar.f;
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        }
        double d = this.a;
        double d2 = qVar.a;
        if (d != d2) {
            return d >= d2 ? 1 : -1;
        }
        int i = this.b;
        int i2 = qVar.b;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        long j3 = this.d - qVar.d;
        if (j3 != 0) {
            return j3 >= 0 ? 1 : -1;
        }
        return 0;
    }

    @Override // java.lang.Number
    @Deprecated
    public final double doubleValue() {
        return this.g ? -this.a : this.a;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b && this.d == qVar.d;
    }

    @Override // java.lang.Number
    @Deprecated
    public final float floatValue() {
        return (float) this.a;
    }

    @Deprecated
    public final int hashCode() {
        return (int) (this.d + ((this.b + ((int) (this.a * 37.0d))) * 37));
    }

    @Override // java.lang.Number
    @Deprecated
    public final int intValue() {
        return (int) this.f;
    }

    @Override // java.lang.Number
    @Deprecated
    public final long longValue() {
        return this.f;
    }

    @Deprecated
    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(14);
        sb.append("%.");
        sb.append(i);
        sb.append("f");
        return String.format(sb.toString(), Double.valueOf(this.a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r4) {
        /*
            r3 = this;
            double r0 = java.lang.Double.parseDouble(r4)
            java.lang.String r4 = r4.trim()
            r2 = 46
            int r2 = r4.indexOf(r2)
            int r2 = r2 + 1
            if (r2 != 0) goto L14
            r4 = 0
            goto L19
        L14:
            int r4 = r4.length()
            int r4 = r4 - r2
        L19:
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.<init>(java.lang.String):void");
    }
}
