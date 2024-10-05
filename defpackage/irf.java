package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class irf implements afwx {
    final /* synthetic */ UploadActivity a;

    public irf(UploadActivity uploadActivity) {
        this.a = uploadActivity;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Cannot load GetUploadVideoFormResponse from InnerTube.", cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        final asdy asdyVar = (asdy) obj;
        this.a.runOnUiThread(new Runnable() { // from class: ire
            @Override // java.lang.Runnable
            public final void run() {
                irf irfVar = irf.this;
                irfVar.a.D(asdyVar);
            }
        });
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
