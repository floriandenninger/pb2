package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.ahxw;
import defpackage.ahya;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultThumbnailOverlayView extends ImageView implements ahxw {
    private ahya a;

    public DefaultThumbnailOverlayView(Context context) {
        super(context);
        c(context);
    }

    private final void c(Context context) {
        setBackgroundColor(-16777216);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.a = new kir(this, context);
    }

    @Override // defpackage.ahxw
    public final void b(Bitmap bitmap) {
        this.a.b(bitmap);
    }

    @Override // defpackage.ahxw
    public final void kV() {
        this.a.kV();
    }

    @Override // defpackage.ahxw
    public final void kX() {
        this.a.kX();
    }

    @Override // defpackage.ahxw
    public final void nw() {
        this.a.nw();
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    public DefaultThumbnailOverlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context);
    }
}
