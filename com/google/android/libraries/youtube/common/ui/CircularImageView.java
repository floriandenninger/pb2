package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.zaj;
import defpackage.zbm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CircularImageView extends ImageView {
    private zaj a;
    private InsetDrawable b;
    private zaj c;
    private float d;
    private int e;

    public CircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zbm.b);
        this.d = obtainStyledAttributes.getDimension(1, 0.0f);
        this.e = obtainStyledAttributes.getColor(0, -16777216);
    }

    @Override // android.view.View
    public final Drawable getBackground() {
        zaj zajVar = this.c;
        if (zajVar != null) {
            return zajVar.a;
        }
        return null;
    }

    @Override // android.widget.ImageView
    public final Drawable getDrawable() {
        zaj zajVar = this.a;
        if (zajVar != null) {
            return zajVar.a;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == null) {
            zaj zajVar = this.c;
            if (zajVar != null) {
                zajVar.a(null);
            }
            super.setBackgroundDrawable(null);
            return;
        }
        zaj zajVar2 = this.c;
        if (zajVar2 == null) {
            this.c = new zaj(drawable, this.d, this.e);
        } else {
            zajVar2.a(drawable);
        }
        a();
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            zaj zajVar = this.a;
            if (zajVar != null) {
                zajVar.a(null);
            }
            super.setImageDrawable(null);
            return;
        }
        zaj zajVar2 = this.a;
        if (zajVar2 == null) {
            this.a = new zaj(drawable, this.d, this.e);
        } else {
            zajVar2.a(drawable);
            invalidate();
        }
        super.setImageDrawable(this.a);
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i));
    }

    private final void a() {
        if (getBackground() != null) {
            if (this.b != null) {
                Rect rect = new Rect();
                this.b.getPadding(rect);
                if (rect.left == getPaddingLeft() && rect.top == getPaddingTop() && rect.right == getPaddingRight() && rect.bottom == getPaddingBottom()) {
                    return;
                }
            }
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) this.c, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            this.b = insetDrawable;
            super.setBackgroundDrawable(insetDrawable);
        }
    }
}
