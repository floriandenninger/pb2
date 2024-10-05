package defpackage;

import android.view.View;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lws implements Observer {
    final /* synthetic */ lwt a;

    public lws(lwt lwtVar) {
        this.a = lwtVar;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, final Object obj) {
        if (this.a.b.equals(observable) && (obj instanceof avzn)) {
            lwt lwtVar = this.a;
            ci ciVar = lwtVar.a;
            final nkx nkxVar = (nkx) lwtVar.c.get();
            final acra acraVar = this.a.e;
            final int i = 0;
            final int i2 = 1;
            ynm.n(ciVar, ynm.b(nkxVar.a, anfq.h(nkxVar.d.b.a(), fjw.a, angq.a), new amml() { // from class: nku
                @Override // defpackage.amml
                public final Object apply(Object obj2) {
                    arej j;
                    nkx nkxVar2 = nkx.this;
                    acra acraVar2 = acraVar;
                    if (((Boolean) obj2).booleanValue()) {
                        return false;
                    }
                    for (nkw nkwVar : nkxVar2.c) {
                        View h = nkwVar.h();
                        if (h != null && h.isShown() && (j = nkwVar.j()) != null) {
                            nkv nkvVar = new nkv(nkxVar2);
                            nkxVar2.b.c(j, h, j, acraVar2, nkvVar);
                            if (nkvVar.a) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }), new zfi(this) { // from class: lwr
                public final /* synthetic */ lws a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj2) {
                    if (i == 0) {
                        this.a.a.d.a((avzn) obj);
                        return;
                    }
                    lws lwsVar = this.a;
                    Object obj3 = obj;
                    if (((Boolean) obj2).booleanValue()) {
                        return;
                    }
                    lwsVar.a.d.a((avzn) obj3);
                }
            }, new zfi(this) { // from class: lwr
                public final /* synthetic */ lws a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj2) {
                    if (i2 == 0) {
                        this.a.a.d.a((avzn) obj);
                        return;
                    }
                    lws lwsVar = this.a;
                    Object obj3 = obj;
                    if (((Boolean) obj2).booleanValue()) {
                        return;
                    }
                    lwsVar.a.d.a((avzn) obj3);
                }
            });
        }
    }
}
