package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RingView extends AppCompatImageView {
    public final Path a;
    public int b;
    public int c;
    public int d;

    public RingView(Context context) {
        super(context);
        this.a = new Path();
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.d;
        if (i != this.b && i != -1) {
            canvas.clipPath(this.a);
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    public RingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Path();
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    public RingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Path();
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }
}
