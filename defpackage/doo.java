package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class doo extends dop implements dom {
    private final long e;
    private long f = Long.MIN_VALUE;
    private long g = Long.MIN_VALUE;
    private long h = Long.MIN_VALUE;

    public doo(int i) {
        this.e = i;
    }

    @Override // defpackage.dop
    public final float a(long j) {
        if (this.h == Long.MIN_VALUE) {
            this.f = j;
            this.h = j;
            this.g = j + (this.e * 1000000);
            return 0.0f;
        }
        long j2 = this.g;
        this.h = j;
        if (j >= j2) {
            return 1.0f;
        }
        long j3 = this.f;
        return ((float) (j - j3)) / ((float) (j2 - j3));
    }

    @Override // defpackage.dom
    public final boolean b() {
        return this.h >= this.g;
    }
}
