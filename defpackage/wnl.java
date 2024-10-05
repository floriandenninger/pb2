package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnl implements wwd, wyh, wxk, wsw, wno, wqy, wxb, yqa {
    private final wnm a;
    private final Set b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final Set f;
    private final Set g;
    private final Set h;
    private final Set i;
    private final Set j;
    private final Set k;
    private final xln l;
    private final wwm m;
    private final aaea n;
    private final yqi o;
    private final aadw p;
    private final yfl q;

    public wnl(wnm wnmVar, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8, Set set9, Set set10, Context context, xln xlnVar, yfl yflVar, wwm wwmVar, aaea aaeaVar, aadw aadwVar, byte[] bArr) {
        yqi yqiVar = new yqi();
        this.o = yqiVar;
        this.a = wnmVar;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
        this.g = set5;
        this.f = set6;
        this.h = set7;
        this.i = set8;
        this.j = set9;
        this.k = set10;
        this.l = xlnVar;
        this.q = yflVar;
        this.m = wwmVar;
        this.n = aaeaVar;
        this.p = aadwVar;
        if (wbs.A(aadwVar)) {
            yqiVar.a(yjj.m(context));
            yqiVar.c(this);
        }
    }

    private final void A(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xgv xgvVar = (xgv) it.next();
            xev xevVar = xgvVar.d;
            if (xevVar == null || !xevVar.g.containsKey(xgvVar.b)) {
                xgh xghVar = xgvVar.c;
                xev xevVar2 = xgvVar.d;
                String valueOf = String.valueOf(xgvVar.b.b().name());
                whu.m(xghVar, xevVar2, valueOf.length() != 0 ? "Ping migration no associated ping bindings for activated trigger: ".concat(valueOf) : new String("Ping migration no associated ping bindings for activated trigger: "));
            } else {
                List list2 = (List) xgvVar.d.g.get(xgvVar.b);
                if (wbs.p(this.n)) {
                    this.l.c(apaa.ADS_CLIENT_EVENT_TYPE_PING_SEND_REQUESTED, xgvVar.c, xgvVar.d, new xfw(xgvVar.b.b(), list2.size(), amru.q()), this.a.b(xgvVar.c));
                }
                amrp f = amru.f();
                Iterator it2 = list2.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    try {
                        xeq a = this.m.a(xgvVar.c, xgvVar.d, xgvVar.e, (aoye) it2.next());
                        this.q.a(a);
                        f.h(ammv.j(a));
                        i++;
                    } catch (MalformedURLException | wnw | wxe e) {
                        xgh xghVar2 = xgvVar.c;
                        xev xevVar3 = xgvVar.d;
                        String valueOf2 = String.valueOf(e.getMessage());
                        whu.m(xghVar2, xevVar3, valueOf2.length() != 0 ? "Ping migration failed to send ping".concat(valueOf2) : new String("Ping migration failed to send ping"));
                        f.h(amlr.a);
                    }
                }
                if (wbs.p(this.n) && i > 0) {
                    this.l.c(apaa.ADS_CLIENT_EVENT_TYPE_PING_SENT, xgvVar.c, xgvVar.d, new xfw(xgvVar.b.b(), i, f.g()), this.a.b(xgvVar.c));
                }
            }
        }
    }

    private final void B(xgh xghVar) {
        if (this.a.n(xghVar) && this.a.a(xghVar).o == 3 && this.a.m(xghVar)) {
            this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_ENTER_LAYOUT_REQUESTED, this.a.b(xghVar), xghVar, this.a.c(xghVar));
            wnn a = this.a.a(xghVar);
            a.o = 4;
            a.k.qu();
        }
    }

    private final void C(xgh xghVar, xev xevVar, int i) {
        apaa apaaVar = (apaa) wyl.c.get(Integer.valueOf(i));
        xln xlnVar = this.l;
        if (apaaVar == null) {
            apaaVar = apaa.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
        }
        xlnVar.a(apaaVar, this.a.b(xghVar), xghVar, xevVar);
        wnn a = this.a.a(xghVar);
        if (a.o != 4) {
            wnm.v(a, "stopRenderingLayout");
        }
        a.o = 5;
        a.k.qv(i);
    }

    private final void D(xgh xghVar, boolean z) {
        this.a.a(xghVar).l = false;
        if (z) {
            return;
        }
        wnn a = this.a.a(xghVar);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a.g);
        a.g.clear();
        r(arrayList);
    }

    private final boolean E(xgh xghVar, xev xevVar) {
        return this.a.n(xghVar) && this.a.m(xghVar) && this.a.r(xghVar) && this.a.q(xghVar) && this.a.p(xghVar, xevVar);
    }

    private final void w(xgh xghVar, boolean z) {
        xev c = this.a.c(xghVar);
        if (E(xghVar, c)) {
            C(xghVar, c, true == z ? 1 : 4);
            return;
        }
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_EXIT_SLOT_REQUESTED, this.a.b(xghVar), xghVar, z);
        wnn a = this.a.a(xghVar);
        int i = a.o;
        if (i != 2 && i != 3 && i != 4) {
            wnm.v(a, "exitSlot");
        }
        a.o = 6;
        a.j.b();
    }

    private final void x(xeo xeoVar, xgh xghVar, xev xevVar, int i) {
        apaa apaaVar = (apaa) wyl.d.get(Integer.valueOf(i));
        xln xlnVar = this.l;
        if (apaaVar == null) {
            apaaVar = apaa.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
        }
        xlnVar.a(apaaVar, xeoVar, xghVar, xevVar);
    }

    private final void y(xeo xeoVar, xgh xghVar, xev xevVar) {
        this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED, xeoVar, xghVar, xevVar);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((wwp) it.next()).o(xghVar, xevVar);
        }
    }

    private final void z(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xgv xgvVar = (xgv) it.next();
            if (E(xgvVar.c, xgvVar.d)) {
                C(xgvVar.c, xgvVar.d, i);
            }
        }
    }

    @Override // defpackage.wsw
    public final void a(xgh xghVar, xev xevVar) {
        y(this.a.b(xghVar), xghVar, xevVar);
    }

    @Override // defpackage.wno
    public final void b(xeo xeoVar, xgh xghVar, xev xevVar) {
        y(xeoVar, xghVar, xevVar);
    }

    @Override // defpackage.yqa
    public final void c() {
        for (xgh xghVar : this.a.e()) {
            if (this.a.q(xghVar)) {
                this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, this.a.b(xghVar), xghVar, this.a.c(xghVar));
            } else {
                this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, this.a.b(xghVar), xghVar, false);
            }
        }
    }

    @Override // defpackage.wsw
    public final void d(xgh xghVar, xev xevVar, wxd wxdVar) {
        whu.m(xghVar, xevVar, wxdVar.toString());
        s(xghVar, true);
    }

    @Override // defpackage.wsw
    public final void e(xgh xghVar, xev xevVar, int i) {
        if (!this.a.n(xghVar)) {
            whu.m(xghVar, xevVar, "Warning - got onLayoutExited() when slot was unregistered");
            return;
        }
        x(this.a.b(xghVar), xghVar, xevVar, i);
        if (!this.a.r(xghVar)) {
            whu.m(xghVar, xevVar, "Warning - got onLayoutExited() when slot was inactive");
        }
        wnm wnmVar = this.a;
        if (wnmVar.p(xghVar, xevVar)) {
            wnn a = wnmVar.a(xghVar);
            if (!a.d()) {
                wnm.v(a, "onLayoutExited");
            }
            a.o = 3;
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((wwq) it.next()).s(xghVar, xevVar, i);
        }
        if (this.a.n(xghVar) && this.a.p(xghVar, xevVar)) {
            w(xghVar, false);
        }
    }

    @Override // defpackage.wno
    public final void f(xeo xeoVar, xgh xghVar, xev xevVar, int i) {
        x(xeoVar, xghVar, xevVar, i);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((wwq) it.next()).s(xghVar, xevVar, i);
        }
    }

    @Override // defpackage.wno
    public final void g(xeo xeoVar, xgh xghVar, xev xevVar) {
        this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, xeoVar, xghVar, xevVar);
        try {
            this.a.j(xghVar, xevVar);
        } catch (wxf e) {
            whu.l(xghVar, e.toString());
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((wwr) it.next()).a(xghVar, xevVar);
        }
    }

    @Override // defpackage.wxb
    public final void h() {
        if (wbs.A(this.p)) {
            return;
        }
        for (xgh xghVar : this.a.e()) {
            if (this.a.q(xghVar)) {
                this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, this.a.b(xghVar), xghVar, this.a.c(xghVar));
            } else {
                this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, this.a.b(xghVar), xghVar, false);
            }
        }
    }

    @Override // defpackage.wxk
    public final void i(xgh xghVar) {
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, this.a.b(xghVar), xghVar, false);
        try {
            wnm wnmVar = this.a;
            wnn a = wnmVar.a(xghVar);
            if (a != null) {
                if (!a.f()) {
                    throw new wxf(wnm.d(a, "validateOnSlotEntered"));
                }
                if (a.j == null) {
                    throw new wxf("No registeredSlotAdapter onSlotEntered");
                }
                for (wnn wnnVar : wnmVar.f(xghVar).values()) {
                    if (a != wnnVar && wnnVar.c()) {
                        String a2 = wnnVar.a();
                        throw new wxf(a2.length() != 0 ? "Entered a slot when a slot of same type and physical position is already active. Its status: ".concat(a2) : new String("Entered a slot when a slot of same type and physical position is already active. Its status: "));
                    }
                }
                wnn a3 = this.a.a(xghVar);
                if (!a3.f()) {
                    wnm.v(a3, "onSlotEntered");
                }
                a3.o = 3;
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((wwu) it.next()).d(xghVar);
                }
                B(xghVar);
                return;
            }
            throw new wxf("Null slotState for onSlotEntered");
        } catch (wxf e) {
            whu.l(xghVar, e.toString());
            s(xghVar, true);
        }
    }

    @Override // defpackage.wno
    public final void j(xeo xeoVar, xgh xghVar) {
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, xeoVar, xghVar, false);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((wwu) it.next()).d(xghVar);
        }
    }

    @Override // defpackage.wxk, defpackage.wqy
    public final void k(xgh xghVar, wxf wxfVar) {
        whu.l(xghVar, wxfVar.toString());
        s(xghVar, true);
    }

    @Override // defpackage.wxk
    public final void l(xgh xghVar) {
        if (!this.a.n(xghVar)) {
            whu.l(xghVar, "Warning - got onSlotExited() when slot was unregistered");
            return;
        }
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, this.a.b(xghVar), xghVar, false);
        wnn a = this.a.a(xghVar);
        if (!a.g()) {
            wnm.v(a, "onSlotExited");
        }
        a.o = 1;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((wwv) it.next()).e(xghVar);
        }
        if (this.a.n(xghVar) && this.a.o(xghVar)) {
            s(xghVar, false);
        }
    }

    @Override // defpackage.wno
    public final void m(xeo xeoVar, xgh xghVar) {
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, xeoVar, xghVar, false);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((wwv) it.next()).e(xghVar);
        }
    }

    @Override // defpackage.wqy
    public final void n(xgh xghVar, xev xevVar) {
        if (this.a.n(xghVar)) {
            wnn a = this.a.a(xghVar);
            if (!a.b()) {
                wnm.u(a, "registerLayout");
            }
            a.p = 2;
            a.n = xevVar;
            if (xevVar == null) {
                this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_EMPTY, this.a.b(xghVar), xghVar, false);
                s(xghVar, false);
                return;
            }
            this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_NON_EMPTY, this.a.b(xghVar), xghVar, xevVar);
            this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED, this.a.b(xghVar), xghVar, xevVar);
            if (xevVar.f(xec.class)) {
                Iterator it = ((List) xevVar.e(xec.class)).iterator();
                while (it.hasNext()) {
                    this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED, this.a.b(xghVar), xghVar, (xev) it.next());
                }
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                ((www) it2.next()).j(xghVar);
            }
            if (this.a.n(xghVar)) {
                if (this.a.o(xghVar)) {
                    s(xghVar, false);
                    return;
                }
                this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_SCHEDULE_LAYOUT_REQUESTED, this.a.b(xghVar), xghVar, xevVar);
                try {
                    wnm wnmVar = this.a;
                    xev xevVar2 = wnmVar.a(xghVar).n;
                    if (xevVar2.d.isEmpty() && xevVar2.e.isEmpty() && xevVar2.f.isEmpty()) {
                        throw new wxd("Layout has no exit triggers.");
                    }
                    wnmVar.l(xevVar2.d);
                    wnmVar.l(xevVar2.e);
                    wnmVar.l(xevVar2.f);
                    wnmVar.l(xevVar2.g.keySet());
                    this.a.g(xghVar);
                    try {
                        wnm wnmVar2 = this.a;
                        wnn a2 = wnmVar2.a(xghVar);
                        wxr wxrVar = wnmVar2.f;
                        xev xevVar3 = a2.n;
                        azrw azrwVar = (azrw) wxrVar.b.get(xghVar.c());
                        if (azrwVar == null) {
                            String valueOf = String.valueOf(xghVar.c().name());
                            throw new wua(valueOf.length() != 0 ? "Could not find a matching layoutRenderingAdapterFactory for slotType: ".concat(valueOf) : new String("Could not find a matching layoutRenderingAdapterFactory for slotType: "));
                        }
                        wsx a3 = ((wub) azrwVar.get()).a((wsw) wxrVar.a.get(), xghVar, xevVar3);
                        a3.b();
                        a2.k = a3;
                        wnmVar2.j(a2.a, a2.n);
                        xev xevVar4 = a2.n;
                        wnmVar2.i(a2, xevVar4, xevVar4.d, 1);
                        wnmVar2.i(a2, xevVar4, xevVar4.e, 2);
                        wnmVar2.i(a2, xevVar4, xevVar4.f, 3);
                        this.l.a(apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, this.a.b(xghVar), xghVar, xevVar);
                        Iterator it3 = this.h.iterator();
                        while (it3.hasNext()) {
                            ((wwr) it3.next()).a(xghVar, xevVar);
                        }
                        D(xghVar, false);
                        B(xghVar);
                    } catch (wua | wxf e) {
                        whu.m(xghVar, xevVar, e.toString());
                        D(xghVar, true);
                        s(xghVar, true);
                    }
                } catch (wxd e2) {
                    whu.m(xghVar, xevVar, e2.toString());
                    s(xghVar, true);
                }
            }
        }
    }

    @Override // defpackage.wqy
    public final void o(xgh xghVar) {
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLMENT_CANCELLED, this.a.b(xghVar), xghVar, false);
        if (this.a.n(xghVar)) {
            this.a.a(xghVar).p = 4;
            s(xghVar, false);
        }
    }

    @Override // defpackage.wno
    public final void p(xeo xeoVar, xgh xghVar) {
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, xeoVar, xghVar, false);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((wwx) it.next()).f(xghVar);
        }
    }

    @Override // defpackage.wno
    public final void q(xeo xeoVar, xgh xghVar) {
        this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, xeoVar, xghVar, false);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((wwy) it.next()).i(xghVar);
        }
    }

    @Override // defpackage.wyh
    public final void r(List list) {
        SparseArray sparseArray = new SparseArray();
        Collections.sort(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xgv xgvVar = (xgv) it.next();
            if (this.a.n(xgvVar.c)) {
                if (wbs.y(this.n)) {
                    wnm wnmVar = this.a;
                    if (xgvVar.b.d() && wnmVar.a(xgvVar.c).h.contains(xgvVar)) {
                    }
                }
                if (!this.a.a(xgvVar.c).l) {
                    xgw xgwVar = (xgw) xgvVar.b.getClass().getAnnotation(xgw.class);
                    if (xgwVar == null || xgvVar.e.d(xgwVar.a())) {
                        if (wbs.y(this.n)) {
                            this.a.a(xgvVar.c).h.add(xgvVar);
                        }
                        xln xlnVar = this.l;
                        apaa apaaVar = apaa.ADS_CLIENT_EVENT_TYPE_TRIGGER_ACTIVATED;
                        xeo b = this.a.b(xgvVar.c);
                        if (xlnVar.a.d()) {
                            xlnVar.e(apaaVar, xgvVar.c, xgvVar.d, xgvVar, 0, null, null, b, false);
                        }
                        List list2 = (List) sparseArray.get(xgvVar.a);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            sparseArray.put(xgvVar.a, list2);
                        }
                        list2.add(xgvVar);
                    } else {
                        xgh xghVar = xgvVar.c;
                        xev xevVar = xgvVar.d;
                        String valueOf = String.valueOf(xgvVar.b.b().name());
                        whu.m(xghVar, xevVar, valueOf.length() != 0 ? "TriggerBundle doesn't have the required metadata specified by the trigger ".concat(valueOf) : new String("TriggerBundle doesn't have the required metadata specified by the trigger "));
                    }
                } else {
                    this.a.a(xgvVar.c).g.add(xgvVar);
                }
            }
        }
        if (sparseArray.get(0) != null) {
            A((List) sparseArray.get(0));
        }
        if (sparseArray.get(1) != null) {
            z((List) sparseArray.get(1), 0);
        }
        if (sparseArray.get(2) != null) {
            z((List) sparseArray.get(2), 2);
        }
        if (sparseArray.get(3) != null) {
            z((List) sparseArray.get(3), 3);
        }
        if (sparseArray.get(6) != null) {
            Iterator it2 = ((List) sparseArray.get(6)).iterator();
            while (it2.hasNext()) {
                s(((xgv) it2.next()).c, false);
            }
        }
        if (sparseArray.get(7) != null) {
            for (xgv xgvVar2 : (List) sparseArray.get(7)) {
                int i = this.a.a(xgvVar2.c).p;
                if (i != 1 && i != 2) {
                    this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_FULFILL_SLOT_REQUESTED, this.a.b(xgvVar2.c), xgvVar2.c, false);
                    wnn a = this.a.a(xgvVar2.c);
                    if (a.p != 0) {
                        wnm.u(a, "markFillRequested");
                    }
                    a.p = 1;
                    a.i.a();
                }
            }
        }
        if (sparseArray.get(8) != null) {
            for (xgv xgvVar3 : (List) sparseArray.get(8)) {
                if (!this.a.s(xgvVar3.c) && !this.a.r(xgvVar3.c)) {
                    this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_ENTER_SLOT_REQUESTED, this.a.b(xgvVar3.c), xgvVar3.c, false);
                    try {
                        wnm wnmVar2 = this.a;
                        xgh xghVar2 = xgvVar3.c;
                        wnn a2 = wnmVar2.a(xghVar2);
                        if (a2 != null) {
                            if (a2.j != null) {
                                if (!a2.e()) {
                                    throw new wxf(wnm.d(a2, "validateEnterSlot"));
                                }
                                for (wnn wnnVar : wnmVar2.f(xghVar2).values()) {
                                    if (a2 != wnnVar && wnnVar.c()) {
                                        int i2 = wnnVar.o;
                                        StringBuilder sb = new StringBuilder(112);
                                        sb.append("Trying to enter a slot when a slot of same type and physical position is already active. Its status: ");
                                        sb.append(i2);
                                        throw new wxf(sb.toString());
                                    }
                                }
                                wnn a3 = this.a.a(xgvVar3.c);
                                if (!a3.e()) {
                                    wnm.v(a3, "requestEnterSlot");
                                }
                                a3.o = 2;
                                a3.j.a();
                                Iterator it3 = this.d.iterator();
                                while (it3.hasNext()) {
                                    ((wwt) it3.next()).b(xgvVar3.c);
                                }
                            } else {
                                throw new wxf("Tried to enter slot with no assigned slotAdapter");
                            }
                        } else {
                            throw new wxf("Got enter request for unknown slot");
                        }
                    } catch (wxf e) {
                        whu.l(xgvVar3.c, e.toString());
                        s(xgvVar3.c, true);
                    }
                }
            }
        }
    }

    final void s(xgh xghVar, boolean z) {
        if (this.a.n(xghVar)) {
            if (this.a.a(xghVar).g() || this.a.a(xghVar).o == 5) {
                this.a.h(xghVar);
                if (!z) {
                    return;
                }
            }
            if (this.a.r(xghVar) || this.a.s(xghVar)) {
                this.a.h(xghVar);
                w(xghVar, z);
                return;
            }
            if (!this.a.a(xghVar).b()) {
                xev c = this.a.c(xghVar);
                xeo b = this.a.b(xghVar);
                this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_SLOT_REQUESTED, b, xghVar, z);
                wnm wnmVar = this.a;
                wnn a = wnmVar.a(xghVar);
                if (a != null) {
                    amru amruVar = xghVar.d;
                    int i = ((amvj) amruVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        xgx xgxVar = (xgx) amruVar.get(i2);
                        wyi wyiVar = (wyi) a.c.remove(xgxVar.c());
                        if (wyiVar != null) {
                            wyiVar.qA(xgxVar);
                        }
                    }
                    amru amruVar2 = xghVar.e;
                    int i3 = ((amvj) amruVar2).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        xgx xgxVar2 = (xgx) amruVar2.get(i4);
                        wyi wyiVar2 = (wyi) a.d.remove(xgxVar2.c());
                        if (wyiVar2 != null) {
                            wyiVar2.qA(xgxVar2);
                        }
                    }
                    amru amruVar3 = xghVar.f;
                    int i5 = ((amvj) amruVar3).c;
                    for (int i6 = 0; i6 < i5; i6++) {
                        xgx xgxVar3 = (xgx) amruVar3.get(i6);
                        wyi wyiVar3 = (wyi) a.f.remove(xgxVar3.c());
                        if (wyiVar3 != null) {
                            wyiVar3.qA(xgxVar3);
                        }
                    }
                    if (wnmVar.m(xghVar)) {
                        xev xevVar = a.n;
                        wnm.t(a, xevVar.d);
                        wnm.t(a, xevVar.e);
                        wnm.t(a, xevVar.f);
                        wnmVar.k(xevVar);
                    }
                    a.i = null;
                    a.j = null;
                    wsx wsxVar = a.k;
                    if (wsxVar != null) {
                        wsxVar.qt();
                    }
                    a.k = null;
                }
                wnm wnmVar2 = this.a;
                wnn a2 = wnmVar2.a(xghVar);
                if (a2 != null) {
                    int i7 = a2.o;
                    if (i7 != 0 && i7 != 1) {
                        wnm.v(a2, "unregisterSlot");
                    }
                    a2.o = 0;
                    wnmVar2.f(xghVar).remove(xghVar.a);
                }
                this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, b, xghVar, z);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((wwy) it.next()).i(xghVar);
                }
                if (c != null) {
                    Iterator it2 = this.i.iterator();
                    while (it2.hasNext()) {
                        ((wws) it2.next()).v(c);
                    }
                    return;
                }
                return;
            }
            this.a.h(xghVar);
            try {
                this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_CANCEL_SLOT_FULFILLMENT_REQUESTED, this.a.b(xghVar), xghVar, z);
                wnm wnmVar3 = this.a;
                wnn a3 = wnmVar3.a(xghVar);
                if (a3 != null) {
                    if (a3.i != null) {
                        wnmVar3.a(xghVar).p = 3;
                        wrd wrdVar = a3.i.d;
                        if (!wrdVar.c) {
                            whu.l(wrdVar.b, "Tried to cancel task when nothing had been initiated");
                            wrdVar.a.o(wrdVar.b);
                            return;
                        }
                        wrb wrbVar = wrdVar.d;
                        if (wrbVar != null) {
                            wrbVar.c = true;
                            wrbVar.a.cancel(true);
                            return;
                        } else {
                            whu.l(wrdVar.b, "Tried to cancel task when the task was synchronous");
                            wrdVar.a.o(wrdVar.b);
                            return;
                        }
                    }
                    throw new wxf("Couldn't cancel fill request due to null fulfillment adapter");
                }
                throw new wxf("Couldn't cancel fill request due to null slot");
            } catch (wxf e) {
                whu.l(xghVar, e.toString());
            }
        }
    }

    @Override // defpackage.wwd
    public final void t(int i, xeo xeoVar, List list) {
        wnm wnmVar;
        wnm wnmVar2;
        wnn a;
        azrw azrwVar;
        this.l.d(apaa.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_PROCESSED, i, list, xeoVar);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xgh xghVar = (xgh) it.next();
            this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED, xeoVar, xghVar, false);
            this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SCHEDULE_SLOT_REQUESTED, xeoVar, xghVar, false);
            try {
                wnmVar = this.a;
            } catch (wxf e) {
                whu.l(xghVar, e.toString());
            }
            if (xghVar != null) {
                if (TextUtils.isEmpty(xghVar.a)) {
                    throw new wxf("Slot ID was empty");
                }
                if (wnmVar.d.contains(xghVar.c())) {
                    if (!xghVar.d.isEmpty()) {
                        amru amruVar = xghVar.d;
                        int i2 = ((amvj) amruVar).c;
                        int i3 = 0;
                        while (i3 < i2) {
                            xgx xgxVar = (xgx) amruVar.get(i3);
                            i3++;
                            if (wnmVar.b.get(xgxVar.b()) == null) {
                                String valueOf = String.valueOf(xgxVar.b().name());
                                throw new wxf(valueOf.length() != 0 ? "No trigger adapter registered for entry with trigger of type: ".concat(valueOf) : new String("No trigger adapter registered for entry with trigger of type: "));
                            }
                        }
                        if (!xghVar.e.isEmpty()) {
                            amru amruVar2 = xghVar.e;
                            int i4 = ((amvj) amruVar2).c;
                            int i5 = 0;
                            while (i5 < i4) {
                                xgx xgxVar2 = (xgx) amruVar2.get(i5);
                                i5++;
                                if (wnmVar.b.get(xgxVar2.b()) == null) {
                                    String valueOf2 = String.valueOf(xgxVar2.b().name());
                                    throw new wxf(valueOf2.length() != 0 ? "No trigger adapter registered for fulfillment with trigger of type: ".concat(valueOf2) : new String("No trigger adapter registered for fulfillment with trigger of type: "));
                                }
                            }
                            if (!xghVar.f.isEmpty()) {
                                amru amruVar3 = xghVar.f;
                                int i6 = ((amvj) amruVar3).c;
                                int i7 = 0;
                                while (i7 < i6) {
                                    xgx xgxVar3 = (xgx) amruVar3.get(i7);
                                    i7++;
                                    if (wnmVar.b.get(xgxVar3.b()) == null) {
                                        String valueOf3 = String.valueOf(xgxVar3.b().name());
                                        throw new wxf(valueOf3.length() != 0 ? "No trigger adapter registered for expiration with trigger of type: ".concat(valueOf3) : new String("No trigger adapter registered for expiration with trigger of type: "));
                                    }
                                }
                                Map f = this.a.f(xghVar);
                                if (f.containsKey(xghVar.a)) {
                                    throw new wxf("Duplicate slots not supported");
                                }
                                f.put(xghVar.a, new wnn(xghVar, xeoVar));
                                this.a.g(xghVar);
                                try {
                                    wnmVar2 = this.a;
                                    a = wnmVar2.a(xghVar);
                                    amru amruVar4 = xghVar.d;
                                    int i8 = ((amvj) amruVar4).c;
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        xgx xgxVar4 = (xgx) amruVar4.get(i9);
                                        wyi wyiVar = (wyi) ((azrw) wnmVar2.b.get(xgxVar4.b())).get();
                                        wyiVar.qz(8, xgxVar4, xghVar, null);
                                        a.c.put(xgxVar4.c(), wyiVar);
                                    }
                                    amru amruVar5 = xghVar.e;
                                    int i10 = ((amvj) amruVar5).c;
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        xgx xgxVar5 = (xgx) amruVar5.get(i11);
                                        wyi wyiVar2 = (wyi) ((azrw) wnmVar2.b.get(xgxVar5.b())).get();
                                        wyiVar2.qz(7, xgxVar5, xghVar, null);
                                        a.d.put(xgxVar5.c(), wyiVar2);
                                    }
                                    amru amruVar6 = xghVar.f;
                                    int i12 = ((amvj) amruVar6).c;
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        xgx xgxVar6 = (xgx) amruVar6.get(i13);
                                        wyi wyiVar3 = (wyi) ((azrw) wnmVar2.b.get(xgxVar6.b())).get();
                                        wyiVar3.qz(6, xgxVar6, xghVar, null);
                                        a.f.put(xgxVar6.c(), wyiVar3);
                                    }
                                    azrwVar = (azrw) wnmVar2.g.a.get(xghVar.c());
                                } catch (wsf | wxf | wxp e2) {
                                    whu.l(xghVar, e2.toString());
                                    D(xghVar, true);
                                    s(xghVar, true);
                                }
                                if (azrwVar == null) {
                                    String valueOf4 = String.valueOf(xghVar.c().name());
                                    throw new wsf(valueOf4.length() != 0 ? "Could not find a matching fulfillmentAdapterFactory for slotType: ".concat(valueOf4) : new String("Could not find a matching fulfillmentAdapterFactory for slotType: "));
                                }
                                wqz a2 = ((wsg) azrwVar.get()).a(xghVar);
                                wxr wxrVar = wnmVar2.a;
                                azrw azrwVar2 = (azrw) wxrVar.b.get(xghVar.c());
                                if (azrwVar2 == null) {
                                    String valueOf5 = String.valueOf(xghVar.c().name());
                                    throw new wxp(valueOf5.length() != 0 ? "Could not find a matching slotAdapterFactory for slotType: ".concat(valueOf5) : new String("Could not find a matching slotAdapterFactory for slotType: "));
                                }
                                wxl a3 = ((wxq) azrwVar2.get()).a((wxk) wxrVar.a.get(), xghVar);
                                a.i = a2;
                                a.j = a3;
                                this.l.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, xeoVar, xghVar, false);
                                wnm wnmVar3 = this.a;
                                ((ypa) wnmVar3.c.get()).d(new xbg());
                                wnn a4 = wnmVar3.a(xghVar);
                                if (a4.o != 0) {
                                    wnm.v(a4, "onSlotScheduled");
                                }
                                a4.o = 1;
                                Iterator it2 = this.b.iterator();
                                while (it2.hasNext()) {
                                    ((wwx) it2.next()).f(xghVar);
                                }
                                D(xghVar, false);
                            } else {
                                throw new wxf("Slot expiration trigger was empty");
                            }
                        } else {
                            throw new wxf("Slot fulfillment trigger was empty");
                        }
                    } else {
                        throw new wxf("Slot entry trigger was empty");
                    }
                } else {
                    throw new wxf("Slot type not supported by this application");
                }
            } else {
                throw new wxf("Slot was null");
            }
        }
    }

    @Override // defpackage.wwd
    public final void u(int i, xeo xeoVar) {
        this.l.d(apaa.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_RECEIVED, i, null, xeoVar);
    }

    @Override // defpackage.wno
    public final void v(xev xevVar) {
        this.a.k(xevVar);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((wws) it.next()).v(xevVar);
        }
    }
}
