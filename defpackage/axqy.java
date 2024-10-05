package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqy implements Runnable {
    public final InputStream a;
    public final Socket b;
    final /* synthetic */ axrm c;

    public axqy(axrm axrmVar, InputStream inputStream, Socket socket) {
        this.c = axrmVar;
        this.a = inputStream;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = this.b.getOutputStream();
                axre axreVar = new axre(this.c, new axrd(), this.a, outputStream, this.b.getInetAddress());
                while (!this.b.isClosed()) {
                    axreVar.b();
                }
            } catch (Exception e) {
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    axrm.h.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                }
            }
        } finally {
            axrm.l(outputStream);
            axrm.l(this.a);
            axrm.l(this.b);
            this.c.l.a(this);
        }
    }
}
