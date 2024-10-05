package defpackage;

import android.util.Log;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class accw implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ accx a;

    public accw(accx accxVar) {
        this.a = accxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Log.e("CameraPreviewCtrl", "Uncaught exception while camera session is active.", th);
        accx accxVar = this.a;
        if (!accxVar.b) {
            accxVar.b = true;
            accxVar.e.c(true);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
