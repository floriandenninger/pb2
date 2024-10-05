package com.google.android.apps.youtube.app.red.presenter;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.jw;
import defpackage.yjk;
import java.util.HashMap;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CompactYpcOfferModuleView extends ViewGroup {
    public TextView a;
    public TextView b;
    public TextView c;
    private HashMap d;
    private int e;

    public CompactYpcOfferModuleView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        inflate(getContext(), R.layout.compact_ypc_offer_module, this);
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.subtitle);
        this.c = (TextView) findViewById(R.id.button);
        this.e = yjk.K(getResources().getDisplayMetrics(), 8);
        this.d = new HashMap();
    }

    private final void b(View view, int i, int i2, int i3, int i4) {
        if (!this.d.containsKey(view)) {
            this.d.put(view, new Rect());
        }
        ((Rect) this.d.get(view)).set(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                Rect rect = (Rect) this.d.get(childAt);
                if (jw.e(this) == 1) {
                    i5 = i7 - rect.right;
                    i6 = i7 - rect.left;
                } else {
                    i5 = rect.left;
                    i6 = rect.right;
                }
                childAt.layout(i5, rect.top, i6, rect.bottom);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int size = (View.MeasureSpec.getSize(i) - paddingLeft) - paddingRight;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.d.clear();
        if (this.a.getVisibility() != 8) {
            this.a.measure(makeMeasureSpec, makeMeasureSpec2);
            TextView textView = this.a;
            b(textView, paddingLeft, paddingTop, paddingLeft + textView.getMeasuredWidth(), paddingTop + this.a.getMeasuredHeight());
            int measuredHeight = this.a.getMeasuredHeight() + paddingTop;
            i4 = Math.max(0, this.a.getMeasuredWidth());
            i3 = measuredHeight;
        } else {
            i3 = paddingTop;
            i4 = 0;
        }
        if (this.b.getVisibility() != 8) {
            this.b.measure(makeMeasureSpec, makeMeasureSpec2);
            TextView textView2 = this.b;
            b(textView2, paddingLeft, i3, paddingLeft + textView2.getMeasuredWidth(), i3 + this.b.getMeasuredHeight());
            i3 += this.b.getMeasuredHeight();
            i4 = Math.max(i4, this.b.getMeasuredWidth());
        }
        if (this.c.getVisibility() != 8) {
            this.c.measure(makeMeasureSpec2, makeMeasureSpec2);
            int measuredWidth2 = this.c.getMeasuredWidth();
            int i5 = this.e;
            if (i4 + measuredWidth2 + i5 >= size) {
                paddingTop = i3 + i5;
                measuredWidth = paddingLeft;
            } else {
                measuredWidth = (paddingLeft + size) - this.c.getMeasuredWidth();
            }
            TextView textView3 = this.c;
            b(textView3, measuredWidth, paddingTop, measuredWidth + textView3.getMeasuredWidth(), paddingTop + this.c.getMeasuredHeight());
            if (this.c.getMeasuredHeight() + paddingTop > i3) {
                i3 = paddingTop + this.c.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size + paddingLeft + paddingRight, i3 + paddingBottom);
    }

    public CompactYpcOfferModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CompactYpcOfferModuleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public CompactYpcOfferModuleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
