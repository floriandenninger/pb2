package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import defpackage.algc;
import defpackage.algm;
import defpackage.algn;
import defpackage.algo;
import defpackage.alig;
import defpackage.alkd;
import defpackage.alkl;
import defpackage.alkw;
import defpackage.aloa;
import defpackage.gl;
import defpackage.jw;
import defpackage.nz;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, alkw {
    private static final int[] b = {R.attr.state_checkable};
    private static final int[] c = {R.attr.state_checked};
    private final algn d;
    private final LinkedHashSet e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final String a() {
        return (true != d() ? Button.class : CompoundButton.class).getName();
    }

    private final void e() {
        if (i()) {
            setCompoundDrawablesRelative(this.h, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.h, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.h, null, null);
        }
    }

    private final void f(boolean z) {
        Drawable drawable = this.h;
        if (drawable != null) {
            Drawable mutate = gl.c(drawable).mutate();
            this.h = mutate;
            mutate.setTintList(this.g);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                this.h.setTintMode(mode);
            }
            int i = this.i;
            if (i == 0) {
                i = this.h.getIntrinsicWidth();
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i3 = this.j;
            int i4 = this.k;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.h.setVisible(true, z);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            if ((!i() || drawable3 == this.h) && ((!h() || drawable5 == this.h) && (!j() || drawable4 == this.h))) {
                return;
            }
            e();
            return;
        }
        e();
    }

    private final void g(int i, int i2) {
        if (this.h == null || getLayout() == null) {
            return;
        }
        if (i() || h()) {
            this.k = 0;
            int i3 = this.o;
            if (i3 == 1 || i3 == 3) {
                this.j = 0;
                f(false);
                return;
            }
            int i4 = this.i;
            if (i4 == 0) {
                i4 = this.h.getIntrinsicWidth();
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = (((((i - Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth())) - jw.h(this)) - i4) - this.l) - jw.i(this)) / 2;
            if ((jw.e(this) == 1) != (this.o == 4)) {
                min = -min;
            }
            if (this.j != min) {
                this.j = min;
                f(false);
                return;
            }
            return;
        }
        if (j()) {
            this.j = 0;
            if (this.o == 16) {
                this.k = 0;
                f(false);
                return;
            }
            int i5 = this.i;
            if (i5 == 0) {
                i5 = this.h.getIntrinsicHeight();
            }
            TextPaint paint2 = getPaint();
            String charSequence2 = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
            }
            Rect rect = new Rect();
            paint2.getTextBounds(charSequence2, 0, charSequence2.length(), rect);
            int min2 = (((((i2 - Math.min(rect.height(), getLayout().getHeight())) - getPaddingTop()) - i5) - this.l) - getPaddingBottom()) / 2;
            if (this.k != min2) {
                this.k = min2;
                f(false);
            }
        }
    }

    private final boolean h() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    private final boolean i() {
        int i = this.o;
        return i == 1 || i == 2;
    }

    private final boolean j() {
        int i = this.o;
        return i == 16 || i == 32;
    }

    private final boolean k() {
        algn algnVar = this.d;
        return (algnVar == null || algnVar.n) ? false : true;
    }

    public final void b(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public final boolean d() {
        algn algnVar = this.d;
        return algnVar != null && algnVar.o;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return k() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return k() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final ColorStateList getSupportBackgroundTintList() {
        return k() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return k() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (k()) {
            alkd.C(this, this.d.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (d()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        if (this.m) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a());
        accessibilityEvent.setChecked(this.m);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setChecked(this.m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        algn algnVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (algnVar = this.d) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        Drawable drawable = algnVar.m;
        if (drawable != null) {
            drawable.setBounds(algnVar.c, algnVar.e, i6 - algnVar.d, i5 - algnVar.f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setChecked(savedState.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.m;
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        g(i, i2);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        g(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (!k()) {
            super.setBackgroundColor(i);
            return;
        }
        algn algnVar = this.d;
        if (algnVar.a() != null) {
            algnVar.a().setTint(i);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (!k()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.d.c();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? nz.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (d() && isEnabled() && this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (this.n) {
                return;
            }
            this.n = true;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((algm) it.next()).a();
            }
            this.n = false;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (k()) {
            this.d.a().k(f);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!k()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        algn algnVar = this.d;
        if (algnVar.j != colorStateList) {
            algnVar.j = colorStateList;
            if (algnVar.a() != null) {
                algnVar.a().setTintList(algnVar.j);
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatButton
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!k()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        algn algnVar = this.d;
        if (algnVar.i != mode) {
            algnVar.i = mode;
            if (algnVar.a() == null || algnVar.i == null) {
                return;
            }
            algnVar.a().setTintMode(algnVar.i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.m);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.materialButtonStyle);
    }

    @Override // defpackage.alkw
    public final void c(alkl alklVar) {
        if (k()) {
            this.d.d(alklVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new algc(2);
        boolean a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(aloa.a(context, attributeSet, i, com.google.android.youtube.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.e = new LinkedHashSet();
        this.m = false;
        this.n = false;
        Context context2 = getContext();
        TypedArray a = alig.a(context2, attributeSet, algo.a, i, com.google.android.youtube.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.l = a.getDimensionPixelSize(12, 0);
        this.f = alkd.s(a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.g = alkd.e(getContext(), a, 14);
        this.h = alkd.g(getContext(), a, 10);
        this.o = a.getInteger(11, 1);
        this.i = a.getDimensionPixelSize(13, 0);
        algn algnVar = new algn(this, alkl.b(context2, attributeSet, i, com.google.android.youtube.R.style.Widget_MaterialComponents_Button).a());
        this.d = algnVar;
        algnVar.c = a.getDimensionPixelOffset(1, 0);
        algnVar.d = a.getDimensionPixelOffset(2, 0);
        algnVar.e = a.getDimensionPixelOffset(3, 0);
        algnVar.f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            int dimensionPixelSize = a.getDimensionPixelSize(8, -1);
            algnVar.g = dimensionPixelSize;
            algnVar.d(algnVar.b.e(dimensionPixelSize));
        }
        algnVar.h = a.getDimensionPixelSize(20, 0);
        algnVar.i = alkd.s(a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        algnVar.j = alkd.e(algnVar.a.getContext(), a, 6);
        algnVar.k = alkd.e(algnVar.a.getContext(), a, 19);
        algnVar.l = alkd.e(algnVar.a.getContext(), a, 16);
        algnVar.o = a.getBoolean(5, false);
        algnVar.p = a.getDimensionPixelSize(9, 0);
        int i2 = jw.i(algnVar.a);
        int paddingTop = algnVar.a.getPaddingTop();
        int h = jw.h(algnVar.a);
        int paddingBottom = algnVar.a.getPaddingBottom();
        if (a.hasValue(0)) {
            algnVar.c();
        } else {
            algnVar.e();
        }
        jw.Y(algnVar.a, i2 + algnVar.c, paddingTop + algnVar.e, h + algnVar.d, paddingBottom + algnVar.f);
        a.recycle();
        setCompoundDrawablePadding(this.l);
        f(this.h != null);
    }
}
