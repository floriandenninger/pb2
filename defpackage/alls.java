package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alls extends alkd {
    private static float G(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    private static float H(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.alkd
    public final void y(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float H;
        float G;
        RectF x = x(tabLayout, view);
        RectF x2 = x(tabLayout, view2);
        if (x.left < x2.left) {
            H = G(f);
            G = H(f);
        } else {
            H = H(f);
            G = G(f);
        }
        drawable.setBounds(aleq.c((int) x.left, (int) x2.left, H), drawable.getBounds().top, aleq.c((int) x.right, (int) x2.right, G), drawable.getBounds().bottom);
    }
}
