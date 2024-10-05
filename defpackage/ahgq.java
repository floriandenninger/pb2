package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahgq implements ahgs {
    public final HeadTransform a;
    public final Eye b;
    public final Viewport c;
    public GvrView.Renderer d;
    public boolean e;
    private final GLSurfaceView f;
    private final ViewGroup g;

    public ahgq(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        ahgp ahgpVar = new ahgp(this, context);
        this.f = ahgpVar;
        ahgpVar.setEGLContextClientVersion(2);
        ahgpVar.setPreserveEGLContextOnPause(true);
        frameLayout.addView(ahgpVar);
        this.a = new HeadTransform();
        this.b = new Eye(0);
        this.c = new Viewport();
    }

    @Override // defpackage.ahgs
    public final ViewGroup a() {
        return this.g;
    }

    @Override // defpackage.ahks
    public final void b(Runnable runnable) {
        this.f.queueEvent(runnable);
    }

    @Override // defpackage.ahgs
    public final GvrViewerParams c() {
        return new GvrViewerParams();
    }

    @Override // defpackage.ahgs
    public final void d() {
    }

    @Override // defpackage.ahgs
    public final void e() {
    }

    @Override // defpackage.ahgs
    public final void f(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.f.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    @Override // defpackage.ahgs
    public final void g(Runnable runnable) {
    }

    @Override // defpackage.ahgs
    public final void h(Runnable runnable) {
    }

    @Override // defpackage.ahgs
    public final void i(GvrView.StereoRenderer stereoRenderer) {
        ahgn ahgnVar = new ahgn(stereoRenderer);
        this.d = ahgnVar;
        this.f.setRenderer(new ahgm(this, ahgnVar));
    }

    @Override // defpackage.ahgs
    public final void j(boolean z) {
        zga.b("Stereo mode (VR mode) not supported without GvrView support");
    }

    @Override // defpackage.ahgs
    public final void k() {
        yjk.f();
        if (!this.e) {
            zga.b("The GlSurfaceViewWrapper cannot be shutdown if it's not attached.");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        b(new ahgo(this, countDownLatch));
        try {
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zga.d("Interrupted during shutdown", e);
        }
    }

    @Override // defpackage.ahgs
    public final void l(int i, int i2, int i3, int i4) {
        this.f.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }
}
