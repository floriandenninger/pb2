package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class accu extends CameraCaptureSession.StateCallback {
    final /* synthetic */ accy a;

    public accu(accy accyVar) {
        this.a = accyVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        this.a.i = null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Log.e("CameraPreviewCtrl", "Could not configure camera preview");
        accy accyVar = this.a;
        accyVar.e = null;
        acea aceaVar = accyVar.l;
        if (aceaVar != null) {
            aceaVar.a(new RuntimeException("Could not configure camera preview"));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        accy accyVar = this.a;
        if (accyVar.h == null) {
            return;
        }
        accyVar.i = cameraCaptureSession;
        accyVar.e.set(CaptureRequest.CONTROL_MODE, 1);
        CameraCharacteristics a = this.a.a();
        if (accy.j(a, CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, 3)) {
            this.a.e.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        if (accy.j(a, CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, 2)) {
            this.a.e.set(CaptureRequest.CONTROL_AE_MODE, 2);
        }
        this.a.i();
    }
}
