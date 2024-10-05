package defpackage;

import com.facebook.yoga.YogaEdge;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diu {
    public static final int a = YogaEdge.values().length;
    private static final int b = YogaEdge.ALL.j;
    private static final int c = YogaEdge.HORIZONTAL.j;
    private static final int d = YogaEdge.VERTICAL.j;
    private long e = -1;
    private float[] f;
    private boolean g;

    private final byte e(int i) {
        return (byte) ((this.e >> (i * 4)) & 15);
    }

    public final float a(YogaEdge yogaEdge) {
        int i;
        float f = Float.NaN;
        if (yogaEdge != YogaEdge.START && yogaEdge != YogaEdge.END) {
            f = 0.0f;
        }
        if (this.e != -1) {
            byte e = e(yogaEdge.j);
            if (e != 15) {
                return this.f[e];
            }
            if (this.g) {
                if (yogaEdge == YogaEdge.TOP || yogaEdge == YogaEdge.BOTTOM) {
                    i = d;
                } else {
                    i = c;
                }
                byte e2 = e(i);
                if (e2 != 15) {
                    return this.f[e2];
                }
                int i2 = b;
                if (e(i2) != 15) {
                    return this.f[e(i2)];
                }
            }
        }
        return f;
    }

    public final float b(int i) {
        byte e = e(i);
        if (e == 15) {
            return Float.NaN;
        }
        return this.f[e];
    }

    public final float c(YogaEdge yogaEdge) {
        byte e = e(yogaEdge.j);
        if (e == 15) {
            return Float.NaN;
        }
        return this.f[e];
    }

    public final void d(YogaEdge yogaEdge, float f) {
        byte b2;
        int i = yogaEdge.j;
        float b3 = b(i);
        if (Float.isNaN(b3) || Float.isNaN(f)) {
            if (Float.isNaN(b3) && Float.isNaN(f)) {
                return;
            }
        } else if (Math.abs(f - b3) < 1.0E-5f) {
            return;
        }
        byte e = e(i);
        if (esv.T(f)) {
            this.e = (15 << (i * 4)) | this.e;
            this.f[e] = Float.NaN;
        } else if (e == 15) {
            if (this.f != null) {
                int i2 = 0;
                while (true) {
                    float[] fArr = this.f;
                    int length = fArr.length;
                    if (i2 >= length) {
                        float[] fArr2 = new float[Math.min(length + length, a)];
                        this.f = fArr2;
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                        float[] fArr3 = this.f;
                        Arrays.fill(fArr3, length, fArr3.length, Float.NaN);
                        b2 = (byte) length;
                        break;
                    }
                    if (esv.T(fArr[i2])) {
                        b2 = (byte) i2;
                        break;
                    }
                    i2++;
                }
            } else {
                this.f = new float[]{Float.NaN, Float.NaN};
                b2 = 0;
            }
            if (b2 >= a) {
                throw new IllegalStateException("The newIndex for the array cannot be bigger than the amount of Yoga Edges.");
            }
            int i3 = i * 4;
            this.e = (this.e & ((15 << i3) ^ (-1))) | (b2 << i3);
            this.f[b2] = f;
        } else {
            this.f[e] = f;
        }
        this.g = ((((int) (this.e >> 24)) ^ (-1)) & 4095) != 0;
    }
}
