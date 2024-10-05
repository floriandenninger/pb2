package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anet {
    static final Duration a = Duration.ofSeconds(Long.MIN_VALUE);
    public static final Duration b = Duration.ofSeconds(Long.MAX_VALUE, 999999999);
    private static final double c;

    static {
        c = r2.getSeconds();
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
    }

    public static Duration a(double d) {
        if (d >= 9.223372036854776E18d) {
            return b;
        }
        if (d <= c) {
            return a;
        }
        long a2 = anem.a(d, RoundingMode.FLOOR);
        double d2 = a2;
        Double.isNaN(d2);
        return Duration.ofSeconds(a2, anem.a((d - d2) * 1.0E9d, RoundingMode.FLOOR));
    }

    public static void b(long j) {
        Duration.of(j, ChronoUnit.MICROS);
    }
}
