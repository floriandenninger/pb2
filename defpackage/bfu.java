package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfu extends Handler implements Runnable {
    public final int a;
    public IOException b;
    public int c;
    final /* synthetic */ bfz d;
    private final bfv e;
    private bft f;
    private Thread g;
    private boolean h;
    private volatile boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfu(bfz bfzVar, Looper looper, bfv bfvVar, bft bftVar, int i) {
        super(looper);
        this.d = bfzVar;
        this.e = bfvVar;
        this.f = bftVar;
        this.a = i;
    }

    private final void c() {
        this.b = null;
        bfz bfzVar = this.d;
        ExecutorService executorService = bfzVar.a;
        bfu bfuVar = bfzVar.b;
        pse.c(bfuVar);
        executorService.execute(bfuVar);
    }

    private final void d() {
        this.d.b = null;
    }

    public final void a(boolean z) {
        this.i = z;
        this.b = null;
        if (hasMessages(0)) {
            this.h = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.h = true;
                this.e.a();
                Thread thread = this.g;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            SystemClock.elapsedRealtime();
            bft bftVar = this.f;
            pse.c(bftVar);
            bftVar.y(this.e, true);
            this.f = null;
        }
    }

    public final void b(long j) {
        pse.g(this.d.b == null);
        this.d.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            c();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        if (message.what == 0) {
            c();
            return;
        }
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        d();
        SystemClock.elapsedRealtime();
        bft bftVar = this.f;
        pse.c(bftVar);
        if (this.h) {
            bftVar.y(this.e, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            try {
                bftVar.z(this.e);
                return;
            } catch (RuntimeException e) {
                prh.j("LoadTask", "Unexpected exception handling load completed", e);
                this.d.c = new bfy(e);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.b = iOException;
        int i2 = this.c + 1;
        this.c = i2;
        aeqp A = bftVar.A(this.e, iOException, i2);
        int i3 = A.b;
        if (i3 == 3) {
            this.d.c = this.b;
        } else if (i3 != 2) {
            if (i3 == 1) {
                this.c = 1;
            }
            long j = A.a;
            if (j == -9223372036854775807L) {
                j = Math.min((this.c - 1) * 1000, 5000);
            }
            b(j);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.h;
                this.g = Thread.currentThread();
            }
            if (z) {
                String valueOf = String.valueOf(this.e.getClass().getSimpleName());
                if (valueOf.length() != 0) {
                    "load:".concat(valueOf);
                }
                int i = pts.a;
                this.e.b();
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            prh.j("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new bfy(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            prh.j("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new bfy(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                prh.j("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
