package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayes implements aygi {
    private final ScheduledExecutorService a = (ScheduledExecutorService) ayny.a(ayiu.m);
    private final Executor b;
    private final int c;
    private final ayet d;
    private final ayoj e;

    public ayes(ayet ayetVar, Executor executor, int i, ayoj ayojVar) {
        this.c = i;
        this.d = ayetVar;
        executor.getClass();
        this.b = executor;
        this.e = ayojVar;
    }

    @Override // defpackage.aygi
    public final aygo a(SocketAddress socketAddress, aygh ayghVar, axzq axzqVar) {
        return new ayfa(this.d, (InetSocketAddress) socketAddress, ayghVar.a, ayghVar.c, ayghVar.b, this.b, this.c, this.e);
    }

    @Override // defpackage.aygi
    public final ScheduledExecutorService b() {
        return this.a;
    }

    @Override // defpackage.aygi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ayny.d(ayiu.m, this.a);
    }
}
