package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpx extends dpi {

    @dnt(a = 10)
    dha k;

    private dpx() {
        super("SingleComponentSection");
    }

    public static dpw j(dpj dpjVar) {
        dpw dpwVar = new dpw();
        dpx dpxVar = new dpx();
        dlj dljVar = dpjVar.g;
        dpwVar.a = dpxVar;
        dpwVar.c.clear();
        return dpwVar;
    }

    @Override // defpackage.dpi
    public final /* bridge */ /* synthetic */ dpi a(boolean z) {
        dpx dpxVar = (dpx) super.a(z);
        dha dhaVar = dpxVar.k;
        dpxVar.k = dhaVar != null ? dhaVar.j() : null;
        return dpxVar;
    }

    @Override // defpackage.dpi
    public final boolean d(dpi dpiVar) {
        if (this == dpiVar) {
            return true;
        }
        if (dpiVar == null || getClass() != dpiVar.getClass()) {
            return false;
        }
        dpx dpxVar = (dpx) dpiVar;
        dha dhaVar = this.k;
        return dhaVar == null ? dpxVar.k == null : dhaVar.f(dpxVar.k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dpk
    public final void e(dpj dpjVar, dpd dpdVar, dpi dpiVar, dpi dpiVar2) {
        boolean z;
        dpx dpxVar = (dpx) dpiVar;
        dpx dpxVar2 = (dpx) dpiVar2;
        dim dimVar = new dim(dpxVar == null ? null : dpxVar.k, dpxVar2 == null ? null : dpxVar2.k);
        dim dimVar2 = new dim(null, null);
        dim dimVar3 = new dim(null, null);
        dim dimVar4 = new dim(null, null);
        dim dimVar5 = new dim(null, null);
        dim dimVar6 = new dim(null, null);
        Object obj = dimVar6.a;
        Object obj2 = dimVar6.b;
        dha dhaVar = (dha) dimVar.a;
        dha dhaVar2 = (dha) dimVar.b;
        if (dhaVar == null && dhaVar2 == null) {
            return;
        }
        if (dhaVar == null || dhaVar2 != null) {
            Object obj3 = dimVar2.b;
            boolean booleanValue = obj3 != null ? ((Boolean) obj3).booleanValue() : false;
            Object obj4 = dimVar3.b;
            int intValue = obj4 != null ? ((Integer) obj4).intValue() : 1;
            Object obj5 = dimVar4.b;
            boolean booleanValue2 = obj5 != null ? ((Boolean) obj5).booleanValue() : false;
            if (dhaVar != null) {
                Object obj6 = dimVar2.a;
                boolean booleanValue3 = obj6 != null ? ((Boolean) obj6).booleanValue() : false;
                Object obj7 = dimVar3.a;
                int intValue2 = obj7 != null ? ((Integer) obj7).intValue() : 1;
                Object obj8 = dimVar4.a;
                boolean booleanValue4 = obj8 != null ? ((Boolean) obj8).booleanValue() : false;
                Map map = (Map) dimVar5.a;
                Map map2 = (Map) dimVar5.b;
                if (map != map2) {
                    if (map != null && map2 != null && map.size() == map2.size()) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!did.K(entry.getValue(), map2.get(entry.getKey()))) {
                            }
                        }
                    }
                    z = false;
                    if (booleanValue3 != booleanValue && intValue2 == intValue && booleanValue4 == booleanValue2 && dhaVar.f(dhaVar2) && z) {
                        return;
                    }
                    dqt p = dqv.p();
                    esv.Y(p, (Map) dimVar5.b);
                    p.b = dhaVar2;
                    p.c(booleanValue);
                    p.d(intValue);
                    p.b(booleanValue2);
                    dpdVar.f(dpb.d(2, new duc(p.g(), dpjVar.n(), null, null, null), obj, obj2));
                    return;
                }
                z = true;
                if (booleanValue3 != booleanValue) {
                }
                dqt p2 = dqv.p();
                esv.Y(p2, (Map) dimVar5.b);
                p2.b = dhaVar2;
                p2.c(booleanValue);
                p2.d(intValue);
                p2.b(booleanValue2);
                dpdVar.f(dpb.d(2, new duc(p2.g(), dpjVar.n(), null, null, null), obj, obj2));
                return;
            }
            dqt p3 = dqv.p();
            esv.Y(p3, (Map) dimVar5.b);
            p3.b = dhaVar2;
            p3.c(booleanValue);
            p3.d(intValue);
            p3.b(booleanValue2);
            dqv g = p3.g();
            amsj n = dpjVar.n();
            dpi dpiVar3 = dpdVar.b;
            if (dpiVar3 != null) {
                String str = dpiVar3.i;
                if (g.a == null) {
                    g.a = DesugarCollections.synchronizedMap(new HashMap());
                }
                g.a.put("section_global_key", str);
            }
            dpdVar.f(dpb.d(1, new duc(g, n, null, null, null), null, obj2));
            return;
        }
        dpdVar.f(dpb.e(obj));
    }

    @Override // defpackage.dpi, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return d((dpi) obj);
    }

    @Override // defpackage.dpk
    public final boolean g() {
        return true;
    }
}
