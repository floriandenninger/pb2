package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class san {
    public final RectF a = new RectF();
    public final sap b;

    public san(sap sapVar) {
        sbt.h(sapVar);
        this.b = sapVar;
    }

    public static float a(float f, float f2, float f3) {
        float abs = Math.abs(f - f2);
        if (abs >= f3) {
            return 0.0f;
        }
        float f4 = f3 - abs;
        return f3 - ((float) Math.sqrt((f3 * f3) - (f4 * f4)));
    }

    public static float b(Paint paint) {
        if (e(paint)) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public static void c(Paint paint, float f, float f2) {
        paint.setStrokeWidth(Math.min(paint.getStrokeWidth(), Math.abs(f - f2)));
    }

    public static boolean d(Paint paint) {
        return paint.getStyle() == Paint.Style.FILL || paint.getStyle() == Paint.Style.FILL_AND_STROKE;
    }

    public static boolean e(Paint paint) {
        return paint.getStyle() == Paint.Style.STROKE || paint.getStyle() == Paint.Style.FILL_AND_STROKE;
    }
}
