package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wnt {
    public final Map a = new HashMap();
    public final xln b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    private final Set h;
    private final Set i;
    private final Set j;
    private final aadw k;

    public wnt(xln xlnVar, aadw aadwVar, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8) {
        this.b = xlnVar;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.h = set4;
        this.f = set5;
        this.g = set6;
        this.i = set7;
        this.j = set8;
        this.k = aadwVar;
    }

    public static String g(wns wnsVar, String str) {
        String a = wnsVar.a();
        StringBuilder sb = new StringBuilder(a.length() + 37 + str.length());
        sb.append("Slot status was ");
        sb.append(a);
        sb.append(" when calling method ");
        sb.append(str);
        return sb.toString();
    }

    public static final void m(wns wnsVar, String str) {
        whu.l(wnsVar.a, g(wnsVar, str));
    }

    public final void c() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            this.b.b(apaa.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, xeo.a, ((wns) it.next()).a, false);
        }
    }

    public final wns f(xgh xghVar) {
        return (wns) this.a.get(xghVar.a);
    }

    public final void h() {
        if (wbs.A(this.k)) {
            return;
        }
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            this.b.b(apaa.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON, xeo.a, ((wns) it.next()).a, false);
        }
    }

    public final void i(xgh xghVar, xev xevVar, xeo xeoVar, int i) {
        wns f = f(xghVar);
        if (f == null || f.c()) {
            apaa apaaVar = (apaa) wyl.d.get(Integer.valueOf(i));
            xln xlnVar = this.b;
            if (apaaVar == null) {
                apaaVar = apaa.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
            }
            xlnVar.a(apaaVar, xeoVar, xghVar, xevVar);
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((wwq) it.next()).s(xghVar, xevVar, i);
            }
            try {
                k(xghVar, xevVar, "onLayoutExitedExternallyManaged");
                f.c = 3;
            } catch (wxf e) {
                whu.l(xghVar, e.toString());
            }
        }
    }

    public final void j(xgh xghVar, xeo xeoVar) {
        wns f = f(xghVar);
        if (f == null) {
            whu.l(xghVar, "Warning - got onSlotExitedExternallyManaged() when slot was unregistered");
        } else if (f.b()) {
            xev xevVar = f.b;
            if (xevVar != null && f.c()) {
                i(xghVar, xevVar, xeoVar, 4);
            }
            f.c = 1;
        }
        this.b.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED, xeoVar, xghVar, false);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((wwv) it.next()).e(xghVar);
        }
    }

    public final void k(xgh xghVar, xev xevVar, String str) {
        wns f = f(xghVar);
        if (f != null) {
            xev xevVar2 = f.b;
            if (xevVar2 != null) {
                if (xevVar.a.equals(xevVar2.a)) {
                    return;
                }
                StringBuilder sb = new StringBuilder(str.length() + 64);
                sb.append("Got ");
                sb.append(str);
                sb.append(" when layout is different from registered layout on the slot");
                throw new wxf(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 33);
            sb2.append("Got ");
            sb2.append(str);
            sb2.append(" when layout was unregistered");
            throw new wxf(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 31);
        sb3.append("Got ");
        sb3.append(str);
        sb3.append(" when slot was unregistered");
        throw new wxf(sb3.toString());
    }

    public final void l(xgh xghVar, xev xevVar) {
        wns f = f(xghVar);
        if (f == null || f.b != null) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((wws) it.next()).v(xevVar);
            }
            try {
                k(xghVar, xevVar, "onLayoutUnscheduledExternallyManaged");
                f.b = null;
            } catch (wxf e) {
                whu.l(xghVar, e.toString());
            }
        }
    }
}
