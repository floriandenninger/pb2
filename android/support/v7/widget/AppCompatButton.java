package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.youtube.R;
import defpackage.jm;
import defpackage.lj;
import defpackage.lr;
import defpackage.sj;
import defpackage.tk;
import defpackage.yf;
import defpackage.yh;
import defpackage.yi;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements lj, lr {
    private final sj mBackgroundTintHelper;
    private final tk mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        sj sjVar = this.mBackgroundTintHelper;
        if (sjVar != null) {
            sjVar.a();
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            return tkVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            return tkVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            return tkVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        tk tkVar = this.mTextHelper;
        return tkVar != null ? tkVar.q() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            return tkVar.d();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        yi yiVar;
        sj sjVar = this.mBackgroundTintHelper;
        if (sjVar == null || (yiVar = sjVar.a) == null) {
            return null;
        }
        return yiVar.a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yi yiVar;
        sj sjVar = this.mBackgroundTintHelper;
        if (sjVar == null || (yiVar = sjVar.a) == null) {
            return null;
        }
        return yiVar.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        yi yiVar = this.mTextHelper.a;
        if (yiVar != null) {
            return yiVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        yi yiVar = this.mTextHelper.a;
        if (yiVar != null) {
            return yiVar.b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper == null || a || !this.mTextHelper.p()) {
            return;
        }
        this.mTextHelper.f();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.j(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.k(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.l(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        sj sjVar = this.mBackgroundTintHelper;
        if (sjVar != null) {
            sjVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        sj sjVar = this.mBackgroundTintHelper;
        if (sjVar != null) {
            sjVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.o(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.i(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        sj sjVar = this.mBackgroundTintHelper;
        if (sjVar != null) {
            if (sjVar.a == null) {
                sjVar.a = new yi();
            }
            yi yiVar = sjVar.a;
            yiVar.a = colorStateList;
            yiVar.d = true;
            sjVar.a();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        sj sjVar = this.mBackgroundTintHelper;
        if (sjVar != null) {
            if (sjVar.a == null) {
                sjVar.a = new yi();
            }
            yi yiVar = sjVar.a;
            yiVar.b = mode;
            yiVar.c = true;
            sjVar.a();
        }
    }

    @Override // defpackage.lr
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m(colorStateList);
        this.mTextHelper.e();
    }

    @Override // defpackage.lr
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.n(mode);
        this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
            return;
        }
        tk tkVar = this.mTextHelper;
        if (tkVar != null) {
            tkVar.o(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yh.a(context);
        yf.d(this, getContext());
        sj sjVar = new sj(this);
        this.mBackgroundTintHelper = sjVar;
        sjVar.b(attributeSet, i);
        tk tkVar = new tk(this);
        this.mTextHelper = tkVar;
        tkVar.g(attributeSet, i);
        tkVar.e();
    }
}
