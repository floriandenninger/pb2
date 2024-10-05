package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgq extends Thread {
    final /* synthetic */ rgr a;
    private final Object b;
    private final BlockingQueue c;
    private boolean d = false;

    public rgq(rgr rgrVar, String str, BlockingQueue blockingQueue) {
        this.a = rgrVar;
        qip.an(blockingQueue);
        this.b = new Object();
        this.c = blockingQueue;
        setName(str);
    }

    private final void b() {
        synchronized (this.a.d) {
            if (!this.d) {
                this.a.e.release();
                this.a.d.notifyAll();
                rgr rgrVar = this.a;
                if (this == rgrVar.b) {
                    rgrVar.b = null;
                } else if (this == rgrVar.c) {
                    rgrVar.c = null;
                } else {
                    rgrVar.aF().c.a("Current scheduler thread is neither worker nor network");
                }
                this.d = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.a.aF().f.b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.b) {
            this.b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.a.e.acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                rgp rgpVar = (rgp) this.c.poll();
                if (rgpVar != null) {
                    Process.setThreadPriority(true != rgpVar.a ? 10 : threadPriority);
                    rgpVar.run();
                } else {
                    synchronized (this.b) {
                        if (this.c.peek() == null) {
                            boolean z2 = this.a.f;
                            try {
                                this.b.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    synchronized (this.a.d) {
                        if (this.c.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.a.J().o(rfd.al)) {
                b();
            }
        } finally {
            b();
        }
    }
}
