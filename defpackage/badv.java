package defpackage;

import java.lang.Thread;
import org.chromium.base.JavaHandlerThread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class badv implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ JavaHandlerThread a;

    public badv(JavaHandlerThread javaHandlerThread) {
        this.a = javaHandlerThread;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.b = th;
    }
}
