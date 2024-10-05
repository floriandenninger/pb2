package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bgq {
    public long a;
    public long b;
    public final boolean[] c = new boolean[15];
    private long d;
    private long e;
    private long f;
    private long g;
    private int h;

    public static int a(long j) {
        return (int) (j % 15);
    }

    public final long b() {
        long j = this.g;
        if (j == 0) {
            return 0L;
        }
        return this.b / j;
    }

    public final void c(long j) {
        long j2 = this.a;
        if (j2 == 0) {
            this.d = j;
        } else if (j2 == 1) {
            long j3 = j - this.d;
            this.e = j3;
            this.b = j3;
            this.g = 1L;
        } else {
            long j4 = j - this.f;
            int a = a(j2);
            if (Math.abs(j4 - this.e) <= 1000000) {
                this.g++;
                this.b += j4;
                boolean[] zArr = this.c;
                if (zArr[a]) {
                    zArr[a] = false;
                    this.h--;
                }
            } else {
                boolean[] zArr2 = this.c;
                if (!zArr2[a]) {
                    zArr2[a] = true;
                    this.h++;
                }
            }
        }
        this.a++;
        this.f = j;
    }

    public final void d() {
        this.a = 0L;
        this.g = 0L;
        this.b = 0L;
        this.h = 0;
        Arrays.fill(this.c, false);
    }

    public final boolean e() {
        return this.a > 15 && this.h == 0;
    }
}
