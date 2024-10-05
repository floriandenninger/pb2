package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnm {
    public final wxr a;
    public final Map b;
    public final azrw c;
    public final amsx d;
    final Map e = new HashMap();
    public final wxr f;
    public final ywt g;

    public wnm(wxr wxrVar, wxr wxrVar2, ywt ywtVar, Map map, azrw azrwVar, amsx amsxVar, byte[] bArr, byte[] bArr2) {
        this.a = wxrVar;
        this.f = wxrVar2;
        this.g = ywtVar;
        this.b = map;
        this.c = azrwVar;
        this.d = amsxVar;
    }

    public static String d(wnn wnnVar, String str) {
        String a = wnnVar.a();
        StringBuilder sb = new StringBuilder(a.length() + 37 + str.length());
        sb.append("Slot status was ");
        sb.append(a);
        sb.append(" when calling method ");
        sb.append(str);
        return sb.toString();
    }

    public static final void t(wnn wnnVar, List list) {
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            xgx xgxVar = (xgx) it.next();
            wyi wyiVar = (wyi) wnnVar.e.remove(xgxVar.c());
            if (wyiVar != null) {
                wyiVar.qA(xgxVar);
            }
        }
    }

    public static final void u(wnn wnnVar, String str) {
        String str2;
        xgh xghVar = wnnVar.a;
        int i = wnnVar.p;
        if (i == 0) {
            str2 = "FILL_NOT_REQUESTED";
        } else if (i == 1) {
            str2 = "FILL_REQUESTED";
        } else if (i == 2) {
            str2 = "FILLED";
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            str2 = "FILL_CANCELED";
        }
        StringBuilder sb = new StringBuilder(str2.length() + 44 + str.length());
        sb.append("Fulfillment status was ");
        sb.append(str2);
        sb.append(" when calling method ");
        sb.append(str);
        whu.l(xghVar, sb.toString());
    }

    public static final void v(wnn wnnVar, String str) {
        whu.l(wnnVar.a, d(wnnVar, str));
    }

    public final wnn a(xgh xghVar) {
        return (wnn) f(xghVar).get(xghVar.a);
    }

    public final xeo b(xgh xghVar) {
        wnn a = a(xghVar);
        if (a != null) {
            return a.b;
        }
        return null;
    }

    public final xev c(xgh xghVar) {
        wnn a = a(xghVar);
        if (a == null) {
            return null;
        }
        return a.n;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                arrayList.add(((wnn) it2.next()).a);
            }
        }
        return arrayList;
    }

    public final Map f(xgh xghVar) {
        ammw ammwVar = xghVar.b;
        if (this.d.contains(xghVar.c()) && !this.e.containsKey(ammwVar)) {
            this.e.put(ammwVar, new HashMap());
        }
        return (Map) this.e.get(ammwVar);
    }

    public final void g(xgh xghVar) {
        a(xghVar).l = true;
    }

    public final void h(xgh xghVar) {
        a(xghVar).m = true;
    }

    public final void i(wnn wnnVar, xev xevVar, List list, int i) {
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            xgx xgxVar = (xgx) it.next();
            wyi wyiVar = (wyi) ((azrw) this.b.get(xgxVar.b())).get();
            wyiVar.qz(i, xgxVar, wnnVar.a, xevVar);
            wnnVar.e.put(xgxVar.c(), wyiVar);
        }
    }

    public final void j(xgh xghVar, xev xevVar) {
        amxd listIterator = xevVar.g.keySet().listIterator();
        while (listIterator.hasNext()) {
            xgx xgxVar = (xgx) listIterator.next();
            ((wyi) ((azrw) this.b.get(xgxVar.b())).get()).qz(0, xgxVar, xghVar, xevVar);
        }
    }

    public final void k(xev xevVar) {
        amxd listIterator = xevVar.g.keySet().listIterator();
        while (listIterator.hasNext()) {
            xgx xgxVar = (xgx) listIterator.next();
            ((wyi) ((azrw) this.b.get(xgxVar.b())).get()).qA(xgxVar);
        }
    }

    public final void l(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xgx xgxVar = (xgx) it.next();
            if (this.b.get(xgxVar.b()) == null) {
                String valueOf = String.valueOf(xgxVar.b().name());
                throw new wxd(valueOf.length() != 0 ? "No trigger adapter registered for layout with trigger of type: ".concat(valueOf) : new String("No trigger adapter registered for layout with trigger of type: "));
            }
        }
    }

    public final boolean m(xgh xghVar) {
        wnn a = a(xghVar);
        return (a == null || a.n == null || a.k == null) ? false : true;
    }

    public final boolean n(xgh xghVar) {
        return f(xghVar).containsKey(xghVar.a);
    }

    public final boolean o(xgh xghVar) {
        return a(xghVar).m;
    }

    public final boolean p(xgh xghVar, xev xevVar) {
        xev xevVar2;
        wnn a = a(xghVar);
        if (a == null || (xevVar2 = a.n) == null) {
            return false;
        }
        return TextUtils.equals(xevVar2.a, xevVar.a);
    }

    public final boolean q(xgh xghVar) {
        wnn a = a(xghVar);
        return a != null && a.d();
    }

    public final boolean r(xgh xghVar) {
        wnn a = a(xghVar);
        if (a == null) {
            return false;
        }
        int i = a.o;
        return i == 3 || i == 4 || i == 5 || i == 6;
    }

    public final boolean s(xgh xghVar) {
        wnn a = a(xghVar);
        return a != null && a.f();
    }
}
