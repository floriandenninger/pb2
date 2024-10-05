package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amlo {
    public static final amob a;

    static {
        amob amlnVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            amlnVar = new amlm();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            amlnVar = new amln();
        }
        a = amlnVar;
    }
}
