package com.google.android.libraries.youtube.player.features.quickseek.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.aih;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CircularClipTapBloomView extends TapBloomView {
    public int a;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Path i;
    private Paint j;

    public CircularClipTapBloomView(Context context) {
        super(context);
    }

    public final void a(boolean z) {
        invalidate();
        float f = true != z ? 1.0f : 1.75f;
        int i = this.h;
        float f2 = i;
        this.d = f * 1.2f * f2;
        int i2 = this.g;
        int i3 = (int) ((f2 * 1.2f) - (i2 * 0.5f));
        this.e = this.a == 1 ? i2 + i3 : -i3;
        this.f = i / 2;
        Path path = this.i;
        if (path == null) {
            this.i = new Path();
        } else {
            path.reset();
        }
        if (this.j == null) {
            Paint paint = new Paint();
            this.j = paint;
            paint.setColor(aih.d(getContext(), R.color.quick_seek_bloom_start));
        }
        this.i.setFillType(Path.FillType.WINDING);
        this.i.addCircle(this.e, this.f, this.d, Path.Direction.CW);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path;
        if (this.j != null && (path = this.i) != null) {
            canvas.clipPath(path);
            canvas.drawCircle(this.e, this.f, this.d, this.j);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = i;
        this.h = i2;
        a(false);
    }

    public CircularClipTapBloomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularClipTapBloomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
