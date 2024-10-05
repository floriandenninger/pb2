package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {xcs.class, xcw.class, xde.class, xds.class, xdw.class, xeh.class, xef.class})
/* loaded from: classes4.dex */
public final class wqr extends wqz {
    public final wyn a;
    public final xgh b;

    public wqr(wrd wrdVar, wyn wynVar, xgh xghVar) {
        super(wrdVar);
        this.a = wynVar;
        this.b = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        final ammv ammvVar;
        if (this.b.e(xda.class) && this.b.d(xda.class) != null) {
            ammvVar = ammv.j((aplf) this.b.d(xda.class));
        } else {
            ammvVar = amlr.a;
        }
        final List list = (List) this.b.d(xcw.class);
        this.d.c(new amml() { // from class: wqq
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wqr wqrVar = wqr.this;
                ammv ammvVar2 = ammvVar;
                List list2 = list;
                xgh xghVar = (xgh) obj;
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) xghVar.d(xds.class);
                apxf apxfVar = (apxf) xghVar.d(xeh.class);
                Map map = (Map) xghVar.d(xef.class);
                String str = (String) xghVar.d(xdw.class);
                String str2 = (String) xghVar.d(xde.class);
                xcf xcfVar = (xcf) xghVar.d(xcs.class);
                apxf apxfVar2 = true != amkq.b(apxfVar, apxf.a) ? apxfVar : null;
                if (ammvVar2.h()) {
                    return wqrVar.a.c(wqrVar.b, str, instreamAdImpl, (aplf) ammvVar2.c(), apxfVar2, map, str2, xcfVar);
                }
                if (list2 == null || list2.isEmpty()) {
                    return null;
                }
                return wqrVar.a.d(wqrVar.b, str, instreamAdImpl, list2, apxfVar2, map, str2, xcfVar);
            }
        });
    }
}
