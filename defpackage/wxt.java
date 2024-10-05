package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxt implements wyi, wxc, wwz, wwx, wwy, wwt, wwu, www, wwv, wwr, wws, wwp, wwq {
    private final azrw b;
    final ajun a = new ajun((short[]) null);
    private final Set c = new HashSet();
    private final Set e = new HashSet();
    private final Set d = new HashSet();
    private final Set f = new HashSet();
    private final Set g = new HashSet();

    public wxt(azrw azrwVar) {
        this.b = azrwVar;
    }

    private final void l(List list, xgv xgvVar, ammv ammvVar, ammv ammvVar2) {
        xgx xgxVar = xgvVar.b;
        if (xgxVar instanceof xez) {
            xez xezVar = (xez) xgxVar;
            if (ammvVar.h() || ammvVar2.h()) {
                if (!ammvVar.h() || TextUtils.equals((CharSequence) ammvVar.c(), xezVar.b)) {
                    if ((!ammvVar2.h() || TextUtils.equals((CharSequence) ammvVar2.c(), xezVar.a)) && this.d.contains(xezVar.b) && this.g.contains(xezVar.a)) {
                        list.add(xgvVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.wwr
    public final void a(xgh xghVar, xev xevVar) {
        this.f.add(xevVar.a);
    }

    @Override // defpackage.wwt
    public final void b(xgh xghVar) {
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xgj) && TextUtils.equals(((xgj) xgxVar).a, xghVar.a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wwu
    public final void d(xgh xghVar) {
        this.e.add(xghVar.a);
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xgk) && TextUtils.equals(((xgk) xgxVar).a, xghVar.a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wwv
    public final void e(xgh xghVar) {
        this.e.remove(xghVar.a);
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xgl) && TextUtils.equals(((xgl) xgxVar).a, xghVar.a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wwx
    public final void f(xgh xghVar) {
        this.c.add(xghVar.a);
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xgn) && TextUtils.equals(((xgn) xgxVar).a, xghVar.a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wwz
    public final Set g() {
        return this.g;
    }

    @Override // defpackage.wxc
    public final Set h() {
        return this.e;
    }

    @Override // defpackage.wwy
    public final void i(xgh xghVar) {
        this.c.remove(xghVar.a);
        this.d.remove(xghVar.a);
    }

    @Override // defpackage.www
    public final void j(xgh xghVar) {
        this.d.add(xghVar.a);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.w().iterator();
        while (it.hasNext()) {
            l(arrayList, (xgv) it.next(), ammv.j(xghVar.a), amlr.a);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wxc
    public final Set k() {
        return this.d;
    }

    @Override // defpackage.wwp
    public final void o(xgh xghVar, xev xevVar) {
        this.g.add(xevVar.a);
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xfa) && TextUtils.equals(xevVar.a, ((xfa) xgxVar).a)) {
                arrayList.add(xgvVar);
            }
            xgx xgxVar2 = xgvVar.b;
            if (xgxVar2 instanceof xfo) {
                xfo xfoVar = (xfo) xgxVar2;
                if (xghVar.c() == xfoVar.b && xevVar.b == xfoVar.c && !TextUtils.equals(xevVar.a, xfoVar.a)) {
                    arrayList.add(xgvVar);
                }
            }
            l(arrayList, xgvVar, amlr.a, ammv.j(xevVar.a));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.a.v(xgxVar.c());
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.a.y(xgxVar.c())) {
            String valueOf = String.valueOf(xgxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wxf(sb.toString());
        }
        boolean z = xgxVar instanceof xgn;
        if (z || (xgxVar instanceof xgj) || (xgxVar instanceof xgk) || (xgxVar instanceof xgl) || (xgxVar instanceof xfo) || (xgxVar instanceof xfa) || (xgxVar instanceof xfb) || (xgxVar instanceof xey) || (xgxVar instanceof xex) || (xgxVar instanceof xez)) {
            if (xgxVar instanceof xfb) {
                xfb xfbVar = (xfb) xgxVar;
                if (!this.f.contains(xfbVar.a) && (xevVar == null || !TextUtils.equals(xfbVar.a, xevVar.a))) {
                    throw new wxf("LayoutIdExitedTrigger has unrecognized layoutId");
                }
            }
            if (xgxVar instanceof xey) {
                xey xeyVar = (xey) xgxVar;
                if (!this.f.contains(xeyVar.a) && (xevVar == null || !TextUtils.equals(xeyVar.a, xevVar.a))) {
                    throw new wxf("LayoutExitedForReasonTrigger has unrecognized layoutId");
                }
            }
            if (xgxVar instanceof xex) {
                xex xexVar = (xex) xgxVar;
                if (!this.f.contains(xexVar.f()) && (xevVar == null || !TextUtils.equals(xexVar.f(), xevVar.a))) {
                    throw new wxf("LayoutExitedForOtherReasonTrigger has unrecognized layoutId");
                }
            }
            if (xgxVar instanceof xgl) {
                xgl xglVar = (xgl) xgxVar;
                if (!this.c.contains(xglVar.a) && !TextUtils.equals(xglVar.a, xghVar.a)) {
                    throw new wxf("SlotIdExitedTrigger has unrecognized slotId");
                }
            }
            this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
            if (z && this.c.contains(((xgn) xgxVar).a)) {
                ((wyh) this.b.get()).r(Arrays.asList(this.a.u(xgxVar.c())));
            }
            if ((xgxVar instanceof xgk) && this.e.contains(((xgk) xgxVar).a)) {
                ((wyh) this.b.get()).r(Arrays.asList(this.a.u(xgxVar.c())));
            }
            if ((xgxVar instanceof xfa) && this.g.contains(((xfa) xgxVar).a)) {
                ((wyh) this.b.get()).r(Arrays.asList(this.a.u(xgxVar.c())));
                return;
            }
            return;
        }
        String name = xgxVar.b().name();
        StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 104);
        sb2.append("Incorrect TriggerType: Tried to register trigger for slot of type: ");
        sb2.append(name);
        sb2.append(" in AdsControlFlowEventTriggerAdapter");
        throw new wxf(sb2.toString());
    }

    @Override // defpackage.wwq
    public final void s(xgh xghVar, xev xevVar, int i) {
        this.g.remove(xevVar.a);
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if ((xgxVar instanceof xfb) && TextUtils.equals(xevVar.a, ((xfb) xgxVar).a)) {
                arrayList.add(xgvVar);
            }
            xgx xgxVar2 = xgvVar.b;
            if (xgxVar2 instanceof xey) {
                xey xeyVar = (xey) xgxVar2;
                if (TextUtils.equals(xevVar.a, xeyVar.a) && xeyVar.b == i) {
                    arrayList.add(xgvVar);
                }
            }
            xgx xgxVar3 = xgvVar.b;
            if (xgxVar3 instanceof xex) {
                xex xexVar = (xex) xgxVar3;
                if (TextUtils.equals(xevVar.a, xexVar.f()) && xexVar.e() != i) {
                    arrayList.add(xgvVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
    }

    @Override // defpackage.wws
    public final void v(xev xevVar) {
        this.f.remove(xevVar.a);
    }
}
