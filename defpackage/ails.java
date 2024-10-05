package defpackage;

import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ails implements Runnable {
    final /* synthetic */ ailv a;
    private final ExecutorService b = Executors.newFixedThreadPool(2, new yna("mediaConn"));

    public ails(ailv ailvVar) {
        this.a = ailvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorService executorService;
        while (!Thread.interrupted()) {
            try {
                try {
                    try {
                        try {
                            this.b.execute(new ailu(this.a, this.a.e.accept()));
                        } catch (NoSuchFieldError e) {
                            zga.d("NoSuchFieldError when accepting a new connection", e);
                            executorService = this.b;
                        }
                    } catch (SocketException e2) {
                        String message = e2.getMessage();
                        if (message == null || !message.equals("Socket closed")) {
                            zga.d("SocketException when accepting a new connection", e2);
                        }
                        executorService = this.b;
                    }
                } catch (IOException e3) {
                    zga.d("IOException when accepting a new connection", e3);
                    executorService = this.b;
                } catch (Throwable th) {
                    zga.d("Error when accepting a new connection", th);
                    executorService = this.b;
                }
            } catch (Throwable th2) {
                this.b.shutdownNow();
                throw th2;
            }
        }
        executorService = this.b;
        executorService.shutdownNow();
    }
}
