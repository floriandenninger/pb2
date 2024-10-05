package defpackage;

import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htf implements Runnable {
    final /* synthetic */ htl a;

    public htf(htl htlVar) {
        this.a = htlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (etx.S(this.a)) {
            long currentTimeMillis = System.currentTimeMillis();
            File file = this.a.aF().a;
            if (file != null) {
                this.a.al = wcy.P(file, currentTimeMillis);
                htj htjVar = this.a.b;
                if (htjVar != null) {
                    ((htu) htjVar).C().getWindow().addFlags(128);
                }
                htl htlVar = this.a;
                CameraView cameraView = htlVar.am;
                zmg zmgVar = new zmg(htlVar.al);
                htl htlVar2 = this.a;
                cameraView.z(zmgVar, (360 - htlVar2.ar) % 360, htlVar2);
                return;
            }
            wcy.T(this.a.C(), R.string.reel_camera_no_external_storage);
        }
    }
}
