package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnk extends si {
    public final vh a;
    private final AccessibilityManager b;
    private final Rect c;

    public alnk(Context context, AttributeSet attributeSet) {
        super(aloa.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.c = new Rect();
        Context context2 = getContext();
        TypedArray a = alig.a(context2, attributeSet, alns.a, R.attr.autoCompleteTextViewStyle, 2132084236, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.b = (AccessibilityManager) context2.getSystemService("accessibility");
        vh vhVar = new vh(context2);
        this.a = vhVar;
        vhVar.z();
        vhVar.l = this;
        vhVar.y();
        vhVar.e(getAdapter());
        vhVar.m = new alnj(this);
        a.recycle();
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void a(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.h) ? super.getHint() : b.c();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.h && super.getHint() == null && akwg.p()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i3 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                int min = Math.min(adapter.getCount(), Math.max(0, this.a.o()) + 15);
                int max = Math.max(0, min - 15);
                View view = null;
                int i4 = 0;
                while (max < min) {
                    int itemViewType = adapter.getItemViewType(max);
                    int i5 = itemViewType != i3 ? itemViewType : i3;
                    if (itemViewType != i3) {
                        view = null;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                    max++;
                    i3 = i5;
                }
                Drawable c = this.a.c();
                if (c != null) {
                    c.getPadding(this.c);
                    i4 += this.c.left + this.c.right;
                }
                i3 = i4 + b.l.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.a.s();
        }
    }
}
