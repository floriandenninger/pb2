package com.google.android.libraries.quantum.snackbar;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.uyq;
import defpackage.uyr;
import defpackage.uyz;
import defpackage.uzb;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class Snackbar extends LinearLayout implements uyq {
    public final uyr a;
    public final TextView b;
    public final TextView c;

    public Snackbar(Context context) {
        this(context, null);
    }

    @Override // defpackage.uyq
    public final boolean b() {
        return getVisibility() != 0;
    }

    public final void c() {
        uyr uyrVar = this.a;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", 0.0f, getHeight()));
        ofPropertyValuesHolder.addListener(new uzb(this));
        uyrVar.a();
        if (uyrVar.a.b()) {
            return;
        }
        uyrVar.b = ofPropertyValuesHolder;
        uyrVar.b.start();
    }

    public final void d(CharSequence charSequence) {
        e(charSequence, null, null);
    }

    public final void e(CharSequence charSequence, String str, View.OnClickListener onClickListener) {
        this.b.setText(charSequence);
        this.c.setText(str);
        this.c.setOnClickListener(onClickListener);
        this.c.setVisibility(true != TextUtils.isEmpty(str) ? 0 : 8);
        this.b.requestLayout();
    }

    public Snackbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.snackbarStyle);
    }

    public Snackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new uyr(this);
        LayoutInflater.from(context).inflate(R.layout.snackbar, this);
        TextView textView = (TextView) findViewById(R.id.message);
        this.b = textView;
        TextView textView2 = (TextView) findViewById(R.id.action);
        this.c = textView2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uyz.a, i, R.style.Snackbar);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setBackgroundDrawable(drawable);
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView2.setTextColor(colorStateList2);
        }
    }
}
