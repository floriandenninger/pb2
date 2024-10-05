package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uqj implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ uqk a;
    private final Thread.UncaughtExceptionHandler b;

    public uqj(uqk uqkVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uqkVar;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        try {
            try {
                uqk uqkVar = this.a;
                String name = thread.getName();
                String name2 = th.getClass().getName();
                for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                aone h = uqkVar.h();
                h.copyOnWrite();
                bach bachVar = (bach) h.instance;
                bach bachVar2 = bach.a;
                name.getClass();
                bachVar.b |= 8;
                bachVar.f = name;
                Class<?> cls = th.getClass();
                if (cls == OutOfMemoryError.class) {
                    i = 3;
                } else if (NullPointerException.class.isAssignableFrom(cls)) {
                    i = 2;
                } else if (RuntimeException.class.isAssignableFrom(cls)) {
                    i = 4;
                } else {
                    i = Error.class.isAssignableFrom(cls) ? 5 : 1;
                }
                h.copyOnWrite();
                bach bachVar3 = (bach) h.instance;
                bachVar3.g = i - 1;
                bachVar3.b |= 16;
                h.copyOnWrite();
                bach bachVar4 = (bach) h.instance;
                name2.getClass();
                bachVar4.b |= 128;
                bachVar4.h = name2;
                aone av = anaf.av(th);
                h.copyOnWrite();
                bach bachVar5 = (bach) h.instance;
                andu anduVar = (andu) av.build();
                anduVar.getClass();
                bachVar5.i = anduVar;
                bachVar5.b |= 256;
                uqkVar.g((bach) h.build());
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Exception e) {
                ((amxh) ((amxh) ((amxh) uqk.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl$PrimesUncaughtExceptionHandler", "uncaughtException", (char) 147, "CrashMetricServiceImpl.java")).q("Failed to record crash.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.b;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
