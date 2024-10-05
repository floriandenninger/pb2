package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qum implements Runnable, qpj, qqp {
    private static qum d;
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public int b = 0;
    public final Handler c;
    private final qsg e;

    private qum(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        amcc amccVar = new amcc(handlerThread.getLooper(), (byte[]) null);
        this.c = amccVar;
        this.e = new qug(context, amccVar.getLooper(), this, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized qum c(Context context) {
        qum qumVar;
        synchronized (qum.class) {
            if (d == null) {
                d = new qum(context);
            }
            qumVar = d;
        }
        return qumVar;
    }

    private final void f(String str) {
        while (true) {
            quh quhVar = (quh) this.a.poll();
            if (quhVar == null) {
                return;
            } else {
                quhVar.b(new qul(this, str, quhVar.f));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qum.g():void");
    }

    @Override // defpackage.qpj
    public final void a(int i) {
        qip.ar(this.c);
        StringBuilder sb = new StringBuilder(25);
        sb.append("Disconnected: ");
        sb.append(i);
        f(sb.toString());
    }

    @Override // defpackage.qpj
    public final void b() {
        qip.ar(this.c);
        g();
    }

    public final void d() {
        if (this.a.isEmpty() && this.b == 0 && this.e.w()) {
            this.e.l();
        }
    }

    public final void e(Runnable runnable) {
        if (Looper.myLooper() == this.c.getLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.qqp
    public final void i(ConnectionResult connectionResult) {
        qip.ar(this.c);
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Connection failed: ");
        sb.append(valueOf);
        f(sb.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        qip.ar(this.c);
        if (this.e.w()) {
            g();
        } else if (!this.e.x() && this.a.size() > 0) {
            this.e.G();
        }
    }
}
