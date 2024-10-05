package defpackage;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjy implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ aykx a;

    public ayjy(aykx aykxVar) {
        this.a = aykxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = aykx.a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(this.a.i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("[");
        sb.append(valueOf);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$2", "uncaughtException", sb.toString(), th);
        aykx aykxVar = this.a;
        if (aykxVar.u) {
            return;
        }
        aykxVar.u = true;
        aykxVar.e(true);
        aykxVar.l(false);
        aykxVar.m(new ayjw(th));
        aykxVar.G.a(4, "PANIC! Entering TRANSIENT_FAILURE");
        aykxVar.q.a(ayae.TRANSIENT_FAILURE);
    }
}
