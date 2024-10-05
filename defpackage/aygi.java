package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface aygi extends Closeable {
    aygo a(SocketAddress socketAddress, aygh ayghVar, axzq axzqVar);

    ScheduledExecutorService b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
