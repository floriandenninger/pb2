package com.google.vr.sdk.base;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.vr.ndk.base.GvrApi;
import com.google.vr.ndk.base.GvrLayout;
import com.google.vr.ndk.base.GvrSurfaceView;
import com.google.vr.ndk.base.GvrUiLayout;
import com.google.vr.sdk.base.GvrView;
import defpackage.axfr;
import defpackage.axfs;
import defpackage.axgo;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CardboardViewNativeImpl implements CardboardViewApi, axfr {
    private static final String TAG = "CardboardViewNativeImpl";
    private volatile Runnable cardboardBackListener;
    private volatile Runnable cardboardTriggerListener;
    private final Context context;
    private final axfs glSurfaceView;
    private final GvrApi gvrApi;
    private final GvrLayout gvrLayout;
    private final HeadMountedDisplayManager hmdManager;
    private long nativeCardboardView;
    private final RendererHelper rendererHelper;
    private CountDownLatch shutdownLatch;
    private final GvrUiLayout uiLayout;
    private int cardboardTriggerCount = 0;
    private boolean stereoMode = true;
    private volatile boolean distortionCorrectionEnabled = true;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class RendererHelper implements GLSurfaceView.Renderer {
        private EGLDisplay eglDisplay;
        private boolean invalidSurfaceSizeWarningShown;
        private GvrView.Renderer renderer;
        private ScreenParams screenParams;
        private boolean stereoMode;
        private GvrView.StereoRenderer stereoRenderer;
        private boolean surfaceCreated;

        public RendererHelper() {
            this.screenParams = new ScreenParams(CardboardViewNativeImpl.this.getScreenParams());
            this.stereoMode = CardboardViewNativeImpl.this.stereoMode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void callOnRendererShutdown() {
            GvrView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onRendererShutdown();
                return;
            }
            GvrView.StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                stereoRenderer.onRendererShutdown();
            }
        }

        private void callOnSurfaceChanged(int i, int i2) {
            GvrView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onSurfaceChanged(i, i2);
                return;
            }
            GvrView.StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                if (this.stereoMode) {
                    stereoRenderer.onSurfaceChanged(i / 2, i2);
                } else {
                    stereoRenderer.onSurfaceChanged(i, i2);
                }
            }
        }

        private void callOnSurfaceCreated(EGLConfig eGLConfig) {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeOnSurfaceCreated(cardboardViewNativeImpl.nativeCardboardView);
            GvrView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onSurfaceCreated(eGLConfig);
                return;
            }
            GvrView.StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                stereoRenderer.onSurfaceCreated(eGLConfig);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if (!(this.renderer == null && this.stereoRenderer == null) && this.surfaceCreated) {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeOnDrawFrame(cardboardViewNativeImpl.nativeCardboardView);
                EGL14.eglSwapInterval(this.eglDisplay, 1);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            if (!(this.renderer == null && this.stereoRenderer == null) && this.surfaceCreated) {
                if (!this.stereoMode || (i == this.screenParams.getWidth() && i2 == this.screenParams.getHeight())) {
                    this.invalidSurfaceSizeWarningShown = false;
                } else {
                    if (!this.invalidSurfaceSizeWarningShown) {
                        String str = CardboardViewNativeImpl.TAG;
                        int width = this.screenParams.getWidth();
                        int height = this.screenParams.getHeight();
                        StringBuilder sb = new StringBuilder(134);
                        sb.append("Surface size ");
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append(" does not match the expected screen size ");
                        sb.append(width);
                        sb.append("x");
                        sb.append(height);
                        sb.append(". Stereo rendering might feel off.");
                        Log.e(str, sb.toString());
                    }
                    this.invalidSurfaceSizeWarningShown = true;
                }
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeOnSurfaceChanged(cardboardViewNativeImpl.nativeCardboardView, i, i2);
                callOnSurfaceChanged(i, i2);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            if (this.renderer == null && this.stereoRenderer == null) {
                return;
            }
            this.surfaceCreated = true;
            this.eglDisplay = EGL14.eglGetCurrentDisplay();
            callOnSurfaceCreated(eGLConfig);
        }

        public void setRenderer(GvrView.StereoRenderer stereoRenderer) {
            this.stereoRenderer = stereoRenderer;
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetStereoRenderer(cardboardViewNativeImpl.nativeCardboardView, stereoRenderer);
        }

        public void setScreenParams(ScreenParams screenParams) {
            this.screenParams = screenParams;
        }

        public void setStereoModeEnabled(final boolean z) {
            CardboardViewNativeImpl.this.checkNativeCardboardView();
            CardboardViewNativeImpl.this.gvrLayout.setStereoModeEnabled(z);
            CardboardViewNativeImpl.this.queueEvent(new Runnable() { // from class: com.google.vr.sdk.base.CardboardViewNativeImpl.RendererHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z2 = RendererHelper.this.stereoMode;
                    boolean z3 = z;
                    if (z2 == z3) {
                        return;
                    }
                    RendererHelper.this.stereoMode = z3;
                    CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                    cardboardViewNativeImpl.nativeSetStereoModeEnabled(cardboardViewNativeImpl.nativeCardboardView, z);
                    if (EGL10.EGL_NO_SURFACE.equals(((EGL10) EGLContext.getEGL()).eglGetCurrentSurface(12377))) {
                        return;
                    }
                    RendererHelper rendererHelper = RendererHelper.this;
                    rendererHelper.onSurfaceChanged(null, rendererHelper.screenParams.getWidth(), RendererHelper.this.screenParams.getHeight());
                }
            });
        }

        public void shutdown() {
            CardboardViewNativeImpl.this.queueEvent(new Runnable() { // from class: com.google.vr.sdk.base.CardboardViewNativeImpl.RendererHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if ((RendererHelper.this.renderer != null || RendererHelper.this.stereoRenderer != null) && RendererHelper.this.surfaceCreated) {
                        RendererHelper.this.surfaceCreated = false;
                        RendererHelper.this.callOnRendererShutdown();
                    }
                    CardboardViewNativeImpl.this.shutdownLatch.countDown();
                }
            });
        }
    }

    public CardboardViewNativeImpl(Context context) {
        String str;
        this.context = context;
        this.hmdManager = new HeadMountedDisplayManager(context);
        try {
            str = (String) Class.forName(String.valueOf(getClass().getPackage().getName()).concat(".NativeProxy")).getDeclaredField("PROXY_LIBRARY").get(null);
        } catch (Exception unused) {
            str = "gvr";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Loading native library ".concat(valueOf);
        }
        System.loadLibrary(str);
        nativeSetApplicationState(getClass().getClassLoader(), context.getApplicationContext());
        axfs axfsVar = new axfs(context, this);
        this.glSurfaceView = axfsVar;
        GvrLayout gvrLayout = new GvrLayout(context);
        this.gvrLayout = gvrLayout;
        gvrLayout.setPresentationView(axfsVar);
        this.rendererHelper = new RendererHelper();
        this.uiLayout = gvrLayout.getUiLayout();
        GvrApi gvrApi = gvrLayout.getGvrApi();
        this.gvrApi = gvrApi;
        this.nativeCardboardView = nativeInit(gvrApi.getNativeGvrContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkNativeCardboardView() {
        if (this.nativeCardboardView == 0) {
            throw new IllegalStateException("GvrView has already been shut down.");
        }
    }

    private native void nativeDestroy(long j);

    private native void nativeGetCurrentEyeParams(long j, HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5);

    private native float nativeGetNeckModelFactor(long j);

    private native long nativeInit(long j);

    private native void nativeLogEvent(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnDrawFrame(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnSurfaceChanged(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnSurfaceCreated(long j);

    private static native long nativeSetApplicationState(ClassLoader classLoader, Context context);

    private native void nativeSetDepthStencilFormat(long j, int i);

    private native void nativeSetDistortionCorrectionEnabled(long j, boolean z);

    private native void nativeSetDistortionCorrectionScale(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetGvrViewerParams(long j, byte[] bArr);

    private native void nativeSetMultisampling(long j, int i);

    private native void nativeSetNeckModelEnabled(long j, boolean z);

    private native void nativeSetNeckModelFactor(long j, float f);

    private native void nativeSetRenderer(long j, GvrView.Renderer renderer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetScreenParams(long j, int i, int i2, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetStereoModeEnabled(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetStereoRenderer(long j, GvrView.StereoRenderer stereoRenderer);

    private native void nativeUndistortTexture(long j, int i);

    private void onCardboardBack() {
        runOnCardboardBackListener();
    }

    private void onCardboardTrigger() {
        Runnable runnable = this.cardboardTriggerListener;
        if (runnable != null) {
            axgo.a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueEvent(Runnable runnable) {
        this.glSurfaceView.queueEvent(runnable);
    }

    private void runOnCardboardBackListener() {
        Runnable runnable = this.cardboardBackListener;
        if (runnable != null) {
            axgo.a(runnable);
        }
    }

    private void setGvrViewerParams(final GvrViewerParams gvrViewerParams) {
        this.uiLayout.setViewerName(new GvrViewerParams(gvrViewerParams).getModel());
        queueEvent(new Runnable() { // from class: com.google.vr.sdk.base.CardboardViewNativeImpl.6
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetGvrViewerParams(cardboardViewNativeImpl.nativeCardboardView, gvrViewerParams.toByteArray());
            }
        });
    }

    private void setScreenParams(ScreenParams screenParams) {
        final ScreenParams screenParams2 = new ScreenParams(screenParams);
        queueEvent(new Runnable() { // from class: com.google.vr.sdk.base.CardboardViewNativeImpl.7
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl.this.rendererHelper.setScreenParams(screenParams2);
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetScreenParams(cardboardViewNativeImpl.nativeCardboardView, screenParams2.getWidth(), screenParams2.getHeight(), screenParams2.getWidthMeters() / screenParams2.getWidth(), screenParams2.getHeightMeters() / screenParams2.getHeight(), screenParams2.getBorderSizeMeters());
            }
        });
    }

    protected void finalize() {
        try {
            if (this.nativeCardboardView != 0) {
                Log.w(TAG, "GvrView.shutdown() should be called to ensure resource cleanup");
                nativeDestroy(this.nativeCardboardView);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public GvrSurfaceView getGvrSurfaceView() {
        return this.glSurfaceView;
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public GvrViewerParams getGvrViewerParams() {
        return this.hmdManager.getHeadMountedDisplay().getGvrViewerParams();
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public View getRootView() {
        return this.gvrLayout;
    }

    public ScreenParams getScreenParams() {
        return this.hmdManager.getHeadMountedDisplay().getScreenParams();
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public void onPause() {
        checkNativeCardboardView();
        this.gvrApi.pauseTracking();
        this.hmdManager.onPause();
        this.glSurfaceView.onPause();
        this.gvrLayout.onPause();
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public void onResume() {
        checkNativeCardboardView();
        this.gvrLayout.onResume();
        this.glSurfaceView.onResume();
        this.hmdManager.onResume();
        setScreenParams(getScreenParams());
        setGvrViewerParams(getGvrViewerParams());
        this.gvrApi.resumeTracking();
    }

    @Override // defpackage.axfr
    public void onSurfaceViewDetachedFromWindow() {
        if (this.shutdownLatch == null) {
            this.shutdownLatch = new CountDownLatch(1);
            this.rendererHelper.shutdown();
            try {
                this.shutdownLatch.await();
            } catch (InterruptedException e) {
                String str = TAG;
                String valueOf = String.valueOf(e.toString());
                Log.e(str, valueOf.length() != 0 ? "Interrupted during shutdown: ".concat(valueOf) : new String("Interrupted during shutdown: "));
            }
            this.shutdownLatch = null;
        }
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 || this.cardboardTriggerListener == null) {
            return false;
        }
        onCardboardTrigger();
        return true;
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public void setOnCardboardTriggerListener(Runnable runnable) {
        this.cardboardTriggerListener = runnable;
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public void setOnCloseButtonListener(Runnable runnable) {
        this.uiLayout.setCloseButtonListener(runnable);
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public void setRenderer(GvrView.StereoRenderer stereoRenderer) {
        this.rendererHelper.setRenderer(stereoRenderer);
        this.glSurfaceView.setRenderer(this.rendererHelper);
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public void setStereoModeEnabled(boolean z) {
        this.stereoMode = z;
        this.rendererHelper.setStereoModeEnabled(z);
    }

    @Override // com.google.vr.sdk.base.CardboardViewApi
    public void shutdown() {
        if (this.nativeCardboardView != 0) {
            this.hmdManager.close();
            this.gvrLayout.shutdown();
            nativeDestroy(this.nativeCardboardView);
            this.nativeCardboardView = 0L;
        }
    }
}
