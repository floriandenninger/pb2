package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoo {
    public final baog a;
    public final Handler b;
    public bara c;
    private final HandlerThread d;

    public acoo(baog baogVar, final acnl acnlVar) {
        this.a = baogVar;
        HandlerThread handlerThread = new HandlerThread("YuvConverterThread");
        this.d = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acom
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acnl acnlVar2 = acnl.this;
                zga.f("YuvConversionHelper", "YUV conversion helper thread died unexpectedly", th);
                acnlVar2.a.a();
            }
        });
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.b = handler;
        aype.y(handler, new Runnable() { // from class: acol
            @Override // java.lang.Runnable
            public final void run() {
                acoo acooVar = acoo.this;
                baom d = baoe.d(acooVar.a, baom.d);
                try {
                    d.c();
                    d.f();
                    acooVar.c = new bara();
                } catch (RuntimeException e) {
                    d.g();
                    acooVar.b.getLooper().quit();
                    throw e;
                }
            }
        });
    }

    protected final void finalize() {
        this.d.quit();
        super.finalize();
    }
}
