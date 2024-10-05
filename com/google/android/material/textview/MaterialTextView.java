package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.alkd;
import defpackage.alnz;
import defpackage.aloa;
import defpackage.jm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = alkd.d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private final void b(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, alnz.a);
        int a = a(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            jm.r(this, a);
        }
    }

    private static boolean c(Context context) {
        return alkd.m(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (c(context)) {
            b(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(aloa.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (c(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, alnz.b, i, i2);
            int a = a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, alnz.b, i, i2);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                b(theme, resourceId);
            }
        }
    }
}
