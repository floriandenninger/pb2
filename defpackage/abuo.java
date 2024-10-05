package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abuo implements absi {
    private final ScheduledExecutorService A;
    private ScheduledFuture B;
    public final abzy b;
    public final acaf c;
    public final int d;
    public final int e;
    public final Handler f;
    public final acam g;
    public final shf h;
    public int j;
    public int l;
    public int m;
    public int n;
    public long x;
    public absy y;
    private final acaj z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ArrayDeque i = new ArrayDeque();
    public int k = Integer.MAX_VALUE;
    public int o = -1;
    public long p = -1;
    public long q = -1;
    public int r = -1;
    public int s = -1;
    public long t = -1;
    public long u = -1;
    public long v = -1;
    public long w = -1;

    public abuo(int i, int i2, int i3, abzy abzyVar, acac acacVar, acaf acafVar, ScheduledExecutorService scheduledExecutorService, Handler handler, shf shfVar) {
        this.d = i;
        this.l = i2;
        this.e = i3;
        abzyVar.getClass();
        this.b = abzyVar;
        acacVar.getClass();
        acafVar.getClass();
        this.c = acafVar;
        handler.getClass();
        this.f = handler;
        shfVar.getClass();
        this.h = shfVar;
        scheduledExecutorService.getClass();
        this.A = scheduledExecutorService;
        amkq.E(i <= i2 && i2 <= i3);
        amkq.E(i2 > 0);
        this.j = i2;
        this.g = new acam(null);
        this.z = new acaj(3);
        if (abzyVar.b() != i2) {
            abzyVar.a(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int f(int i, int i2, int i3) {
        if (i >= 4000) {
            double d = i;
            Double.isNaN(d);
            double d2 = i2;
            Double.isNaN(d2);
            return (int) ((4000.0d / d) * d2);
        }
        double d3 = 4000 - i;
        Double.isNaN(d3);
        double d4 = i3 + 144000;
        Double.isNaN(d4);
        return ((int) (((d3 / 1000.0d) * d4) / 8.0d)) + i2;
    }

    @Override // defpackage.absi
    public final long a() {
        return 0L;
    }

    @Override // defpackage.absi
    public final void b(absy absyVar) {
        this.y = absyVar;
    }

    @Override // defpackage.absi
    public final void c(final int i, final abvu abvuVar) {
        amkq.N(i > 0);
        this.f.post(new Runnable() { // from class: abuk
            @Override // java.lang.Runnable
            public final void run() {
                abuo abuoVar = abuo.this;
                int i2 = i;
                abvu abvuVar2 = abvuVar;
                abuoVar.b.a(i2);
                abuoVar.a.post(new abud(abvuVar2, 2));
            }
        });
        this.l = i;
    }

    @Override // defpackage.absi
    public final void e(int i) {
        this.s = i;
    }

    @Override // defpackage.absi
    public final void d(boolean z) {
        if (!z) {
            if (this.B != null) {
                abvt.b().f(asrx.class, absi.class, null);
                this.B.cancel(true);
                this.B = null;
                return;
            }
            return;
        }
        if (this.B == null) {
            this.k = f(0, 0, this.j);
            this.f.post(new Runnable() { // from class: abuj
                @Override // java.lang.Runnable
                public final void run() {
                    abuo abuoVar = abuo.this;
                    abuoVar.c.i(abuoVar.k);
                }
            });
            this.g.b();
            this.z.c();
            this.w = this.h.d();
            this.r = -1;
            this.o = -1;
            this.B = this.A.scheduleWithFixedDelay(new abum(this), 200L, 200L, TimeUnit.MILLISECONDS);
            abvt.b().f(asrx.class, absi.class, new abun(this));
        }
    }
}
