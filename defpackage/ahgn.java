package defpackage;

import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import javax.microedition.khronos.egl.EGLConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahgn implements GvrView.Renderer {
    final /* synthetic */ GvrView.StereoRenderer a;

    public ahgn(GvrView.StereoRenderer stereoRenderer) {
        this.a = stereoRenderer;
    }

    @Override // com.google.vr.sdk.base.GvrView.Renderer
    public final void onDrawFrame(HeadTransform headTransform, Eye eye, Eye eye2) {
        this.a.onNewFrame(headTransform);
        this.a.onDrawEye(eye);
    }

    @Override // com.google.vr.sdk.base.GvrView.Renderer
    public final void onFinishFrame(Viewport viewport) {
        this.a.onFinishFrame(viewport);
    }

    @Override // com.google.vr.sdk.base.GvrView.Renderer
    public final void onRendererShutdown() {
        this.a.onRendererShutdown();
    }

    @Override // com.google.vr.sdk.base.GvrView.Renderer
    public final void onSurfaceChanged(int i, int i2) {
        this.a.onSurfaceChanged(i, i2);
    }

    @Override // com.google.vr.sdk.base.GvrView.Renderer
    public final void onSurfaceCreated(EGLConfig eGLConfig) {
        this.a.onSurfaceCreated(eGLConfig);
    }
}
