package com.google.android.libraries.user.profile.photopicker.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.axxm;
import defpackage.dcf;
import defpackage.vnd;
import defpackage.vne;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SquareImageView extends View {
    public Bitmap a;
    public final dcf b;
    private final Paint c;
    private final Paint d;
    private int e;
    private RectF f;
    private int g;
    private int h;

    public SquareImageView(Context context) {
        this(context, null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_picker_item_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public static SquareImageView a(Context context) {
        SquareImageView squareImageView = new SquareImageView(context);
        squareImageView.d();
        return squareImageView;
    }

    public final void b() {
        this.a = null;
        this.c.setShader(null);
        invalidate();
    }

    public final void c() {
        if (this.g == 0 || this.h == 0) {
            return;
        }
        BitmapShader bitmapShader = new BitmapShader(this.a, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        float f = this.g;
        float f2 = this.h;
        float width = this.a.getWidth();
        float height = this.a.getHeight();
        float f3 = f / f2;
        float f4 = width / height;
        float f5 = f4 <= f3 ? width : height * f3;
        float f6 = f4 >= f3 ? height : width / f3;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-((width - f5) / 2.0f), -((height - f6) / 2.0f));
        matrix.postScale(f / f5, f2 / f6);
        bitmapShader.setLocalMatrix(matrix);
        this.c.setShader(bitmapShader);
        invalidate();
    }

    public final void d() {
        this.e = 0;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f;
        if (rectF == null) {
            return;
        }
        if (this.a != null) {
            float f = this.e;
            canvas.drawRoundRect(rectF, f, f, this.c);
        } else {
            float f2 = this.e;
            canvas.drawRoundRect(rectF, f2, f2, this.d);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        this.g = i - paddingRight;
        this.h = i2 - paddingBottom;
        this.f = new RectF(getPaddingLeft(), getPaddingTop(), this.g, this.h);
        if (this.a != null) {
            c();
        }
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.b = new vne(this, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorHairline});
        try {
            paint.setColor(obtainStyledAttributes.getColor(0, 0));
            obtainStyledAttributes.recycle();
            this.e = context.getResources().getDimensionPixelSize(R.dimen.photo_picker_corner_crop_radius);
            if (axxm.b()) {
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, vnd.a, 0, 0);
                try {
                    this.e = obtainStyledAttributes2.getDimensionPixelSize(0, this.e);
                } finally {
                    obtainStyledAttributes2.recycle();
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
