package com.google.android.libraries.youtube.search.voice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.akfc;
import defpackage.wbs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BitmapSoundLevelsView extends View {
    public int a;
    private final Paint b;
    private final int c;
    private int d;
    private Bitmap e;
    private Bitmap f;
    private final Rect g;
    private final Matrix h;
    private akfc i;

    public BitmapSoundLevelsView(Context context) {
        this(context, null);
    }

    private final synchronized void a() {
        akfc akfcVar = this.i;
        akfcVar.a = true;
        akfcVar.sendEmptyMessage(0);
    }

    private final synchronized void b() {
        akfc akfcVar = this.i;
        akfcVar.a = false;
        akfcVar.removeMessages(0);
    }

    private final void c() {
        if (isEnabled()) {
            a();
        } else {
            b();
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isEnabled()) {
            int i = this.a;
            int i2 = this.d;
            if (i > i2) {
                this.d = i2 + ((i - i2) / 4);
            } else {
                this.d = (int) (i2 * 0.95f);
            }
            if (this.e != null) {
                int width = getWidth();
                int i3 = this.c;
                int i4 = (((width - i3) * this.d) / 100) + i3;
                int width2 = (getWidth() - i4) / 2;
                Bitmap bitmap = this.e;
                Bitmap bitmap2 = this.f;
                if (width2 == 0) {
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, this.h, null);
                        return;
                    }
                    width2 = 0;
                }
                int i5 = i4 + width2;
                this.g.set(width2, width2, i5, i5);
                canvas.drawBitmap(bitmap, (Rect) null, this.g, this.b);
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        Bitmap bitmap;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0 || (bitmap = this.e) == null) {
            return;
        }
        this.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            c();
        } else {
            b();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (z == isEnabled()) {
            return;
        }
        super.setEnabled(z);
        c();
    }

    public BitmapSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BitmapSoundLevelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.b = paint;
        this.h = new Matrix();
        this.i = new akfc(this);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.voice_input_sound_level_circle_search);
        this.e = decodeResource;
        this.c = decodeResource == null ? 0 : decodeResource.getWidth();
        this.g = new Rect();
        paint.setFilterBitmap(true);
        paint.setColorFilter(new PorterDuffColorFilter(wbs.W(context, R.attr.ytTouchResponse).orElse(0), PorterDuff.Mode.SRC_IN));
        setEnabled(false);
    }
}
