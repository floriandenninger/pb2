package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljx {
    private static final int[] b = {R.attr.state_pressed};
    private static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] d = {R.attr.state_selected};
    private static final int[] e = {R.attr.state_enabled, R.attr.state_pressed};
    static final String a = "aljx";

    private aljx() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{d, StateSet.NOTHING}, new int[]{c(colorStateList, c), c(colorStateList, b)});
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(e, 0)) != 0) {
                Log.w(a, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int alpha = Color.alpha(colorForState);
        return fm.f(colorForState, Math.min(alpha + alpha, PrivateKeyType.INVALID));
    }
}
