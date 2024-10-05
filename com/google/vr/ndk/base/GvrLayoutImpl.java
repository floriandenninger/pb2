package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.Presentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vr.cardboard.EglReadyListener;
import com.google.vr.ndk.base.GvrApi;
import defpackage.ancv;
import defpackage.axfp;
import defpackage.axfq;
import defpackage.axfv;
import defpackage.axgg;
import defpackage.axgi;
import defpackage.axgm;
import defpackage.axgo;
import defpackage.axhd;
import defpackage.axik;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrLayoutImpl extends FrameLayout {
    private static PresentationFactory sOptionalPresentationFactory;
    private axfq androidPCompat;
    private int asyncReprojectionFlags;
    private boolean attachedToWindow;
    private boolean autoFadeEnabled;
    private CardboardEmulator cardboardEmulator;
    private SdkDaydreamTouchListener daydreamTouchListener;
    private DaydreamUtilsWrapper daydreamUtils;
    private DisplaySynchronizer displaySynchronizer;
    private axfv eglFactory;
    private EglReadyListener eglReadyListener;
    private ExtensionManager extensionManager;
    private FadeOverlayView fadeOverlayView;
    private FrameFlushWorkaround frameFlushWorkaround;
    private GvrApi gvrApi;
    private boolean isResumed;
    private PresentationHelper presentationHelper;
    private FrameLayout presentationLayout;
    private View presentationView;
    private axgm scanlineRacingRenderer;
    private AsyncReprojectionSurfaceView scanlineRacingView;
    private ScreenOnManager screenOnManager;
    private final Runnable showRenderingViewsRunnable;
    private boolean stereoModeEnabled;
    private ServiceConnection syncServiceConnection;
    private Messenger syncServiceReceiver;
    private Messenger syncServiceSender;
    private GvrUiLayoutImpl uiLayout;
    private boolean useSyncService;
    private ExternalSurface videoSurface;
    private VrCoreSdkClient vrCoreSdkClient;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class AsyncReprojectionSurfaceView extends GvrSurfaceView {
        private axgm scanlineRacingRenderer;

        public AsyncReprojectionSurfaceView(Context context) {
            super(context);
        }

        public void setRenderer(axgm axgmVar) {
            this.scanlineRacingRenderer = axgmVar;
            super.setRenderer((GLSurfaceView.Renderer) axgmVar);
        }

        @Override // com.google.vr.ndk.base.GvrSurfaceView, android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (isDetachedFromWindow() || this.scanlineRacingRenderer == null) {
                onSurfaceDestroyed(null);
            } else {
                onSurfaceDestroyed(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.AsyncReprojectionSurfaceView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncReprojectionSurfaceView.this.scanlineRacingRenderer.a();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class FrameFlushWorkaround implements Choreographer.FrameCallback {
        private final Choreographer choreographer = Choreographer.getInstance();
        private int framesRemaining;

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            int i = this.framesRemaining - 1;
            this.framesRemaining = i;
            if (i > 0) {
                this.choreographer.postFrameCallback(this);
            }
        }

        public void onResume() {
            if (this.framesRemaining > 0) {
                this.choreographer.removeFrameCallback(this);
            }
            this.framesRemaining = 5;
            this.choreographer.postFrameCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface PresentationFactory {
        Presentation create(Context context, Display display);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class PresentationHelper implements DisplayManager.DisplayListener {
        private final Context context;
        private final DisplayManager displayManager;
        private final DisplaySynchronizer displaySynchronizer;
        private String externalDisplayName;
        private final RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams(-1, -1);
        private final List listeners = new ArrayList();
        private final FrameLayout originalParent;
        private Presentation presentation;
        private final View view;

        public PresentationHelper(Context context, FrameLayout frameLayout, View view, DisplaySynchronizer displaySynchronizer, String str) {
            this.context = context;
            this.originalParent = frameLayout;
            this.view = view;
            this.displaySynchronizer = displaySynchronizer;
            this.externalDisplayName = str;
            this.displayManager = (DisplayManager) context.getSystemService("display");
        }

        private static void detachViewFromParent(View view) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }

        private boolean hasCurrentPresentationExpired() {
            Presentation presentation = this.presentation;
            if (presentation == null) {
                return false;
            }
            return (presentation.isShowing() && this.presentation.getDisplay().isValid()) ? false : true;
        }

        private boolean isValidExternalDisplay(Display display) {
            return display != null && display.isValid() && display.getName().equals(this.externalDisplayName);
        }

        private void setDisplay(Display display) {
            Display i;
            Presentation presentation;
            Presentation presentation2 = this.presentation;
            Display display2 = presentation2 != null ? presentation2.getDisplay() : null;
            if (!hasCurrentPresentationExpired()) {
                if (display == display2) {
                    return;
                }
                if (display != null && display2 != null && display.getDisplayId() == display2.getDisplayId() && display.getFlags() == display2.getFlags() && display.isValid() == display2.isValid() && display.getName().equals(display2.getName())) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    display.getMetrics(displayMetrics);
                    display2.getMetrics(displayMetrics2);
                    if (displayMetrics.equals(displayMetrics2)) {
                        return;
                    }
                }
            }
            Presentation presentation3 = this.presentation;
            if (presentation3 != null) {
                presentation3.dismiss();
                this.presentation = null;
            }
            detachViewFromParent(this.view);
            if (display != null) {
                if (GvrLayoutImpl.sOptionalPresentationFactory != null) {
                    presentation = GvrLayoutImpl.sOptionalPresentationFactory.create(this.context, display);
                } else {
                    presentation = new Presentation(this.context, display);
                }
                this.presentation = presentation;
                presentation.addContentView(this.view, this.layout);
                try {
                    this.presentation.show();
                } catch (WindowManager.InvalidDisplayException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                    sb.append("Attaching Cardboard View to the external display failed: ");
                    sb.append(valueOf);
                    Log.e("GvrLayoutImpl", sb.toString());
                    this.presentation.cancel();
                    this.presentation = null;
                    detachViewFromParent(this.view);
                    this.originalParent.addView(this.view, 0);
                }
            } else {
                this.originalParent.addView(this.view, 0);
            }
            DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
            Presentation presentation4 = this.presentation;
            if (presentation4 != null) {
                i = presentation4.getDisplay();
            } else {
                i = axfq.i(this.context);
            }
            displaySynchronizer.d(i);
            if (presentation3 != null) {
                Iterator it = this.listeners.iterator();
                while (it.hasNext()) {
                    ((PresentationListener) it.next()).onPresentationStopped();
                }
            }
            if (this.presentation != null) {
                Iterator it2 = this.listeners.iterator();
                while (it2.hasNext()) {
                    ((PresentationListener) it2.next()).onPresentationStarted(this.presentation.getDisplay());
                }
            }
        }

        public boolean isPresenting() {
            Presentation presentation = this.presentation;
            return presentation != null && presentation.isShowing();
        }

        public void onDetachedFromWindow() {
            this.displayManager.unregisterDisplayListener(this);
            setDisplay(null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            Display display = this.displayManager.getDisplay(i);
            if (isValidExternalDisplay(display)) {
                setDisplay(display);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            Presentation presentation = this.presentation;
            if (presentation == null || presentation.getDisplay().getDisplayId() != i) {
                return;
            }
            setDisplay(null);
        }

        public void onPause() {
            this.displayManager.unregisterDisplayListener(this);
        }

        public void onResume() {
            String j = axfq.j(this.context);
            this.externalDisplayName = j;
            Display display = null;
            if (j == null) {
                setDisplay(null);
                return;
            }
            this.displayManager.registerDisplayListener(this, null);
            Display[] displays = this.displayManager.getDisplays();
            int length = displays.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Display display2 = displays[i];
                if (isValidExternalDisplay(display2)) {
                    display = display2;
                    break;
                }
                i++;
            }
            setDisplay(display);
        }

        public void shutdown() {
            this.displayManager.unregisterDisplayListener(this);
            Presentation presentation = this.presentation;
            if (presentation != null) {
                presentation.cancel();
                this.presentation = null;
                Iterator it = this.listeners.iterator();
                while (it.hasNext()) {
                    ((PresentationListener) it.next()).onPresentationStopped();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface PresentationListener {
        void onPresentationStarted(Display display);

        void onPresentationStopped();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ScreenOnManager implements GvrApi.IdleListener {
        private static final long QUIET_PERIOD_AFTER_RESUME_MILLIS = TimeUnit.SECONDS.toMillis(5);
        private boolean isEnabled = true;
        private boolean isIdle;
        private boolean isResumed;
        private long lastResumeTimeMillis;
        private final View parentView;

        public ScreenOnManager(View view) {
            this.parentView = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSetScreenOn() {
            View view = this.parentView;
            boolean z = false;
            if (this.isEnabled && this.isResumed && !this.isIdle) {
                z = true;
            }
            view.setKeepScreenOn(z);
        }

        @Override // com.google.vr.ndk.base.GvrApi.IdleListener
        public void onIdleChanged(final boolean z) {
            axgo.a(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.ScreenOnManager.2
                @Override // java.lang.Runnable
                public void run() {
                    if (SystemClock.elapsedRealtime() - ScreenOnManager.this.lastResumeTimeMillis < ScreenOnManager.QUIET_PERIOD_AFTER_RESUME_MILLIS) {
                        return;
                    }
                    boolean unused = ScreenOnManager.this.isIdle;
                    ScreenOnManager.this.isIdle = z;
                    ScreenOnManager.this.updateSetScreenOn();
                }
            });
        }

        public void onPause() {
            this.isResumed = false;
            updateSetScreenOn();
        }

        public void onResume() {
            this.isResumed = true;
            this.isIdle = false;
            this.lastResumeTimeMillis = SystemClock.elapsedRealtime();
            updateSetScreenOn();
        }

        public void setEnabled(final boolean z) {
            axgo.a(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.ScreenOnManager.1
                @Override // java.lang.Runnable
                public void run() {
                    boolean z2 = ScreenOnManager.this.isEnabled;
                    boolean z3 = z;
                    if (z2 == z3) {
                        return;
                    }
                    ScreenOnManager.this.isEnabled = z3;
                    ScreenOnManager.this.updateSetScreenOn();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SyncServiceHandler extends Handler {
        private final WeakReference gvrLayout;

        public SyncServiceHandler(WeakReference weakReference) {
            super(Looper.getMainLooper());
            this.gvrLayout = weakReference;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            Bundle data = message.getData();
            data.setClassLoader(getClass().getClassLoader());
            LatchRecord latchRecord = (LatchRecord) data.getParcelable("latchRecord");
            GvrLayoutImpl gvrLayoutImpl = (GvrLayoutImpl) this.gvrLayout.get();
            if (gvrLayoutImpl != null) {
                gvrLayoutImpl.onCompositorLatch(latchRecord.serializedLatchRecord);
            }
        }
    }

    public GvrLayoutImpl(Context context) {
        this(context, null);
    }

    private void addScanlineRacingView() {
        if (this.scanlineRacingView != null) {
            return;
        }
        axfv axfvVar = new axfv();
        this.eglFactory = axfvVar;
        axfvVar.c = this.gvrApi.isOpenGLKHRDebugEnabled();
        axfv axfvVar2 = this.eglFactory;
        axfvVar2.a = true;
        axfvVar2.b = 1 == (this.asyncReprojectionFlags & 1);
        axfvVar2.e = 3;
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = new AsyncReprojectionSurfaceView(getContext());
        this.scanlineRacingView = asyncReprojectionSurfaceView;
        asyncReprojectionSurfaceView.setEGLConfigChooser(new axgi());
        this.scanlineRacingView.setZOrderMediaOverlay(true);
        this.scanlineRacingView.setEGLContextFactory(this.eglFactory);
        this.scanlineRacingView.setEGLWindowSurfaceFactory(this.eglFactory);
        if (isContextSharingEnabled()) {
            this.scanlineRacingView.setEglReadyListener(this.eglReadyListener);
        }
        if (!this.stereoModeEnabled) {
            Log.w("GvrLayoutImpl", "Disabling stereo mode with async reprojection enabled may not work properly.");
            this.scanlineRacingView.setVisibility(8);
        }
        if (this.scanlineRacingRenderer == null) {
            this.scanlineRacingRenderer = new axgm(this.gvrApi);
        }
        axgm axgmVar = this.scanlineRacingRenderer;
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView2 = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView2 != null) {
            axgmVar.a = asyncReprojectionSurfaceView2;
            asyncReprojectionSurfaceView2.setRenderer(axgmVar);
            this.scanlineRacingView.setSwapMode(1);
            if (!this.isResumed) {
                this.scanlineRacingView.onPause();
            }
            this.presentationLayout.addView(this.scanlineRacingView, 0);
            return;
        }
        throw new IllegalArgumentException("GvrSurfaceView must be supplied for proper scanline rendering");
    }

    private void init(ExtensionManager extensionManager) {
        DisplaySynchronizer createDefaultDisplaySynchronizer = GvrApi.createDefaultDisplaySynchronizer(getContext());
        initWithInjectedObjects(new GvrApi(getContext(), createDefaultDisplaySynchronizer), createDefaultDisplaySynchronizer, new EglReadyListener(), null, new DaydreamUtilsWrapper(), null, new GvrUiLayoutImpl(getContext(), new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if (GvrLayoutImpl.this.vrCoreSdkClient != null) {
                    GvrLayoutImpl.this.vrCoreSdkClient.onExitingFromVr();
                }
            }
        }), new axfq());
    }

    private void initWithInjectedObjects(GvrApi gvrApi, DisplaySynchronizer displaySynchronizer, EglReadyListener eglReadyListener, FadeOverlayView fadeOverlayView, DaydreamUtilsWrapper daydreamUtilsWrapper, ExtensionManager extensionManager, GvrUiLayoutImpl gvrUiLayoutImpl, axfq axfqVar) {
        this.gvrApi = gvrApi;
        if (isContextSharingEnabled()) {
            gvrApi.requestContextSharing(eglReadyListener);
        }
        this.daydreamUtils = daydreamUtilsWrapper;
        this.presentationLayout = new FrameLayout(getContext());
        this.uiLayout = gvrUiLayoutImpl;
        this.displaySynchronizer = displaySynchronizer;
        this.eglReadyListener = eglReadyListener;
        this.presentationHelper = tryCreatePresentationHelper();
        this.frameFlushWorkaround = new FrameFlushWorkaround();
        addView(this.presentationLayout, 0);
        addView(gvrUiLayoutImpl.getRoot(), 1);
        updateUiLayout();
        boolean isDaydreamPhone = daydreamUtilsWrapper.isDaydreamPhone(getContext());
        if (isDaydreamPhone) {
            this.daydreamTouchListener = createDaydreamTouchListener();
            gvrUiLayoutImpl.getRoot().setOnTouchListener(this.daydreamTouchListener);
        }
        DaydreamCompatibility componentDaydreamCompatibility = daydreamUtilsWrapper.getComponentDaydreamCompatibility(getContext());
        boolean supportsDaydream = componentDaydreamCompatibility.supportsDaydream();
        boolean requiresDaydream = componentDaydreamCompatibility.requiresDaydream();
        if (isDaydreamPhone || requiresDaydream) {
            if (supportsDaydream) {
                if (!(getContext() instanceof axhd)) {
                    FadeOverlayView fadeOverlayView2 = new FadeOverlayView(getContext(), this.autoFadeEnabled);
                    this.fadeOverlayView = fadeOverlayView2;
                    addView(fadeOverlayView2, 2);
                } else {
                    throw null;
                }
            }
            this.vrCoreSdkClient = createVrCoreSdkClient(getContext(), gvrApi, daydreamUtilsWrapper, this.fadeOverlayView);
        }
        this.screenOnManager = new ScreenOnManager(this);
        if (isDeviceDetectionEnabled()) {
            gvrApi.setIdleListener(this.screenOnManager);
        }
        this.extensionManager = null;
        this.androidPCompat = axfqVar;
    }

    private boolean isContextSharingEnabled() {
        if (this.gvrApi == null) {
            throw new IllegalStateException("GvrApi must be ready before isContextSharingEnabled is called");
        }
        if (!DaydreamApi.bootsToVr(getContext()) && (this.gvrApi.getSdkConfigurationParams().bitField0_ & 64) != 0) {
            ancv ancvVar = this.gvrApi.getSdkConfigurationParams().asyncReprojectionConfig_;
            if (ancvVar == null) {
                ancvVar = ancv.DEFAULT_INSTANCE;
            }
            if ((ancvVar.bitField0_ & 1) != 0 && (ancvVar.flags_ & 16) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isDeviceDetectionEnabled() {
        if ((this.gvrApi.getSdkConfigurationParams().bitField0_ & 256) != 0) {
            return this.gvrApi.getSdkConfigurationParams().useDeviceIdleDetection_;
        }
        return false;
    }

    private boolean isDimUiEnabled() {
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi == null) {
            return false;
        }
        Boolean valueOf = (gvrApi.getSdkConfigurationParams().bitField0_ & 262144) != 0 ? Boolean.valueOf(this.gvrApi.getSdkConfigurationParams().dimUiLayer_) : null;
        if (valueOf == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCompositorLatch(byte[] bArr) {
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            gvrApi.onCompositorLatch(bArr);
        }
    }

    private void registerLatchListener() {
        if (this.useSyncService && this.gvrApi.usingVrDisplayService() && this.syncServiceConnection == null) {
            if (this.syncServiceReceiver == null) {
                this.syncServiceReceiver = new Messenger(new SyncServiceHandler(new WeakReference(this)));
            }
            this.syncServiceConnection = new ServiceConnection() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.5
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    GvrLayoutImpl.this.syncServiceSender = new Messenger(iBinder);
                    Message message = new Message();
                    message.what = 0;
                    message.replyTo = GvrLayoutImpl.this.syncServiceReceiver;
                    try {
                        GvrLayoutImpl.this.syncServiceSender.send(message);
                    } catch (RemoteException unused) {
                        Log.e("GvrLayoutImpl", "Failed to register latch listener");
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    GvrLayoutImpl.this.syncServiceSender = null;
                }
            };
            if (getContext().bindService(new Intent().setComponent(axik.a), this.syncServiceConnection, 1)) {
                return;
            }
            Log.e("GvrLayoutImpl", "Failed to bind SyncService");
            getContext().unbindService(this.syncServiceConnection);
            this.syncServiceConnection = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStereoModeEnabledImpl, reason: merged with bridge method [inline-methods] */
    public void m85xa0962a49(boolean z) {
        if (this.stereoModeEnabled == z) {
            return;
        }
        this.stereoModeEnabled = z;
        updateMarginsForDisplayCutout();
        this.uiLayout.setEnabled(z);
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setEnabled(z);
        }
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            fadeOverlayView.setEnabled(z);
        }
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.setEnabled(z);
        }
        ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.setEnabled(z);
        }
        this.screenOnManager.setEnabled(z);
        updateRenderingViewsVisibility(0);
    }

    private PresentationHelper tryCreatePresentationHelper() {
        String j = axfq.j(getContext());
        if (j == null) {
            Log.e("GvrLayoutImpl", "HDMI display name could not be found, disabling external presentation support");
            return null;
        }
        return new PresentationHelper(getContext(), this, this.presentationLayout, this.displaySynchronizer, j);
    }

    private void unregisterLatchListener() {
        if (this.syncServiceConnection == null) {
            return;
        }
        if (this.syncServiceSender != null) {
            Message message = new Message();
            message.what = 1;
            message.replyTo = this.syncServiceReceiver;
            try {
                this.syncServiceSender.send(message);
            } catch (RemoteException unused) {
                Log.e("GvrLayoutImpl", "Failed to unregister latch listener");
            }
        }
        getContext().unbindService(this.syncServiceConnection);
        this.syncServiceConnection = null;
        this.syncServiceSender = null;
    }

    private void updateFadeVisibility() {
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView == null) {
            return;
        }
        if (!this.autoFadeEnabled) {
            if (this.isResumed) {
                fadeOverlayView.onVisible();
                return;
            } else {
                fadeOverlayView.onInvisible();
                return;
            }
        }
        if (this.attachedToWindow && getWindowVisibility() == 0) {
            if (this.isResumed) {
                this.fadeOverlayView.onVisible();
                removeCallbacks(this.showRenderingViewsRunnable);
                postDelayed(this.showRenderingViewsRunnable, 50L);
                return;
            }
            return;
        }
        if (this.isResumed) {
            return;
        }
        this.fadeOverlayView.onInvisible();
        updateRenderingViewsVisibility(4);
        removeCallbacks(this.showRenderingViewsRunnable);
    }

    private void updateMarginsForDisplayCutout() {
        Activity k = axfq.k(getContext());
        if (k == null || k.getWindow() == null) {
            return;
        }
        Window window = k.getWindow();
        if (axfq.a()) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (WindowManager.LayoutParams.class.getField("layoutInDisplayCutoutMode").get(attributes) == WindowManager.LayoutParams.class.getField("LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES").get(null)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                    if (this.stereoModeEnabled) {
                        axfp b = axfq.b(axfq.i(getContext()));
                        if (b != null) {
                            layoutParams.setMargins(b.b(), b.d(), b.c(), b.a());
                        }
                    } else {
                        layoutParams.setMargins(0, 0, 0, 0);
                    }
                    setLayoutParams(layoutParams);
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                sb.append("Failed to determine if window extends into cutout area: ");
                sb.append(valueOf);
                Log.e("AndroidPCompat", sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRenderingViewsVisibility(int i) {
        View view = this.presentationView;
        if (view != null) {
            view.setVisibility(true != this.stereoModeEnabled ? 0 : i);
        }
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            if (true != this.stereoModeEnabled) {
                i = 8;
            }
            asyncReprojectionSurfaceView.setVisibility(i);
        }
    }

    private void updateUiLayout() {
        this.uiLayout.setDaydreamModeEnabled(this.gvrApi.getViewerType() == 1);
    }

    public SdkDaydreamTouchListener createDaydreamTouchListener() {
        return new SdkDaydreamTouchListener(this);
    }

    protected VrCoreSdkClient createVrCoreSdkClient(Context context, GvrApi gvrApi, DaydreamUtilsWrapper daydreamUtilsWrapper, FadeOverlayView fadeOverlayView) {
        return new VrCoreSdkClient(context, gvrApi, axfq.l(context), daydreamUtilsWrapper, new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.4
            @Override // java.lang.Runnable
            public void run() {
                GvrLayoutImpl.this.uiLayout.invokeCloseButtonListener();
            }
        }, fadeOverlayView);
    }

    public boolean enableAsyncReprojection(int i) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            int i2 = this.asyncReprojectionFlags;
            if (i2 != -1) {
                if ((i2 & i) == i) {
                    return true;
                }
                throw new UnsupportedOperationException("Async reprojection flags cannot be added once initialized.");
            }
            if (this.scanlineRacingView != null) {
                return true;
            }
            if (!this.daydreamUtils.isDaydreamPhone(getContext())) {
                return false;
            }
            if (!this.gvrApi.setAsyncReprojectionEnabled(true)) {
                Log.e("GvrLayoutImpl", "Failed to initialize async reprojection, unsupported device.");
                return false;
            }
            this.asyncReprojectionFlags = i;
            if (this.gvrApi.usingVrDisplayService()) {
                DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
                axgg axggVar = displaySynchronizer.c;
                if (axggVar != null) {
                    axggVar.b();
                    displaySynchronizer.c = null;
                }
            } else {
                addScanlineRacingView();
            }
            return true;
        }
        throw new IllegalStateException("Async reprojection may only be enabled from the UI thread");
    }

    public boolean enableCardboardTriggerEmulation(Runnable runnable) {
        if (runnable != null) {
            if (this.cardboardEmulator != null) {
                return true;
            }
            if (!this.daydreamUtils.isDaydreamPhone(getContext())) {
                return false;
            }
            this.cardboardEmulator = new CardboardEmulator(getContext(), runnable);
            return true;
        }
        throw new IllegalArgumentException("The Cardboard trigger listener must not be null.");
    }

    public GvrApi getGvrApi() {
        return this.gvrApi;
    }

    public GvrUiLayoutImpl getUiLayoutImpl() {
        return this.uiLayout;
    }

    public VrCoreSdkClient getVrCoreSdkClient() {
        return this.vrCoreSdkClient;
    }

    public boolean isPresenting() {
        PresentationHelper presentationHelper;
        return (this.presentationView == null || (presentationHelper = this.presentationHelper) == null || !presentationHelper.isPresenting()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        updateFadeVisibility();
        updateMarginsForDisplayCutout();
    }

    public void onBackPressed() {
        this.uiLayout.invokeCloseButtonListener();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.displaySynchronizer.b();
        updateMarginsForDisplayCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.attachedToWindow = false;
        updateFadeVisibility();
        super.onDetachedFromWindow();
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onDetachedFromWindow();
        }
    }

    public void onPause() {
        VrCoreSdkClient vrCoreSdkClient;
        unregisterLatchListener();
        if (this.extensionManager != null && (vrCoreSdkClient = this.vrCoreSdkClient) != null && vrCoreSdkClient.getLoggingService() != null) {
            this.extensionManager.reportTelemetry(this.vrCoreSdkClient.getLoggingService());
        }
        this.gvrApi.pause();
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            asyncReprojectionSurfaceView.onPause(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    GvrLayoutImpl.this.scanlineRacingRenderer.a();
                }
            });
        }
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onPause();
        }
        this.displaySynchronizer.c();
        VrCoreSdkClient vrCoreSdkClient2 = this.vrCoreSdkClient;
        if (vrCoreSdkClient2 != null) {
            vrCoreSdkClient2.onPause();
        }
        CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
        }
        ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.onPause();
        }
        this.screenOnManager.onPause();
        this.isResumed = false;
        updateFadeVisibility();
    }

    public void onResume() {
        this.gvrApi.resume();
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.refreshViewerProfile();
        }
        DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        displaySynchronizer.b();
        axgg axggVar = displaySynchronizer.c;
        if (axggVar != null && !axggVar.c) {
            axggVar.c = true;
            axggVar.b.sendEmptyMessage(1);
        }
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.onResume();
        }
        AsyncReprojectionSurfaceView asyncReprojectionSurfaceView = this.scanlineRacingView;
        if (asyncReprojectionSurfaceView != null) {
            asyncReprojectionSurfaceView.onResume();
        }
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onResume();
        }
        if (this.cardboardEmulator != null && this.gvrApi.getViewerType() == 1) {
            this.cardboardEmulator.onResume();
        }
        ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.onResume();
        }
        this.screenOnManager.onResume();
        this.frameFlushWorkaround.onResume();
        this.isResumed = true;
        updateFadeVisibility();
        updateUiLayout();
        registerLatchListener();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.presentationView != null && isPresenting() && this.presentationView.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        updateFadeVisibility();
        if (isDimUiEnabled()) {
            if (i == 0) {
                this.uiLayout.delayDimmingUiLayerAfterVisible();
            } else {
                this.uiLayout.cancelDimmingUiLayer();
            }
        }
    }

    public boolean setOnDonNotNeededListener(Runnable runnable) {
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient == null) {
            return false;
        }
        vrCoreSdkClient.setOnDonNotNeededListener(runnable);
        return true;
    }

    public void setPresentationView(View view) {
        View view2 = this.presentationView;
        if (view2 != null) {
            this.presentationLayout.removeView(view2);
        }
        this.presentationLayout.addView(view, 0);
        this.presentationView = view;
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.setReentryIntent(pendingIntent);
        }
    }

    public void setStereoModeEnabled(final boolean z) {
        axgo.a(new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GvrLayoutImpl.this.m85xa0962a49(z);
            }
        });
    }

    public void shutdown() {
        DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        if (displaySynchronizer.b != 0) {
            displaySynchronizer.c();
            axgg axggVar = displaySynchronizer.c;
            if (axggVar != null) {
                axggVar.b();
            }
            displaySynchronizer.nativeDestroy(displaySynchronizer.b);
            displaySynchronizer.b = 0L;
        }
        SdkDaydreamTouchListener sdkDaydreamTouchListener = this.daydreamTouchListener;
        if (sdkDaydreamTouchListener != null) {
            sdkDaydreamTouchListener.shutdown();
        }
        removeView(this.presentationLayout);
        removeView(this.uiLayout.getRoot());
        this.scanlineRacingRenderer = null;
        ExternalSurface externalSurface = this.videoSurface;
        if (externalSurface != null) {
            externalSurface.shutdown();
            this.videoSurface = null;
        }
        this.scanlineRacingView = null;
        this.presentationView = null;
        PresentationHelper presentationHelper = this.presentationHelper;
        if (presentationHelper != null) {
            presentationHelper.shutdown();
            this.presentationHelper = null;
        }
        VrCoreSdkClient vrCoreSdkClient = this.vrCoreSdkClient;
        if (vrCoreSdkClient != null) {
            vrCoreSdkClient.onPause();
            this.vrCoreSdkClient = null;
        }
        CardboardEmulator cardboardEmulator = this.cardboardEmulator;
        if (cardboardEmulator != null) {
            cardboardEmulator.onPause();
            this.cardboardEmulator = null;
        }
        ExtensionManager extensionManager = this.extensionManager;
        if (extensionManager != null) {
            extensionManager.shutdown();
            this.extensionManager = null;
        }
        GvrApi gvrApi = this.gvrApi;
        if (gvrApi != null) {
            gvrApi.shutdown();
            this.gvrApi = null;
        }
        unregisterLatchListener();
    }

    public GvrLayoutImpl(Context context, ExtensionManager extensionManager) {
        super(context);
        this.asyncReprojectionFlags = -1;
        this.autoFadeEnabled = true;
        this.isResumed = false;
        this.stereoModeEnabled = true;
        this.showRenderingViewsRunnable = new Runnable() { // from class: com.google.vr.ndk.base.GvrLayoutImpl.1
            @Override // java.lang.Runnable
            public void run() {
                GvrLayoutImpl.this.updateRenderingViewsVisibility(0);
            }
        };
        this.useSyncService = true;
        if ((context instanceof axhd) || axfq.k(context) != null) {
            init(null);
            return;
        }
        throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
    }
}
