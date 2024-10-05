package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class ymy implements MessageQueue.IdleHandler {
    public final ScheduledExecutorService b;
    public final boolean d;
    public final int e;
    public final AtomicBoolean f;
    private final boolean g;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Queue c = new LinkedList();

    public ymy(ScheduledExecutorService scheduledExecutorService, apdy apdyVar) {
        this.b = scheduledExecutorService;
        boolean z = false;
        if (apdyVar == null) {
            this.e = 0;
            this.d = false;
            this.g = false;
        } else {
            int i = apdyVar.e;
            this.e = i;
            if (apdyVar.d && i > 0) {
                z = true;
            }
            this.d = z;
            this.g = apdyVar.h;
        }
        this.f = new AtomicBoolean(true);
    }

    public final void a(Runnable runnable, boolean z) {
        if (this.d && this.f.get()) {
            synchronized (this.f) {
                if (this.f.get()) {
                    this.c.add(new ymx(runnable, z));
                    if (this.g && this.c.size() == 1) {
                        Looper.myQueue().addIdleHandler(this);
                    }
                    return;
                }
            }
        }
        if (z) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        synchronized (this.f) {
            if (this.d && this.f.get() && !this.c.isEmpty()) {
                ymx ymxVar = (ymx) this.c.poll();
                if (ymxVar.b) {
                    ymxVar.a.run();
                } else {
                    this.b.execute(ymxVar.a);
                }
                return !this.c.isEmpty();
            }
            return false;
        }
    }
}
