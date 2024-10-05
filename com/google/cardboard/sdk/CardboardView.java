package com.google.cardboard.sdk;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.cardboard.sdk.nativetypes.EyeTextureDescription;
import com.google.cardboard.sdk.nativetypes.Mesh;
import com.google.cardboard.sdk.utils.MathUtils;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CardboardView extends FrameLayout {
    private static final String TAG = "CardboardView";
    private static boolean useGvrGlSurfaceView = false;
    private CardboardLayout cardboardLayout;
    private CardboardViewApi cardboardViewApi;
    private boolean currentStereoRenderMode;
    private final int[] depthRenderBuffer;
    private boolean deviceParamsChanged;
    private final int[] framebuffer;
    private SafeSurfaceView glView;
    private long lastLogTime;
    private EyeData leftEyeData;
    private Eye monocularEye;
    private Renderer renderer;
    private EyeData rightEyeData;
    private boolean screenParamsChanged;
    private boolean shutdownCalled;
    private boolean stereoRenderMode;
    private final int[] texture;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class Eye {
        public static final int LEFT = 0;
        public static final int MONOCULAR = 2;
        static final float MONOCULAR_FOV_Y_DEGREES = 45.0f;
        public static final int RIGHT = 1;
        private final CardboardViewApi cardboardViewApi;
        private final float[] eyeFromHeadMatrix;
        private final int eyeType;
        private final float[] projectionMatrix = new float[16];

        public Eye(int i, CardboardViewApi cardboardViewApi) {
            float[] fArr = new float[16];
            this.eyeFromHeadMatrix = fArr;
            this.eyeType = i;
            this.cardboardViewApi = cardboardViewApi;
            if (i == 2) {
                cardboardViewApi.getEyeFromHeadMatrix(0, fArr);
            } else {
                cardboardViewApi.getEyeFromHeadMatrix(i, fArr);
            }
        }

        private void computeMonocularPerspectiveMatrix(float f, float f2) {
            Matrix.perspectiveM(this.projectionMatrix, 0, MONOCULAR_FOV_Y_DEGREES, this.cardboardViewApi.getScreenParamsWidth() / this.cardboardViewApi.getScreenParamsHeight(), f, f2);
        }

        public float[] getEyeFromHead() {
            return this.eyeFromHeadMatrix;
        }

        public int getEyeType() {
            return this.eyeType;
        }

        public float[] getFieldOfView() {
            return new float[]{this.cardboardViewApi.getFieldOfViewParamsLeft(), this.cardboardViewApi.getFieldOfViewParamsRight(), this.cardboardViewApi.getFieldOfViewParamsBottom(), this.cardboardViewApi.getFieldOfViewParamsTop()};
        }

        public float[] getPerspective(float f, float f2) {
            int i = this.eyeType;
            if (i == 2) {
                computeMonocularPerspectiveMatrix(f, f2);
            } else {
                this.cardboardViewApi.getEyeProjectionMatrix(i, f, f2, this.projectionMatrix);
            }
            return this.projectionMatrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class EyeData {
        public final Eye eye;
        public final EyeTextureDescription textureDescription = new EyeTextureDescription();

        public EyeData(int i, CardboardViewApi cardboardViewApi) {
            this.eye = new Eye(i, cardboardViewApi);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Renderer {
        void onDrawEye(Eye eye);

        void onFinishFrame(int i, int i2, int i3, int i4);

        void onNewFrame(float[] fArr);

        void onRendererShutdown();

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SafeCardboardGLSurfaceView extends CardboardGLSurfaceView implements SafeSurfaceView {
        private boolean isViewAttached;
        private Runnable onViewDetachedRunnable;

        public SafeCardboardGLSurfaceView(Context context) {
            super(context);
            this.isViewAttached = false;
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public boolean isViewAttached() {
            return this.isViewAttached;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.cardboard.sdk.CardboardGLSurfaceView, android.view.SurfaceView, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.isViewAttached = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.cardboard.sdk.CardboardGLSurfaceView, android.view.SurfaceView, android.view.View
        public void onDetachedFromWindow() {
            Runnable runnable = this.onViewDetachedRunnable;
            if (runnable != null) {
                runnable.run();
            }
            this.isViewAttached = false;
            super.onDetachedFromWindow();
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public void setOnViewDetachedRunnable(Runnable runnable) {
            this.onViewDetachedRunnable = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SafeGLSurfaceView extends GLSurfaceView implements SafeSurfaceView {
        private boolean isViewAttached;
        private Runnable onViewDetachedRunnable;

        public SafeGLSurfaceView(Context context) {
            super(context);
            this.isViewAttached = false;
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public boolean isViewAttached() {
            return this.isViewAttached;
        }

        @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.isViewAttached = true;
        }

        @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
        protected void onDetachedFromWindow() {
            Runnable runnable = this.onViewDetachedRunnable;
            if (runnable != null) {
                runnable.run();
            }
            this.isViewAttached = false;
            super.onDetachedFromWindow();
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public void setOnViewDetachedRunnable(Runnable runnable) {
            this.onViewDetachedRunnable = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface SafeSurfaceView {
        boolean isViewAttached();

        void onPause();

        void onResume();

        void queueEvent(Runnable runnable);

        void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6);

        void setEGLContextClientVersion(int i);

        void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory);

        void setLayoutParams(ViewGroup.LayoutParams layoutParams);

        void setOnTouchListener(View.OnTouchListener onTouchListener);

        void setOnViewDetachedRunnable(Runnable runnable);

        void setPreserveEGLContextOnPause(boolean z);

        void setRenderMode(int i);

        void setRenderer(GLSurfaceView.Renderer renderer);
    }

    public CardboardView(Context context) {
        super(context);
        this.depthRenderBuffer = new int[1];
        this.framebuffer = new int[1];
        this.texture = new int[1];
        this.shutdownCalled = false;
        Log.w(TAG, "CW(C)");
        initialize(context);
    }

    private static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            while (true) {
                String str2 = TAG;
                String gluErrorString = GLU.gluErrorString(glGetError);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(gluErrorString).length());
                sb.append(str);
                sb.append(": glError ");
                sb.append(gluErrorString);
                Log.w(str2, sb.toString());
                int glGetError2 = GLES20.glGetError();
                if (glGetError2 == 0) {
                    break;
                } else {
                    glGetError = glGetError2;
                }
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            throw new RuntimeException(valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
        }
    }

    private void errorLogCurrentState() {
        String str = TAG;
        boolean z = this.screenParamsChanged;
        boolean z2 = this.deviceParamsChanged;
        boolean z3 = this.stereoRenderMode;
        boolean z4 = this.currentStereoRenderMode;
        boolean z5 = this.renderer != null;
        StringBuilder sb = new StringBuilder(140);
        sb.append("screenParamsChanged: ");
        sb.append(z);
        sb.append(" | deviceParamsChanged: ");
        sb.append(z2);
        sb.append(" | stereoRenderMode: ");
        sb.append(z3);
        sb.append(" | currentStereoRenderMode: ");
        sb.append(z4);
        sb.append(" | renderer != null: ");
        sb.append(z5);
        Log.w(str, sb.toString());
    }

    private float[] getPose() {
        float[] fArr = {0.0f, 0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 1.0f};
        this.cardboardViewApi.getPose(fArr, fArr2);
        return MathUtils.getMatrixFromPose(fArr, fArr2);
    }

    private void glSetup() {
        if (this.framebuffer[0] != 0) {
            glTeardown();
        }
        GLES20.glGenTextures(1, IntBuffer.wrap(this.texture));
        GLES20.glBindTexture(3553, this.texture[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6407, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight(), 0, 6407, 5121, null);
        EyeTextureDescription eyeTextureDescription = this.leftEyeData.textureDescription;
        long j = this.texture[0];
        eyeTextureDescription.texture = j;
        eyeTextureDescription.leftU = 0.0f;
        eyeTextureDescription.rightU = 0.5f;
        eyeTextureDescription.topV = 1.0f;
        eyeTextureDescription.bottomV = 0.0f;
        EyeTextureDescription eyeTextureDescription2 = this.rightEyeData.textureDescription;
        eyeTextureDescription2.texture = j;
        eyeTextureDescription2.leftU = 0.5f;
        eyeTextureDescription2.rightU = 1.0f;
        eyeTextureDescription2.topV = 1.0f;
        eyeTextureDescription2.bottomV = 0.0f;
        GLES20.glGenRenderbuffers(1, IntBuffer.wrap(this.depthRenderBuffer));
        GLES20.glBindRenderbuffer(36161, this.depthRenderBuffer[0]);
        GLES20.glRenderbufferStorage(36161, 33189, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight());
        checkGlError("Create Render buffer");
        GLES20.glGenFramebuffers(1, IntBuffer.wrap(this.framebuffer));
        GLES20.glBindFramebuffer(36160, this.framebuffer[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texture[0], 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.depthRenderBuffer[0]);
        checkGlError("glSetup");
    }

    private void glTeardown() {
        if (this.framebuffer[0] == 0) {
            return;
        }
        GLES20.glDeleteRenderbuffers(1, IntBuffer.wrap(this.depthRenderBuffer));
        this.depthRenderBuffer[0] = 0;
        GLES20.glDeleteFramebuffers(1, IntBuffer.wrap(this.framebuffer));
        this.framebuffer[0] = 0;
        GLES20.glDeleteTextures(1, IntBuffer.wrap(this.texture));
        this.texture[0] = 0;
        checkGlError("glTeardown");
    }

    private void initialize(Context context) {
        this.cardboardViewApi = new CardboardViewApi(context);
        this.renderer = null;
        if (useGvrGlSurfaceView) {
            Log.w(TAG, "Using GVR Surface");
            this.glView = new SafeCardboardGLSurfaceView(context);
        } else {
            Log.w(TAG, "Using Android Surface");
            this.glView = new SafeGLSurfaceView(context);
        }
        this.glView.setEGLContextClientVersion(2);
        this.glView.setPreserveEGLContextOnPause(true);
        this.glView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView((SurfaceView) this.glView);
        this.cardboardLayout = new CardboardLayout(context);
        setStereoRenderMode(false);
        this.screenParamsChanged = false;
        this.deviceParamsChanged = false;
        addView(this.cardboardLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$setOnTriggerEvent$0(Runnable runnable, View view, MotionEvent motionEvent) {
        if (runnable == null || motionEvent.getAction() != 0) {
            return false;
        }
        runnable.run();
        return true;
    }

    private void logOnDrawFrame() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.lastLogTime < 1000) {
            return;
        }
        this.lastLogTime = uptimeMillis;
        Log.w(TAG, "DF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDrawFrame() {
        if (this.shutdownCalled) {
            Log.w(TAG, "DFS");
            return;
        }
        this.currentStereoRenderMode = this.stereoRenderMode;
        logOnDrawFrame();
        updateDeviceParams();
        Renderer renderer = this.renderer;
        if (renderer != null) {
            try {
                renderer.onNewFrame(getPose());
            } finally {
            }
        }
        if (this.currentStereoRenderMode) {
            onRenderStereoFrame();
        } else {
            onRenderMonocularFrame();
        }
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            try {
                renderer2.onFinishFrame(0, 0, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight());
            } finally {
            }
        }
        checkGlError("onDrawFrame");
    }

    private void onRenderMonocularFrame() {
        if (this.currentStereoRenderMode) {
            return;
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.renderer != null) {
            GLES20.glViewport(0, 0, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight());
            try {
                this.renderer.onDrawEye(this.monocularEye);
            } catch (Throwable th) {
                errorLogCurrentState();
                throw th;
            }
        }
    }

    private void onRenderStereoFrame() {
        if (this.currentStereoRenderMode) {
            GLES20.glBindFramebuffer(36160, this.framebuffer[0]);
            GLES20.glClear(16640);
            if (this.renderer != null) {
                GLES20.glViewport(0, 0, this.cardboardViewApi.getScreenParamsWidth() / 2, this.cardboardViewApi.getScreenParamsHeight());
                try {
                    this.renderer.onDrawEye(this.leftEyeData.eye);
                    GLES20.glViewport(this.cardboardViewApi.getScreenParamsWidth() / 2, 0, this.cardboardViewApi.getScreenParamsWidth() / 2, this.cardboardViewApi.getScreenParamsHeight());
                    try {
                        this.renderer.onDrawEye(this.rightEyeData.eye);
                    } finally {
                    }
                } finally {
                }
            }
            this.cardboardViewApi.renderEyeToDisplay(this.leftEyeData.textureDescription, this.rightEyeData.textureDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceChanged(int i, int i2) {
        String str = TAG;
        StringBuilder sb = new StringBuilder(29);
        sb.append("OSC(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        Log.w(str, sb.toString());
        if (this.shutdownCalled) {
            Log.w(str, "OSCS");
            return;
        }
        this.cardboardViewApi.setScreenParams(i, i2);
        this.screenParamsChanged = true;
        Renderer renderer = this.renderer;
        if (renderer != null) {
            try {
                renderer.onSurfaceChanged(i, i2);
            } catch (Throwable th) {
                errorLogCurrentState();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceCreated(EGLConfig eGLConfig) {
        if (this.shutdownCalled) {
            Log.w(TAG, "OSCRS");
            return;
        }
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.onSurfaceCreated(eGLConfig);
        }
    }

    public static void setUseGvrGlSurfaceView(boolean z) {
        useGvrGlSurfaceView = z;
        String str = TAG;
        StringBuilder sb = new StringBuilder(12);
        sb.append("GVRSV(");
        sb.append(z);
        sb.append(")");
        Log.w(str, sb.toString());
    }

    private boolean updateDeviceParams() {
        if (!this.screenParamsChanged && !this.deviceParamsChanged) {
            return true;
        }
        this.screenParamsChanged = false;
        this.deviceParamsChanged = false;
        this.cardboardViewApi.loadDeviceParams();
        if (!this.currentStereoRenderMode) {
            glTeardown();
            this.monocularEye = new Eye(2, this.cardboardViewApi);
            return true;
        }
        Mesh distortionMesh = this.cardboardViewApi.getDistortionMesh(0);
        Mesh distortionMesh2 = this.cardboardViewApi.getDistortionMesh(1);
        this.leftEyeData = new EyeData(0, this.cardboardViewApi);
        this.rightEyeData = new EyeData(1, this.cardboardViewApi);
        glSetup();
        this.cardboardViewApi.initializeRenderThread();
        this.cardboardViewApi.setMesh(distortionMesh, 0);
        this.cardboardViewApi.setMesh(distortionMesh2, 1);
        checkGlError("updateDeviceParams");
        return true;
    }

    public boolean isGlViewAttached() {
        return this.glView.isViewAttached();
    }

    public boolean isStereoRenderModeEnabled() {
        return this.stereoRenderMode;
    }

    public void loadDeviceParams() {
        Log.w(TAG, "LDP");
        this.deviceParamsChanged = true;
        this.cardboardViewApi.loadDeviceParams();
    }

    public void onDestroy() {
        Log.w(TAG, "OD");
        shutdownCalled();
        this.cardboardViewApi.close();
    }

    public void onPause() {
        Log.w(TAG, "OP");
        this.cardboardViewApi.pauseHeadTracker();
        this.glView.onPause();
    }

    public void onResume() {
        Log.w(TAG, "OR()");
        this.deviceParamsChanged = true;
        this.glView.onResume();
        this.cardboardViewApi.resumeHeadTracker();
    }

    public void onSettingsButtonClick() {
        Log.w(TAG, "OSBC");
        CardboardViewApi cardboardViewApi = this.cardboardViewApi;
        if (!cardboardViewApi.isDaydreamReadyPhone || cardboardViewApi.getGvrDeviceParams() == null) {
            this.cardboardViewApi.scanViewerQrCode();
        } else {
            this.cardboardViewApi.launchVrCoreSettingsActivity();
        }
    }

    public void queueEvent(Runnable runnable) {
        this.glView.queueEvent(runnable);
    }

    public void scanViewerQrCode() {
        Log.w(TAG, "SVQRC");
        this.cardboardViewApi.scanViewerQrCode();
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        this.glView.setEGLConfigChooser(i, i2, i3, i4, i5, i6);
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.glView.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    public void setOnBackButtonClick(Runnable runnable) {
        Log.w(TAG, "SOBBC");
        this.cardboardLayout.setOnBackButtonClick(runnable);
    }

    public void setOnSettingsButtonClick(Runnable runnable) {
        Log.w(TAG, "SOSBC");
        this.cardboardLayout.setOnSettingskButtonClick(runnable);
    }

    public void setOnTriggerEvent(final Runnable runnable) {
        Log.w(TAG, "SOTE");
        this.glView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.cardboard.sdk.CardboardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CardboardView.lambda$setOnTriggerEvent$0(runnable, view, motionEvent);
            }
        });
    }

    public void setOnViewDetachedRunnable(Runnable runnable) {
        Log.w(TAG, "SOVDR");
        this.glView.setOnViewDetachedRunnable(runnable);
    }

    public void setRenderer(Renderer renderer) {
        Log.w(TAG, "SR");
        this.renderer = renderer;
        this.lastLogTime = SystemClock.uptimeMillis();
        this.glView.setRenderer(new GLSurfaceView.Renderer() { // from class: com.google.cardboard.sdk.CardboardView.1
            @Override // android.opengl.GLSurfaceView.Renderer
            public void onDrawFrame(GL10 gl10) {
                CardboardView.this.onDrawFrame();
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceChanged(GL10 gl10, int i, int i2) {
                CardboardView.this.onSurfaceChanged(i, i2);
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                CardboardView.this.onSurfaceCreated(eGLConfig);
            }
        });
        this.glView.setRenderMode(1);
    }

    public void setStereoRenderMode(boolean z) {
        String str = TAG;
        StringBuilder sb = new StringBuilder(14);
        sb.append("SSRMode(");
        sb.append(z);
        sb.append(")");
        Log.w(str, sb.toString());
        this.stereoRenderMode = z;
        this.screenParamsChanged = true;
        if (z) {
            this.cardboardLayout.showAll();
        } else {
            this.cardboardLayout.hideAll();
        }
    }

    public void shutdownCalled() {
        this.shutdownCalled = true;
    }

    public CardboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.depthRenderBuffer = new int[1];
        this.framebuffer = new int[1];
        this.texture = new int[1];
        this.shutdownCalled = false;
        Log.w(TAG, "CW(C,A)");
        initialize(context);
    }
}
