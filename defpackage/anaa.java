package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anaa extends amzq {
    public static final AtomicReference a = new AtomicReference();
    private static final AtomicLong b = new AtomicLong();
    private static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile amyp d;

    public anaa(String str) {
        super(str);
        boolean z = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z2 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        boolean z3 = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        if (z || z2) {
            this.d = new amzr().a(a());
        } else if (!z3) {
            this.d = null;
        } else {
            new anac();
            this.d = new anac(Level.OFF).a(a());
        }
    }

    public static void e() {
        while (true) {
            anaa anaaVar = (anaa) amzy.a.poll();
            if (anaaVar != null) {
                anaaVar.d = ((amzs) a.get()).a(anaaVar.a());
            } else {
                f();
                return;
            }
        }
    }

    private static void f() {
        while (true) {
            amzz amzzVar = (amzz) c.poll();
            if (amzzVar == null) {
                return;
            }
            b.getAndDecrement();
            amyp amypVar = amzzVar.a;
            amyo amyoVar = amzzVar.b;
            if (amyoVar.x() || amypVar.d(amyoVar.m())) {
                amypVar.c(amyoVar);
            }
        }
    }

    @Override // defpackage.amzq, defpackage.amyp
    public final void b(RuntimeException runtimeException, amyo amyoVar) {
        if (this.d != null) {
            this.d.b(runtimeException, amyoVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.amyp
    public final void c(amyo amyoVar) {
        if (this.d != null) {
            this.d.c(amyoVar);
            return;
        }
        if (b.incrementAndGet() > 20) {
            c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        c.offer(new amzz(this, amyoVar));
        if (this.d != null) {
            f();
        }
    }

    @Override // defpackage.amyp
    public final boolean d(Level level) {
        if (this.d != null) {
            return this.d.d(level);
        }
        return true;
    }
}
