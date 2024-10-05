package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CroppedVideoWithPreviewView extends VideoWithPreviewView {
    public float a;
    public float b;
    public float c;
    public int d;
    public float e;

    public CroppedVideoWithPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1.0f;
        this.b = 0.5f;
        this.c = 0.5f;
        this.d = 0;
    }

    public final float a() {
        float c = c();
        float b = b();
        if (b == 0.0f) {
            return 0.0f;
        }
        return c / b;
    }

    final float b() {
        return ((View) getParent()).getHeight();
    }

    final float c() {
        return ((View) getParent()).getWidth();
    }

    @Override // com.google.android.libraries.video.preview.VideoWithPreviewView, defpackage.vwz
    protected final float d() {
        return this.b * h();
    }

    @Override // com.google.android.libraries.video.preview.VideoWithPreviewView, defpackage.vwz
    protected final float e() {
        if (this.d == 0) {
            return 1.0f;
        }
        return this.a;
    }

    public final float f() {
        return (c() - ((b() / 16.0f) * 9.0f)) / 2.0f;
    }

    public final float g() {
        return getHeight();
    }

    public final float h() {
        return getWidth();
    }

    @Override // com.google.android.libraries.video.preview.VideoWithPreviewView, defpackage.vwz
    public final void i() {
        float f;
        if (this.d == 0) {
            super.i();
            return;
        }
        float h = h();
        float g = g();
        float a = a();
        if (h == 0.0f || g == 0.0f || a == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.mapRect(new RectF(0.0f, 0.0f, h, g));
        if (this.d == 1) {
            float a2 = a();
            float f2 = this.l;
            if (a2 < f2) {
                f = f2 / a;
                this.a = f;
                matrix.postScale(f, f, h * this.b, g * 0.5f);
                this.h.setTransform(matrix);
            }
        }
        f = j() ? 1.0f : 0.5625f / this.l;
        this.a = f;
        matrix.postScale(f, f, h * this.b, g * 0.5f);
        this.h.setTransform(matrix);
    }

    public final boolean j() {
        return this.d == 1 && this.l > 0.5625f;
    }
}
