package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ll {
    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static Path g(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static float jD(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float jE(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public void d(Rect rect, View view, RecyclerView recyclerView, ws wsVar) {
        ((we) view.getLayoutParams()).pL();
        rect.set(0, 0, 0, 0);
    }

    public void e(Canvas canvas, RecyclerView recyclerView) {
    }

    public void f(Canvas canvas, RecyclerView recyclerView) {
    }
}
