package defpackage;

import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xra implements aaha {
    public static final /* synthetic */ int a = 0;
    private final aavy b;
    private final azrw c;
    private final Executor d;
    private final xpi e;
    private final aadw f;

    public xra(aavy aavyVar, azrw azrwVar, xpi xpiVar, aadw aadwVar, Executor executor) {
        this.e = xpiVar;
        aavyVar.getClass();
        this.b = aavyVar;
        azrwVar.getClass();
        this.c = azrwVar;
        aadwVar.getClass();
        this.f = aadwVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        afwx afwxVar = (afwx) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", afwx.class);
        afwx afwxVar2 = afwxVar;
        if (afwxVar == null) {
            xpi xpiVar = this.e;
            if (xpiVar == null) {
                final Class<arlt> cls = arlt.class;
                afwxVar2 = afxb.a(new cnl() { // from class: afwz
                    @Override // defpackage.cnl
                    public final void kZ(Object obj) {
                        String valueOf = String.valueOf(cls.getCanonicalName());
                        if (valueOf.length() != 0) {
                            "Successful volley request for type ".concat(valueOf);
                        }
                    }
                }, new cnk() { // from class: afwy
                    @Override // defpackage.cnk
                    public final void kY(cnq cnqVar) {
                        String valueOf = String.valueOf(cls.getCanonicalName());
                        zga.d(valueOf.length() != 0 ? "Volley request failed for type ".concat(valueOf) : new String("Volley request failed for type "), cnqVar);
                    }
                });
            } else {
                xpiVar.a = map;
                afwxVar2 = xpiVar;
            }
        }
        Object s = yjj.s(map, "com.google.android.libraries.youtube.comment.action_tag");
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) apxfVar.pX(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
        Iterable r = performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c.size() > 0 ? performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.c : amru.r(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.b);
        aavy aavyVar = this.b;
        aone createBuilder = arls.a.createBuilder();
        createBuilder.copyOnWrite();
        arls arlsVar = (arls) createBuilder.instance;
        aony aonyVar = arlsVar.d;
        if (!aonyVar.c()) {
            arlsVar.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll(r, (List) arlsVar.d);
        aavu aavuVar = new aavu(aavyVar.f, aavyVar.a.c(), createBuilder, null, null, null);
        aavuVar.l(apxfVar.c);
        if (apxfVar.pY(aupg.b)) {
            aupf aupfVar = (aupf) apxfVar.pX(aupg.b);
            if (!aupfVar.c.isEmpty()) {
                aavuVar.n(aupfVar.c);
            }
        }
        anhy b = this.b.c.b(aavuVar, this.d);
        Executor executor = this.d;
        izp izpVar = new izp(afwxVar2, 2);
        afwxVar2.getClass();
        ynm.k(b, executor, izpVar, new izq(afwxVar2, 2));
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() > 0) {
            if (s == null) {
                apxs apxsVar = this.f.b().z;
                if (apxsVar == null) {
                    apxsVar = apxs.a;
                }
                if (apxsVar.c) {
                    ((aahd) this.c.get()).b(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d);
                    return;
                }
                return;
            }
            ((aahd) this.c.get()).e(performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d, s);
        }
    }
}
