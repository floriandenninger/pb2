package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelCameraRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hwi implements afwx {
    final /* synthetic */ hwj a;

    public hwi(hwj hwjVar) {
        this.a = hwjVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.a.c.get()) {
            return;
        }
        zga.d("Failed to get camera info", cnqVar);
        this.a.b.sendEmptyMessage(2);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        avxs avxsVar;
        avcy avcyVar;
        arsb arsbVar = (arsb) obj;
        if (this.a.c.get() || arsbVar == null || (arsbVar.b & 2) == 0) {
            return;
        }
        aulq aulqVar = arsbVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aujk aujkVar = (aujk) aulqVar.pX(ReelCameraRendererOuterClass.reelCameraRenderer);
        this.a.a.aP((aujkVar.b & 128) != 0 ? aujkVar.g : true);
        if ((aujkVar.b & 1) != 0) {
            aulq aulqVar2 = aujkVar.f;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            if (aulqVar2.pY(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                aulq aulqVar3 = aujkVar.f;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                this.a.a.aY((aqdt) aulqVar3.pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer));
            }
            int i = aujkVar.c;
            avxs avxsVar2 = null;
            if (i == 2) {
                avxsVar = (avxs) aujkVar.d;
                avcyVar = null;
            } else if (i == 6) {
                avcyVar = (avcy) aujkVar.d;
                avxsVar = null;
            } else {
                avxsVar = null;
                avcyVar = null;
            }
            apxf apxfVar = aujkVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aulq aulqVar4 = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint) apxfVar.pX(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            if ((((aujp) aulqVar4.pX(ReelEditVideoRendererOuterClass.reelEditVideoRenderer)).b & 1) != 0) {
                aulq aulqVar5 = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint) apxfVar.pX(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b;
                if (aulqVar5 == null) {
                    aulqVar5 = aulq.a;
                }
                avxsVar2 = ((aujp) aulqVar5.pX(ReelEditVideoRendererOuterClass.reelEditVideoRenderer)).c;
                if (avxsVar2 == null) {
                    avxsVar2 = avxs.a;
                }
            }
            this.a.a.aG(avcyVar, avxsVar, avxsVar2);
            Handler handler = this.a.b;
            handler.sendMessage(handler.obtainMessage(1, apxfVar));
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
