package com.google.android.libraries.youtube.edit.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import defpackage.to;
import defpackage.zkm;
import defpackage.zzj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SegmentedControlSegment extends to {
    private float a;
    private float b;
    private int c;
    private int d;

    public SegmentedControlSegment(Context context) {
        super(context);
        this.a = -1.0f;
        this.b = -1.0f;
        this.c = 0;
        this.d = 0;
        d(null);
    }

    private final void d(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, zkm.b, 0, 0);
            try {
                this.c = obtainStyledAttributes.getColor(1, 0);
                this.d = obtainStyledAttributes.getColor(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setAccessibilityDelegate(new zzj());
    }

    public final void a() {
        c(0.0f, 1.0f);
    }

    public final void b() {
        c(-1.0f, -1.0f);
    }

    public final void c(float f, float f2) {
        if (f == this.a && f2 == this.b) {
            return;
        }
        this.a = f;
        this.b = f2;
        invalidate();
    }

    public SegmentedControlSegment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1.0f;
        this.b = -1.0f;
        this.c = 0;
        this.d = 0;
        d(attributeSet);
    }

    public SegmentedControlSegment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1.0f;
        this.b = -1.0f;
        this.c = 0;
        this.d = 0;
        d(attributeSet);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i = this.c;
        if (i != 0 && this.d != 0 && (this.a != -1.0f || this.b != -1.0f)) {
            float width = getWidth();
            float height = getHeight();
            float f = this.a;
            float f2 = f != -1.0f ? f * width : 0.0f;
            float f3 = this.b;
            float f4 = f3 != -1.0f ? f3 * width : width;
            if (f2 > 0.0f) {
                canvas.save();
                setTextColor(this.c);
                canvas.clipRect(0.0f, 0.0f, f2, height);
                super.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            setTextColor(this.d);
            canvas.clipRect(f2, 0.0f, f4, height);
            super.draw(canvas);
            canvas.restore();
            if (f4 < width) {
                canvas.save();
                setTextColor(this.c);
                canvas.clipRect(f4, 0.0f, width, height);
                super.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (i != 0) {
            setTextColor(i);
        }
        super.draw(canvas);
    }
}
