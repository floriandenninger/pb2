package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acam {
    public int a;
    public double b;
    public int c;
    public final double[] d;

    public acam() {
        this(null);
    }

    public final double a() {
        int i = this.a;
        if (i == 0) {
            return 0.0d;
        }
        double d = this.b;
        double d2 = i;
        Double.isNaN(d2);
        return d / d2;
    }

    public final void b() {
        Arrays.fill(this.d, 0.0d);
        this.a = 0;
        this.b = 0.0d;
        this.c = 0;
    }

    public acam(byte[] bArr) {
        amkq.E(true);
        this.d = new double[10];
        b();
    }
}
