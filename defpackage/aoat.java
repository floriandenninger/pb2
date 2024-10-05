package defpackage;

import android.content.Context;
import io.grpc.Status;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoat implements aygi {
    private final Context a;
    private final aydr b;
    private final Executor c;
    private ScheduledExecutorService d;
    private Executor e;
    private boolean f;
    private final aynz g;
    private final aynz h;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public aoat(Context context, Executor executor, aynz aynzVar, aynz aynzVar2, aydr aydrVar) {
        this.a = context;
        this.g = aynzVar;
        this.h = aynzVar2;
        this.b = aydrVar;
        this.d = (ScheduledExecutorService) aynzVar.b();
        this.e = aynzVar2.b();
        this.c = executor;
    }

    @Override // defpackage.aygi
    public final aygo a(SocketAddress socketAddress, aygh ayghVar, axzq axzqVar) {
        if (this.f) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        if (socketAddress instanceof aoar) {
            ((amxh) ((amxh) aoau.a.e()).i("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder$TransportFactory", "newClientTransport", 326, "OnDeviceChannelBuilder.java")).s("Creating in-process transport to %s", socketAddress);
            throw null;
        }
        if (socketAddress instanceof aydn) {
            ((amxh) ((amxh) aoau.a.e()).i("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder$TransportFactory", "newClientTransport", 329, "OnDeviceChannelBuilder.java")).s("Creating cross-process transport to %s", socketAddress);
            return new aydy(this.a, (aydn) socketAddress, this.c, this.g, this.h, this.b, ayghVar.b);
        }
        throw Status.g.withDescription("Unrecognized address").d();
    }

    @Override // defpackage.aygi
    public final ScheduledExecutorService b() {
        return this.d;
    }

    @Override // defpackage.aygi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f = true;
        this.g.c(this.d);
        this.d = null;
        this.h.c(this.e);
        this.e = null;
    }
}
