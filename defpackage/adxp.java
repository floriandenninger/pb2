package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxp {
    public final long a;
    final long b;
    public final long c;
    public final long d;
    public final int e;

    public adxp(long j, int i) {
        this.a = j;
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = i;
    }

    public adxp(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adxp)) {
            return false;
        }
        adxp adxpVar = (adxp) obj;
        return this.a == adxpVar.a && this.b == adxpVar.b && this.c == adxpVar.c && this.d == adxpVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }
}
