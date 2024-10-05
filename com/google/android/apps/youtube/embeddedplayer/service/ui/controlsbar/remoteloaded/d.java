package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends g {
    private static final int k = Color.rgb(27, 27, 27);
    private final Paint l;
    private final Rect m;
    private final Rect n;
    private final Rect o;
    private final float p;

    public d(Resources resources) {
        Paint paint = new Paint();
        this.l = paint;
        paint.setDither(true);
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = resources.getDisplayMetrics().density;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.g
    protected final void a() {
        Rect bounds = getBounds();
        this.m.set(bounds.left, bounds.top, bounds.left + ((this.i * bounds.width()) / 100), bounds.bottom);
        int i = this.j;
        int i2 = this.i;
        this.n.set(this.m.right, bounds.top, this.m.right + (i > i2 ? ((i - i2) * bounds.width()) / 100 : 0), bounds.bottom);
        this.o.set(this.n.right, bounds.top, bounds.right, bounds.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.l.setShader(this.h);
        canvas.drawRect(this.m, this.l);
        this.l.setShader(null);
        this.l.setColor(e);
        canvas.drawRect(this.n, this.l);
        this.l.setColor(k);
        canvas.drawRect(this.o, this.l);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) ((this.p * 4.0f) + 0.5f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        b(rect, getState());
        a();
    }
}
