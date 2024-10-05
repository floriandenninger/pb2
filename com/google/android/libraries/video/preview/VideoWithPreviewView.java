package com.google.android.libraries.video.preview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.vcp;
import defpackage.vwv;
import defpackage.vwz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VideoWithPreviewView extends vwz {
    final Point f;
    public vwv g;

    public VideoWithPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Point();
    }

    @Override // defpackage.vwz
    protected float d() {
        return getWidth() / 2.0f;
    }

    @Override // defpackage.vwz
    protected float e() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vwz
    public void i() {
        float width = getWidth();
        float height = getHeight();
        if (width == 0.0f || height == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.mapRect(new RectF(0.0f, 0.0f, width, height));
        this.h.setTransform(matrix);
    }

    @Override // defpackage.vwz
    protected final float n() {
        return getHeight() / 2.0f;
    }

    @Override // defpackage.vwz
    protected final void o() {
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            i();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        vcp.b(View.MeasureSpec.getMode(i) == 1073741824);
        this.f.x = View.MeasureSpec.getSize(i);
        this.f.y = (int) ((r4.x / this.l) + 0.5f);
        if (u() || View.MeasureSpec.getMode(i2) != 0) {
            int size = u() ? this.m : View.MeasureSpec.getSize(i2);
            if (this.f.y > size) {
                this.f.y = size;
                this.f.x = (int) ((r4.y * this.l) + 0.5f);
            }
        }
        vwv vwvVar = this.g;
        if (vwvVar != null) {
            vwvVar.a(this.f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f.x, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f.y, 1073741824));
    }

    @Override // defpackage.vwz
    public final void p() {
        requestLayout();
    }
}
