package com.google.vr.sdk.base;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.vr.ndk.base.GvrSurfaceView;
import defpackage.axfq;
import javax.microedition.khronos.egl.EGLConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrView extends FrameLayout {
    private CardboardViewApi cardboardViewApi;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Renderer {
        void onDrawFrame(HeadTransform headTransform, Eye eye, Eye eye2);

        void onFinishFrame(Viewport viewport);

        void onRendererShutdown();

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface StereoRenderer {
        void onDrawEye(Eye eye);

        void onFinishFrame(Viewport viewport);

        void onNewFrame(HeadTransform headTransform);

        void onRendererShutdown();

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    public GvrView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        if (isInEditMode()) {
            return;
        }
        if (axfq.k(context) == null) {
            throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
        }
        CardboardViewApi createCardboardViewApi = ImplementationSelector.createCardboardViewApi(context);
        this.cardboardViewApi = createCardboardViewApi;
        addView(createCardboardViewApi.getRootView(), 0);
        GvrSurfaceView gvrSurfaceView = this.cardboardViewApi.getGvrSurfaceView();
        gvrSurfaceView.setEGLContextClientVersion(2);
        gvrSurfaceView.setPreserveEGLContextOnPause(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return GvrView.class.getName();
    }

    public GvrViewerParams getGvrViewerParams() {
        return this.cardboardViewApi.getGvrViewerParams();
    }

    public void onPause() {
        this.cardboardViewApi.onPause();
    }

    public void onResume() {
        this.cardboardViewApi.onResume();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.cardboardViewApi.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void queueEvent(Runnable runnable) {
        this.cardboardViewApi.getGvrSurfaceView().queueEvent(runnable);
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        this.cardboardViewApi.getGvrSurfaceView().setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.cardboardViewApi.getGvrSurfaceView().setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    public void setOnCardboardTriggerListener(Runnable runnable) {
        this.cardboardViewApi.setOnCardboardTriggerListener(runnable);
    }

    public void setOnCloseButtonListener(Runnable runnable) {
        this.cardboardViewApi.setOnCloseButtonListener(runnable);
    }

    public void setRenderer(StereoRenderer stereoRenderer) {
        if (stereoRenderer == null) {
            throw new IllegalArgumentException("StereoRenderer must not be null");
        }
        this.cardboardViewApi.setRenderer(stereoRenderer);
    }

    public void setStereoModeEnabled(boolean z) {
        this.cardboardViewApi.setStereoModeEnabled(z);
    }

    public void shutdown() {
        this.cardboardViewApi.shutdown();
    }
}
