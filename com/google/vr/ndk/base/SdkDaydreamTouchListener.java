package com.google.vr.ndk.base;

import android.content.Context;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.vrcore.logging.api.VREventParcelable;
import defpackage.ancs;
import defpackage.anct;
import defpackage.ancy;
import defpackage.awxr;
import defpackage.axfp;
import defpackage.axfq;
import defpackage.axhe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class SdkDaydreamTouchListener extends AbstractDaydreamTouchListener implements View.OnTouchListener {
    private final GvrApi gvrApi;
    private final GvrLayoutImpl gvrLayout;
    private final boolean isDaydreamImageAlignmentEnabled;
    private final axhe vrParamsProvider;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class FinishInitializationTask extends AsyncTask {
        public Display display;

        private FinishInitializationTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Display$DisplayParams display$DisplayParams) {
            SdkDaydreamTouchListener.this.init(axfq.h(this.display, display$DisplayParams), display$DisplayParams, axfq.b(this.display));
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Display$DisplayParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class RefreshViewerProfileTask extends AsyncTask {
        private RefreshViewerProfileTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            SdkDaydreamTouchListener.this.setDeviceParams(cardboardDevice$DeviceParams);
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public CardboardDevice$DeviceParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.b();
        }
    }

    public SdkDaydreamTouchListener(GvrLayoutImpl gvrLayoutImpl) {
        this.gvrLayout = gvrLayoutImpl;
        GvrApi gvrApi = gvrLayoutImpl.getGvrApi();
        this.gvrApi = gvrApi;
        ancy a = ancy.a(gvrApi.getSdkConfigurationParams().daydreamImageAlignment_);
        this.isDaydreamImageAlignmentEnabled = ((a == null ? ancy.UNKNOWN_ALIGNMENT : a) == ancy.DISABLED || gvrApi.getSdkConfigurationParams().touchOverlayEnabled_) ? false : true;
        Context context = gvrLayoutImpl.getContext();
        this.vrParamsProvider = awxr.h(context);
        FinishInitializationTask finishInitializationTask = new FinishInitializationTask();
        finishInitializationTask.display = axfq.i(context);
        finishInitializationTask.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init(DisplayMetrics displayMetrics, Display$DisplayParams display$DisplayParams, axfp axfpVar) {
        initWithDisplayParams(displayMetrics, display$DisplayParams, axfpVar);
        refreshViewerProfile();
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    protected boolean isDaydreamImageAlignmentEnabled() {
        return this.isDaydreamImageAlignmentEnabled;
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    protected void logEvent(anct anctVar, ancs ancsVar) {
        if (this.gvrLayout.getVrCoreSdkClient() == null || this.gvrLayout.getVrCoreSdkClient().getLoggingService() == null) {
            Log.w("SdkDaydreamTouchListener", "Unable to log alignment event; logging service not available.");
            return;
        }
        try {
            this.gvrLayout.getVrCoreSdkClient().getLoggingService().a(new VREventParcelable(anct.SDK_PHONE_ALIGNMENT, ancsVar));
        } catch (RemoteException unused) {
            Log.w("SdkDaydreamTouchListener", "Unable to log alignment event");
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return handleTouch(motionEvent, 0.0f, 0.0f);
    }

    public void refreshViewerProfile() {
        new RefreshViewerProfileTask().execute(new Void[0]);
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    protected void setLensOffset(float f, float f2, float f3) {
        this.gvrApi.setLensOffset(f, f2, 0.0f);
    }

    public void shutdown() {
        this.vrParamsProvider.f();
    }
}
