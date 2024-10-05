package defpackage;

import com.google.protos.youtube.api.innertube.GeoSearchDetailsRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lem extends ajsu {
    private final ajpd a;

    public lem(auod auodVar) {
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        aulq aulqVar = auodVar.b;
        if ((aulqVar == null ? aulq.a : aulqVar).pY(GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer)) {
            aulq aulqVar2 = auodVar.b;
            ajpdVar.add((aulqVar2 == null ? aulq.a : aulqVar2).pX(GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer));
        }
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
