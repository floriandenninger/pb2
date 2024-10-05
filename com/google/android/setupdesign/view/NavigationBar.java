package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NavigationBar extends LinearLayout implements View.OnClickListener {
    public NavigationBar(Context context) {
        super(a(context));
        b();
    }

    private static Context a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudNavBarTheme, android.R.attr.colorForeground, android.R.attr.colorBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            resourceId = fArr[2] > fArr2[2] ? R.style.SudNavBarThemeDark : R.style.SudNavBarThemeLight;
        }
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    private final void b() {
        if (isInEditMode()) {
            return;
        }
        View.inflate(getContext(), R.layout.sud_navbar_view, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(a(context), attributeSet);
        b();
    }

    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(a(context), attributeSet, i);
        b();
    }
}
