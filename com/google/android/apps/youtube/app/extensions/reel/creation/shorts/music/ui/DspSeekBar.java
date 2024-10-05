package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;
import defpackage.ammv;
import defpackage.ampm;
import defpackage.amru;
import defpackage.aute;
import defpackage.ham;
import defpackage.hnh;
import defpackage.nz;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DspSeekBar extends SeekBar {
    public hnh a;
    private final Context b;
    private Drawable c;
    private Drawable d;
    private Drawable e;
    private Drawable f;

    public DspSeekBar(Context context) {
        super(context);
        this.b = context;
        b();
    }

    private final float a(long j) {
        Long l;
        hnh hnhVar = this.a;
        long longValue = (hnhVar == null || (l = hnhVar.e) == null) ? 0L : l.longValue();
        if (longValue > 0) {
            return ((float) j) / ((float) longValue);
        }
        return 0.0f;
    }

    private final void b() {
        this.c = nz.b(this.b, R.drawable.shorts_music_ui_dsp_seek_bar_primary_dsp);
        this.d = nz.b(this.b, R.drawable.shorts_music_ui_dsp_seek_bar_secondary_dsp);
        this.e = nz.b(this.b, R.drawable.shorts_music_ui_dsp_seek_bar_thumb);
        this.f = nz.b(this.b, R.drawable.shorts_music_ui_dsp_seek_bar_thumb_selected_dsp);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        amru amruVar;
        int a;
        int a2;
        hnh hnhVar = this.a;
        if (hnhVar == null) {
            super.onDraw(canvas);
            return;
        }
        ammv b = hnhVar.b();
        setThumb(b.h() ? this.f : this.e);
        super.onDraw(canvas);
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int a3 = ((int) a(getProgress() * width)) - (getThumb().getIntrinsicWidth() / 2);
        int a4 = ((int) a(getProgress() * width)) + (getThumb().getIntrinsicWidth() / 2);
        aute auteVar = this.a.c;
        Long valueOf = auteVar != null ? Long.valueOf(auteVar.c) : null;
        if (valueOf != null && ((!b.h() || !valueOf.equals(b.c())) && ((a2 = (int) (a(valueOf.longValue()) * width)) < a3 || a2 > a4))) {
            int height = getHeight() / 2;
            Drawable drawable = this.c;
            drawable.setBounds(a2 - (drawable.getIntrinsicWidth() / 2), height - (this.c.getIntrinsicHeight() / 2), a2 + (this.c.getIntrinsicWidth() / 2), height + (this.c.getIntrinsicHeight() / 2));
            this.c.draw(canvas);
        }
        hnh hnhVar2 = this.a;
        if (hnhVar2.b.isEmpty()) {
            amruVar = amru.q();
        } else {
            amruVar = (amru) Collection.EL.stream(hnhVar2.b).map(ham.e).collect(ampm.a);
        }
        int size = amruVar.size();
        for (int i = 0; i < size; i++) {
            Long l = (Long) amruVar.get(i);
            if ((!b.h() || !l.equals(b.c())) && ((a = (int) (a(l.longValue()) * width)) < a3 || a > a4)) {
                int height2 = getHeight() / 2;
                Drawable drawable2 = this.d;
                drawable2.setBounds(a - (drawable2.getIntrinsicWidth() / 2), height2 - (this.d.getIntrinsicHeight() / 2), a + (this.d.getIntrinsicWidth() / 2), height2 + (this.d.getIntrinsicHeight() / 2));
                this.d.draw(canvas);
            }
        }
        canvas.restoreToCount(save);
    }

    public DspSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
        b();
    }

    public DspSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = context;
        b();
    }

    public DspSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = context;
        b();
    }
}
