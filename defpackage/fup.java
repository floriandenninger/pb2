package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fup implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;
    private final fuj b;
    private final boolean c;

    public fup(aadw aadwVar, fuj fujVar) {
        apeq am = evr.am(aadwVar);
        boolean z = false;
        if (am != null && am.b && am.d && am.e > 0) {
            z = true;
        }
        this.c = z;
        this.b = fujVar;
    }

    public final void a() {
        if (this.c) {
            yjk.f();
            this.a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.c && this.b.d()) {
            this.b.c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
