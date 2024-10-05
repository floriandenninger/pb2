package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ryy {
    public float a;
    public double b;
    public float c;
    public int d;
    public float e;

    public ryy() {
        this.a = 0.0f;
        this.b = 0.0d;
        this.c = 1.0f;
        this.d = 0;
        this.e = 0.0f;
    }

    public ryy(ryy ryyVar) {
        this.a = 0.0f;
        this.b = 0.0d;
        this.c = 1.0f;
        this.d = 0;
        this.e = 0.0f;
        this.a = ryyVar.a;
        this.b = ryyVar.b;
        this.c = ryyVar.c;
        this.d = ryyVar.d;
        this.e = ryyVar.e;
    }

    public final float a(double d) {
        double d2 = d + this.b;
        double d3 = this.c;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = this.d;
        Double.isNaN(d5);
        return (float) (d4 + d5);
    }
}
