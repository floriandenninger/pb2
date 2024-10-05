package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyc {
    public static final amru a = amru.s(ovw.TRACK_TYPE_AUDIO, ovw.TRACK_TYPE_VIDEO);

    public static double a(long j) {
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            return -1.0d;
        }
        double d = j;
        Double.isNaN(d);
        return d / 1000.0d;
    }

    public static double b(long j) {
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            return -1.0d;
        }
        double d = j;
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    public static long c(double d) {
        return (long) (d * 1000000.0d);
    }

    public static ovw d(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return ovw.TRACK_TYPE_VIDEO;
            }
            if (i != 3) {
                return null;
            }
        }
        return ovw.TRACK_TYPE_AUDIO;
    }

    public static int e(int i) {
        return i == 5 ? 3 : 0;
    }

    public static int f(int i) {
        if (i == 4) {
            return 2;
        }
        return i == 8 ? 5 : 1;
    }
}
