package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.mediarouter.app.MediaRouteVolumeSlider;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ji {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect a(View view) {
        return view.getClipBounds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(View view) {
        return view.isInLayout();
    }

    public static float d(EdgeEffect edgeEffect) {
        if (aij.f()) {
            return ll.jD(edgeEffect);
        }
        return 0.0f;
    }

    public static float e(EdgeEffect edgeEffect, float f, float f2) {
        if (!aij.f()) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        return ll.jE(edgeEffect, f, f2);
    }

    public static EdgeEffect f(Context context, AttributeSet attributeSet) {
        if (aij.f()) {
            return ll.c(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float s(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static int t(Context context) {
        int x = x(context, com.google.android.youtube.R.attr.mediaRouteTheme);
        return x == 0 ? v(context) : x;
    }

    public static int u(Context context, int i) {
        return fm.a(-1, w(context, i, com.google.android.youtube.R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static int v(Context context) {
        TypedValue typedValue = new TypedValue();
        return (!context.getTheme().resolveAttribute(com.google.android.youtube.R.attr.isLightTheme, typedValue, true) || typedValue.data == 0) ? u(context, 0) == -570425344 ? com.google.android.youtube.R.style.Theme_MediaRouter_LightControlPanel : com.google.android.youtube.R.style.Theme_MediaRouter : u(context, 0) == -570425344 ? com.google.android.youtube.R.style.Theme_MediaRouter_Light : com.google.android.youtube.R.style.Theme_MediaRouter_Light_DarkControlPanel;
    }

    public static int w(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int x(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Context y(Context context, int i, boolean z) {
        if (i == 0) {
            i = x(context, true != z ? com.google.android.youtube.R.attr.dialogTheme : com.google.android.youtube.R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return x(contextThemeWrapper, com.google.android.youtube.R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, v(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static void z(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int u = u(context, 0);
        if (Color.alpha(u) != 255) {
            u = fm.e(u, ((Integer) view.getTag()).intValue());
        }
        if (mediaRouteVolumeSlider.a != u) {
            if (Color.alpha(u) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(u));
            }
            mediaRouteVolumeSlider.a = u;
        }
        if (mediaRouteVolumeSlider.b != u) {
            if (Color.alpha(u) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(u));
            }
            mediaRouteVolumeSlider.b = u;
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j(bpv bpvVar) {
    }

    public void k(bpv bpvVar) {
    }

    public void l(bpv bpvVar) {
    }

    @Deprecated
    public void m() {
    }

    public void n(bpv bpvVar) {
    }

    public void o(bqf bqfVar) {
    }

    public void p(bpv bpvVar, int i) {
        q();
    }

    @Deprecated
    public void q() {
    }

    public void r(bpv bpvVar, int i) {
        m();
    }
}
