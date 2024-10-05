package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vsi implements vsh {
    public final long a;
    public final long b;
    public final double c;

    public vsi(long j, long j2) {
        amkq.E(j < j2);
        this.a = j;
        this.b = j2;
        this.c = j2 - j;
    }

    @Override // defpackage.vsh
    public final float a(long j) {
        double d = this.c;
        if (d == 0.0d) {
            return 0.0f;
        }
        double d2 = j - this.a;
        Double.isNaN(d2);
        return (float) (d2 / d);
    }

    @Override // defpackage.vsh
    public final long b(float f) {
        double d = this.c;
        double d2 = f;
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    @Override // defpackage.vsh
    public final long c(float f) {
        double d = this.a;
        double d2 = this.c;
        double d3 = f;
        Double.isNaN(d3);
        Double.isNaN(d);
        return Math.round(d + (d2 * d3));
    }
}
