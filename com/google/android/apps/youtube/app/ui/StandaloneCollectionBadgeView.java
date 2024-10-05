package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.jw;
import defpackage.psy;
import defpackage.yjk;
import java.util.HashMap;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StandaloneCollectionBadgeView extends ViewGroup {
    private TextView a;
    private TextView b;
    private HashMap c;
    private int d;

    public StandaloneCollectionBadgeView(Context context) {
        super(context);
    }

    private final void a(View view, int i, int i2) {
        if (this.c.containsKey(view)) {
            return;
        }
        this.c.put(view, new psy(i, i2, (char[]) null));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.collection_badge_icon);
        this.b = (TextView) findViewById(R.id.collection_badge_label);
        this.c = new HashMap();
        this.d = yjk.K(getResources().getDisplayMetrics(), 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8 && this.c.containsKey(childAt)) {
                psy psyVar = (psy) this.c.get(childAt);
                if (jw.e(this) == 1) {
                    i5 = i7 - psyVar.a;
                    i6 = i7 - psyVar.b;
                } else {
                    i5 = psyVar.b;
                    i6 = psyVar.a;
                }
                childAt.layout(i5, 0, i6, i4 - i2);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int measuredWidth = (getMeasuredWidth() - paddingLeft) - paddingRight;
        this.c.clear();
        int visibility = this.b.getVisibility();
        if (visibility == 0) {
            measureChild(this.b, View.MeasureSpec.makeMeasureSpec(measuredWidth, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = this.b.getMeasuredHeight();
            int measuredWidth2 = this.b.getMeasuredWidth();
            i5 = Math.max(0, this.b.getMeasuredWidth()) + this.d;
            i4 = measuredWidth2;
            i3 = measuredHeight;
            visibility = 0;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (this.a.getVisibility() == 0) {
            measureChild(this.a, View.MeasureSpec.makeMeasureSpec(measuredWidth - i5, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(0, 0));
            i6 = this.a.getMeasuredHeight();
            i7 = this.a.getMeasuredWidth();
            a(this.a, paddingLeft, paddingLeft + i7);
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (visibility == 0) {
            int i8 = paddingLeft + i7 + (this.a.getVisibility() == 0 ? this.d : 0);
            TextView textView = this.b;
            a(textView, i8, textView.getMeasuredWidth() + i8);
        }
        setMeasuredDimension(i4 + i7 + paddingLeft + paddingRight, Math.max(i3, i6) + paddingTop + paddingBottom);
    }

    public StandaloneCollectionBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StandaloneCollectionBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StandaloneCollectionBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
