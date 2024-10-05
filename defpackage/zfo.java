package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zfo {
    private final zfn b;
    private final shf c;
    private long e;
    private final Random d = new Random();
    public long a = 0;

    public zfo(zfn zfnVar, shf shfVar) {
        this.b = zfnVar;
        this.c = shfVar;
    }

    public final long a() {
        if (this.a == 0) {
            return 0L;
        }
        return this.c.d() - this.e;
    }

    public final boolean b() {
        long j = this.a;
        Long l = null;
        if (j < this.b.c) {
            if (j == 0) {
                this.e = this.c.d();
            }
            double nextDouble = this.d.nextDouble();
            zfn zfnVar = this.b;
            double d = zfnVar.a;
            Double.isNaN(d);
            long min = Math.min((long) ((nextDouble + 1.0d) * d * Math.pow(zfnVar.e, this.a)), this.b.b);
            long j2 = this.b.d;
            if (j2 >= 0) {
                min = Math.min(min, j2 - (this.c.d() - this.e));
            }
            if (min >= this.b.a) {
                l = Long.valueOf(min);
            }
        }
        if (l == null) {
            return false;
        }
        try {
            String.valueOf(String.valueOf(l)).length();
            Thread.sleep(l.longValue());
            this.a++;
            l.longValue();
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zga.d("Thread interrupted", e);
            return false;
        }
    }
}
