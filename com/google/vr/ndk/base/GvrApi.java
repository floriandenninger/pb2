package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.Surface;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vr.cardboard.EglReadyListener;
import com.google.vr.ndk.base.UserPrefs;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import defpackage.andb;
import defpackage.awxr;
import defpackage.axfq;
import defpackage.axhe;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrApi {
    private static final boolean IS_ROBOLECTRIC_BUILD = "robolectric".equals(Build.FINGERPRINT);
    private static PoseTracker sPoseTrackerForTesting;
    private final Context context;
    private final DisplaySynchronizer displaySynchronizer;
    private long nativeGvrContext;
    private final boolean ownsNativeGvrContext;
    private ArrayList swapChainRefs;
    private final axhe vrParamsProvider;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    interface IdleListener {
        void onIdleChanged(boolean z);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface PoseTracker {
        void getHeadPoseInStartSpace(float[] fArr, long j);
    }

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            DefaultNativeLibraryLoader.maybeLoadDefaultLibrary();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public GvrApi(Context context, long j) {
        if (j == 0) {
            throw new IllegalArgumentException("Invalid wrapped native GVR context.");
        }
        this.context = context;
        this.ownsNativeGvrContext = false;
        this.nativeGvrContext = j;
        this.vrParamsProvider = awxr.h(context);
        this.displaySynchronizer = null;
        this.swapChainRefs = new ArrayList();
        setApplicationState(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DisplaySynchronizer createDefaultDisplaySynchronizer(Context context) {
        return new DisplaySynchronizer(context, axfq.i(context));
    }

    static native byte[] nativeAnalyticsCreateSample(long j, byte[] bArr);

    static native long nativeBufferSpecCreate(long j);

    static native void nativeBufferSpecDestroy(long j);

    static native int nativeBufferSpecGetSamples(long j);

    static native void nativeBufferSpecGetSize(long j, Point point);

    static native void nativeBufferSpecSetColorFormat(long j, int i);

    static native void nativeBufferSpecSetDepthStencilFormat(long j, int i);

    static native void nativeBufferSpecSetMultiviewLayers(long j, int i);

    static native void nativeBufferSpecSetSamples(long j, int i);

    static native void nativeBufferSpecSetSize(long j, int i, int i2);

    static native long nativeBufferViewportCreate(long j);

    static native void nativeBufferViewportDestroy(long j);

    static native boolean nativeBufferViewportEqual(long j, long j2);

    static native int nativeBufferViewportGetExternalSurfaceId(long j);

    static native float nativeBufferViewportGetOpacity(long j);

    static native int nativeBufferViewportGetReprojection(long j);

    static native int nativeBufferViewportGetSourceBufferIndex(long j);

    static native void nativeBufferViewportGetSourceFov(long j, RectF rectF);

    static native void nativeBufferViewportGetSourceUv(long j, RectF rectF);

    static native int nativeBufferViewportGetTargetEye(long j);

    static native void nativeBufferViewportGetTransform(long j, float[] fArr);

    private native long nativeBufferViewportListCreate(long j);

    static native void nativeBufferViewportListDestroy(long j);

    static native void nativeBufferViewportListGetItem(long j, int i, long j2);

    static native int nativeBufferViewportListGetSize(long j);

    static native void nativeBufferViewportListSetItem(long j, int i, long j2);

    static native void nativeBufferViewportSetExternalSurface(long j, long j2);

    static native void nativeBufferViewportSetExternalSurfaceId(long j, int i);

    static native void nativeBufferViewportSetOpacity(long j, float f);

    static native void nativeBufferViewportSetReprojection(long j, int i);

    static native void nativeBufferViewportSetSourceBufferIndex(long j, int i);

    static native void nativeBufferViewportSetSourceFov(long j, float f, float f2, float f3, float f4);

    static native void nativeBufferViewportSetSourceLayer(long j, int i);

    static native void nativeBufferViewportSetSourceUv(long j, float f, float f2, float f3, float f4);

    static native void nativeBufferViewportSetTargetEye(long j, int i);

    static native void nativeBufferViewportSetTransform(long j, float[] fArr);

    private native int nativeClearError(long j);

    private native float[] nativeComputeDistortedPoint(long j, int i, float[] fArr);

    private native long nativeCreate(ClassLoader classLoader, Context context, long j, PoseTracker poseTracker);

    static native long nativeCreateEvent();

    static native long nativeCreateValue();

    static native void nativeDestroyEvent(long j);

    static native void nativeDestroyValue(long j);

    private native void nativeDistortToScreen(long j, int i, long j2, float[] fArr, long j3);

    private native void nativeDumpDebugData(long j);

    static native long nativeExternalSurfaceCreate(long j);

    static native long nativeExternalSurfaceCreateWithListeners(long j, Runnable runnable, Runnable runnable2, Handler handler);

    static native void nativeExternalSurfaceDestroy(long j);

    static native int nativeExternalSurfaceGetId(long j);

    static native Surface nativeExternalSurfaceGetSurface(long j);

    static native void nativeFrameBindBuffer(long j, int i);

    static native void nativeFrameGetBufferSize(long j, int i, Point point);

    static native int nativeFrameGetFramebufferObject(long j, int i);

    static native void nativeFrameSubmit(long j, long j2, float[] fArr);

    static native void nativeFrameUnbind(long j);

    private native boolean nativeGetAsyncReprojectionEnabled(long j);

    private native float nativeGetBorderSizeMeters(long j);

    private native long nativeGetCurrentProperties(long j);

    private native int nativeGetError(long j);

    private static native String nativeGetErrorString(int i);

    static native long nativeGetEventFlags(long j);

    static native long nativeGetEventTimestamp(long j);

    static native int nativeGetEventType(long j);

    private native void nativeGetEyeFromHeadMatrix(long j, int i, float[] fArr);

    private native void nativeGetHeadSpaceFromStartSpaceRotation(long j, float[] fArr, long j2);

    private native void nativeGetHeadSpaceFromStartSpaceTransform(long j, float[] fArr, long j2);

    private native void nativeGetMaximumEffectiveRenderTargetSize(long j, Point point);

    static native boolean nativeGetProperty(long j, int i, long j2);

    static native long nativeGetRecenterEventFlags(long j);

    static native void nativeGetRecenterEventStartSpaceFromTrackingSpaceTransform(long j, float[] fArr);

    static native int nativeGetRecenterEventType(long j);

    private native void nativeGetRecommendedBufferViewports(long j, long j2);

    private native void nativeGetScreenBufferViewports(long j, long j2);

    private native void nativeGetScreenTargetSize(long j, Point point);

    private static native long nativeGetUserPrefs(long j);

    private native String nativeGetViewerModel(long j);

    private native int nativeGetViewerType(long j);

    private native String nativeGetViewerVendor(long j);

    private native int[] nativeGetWindowBounds(long j);

    private native void nativeInitializeGl(long j);

    private static native boolean nativeIsFeatureSupported(long j, int i);

    private native void nativeOnCompositorLatch(long j, byte[] bArr);

    private native void nativeOnPauseReprojectionThread(long j);

    private native void nativeOnSurfaceChangedReprojectionThread(long j);

    private native void nativeOnSurfaceCreatedReprojectionThread(long j);

    private native void nativePause(long j);

    private native void nativePauseTracking(long j);

    private native byte[] nativePauseTrackingGetState(long j);

    private native boolean nativePollEvent(long j, long j2);

    private native void nativeRecenterTracking(long j);

    private native void nativeReconnectSensors(long j);

    private native void nativeReleaseGvrContext(long j);

    private native Point nativeRenderReprojectionThread(long j);

    private native void nativeRequestContextSharing(long j, EglReadyListener eglReadyListener);

    private native void nativeResetTracking(long j);

    private native void nativeResume(long j);

    private native void nativeResumeTracking(long j);

    private native void nativeResumeTrackingSetState(long j, byte[] bArr);

    private static native void nativeSetApplicationState(ClassLoader classLoader, Context context);

    private native boolean nativeSetAsyncReprojectionEnabled(long j, boolean z);

    private native void nativeSetDefaultFramebufferActive(long j);

    private native boolean nativeSetDefaultViewerProfile(long j, String str);

    private static native void nativeSetDynamicLibraryLoadingEnabled(boolean z);

    private native void nativeSetIdleListener(long j, IdleListener idleListener);

    private native void nativeSetIgnoreManualPauseResumeTracker(long j, boolean z);

    private native void nativeSetLensOffset(long j, float f, float f2, float f3);

    private native void nativeSetSurfaceSize(long j, int i, int i2);

    private native boolean nativeSetViewerParams(long j, byte[] bArr);

    static native long nativeSwapChainAcquireFrame(long j);

    static native long nativeSwapChainCreate(long j, long[] jArr);

    static native void nativeSwapChainDestroy(long j);

    static native int nativeSwapChainGetBufferCount(long j);

    static native void nativeSwapChainGetBufferSize(long j, int i, Point point);

    static native void nativeSwapChainResizeBuffer(long j, int i, int i2, int i3);

    static native int nativeUserPrefsGetControllerHandedness(long j);

    static native boolean nativeUserPrefsGetPerformanceHudEnabled(long j);

    static native boolean nativeUserPrefsGetPerformanceMonitoringEnabled(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean nativeUserPrefsIsFeatureEnabled(long j, int i);

    private static native boolean nativeUsingDynamicLibrary();

    private static native boolean nativeUsingShimLibrary();

    private native boolean nativeUsingVrDisplayService(long j);

    static native long nativeValueAsFlags(long j);

    static native float nativeValueAsFloat(long j);

    static native int nativeValueAsInt(long j);

    static native void nativeValueAsMat4f(long j, float[] fArr);

    static native long nativeValueGetFlags(long j);

    private static void requestFeatures(Context context, long j, int[] iArr, int[] iArr2, PendingIntent pendingIntent) {
        requestFeatures(context, j, UserPrefs.RuntimeFeature.fromIds(iArr), UserPrefs.RuntimeFeature.fromIds(iArr2), pendingIntent);
    }

    private static void setApplicationState(Context context) {
        if (IS_ROBOLECTRIC_BUILD) {
            return;
        }
        nativeSetApplicationState(GvrApi.class.getClassLoader(), context.getApplicationContext());
    }

    public static boolean usingDynamicLibrary(Context context) {
        setApplicationState(context);
        return nativeUsingDynamicLibrary();
    }

    public static boolean usingShimLibrary() {
        return nativeUsingShimLibrary();
    }

    public void dumpDebugData() {
        nativeDumpDebugData(this.nativeGvrContext);
    }

    protected void finalize() {
        try {
            if (this.nativeGvrContext != 0) {
                Log.w("GvrApi", "GvrApi.shutdown() should be called to ensure resource cleanup");
                shutdown();
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getAsyncReprojectionEnabled() {
        return nativeGetAsyncReprojectionEnabled(this.nativeGvrContext);
    }

    public long getNativeGvrContext() {
        return this.nativeGvrContext;
    }

    public andb getSdkConfigurationParams() {
        return SdkConfigurationReader.getParams(this.context);
    }

    public int getViewerType() {
        return nativeGetViewerType(this.nativeGvrContext);
    }

    public boolean isOpenGLKHRDebugEnabled() {
        Preferences$UserPrefs e = this.vrParamsProvider.e();
        if (e == null || !e.hasDeveloperPrefs()) {
            return false;
        }
        return e.getDeveloperPrefs().getOpenglKhrDebugEnabled();
    }

    public void onCompositorLatch(byte[] bArr) {
        nativeOnCompositorLatch(this.nativeGvrContext, bArr);
    }

    public void onPauseReprojectionThread() {
        nativeOnPauseReprojectionThread(this.nativeGvrContext);
    }

    public void onSurfaceChangedReprojectionThread() {
        nativeOnSurfaceChangedReprojectionThread(this.nativeGvrContext);
    }

    public void onSurfaceCreatedReprojectionThread() {
        nativeOnSurfaceCreatedReprojectionThread(this.nativeGvrContext);
    }

    public void pause() {
        nativePause(this.nativeGvrContext);
    }

    public void pauseTracking() {
        nativePauseTracking(this.nativeGvrContext);
    }

    public byte[] pauseTrackingGetState() {
        return nativePauseTrackingGetState(this.nativeGvrContext);
    }

    public void recenterTracking() {
        nativeRecenterTracking(this.nativeGvrContext);
    }

    public Point renderReprojectionThread() {
        return nativeRenderReprojectionThread(this.nativeGvrContext);
    }

    public void requestContextSharing(EglReadyListener eglReadyListener) {
        nativeRequestContextSharing(this.nativeGvrContext, eglReadyListener);
    }

    public void resume() {
        nativeResume(this.nativeGvrContext);
    }

    public void resumeTracking() {
        nativeResumeTracking(this.nativeGvrContext);
    }

    public void resumeTrackingSetState(byte[] bArr) {
        nativeResumeTrackingSetState(this.nativeGvrContext, bArr);
    }

    public boolean setAsyncReprojectionEnabled(boolean z) {
        return nativeSetAsyncReprojectionEnabled(this.nativeGvrContext, true);
    }

    public void setIdleListener(IdleListener idleListener) {
        nativeSetIdleListener(this.nativeGvrContext, idleListener);
    }

    public void setIgnoreManualTrackerPauseResume(boolean z) {
        nativeSetIgnoreManualPauseResumeTracker(this.nativeGvrContext, z);
    }

    public void setLensOffset(float f, float f2, float f3) {
        nativeSetLensOffset(this.nativeGvrContext, f, f2, f3);
    }

    public void shutdown() {
        ArrayList arrayList = this.swapChainRefs;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SwapChain swapChain = (SwapChain) ((WeakReference) arrayList.get(i)).get();
            if (swapChain != null) {
                swapChain.shutdown();
            }
        }
        if (this.nativeGvrContext != 0) {
            this.vrParamsProvider.f();
            if (this.ownsNativeGvrContext) {
                nativeReleaseGvrContext(this.nativeGvrContext);
            }
            this.nativeGvrContext = 0L;
        }
    }

    public boolean usingVrDisplayService() {
        return nativeUsingVrDisplayService(this.nativeGvrContext);
    }

    private static void requestFeatures(Context context, long j, UserPrefs.RuntimeFeature[] runtimeFeatureArr, UserPrefs.RuntimeFeature[] runtimeFeatureArr2, PendingIntent pendingIntent) {
        UserPrefs userPrefs = new UserPrefs(nativeGetUserPrefs(j));
        Intent flags = new Intent("com.google.intent.action.vr.REQUEST_FEATURE").setComponent(Constants.FEATURE_REQUEST_ACTIVITY).setFlags(268435456);
        ArrayList arrayList = new ArrayList();
        for (UserPrefs.RuntimeFeature runtimeFeature : runtimeFeatureArr) {
            if (nativeIsFeatureSupported(j, runtimeFeature.id) && !userPrefs.isFeatureEnabled(runtimeFeature)) {
                arrayList.add(runtimeFeature.tag);
            }
        }
        if (!arrayList.isEmpty()) {
            flags.putExtra("required_features", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        ArrayList arrayList2 = new ArrayList();
        for (UserPrefs.RuntimeFeature runtimeFeature2 : runtimeFeatureArr2) {
            if (nativeIsFeatureSupported(j, runtimeFeature2.id) && !userPrefs.isFeatureEnabled(runtimeFeature2)) {
                arrayList2.add(runtimeFeature2.tag);
            }
        }
        if (!arrayList2.isEmpty()) {
            flags.putExtra("optional_features", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        if (flags.getExtras() != null) {
            flags.putExtra("pending_intent", pendingIntent);
            context.startActivity(flags);
        }
    }

    public GvrApi(Context context, DisplaySynchronizer displaySynchronizer) {
        this.context = context;
        this.displaySynchronizer = displaySynchronizer;
        displaySynchronizer.a();
        long j = displaySynchronizer.b;
        axhe h = awxr.h(context);
        this.vrParamsProvider = h;
        h.d();
        this.swapChainRefs = new ArrayList();
        this.ownsNativeGvrContext = true;
        if (IS_ROBOLECTRIC_BUILD) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            this.nativeGvrContext = nativeCreate(getClass().getClassLoader(), context.getApplicationContext(), j, sPoseTrackerForTesting);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            if (this.nativeGvrContext == 0) {
                throw new IllegalStateException("Native GVR context creation failed, implementation unavailable.");
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
