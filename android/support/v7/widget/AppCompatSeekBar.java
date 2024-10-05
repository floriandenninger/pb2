package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;
import defpackage.sx;
import defpackage.yf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {
    private final sx a;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        sx sxVar = this.a;
        Drawable drawable = sxVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(sxVar.b.getDrawableState())) {
            sxVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        sx sxVar = this.a;
        if (sxVar.c != null) {
            int max = sxVar.b.getMax();
            if (max > 1) {
                int intrinsicWidth = sxVar.c.getIntrinsicWidth();
                int intrinsicHeight = sxVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                sxVar.c.setBounds(-i, -i2, i, i2);
                float width = ((sxVar.b.getWidth() - sxVar.b.getPaddingLeft()) - sxVar.b.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(sxVar.b.getPaddingLeft(), sxVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    sxVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yf.d(this, getContext());
        sx sxVar = new sx(this);
        this.a = sxVar;
        sxVar.a(attributeSet, i);
    }
}
