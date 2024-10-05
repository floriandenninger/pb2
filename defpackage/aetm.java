package defpackage;

import android.os.SystemClock;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetm implements oyw {
    final long a;
    final long b;
    final long c = SystemClock.elapsedRealtime() * 1000;
    final boolean d;
    final muf e;

    public aetm(long j, long j2, muf mufVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = j;
        this.b = j2;
        this.e = mufVar;
        this.d = z;
    }

    @Override // defpackage.oyw
    public final long[] a(long[] jArr) {
        if (jArr == null) {
            jArr = new long[2];
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.c;
        jArr[0] = this.d ? this.a + elapsedRealtime : this.a;
        jArr[1] = this.b + elapsedRealtime;
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
        if (!(obj instanceof aetm)) {
            return false;
        }
        aetm aetmVar = (aetm) obj;
        return aetmVar.e == this.e && aetmVar.c == this.c && aetmVar.a == this.a && aetmVar.b == this.b && aetmVar.d == this.d;
    }

    public final int hashCode() {
        return ((((((((int) this.c) + 527) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        long[] a = a(null);
        return String.format(Locale.getDefault(), "SlidingTimeRange [%d, %d]", Long.valueOf(a[0]), Long.valueOf(a[1]));
    }
}
