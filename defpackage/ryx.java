package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ryx {
    public double a;
    public double b;
    public double c;
    public double d;
    public final ryv e;
    public float f;
    private ryv g;

    public ryx() {
        Double valueOf = Double.valueOf(0.0d);
        this.e = new ryv(valueOf, valueOf);
    }

    public final void a() {
        double d;
        double d2;
        ryv ryvVar = this.g;
        if (ryvVar != null) {
            d = ((Double) ryvVar.a).doubleValue();
            d2 = ((Double) this.g.b).doubleValue();
        } else {
            d = this.a;
            if (d >= Double.MAX_VALUE) {
                d = 0.0d;
            }
            d2 = this.b;
            if (d2 <= -1.7976931348623157E308d) {
                d2 = 1.0d;
            }
        }
        this.f = (float) (d2 - d);
        this.e.b(Double.valueOf(d), Double.valueOf(d2));
    }

    public final boolean b(Double d) {
        boolean z = false;
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue < this.a) {
                this.a = doubleValue;
                z = true;
            }
            if (doubleValue > this.b) {
                this.b = doubleValue;
                return true;
            }
        }
        return z;
    }

    public ryx(ryx ryxVar) {
        Double valueOf = Double.valueOf(0.0d);
        this.e = new ryv(valueOf, valueOf);
        ryv ryvVar = ryxVar.g;
        if (ryvVar != null) {
            this.g = ryvVar.a();
        }
        this.a = ryxVar.a;
        this.b = ryxVar.b;
        this.c = ryxVar.c;
        this.d = ryxVar.d;
    }
}
