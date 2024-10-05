package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfs implements aygi {
    public final Executor a;
    private final aygi b;

    public ayfs(aygi aygiVar, Executor executor) {
        aygiVar.getClass();
        this.b = aygiVar;
        executor.getClass();
        this.a = executor;
    }

    @Override // defpackage.aygi
    public final aygo a(SocketAddress socketAddress, aygh ayghVar, axzq axzqVar) {
        return new ayfr(this, this.b.a(socketAddress, ayghVar, axzqVar), ayghVar.a);
    }

    @Override // defpackage.aygi
    public final ScheduledExecutorService b() {
        return this.b.b();
    }

    @Override // defpackage.aygi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
