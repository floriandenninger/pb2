package defpackage;

import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akje implements afwx {
    final /* synthetic */ akjf a;
    final /* synthetic */ apxf b;
    final /* synthetic */ List c;

    public akje(akjf akjfVar, apxf apxfVar, List list) {
        this.a = akjfVar;
        this.b = apxfVar;
        this.c = list;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        akjf akjfVar = this.a;
        if (akjfVar != null) {
            akjfVar.b(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) this.b.pX(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint)).b);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        if (this.a != null) {
            PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint = (PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) this.b.pX(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint);
            akjf akjfVar = this.a;
            String str = prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.b;
            akjfVar.c(str, aavp.d(str, this.c, null));
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
