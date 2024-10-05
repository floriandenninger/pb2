package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class accv extends CameraCaptureSession.CaptureCallback {
    boolean a;
    final /* synthetic */ CaptureRequest b;
    final /* synthetic */ accy c;

    public accv(accy accyVar, CaptureRequest captureRequest) {
        this.c = accyVar;
        this.b = captureRequest;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        if (this.a) {
            return;
        }
        this.c.g(this.b, null);
        this.a = true;
        acea aceaVar = this.c.l;
        if (aceaVar != null) {
            aceaVar.a.b.setVisibility(0);
            aceaVar.a.e.setVisibility(8);
        }
    }
}
