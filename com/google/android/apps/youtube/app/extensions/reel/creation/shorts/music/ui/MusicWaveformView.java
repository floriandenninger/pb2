package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.amkv;
import defpackage.amru;
import defpackage.hni;
import defpackage.hok;
import defpackage.zga;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MusicWaveformView extends View {
    public final hok a;
    float b;
    float c;
    public float d;
    public float e;
    long f;
    long g;
    public hni h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;

    public MusicWaveformView(Context context) {
        this(context, null, 0);
    }

    private final void f(long j) {
        this.d = 0.0f;
        this.n = ((float) (j - this.f)) / this.a.e;
    }

    public final void a(long j) {
        this.a.d(j, this.g, this.k);
        f(j);
    }

    public final void b(long j, long j2, View view) {
        this.f = j2;
        this.g = j;
        if (j2 < j) {
            this.b = (this.l * ((float) j2)) / ((float) j);
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            float f = this.b;
            float f2 = this.j;
            float f3 = ((i - f) - (f2 + f2)) / 2.0f;
            this.c = f2 + f3;
            int i2 = (int) f3;
            view.setPadding(i2, view.getPaddingTop(), i2, view.getPaddingBottom());
        }
    }

    public final void c(long j, byte[] bArr, amru amruVar) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                amkv a = amkv.a(byteArrayInputStream);
                int i = a.b;
                this.a.e(j, this.g, this.k, a.a, i, amruVar);
                f(j);
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            zga.d("Error reading the raw waveform bytes. ", e);
            a(j);
        }
    }

    public final void d(float f, float f2, float f3) {
        this.j = f2;
        this.l = f3;
        this.b = f3;
        this.c = f + f2;
        this.k = f3 / this.a.d;
    }

    public final void e(long j) {
        float f = ((float) j) / this.a.e;
        this.d = f;
        this.e = f;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.b(canvas, getWidth(), getHeight() / 2, 0.0f, 0.0f, this.c, this.b, this.j, this.d, this.e, this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h.ma();
            this.m = motionEvent.getX();
        } else if (action == 1) {
            this.h.b();
        } else if (action == 2) {
            float f = this.m;
            float x = this.d + ((f - motionEvent.getX()) / this.a.d);
            this.d = x;
            if (x < 0.0f) {
                this.d = 0.0f;
                x = 0.0f;
            }
            boolean f2 = this.h.f(r4.e * x);
            this.i = f2;
            if (f2) {
                this.d = this.n;
            }
            this.e = this.d;
            invalidate();
            this.m = motionEvent.getX();
        }
        return true;
    }

    public MusicWaveformView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MusicWaveformView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hok hokVar = new hok(context);
        this.a = hokVar;
        hokVar.c();
        float dimension = context.getResources().getDimension(R.dimen.camera_music_waveform_horizontal_padding);
        float dimension2 = context.getResources().getDimension(R.dimen.music_waveform_area_width);
        d(dimension, dimension2, (Resources.getSystem().getDisplayMetrics().widthPixels - (dimension + dimension)) - (dimension2 + dimension2));
    }
}
