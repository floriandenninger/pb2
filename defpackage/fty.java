package defpackage;

import com.google.protos.youtube.api.innertube.UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fty implements aaha {
    private final fyx a;

    public fty(fyx fyxVar) {
        this.a = fyxVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        fys a = this.a.a(((UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint) apxfVar.pX(UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.updatedMetadataEndpoint)).b);
        if (a.i) {
            return;
        }
        a.a.postDelayed(a, 30000L);
        a.i = true;
    }
}
