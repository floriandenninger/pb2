package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnp {
    public final HandlerThread a;
    public final Handler b;
    public final acoo c;
    public Runnable d;
    public int e;
    public int f;
    public int g;
    public Handler h;
    public volatile baod i;
    public boolean j;
    public acnc k;

    public acnp(baog baogVar, final acmx acmxVar) {
        baogVar.getClass();
        this.c = new acoo(baogVar, new acnl(acmxVar));
        HandlerThread handlerThread = new HandlerThread("WebRtcCapturerThread");
        this.a = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acno
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acmx acmxVar2 = acmx.this;
                zga.f("VideoCapturerImpl", "WebRTC capturer thread died unexpectedly", th);
                acmxVar2.a();
            }
        });
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.post(new acnm(this, 0));
    }
}
