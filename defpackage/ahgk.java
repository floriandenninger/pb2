package defpackage;

import com.google.cardboard.sdk.CardboardView;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import javax.microedition.khronos.egl.EGLConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahgk implements CardboardView.Renderer {
    public GvrView.StereoRenderer a = null;
    public boolean b = false;
    private final HeadTransform c = new HeadTransform();
    private final Viewport d = new Viewport();

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onDrawEye(CardboardView.Eye eye) {
        if (!this.b || this.a == null) {
            return;
        }
        if (eye.getEyeType() == 0) {
            this.a.onDrawEye(new ahgj(eye, 1, this.c.getHeadView()));
        } else {
            this.a.onDrawEye(new ahgj(eye, 2, this.c.getHeadView()));
        }
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onFinishFrame(int i, int i2, int i3, int i4) {
        GvrView.StereoRenderer stereoRenderer;
        this.d.setViewport(i, i2, i3, i4);
        if (!this.b || (stereoRenderer = this.a) == null) {
            return;
        }
        stereoRenderer.onFinishFrame(this.d);
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onNewFrame(float[] fArr) {
        GvrView.StereoRenderer stereoRenderer;
        System.arraycopy(fArr, 0, this.c.getHeadView(), 0, 16);
        if (!this.b || (stereoRenderer = this.a) == null) {
            return;
        }
        stereoRenderer.onNewFrame(this.c);
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onRendererShutdown() {
        GvrView.StereoRenderer stereoRenderer;
        if (!this.b || (stereoRenderer = this.a) == null) {
            return;
        }
        stereoRenderer.onRendererShutdown();
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onSurfaceChanged(int i, int i2) {
        GvrView.StereoRenderer stereoRenderer;
        this.d.setViewport(0, 0, i, i2);
        if (!this.b || (stereoRenderer = this.a) == null) {
            return;
        }
        stereoRenderer.onSurfaceChanged(i, i2);
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onSurfaceCreated(EGLConfig eGLConfig) {
        GvrView.StereoRenderer stereoRenderer;
        if (!this.b || (stereoRenderer = this.a) == null) {
            return;
        }
        stereoRenderer.onSurfaceCreated(eGLConfig);
    }
}
