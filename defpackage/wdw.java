package defpackage;

import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wdw implements Runnable {
    final /* synthetic */ Exception a;
    final /* synthetic */ wdx b;

    public wdw(wdx wdxVar, Exception exc) {
        this.b = wdxVar;
        this.a = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqyg aqygVar;
        wdx wdxVar = this.b;
        wdy wdyVar = wdxVar.c;
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = wdxVar.b;
        if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 256) != 0) {
            aqygVar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        wdyVar.p(ajcq.b(aqygVar).toString(), new wdu(this.a));
    }
}
