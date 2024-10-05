package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import defpackage.axfq;
import defpackage.axgo;
import defpackage.axhc;
import defpackage.axhd;
import defpackage.axhh;
import defpackage.axhi;
import defpackage.axhl;
import defpackage.axhp;
import defpackage.axim;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VrCoreSdkClient {
    private final Runnable closeVrRunnable;
    private final ComponentName componentName;
    private final Context context;
    private final DaydreamListenerImpl daydreamListener;
    private axhl daydreamManager;
    private final DaydreamUtilsWrapper daydreamUtils;
    private final FadeOverlayView fadeOverlayView;
    private final GvrApi gvrApi;
    private AlertDialog helpCenterDialog;
    private boolean isBound;
    private boolean isResumed;
    private axim loggingService;
    private Runnable onDonNotNeededListener;
    private PendingIntent optionalReentryIntent;
    private final boolean shouldBind;
    private int vrCoreClientApiVersion;
    private axhp vrCoreSdkService;
    private boolean isEnabled = true;
    private final ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.google.vr.ndk.base.VrCoreSdkClient.1
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        
            if (r3.this$0.isResumed != false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
        
            r3.this$0.resumeTracking(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
        
            r5 = r3.this$0;
            r5.loggingService = r5.vrCoreSdkService.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
        
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
        
            r5 = java.lang.String.valueOf(r5);
            r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 42);
            r1.append("Error getting logging service from VrCore:");
            r1.append(r5);
            android.util.Log.w("VrCoreSdkClient", r1.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
        
            if (r3.this$0.isResumed == false) goto L59;
         */
        @Override // android.content.ServiceConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.VrCoreSdkClient.AnonymousClass1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            VrCoreSdkClient.this.vrCoreSdkService = null;
            VrCoreSdkClient.this.daydreamManager = null;
            VrCoreSdkClient.this.loggingService = null;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class DaydreamListenerImpl extends axhi {
        private final WeakReference closeVrRunnableWeak;
        private final WeakReference fadeOverlayViewWeak;
        private final WeakReference gvrApiWeak;
        private final Handler safeguardHandler = new Handler() { // from class: com.google.vr.ndk.base.VrCoreSdkClient.DaydreamListenerImpl.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    Log.w("VrCoreSdkClient", "Forcing tracking resume: VrCore unresponsive");
                    DaydreamListenerImpl.this.resumeHeadTrackingImpl(null);
                } else if (i == 2) {
                    Log.w("VrCoreSdkClient", "Forcing fade in: VrCore unresponsive");
                    DaydreamListenerImpl.this.applyColorfulFadeImpl(1, 350L, -16777216);
                } else {
                    super.handleMessage(message);
                }
            }
        };

        public DaydreamListenerImpl(GvrApi gvrApi, FadeOverlayView fadeOverlayView, Runnable runnable) {
            this.gvrApiWeak = new WeakReference(gvrApi);
            this.fadeOverlayViewWeak = new WeakReference(fadeOverlayView);
            this.closeVrRunnableWeak = new WeakReference(runnable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void applyColorfulFadeImpl(final int i, final long j, final int i2) {
            final FadeOverlayView fadeOverlayView = (FadeOverlayView) this.fadeOverlayViewWeak.get();
            if (fadeOverlayView == null) {
                return;
            }
            cancelSafeguard(2);
            fadeOverlayView.post(new Runnable(this) { // from class: com.google.vr.ndk.base.VrCoreSdkClient.DaydreamListenerImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    fadeOverlayView.startFade(i, j, i2);
                }
            });
            if (i == 2) {
                rescheduleSafeguard(2, j + 5500);
            }
        }

        private void cancelSafeguard(int i) {
            this.safeguardHandler.removeMessages(i);
        }

        private void rescheduleSafeguard(int i, long j) {
            cancelSafeguard(i);
            this.safeguardHandler.sendEmptyMessageDelayed(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resumeHeadTrackingImpl(HeadTrackingState headTrackingState) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid resumeHeadTracking() call: GvrApi no longer valid");
            } else {
                cancelSafeguard(1);
                VrCoreSdkClient.resumeTracking(gvrApi, headTrackingState);
            }
        }

        @Override // defpackage.axhj
        public void applyColorfulFade(int i, long j, int i2) {
            applyColorfulFadeImpl(i, j, i2);
        }

        @Override // defpackage.axhj
        public void applyFade(int i, long j) {
            applyColorfulFadeImpl(i, j, -16777216);
        }

        @Override // defpackage.axhj
        public void deprecated_setLensOffsets(float f, float f2, float f3, float f4) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid setLensOffsets() call: GvrApi no longer valid");
            } else {
                gvrApi.setLensOffset(f, f2, 0.0f);
            }
        }

        @Override // defpackage.axhj
        public void dumpDebugData() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid dumpDebugData() call: GvrApi no longer valid");
            } else {
                gvrApi.dumpDebugData();
            }
        }

        @Override // defpackage.axhj
        public void invokeCloseAction() {
            Runnable runnable = (Runnable) this.closeVrRunnableWeak.get();
            if (runnable == null) {
                Log.w("VrCoreSdkClient", "Invalid invokeCloseAction() call: Runnable no longer valid");
            } else {
                axgo.a(runnable);
            }
        }

        @Override // defpackage.axhj
        public void recenterHeadTracking() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid recenterHeadTracking() call: GvrApi no longer valid");
            } else {
                gvrApi.recenterTracking();
            }
        }

        @Override // defpackage.axhj
        public HeadTrackingState requestStopTracking() {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid requestStopTracking() call: GvrApi no longer valid");
                return null;
            }
            byte[] pauseTrackingGetState = gvrApi.pauseTrackingGetState();
            rescheduleSafeguard(1, 5000L);
            if (pauseTrackingGetState != null) {
                return new HeadTrackingState(pauseTrackingGetState);
            }
            return null;
        }

        public void resetSafeguards() {
            this.safeguardHandler.removeCallbacksAndMessages(null);
        }

        @Override // defpackage.axhj
        public void resumeHeadTracking(HeadTrackingState headTrackingState) {
            resumeHeadTrackingImpl(headTrackingState);
        }

        @Override // defpackage.axhj
        public void setLensOffset(float f, float f2, float f3) {
            GvrApi gvrApi = (GvrApi) this.gvrApiWeak.get();
            if (gvrApi == null) {
                Log.w("VrCoreSdkClient", "Invalid setLensOffset() call: GvrApi no longer valid");
            } else {
                gvrApi.setLensOffset(f, f2, f3);
            }
        }
    }

    public VrCoreSdkClient(Context context, GvrApi gvrApi, ComponentName componentName, DaydreamUtilsWrapper daydreamUtilsWrapper, Runnable runnable, FadeOverlayView fadeOverlayView) {
        this.context = context;
        this.gvrApi = gvrApi;
        this.componentName = componentName;
        this.daydreamUtils = daydreamUtilsWrapper;
        this.closeVrRunnable = runnable;
        this.fadeOverlayView = fadeOverlayView;
        this.daydreamListener = new DaydreamListenerImpl(gvrApi, fadeOverlayView, runnable);
        this.shouldBind = hasCompatibleSdkService(context);
        gvrApi.setIgnoreManualTrackerPauseResume(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean doBind() {
        /*
            r4 = this;
            boolean r0 = r4.isBound
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4.shouldBind
            if (r0 == 0) goto L22
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.vr.vrcore.BIND_SDK_SERVICE"
            r0.<init>(r2)
            java.lang.String r2 = "com.google.vr.vrcore"
            r0.setPackage(r2)
            android.content.Context r2 = r4.context
            android.content.ServiceConnection r3 = r4.serviceConnection
            boolean r0 = r2.bindService(r0, r3, r1)
            r4.isBound = r0
            if (r0 != 0) goto L25
        L22:
            r4.handleBindFailed()
        L25:
            boolean r0 = r4.isBound
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.ndk.base.VrCoreSdkClient.doBind():boolean");
    }

    private void doUnbind() {
        if (this.isResumed) {
            resumeTracking(null);
        } else {
            this.gvrApi.pauseTrackingGetState();
        }
        if (this.isBound) {
            axhl axhlVar = this.daydreamManager;
            if (axhlVar != null) {
                try {
                    axhlVar.q(this.componentName);
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb.append("Failed to unregister Daydream listener: ");
                    sb.append(valueOf);
                    Log.w("VrCoreSdkClient", sb.toString());
                }
                this.daydreamManager = null;
            }
            this.vrCoreSdkService = null;
            this.loggingService = null;
            this.context.unbindService(this.serviceConnection);
            this.isBound = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBindFailed() {
        doUnbind();
        warnIfIncompatibleClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNoDaydreamManager() {
        doUnbind();
        warnIfIncompatibleClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePrepareVrFailed() {
        doUnbind();
        this.closeVrRunnable.run();
    }

    private boolean hasCompatibleSdkService(Context context) {
        int vrCoreClientApiVersion;
        try {
            vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            this.vrCoreClientApiVersion = vrCoreClientApiVersion;
        } catch (axhh unused) {
        }
        if (vrCoreClientApiVersion >= 5) {
            return true;
        }
        Log.w("VrCoreSdkClient", String.format("VrCore service obsolete, GVR SDK requires API %d but found API %d.", 5, Integer.valueOf(this.vrCoreClientApiVersion)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int prepareVr(HeadTrackingState headTrackingState) {
        Activity k;
        if (this.vrCoreClientApiVersion < 13) {
            return this.daydreamManager.a(this.componentName, headTrackingState);
        }
        DaydreamCompatibility componentDaydreamCompatibility = DaydreamUtils.getComponentDaydreamCompatibility(this.context, this.componentName);
        PendingIntent pendingIntent = this.optionalReentryIntent;
        if (pendingIntent == null) {
            Intent createVrIntent = DaydreamApi.createVrIntent(this.componentName);
            createVrIntent.addFlags(536870912);
            Context context = this.context;
            if (!(context instanceof axhd) && (k = axfq.k(context)) != null && k.getIntent() != null) {
                createVrIntent.putExtras(k.getIntent());
                createVrIntent.fillIn(k.getIntent(), 2);
            }
            pendingIntent = PendingIntent.getActivity(this.context, 0, createVrIntent, 1073741824);
        }
        if (this.vrCoreClientApiVersion >= 22) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("COMPONENT_NAME_KEY", this.componentName);
            bundle.putInt("DAYDREAM_COMPATIBILITY_KEY", componentDaydreamCompatibility.toDeprecated());
            bundle.putInt("DAYDREAM_COMPATIBILITY_BITMASK_KEY", componentDaydreamCompatibility.getSupportedHeadsets());
            bundle.putParcelable("OPTIONAL_REENTRY_INTENT_KEY", pendingIntent);
            bundle.putBoolean("IS_USING_VR_DISPLAY_SERVICE_KEY", this.gvrApi.usingVrDisplayService());
            return this.daydreamManager.g(bundle, headTrackingState);
        }
        return this.daydreamManager.f(this.componentName, componentDaydreamCompatibility.toDeprecated(), pendingIntent, headTrackingState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resumeTracking(GvrApi gvrApi, HeadTrackingState headTrackingState) {
        byte[] bArr;
        byte[] bArr2 = null;
        if (headTrackingState != null && (bArr = headTrackingState.a) != null && bArr.length != 0) {
            bArr2 = bArr;
        }
        gvrApi.resumeTrackingSetState(bArr2);
    }

    private void warnIfIncompatibleClient() {
        if (this.daydreamUtils.isDaydreamPhone(this.context) || !this.daydreamUtils.isDaydreamRequiredComponent(this.context) || ActivityManager.isRunningInTestHarness()) {
            return;
        }
        AlertDialog alertDialog = this.helpCenterDialog;
        if (alertDialog != null) {
            alertDialog.show();
        } else {
            this.helpCenterDialog = axhc.b(this.context, this.closeVrRunnable);
        }
    }

    public HeadTrackingState getHeadTrackingState() {
        return new HeadTrackingState();
    }

    public axim getLoggingService() {
        return this.loggingService;
    }

    public void onExitingFromVr() {
        axhl axhlVar = this.daydreamManager;
        if (axhlVar != null && this.vrCoreClientApiVersion >= 16) {
            try {
                axhlVar.h();
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("Failed to signal exit from VR to VrCore: ");
                sb.append(valueOf);
                Log.e("VrCoreSdkClient", sb.toString());
            }
        }
    }

    public void onPause() {
        this.isResumed = false;
        this.daydreamListener.resetSafeguards();
        if (this.isEnabled) {
            doUnbind();
        }
    }

    public boolean onResume() {
        this.isResumed = true;
        if (this.isEnabled) {
            return doBind();
        }
        return false;
    }

    public void setEnabled(boolean z) {
        if (this.isEnabled == z) {
            return;
        }
        this.isEnabled = z;
        this.gvrApi.setIgnoreManualTrackerPauseResume(z);
        if (this.isResumed) {
            if (this.isEnabled) {
                doBind();
            } else {
                doUnbind();
            }
        }
    }

    public void setOnDonNotNeededListener(Runnable runnable) {
        this.onDonNotNeededListener = runnable;
    }

    public void setReentryIntent(PendingIntent pendingIntent) {
        this.optionalReentryIntent = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeTracking(HeadTrackingState headTrackingState) {
        resumeTracking(this.gvrApi, headTrackingState);
        FadeOverlayView fadeOverlayView = this.fadeOverlayView;
        if (fadeOverlayView != null) {
            fadeOverlayView.flushAutoFade();
        }
    }
}
