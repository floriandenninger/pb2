package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrl implements Runnable {
    public IOException a;
    public boolean b = false;
    final /* synthetic */ axrm c;

    public axrl(axrm axrmVar) {
        this.c = axrmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ServerSocket serverSocket = this.c.j;
            String str = this.c.i;
            serverSocket.bind(str != null ? new InetSocketAddress(str, 0) : new InetSocketAddress(0));
            this.b = true;
            do {
                try {
                    Socket accept = this.c.j.accept();
                    InputStream inputStream = accept.getInputStream();
                    axrm axrmVar = this.c;
                    axrb axrbVar = axrmVar.l;
                    axqy axqyVar = new axqy(axrmVar, inputStream, accept);
                    axrbVar.a++;
                    Thread thread = new Thread(axqyVar);
                    thread.setDaemon(true);
                    long j = axrbVar.a;
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("NanoHttpd Request Processor (#");
                    sb.append(j);
                    sb.append(")");
                    thread.setName(sb.toString());
                    axrbVar.b.add(axqyVar);
                    thread.start();
                } catch (IOException e) {
                    axrm.h.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.c.j.isClosed());
        } catch (IOException e2) {
            this.a = e2;
        }
    }
}
