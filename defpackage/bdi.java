package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bdi extends bdu {
    public final long a;
    public final long b;
    public bdk c;
    public int[] d;

    public bdi(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(ateVar, athVar, pmsVar, i, obj, j, j2, j5);
        this.a = j3;
        this.b = j4;
    }

    public final int c(int i) {
        return ((int[]) pse.d(this.d))[i];
    }

    public final bdk d() {
        bdk bdkVar = this.c;
        pse.d(bdkVar);
        return bdkVar;
    }
}
