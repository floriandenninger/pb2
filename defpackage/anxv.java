package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anxv {
    private static final long a = TimeUnit.HOURS.toMillis(24);
    private static final long b = TimeUnit.MINUTES.toMillis(30);
    private long c;
    private int d;

    public anxv() {
        anxm.b();
    }

    private final synchronized void d() {
        this.d = 0;
    }

    public final synchronized boolean b() {
        boolean z;
        if (this.d != 0) {
            z = System.currentTimeMillis() > this.c;
        }
        return z;
    }

    private final synchronized long c(int i) {
        if (i == 429 || (i >= 500 && i < 600)) {
            double pow = Math.pow(2.0d, this.d);
            double random = (long) (Math.random() * 1000.0d);
            Double.isNaN(random);
            return (long) Math.min(pow + random, b);
        }
        return a;
    }

    public final synchronized void a(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.d++;
            this.c = System.currentTimeMillis() + c(i);
            return;
        }
        d();
    }
}
