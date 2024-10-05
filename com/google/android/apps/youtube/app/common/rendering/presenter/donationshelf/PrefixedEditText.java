package com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PrefixedEditText extends TextInputEditText {
    public String a;
    public float[] b;
    public int c;
    private boolean d;
    private int e;

    public PrefixedEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String str = this.a;
        if (str != null) {
            canvas.drawText(str, this.e, getLineBounds(0, null), getPaint());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d || this.a == null) {
            return;
        }
        getPaint().getTextWidths(this.a, this.b);
        float f = 0.0f;
        for (float f2 : this.b) {
            f += f2;
        }
        int compoundPaddingLeft = getCompoundPaddingLeft();
        this.e = compoundPaddingLeft;
        double d = f;
        Double.isNaN(d);
        setPadding(((int) (d + 0.5d)) + compoundPaddingLeft + this.c, getPaddingRight(), getPaddingTop(), getPaddingBottom());
        this.d = true;
    }

    public PrefixedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrefixedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
