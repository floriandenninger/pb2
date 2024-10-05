package defpackage;

import android.hardware.Camera;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class znc implements Camera.AutoFocusCallback {
    final /* synthetic */ String a;

    public znc(String str) {
        this.a = str;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFocusMode(this.a);
            camera.setParameters(parameters);
        } catch (RuntimeException unused) {
            zga.b("Camera is used after being released.");
        }
    }
}
