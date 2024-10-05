package defpackage;

import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajrm implements ajde {
    final /* synthetic */ aqdt a;
    final /* synthetic */ atsu b;
    final /* synthetic */ Map c;
    final /* synthetic */ ajrn d;

    public ajrm(ajrn ajrnVar, aqdt aqdtVar, atsu atsuVar, Map map) {
        this.d = ajrnVar;
        this.a = aqdtVar;
        this.b = atsuVar;
        this.c = map;
    }

    @Override // defpackage.ajde
    public final void a() {
    }

    @Override // defpackage.ajde
    public final void b() {
        apmg m = ahbl.m(this.a);
        if (m != null) {
            apxf apxfVar = m.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(FlagEndpointOuterClass$FlagEndpoint.flagEndpoint)) {
                return;
            }
        } else {
            apxf apxfVar2 = this.a.r;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            if (apxfVar2.pY(FlagEndpointOuterClass$FlagEndpoint.flagEndpoint)) {
                return;
            }
        }
        this.d.b(this.b, this.c);
    }

    @Override // defpackage.ajde
    public final void c(boolean z) {
    }
}
