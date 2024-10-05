package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pvf extends Thread {
    final CountDownLatch a = new CountDownLatch(1);
    boolean b = false;
    private final WeakReference c;
    private final long d;

    public pvf(pvh pvhVar, long j) {
        this.c = new WeakReference(pvhVar);
        this.d = j;
        start();
    }

    private final void a() {
        pvh pvhVar = (pvh) this.c.get();
        if (pvhVar != null) {
            pvhVar.b();
            this.b = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
