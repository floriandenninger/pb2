package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import defpackage.amkq;
import defpackage.hge;
import defpackage.hrv;
import defpackage.jqr;
import defpackage.pny;
import defpackage.pom;
import defpackage.zrs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsPlayerView extends FrameLayout {
    public final TextureView a;
    public final RelativeLayout b;
    public final ImageView c;
    public final Handler d;
    public pom e;
    public zrs f;
    public float g;
    public boolean h;
    public hrv i;
    public boolean j;
    public pny k;
    public jqr l;
    private int m;
    private int n;

    public ShortsPlayerView(Context context) {
        this(context, null);
    }

    public final void a(float f) {
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), f);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        this.a.setTransform(matrix);
        this.a.invalidate();
        if (this.j) {
            this.c.setImageMatrix(matrix);
        }
    }

    public final void b() {
        zrs zrsVar = this.f;
        if (zrsVar == null || this.h || this.g == 0.0f) {
            return;
        }
        amkq.N(!zrsVar.n);
        zrsVar.i.b.sendEmptyMessage(17);
        this.h = true;
        ViewParent parent = getParent();
        if (this.i == null || !(parent instanceof ShortsPlayerViewContainer)) {
            return;
        }
        ((ShortsPlayerViewContainer) parent).a = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int round;
        int i3;
        super.onMeasure(i, i2);
        if (this.g == 0.0f) {
            return;
        }
        if (this.i == null || !this.h) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = measuredWidth;
            float f2 = measuredHeight;
            float f3 = this.g;
            if (f3 > f / f2) {
                i3 = Math.round(f / f3);
                round = measuredWidth;
            } else {
                round = Math.round(f2 * f3);
                i3 = measuredHeight;
            }
            if (round == measuredWidth && i3 == measuredHeight) {
                b();
            }
            this.m = round;
            this.n = i3;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.m, 1073741824), View.MeasureSpec.makeMeasureSpec(this.n, 1073741824));
    }

    public ShortsPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortsPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0.0f;
        this.k = new hge(this);
        LayoutInflater.from(context).inflate(R.layout.shorts_player_view, this);
        this.a = (TextureView) findViewById(R.id.video_texture_view);
        this.b = (RelativeLayout) findViewById(R.id.shorts_player_error_container);
        this.d = new Handler(Looper.getMainLooper());
        ImageView imageView = (ImageView) findViewById(R.id.guidelines_image_view);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }
}
