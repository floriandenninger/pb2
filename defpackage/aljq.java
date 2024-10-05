package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljq extends su {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public aljq(Context context, AttributeSet attributeSet) {
        super(aloa.a(context, attributeSet, com.google.android.youtube.R.attr.radioButtonStyle, com.google.android.youtube.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray a2 = alig.a(context2, attributeSet, aljr.a, com.google.android.youtube.R.attr.radioButtonStyle, com.google.android.youtube.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (a2.hasValue(0)) {
            setButtonTintList(alkd.e(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int j = alkd.j(this, com.google.android.youtube.R.attr.colorControlActivated);
                int j2 = alkd.j(this, com.google.android.youtube.R.attr.colorOnSurface);
                int j3 = alkd.j(this, com.google.android.youtube.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{akwg.s(j3, j, 1.0f), akwg.s(j3, j2, 0.54f), akwg.s(j3, j2, 0.38f), akwg.s(j3, j2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }
}
