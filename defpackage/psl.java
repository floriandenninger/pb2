package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psl implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler b;
    public final int[] c = new int[1];
    public EGLDisplay d;
    public EGLContext e;
    public EGLSurface f;
    public SurfaceTexture g;

    public psl(Handler handler) {
        this.b = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
