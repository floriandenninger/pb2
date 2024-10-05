package defpackage;

import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtl implements aaha {
    private final ainy a;
    private final aahd b;

    public gtl(ainy ainyVar, aahd aahdVar) {
        this.a = ainyVar;
        aahdVar.getClass();
        this.b = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aixh n;
        avhb avhbVar = apxfVar.pY(avhc.a) ? (avhb) apxfVar.pX(avhc.a) : null;
        if (avhbVar == null || (avhbVar.b & 1) == 0 || (n = this.a.n()) == null) {
            return;
        }
        aqwl aqwlVar = avhbVar.c;
        if (aqwlVar == null) {
            aqwlVar = aqwl.a;
        }
        aone createBuilder = aqwl.a.createBuilder(aqwlVar);
        long b = n.b();
        createBuilder.copyOnWrite();
        aqwl aqwlVar2 = (aqwl) createBuilder.instance;
        aqwlVar2.c = 7;
        aqwlVar2.d = Long.valueOf(b);
        aqwl aqwlVar3 = (aqwl) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(FeedbackEndpointOuterClass.feedbackEndpoint, aqwlVar3);
        this.b.a((apxf) aongVar.build());
    }
}
