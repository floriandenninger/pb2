package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahkt {
    public static final Boolean a = false;

    public static float a(float f) {
        return f * 0.1f;
    }

    public static int b(float f) {
        return (int) (f / 0.1f);
    }

    public static Bitmap c() {
        return Bitmap.createBitmap(80, 30, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap d(Resources resources, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static FloatBuffer e(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        return asFloatBuffer;
    }

    public static void f() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            zga.b(valueOf.length() != 0 ? "GL error ".concat(valueOf) : new String("GL error "));
            if (i == 0) {
                i = glGetError;
            }
        }
        if (i != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i));
            throw new ahkr(valueOf2.length() != 0 ? "GL error ".concat(valueOf2) : new String("GL error "));
        }
    }

    public static void g(int i) {
        if (!a.booleanValue() && i == 0) {
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                }
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                zga.b(valueOf.length() != 0 ? "GL error ".concat(valueOf) : new String("GL error "));
            }
            throw new ahkr("Invalid GL object");
        }
    }

    @Deprecated
    public static void h(Bitmap bitmap, String str) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize(20.0f);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        new StaticLayout(str, textPaint, bitmap.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true).draw(canvas);
    }

    public static boolean i(float f, float f2) {
        return j(f, f2, 1.0E-5f);
    }

    public static boolean j(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }

    public static boolean k(float f) {
        return i(f, 0.0f);
    }

    public static float l(float f) {
        if (f < 200.0f) {
            return 200.0f;
        }
        if (f > 10000.0f) {
            return 10000.0f;
        }
        return f;
    }

    public static void m(float[] fArr, float[] fArr2) {
        float atan2;
        float f;
        if (fArr.length < 3) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        float asin = (float) Math.asin(fArr2[6]);
        float f2 = fArr2[6];
        if (Math.sqrt(1.0f - (f2 * f2)) >= 0.009999999776482582d) {
            f = (float) Math.atan2(-fArr2[2], fArr2[10]);
            atan2 = (float) Math.atan2(-fArr2[4], fArr2[5]);
        } else {
            atan2 = (float) Math.atan2(fArr2[1], fArr2[0]);
            f = 0.0f;
        }
        fArr[0] = -asin;
        fArr[1] = -f;
        fArr[2] = -atan2;
    }
}
