package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class snt implements syz {
    private final syd a;

    public snt(syd sydVar) {
        this.a = sydVar;
    }

    private static int c(dhe dheVar, awps awpsVar, syd sydVar) {
        Context context = dheVar.b;
        int i = awpsVar.c;
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            sydVar.b(22, String.format(Locale.US, "Ripple color (attribute = %s) not defined in the theme", "android.R.attr.colorControlHighlight"));
            return 0;
        }
        try {
            return aih.d(context, typedValue.resourceId);
        } catch (Resources.NotFoundException e) {
            sydVar.d(22, String.format(Locale.US, "Ripple Color (attribute = %s) is associated with undefined (colorId = %s)", "android.R.attr.colorControlHighlight", Integer.toHexString(typedValue.resourceId)), e);
            return 0;
        }
    }

    private static void d(awps awpsVar, RippleDrawable rippleDrawable, DisplayMetrics displayMetrics) {
        int i;
        if (Build.VERSION.SDK_INT < 23 || (i = awpsVar.d) == 0) {
            return;
        }
        rippleDrawable.setRadius(Math.round(TypedValue.applyDimension(1, i, displayMetrics)));
    }

    @Override // defpackage.syz
    public final aomu a() {
        return awps.b;
    }

    @Override // defpackage.syz
    public final /* synthetic */ void b(dhe dheVar, Object obj, syy syyVar) {
        awps awpsVar = (awps) obj;
        int c = c(dheVar, awpsVar, this.a);
        if (c == 0) {
            return;
        }
        boolean z = awpsVar.e;
        Drawable drawable = syyVar.d;
        DisplayMetrics displayMetrics = dheVar.b().getDisplayMetrics();
        sue sueVar = null;
        if (z) {
            if (drawable == null) {
                sueVar = new sue();
                sueVar.c = -1;
                sueVar.d = syyVar.a;
            }
            RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(c), drawable, sueVar);
            d(awpsVar, rippleDrawable, displayMetrics);
            syyVar.d = rippleDrawable;
            return;
        }
        RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(c), null, null);
        d(awpsVar, rippleDrawable2, displayMetrics);
        if (drawable == null) {
            syyVar.d = rippleDrawable2;
        } else {
            syyVar.d = new LayerDrawable(new Drawable[]{drawable, rippleDrawable2});
        }
    }
}
