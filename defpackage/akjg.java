package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjg implements aaha {
    private final Context a;
    private final aavj b;
    private final aadw c;

    public akjg(Context context, aavj aavjVar, aadw aadwVar) {
        this.a = context;
        aavjVar.getClass();
        this.b = aavjVar;
        aadwVar.getClass();
        this.c = aadwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        akjf akjfVar = (akjf) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", akjf.class);
        List aF = wbs.aF(this.a.getPackageManager());
        atej atejVar = this.c.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apet apetVar = atejVar.m;
        if (apetVar == null) {
            apetVar = apet.a;
        }
        List J2 = ahbx.J(aF, apetVar);
        this.b.d(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) apxfVar.pX(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint)).b, J2, new akje(akjfVar, apxfVar, J2), true);
    }
}
