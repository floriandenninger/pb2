package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.alll;
import defpackage.allm;
import defpackage.jw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements alll {
    public TextView a;
    public Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    private final boolean c(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        if (jw.ao(textView)) {
            jw.Y(textView, jw.i(textView), i2, jw.h(textView), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }

    @Override // defpackage.alll
    public final void a() {
        this.a.setAlpha(0.0f);
        this.a.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        }
    }

    @Override // defpackage.alll
    public final void b() {
        this.a.setAlpha(1.0f);
        this.a.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.c > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.c;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        int lineCount = this.a.getLayout().getLineCount();
        if (lineCount <= 1 || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (lineCount <= 1) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, allm.a);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }
}
