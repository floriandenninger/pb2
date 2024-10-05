package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afdm {
    public final psf a;
    private final amnv c;
    private final amnv d;
    private final amnv e;
    private final boolean g;
    private long f = -1;
    public volatile long b = -1;

    public afdm(amnv amnvVar, amnv amnvVar2, amnv amnvVar3, boolean z, psf psfVar) {
        this.c = amnvVar;
        this.d = amnvVar2;
        this.e = amnvVar3;
        this.g = z;
        this.a = psfVar;
    }

    public final boolean a(long j) {
        long intValue = ((Integer) this.c.get()).intValue() * 1000;
        long intValue2 = ((Integer) this.d.get()).intValue() * 1000;
        int intValue3 = ((Integer) this.e.get()).intValue();
        if (intValue > intValue2) {
            if (this.g) {
                if (this.b == -1) {
                    this.b = SystemClock.elapsedRealtime();
                }
                intValue = Math.min(intValue, intValue2 + (intValue3 * (SystemClock.elapsedRealtime() - this.b)));
            } else if (j == 0 || this.f == -1) {
                this.f = SystemClock.elapsedRealtime();
                intValue = intValue2;
            } else {
                intValue = Math.min(intValue, intValue2 + (intValue3 * (SystemClock.elapsedRealtime() - this.f)));
            }
        }
        return j <= intValue;
    }
}
