package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gse implements aaha, ewk {
    public static final /* synthetic */ int e = 0;
    public final gpz a;
    public final Executor b;
    public final fjn c;
    public final agpr d;
    private final Executor f;
    private final azrw g;

    public gse(gpz gpzVar, Executor executor, Executor executor2, fjn fjnVar, azrw azrwVar, agpr agprVar) {
        this.a = gpzVar;
        this.b = executor;
        this.f = executor2;
        this.c = fjnVar;
        this.g = azrwVar;
        this.d = agprVar;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        anhy i;
        if (!apxfVar.pY(atrs.a)) {
            throw new aahm("Command is not an OfflineWatchEndpoint.");
        }
        final atrr atrrVar = (atrr) apxfVar.pX(atrs.a);
        if (atrrVar.c.isEmpty()) {
            i = anaf.O(gsd.a(amlr.a, true));
        } else {
            i = anfq.i(anht.q(((agof) this.g.get()).a().m().h(atrrVar.c)), new anfz() { // from class: gsc
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    gse gseVar = gse.this;
                    final ammv ammvVar = (ammv) obj;
                    anhy d = gseVar.d.d((agnv) ammvVar.f());
                    return anfq.h(anht.q(d), new amml() { // from class: gsb
                        @Override // defpackage.amml
                        public final Object apply(Object obj2) {
                            ammv ammvVar2 = ammv.this;
                            int i2 = gse.e;
                            return gsd.a(ammvVar2, ((Boolean) obj2).booleanValue());
                        }
                    }, gseVar.b);
                }
            }, this.b);
        }
        ynm.k(i, this.f, egw.t, new ynl() { // from class: gsa
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                gse gseVar = gse.this;
                apxf apxfVar2 = apxfVar;
                Map map2 = map;
                atrr atrrVar2 = atrrVar;
                gsd gsdVar = (gsd) obj;
                if (gsdVar.b) {
                    gseVar.a.kE(apxfVar2, map2);
                } else {
                    gseVar.c.a(atrrVar2.c, (agnv) gsdVar.a.f(), atrrVar2.d);
                }
            }
        });
    }
}
