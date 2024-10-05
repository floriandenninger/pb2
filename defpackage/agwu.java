package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwu implements aeej {
    public String a;
    public long b;
    public long c;
    private long e;
    private long g;
    private double h;
    private final shf i;
    private final agjd j;
    private final agwt k;
    private long f = -1;
    private int d = -1;

    public agwu(shf shfVar, agjd agjdVar, agwt agwtVar) {
        this.i = shfVar;
        this.j = agjdVar;
        this.k = agwtVar;
    }

    @Override // defpackage.aeej
    public final void g(FormatStreamModel formatStreamModel, long j) {
        double d;
        long j2 = this.b + j;
        double d2 = j2;
        double d3 = this.c;
        Double.isNaN(d3);
        Double.isNaN(d2);
        int round = (int) Math.round(d2 / (d3 / 100.0d));
        if (this.d < 0 || round - r5 >= 1.0d || j2 - this.e >= 16777216 || j == formatStreamModel.j()) {
            long c = this.i.c();
            long j3 = this.f;
            double d4 = 0.0d;
            if (j3 < c) {
                if (j3 != -1) {
                    double d5 = j - this.g;
                    double millis = TimeUnit.SECONDS.toMillis(1L);
                    Double.isNaN(d5);
                    Double.isNaN(millis);
                    double d6 = d5 * millis;
                    double d7 = c - this.f;
                    Double.isNaN(d7);
                    d = Math.min(d6 / d7, 5000000.0d);
                    double d8 = this.h;
                    if (d8 > 0.0d) {
                        d4 = Math.min(d, d8 * 10.0d);
                        d = (0.25d * d4) + (this.h * 0.75d);
                    } else {
                        d4 = d;
                    }
                } else {
                    d = 0.0d;
                }
                this.f = c;
                this.g = j;
                this.h = d4;
                d4 = d;
            }
            this.j.g(this.a, formatStreamModel.e(), j);
            this.k.a(this.b + j, d4);
            this.d = round;
            this.e = j2;
        }
    }
}
