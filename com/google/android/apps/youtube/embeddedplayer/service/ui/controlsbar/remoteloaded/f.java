package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import defpackage.ahyo;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f extends View {
    public e a;
    public StateListDrawable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Rect g;
    public Rect h;
    public Rect i;
    public Rect j;
    public Paint k;
    public Paint l;
    public Map m;
    private ControlsOverlayStyle n;
    private boolean o;
    private boolean p;
    private long q;
    private long r;
    private long s;
    private long t;
    private String u;
    private String v;
    private final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a w;

    public f(Context context, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a aVar) {
        super(context);
        this.w = aVar;
    }

    private final long c(int i) {
        Rect bounds = this.a.getBounds();
        int i2 = bounds.left + this.f;
        int i3 = bounds.right - this.f;
        return (this.s * (Math.min(i3, Math.max(i2, i)) - i2)) / (i3 - i2);
    }

    private final String d(long j) {
        int i = ((int) j) / 1000;
        String format = String.format("%02d:%02d", Integer.valueOf((i / 60) % 60), Integer.valueOf(i % 60));
        return this.s >= 3600000 ? String.format("%d:%s", Integer.valueOf(i / 3600), format) : format;
    }

    private final void e() {
        this.p = false;
        this.b.setState(ENABLED_STATE_SET);
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    private final void f(int i, int i2) {
        long j = this.s;
        String str = j >= 36000000 ? "10:00:00" : j >= 3600000 ? "0:00:00" : "00:00";
        this.k.getTextBounds(str, 0, str.length(), this.g);
        int intrinsicHeight = this.a.getIntrinsicHeight();
        if (i >= this.c) {
            e eVar = this.a;
            int width = this.g.width();
            int i3 = this.d;
            int i4 = (i2 / 2) - (intrinsicHeight / 2);
            eVar.setBounds(width + i3, i4, (i - i3) - this.g.width(), i4 + intrinsicHeight);
            this.g.offset(0, this.a.getBounds().centerY() - this.g.centerY());
        } else {
            e eVar2 = this.a;
            int i5 = this.d;
            int i6 = (i2 / 2) - (intrinsicHeight / 2);
            eVar2.setBounds(i5, i6, i - i5, i6 + intrinsicHeight);
        }
        this.a.copyBounds(this.i);
        this.i.inset(0, (-(i2 - intrinsicHeight)) / 2);
    }

    private final void g() {
        long j;
        int i;
        Rect bounds = this.a.getBounds();
        int i2 = this.f;
        int width = (bounds.width() - this.f) - i2;
        long j2 = this.p ? this.q : this.r;
        long j3 = this.s;
        int i3 = j3 > 0 ? (int) (i2 + ((width * j2) / j3)) : 0;
        StateListDrawable stateListDrawable = this.b;
        int i4 = bounds.left;
        int centerY = bounds.centerY();
        int intrinsicWidth = stateListDrawable.getIntrinsicWidth();
        int intrinsicHeight = stateListDrawable.getIntrinsicHeight();
        int i5 = (i4 + i3) - (intrinsicWidth / 2);
        int i6 = centerY - (intrinsicHeight / 2);
        stateListDrawable.setBounds(i5, i6, intrinsicWidth + i5, intrinsicHeight + i6);
        this.b.copyBounds(this.h);
        Rect rect = this.h;
        int i7 = -this.e;
        rect.inset(i7, i7);
        int width2 = bounds.width() > 0 ? (i3 * 100) / bounds.width() : 0;
        int i8 = width > 0 ? ((i3 - i2) * 100) / width : 0;
        if (true != this.o) {
            width2 = i8;
        }
        long j4 = this.s;
        if (j4 > 0) {
            j = j2;
            i = (int) (i2 + ((this.t * width) / j4));
        } else {
            j = j2;
            i = 0;
        }
        this.a.setLevel(((width > 0 ? ((i - i2) * 100) / width : 0) * 1000) + width2);
        this.u = d(j);
        invalidate();
    }

    private final void h() {
        boolean z = false;
        if (this.n.s && isEnabled() && this.s > 0) {
            z = true;
        }
        this.o = z;
        if (this.p && !z) {
            e();
        }
        g();
    }

    public final void a(ControlsOverlayStyle controlsOverlayStyle) {
        this.n = controlsOverlayStyle;
        h();
        this.a.setState(new int[]{controlsOverlayStyle == ControlsOverlayStyle.i ? 1 : 0});
        invalidate();
    }

    public final void b(long j, long j2, long j3) {
        long j4 = this.s;
        this.r = j;
        this.t = j3;
        this.s = j2;
        if (j2 != j4 || this.v == null) {
            h();
            this.v = d(j2);
            if (j2 / 3600000 != j4 / 3600000) {
                f(getWidth(), getHeight());
            }
        }
        g();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        TimelineMarker[] timelineMarkerArr;
        super.onDraw(canvas);
        this.a.draw(canvas);
        if (this.o) {
            this.b.draw(canvas);
        }
        if (getWidth() >= this.c) {
            this.k.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(this.u, this.g.right, this.g.bottom, this.k);
            this.k.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(this.v, getWidth(), this.g.bottom, this.k);
        }
        Map map = this.m;
        if (map == null || this.s <= 0 || (timelineMarkerArr = (TimelineMarker[]) map.get(ahyo.AD_MARKER)) == null) {
            return;
        }
        Rect bounds = this.a.getBounds();
        this.j.top = bounds.top;
        this.j.bottom = bounds.bottom;
        for (TimelineMarker timelineMarker : timelineMarkerArr) {
            long j = timelineMarker.a;
            if (j == 9223372036854775806L) {
                this.j.right = bounds.right;
                this.j.left = r6.right - 4;
            } else {
                long min = Math.min(this.s, Math.max(0L, j));
                int i = bounds.left + this.f;
                int i2 = bounds.right;
                int i3 = this.f;
                long j2 = this.s;
                Rect rect = this.j;
                Double.isNaN(min);
                Double.isNaN(j2);
                Double.isNaN((i2 - i3) - i);
                rect.left = i + ((int) ((r9 * (r6 / r11)) - 2.0d));
                Rect rect2 = this.j;
                rect2.right = rect2.left + 4;
            }
            canvas.drawRect(this.j, this.l);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(this.a.getIntrinsicWidth(), i), getDefaultSize(Math.max(this.g.height(), Math.max(this.h.height(), this.i.height())), i2));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f(i, i2);
        g();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.p || !this.o) {
                return false;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!this.h.contains(x, y) && !this.i.contains(x, y)) {
                return false;
            }
            this.p = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.b.setState(View.PRESSED_ENABLED_STATE_SET);
            this.q = c((int) motionEvent.getX());
            g();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a aVar = this.w;
            aVar.a.A();
            aVar.a.a.q();
            return true;
        }
        if (actionMasked == 1) {
            if (!this.p) {
                return false;
            }
            e();
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a aVar2 = this.w;
            aVar2.a.a.r((int) this.q);
            aVar2.a.B();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return false;
            }
            e();
            return true;
        }
        if (!this.p) {
            return false;
        }
        this.q = c((int) motionEvent.getX());
        g();
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        h();
    }
}
