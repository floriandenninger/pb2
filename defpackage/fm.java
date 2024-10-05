package defpackage;

import android.graphics.Color;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fm {
    private static final ThreadLocal a = new ThreadLocal();

    public static double a(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = e(i, i2);
        }
        double b = b(i) + 0.05d;
        double b2 = b(i2) + 0.05d;
        return Math.max(b, b2) / Math.min(b, b2);
    }

    public static double b(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = red;
        Double.isNaN(d);
        double d2 = d / 255.0d;
        double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = green;
        Double.isNaN(d3);
        double d4 = d3 / 255.0d;
        double pow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = blue;
        Double.isNaN(d5);
        double d6 = d5 / 255.0d;
        double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
        return dArr[1] / 100.0d;
    }

    public static int c(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(k((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), k((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), k((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int d(int i, int i2, float f) {
        int alpha = Color.alpha(i2);
        int i3 = PrivateKeyType.INVALID;
        if (alpha != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        double d = f;
        if (a(f(i, PrivateKeyType.INVALID), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            double a2 = a(f(i, i6), i2);
            if (a2 >= d) {
                i3 = i6;
            }
            if (a2 < d) {
                i4 = i6;
            }
        }
        return i3;
    }

    public static int e(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / PrivateKeyType.INVALID);
        return Color.argb(i3, i(Color.red(i), alpha2, Color.red(i2), alpha, i3), i(Color.green(i), alpha2, Color.green(i2), alpha, i3), i(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int f(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void g(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((f6 + f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = j(f7, 360.0f);
        fArr[1] = j(abs, 1.0f);
        fArr[2] = j(f6, 1.0f);
    }

    public static void h(int i, float[] fArr) {
        g(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    private static int i(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * PrivateKeyType.INVALID) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * PrivateKeyType.INVALID);
    }

    private static float j(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }

    private static int k(int i) {
        if (i < 0) {
            return 0;
        }
        return i > 255 ? PrivateKeyType.INVALID : i;
    }
}
