package org.chromium.base;

import J.N;
import defpackage.baed;
import defpackage.baeg;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TraceEvent implements AutoCloseable {
    private static volatile boolean a;
    private static AtomicBoolean b = new AtomicBoolean();
    private static AtomicBoolean c = new AtomicBoolean();
    private static baed d;

    public static void a(String str, String str2) {
        EarlyTraceEvent.a("Looper.queueIdle", false);
        if (a) {
            N.M9XfPu17("Looper.queueIdle", str2);
        } else if (d != null) {
            throw null;
        }
    }

    public static void b(String str) {
        c("Looper.queueIdle", null);
    }

    public static void c(String str, String str2) {
        EarlyTraceEvent.c("Looper.queueIdle", false);
        if (a) {
            N.Mw73xTww("Looper.queueIdle", null);
        } else if (d != null) {
            throw null;
        }
    }

    public static void d(String str, String str2) {
        if (a) {
            N.ML40H8ed("TraceEvent.LooperMonitor:IdleStats", str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e() {
        c.set(true);
        if (d != null) {
            throw null;
        }
    }

    public static void setEnabled(boolean z) {
        if (z) {
            EarlyTraceEvent.b();
        }
        if (a != z) {
            a = z;
            if (d != null) {
                throw null;
            }
            ThreadUtils.b().setMessageLogging(z ? baeg.a : null);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        throw null;
    }
}
