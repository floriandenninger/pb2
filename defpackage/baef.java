package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import org.chromium.base.TraceEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baef extends baee implements MessageQueue.IdleHandler {
    private long a;
    private long b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    private final void c() {
        boolean z;
        boolean z2;
        z = TraceEvent.a;
        if (!z || this.f) {
            if (this.f) {
                z2 = TraceEvent.a;
                if (z2) {
                    return;
                }
                Looper.myQueue().removeIdleHandler(this);
                this.f = false;
                return;
            }
            return;
        }
        this.a = SystemClock.elapsedRealtime();
        Looper.myQueue().addIdleHandler(this);
        this.f = true;
    }

    private static void d(int i, String str) {
        TraceEvent.d("TraceEvent.LooperMonitor:IdleStats", str);
        Log.println(i, "TraceEvent_LooperMonitor", str);
    }

    @Override // defpackage.baee
    public final void a(String str) {
        if (this.e == 0) {
            TraceEvent.b("Looper.queueIdle");
        }
        this.b = SystemClock.elapsedRealtime();
        c();
        super.a(str);
    }

    @Override // defpackage.baee
    public final void b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (elapsedRealtime > 16) {
            d(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
        }
        super.b(str);
        c();
        this.c++;
        this.e++;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a;
        if (j == 0) {
            this.a = elapsedRealtime;
            j = elapsedRealtime;
        }
        long j2 = elapsedRealtime - j;
        this.d++;
        TraceEvent.a("Looper.queueIdle", this.e + " tasks since last idle.");
        if (j2 > 48) {
            d(3, this.c + " tasks and " + this.d + " idles processed so far, " + this.e + " tasks bursted and " + j2 + "ms elapsed since last idle");
        }
        this.a = elapsedRealtime;
        this.e = 0;
        return true;
    }
}
