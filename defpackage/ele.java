package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ele implements wyi, ekg, eki {
    final ajun a = new ajun((short[]) null);
    private final azrw b;

    public ele(azrw azrwVar, ekm ekmVar) {
        this.b = azrwVar;
        ekmVar.a(this);
    }

    @Override // defpackage.ekg
    public final void b() {
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            if (xgvVar.b instanceof xgc) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void f(xgb xgbVar, String str) {
    }

    @Override // defpackage.ekg
    public final void h(xgb xgbVar) {
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xgf) && amkq.b(xgbVar.a, ((xgf) xgxVar).a.a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void j(List list) {
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void l(xgb xgbVar) {
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void m(int i, xgb xgbVar) {
    }

    @Override // defpackage.eki
    public final void n(ekh ekhVar) {
        ekhVar.a(this);
    }

    @Override // defpackage.eki
    public final void o(ekj ekjVar) {
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.a.v(xgxVar.c());
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.a.y(xgxVar.c())) {
            String str = xghVar.a;
            throw new wxf(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        }
        if ((xgxVar instanceof xgc) || (xgxVar instanceof xgf) || (xgxVar instanceof xge)) {
            this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
            if (xgxVar instanceof xge) {
                xge xgeVar = (xge) xgxVar;
                if (xgeVar.b.d != null) {
                    ((wyh) this.b.get()).r(Arrays.asList(this.a.u(xgeVar.a)));
                    return;
                }
                return;
            }
            return;
        }
        String str2 = xghVar.a;
        String name = xgxVar.b().name();
        StringBuilder sb = new StringBuilder(str2.length() + 91 + String.valueOf(name).length());
        sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
        sb.append(str2);
        sb.append(" of type ");
        sb.append(name);
        sb.append(" in ReelsTriggerAdapter");
        throw new wxf(sb.toString());
    }

    @Override // defpackage.eki
    public final void s() {
    }

    @Override // defpackage.ekg
    public final void v(xgb xgbVar) {
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xge) && amkq.b(xgbVar.a, ((xge) xgxVar).b.a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.ekg
    public final /* synthetic */ void w() {
    }
}
