package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajxk extends uyt {
    @Override // defpackage.uyt, defpackage.bv, defpackage.ce
    public void mS() {
        int i;
        int i2;
        super.mS();
        Window window = this.d.getWindow();
        Context qR = qR();
        TypedArray obtainStyledAttributes = qR.getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        int N = yjk.N(qR);
        if (yjk.Z(qR)) {
            i2 = dimension * 4;
        } else {
            if (!yjk.aa(qR)) {
                i = -1;
                window.setLayout(i, -2);
                this.d.getWindow().setBackgroundDrawable(new ColorDrawable(wbs.Q(qR(), com.google.android.youtube.R.attr.ytBrandBackgroundSolid)));
            }
            i2 = dimension + dimension;
        }
        i = N - i2;
        window.setLayout(i, -2);
        this.d.getWindow().setBackgroundDrawable(new ColorDrawable(wbs.Q(qR(), com.google.android.youtube.R.attr.ytBrandBackgroundSolid)));
    }
}
