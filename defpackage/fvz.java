package defpackage;

import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvz implements aaha {
    public final zaw a;
    public final aahd b;
    public final ajmu c;
    private final abdd d;

    public fvz(zaw zawVar, aahd aahdVar, abdd abddVar, ajmu ajmuVar) {
        zawVar.getClass();
        this.a = zawVar;
        aahdVar.getClass();
        this.b = aahdVar;
        abddVar.getClass();
        this.d = abddVar;
        ajmuVar.getClass();
        this.c = ajmuVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        fvw fvwVar;
        fvx fvxVar = (fvx) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", fvx.class);
        if (fvxVar != null && (fvwVar = fvxVar.b) != null) {
            fvwVar.a();
        }
        abdf b = this.d.b();
        Iterator it = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apxfVar.pX(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c.iterator();
        while (it.hasNext()) {
            b.d((String) it.next());
        }
        String str = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apxfVar.pX(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).e;
        if (!str.isEmpty()) {
            b.b = str;
        }
        if (apxfVar.pY(aupg.b)) {
            aupf aupfVar = (aupf) apxfVar.pX(aupg.b);
            if (!aupfVar.c.isEmpty()) {
                b.n(aupfVar.c);
            }
        }
        if ((((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apxfVar.pX(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).b & 1) != 0) {
            b.a = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apxfVar.pX(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).d;
        }
        b.l(apxfVar.c);
        ajip ajipVar = (ajip) yjj.u(map, "command_status_callback", ajip.class);
        this.d.f(b, new fvy(this, map, apxfVar, fvxVar, (ajipVar == null || ajipVar.a()) ? null : ajipVar.b()));
    }
}
