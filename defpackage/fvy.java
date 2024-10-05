package defpackage;

import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fvy implements afwx {
    final /* synthetic */ Map a;
    final /* synthetic */ apxf b;
    final /* synthetic */ fvx c;
    final /* synthetic */ fvz d;
    final /* synthetic */ ayue e;

    public fvy(fvz fvzVar, Map map, apxf apxfVar, fvx fvxVar, ayue ayueVar) {
        this.d = fvzVar;
        this.a = map;
        this.b = apxfVar;
        this.c = fvxVar;
        this.e = ayueVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        fvw fvwVar;
        this.d.a.e(cnqVar);
        Iterator it = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) this.b.pX(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c.iterator();
        while (it.hasNext()) {
            ipl d = ipl.d(this.d.c, (String) it.next());
            if (d != null) {
                this.d.c.d(d.b, d);
            }
        }
        fvx fvxVar = this.c;
        if (fvxVar != null && (fvwVar = fvxVar.b) != null) {
            fvwVar.c();
        }
        ayue ayueVar = this.e;
        if (ayueVar != null) {
            ayueVar.c(cnqVar);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        fvw fvwVar;
        acra acraVar;
        asbr asbrVar = (asbr) obj;
        Map map = this.a;
        if (map != null && (asbrVar.b & 4) != 0 && (acraVar = (acra) yjj.u(map, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class)) != null) {
            acraVar.D(new acqx(asbrVar.f.I()));
            acraVar.u(new acqx(asbrVar.f.I()), null);
        }
        Iterator it = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) this.b.pX(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c.iterator();
        while (it.hasNext()) {
            ipk c = ipl.c((String) it.next());
            c.c = false;
            c.e(true);
            c.d(asbrVar.g);
            ipl a = c.a();
            this.d.c.c(a.b, a);
        }
        fvx fvxVar = this.c;
        if (fvxVar != null && (fvwVar = fvxVar.b) != null) {
            fvwVar.b(null);
        }
        if (asbrVar.e.size() != 0) {
            this.d.b.d(asbrVar.e, this.a);
        }
        ayue ayueVar = this.e;
        if (ayueVar != null) {
            ayueVar.a();
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
