package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bdu extends bdn {
    public final long n;

    public bdu(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, long j2, long j3) {
        super(ateVar, athVar, 1, pmsVar, i, obj, j, j2);
        pse.c(pmsVar);
        this.n = j3;
    }

    public long f() {
        long j = this.n;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean h();
}
