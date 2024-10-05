package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfk implements aahd {
    private final aahd a;
    private final aagx b;
    private final axpg c;
    private final adlt d;

    public jfk(aahd aahdVar, aagx aagxVar, adlt adltVar, axpg axpgVar) {
        this.a = aahdVar;
        this.b = aagxVar;
        this.c = axpgVar;
        this.d = adltVar;
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        if (apxfVar == null) {
            return;
        }
        adlm g = this.d.g();
        awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
        if (!apxfVar.pY(WatchEndpointOuterClass.watchEndpoint) || g == null || !g.u().equals(awdpVar.e) || !g.y().equals(awdpVar.d)) {
            try {
                this.b.f(apxfVar).kE(apxfVar, map);
                return;
            } catch (aahm unused) {
                this.a.c(apxfVar, map);
                return;
            }
        }
        ((jfp) this.c.get()).pl(true);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}
