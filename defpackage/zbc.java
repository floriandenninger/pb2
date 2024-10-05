package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbc {
    public final Paint a;
    private final float[] b;
    private final Bitmap c;
    private final Canvas d;
    private final int[] e;
    private final Paint f;
    private int g;

    public zbc(int i, int i2, float[] fArr, int[] iArr) {
        this.b = fArr;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.c = createBitmap;
        this.d = new Canvas(createBitmap);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-16777216);
        this.e = iArr;
        this.f = new Paint();
    }

    private final void c(int i, float f) {
        this.f.setColor(i);
        int height = this.c.getHeight();
        int width = this.g % this.c.getWidth();
        float f2 = height;
        float f3 = width;
        float f4 = (int) ((1.0f - f) * f2);
        float f5 = width + 1;
        this.d.drawRect(f3, f4, f5, f2, this.f);
        this.d.drawRect(f3, 0.0f, f5, f4, this.a);
    }

    public final Bitmap a(float f) {
        int binarySearch = Arrays.binarySearch(this.b, f);
        if (binarySearch != -1) {
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            c(this.e[binarySearch], 1.0f);
            int i = binarySearch + 1;
            float[] fArr = this.b;
            if (i != fArr.length) {
                float f2 = fArr[binarySearch];
                c(this.e[i], (f - f2) / (fArr[i] - f2));
            }
        }
        this.g++;
        return this.c;
    }

    public final void b() {
        this.c.eraseColor(-16777216);
        this.g = 0;
    }
}
