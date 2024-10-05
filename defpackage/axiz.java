package defpackage;

import java.util.Locale;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axiz extends axix {
    private double c = 0.0d;
    private double d = 0.0d;
    private int e = 0;

    private final double e() {
        double d = this.e;
        Double.isNaN(d);
        return Math.pow(4.0d, d / 20.0d);
    }

    private final void f(boolean z) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = true != z ? "undershooting" : "overshooting";
        objArr[1] = Double.valueOf(e());
        objArr[2] = Double.valueOf(this.b);
        objArr[3] = Integer.valueOf(this.a / 1000);
        Logging.a("IMCDynamicBitrate", String.format(locale, "Encoder is %s. Scale bitrate by %.2f. Fps: %.2f, Kbps: %d", objArr));
    }

    @Override // defpackage.axix
    public final synchronized int b() {
        double d;
        double e;
        d = this.a;
        e = e();
        Double.isNaN(d);
        return (int) (d * e);
    }

    @Override // defpackage.axix
    public final synchronized void c(int i) {
        double d = this.b;
        if (d == 0.0d) {
            return;
        }
        double d2 = this.a;
        Double.isNaN(d2);
        double d3 = d2 / 8.0d;
        double d4 = this.c;
        double d5 = i;
        Double.isNaN(d5);
        double d6 = d4 + (d5 - (d3 / d));
        this.c = d6;
        this.d += 1000.0d / d;
        double d7 = 3.0d * d3;
        double min = Math.min(d6, d7);
        this.c = min;
        double max = Math.max(min, -d7);
        this.c = max;
        if (this.d <= 3000.0d) {
            return;
        }
        if (max > d3) {
            int i2 = this.e - ((int) ((max / d3) + 0.5d));
            this.e = i2;
            this.e = Math.max(i2, -20);
            this.c = d3;
            f(true);
        } else {
            double d8 = -d3;
            if (max < d8) {
                int i3 = this.e + ((int) (((-max) / d3) + 0.5d));
                this.e = i3;
                this.e = Math.min(i3, 20);
                this.c = d8;
                f(false);
            }
        }
        this.d = 0.0d;
    }

    @Override // defpackage.axix
    public final synchronized void d(int i, double d) {
        int i2 = this.a;
        if (i2 > 0 && i < i2) {
            double d2 = this.c;
            double d3 = i;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = i2;
            Double.isNaN(d5);
            this.c = d4 / d5;
        }
        super.d(i, d);
    }
}
