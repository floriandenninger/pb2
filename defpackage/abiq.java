package defpackage;

import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abiq implements aaha {
    private final aazg a;
    private final abge b;

    public abiq(aazg aazgVar, abge abgeVar) {
        aazgVar.getClass();
        this.a = aazgVar;
        abgeVar.getClass();
        this.b = abgeVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        abij abijVar = (abij) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", abij.class);
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) apxfVar.pX(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
        aazg aazgVar = this.a;
        aazj aazjVar = new aazj(aazgVar.f, aazgVar.a.c(), null, null, null);
        aazjVar.b = abijVar.qP();
        aazjVar.c = abijVar.qN();
        aazjVar.d = abijVar.qO();
        aomf aomfVar = sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.b;
        if (aomfVar != null) {
            aazjVar.a = aomfVar;
        }
        if (sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.c.size() != 0) {
            this.b.a(sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.c, abijVar.d(), true);
        }
        if ((apxfVar.b & 1) != 0) {
            aazjVar.l(apxfVar.c);
        } else {
            aazjVar.k();
        }
        aazg aazgVar2 = this.a;
        aazgVar2.c.e(aazjVar, abijVar.qM());
    }
}
