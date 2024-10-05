package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pod {
    public final poc a;
    public int b;
    public Object c;
    public final Looper d;
    public final long e = -9223372036854775807L;
    private final pob f;
    private boolean g;
    private boolean h;
    private boolean i;

    public pod(pob pobVar, poc pocVar, Looper looper) {
        this.f = pobVar;
        this.a = pocVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final synchronized void b(long j) {
        pse.g(this.g);
        pse.g(this.d.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.i) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
    }

    public final synchronized void c() {
    }

    public final void d() {
        pse.g(!this.g);
        pse.e(true);
        this.g = true;
        this.f.b(this);
    }

    public final void e(Object obj) {
        pse.g(!this.g);
        this.c = obj;
    }

    public final void f(int i) {
        pse.g(!this.g);
        this.b = i;
    }
}
