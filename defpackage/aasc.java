package defpackage;

import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aasc {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public aasc(DisplayMetrics displayMetrics, boolean z) {
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int P = yjk.P(displayMetrics, i);
        int P2 = yjk.P(displayMetrics, i2);
        float f = i / displayMetrics.xdpi;
        float f2 = i2 / displayMetrics.ydpi;
        if (!z || i <= i2) {
            this.a = P;
            this.b = P2;
            this.c = f;
            this.d = f2;
        } else {
            this.a = P2;
            this.b = P;
            this.c = f2;
            this.d = f;
        }
        this.e = displayMetrics.density;
    }
}
