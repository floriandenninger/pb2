package defpackage;

import java.util.concurrent.Callable;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymr extends Handler implements ynf {
    private final ynf a;

    public ymr(ynf ynfVar) {
        this.a = ynfVar;
    }

    @Override // defpackage.ynf
    public final /* synthetic */ Runnable a(Runnable runnable) {
        return runnable;
    }

    @Override // defpackage.ynf
    public final /* synthetic */ Callable b(Callable callable) {
        return callable;
    }

    @Override // defpackage.ynf
    public final void c(Throwable th) {
        this.a.c(th);
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // defpackage.ynf
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ynf
    public final /* synthetic */ void e(Throwable th) {
        yjk.i(this, th);
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        if (!Level.SEVERE.equals(logRecord.getLevel()) || logRecord.getThrown() == null) {
            return;
        }
        c(logRecord.getThrown());
    }
}
