package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class np {
    public static np a;
    public long b;
    public long c;
    public int d;

    public final void a(long j, double d, double d2) {
        float f = ((float) ((-946728000000L) + j)) / 8.64E7f;
        double d3 = (0.01720197f * f) + 6.24006f;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double sin2 = sin + d3 + (Math.sin(r2 + r2) * 3.4906598739326E-4d) + (Math.sin(r2 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = f - 9.0E-4f;
        Double.isNaN(d5);
        double round = ((float) Math.round(d5 - d4)) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = round + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(sin2 + sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.d = 1;
        } else {
            if (sin4 > -1.0d) {
                double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
                Double.isNaN(acos);
                this.b = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
                Double.isNaN(acos);
                long round2 = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
                this.c = round2;
                if (round2 >= j || this.b <= j) {
                    this.d = 1;
                    return;
                } else {
                    this.d = 0;
                    return;
                }
            }
            this.d = 0;
        }
        this.b = -1L;
        this.c = -1L;
    }
}
