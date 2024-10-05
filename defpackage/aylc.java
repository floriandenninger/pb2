package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylc extends WeakReference {
    public static final /* synthetic */ int a = 0;
    private static final boolean b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException c;
    private final ReferenceQueue d;
    private final ConcurrentMap e;
    private final String f;
    private final Reference g;
    private final AtomicBoolean h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        c = runtimeException;
    }

    public aylc(ayld ayldVar, aybv aybvVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(ayldVar, referenceQueue);
        RuntimeException runtimeException;
        this.h = new AtomicBoolean();
        if (b) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = c;
        }
        this.g = new SoftReference(runtimeException);
        this.f = aybvVar.toString();
        this.d = referenceQueue;
        this.e = concurrentMap;
        concurrentMap.put(this, this);
        b(referenceQueue);
    }

    static void b(ReferenceQueue referenceQueue) {
        while (true) {
            aylc aylcVar = (aylc) referenceQueue.poll();
            if (aylcVar == null) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) aylcVar.g.get();
            aylcVar.c();
            if (!aylcVar.h.get()) {
                Level level = Level.SEVERE;
                if (ayld.b.isLoggable(level)) {
                    String property = System.getProperty("line.separator");
                    StringBuilder sb = new StringBuilder(String.valueOf(property).length() + 148);
                    sb.append("*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*");
                    sb.append(property);
                    sb.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                    LogRecord logRecord = new LogRecord(level, sb.toString());
                    logRecord.setLoggerName(ayld.b.getName());
                    logRecord.setParameters(new Object[]{aylcVar.f});
                    logRecord.setThrown(runtimeException);
                    ayld.b.log(logRecord);
                }
            }
        }
    }

    private final void c() {
        super.clear();
        this.e.remove(this);
        this.g.clear();
    }

    public final void a() {
        if (this.h.getAndSet(true)) {
            return;
        }
        clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        c();
        b(this.d);
    }
}
