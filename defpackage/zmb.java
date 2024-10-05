package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.google.android.youtube.R;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zmb extends Drawable implements zmd, vsz {
    public int a;
    public final Paint b;
    private final zme c;
    private final vsy d;
    private final vsm e;
    private final Paint f;
    private final Handler g;

    public zmb(zme zmeVar, vsy vsyVar, vsm vsmVar, Resources resources) {
        zmeVar.getClass();
        this.c = zmeVar;
        vsyVar.getClass();
        this.d = vsyVar;
        vsyVar.q(this);
        vsmVar.getClass();
        this.e = vsmVar;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(resources.getColor(R.color.video_trim_view_waveform_background));
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setColor(resources.getColor(R.color.video_trim_view_waveform_fill));
        paint2.setStyle(Paint.Style.FILL);
        this.g = new Handler(Looper.getMainLooper());
        zmeVar.f = this;
    }

    @Override // defpackage.vsz
    public final void a(vsy vsyVar, Set set) {
    }

    @Override // defpackage.vsz
    public final void b(vsy vsyVar, int i) {
        if (i == 0 || i == 3) {
            d();
        }
    }

    @Override // defpackage.vsz
    public final void c(vsy vsyVar, Set set) {
    }

    public final void d() {
        this.g.post(new zma(this));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawRect(bounds, this.b);
        if (this.c.c() <= 0) {
            return;
        }
        int width = bounds.width();
        float f = this.a / (width - (r4 + r4));
        long e = this.e.e(-f);
        long e2 = this.e.e(f + 1.0f);
        ShortBuffer asShortBuffer = ByteBuffer.wrap(this.c.d.toByteArray()).asShortBuffer();
        long d = this.c.d();
        int n = (int) ((this.d.n() + this.d.g()) / d);
        int i = ((int) (e / d)) - n;
        int i2 = (((int) (e2 / d)) - n) + 1;
        Rect rect = new Rect(bounds.left + this.a, bounds.top, bounds.right - this.a, bounds.bottom);
        Path path = new Path();
        vsm vsmVar = this.e;
        int max = Math.max(i, 0);
        int min = Math.min(i2, asShortBuffer.limit());
        float f2 = bounds.left - 2.0f;
        float f3 = (float) ((e2 - e) / (i2 - i));
        int i3 = max;
        float f4 = 0.0f;
        while (i3 < min) {
            f4 = Math.max(f4, asShortBuffer.get(i3) / 32767.0f);
            float f5 = f3;
            float b = rect.left + (vsmVar.b(((i3 - i) * f3) + e) * rect.width());
            if (i3 == max) {
                path.moveTo(b, rect.centerY());
            }
            if (b >= 2.0f + f2) {
                path.lineTo(b, rect.centerY() + (f4 * rect.height() * 0.5f));
                f2 = b;
                f4 = 0.0f;
            }
            if (i3 == min - 1) {
                path.lineTo(b, rect.centerY());
            }
            i3++;
            f3 = f5;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f, 0.0f, bounds.centerY());
        path.addPath(path, matrix);
        canvas.save();
        canvas.clipRect(bounds);
        canvas.drawPath(path, this.f);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
