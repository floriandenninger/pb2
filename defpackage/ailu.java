package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.impl.DefaultHttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ailu implements Runnable {
    final /* synthetic */ ailv a;
    private final Socket b;

    public ailu(ailv ailvVar, Socket socket) {
        this.a = ailvVar;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DefaultHttpServerConnection defaultHttpServerConnection = new DefaultHttpServerConnection();
        try {
            try {
                try {
                    defaultHttpServerConnection.bind(this.b, this.a.a);
                    BasicHttpContext basicHttpContext = new BasicHttpContext();
                    while (!Thread.interrupted() && defaultHttpServerConnection.isOpen()) {
                        this.a.b.handleRequest(defaultHttpServerConnection, basicHttpContext);
                    }
                    try {
                        defaultHttpServerConnection.shutdown();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                try {
                    defaultHttpServerConnection.shutdown();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (ConnectionClosedException unused4) {
            defaultHttpServerConnection.shutdown();
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null || !(e instanceof SocketException) || (!message.contains("Connection reset by peer") && !message.contains("Socket closed"))) {
                zga.d("IOException when handling a request", e);
            }
            try {
                defaultHttpServerConnection.shutdown();
            } catch (IOException unused5) {
            }
        } catch (HttpException e2) {
            zga.d("HTTP protocol violation", e2);
            try {
                defaultHttpServerConnection.shutdown();
            } catch (IOException unused6) {
            }
        }
    }
}
