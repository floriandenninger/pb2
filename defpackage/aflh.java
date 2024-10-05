package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.view.PixelCopy;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aflh {
    public final Bitmap a;
    public final aeuu b;
    private final zih c;
    private final zih d;
    private final ScheduledExecutorService e;
    private final axpg f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final float k;
    private int l;
    private int m;
    private Future n;
    private long o;
    private final long p;

    public aflh(ScheduledExecutorService scheduledExecutorService, axpg axpgVar, afhs afhsVar, aeuu aeuuVar, zih zihVar, zih zihVar2, byte[] bArr, byte[] bArr2) {
        this.e = scheduledExecutorService;
        this.b = aeuuVar;
        this.c = zihVar;
        this.d = zihVar2;
        this.k = afhsVar.p().ap;
        this.j = afhsVar.p().aq;
        this.p = afhsVar.p().ar;
        int i = afhsVar.p().ao;
        this.g = Color.red(i);
        this.h = Color.green(i);
        this.i = Color.blue(i);
        this.a = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        this.f = axpgVar;
    }

    private final Future f(final Runnable runnable, final TimeUnit timeUnit) {
        return this.e.schedule(new Runnable() { // from class: aflg
            @Override // java.lang.Runnable
            public final void run() {
                aflh aflhVar = aflh.this;
                Runnable runnable2 = runnable;
                TimeUnit timeUnit2 = timeUnit;
                aflhVar.c();
                aflhVar.e(runnable2, timeUnit2);
            }
        }, 1000L, timeUnit);
    }

    public final synchronized String a() {
        Future future = this.n;
        if (future != null) {
            future.cancel(false);
            this.n = null;
        }
        if (this.l == 0) {
            return "";
        }
        String format = String.format(Locale.US, "m.%.2f;t.%d", Float.valueOf(this.m / this.l), Integer.valueOf(this.l));
        this.l = 0;
        this.m = 0;
        return format;
    }

    public final synchronized void b(Bitmap bitmap) {
        int[] iArr = new int[100];
        bitmap.getPixels(iArr, 0, 10, 0, 0, 10, 10);
        float f = 0.0f;
        for (int i = 0; i < 100; i++) {
            int i2 = iArr[i];
            if (Math.sqrt(Math.pow(this.g - Color.red(i2), 2.0d) + Math.pow(this.h - Color.green(i2), 2.0d) + Math.pow(this.i - Color.blue(i2), 2.0d)) < this.j) {
                f += 1.0f;
            }
        }
        if (f / 100.0f >= this.k) {
            this.m++;
        }
        this.l++;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, afky] */
    public final synchronized void c() {
        if (Boolean.TRUE.equals(this.c.a())) {
            return;
        }
        ?? a = this.d.a();
        if (a != 0 && a.C() != aflb.SECURE_SURFACE) {
            Surface A = a.A();
            if (A != null && A.isValid()) {
                PixelCopy.request(A, this.a, new PixelCopy.OnPixelCopyFinishedListener() { // from class: afle
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(final int i) {
                        aflh aflhVar = aflh.this;
                        if (i == 0) {
                            aflhVar.b(aflhVar.a);
                        } else if (i != 3) {
                            final aeut aeutVar = aflhVar.b.a;
                            aeutVar.k.post(new Runnable() { // from class: aeuc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aeut.this.ac(i);
                                }
                            });
                        }
                    }
                }, (Handler) this.f.get());
            }
        }
    }

    public final synchronized void d() {
        this.o = SystemClock.elapsedRealtime();
        if (this.n != null) {
            return;
        }
        this.n = f(new Runnable() { // from class: aflf
            @Override // java.lang.Runnable
            public final void run() {
                aflh.this.c();
            }
        }, TimeUnit.MILLISECONDS);
    }

    public final synchronized void e(Runnable runnable, TimeUnit timeUnit) {
        afki.a(this.n);
        if (this.n.isCancelled()) {
            return;
        }
        if (this.p == 0 || SystemClock.elapsedRealtime() - this.o <= this.p) {
            this.n = f(runnable, timeUnit);
        } else {
            this.n = null;
        }
    }
}
