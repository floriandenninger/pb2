package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryo implements rxw {
    public final ryp a;

    public ryo(ryp rypVar) {
        this.a = rypVar;
    }

    @Override // defpackage.rxw
    public final List b(List list, ryv ryvVar, int i, rwl rwlVar, rxu rxuVar, rxl rxlVar, rze rzeVar, boolean z) {
        rze rzeVar2;
        ArrayList z2 = rwh.z(this.a.f(ryvVar));
        ryf it = this.a.e(ryvVar).iterator();
        int[] g = this.a.g();
        rxm rxmVar = new rxm();
        int i2 = 0;
        while (i2 < g.length) {
            int i3 = g[i2];
            z2.clear();
            it.b(i3);
            while (it.hasNext()) {
                z2.add(Double.valueOf(it.next().doubleValue()));
            }
            List a = rxuVar.a(z2);
            if (!z || z2.isEmpty()) {
                rzeVar2 = rzeVar;
            } else {
                rza h = rzeVar.h();
                h.j((Double) z2.get(0));
                h.j((Double) z2.get(z2.size() - 1));
                rzeVar2 = h;
            }
            rxmVar = rxlVar.e(z2, a, i, rzeVar2, i2 < g.length + (-1));
            if (!rxmVar.a) {
                return rxmVar.b;
            }
            i2++;
        }
        return rxmVar.b;
    }
}
