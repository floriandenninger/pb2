package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrViewerParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahgr implements ahgs {
    private final GvrView a;

    public ahgr(Context context) {
        context.getClass();
        this.a = new GvrView(context);
    }

    @Override // defpackage.ahgs
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.ahks
    public final void b(Runnable runnable) {
        this.a.queueEvent(runnable);
    }

    @Override // defpackage.ahgs
    public final GvrViewerParams c() {
        return this.a.getGvrViewerParams();
    }

    @Override // defpackage.ahgs
    public final void d() {
        this.a.onPause();
    }

    @Override // defpackage.ahgs
    public final void e() {
        this.a.onResume();
    }

    @Override // defpackage.ahgs
    public final void f(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.a.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    @Override // defpackage.ahgs
    public final void g(Runnable runnable) {
        this.a.setOnCardboardTriggerListener(runnable);
    }

    @Override // defpackage.ahgs
    public final void h(Runnable runnable) {
        this.a.setOnCloseButtonListener(runnable);
    }

    @Override // defpackage.ahgs
    public final void i(GvrView.StereoRenderer stereoRenderer) {
        this.a.setRenderer(stereoRenderer);
    }

    @Override // defpackage.ahgs
    public final void j(boolean z) {
        this.a.setStereoModeEnabled(z);
    }

    @Override // defpackage.ahgs
    public final void k() {
        this.a.shutdown();
    }

    @Override // defpackage.ahgs
    public final void l(int i, int i2, int i3, int i4) {
        this.a.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }
}
