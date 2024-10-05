package defpackage;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anbv implements anbx {
    static final anbv a = new anbv();

    @Override // defpackage.anbx
    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = anbu.a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("Suppressing exception thrown when closing ");
        sb.append(valueOf);
        logger.logp(level, "com.google.common.io.Closer$LoggingSuppressor", "suppress", sb.toString(), th2);
    }
}
