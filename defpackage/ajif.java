package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajif implements swv {
    private final ajiq a;
    private final ysy b;

    public ajif(ajiq ajiqVar, ysy ysyVar) {
        this.a = ajiqVar;
        this.b = ysyVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return aqed.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        apxf apxfVar;
        aqed aqedVar = (aqed) obj;
        if (this.b.o()) {
            awnw awnwVar = aqedVar.c;
            if (awnwVar == null) {
                awnwVar = awnw.a;
            }
            apxfVar = (apxf) awnwVar.pX(arli.a);
            if (apxfVar == null || !apxfVar.pY(WatchEndpointOuterClass.watchEndpoint)) {
                return ayph.s(new syf("Invalid ConnectivityDependentCommand: missing InnertubeCommand"));
            }
        } else {
            awnw awnwVar2 = aqedVar.d;
            if (awnwVar2 == null) {
                awnwVar2 = awnw.a;
            }
            apxfVar = (apxf) awnwVar2.pX(arli.a);
            if (apxfVar == null || !apxfVar.pY(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
                return ayph.s(new syf("Invalid ConnectivityDependentCommand: missing InnertubeCommand"));
            }
        }
        return this.a.b(apxfVar, swuVar);
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
