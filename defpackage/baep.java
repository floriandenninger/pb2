package defpackage;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baep extends SocketImpl {
    public baep(FileDescriptor fileDescriptor) {
        this.fd = fileDescriptor;
    }

    @Override // java.net.SocketImpl
    protected final void accept(SocketImpl socketImpl) {
        throw new RuntimeException("accept not implemented");
    }

    @Override // java.net.SocketImpl
    protected final int available() {
        throw new RuntimeException("accept not implemented");
    }

    @Override // java.net.SocketImpl
    protected final void bind(InetAddress inetAddress, int i) {
        throw new RuntimeException("accept not implemented");
    }

    @Override // java.net.SocketImpl
    protected final void close() {
    }

    @Override // java.net.SocketImpl
    protected final void connect(String str, int i) {
        throw new RuntimeException("connect not implemented");
    }

    @Override // java.net.SocketImpl
    protected final void create(boolean z) {
    }

    @Override // java.net.SocketImpl
    protected final InputStream getInputStream() {
        throw new RuntimeException("getInputStream not implemented");
    }

    @Override // java.net.SocketOptions
    public final Object getOption(int i) {
        throw new RuntimeException("getOption not implemented");
    }

    @Override // java.net.SocketImpl
    protected final OutputStream getOutputStream() {
        throw new RuntimeException("getOutputStream not implemented");
    }

    @Override // java.net.SocketImpl
    protected final void listen(int i) {
        throw new RuntimeException("listen not implemented");
    }

    @Override // java.net.SocketImpl
    protected final void sendUrgentData(int i) {
        throw new RuntimeException("sendUrgentData not implemented");
    }

    @Override // java.net.SocketOptions
    public final void setOption(int i, Object obj) {
        throw new RuntimeException("setOption not implemented");
    }

    @Override // java.net.SocketImpl
    protected final void connect(InetAddress inetAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    @Override // java.net.SocketImpl
    protected final void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }
}
