package defpackage;

import com.google.protos.youtube.api.innertube.BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvm implements aaha {
    final banw a;

    public fvm(banw banwVar) {
        this.a = banwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint) apxfVar.pX(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.browseSectionListReloadEndpoint);
        aply aplyVar = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
        if (aplyVar == null) {
            aplyVar = aply.a;
        }
        if ((aplyVar.b & 1) != 0) {
            ajuf ajufVar = (ajuf) yjj.u(map, "sectionListController", ajuf.class);
            if (ajufVar == 0) {
                if ((browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.b & 4) == 0 || !browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.e) {
                    apxfVar = null;
                }
                banw banwVar = this.a;
                String str = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.d;
                aply aplyVar2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
                if (aplyVar2 == null) {
                    aplyVar2 = aply.a;
                }
                aulm aulmVar = aplyVar2.c;
                if (aulmVar == null) {
                    aulmVar = aulm.a;
                }
                banwVar.c(zbo.e(str, aulmVar, apxfVar, browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.f));
                return;
            }
            if (!(ajufVar instanceof ajth)) {
                aply aplyVar3 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
                if (aplyVar3 == null) {
                    aplyVar3 = aply.a;
                }
                aulm aulmVar2 = aplyVar3.c;
                if (aulmVar2 == null) {
                    aulmVar2 = aulm.a;
                }
                ajufVar.ac(ahbj.o(aulmVar2), apxfVar);
                return;
            }
            ajth ajthVar = (ajth) ajufVar;
            aply aplyVar4 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
            if (aplyVar4 == null) {
                aplyVar4 = aply.a;
            }
            aulm aulmVar3 = aplyVar4.c;
            if (aulmVar3 == null) {
                aulmVar3 = aulm.a;
            }
            ajthVar.lz(aulmVar3, apxfVar);
        }
    }
}
