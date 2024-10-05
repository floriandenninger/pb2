package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MinimalTimeBar extends View {
    private final d a;

    public MinimalTimeBar(Context context) {
        super(context);
        this.a = new d(getResources());
    }

    public final void a(ControlsOverlayStyle controlsOverlayStyle) {
        int i;
        if (controlsOverlayStyle == ControlsOverlayStyle.i) {
            i = 1;
        } else {
            i = controlsOverlayStyle == ControlsOverlayStyle.k ? 2 : 0;
        }
        this.a.setState(new int[]{i});
        invalidate();
    }

    public final void b(long j, long j2, long j3) {
        this.a.setLevel(((j2 > 0 ? (int) ((j3 * 100) / j2) : 0) * 1000) + (j2 > 0 ? (int) ((j * 100) / j2) : 0));
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.draw(canvas);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), resolveSize(this.a.getIntrinsicHeight(), i2));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    public MinimalTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new d(getResources());
    }
}
