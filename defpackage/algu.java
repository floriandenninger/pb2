package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class algu {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public algu(Context context) {
        boolean m = alkd.m(context, R.attr.elevationOverlayEnabled, false);
        int r = akwg.r(context, R.attr.elevationOverlayColor, 0);
        int r2 = akwg.r(context, R.attr.elevationOverlayAccentColor, 0);
        int r3 = akwg.r(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = m;
        this.d = r;
        this.e = r2;
        this.b = r3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        if (!this.a || fm.f(i, PrivateKeyType.INVALID) != this.b) {
            return i;
        }
        float min = (this.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int s = akwg.s(fm.f(i, PrivateKeyType.INVALID), this.d, min);
        if (min > 0.0f && (i2 = this.e) != 0) {
            s = fm.e(fm.f(i2, c), s);
        }
        return fm.f(s, alpha);
    }
}
