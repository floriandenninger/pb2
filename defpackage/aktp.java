package defpackage;

import android.util.Log;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktp implements Thread.UncaughtExceptionHandler {
    public String a = null;
    public Thread.UncaughtExceptionHandler b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a = Log.getStackTraceString(th).replace(String.valueOf(th.getMessage()).concat("\n"), "\n");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
