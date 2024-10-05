package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class g extends Drawable {
    protected static final int a = Color.rgb(218, 0, 14);
    protected static final int b = Color.rgb(130, 1, 10);
    protected static final int c = Color.rgb(PrivateKeyType.INVALID, 204, 48);
    protected static final int d = Color.rgb(185, 148, 34);
    protected static final int e = Color.rgb(127, 127, 127);
    protected Shader f;
    protected Shader g;
    protected Shader h;
    protected int i;
    protected int j;

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(Rect rect, int[] iArr) {
        this.f = new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, a, b, Shader.TileMode.CLAMP);
        Shader linearGradient = new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, c, d, Shader.TileMode.CLAMP);
        this.g = linearGradient;
        if (iArr.length != 1 || iArr[0] != 1) {
            linearGradient = this.f;
        }
        this.h = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        int[] state = getState();
        if (state.length == 1 && state[0] == 2) {
            this.j = 100;
            this.i = 100;
        } else {
            this.j = i / 1000;
            this.i = i % 1000;
        }
        a();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        b(getBounds(), iArr);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
