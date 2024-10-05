package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayqg implements Runnable {
    final Runnable a;
    final aysd b;
    final long c;
    long d;
    long e;
    long f;
    final /* synthetic */ ayqh g;

    public ayqg(ayqh ayqhVar, long j, Runnable runnable, long j2, aysd aysdVar, long j3) {
        this.g = ayqhVar;
        this.a = runnable;
        this.b = aysdVar;
        this.c = j3;
        this.e = j2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        if (this.b.e()) {
            return;
        }
        long f = ayqh.f(TimeUnit.NANOSECONDS);
        long j2 = ayqi.a;
        long j3 = this.e;
        if (j2 + f < j3 || f >= j3 + this.c + ayqi.a) {
            long j4 = this.c;
            long j5 = f + j4;
            long j6 = this.d + 1;
            this.d = j6;
            this.f = j5 - (j4 * j6);
            j = j5;
        } else {
            long j7 = this.f;
            long j8 = this.d + 1;
            this.d = j8;
            j = j7 + (j8 * this.c);
        }
        this.e = f;
        ayrz.i(this.b, this.g.c(this, j - f, TimeUnit.NANOSECONDS));
    }
}
