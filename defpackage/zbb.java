package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbb {
    public final View a;
    private GradientDrawable b;

    public zbb(View view) {
        this.a = view;
    }

    public final void a(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            whu.I(this.a, false);
            return;
        }
        if (this.b == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.b = gradientDrawable;
            this.a.setBackground(gradientDrawable);
        }
        if (length == 1) {
            iArr = new int[]{iArr[0], iArr[0]};
        }
        this.b.setColors(iArr);
        whu.I(this.a, true);
    }
}
