package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexl extends pou implements aewk {
    static final Integer a = 0;
    static final Integer b = 0;
    static final long c = TimeUnit.MILLISECONDS.toMicros(1);
    final pnd e;
    final long f;
    final long g;
    final long h;
    final long i;
    final long j;
    final long k;
    final long l;
    final long m;
    final boolean n;
    final long o;
    final long p;
    final long q;
    final int r;
    private final aquy s;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aexl(long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, boolean r45, int r46, defpackage.pnd r47, defpackage.aquy r48) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexl.<init>(long, long, long, long, long, long, long, long, long, long, long, boolean, int, pnd, aquy):void");
    }

    static String m(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "POST_LIVE" : "LIVE_ENDED" : "LIVE_ONGOING";
    }

    public static String n(long j) {
        return j == -9223372036854775807L ? "UNSET" : String.valueOf(pts.u(j));
    }

    private static void o(boolean z, String str) {
        if (z) {
            return;
        }
        afid.b(afic.MFL, "Illegal Timeline parameter(s): %s", str);
        throw new aexk(str);
    }

    @Override // defpackage.pou
    public final pos a(int i, pos posVar, boolean z) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        posVar.e(z ? a : null, z ? b : null, this.l, -this.j);
        return posVar;
    }

    @Override // defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        if (i == 0) {
            potVar.e(pot.a, this.e, pts.u(this.o), pts.u(this.p), this.n, this.r == 1 && this.i == -1, this.e.c, this.q, aear.u(this.k, this.j), Math.max(this.j, 0L));
            return potVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.pou
    public final int d(Object obj) {
        return obj != b ? -1 : 0;
    }

    @Override // defpackage.pou
    public final boolean equals(Object obj) {
        if (obj instanceof aexl) {
            aexl aexlVar = (aexl) obj;
            if (this.j == aexlVar.j && this.k == aexlVar.k && this.l == aexlVar.l && this.o == aexlVar.o && this.p == aexlVar.p && this.q == aexlVar.q && this.n == aexlVar.n && amkq.b(this.e, aexlVar.e) && this.r == aexlVar.r && amkq.b(this.s, aexlVar.s)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pou
    public final int g() {
        return 1;
    }

    @Override // defpackage.pou
    public final int h() {
        return 1;
    }

    @Override // defpackage.pou
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.j), Long.valueOf(this.k), Long.valueOf(this.l), Long.valueOf(this.o), Long.valueOf(this.p), Long.valueOf(this.q), Boolean.valueOf(this.n), this.e, Integer.valueOf(this.r), this.s});
    }

    @Override // defpackage.pou
    public final Object i(int i) {
        if (i == 0) {
            return b;
        }
        throw new IndexOutOfBoundsException();
    }

    public final long l() {
        return (this.r == 1 && this.i == -1) ? this.f + this.m : this.k;
    }

    public final String toString() {
        String format;
        pot y = y(0, new pot());
        Locale locale = Locale.US;
        Object[] objArr = new Object[13];
        objArr[0] = Boolean.valueOf(this.n);
        double d = this.j;
        Double.isNaN(d);
        objArr[1] = Double.valueOf(d / 1000000.0d);
        double d2 = this.k;
        Double.isNaN(d2);
        objArr[2] = Double.valueOf(d2 / 1000000.0d);
        double d3 = this.f;
        Double.isNaN(d3);
        objArr[3] = Double.valueOf(d3 / 1000000.0d);
        objArr[4] = Long.valueOf(this.h);
        objArr[5] = Long.valueOf(this.i);
        objArr[6] = Long.valueOf(this.g);
        String str = "TIME_UNSET";
        if (this.o == -9223372036854775807L) {
            format = "TIME_UNSET";
        } else {
            Locale locale2 = Locale.US;
            double d4 = this.o;
            Double.isNaN(d4);
            format = String.format(locale2, "%.1f sec", Double.valueOf(d4 / 1000000.0d));
        }
        objArr[7] = format;
        if (this.p != -9223372036854775807L) {
            Locale locale3 = Locale.US;
            double d5 = this.p;
            Double.isNaN(d5);
            str = String.format(locale3, "%.1f sec", Double.valueOf(d5 / 1000000.0d));
        }
        objArr[8] = str;
        double d6 = y.q;
        Double.isNaN(d6);
        objArr[9] = Double.valueOf(d6 / 1000000.0d);
        double d7 = y.n;
        Double.isNaN(d7);
        objArr[10] = Double.valueOf(d7 / 1000000.0d);
        double d8 = y.m;
        Double.isNaN(d8);
        objArr[11] = Double.valueOf(d8 / 1000000.0d);
        objArr[12] = m(this.r);
        return String.format(locale, "ManifestlessLiveTimeline (seekable = %b, windowMinMediaTime = %.1f sec, windowMaxMediaTime = %.1f sec, maxMediaTime = %.1f sec, minDvrSequence = %d, maxDvrSequence = %d, maxSequence = %d, utcOffset = %s, windowStartUtc = %s, window.positionInFirstPeriod = %.1f sec, window.duration = %.1f sec, window.defaultPosition = %.1f sec, steamState = %s )", objArr);
    }

    @Override // defpackage.aewk
    public final long A(long j) {
        if (j != 0 && j != -9223372036854775807L && j <= l()) {
            if (j >= (this.h != -1 ? this.j : Math.max(this.j - this.m, c))) {
                long j2 = this.h;
                if (j2 != -1 && j == this.j) {
                    return j2;
                }
                int i = this.r;
                if (i == 3 && j2 == -1) {
                    return j / this.m;
                }
                long j3 = this.k;
                long j4 = this.m;
                if (j > j3 - j4) {
                    long j5 = this.i;
                    if (j5 != -1) {
                        return j5;
                    }
                    if (i == 2) {
                        return this.g;
                    }
                }
                double d = this.f - j;
                double d2 = j4;
                Double.isNaN(d);
                Double.isNaN(d2);
                long max = Math.max(this.g - Math.max((long) Math.ceil(d / d2), 0L), 0L);
                long j6 = this.h;
                if (j6 != -1) {
                    max = Math.max(max, j6);
                }
                long j7 = this.i;
                return j7 != -1 ? Math.min(max, j7) : max;
            }
        }
        return -1L;
    }
}
