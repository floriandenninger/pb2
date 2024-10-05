package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsx {
    private static volatile alsx d;
    private final Context f;
    public static final ammr c = new ammr("SetupCompatServiceProvider", (byte[]) null);
    static final Intent a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    final ServiceConnection b = new alsv(this);
    private volatile alsw e = new alsw(1);
    private final AtomicReference g = new AtomicReference();

    public alsx(Context context) {
        this.f = context.getApplicationContext();
    }

    public static alsj b(Context context, long j, TimeUnit timeUnit) {
        alta.l(context, "Context object cannot be null.");
        alsx alsxVar = d;
        if (alsxVar == null) {
            synchronized (alsx.class) {
                alsxVar = d;
                if (alsxVar == null) {
                    alsxVar = new alsx(context.getApplicationContext());
                    d = alsxVar;
                    d.d();
                }
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            alsw c2 = alsxVar.c();
            switch (c2.a - 1) {
                case 1:
                case 5:
                    return null;
                case 2:
                case 4:
                    return alsxVar.e(j, timeUnit);
                case 3:
                    return c2.b;
                case 6:
                    alsxVar.d();
                    return alsxVar.e(j, timeUnit);
                default:
                    throw new IllegalStateException("NOT_STARTED state only possible before instance is created.");
            }
        }
        throw new IllegalStateException("getService blocks and should not be called from the main thread.");
    }

    private final synchronized alsw c() {
        return this.e;
    }

    private final synchronized void d() {
        int i = c().a;
        if (i == 4) {
            return;
        }
        if (i != 1) {
            this.f.unbindService(this.b);
        }
        try {
            if (this.f.bindService(a, this.b, 1)) {
                if (this.e.a != 4) {
                    a(new alsw(3));
                    return;
                }
                return;
            }
        } catch (SecurityException e) {
            ammr ammrVar = c;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Unable to bind to compat service. ");
            sb.append(valueOf);
            ammrVar.h(sb.toString());
        }
        a(new alsw(2));
        c.h("Context#bindService did not succeed.");
    }

    private final alsj e(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        alsw c2 = c();
        if (c2.a == 4) {
            return c2.b;
        }
        do {
            countDownLatch = (CountDownLatch) this.g.get();
            if (countDownLatch != null) {
                break;
            }
            countDownLatch = new CountDownLatch(1);
        } while (!this.g.compareAndSet(null, countDownLatch));
        if (!countDownLatch.await(j, timeUnit)) {
            d();
            throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", Long.valueOf(j), timeUnit));
        }
        alsw c3 = c();
        String.format("Finished waiting for service to get connected. Current state = %s", alta.i(c3.a));
        return c3.b;
    }

    public final void a(alsw alswVar) {
        String.format("State changed: %s -> %s", alta.i(this.e.a), alta.i(alswVar.a));
        this.e = alswVar;
        CountDownLatch countDownLatch = (CountDownLatch) this.g.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
