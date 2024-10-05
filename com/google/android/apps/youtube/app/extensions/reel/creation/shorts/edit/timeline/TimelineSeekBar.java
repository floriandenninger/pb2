package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;
import com.google.android.youtube.R;
import defpackage.ayrs;
import defpackage.hgo;
import defpackage.hji;
import defpackage.hjj;
import defpackage.hjs;
import defpackage.wbs;
import defpackage.yqw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TimelineSeekBar extends hji implements SeekBar.OnSeekBarChangeListener {
    public Drawable a;
    public final int b;
    public final SeekBar c;
    public final Runnable d;
    public hgo e;
    public hjs f;
    public yqw g;
    private final Drawable h;
    private final int i;
    private final int j;
    private final int k;
    private ShapeDrawable l;
    private ShapeDrawable m;
    private ShapeDrawable n;
    private LayerDrawable o;
    private LayerDrawable p;

    public TimelineSeekBar(Context context) {
        this(context, null);
    }

    private final int h(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    public final void c() {
        f(this.e.a());
    }

    public final void f(long j) {
        this.c.setProgress((int) j);
    }

    public final void g() {
        c();
        postDelayed(this.d, 60L);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int y = (int) motionEvent.getY();
        Rect bounds = this.a.getBounds();
        if (y < bounds.top - this.b || y > bounds.bottom + this.b) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHeight() > 0 && this.o == null) {
            int intrinsicHeight = this.a.getIntrinsicHeight();
            int intrinsicWidth = this.a.getIntrinsicWidth();
            int intrinsicWidth2 = this.l.getIntrinsicWidth();
            int h = h(1);
            int i5 = intrinsicWidth % 2;
            if (i5 == 0) {
                intrinsicWidth += h;
            }
            this.m.setIntrinsicHeight(getHeight());
            this.m.setIntrinsicWidth(intrinsicWidth);
            this.l.setIntrinsicHeight((getHeight() - intrinsicHeight) - this.j);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.m, this.l, this.a});
            this.o = layerDrawable;
            layerDrawable.setLayerInset(2, i5 != 0 ? 0 : h, getHeight() - intrinsicHeight, 0, 0);
            this.o.setLayerInset(1, (intrinsicWidth - intrinsicWidth2) / 2, 0, (intrinsicWidth + intrinsicWidth2) / 2, intrinsicHeight + this.j);
            this.c.setThumb(this.o);
        }
        if (this.h != null && getHeight() > 0 && this.p == null) {
            int intrinsicHeight2 = this.a.getIntrinsicHeight();
            this.n.setIntrinsicHeight(getHeight());
            this.p = new LayerDrawable(new Drawable[]{this.n, this.h});
            this.p.setLayerInset(1, 0, getHeight() - ((this.k + intrinsicHeight2) / 2), 0, (intrinsicHeight2 - this.k) / 2);
            this.c.setProgressDrawable(this.p);
        }
        final View view = (View) this.c.getParent();
        view.post(new Runnable() { // from class: hjv
            @Override // java.lang.Runnable
            public final void run() {
                TimelineSeekBar timelineSeekBar = TimelineSeekBar.this;
                View view2 = view;
                Rect copyBounds = timelineSeekBar.a.copyBounds();
                copyBounds.top -= timelineSeekBar.b;
                copyBounds.left -= timelineSeekBar.b;
                copyBounds.bottom += timelineSeekBar.b;
                copyBounds.right += timelineSeekBar.b;
                view2.setTouchDelegate(new TouchDelegate(copyBounds, timelineSeekBar.c));
            }
        });
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.e.h(i, null);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        removeCallbacks(this.d);
        this.e.e();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        hgo hgoVar = this.e;
        hgoVar.g(hgoVar.a());
        g();
    }

    public TimelineSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimelineSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TimelineSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.d = new Runnable() { // from class: hju
            @Override // java.lang.Runnable
            public final void run() {
                TimelineSeekBar.this.g();
            }
        };
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hjj.a, i, i2);
        final int i3 = 2;
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(2);
            this.h = drawable;
            this.k = obtainStyledAttributes.getDimensionPixelSize(3, h(2));
            Drawable drawable2 = obtainStyledAttributes.getDrawable(4);
            this.a = drawable2;
            if (drawable2 == null) {
                this.a = context.getResources().getDrawable(R.drawable.playhead_thumb);
            }
            final int i4 = 0;
            int color = obtainStyledAttributes.getColor(0, context.getResources().getColor(android.R.color.white));
            this.i = color;
            final int i5 = 1;
            this.j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.b = getResources().getDimensionPixelSize(R.dimen.seek_bar_padding);
            obtainStyledAttributes.recycle();
            LayoutInflater.from(context).inflate(R.layout.timeline_seekbar, (ViewGroup) this, true);
            SeekBar seekBar = (SeekBar) findViewById(R.id.player_seekbar);
            this.c = seekBar;
            seekBar.setProgressDrawable(null);
            seekBar.setOnSeekBarChangeListener(this);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            this.l = shapeDrawable;
            shapeDrawable.setIntrinsicWidth(getResources().getDimensionPixelSize(R.dimen.player_cursor_width));
            this.l.setShape(new RectShape());
            this.l.getPaint().setColor(color);
            this.l.getPaint().setStyle(Paint.Style.FILL);
            ShapeDrawable shapeDrawable2 = new ShapeDrawable();
            this.m = shapeDrawable2;
            shapeDrawable2.setShape(new RectShape());
            this.m.getPaint().setAlpha(0);
            if (drawable != null) {
                ShapeDrawable shapeDrawable3 = new ShapeDrawable();
                this.n = shapeDrawable3;
                shapeDrawable3.setShape(new RectShape());
                this.n.getPaint().setAlpha(0);
            }
            this.f.b().p(wbs.K(this.g.a())).ax(new ayrs(this) { // from class: hjt
                public final /* synthetic */ TimelineSeekBar a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i6 = i5;
                    if (i6 == 0) {
                        TimelineSeekBar timelineSeekBar = this.a;
                        if (timelineSeekBar.e.i()) {
                            timelineSeekBar.g();
                            return;
                        } else {
                            timelineSeekBar.removeCallbacks(timelineSeekBar.d);
                            timelineSeekBar.c();
                            return;
                        }
                    }
                    if (i6 == 1) {
                        TimelineSeekBar timelineSeekBar2 = this.a;
                        if (((Boolean) obj).booleanValue()) {
                            timelineSeekBar2.c.setMax((int) timelineSeekBar2.e.b());
                            timelineSeekBar2.g();
                            return;
                        }
                        timelineSeekBar2.removeCallbacks(timelineSeekBar2.d);
                        return;
                    }
                    this.a.f(((Long) obj).longValue());
                }
            });
            this.e.c().p(wbs.K(this.g.a())).ax(new ayrs(this) { // from class: hjt
                public final /* synthetic */ TimelineSeekBar a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i6 = i4;
                    if (i6 == 0) {
                        TimelineSeekBar timelineSeekBar = this.a;
                        if (timelineSeekBar.e.i()) {
                            timelineSeekBar.g();
                            return;
                        } else {
                            timelineSeekBar.removeCallbacks(timelineSeekBar.d);
                            timelineSeekBar.c();
                            return;
                        }
                    }
                    if (i6 == 1) {
                        TimelineSeekBar timelineSeekBar2 = this.a;
                        if (((Boolean) obj).booleanValue()) {
                            timelineSeekBar2.c.setMax((int) timelineSeekBar2.e.b());
                            timelineSeekBar2.g();
                            return;
                        }
                        timelineSeekBar2.removeCallbacks(timelineSeekBar2.d);
                        return;
                    }
                    this.a.f(((Long) obj).longValue());
                }
            });
            this.e.d().p(wbs.K(this.g.a())).ax(new ayrs(this) { // from class: hjt
                public final /* synthetic */ TimelineSeekBar a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    int i6 = i3;
                    if (i6 == 0) {
                        TimelineSeekBar timelineSeekBar = this.a;
                        if (timelineSeekBar.e.i()) {
                            timelineSeekBar.g();
                            return;
                        } else {
                            timelineSeekBar.removeCallbacks(timelineSeekBar.d);
                            timelineSeekBar.c();
                            return;
                        }
                    }
                    if (i6 == 1) {
                        TimelineSeekBar timelineSeekBar2 = this.a;
                        if (((Boolean) obj).booleanValue()) {
                            timelineSeekBar2.c.setMax((int) timelineSeekBar2.e.b());
                            timelineSeekBar2.g();
                            return;
                        }
                        timelineSeekBar2.removeCallbacks(timelineSeekBar2.d);
                        return;
                    }
                    this.a.f(((Long) obj).longValue());
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
