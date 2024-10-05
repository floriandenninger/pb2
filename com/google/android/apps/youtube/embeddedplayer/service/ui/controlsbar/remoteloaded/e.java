package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;
import defpackage.aii;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends g {
    private final Paint k;
    private final Rect l;
    private final Drawable m;
    private final Drawable n;
    private final Drawable o;
    private final RectF p;
    private final RectF q;
    private final Rect r;
    private final Rect s;

    public e(Context context) {
        Paint paint = new Paint();
        this.k = paint;
        paint.setDither(true);
        this.l = new Rect();
        Rect rect = new Rect();
        this.r = rect;
        this.s = new Rect();
        this.p = new RectF();
        this.q = new RectF();
        Drawable a = aii.a(context, R.drawable.api_player_bar);
        a.getClass();
        this.o = a;
        Drawable a2 = aii.a(context, R.drawable.api_player_buffered);
        a2.getClass();
        this.n = a2;
        Drawable a3 = aii.a(context, R.drawable.api_player_track);
        a3.getClass();
        this.m = a3;
        a3.getPadding(rect);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.g
    protected final void a() {
        int i = this.i;
        int i2 = i <= 1 ? 0 : i >= 99 ? 98 : i - 1;
        this.l.set(this.s.left, this.s.top, this.s.left + ((this.s.width() * i2) / 98), this.s.bottom);
        int i3 = this.j;
        int i4 = i3 <= 1 ? 0 : i3 >= 99 ? 98 : i3 - 1;
        this.n.setBounds(this.l.right, this.s.top, this.l.right + (i4 > i2 ? ((i4 - i2) * this.s.width()) / 98 : 0), this.s.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.o.draw(canvas);
        this.m.draw(canvas);
        if (this.i > 0) {
            this.k.setShader(this.h);
            canvas.drawArc(this.p, 90.0f, 180.0f, true, this.k);
        } else if (this.j > 0) {
            this.k.setShader(null);
            this.k.setColor(e);
            canvas.drawArc(this.p, 90.0f, 180.0f, true, this.k);
        }
        this.k.setShader(this.h);
        canvas.drawRect(this.l, this.k);
        this.n.draw(canvas);
        if (this.i >= 100) {
            this.k.setShader(this.h);
            canvas.drawArc(this.q, -90.0f, 180.0f, true, this.k);
        } else if (this.j >= 100) {
            this.k.setShader(null);
            this.k.setColor(e);
            canvas.drawArc(this.q, -90.0f, 180.0f, true, this.k);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.m.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.m.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.m.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        this.s.set(rect.left + this.r.left, rect.top + this.r.top, rect.right - this.r.right, rect.bottom - this.r.bottom);
        b(this.s, getState());
        this.p.set(rect.left, this.s.top, rect.left + this.s.height(), this.s.bottom);
        this.q.set(rect.right - this.s.height(), this.s.top, rect.right, this.s.bottom);
        a();
    }
}
