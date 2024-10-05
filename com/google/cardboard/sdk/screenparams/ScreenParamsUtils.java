package com.google.cardboard.sdk.screenparams;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ScreenParamsUtils {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ScreenPixelDensity {
        public final float xdpi;
        public final float ydpi;

        public ScreenPixelDensity(float f, float f2) {
            this.xdpi = f;
            this.ydpi = f2;
        }
    }

    private ScreenParamsUtils() {
    }

    public static ScreenPixelDensity getScreenPixelDensity(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT <= 29) {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            context.getDisplay().getMetrics(displayMetrics);
        }
        return new ScreenPixelDensity(displayMetrics.xdpi, displayMetrics.ydpi);
    }
}
