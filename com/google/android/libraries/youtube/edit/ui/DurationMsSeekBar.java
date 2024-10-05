package com.google.android.libraries.youtube.edit.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;
import defpackage.acsb;
import defpackage.hfh;
import defpackage.hmg;
import defpackage.hok;
import defpackage.pom;
import defpackage.wbs;
import defpackage.zyq;
import defpackage.zyr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DurationMsSeekBar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {
    public int a;
    public int b;
    public int c;
    public int d;
    public zyr e;
    public hok f;
    public float g;
    public float h;
    public float i;
    private TextPaint j;
    private TextPaint k;
    private int l;
    private Rect m;
    private int n;
    private Drawable o;
    private Drawable p;
    private Drawable q;
    private Path r;
    private float[] s;
    private int t;
    private float u;

    public DurationMsSeekBar(Context context) {
        super(context);
        n(context);
    }

    private final float l() {
        return getWidth() - getPaddingRight();
    }

    private final float m() {
        return getPaddingLeft();
    }

    private final void n(Context context) {
        hok hokVar = new hok(context);
        this.f = hokVar;
        hokVar.c();
        float dimension = context.getResources().getDimension(R.dimen.duration_ms_seek_bar_horizontal_padding);
        this.u = context.getResources().getDimension(R.dimen.duration_ms_seek_bar_stroke_width);
        int i = Resources.getSystem().getDisplayMetrics().widthPixels;
        float f = this.u;
        this.g = ((i - (dimension + dimension)) - (f + f)) / this.f.d;
        this.m = new Rect();
        setOnSeekBarChangeListener(this);
        setAccessibilityDelegate(new zyq(this));
        i(0);
    }

    private final void o(int i, int i2, int i3, int i4, int i5) {
        Resources resources = getResources();
        setProgressDrawable(getResources().getDrawable(i, getContext().getTheme()));
        setThumb(getResources().getDrawable(i2, getContext().getTheme()));
        setThumbOffset(getResources().getDimensionPixelOffset(R.dimen.duration_ms_seek_bar_thumb_offset));
        setSplitTrack(false);
        TextPaint textPaint = new TextPaint(1);
        this.j = textPaint;
        textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.duration_ms_seek_bar_with_waveform_legend_label_text_size));
        this.j.setColor(wbs.W(getContext(), R.attr.ytTextDisabled).orElse(getResources().getColor(R.color.yt_grey3)));
        this.j.setStrokeCap(Paint.Cap.ROUND);
        TextPaint textPaint2 = new TextPaint(1);
        this.k = textPaint2;
        textPaint2.setTextSize(resources.getDimensionPixelSize(R.dimen.duration_ms_seek_bar_with_waveform_legend_label_text_size));
        this.k.setColor(wbs.W(getContext(), R.attr.ytThemedBlue).orElse(getResources().getColor(R.color.yt_dark_blue)));
        this.k.setFakeBoldText(true);
        this.k.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        this.k.getTextBounds("1234567890s", 0, 11, rect);
        this.l = rect.height();
        this.o = getResources().getDrawable(i3, getContext().getTheme());
        this.p = getResources().getDrawable(i4, getContext().getTheme());
        this.q = getResources().getDrawable(R.drawable.duration_ms_seek_bar_divider, getContext().getTheme());
        this.r = new Path();
        float dimension = getResources().getDimension(i5);
        float f = dimension + dimension;
        this.s = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        this.t = (int) getResources().getDimension(R.dimen.duration_ms_seek_bar_thumb_width);
    }

    public final int a() {
        return getProgress() - this.b;
    }

    final int b(TextPaint textPaint, String str) {
        textPaint.getTextBounds(str, 0, str.length(), this.m);
        return this.m.width();
    }

    final int c(int i) {
        return (getWidth() * i) / getMax();
    }

    final String d() {
        return g(getMax());
    }

    final String e() {
        return g(0);
    }

    final String f() {
        return g(getProgress());
    }

    final String g(int i) {
        int round = Math.round(i / 100.0f);
        return k(i) ? getResources().getString(R.string.duration_seconds_ultra_short, Integer.valueOf(round / 10)) : getResources().getString(R.string.duration_seconds_to_nearest_tenth_ultra_short, Float.valueOf(round / 10.0f));
    }

    public final void h(long j, long j2) {
        this.f.d(j2, j, this.g);
        this.h = 0.0f;
    }

    public final void j(long j) {
        float f = ((float) (j + this.b)) / this.f.e;
        this.h = f;
        this.i = f;
        invalidate();
    }

    public final boolean k(int i) {
        int round = Math.round(i / 100.0f);
        return round == 0 || round == Math.round(((float) getMax()) / 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        int c = c(this.b);
        if (this.n == 1) {
            this.f.b(canvas, getWidth(), getHeight() / 2, this.u + getPaddingLeft(), this.u + getPaddingRight(), c, c(a()) - (this.t / 2), 0.0f, this.h, this.i, false);
        }
        super.onDraw(canvas);
        Rect copyBounds = ((ClipDrawable) ((LayerDrawable) getProgressDrawable()).findDrawableByLayerId(android.R.id.progress)).copyBounds();
        this.m = copyBounds;
        this.o.setBounds(copyBounds.left, this.m.top, c, this.m.bottom);
        this.o.draw(canvas);
        canvas.save();
        this.r.rewind();
        this.r.addRoundRect(this.m.left, this.m.top, this.m.right, this.m.bottom, this.s, Path.Direction.CW);
        canvas.clipPath(this.r);
        this.p.setBounds(c, this.m.top, Math.min(c(this.d + this.b), c(getProgress()) - (this.t / 2)), this.m.bottom);
        this.p.draw(canvas);
        int intrinsicWidth = this.b == 0 ? 0 : this.q.getIntrinsicWidth();
        this.q.setBounds(c - (intrinsicWidth / 2), this.m.top, c + ((intrinsicWidth + 1) / 2), this.m.bottom);
        this.q.draw(canvas);
        canvas.restore();
        int c2 = c(getProgress());
        float b = b(this.k, f());
        float f = c2 - (b / 2.0f);
        float m = m();
        float l = l();
        if (f < m) {
            f = m;
        } else if (f + b > l) {
            f = l - b;
        }
        int b2 = b(this.j, e());
        int b3 = b(this.j, d());
        canvas.drawText(f(), f, this.l, this.k);
        if (b2 < f) {
            this.j.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(e(), m(), this.l, this.j);
        }
        if (l() - b3 > f + b) {
            this.j.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(d(), l(), this.l, this.j);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.b + this.a;
        if (i >= i2 || i == getMax()) {
            zyr zyrVar = this.e;
            if (zyrVar != null) {
                int i3 = i - this.b;
                if (z) {
                    hfh hfhVar = (hfh) zyrVar;
                    hfhVar.r.c(i3);
                    hfhVar.q.a(acsb.c(99622)).f();
                    return;
                }
                return;
            }
            return;
        }
        setProgress(Math.min(i2, getMax()));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        hmg hmgVar;
        pom pomVar;
        zyr zyrVar = this.e;
        int progress = getProgress() - this.b;
        hfh hfhVar = (hfh) zyrVar;
        if (hfhVar.c && (pomVar = (hmgVar = hfhVar.b).k) != null && pomVar.l() == 3 && hmgVar.k.E()) {
            long j = progress;
            long a = (hfhVar.b.a() + j) - 2000;
            if (j < 2000) {
                a = hfhVar.b.a();
            }
            hfhVar.b.c(Math.max(0L, a));
        }
    }

    public final void i(int i) {
        this.n = i;
        if (i != 0) {
            o(R.drawable.duration_ms_seek_bar_with_waveform, R.drawable.duration_ms_seek_bar_with_waveform_thumb, R.drawable.duration_ms_seek_bar_with_waveform_unselectable_area, R.drawable.duration_ms_seek_bar_with_waveform_played_area, R.dimen.duration_ms_seek_bar_with_waveform_corner_radius);
        } else {
            o(R.drawable.duration_ms_seek_bar, R.drawable.duration_ms_seek_bar_thumb, R.drawable.duration_ms_seek_bar_unselectable_area, R.drawable.duration_ms_seek_bar_played_area, R.dimen.duration_ms_seek_bar_corner_radius);
        }
    }

    public DurationMsSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n(context);
    }

    public DurationMsSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        n(context);
    }
}
