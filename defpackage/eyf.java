package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyf implements aaha {
    private final agzj a;

    public eyf(agzj agzjVar) {
        agzjVar.getClass();
        this.a = agzjVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint = (OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint) apxfVar.pX(OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.offlineVideoWithOfflineabilityEndpoint);
        int bK = anaf.bK(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c);
        if (bK == 0) {
            bK = 1;
        }
        int i = bK - 1;
        if (i == 1) {
            aulq aulqVar = offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            atsb atsbVar = (atsb) ahbj.n(aulqVar, OfflineabilityRendererOuterClass.offlineabilityRenderer);
            if (atsbVar == null) {
                zga.b("Object is not an offlineable video");
                return;
            } else {
                this.a.n(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, atsbVar, null, (acra) yjj.u(map, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class), null);
                return;
            }
        }
        if (i != 2) {
            int bK2 = anaf.bK(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c);
            String bL = anaf.bL(bK2 != 0 ? bK2 : 1);
            StringBuilder sb = new StringBuilder(bL.length() + 34);
            sb.append("Unsupported Offline Video Action: ");
            sb.append(bL);
            zga.l(sb.toString());
            return;
        }
        this.a.c(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, false);
    }
}
