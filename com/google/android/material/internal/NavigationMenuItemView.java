package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.alhy;
import defpackage.alhz;
import defpackage.gm;
import defpackage.ic;
import defpackage.jw;
import defpackage.qt;
import defpackage.rf;
import defpackage.uw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends alhy implements rf {
    private static final int[] d = {R.attr.state_checked};
    public boolean c;
    private int e;
    private final CheckedTextView f;
    private FrameLayout g;
    private qt h;
    private final ic i;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.rf
    public final qt a() {
        return this.h;
    }

    @Override // defpackage.rf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.rf
    public final void f(qt qtVar) {
        StateListDrawable stateListDrawable;
        this.h = qtVar;
        int i = qtVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != qtVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.youtube.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(d, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            jw.O(this, stateListDrawable);
        }
        boolean isCheckable = qtVar.isCheckable();
        refreshDrawableState();
        if (this.c != isCheckable) {
            this.c = isCheckable;
            this.i.f(this.f, 2048);
        }
        boolean isChecked = qtVar.isChecked();
        refreshDrawableState();
        this.f.setChecked(isChecked);
        setEnabled(qtVar.isEnabled());
        this.f.setText(qtVar.d);
        Drawable icon = qtVar.getIcon();
        if (icon != null) {
            int i2 = this.e;
            icon.setBounds(0, 0, i2, i2);
        }
        this.f.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = qtVar.getActionView();
        if (actionView != null) {
            if (this.g == null) {
                this.g = (FrameLayout) ((ViewStub) findViewById(com.google.android.youtube.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.g.removeAllViews();
            this.g.addView(actionView);
        }
        setContentDescription(qtVar.l);
        gm.r(this, qtVar.m);
        qt qtVar2 = this.h;
        if (qtVar2.d != null || qtVar2.getIcon() != null || this.h.getActionView() == null) {
            this.f.setVisibility(0);
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                uw uwVar = (uw) frameLayout.getLayoutParams();
                uwVar.width = -2;
                this.g.setLayoutParams(uwVar);
                return;
            }
            return;
        }
        this.f.setVisibility(8);
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 != null) {
            uw uwVar2 = (uw) frameLayout2.getLayoutParams();
            uwVar2.width = -1;
            this.g.setLayoutParams(uwVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        qt qtVar = this.h;
        if (qtVar != null && qtVar.isCheckable() && this.h.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        alhz alhzVar = new alhz(this);
        this.i = alhzVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.youtube.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.e = context.getResources().getDimensionPixelSize(com.google.android.youtube.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.youtube.R.id.design_menu_item_text);
        this.f = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        jw.M(checkedTextView, alhzVar);
    }
}
