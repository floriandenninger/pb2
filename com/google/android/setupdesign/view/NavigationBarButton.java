package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import defpackage.aluk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        a();
    }

    private final void a() {
        if (isInEditMode()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (int i = 0; i < compoundDrawablesRelative.length; i++) {
            Drawable drawable = compoundDrawablesRelative[i];
            if (drawable != null) {
                compoundDrawablesRelative[i] = aluk.a(drawable);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    private final void b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable[] drawableArr = {compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3], compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (int i = 0; i < 6; i++) {
                Drawable drawable = drawableArr[i];
                if (drawable instanceof aluk) {
                    aluk alukVar = (aluk) drawable;
                    alukVar.a = textColors;
                    if (alukVar.b()) {
                        alukVar.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = aluk.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = aluk.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = aluk.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = aluk.a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = aluk.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = aluk.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = aluk.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = aluk.a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
