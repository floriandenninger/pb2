package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzm implements tzl {
    public Context a;

    static final Rect c(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        if (f4 == f) {
            return new Rect(0, 0, width, height);
        }
        if (f4 > f) {
            int i = (int) (f * f3);
            int i2 = (width - i) / 2;
            return new Rect(i2, 0, i + i2, height);
        }
        int i3 = (height - ((int) (f2 * f))) / 2;
        return new Rect(0, i3, width, i3 + width);
    }

    static final Rect d(Bitmap bitmap) {
        return c(bitmap, 1.0f);
    }

    private static final void e(Canvas canvas, List list) {
        Paint paint = new Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        int size = list.size();
        if (size == 0) {
            tzk.b("ChimeImageProcessorImpl", "Got empty list of avatars to merge.", new Object[0]);
            return;
        }
        if (size == 1) {
            canvas.drawBitmap((Bitmap) list.get(0), d((Bitmap) list.get(0)), new Rect(0, 0, width, width), paint);
            return;
        }
        if (size == 2) {
            canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), c((Bitmap) list.get(1), 0.5f), new Rect(i, 0, width, width), paint);
            return;
        }
        if (size == 3) {
            canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), d((Bitmap) list.get(1)), new Rect(i, 0, width, i), paint);
            canvas.drawBitmap((Bitmap) list.get(2), d((Bitmap) list.get(2)), new Rect(i, i, width, width), paint);
            return;
        }
        canvas.drawBitmap((Bitmap) list.get(0), d((Bitmap) list.get(0)), new Rect(0, 0, i, i), paint);
        canvas.drawBitmap((Bitmap) list.get(1), d((Bitmap) list.get(1)), new Rect(i, 0, width, i), paint);
        canvas.drawBitmap((Bitmap) list.get(2), d((Bitmap) list.get(2)), new Rect(0, i, i, width), paint);
        canvas.drawBitmap((Bitmap) list.get(3), d((Bitmap) list.get(3)), new Rect(i, i, width, width), paint);
    }

    @Override // defpackage.tzl
    public final Bitmap a(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            e(canvas, list);
            Paint paint = new Paint();
            int width = canvas.getWidth();
            int i2 = width / 2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(width / 4);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            float f = i2;
            canvas.drawCircle(f, f, i2 + (r4 / 2), paint);
            return createBitmap;
        } catch (Exception e) {
            tzk.c("ChimeImageProcessorImpl", e, "Failed to create circular avatar.", new Object[0]);
            return null;
        } catch (OutOfMemoryError e2) {
            tzk.c("ChimeImageProcessorImpl", e2, "Failed to allocate memory.", new Object[0]);
            return null;
        }
    }

    @Override // defpackage.tzl
    public final Bitmap b(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notifications_avatar_separator_stroke_width);
            e(canvas, list);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimensionPixelSize);
            paint.setColor(-16777216);
            int width = canvas.getWidth();
            int i2 = width / 2;
            int size = list.size();
            if (size == 0) {
                tzk.b("ChimeImageProcessorImpl", "Got empty list of images to draw seprator on.", new Object[0]);
            } else if (size == 1) {
                tzk.e("ChimeImageProcessorImpl", "Not adding any separators since there is only one image.", new Object[0]);
            } else if (size == 2) {
                float f = i2;
                canvas.drawLine(f, 0.0f, f, width, paint);
            } else if (size == 3) {
                float f2 = i2;
                float f3 = width;
                canvas.drawLine(f2, 0.0f, f2, f3, paint);
                canvas.drawLine(f2, f2, f3, f2, paint);
            } else {
                float f4 = i2;
                float f5 = width;
                canvas.drawLine(f4, 0.0f, f4, f5, paint);
                canvas.drawLine(0.0f, f4, f5, f4, paint);
            }
            return createBitmap;
        } catch (Exception e) {
            tzk.c("ChimeImageProcessorImpl", e, "Failed to create square avatar.", new Object[0]);
            return null;
        } catch (OutOfMemoryError e2) {
            tzk.c("ChimeImageProcessorImpl", e2, "Failed to allocate memory.", new Object[0]);
            return null;
        }
    }
}
