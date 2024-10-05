package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hok {
    static final float a = f(48);
    static final float b = f(4);
    public float d;
    public float e;
    private final Context i;
    private float[] n;
    private float o;
    private float p;
    private final float[] h = {f(10), f(14), f(20), f(28), f(36), f(40), f(36), f(28), f(20), f(14), f(10)};
    private final Paint j = new Paint();
    private final Paint k = new Paint();
    private final Paint l = new Paint();
    private final Paint m = new Paint();
    public final List c = new ArrayList();
    public float f = a;
    public float g = b;

    public hok(Context context) {
        this.i = context;
    }

    static int a(byte b2) {
        return (b2 & 255) - 128;
    }

    private static float f(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    private final void g(long j, long j2, float f, amru amruVar) {
        float f2 = (float) j;
        float f3 = (f * f2) / ((float) j2);
        this.e = f2 / f3;
        this.n = new float[(int) f3];
        this.c.clear();
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            this.c.add(Integer.valueOf((int) (((float) ((Long) amruVar.get(i)).longValue()) / this.e)));
        }
    }

    private final void h(Paint paint, int i) {
        paint.setStrokeWidth(this.o);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i);
    }

    public final void b(Canvas canvas, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z) {
        Paint paint;
        float f8 = f6;
        if (this.n != null) {
            float f9 = f + f3;
            float f10 = f8 - ((int) f8);
            float f11 = this.d;
            float f12 = ((f9 - (f10 * f11)) + (this.o / 2.0f)) - f11;
            for (float f13 = f8 - 1.0f; f12 > f && f13 >= 0.0f && f13 < this.n.length; f13 -= 1.0f) {
                int i3 = (int) f13;
                if (this.c.contains(Integer.valueOf(i3))) {
                    float f14 = this.p;
                    canvas.drawLine(f12, f14, f12, (i2 + i2) - f14, this.m);
                }
                float f15 = this.n[i3] / 2.0f;
                float f16 = i2;
                canvas.drawLine(f12, f16 - f15, f12, f16 + f15, this.l);
                f12 -= this.d;
            }
            float f17 = f4 + f + f3;
            float f18 = (f9 - (f10 * this.d)) + (this.o / 2.0f);
            while (f18 < i - f2) {
                float[] fArr = this.n;
                if (f8 >= fArr.length) {
                    return;
                }
                int i4 = (int) f8;
                float f19 = fArr[i4] / 2.0f;
                if (this.c.contains(Integer.valueOf(i4))) {
                    float f20 = this.p;
                    canvas.drawLine(f18, f20, f18, (i2 + i2) - f20, this.m);
                }
                if (f18 < f9 - f5) {
                    paint = this.l;
                } else if (f18 < f17) {
                    paint = f8 < f7 ? this.j : this.k;
                } else {
                    paint = this.l;
                }
                Paint paint2 = paint;
                float f21 = i2;
                canvas.drawLine(f18, f21 - f19, f18, f21 + f19, paint2);
                f18 += this.d;
                if (z && f18 >= f17) {
                    return;
                } else {
                    f8 += 1.0f;
                }
            }
        }
    }

    public final void c() {
        float dimension = this.i.getResources().getDimension(R.dimen.camera_music_waveform_stroke_width);
        this.o = dimension;
        this.d = dimension + this.i.getResources().getDimension(R.dimen.camera_music_waveform_space_width);
        this.p = this.i.getResources().getDimension(R.dimen.music_waveform_dsp_padding);
        h(this.j, wbs.Q(this.i, R.attr.ytBrandLinkText));
        h(this.k, wbs.Q(this.i, R.attr.ytIconInactive));
        h(this.l, wbs.Q(this.i, R.attr.ytIconDisabled));
        h(this.m, wbs.Q(this.i, R.attr.ytBrandLinkText));
    }

    public final void d(long j, long j2, float f) {
        g(j, j2, f, amru.q());
        int i = 0;
        while (true) {
            float[] fArr = this.n;
            if (i >= fArr.length) {
                return;
            }
            fArr[i] = this.h[i % 11];
            i++;
        }
    }

    public final void e(long j, long j2, float f, byte[] bArr, int i, amru amruVar) {
        g(j, j2, f, amruVar);
        float millis = ((float) TimeUnit.SECONDS.toMillis(1L)) / this.e;
        int i2 = 0;
        while (true) {
            float[] fArr = this.n;
            if (i2 >= fArr.length) {
                return;
            }
            float f2 = i2 / millis;
            float f3 = i;
            int i3 = (int) (f2 * f3);
            int i4 = i3 + 1;
            int length = bArr.length;
            if (i3 >= length) {
                i3 = length - 1;
            }
            if (i4 >= length) {
                i4 = length - 1;
            }
            float f4 = i3 / f3;
            float f5 = i4 / f3;
            byte b2 = bArr[i3];
            byte b3 = bArr[i4];
            float f6 = this.f;
            float f7 = this.g;
            fArr[i2] = ((((((a(b2) * (f5 - f2)) + (a(b3) * (f2 - f4))) / (f5 - f4)) + 0.0f) * (f6 - f7)) / 127.0f) + f7;
            i2++;
        }
    }
}
