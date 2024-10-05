package defpackage;

import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtg {
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;

    public ahtg() {
    }

    public ahtg(int i, int i2, long j, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = i3;
        this.e = i4;
    }

    public static ahtg a(DisplayMetrics displayMetrics) {
        ajpu ajpuVar = new ajpu();
        ajpuVar.b = Integer.valueOf(yjk.K(displayMetrics, 0));
        ajpuVar.c = Integer.valueOf(yjk.K(displayMetrics, 0));
        ajpuVar.b(yjk.K(displayMetrics, 28));
        ajpuVar.c(yjk.K(displayMetrics, 4));
        ajpuVar.d(400L);
        return ajpuVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahtg) {
            ahtg ahtgVar = (ahtg) obj;
            if (this.a == ahtgVar.a && this.b == ahtgVar.b && this.c == ahtgVar.c && this.d == ahtgVar.d && this.e == ahtgVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        return ((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        int i3 = this.d;
        int i4 = this.e;
        StringBuilder sb = new StringBuilder(184);
        sb.append("HeatIntensityViewModel{maximumBarHeight=");
        sb.append(i);
        sb.append(", minimumBarHeight=");
        sb.append(i2);
        sb.append(", showHideAnimationDurationMillis=");
        sb.append(j);
        sb.append(", barGap=");
        sb.append(i3);
        sb.append(", highlightWidth=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
