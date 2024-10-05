package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cys {
    public static final Lock a;
    private static final Paint b = new Paint(6);
    private static final Paint c = new Paint(7);
    private static final Paint d;
    private static final Set e;

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        e = hashSet;
        a = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new cyr();
        Paint paint = new Paint(7);
        d = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static int a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap.Config b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static Bitmap c(ctm ctmVar, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        Bitmap a2 = ctmVar.a(i, i2, b(bitmap));
        i(bitmap, a2);
        h(bitmap, a2, matrix);
        return a2;
    }

    public static Bitmap d(ctm ctmVar, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? f(ctmVar, bitmap, i, i2) : bitmap;
    }

    public static Bitmap e(ctm ctmVar, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = min;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap l = l(ctmVar, bitmap);
        Bitmap a2 = ctmVar.a(min, min, k(bitmap));
        a2.setHasAlpha(true);
        Lock lock = a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawCircle(f2, f2, f2, c);
            canvas.drawBitmap(l, (Rect) null, rectF, d);
            m(canvas);
            lock.unlock();
            if (!l.equals(bitmap)) {
                ctmVar.d(l);
            }
            return a2;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    public static Bitmap f(ctm ctmVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        Bitmap a2 = ctmVar.a((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), b(bitmap));
        i(bitmap, a2);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        h(bitmap, a2, matrix);
        return a2;
    }

    public static Bitmap g(ctm ctmVar, Bitmap bitmap, int i) {
        did.aq(i > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config k = k(bitmap);
        Bitmap l = l(ctmVar, bitmap);
        Bitmap a2 = ctmVar.a(l.getWidth(), l.getHeight(), k);
        a2.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(l, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, a2.getWidth(), a2.getHeight());
        Lock lock = a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i;
            canvas.drawRoundRect(rectF, f, f, paint);
            m(canvas);
            lock.unlock();
            if (!l.equals(bitmap)) {
                ctmVar.d(l);
            }
            return a2;
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    public static void h(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = a;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, b);
            m(canvas);
            lock.unlock();
        } catch (Throwable th) {
            a.unlock();
            throw th;
        }
    }

    public static void i(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static boolean j(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    private static Bitmap.Config k(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    private static Bitmap l(ctm ctmVar, Bitmap bitmap) {
        Bitmap.Config k = k(bitmap);
        if (k.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap a2 = ctmVar.a(bitmap.getWidth(), bitmap.getHeight(), k);
        new Canvas(a2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return a2;
    }

    private static void m(Canvas canvas) {
        canvas.setBitmap(null);
    }
}
