package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddi {
    private static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        double elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - j;
        double d = a;
        Double.isNaN(elapsedRealtimeNanos);
        return elapsedRealtimeNanos * d;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
