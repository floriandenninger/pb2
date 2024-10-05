package defpackage;

import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxe extends rwx implements rxd {
    private float b;
    private float c;
    private float d;

    @Override // defpackage.rwx
    protected final void A(Object obj, Object obj2, Double d, Double d2, int i, rze rzeVar, rze rzeVar2, rze rzeVar3, rze rzeVar4, TreeMap treeMap, rww rwwVar) {
        float a;
        float f;
        float a2;
        Comparable comparable = (Comparable) obj2;
        boolean n = this.a.n(obj2);
        float a3 = this.a.a(obj2);
        Map.Entry lowerEntry = treeMap.lowerEntry(comparable);
        if (lowerEntry == null) {
            lowerEntry = treeMap.higherEntry(comparable);
        }
        if (lowerEntry != null) {
            if (!n) {
                a3 = h(((Integer) lowerEntry.getValue()).intValue());
            }
            f = j(((Integer) lowerEntry.getValue()).intValue());
            a = i(((Integer) lowerEntry.getValue()).intValue());
        } else {
            if (!n) {
                a3 = rzeVar.a(obj2);
            }
            Double valueOf = Double.valueOf(0.0d);
            float a4 = rzeVar2.a(valueOf);
            a = rzeVar2.a(valueOf);
            f = a4;
        }
        rwwVar.a.d(obj, 0.0f, 0.0f, 1);
        rwwVar.b.d(obj2, a3, rzeVar.a(obj2), 1);
        rwr rwrVar = rwwVar.c;
        if (d != null) {
            a2 = rzeVar2.b(d, d2);
        } else {
            a2 = rzeVar2.a(d2);
        }
        rwrVar.d(d, f, a2, 1);
        rwwVar.d.d(d2, a, rzeVar2.a(d2), 1);
        rwwVar.e.a(i, i, 1);
    }

    @Override // defpackage.rxd
    public final rxf a() {
        if (this.a == null) {
            return null;
        }
        return new rxf(o(), p(), this.c);
    }

    @Override // defpackage.rxd
    public final void b(rxf rxfVar) {
        if (rxfVar == null) {
            return;
        }
        v(rxfVar.a);
        w(rxfVar.b);
        this.b = this.c;
        float f = rxfVar.c;
        this.c = f;
        this.d = f;
    }

    @Override // defpackage.rxd
    public final void c(float f) {
        this.b = this.c;
        this.d = f;
    }

    @Override // defpackage.rxd
    public final void d() {
    }

    @Override // defpackage.rwx
    protected final rww f(sba sbaVar) {
        return n(sbaVar);
    }

    @Override // defpackage.rwx, defpackage.rwz
    public final synchronized void g(float f) {
        super.g(f);
        this.c = rwq.a(this.b, this.d, f);
    }

    @Override // defpackage.rwx
    protected final void y(Object obj, Object obj2, rze rzeVar, rze rzeVar2, TreeMap treeMap, rww rwwVar) {
        int i;
        float h;
        if (obj != null) {
            Map.Entry higherEntry = treeMap.higherEntry((Comparable) obj2);
            if (higherEntry == null) {
                return;
            } else {
                i = ((Integer) higherEntry.getValue()).intValue();
            }
        } else {
            i = 0;
        }
        int l = l();
        while (i < l) {
            Object t = t(i);
            Double r = r(i);
            Double q = q(i);
            int k = k(i);
            if (rzeVar.n(t)) {
                h = rzeVar.a(t);
            } else {
                h = h(i) + rzeVar.e();
            }
            Double d = null;
            if (r != null && obj != null) {
                d = r;
            }
            rwwVar.a.d(s(i), 0.0f, 0.0f, 0);
            rwwVar.b.d(t(i), h(i), h, 0);
            rwwVar.c.d(r, j(i), rzeVar2.b(d, q), 0);
            rwwVar.d.d(q, i(i), rzeVar2.a(q), 0);
            rwwVar.e.a(k, k, 0);
            i++;
        }
    }

    @Override // defpackage.rwx
    protected final void z(Object obj, rze rzeVar, rze rzeVar2, TreeMap treeMap, rww rwwVar) {
        float h;
        Map.Entry lowerEntry = treeMap.lowerEntry((Comparable) obj);
        if (lowerEntry != null) {
            for (int i = 0; i <= ((Integer) lowerEntry.getValue()).intValue(); i++) {
                Object t = t(i);
                Double r = r(i);
                Double q = q(i);
                int k = k(i);
                if (rzeVar.n(t)) {
                    h = rzeVar.a(t);
                } else {
                    h = h(i) - rzeVar.e();
                }
                rwwVar.a.d(s(i), 0.0f, 0.0f, 0);
                rwwVar.b.d(t(i), h(i), h, 0);
                rwwVar.c.d(r, j(i), rzeVar2.b(r, q), 0);
                rwwVar.d.d(q, i(i), rzeVar2.a(q), 0);
                rwwVar.e.a(k, k, 0);
            }
        }
    }
}
