package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxn extends rxk {
    public rxn(Context context) {
        super(context, rzc.a());
        l(new ryw());
        this.b = new rxo();
        this.c = new rxq(1);
    }

    @Override // defpackage.rxk
    protected final ryv a() {
        return ((ryw) this.a).g();
    }

    @Override // defpackage.rxk
    protected final void d(List list) {
        ryw rywVar = (ryw) this.a;
        if (!rywVar.o() || list.size() < 2) {
            return;
        }
        Iterator it = list.iterator();
        double doubleValue = ((Double) ((rxt) it.next()).a).doubleValue();
        double d = doubleValue;
        while (it.hasNext()) {
            double doubleValue2 = ((Double) ((rxt) it.next()).a).doubleValue();
            if (doubleValue2 > d) {
                d = doubleValue2;
            } else if (doubleValue2 < doubleValue) {
                doubleValue = doubleValue2;
            }
        }
        ryv g = ((ryw) this.a).g();
        rywVar.a.e = new ryv(Double.valueOf(Math.min(((Double) g.a).doubleValue(), doubleValue)), Double.valueOf(Math.max(((Double) g.b).doubleValue(), d))).a();
        ryz ryzVar = rywVar.a;
        ryzVar.f = ryzVar.e != null;
        rywVar.b = true;
    }

    @Override // defpackage.rxk
    protected final boolean h() {
        return ((ryw) this.a).o();
    }

    public final void m() {
        ((ryw) this.a).a.b = false;
    }
}
