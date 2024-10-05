package com.google.android.setupdesign.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CheckableLinearLayout extends LinearLayout implements Checkable {
    private boolean a;

    public CheckableLinearLayout(Context context) {
        super(context);
        this.a = false;
        setFocusable(true);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        if (this.a) {
            return mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{R.attr.state_checked});
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        setFocusable(true);
    }

    public CheckableLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        setFocusable(true);
    }
}
