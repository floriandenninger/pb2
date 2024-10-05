package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anby implements Closeable {
    private static final anbx b;
    final anbx a;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    static {
        anbx anbxVar;
        try {
            anbxVar = new anbw(Throwable.class.getMethod("addSuppressed", Throwable.class));
        } catch (Throwable unused) {
            anbxVar = null;
        }
        if (anbxVar == null) {
            anbxVar = anbv.a;
        }
        b = anbxVar;
    }

    public anby(anbx anbxVar) {
        anbxVar.getClass();
        this.a = anbxVar;
    }

    public static anby a() {
        return new anby(b);
    }

    public final RuntimeException b(Throwable th) {
        this.d = th;
        amnz.d(th, IOException.class);
        throw new RuntimeException(th);
    }

    public final void c(Closeable closeable) {
        if (closeable != null) {
            this.c.addFirst(closeable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = (Closeable) this.c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.a.a(closeable, th, th2);
                }
            }
        }
        if (this.d != null || th == null) {
            return;
        }
        amnz.d(th, IOException.class);
        throw new AssertionError(th);
    }
}
