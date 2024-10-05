package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aewf extends bdi {
    protected long o;
    protected ath p;
    protected long q;
    protected long r;

    public aewf(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, long j2, long j3, long j4) {
        super(ateVar, athVar, pmsVar, i, obj, j == -9223372036854775807L ? 0L : j, j2 == -9223372036854775807L ? 0L : j2, j3, -9223372036854775807L, j4);
        this.p = this.f;
        this.o = j4;
        this.q = j;
        this.r = j2;
    }

    public final synchronized long g() {
        return this.r;
    }

    public final synchronized long i() {
        return this.o;
    }

    public final synchronized long j() {
        return this.q;
    }

    public final synchronized ath k() {
        return this.p;
    }
}
