package defpackage;

import com.google.protos.youtube.api.innertube.AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiel implements aaha {
    private final aieu a;

    public aiel(aieu aieuVar) {
        this.a = aieuVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint = (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint) apxfVar.pX(AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.acknowledgeYouthereEndpoint);
        if ((acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.b & 1) != 0) {
            aieu aieuVar = this.a;
            awfl awflVar = acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.c;
            if (awflVar == null) {
                awflVar = awfl.a;
            }
            aieuVar.d(awflVar);
        }
    }
}
