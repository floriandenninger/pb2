package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvv implements aaha {
    public final zaw a;
    public final azrw b;
    public final ajmu c;
    private final abdd d;
    private final afyt e;
    private final Context f;
    private final aadw g;

    public fvv(Context context, abdd abddVar, zaw zawVar, azrw azrwVar, ajmu ajmuVar, afyt afytVar, aadw aadwVar) {
        abddVar.getClass();
        this.d = abddVar;
        zawVar.getClass();
        this.a = zawVar;
        azrwVar.getClass();
        this.b = azrwVar;
        ajmuVar.getClass();
        this.c = ajmuVar;
        afytVar.getClass();
        this.e = afytVar;
        this.f = context;
        aadwVar.getClass();
        this.g = aadwVar;
    }

    public final void b(apxf apxfVar, Map map, boolean z) {
        fvw fvwVar;
        fvx fvxVar = (fvx) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", fvx.class);
        if (fvxVar != null && (fvwVar = fvxVar.b) != null) {
            fvwVar.a();
        }
        boolean z2 = fvxVar != null && fvxVar.a;
        abda a = this.d.a();
        SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = (SubscribeEndpointOuterClass$SubscribeEndpoint) apxfVar.pX(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
        Iterator it = subscribeEndpointOuterClass$SubscribeEndpoint.b.iterator();
        while (it.hasNext()) {
            a.d((String) it.next());
        }
        if (!subscribeEndpointOuterClass$SubscribeEndpoint.d.isEmpty()) {
            a.b = subscribeEndpointOuterClass$SubscribeEndpoint.d;
        }
        if (apxfVar.pY(aupg.b)) {
            aupf aupfVar = (aupf) apxfVar.pX(aupg.b);
            if (!aupfVar.c.isEmpty()) {
                a.n(aupfVar.c);
            }
        }
        a.a = subscribeEndpointOuterClass$SubscribeEndpoint.c;
        a.l(apxfVar.c);
        asvu asvuVar = this.g.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.ae) {
            boolean d = this.e.d(this.f);
            long a2 = this.e.a();
            aone aoneVar = a.c;
            aoneVar.copyOnWrite();
            atnf atnfVar = (atnf) aoneVar.instance;
            atnf atnfVar2 = atnf.a;
            atnfVar.b = 1 | atnfVar.b;
            atnfVar.c = d;
            aone aoneVar2 = a.c;
            aoneVar2.copyOnWrite();
            atnf atnfVar3 = (atnf) aoneVar2.instance;
            atnfVar3.b |= 2;
            atnfVar3.d = a2;
            aone aoneVar3 = a.c;
            aoneVar3.copyOnWrite();
            atnf atnfVar4 = (atnf) aoneVar3.instance;
            atnfVar4.b |= 4;
            atnfVar4.e = z;
        }
        ajip ajipVar = (ajip) yjj.u(map, "command_status_callback", ajip.class);
        this.d.e(a, new fvu(this, map, subscribeEndpointOuterClass$SubscribeEndpoint, z2, fvxVar, (ajipVar == null || ajipVar.a()) ? null : ajipVar.b(), apxfVar));
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        asvu asvuVar = this.g.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.ae) {
            ynm.k(this.e.c(), ynm.a, new ynk() { // from class: fvs
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    fvv.this.b(apxfVar, map, true);
                }
            }, new ynl() { // from class: fvt
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    fvv.this.b(apxfVar, map, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            b(apxfVar, map, false);
        }
    }
}
