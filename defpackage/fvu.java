package defpackage;

import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fvu implements afwx {
    final /* synthetic */ Map a;
    final /* synthetic */ SubscribeEndpointOuterClass$SubscribeEndpoint b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fvx d;
    final /* synthetic */ apxf e;
    final /* synthetic */ fvv f;
    final /* synthetic */ ayue g;

    public fvu(fvv fvvVar, Map map, SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint, boolean z, fvx fvxVar, ayue ayueVar, apxf apxfVar) {
        this.f = fvvVar;
        this.a = map;
        this.b = subscribeEndpointOuterClass$SubscribeEndpoint;
        this.c = z;
        this.d = fvxVar;
        this.g = ayueVar;
        this.e = apxfVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        fvw fvwVar;
        this.f.a.e(cnqVar);
        Iterator it = ((SubscribeEndpointOuterClass$SubscribeEndpoint) this.e.pX(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)).b.iterator();
        while (it.hasNext()) {
            ipl d = ipl.d(this.f.c, (String) it.next());
            if (d != null) {
                ipk f = d.f();
                f.c(this.c);
                ipl a = f.a();
                this.f.c.d(a.b, a);
            }
        }
        fvx fvxVar = this.d;
        if (fvxVar != null && (fvwVar = fvxVar.b) != null) {
            fvwVar.c();
        }
        ayue ayueVar = this.g;
        if (ayueVar != null) {
            ayueVar.c(cnqVar);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        fvw fvwVar;
        avae avaeVar;
        acra acraVar;
        asbp asbpVar = (asbp) obj;
        Map map = this.a;
        if (map != null && (asbpVar.b & 16) != 0 && (acraVar = (acra) yjj.u(map, "com.google.android.libraries.youtube.logging.interaction_logger", acra.class)) != null) {
            acraVar.D(new acqx(asbpVar.h.I()));
            acraVar.u(new acqx(asbpVar.h.I()), null);
        }
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            ipk c = ipl.c((String) it.next());
            c.c = true;
            c.c(this.c);
            c.d(asbpVar.i);
            c.e(true);
            if ((asbpVar.b & 4) != 0) {
                arwh arwhVar = asbpVar.g;
                if (arwhVar == null) {
                    arwhVar = arwh.a;
                }
                int i = arwhVar.b;
                int i2 = 119226798;
                if (i == 119226798) {
                    avaeVar = (avae) arwhVar.c;
                } else {
                    i2 = i;
                    avaeVar = null;
                }
                c.e = avaeVar;
                c.d = i2 == 136076983 ? (avaa) arwhVar.c : null;
            }
            ipl a = c.a();
            this.f.c.c(a.b, a);
        }
        if (asbpVar.e.size() != 0) {
            ((aahd) this.f.b.get()).d(asbpVar.e, this.a);
        }
        fvx fvxVar = this.d;
        if (fvxVar != null && (fvwVar = fvxVar.b) != null) {
            fvwVar.b(asbpVar);
        }
        ayue ayueVar = this.g;
        if (ayueVar != null) {
            ayueVar.a();
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
