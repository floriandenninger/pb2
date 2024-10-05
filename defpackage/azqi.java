package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqi {
    public static final Throwable a = new azqh();

    public static Exception a(Throwable th) {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static RuntimeException b(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static String c(long j, TimeUnit timeUnit) {
        String lowerCase = timeUnit.toString().toLowerCase();
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 85);
        sb.append("The source did not signal an event for ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase);
        sb.append(" and has been terminated.");
        return sb.toString();
    }

    public static Throwable d(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static boolean e(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new ayrf(th2, th)));
        return true;
    }
}
