package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baoi implements SurfaceHolder {
    private final Surface a;

    public baoi(Surface surface) {
        this.a = surface;
    }

    @Override // android.view.SurfaceHolder
    public final void addCallback(SurfaceHolder.Callback callback) {
    }

    @Override // android.view.SurfaceHolder
    public final Surface getSurface() {
        return this.a;
    }

    @Override // android.view.SurfaceHolder
    public final Rect getSurfaceFrame() {
        return null;
    }

    @Override // android.view.SurfaceHolder
    public final boolean isCreating() {
        return false;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas() {
        return null;
    }

    @Override // android.view.SurfaceHolder
    public final Canvas lockCanvas(Rect rect) {
        return null;
    }

    @Override // android.view.SurfaceHolder
    public final void removeCallback(SurfaceHolder.Callback callback) {
    }

    @Override // android.view.SurfaceHolder
    public final void setFixedSize(int i, int i2) {
    }

    @Override // android.view.SurfaceHolder
    public final void setFormat(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void setKeepScreenOn(boolean z) {
    }

    @Override // android.view.SurfaceHolder
    public final void setSizeFromLayout() {
    }

    @Override // android.view.SurfaceHolder
    @Deprecated
    public final void setType(int i) {
    }

    @Override // android.view.SurfaceHolder
    public final void unlockCanvasAndPost(Canvas canvas) {
    }
}
