package com.google.android.apps.youtube.app.ui.inline.spotlight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import defpackage.miw;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpotlightScrimLayout extends LinearLayout {
    public int a;
    public int b;
    public final Paint c;
    private final RectF d;
    private Optional e;

    public SpotlightScrimLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0;
        this.c = new Paint();
        this.d = new RectF();
        this.e = Optional.empty();
    }

    public final void a(miw miwVar) {
        this.e = Optional.ofNullable(miwVar);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        this.d.set(0.0f, this.a, width, r2 + this.b);
        canvas.drawRoundRect(this.d, 32.0f, 32.0f, this.c);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e.isPresent()) {
            ((miw) this.e.get()).d();
        }
        return super.onTouchEvent(motionEvent);
    }
}
