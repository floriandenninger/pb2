package com.google.android.setupcompat.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.alsl;
import defpackage.alsn;
import defpackage.alsy;
import defpackage.alti;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TemplateLayout extends FrameLayout {
    public float a;
    public ViewTreeObserver.OnPreDrawListener b;
    private ViewGroup c;
    private final Map d;

    public TemplateLayout(Context context, int i, int i2) {
        super(context);
        this.d = new HashMap();
        a(i, i2, null, R.attr.sucLayoutTheme);
    }

    private final void a(int i, int i2, AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alsl.f, i3, 0);
        if (i == 0) {
            i = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (i2 == 0) {
            i2 = obtainStyledAttributes.getResourceId(1, 0);
        }
        d(attributeSet, i3);
        super.addView(b(LayoutInflater.from(getContext()), i), -1, generateDefaultLayoutParams());
        ViewGroup c = c(i2);
        this.c = c;
        if (c != null) {
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Container cannot be null in TemplateLayout");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.c.addView(view, i, layoutParams);
    }

    protected View b(LayoutInflater layoutInflater, int i) {
        return h(layoutInflater, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewGroup c(int i) {
        return (ViewGroup) findViewById(i);
    }

    protected void d(AttributeSet attributeSet, int i) {
    }

    public float getXFraction() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View h(LayoutInflater layoutInflater, int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("android:layout not specified for TemplateLayout");
        }
        if (i != 0) {
            layoutInflater = LayoutInflater.from(new alsn(layoutInflater.getContext(), i));
        }
        return layoutInflater.inflate(i2, (ViewGroup) this, false);
    }

    public final alti i(Class cls) {
        return (alti) this.d.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(Class cls, alti altiVar) {
        this.d.put(cls, altiVar);
    }

    public void setXFraction(float f) {
        this.a = f;
        int width = getWidth();
        if (width != 0) {
            setTranslationX(width * f);
        } else if (this.b == null) {
            this.b = new alsy(this);
            getViewTreeObserver().addOnPreDrawListener(this.b);
        }
    }

    public TemplateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new HashMap();
        a(0, 0, attributeSet, R.attr.sucLayoutTheme);
    }

    public TemplateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new HashMap();
        a(0, 0, attributeSet, i);
    }
}
