package defpackage;

import com.google.protos.youtube.api.innertube.ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abio implements aaha {
    public final abge a;
    public final zaw b;
    private final aazg c;

    public abio(aazg aazgVar, abge abgeVar, zaw zawVar) {
        aazgVar.getClass();
        this.c = aazgVar;
        abgeVar.getClass();
        this.a = abgeVar;
        zawVar.getClass();
        this.b = zawVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aazg aazgVar = this.c;
        aazi aaziVar = new aazi(aazgVar.f, aazgVar.a.c(), null, null, null);
        aaziVar.a = ((ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint) apxfVar.pX(ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.moderateLiveChatEndpoint)).b;
        if ((apxfVar.b & 1) == 0) {
            aaziVar.k();
        } else {
            aaziVar.l(apxfVar.c);
        }
        aazgVar.g.e(aaziVar, new abin(this, map));
    }
}
