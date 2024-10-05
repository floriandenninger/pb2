package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oyu implements oyw {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public oyu(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // defpackage.oyw
    public final long[] a(long[] jArr) {
        if (jArr == null) {
            jArr = new long[2];
        }
        long min = Math.min(this.b, (SystemClock.elapsedRealtime() * 1000) - this.c);
        long j = this.a;
        long j2 = this.d;
        if (j2 != -1) {
            j = Math.max(j, min - j2);
        }
        jArr[0] = j;
        jArr[1] = min;
        return jArr;
    }

    @Override // defpackage.oyw
    public final long[] b() {
        long[] a = a(null);
        a[0] = a[0] / 1000;
        a[1] = a[1] / 1000;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oyu oyuVar = (oyu) obj;
            if (oyuVar.a == this.a && oyuVar.b == this.b && oyuVar.c == this.c && oyuVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d);
    }
}
