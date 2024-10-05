package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
final class accx {
    public final Thread.UncaughtExceptionHandler a = new accw(this);
    public boolean b;
    public Thread c;
    public Thread.UncaughtExceptionHandler d;
    final /* synthetic */ accy e;

    public accx(accy accyVar) {
        this.e = accyVar;
    }

    public final void a() {
        Thread thread = this.c;
        if (thread != null) {
            thread.setUncaughtExceptionHandler(this.d);
            this.d = null;
            this.c = null;
        }
    }
}
