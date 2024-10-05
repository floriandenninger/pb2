package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.fq;
import defpackage.jm;
import defpackage.jq;
import defpackage.lj;
import defpackage.lr;
import defpackage.nz;
import defpackage.sj;
import defpackage.th;
import defpackage.tk;
import defpackage.yf;
import defpackage.yh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements lr, lj {
    private final sj b;
    private final tk c;
    private final th d;
    private boolean e;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        sj sjVar = this.b;
        if (sjVar != null) {
            sjVar.a();
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            return tkVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            return tkVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            return tkVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        tk tkVar = this.c;
        return tkVar != null ? tkVar.q() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            return tkVar.d();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        th thVar;
        if (Build.VERSION.SDK_INT >= 28 || (thVar = this.d) == null) {
            return super.getTextClassifier();
        }
        return thVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        tk.s(this, onCreateInputConnection, editorInfo);
        jq.d(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.c == null || a || !this.c.p()) {
            return;
        }
        this.c.f();
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.j(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.k(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.l(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        sj sjVar = this.b;
        if (sjVar != null) {
            sjVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        sj sjVar = this.b;
        if (sjVar != null) {
            sjVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? nz.b(context, i) : null, i2 != 0 ? nz.b(context, i2) : null, i3 != 0 ? nz.b(context, i3) : null, i4 != 0 ? nz.b(context, i4) : null);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? nz.b(context, i) : null, i2 != 0 ? nz.b(context, i2) : null, i3 != 0 ? nz.b(context, i3) : null, i4 != 0 ? nz.b(context, i4) : null);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jm.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            jm.p(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            jm.q(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        jm.r(this, i);
    }

    @Override // defpackage.lr
    public final void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.m(colorStateList);
        this.c.e();
    }

    @Override // defpackage.lr
    public final void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.n(mode);
        this.c.e();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        th thVar;
        if (Build.VERSION.SDK_INT >= 28 || (thVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            thVar.a = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
            return;
        }
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.o(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = fq.a(getContext(), typeface, i);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yh.a(context);
        this.e = false;
        yf.d(this, getContext());
        sj sjVar = new sj(this);
        this.b = sjVar;
        sjVar.b(attributeSet, i);
        tk tkVar = new tk(this);
        this.c = tkVar;
        tkVar.g(attributeSet, i);
        tkVar.e();
        this.d = new th(this);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        tk tkVar = this.c;
        if (tkVar != null) {
            tkVar.e();
        }
    }
}
