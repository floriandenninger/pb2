package com.google.cardboard.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.cardboard.sdk.qrcode.CardboardParamsUtils;
import com.google.cardboard.sdk.qrcode.QrCodeContentProcessor;
import com.google.cardboard.sdk.qrcode.QrCodeTracker;
import com.google.cardboard.sdk.qrcode.QrCodeTrackerFactory;
import com.google.cardboard.sdk.qrcode.camera.CameraSource;
import com.google.cardboard.sdk.qrcode.camera.CameraSourcePreview;
import defpackage.aih;
import defpackage.ml;
import defpackage.qmy;
import defpackage.rqq;
import defpackage.rqt;
import defpackage.rqw;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QrCodeCaptureActivity extends ml implements QrCodeTracker.Listener, QrCodeContentProcessor.Listener {
    private static final int MIN_SDK_VERSION = 23;
    private static final int PERMISSIONS_REQUEST_CODE = 2;
    private static final int RC_HANDLE_GMS = 9001;
    private static final String TAG = "QrCodeCaptureActivity";
    private static boolean qrCodeSaved = false;
    private CameraSource cameraSource;
    private CameraSourcePreview cameraSourcePreview;

    private void createCameraSource() {
        Context applicationContext = getApplicationContext();
        BarcodeDetectorOptions barcodeDetectorOptions = new BarcodeDetectorOptions();
        barcodeDetectorOptions.a = 256;
        rqt rqtVar = new rqt(new rqw(applicationContext, barcodeDetectorOptions));
        QrCodeTrackerFactory qrCodeTrackerFactory = new QrCodeTrackerFactory(this);
        rqq rqqVar = new rqq();
        rqqVar.b = qrCodeTrackerFactory;
        synchronized (rqtVar.a) {
            rqq rqqVar2 = rqtVar.b;
            if (rqqVar2 != null) {
                rqqVar2.a();
            }
            rqtVar.b = rqqVar;
        }
        if (!rqtVar.c()) {
            String str = TAG;
            Log.w(str, "Detector dependencies are not yet available.");
            if (registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null) {
                Toast.makeText(this, R.string.low_storage_error, 1).show();
                Log.w(str, getString(R.string.low_storage_error));
            } else {
                Toast.makeText(this, R.string.missing_dependencies, 1).show();
                Log.w(str, getString(R.string.missing_dependencies));
            }
        }
        this.cameraSource = new CameraSource(getApplicationContext(), rqtVar);
    }

    private boolean isCameraEnabled() {
        return aih.c(this, "android.permission.CAMERA") == 0;
    }

    private boolean isWriteExternalStoragePermissionsEnabled() {
        return aih.c(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private void launchPermissionsSettings() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    private native void nativeIncrementDeviceParamsChangedCount();

    private void requestPermissions() {
        aih.i(this, Build.VERSION.SDK_INT < 29 ? new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"} : new String[]{"android.permission.CAMERA"}, 2);
    }

    private void startCameraSource() {
        int h = qmy.a.h(getApplicationContext(), 23);
        if (h != 0) {
            String.valueOf(String.valueOf(new ConnectionResult(h))).length();
            qmy.a.a(this, h, RC_HANDLE_GMS, null).show();
        }
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            try {
                this.cameraSourcePreview.start(cameraSource);
            } catch (IOException e) {
                Log.e(TAG, "Unable to start camera source.", e);
                this.cameraSource.release();
                this.cameraSource = null;
            } catch (SecurityException e2) {
                Log.e(TAG, "Security exception: ", e2);
            }
        }
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.qr_code_capture);
        this.cameraSourcePreview = (CameraSourcePreview) findViewById(R.id.preview);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onPause() {
        super.onPause();
        CameraSourcePreview cameraSourcePreview = this.cameraSourcePreview;
        if (cameraSourcePreview != null) {
            cameraSourcePreview.stop();
            this.cameraSourcePreview.release();
        }
    }

    @Override // com.google.cardboard.sdk.qrcode.QrCodeTracker.Listener
    public void onQrCodeDetected(Barcode barcode) {
        if (barcode == null || qrCodeSaved) {
            return;
        }
        qrCodeSaved = true;
        new QrCodeContentProcessor(this).processAndSaveQrCode(barcode, this);
    }

    @Override // com.google.cardboard.sdk.qrcode.QrCodeContentProcessor.Listener
    public void onQrCodeSaved(boolean z) {
        if (z) {
            this.cameraSourcePreview.stop();
            nativeIncrementDeviceParamsChangedCount();
            finish();
        } else {
            Log.e(TAG, "Device parameters not saved in external storage.");
        }
        qrCodeSaved = false;
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (Build.VERSION.SDK_INT < 29) {
            if (isCameraEnabled() && isWriteExternalStoragePermissionsEnabled()) {
                return;
            }
            getString(R.string.no_permissions);
            Toast.makeText(this, R.string.no_permissions, 1).show();
            if (!aih.j(this, "android.permission.WRITE_EXTERNAL_STORAGE") || !aih.j(this, "android.permission.CAMERA")) {
                launchPermissionsSettings();
            }
            finish();
            return;
        }
        if (isCameraEnabled()) {
            return;
        }
        getString(R.string.no_camera_permission);
        Toast.makeText(this, R.string.no_camera_permission, 1).show();
        if (!aih.j(this, "android.permission.CAMERA")) {
            launchPermissionsSettings();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public void onResume() {
        super.onResume();
        if (isCameraEnabled() && (Build.VERSION.SDK_INT >= 29 || isWriteExternalStoragePermissionsEnabled())) {
            createCameraSource();
            qrCodeSaved = false;
            startCameraSource();
            return;
        }
        requestPermissions();
    }

    public void skipQrCodeCapture(View view) {
        Context applicationContext = getApplicationContext();
        if (CardboardParamsUtils.readDeviceParams(applicationContext) == null) {
            CardboardParamsUtils.saveCardboardV1DeviceParams(applicationContext);
        }
        finish();
    }
}
