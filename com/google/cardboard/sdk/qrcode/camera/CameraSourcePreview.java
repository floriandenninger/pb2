package com.google.cardboard.sdk.qrcode.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import defpackage.qrm;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CameraSourcePreview extends ViewGroup {
    private static final String TAG = "CameraSourcePreview";
    private CameraSource cameraSource;
    private final Context context;
    private boolean startRequested;
    private boolean surfaceAvailable;
    private final SurfaceView surfaceView;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    class SurfaceCallback implements SurfaceHolder.Callback {
        private SurfaceCallback() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.surfaceAvailable = true;
            try {
                CameraSourcePreview.this.startIfReady();
            } catch (IOException e) {
                Log.e(CameraSourcePreview.TAG, "Could not start camera source.", e);
            } catch (SecurityException e2) {
                Log.e(CameraSourcePreview.TAG, "Do not have permission to start the camera", e2);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.surfaceAvailable = false;
        }
    }

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        this.startRequested = false;
        this.surfaceAvailable = false;
        SurfaceView surfaceView = new SurfaceView(context);
        this.surfaceView = surfaceView;
        surfaceView.getHolder().addCallback(new SurfaceCallback());
        addView(surfaceView);
    }

    private boolean isPortraitMode() {
        int i = this.context.getResources().getConfiguration().orientation;
        return i != 2 && i == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startIfReady() {
        if (this.startRequested && this.surfaceAvailable) {
            this.cameraSource.start(this.surfaceView.getHolder());
            this.startRequested = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        qrm previewSize;
        CameraSource cameraSource = this.cameraSource;
        int i5 = 240;
        int i6 = 320;
        if (cameraSource != null && (previewSize = cameraSource.getPreviewSize()) != null) {
            i6 = previewSize.a;
            i5 = previewSize.b;
        }
        boolean isPortraitMode = isPortraitMode();
        int i7 = true != isPortraitMode ? i5 : i6;
        if (true != isPortraitMode) {
            i5 = i6;
        }
        int i8 = i3 - i;
        int i9 = i4 - i2;
        if (isPortraitMode()) {
            i8 = (int) ((i9 / i7) * i5);
        } else {
            i9 = (int) ((i8 / i5) * i7);
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).layout(0, 0, i8, i9);
        }
        try {
            startIfReady();
        } catch (IOException e) {
            Log.e(TAG, "Could not start camera source.", e);
        } catch (SecurityException e2) {
            Log.e(TAG, "Do not have permission to start the camera", e2);
        }
    }

    public void release() {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            cameraSource.release();
            this.cameraSource = null;
        }
    }

    public void start(CameraSource cameraSource) {
        if (cameraSource == null) {
            stop();
        }
        this.cameraSource = cameraSource;
        if (cameraSource != null) {
            this.startRequested = true;
            startIfReady();
        }
    }

    public void stop() {
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            cameraSource.stop();
        }
    }
}
