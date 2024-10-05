package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.heg;
import defpackage.hfk;
import defpackage.jqr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsZoomSlider extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {
    boolean a;
    boolean b;
    public float c;
    Handler d;
    final Runnable e;
    public jqr f;
    public heg g;

    public ShortsZoomSlider(Context context) {
        super(context);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = new hfk(this, 0);
        g();
    }

    public static acsc a() {
        return acsb.c(100840);
    }

    private final void g() {
        this.d = new Handler();
        setProgressDrawable(getContext().getDrawable(R.drawable.zoom_slider_seek_bar));
        setThumb(getContext().getDrawable(R.drawable.zoom_slider_seek_bar_thumb));
        setMax(1000);
        setVisibility(4);
        setOnSeekBarChangeListener(this);
    }

    public final void b(float f) {
        if (this.b || this.c == f || f == getAlpha()) {
            return;
        }
        this.c = f;
        animate().cancel();
        if (f > 0.0f && getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(0);
            jqr jqrVar = this.f;
            if (jqrVar != null) {
                jqrVar.a(a()).e();
            }
        }
        animate().alpha(f).setDuration(100L).withEndAction(new hfk(this, 1)).start();
    }

    public final void c() {
        animate().cancel();
        this.a = false;
        this.d.removeCallbacks(this.e);
        this.c = -1.0f;
        if (this.b) {
            return;
        }
        if (this.f != null && getVisibility() == 0 && getAlpha() != 0.0f) {
            this.f.a(a()).d();
        }
        setVisibility(4);
    }

    public final void d(boolean z) {
        this.b = z;
        c();
        if (z) {
            if (this.f != null && jqr.d(this, true)) {
                this.f.a(a()).e();
            }
            setVisibility(0);
        }
    }

    public final void e(boolean z) {
        f(z, 2000);
    }

    public final void f(boolean z, int i) {
        this.a = z;
        if (this.b || getVisibility() != 0) {
            return;
        }
        b(true != this.a ? 1.0f : 0.3f);
        this.d.removeCallbacks(this.e);
        if (this.a) {
            return;
        }
        if (i <= 0) {
            this.d.post(this.e);
        } else {
            this.d.postDelayed(this.e, i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            heg hegVar = this.g;
            if (hegVar != null) {
                hegVar.a.ay.o(i / 1000.0f);
            }
            jqr jqrVar = this.f;
            if (jqrVar != null) {
                jqrVar.a(a()).f();
            }
            if (this.b || this.a) {
                return;
            }
            this.d.removeCallbacks(this.e);
            animate().cancel();
            setAlpha(1.0f);
            this.d.postDelayed(this.e, 2000L);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public ShortsZoomSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = new hfk(this, 0);
        g();
    }

    public ShortsZoomSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = false;
        this.c = -1.0f;
        this.e = new hfk(this, 0);
        g();
    }
}
