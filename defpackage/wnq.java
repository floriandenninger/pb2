package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnq extends wnt implements wou, wxb, wnr, yqa {
    private final yqi h;

    public wnq(xln xlnVar, whu whuVar, aadw aadwVar, Context context, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8, byte[] bArr, byte[] bArr2) {
        super(xlnVar, aadwVar, set, set2, set3, set4, set5, set6, set7, set8);
        yqi yqiVar = new yqi();
        this.h = yqiVar;
        if (wbs.A(aadwVar)) {
            yqiVar.a(yjj.m(context));
            yqiVar.c(this);
        }
    }

    private static xev n(aowz aowzVar) {
        apba apbaVar = aowzVar.d;
        if (apbaVar == null) {
            apbaVar = apba.a;
        }
        apaz apazVar = apbaVar.d;
        if (apazVar == null) {
            apazVar = apaz.a;
        }
        String str = apazVar.c;
        apac b = apac.b(apbaVar.c);
        if (b == null) {
            b = apac.LAYOUT_TYPE_UNSPECIFIED;
        }
        return xev.c(str, b, 3, ammv.i(aowzVar), xcp.b(new xcy[0]));
    }

    private static xgh o(aoyn aoynVar) {
        apbj apbjVar = aoynVar.d;
        if (apbjVar == null) {
            apbjVar = apbj.a;
        }
        apbi apbiVar = apbjVar.f;
        if (apbiVar == null) {
            apbiVar = apbi.a;
        }
        String str = apbiVar.c;
        apae b = apae.b(apbjVar.c);
        if (b == null) {
            b = apae.SLOT_TYPE_UNSPECIFIED;
        }
        return xgh.i(str, b, apbjVar.e, xcp.b(new xcy[0]));
    }

    @Override // defpackage.wnr
    public final void e(xgh xghVar, boolean z) {
        if (xghVar.c() == apae.SLOT_TYPE_IN_FEED || xghVar.c() == apae.SLOT_TYPE_ABOVE_FEED) {
            if (z) {
                for (wns wnsVar : this.a.values()) {
                    if (wnsVar.b()) {
                        xgh xghVar2 = wnsVar.a;
                        xev xevVar = wnsVar.b;
                        if (wnsVar.c()) {
                            i(xghVar2, xevVar, xeo.a, 0);
                            l(xghVar2, xevVar);
                        }
                        j(xghVar2, xeo.a);
                    }
                }
            }
            this.b.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED, xeo.a, xghVar, false);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((wwx) it.next()).f(xghVar);
            }
            try {
                if (xghVar != null) {
                    if (TextUtils.isEmpty(xghVar.a)) {
                        throw new wxf("Slot ID was empty");
                    }
                    if (!this.a.containsKey(xghVar.a)) {
                        this.a.put(xghVar.a, new wns(xghVar));
                        wns f = f(xghVar);
                        if (f.c != 0) {
                            wnt.m(f, "onSlotExternallyManaged");
                        }
                        f.c = 1;
                        return;
                    }
                    throw new wxf("Duplicate slots not supported");
                }
                throw new wxf("Slot was null");
            } catch (wxf e) {
                whu.l(xghVar, e.toString());
            }
        }
    }

    @Override // defpackage.wou
    public final void a(aoyn aoynVar, aowz aowzVar) {
        if ((aoynVar.b & 2) == 0) {
            whu.l(null, "Invalid Slot input for SectionListExternallyManagedSlotAdapter#onDataBinded().");
            return;
        }
        xgh o = o(aoynVar);
        this.b.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED, xeo.a, o, false);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((wwu) it.next()).d(o);
        }
        wns f = f(o);
        if (f != null) {
            try {
                wns f2 = f(o);
                if (f2.c == 1) {
                    for (wns wnsVar : this.a.values()) {
                        if (f2 != wnsVar && f2.a.a() == wnsVar.a.a() && f2.a.c() == wnsVar.a.c() && wnsVar.b()) {
                            String a = wnsVar.a();
                            throw new wxf(a.length() != 0 ? "Entered a slot when a slot of same type and physical position is already active. Its status: ".concat(a) : new String("Entered a slot when a slot of same type and physical position is already active. Its status: "));
                        }
                    }
                    f.c = 3;
                } else {
                    throw new wxf(wnt.g(f2, "validateOnSlotEnteredExternallyManaged"));
                }
            } catch (wxf e) {
                whu.l(o, e.toString());
            }
        } else {
            whu.l(o, "Warning - got onSlotEnteredExternallyManaged() when slot was unregistered");
        }
        if ((aowzVar.b & 2) == 0) {
            whu.l(o, "Invalid Layout input for SectionListExternallyManagedSlotAdapter#onDataBinded().");
            return;
        }
        xev n = n(aowzVar);
        this.b.a(apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED, xeo.a, o, n);
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((wwr) it2.next()).a(o, n);
        }
        wns f3 = f(o);
        if (f3 == null) {
            whu.l(o, "Warning - got onLayoutScheduledExternallyManaged() when slot was unregistered");
        } else {
            try {
                if (f3.b == null) {
                    f3.b = n;
                } else {
                    throw new wxf("Multiple layouts on a Slot not supported");
                }
            } catch (wxf e2) {
                whu.m(o, n, e2.toString());
            }
        }
        this.b.a(apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED, xeo.a, o, n);
        Iterator it3 = this.g.iterator();
        while (it3.hasNext()) {
            ((wwp) it3.next()).o(o, n);
        }
        try {
            super.k(o, n, "onLayoutEnteredExternallyManaged");
            wns f4 = f(o);
            if (f4.c != 3) {
                wnt.m(f4, "onLayoutEnteredExternallyManaged");
            }
            f4.c = 4;
        } catch (wxf e3) {
            whu.l(o, e3.toString());
        }
    }

    @Override // defpackage.wou
    public final void b(aoyn aoynVar, aowz aowzVar) {
        int i = aoynVar.b & 2;
        if (i == 0 && (aowzVar.b & 2) == 0) {
            whu.l(null, "Invalid input for SectionListExternallyManagedSlotAdapter#onDataDisposed().");
            return;
        }
        if (i == 0) {
            whu.l(null, "Missing slot data for Section list item.");
            return;
        }
        xgh o = o(aoynVar);
        wns wnsVar = (wns) this.a.get(o.a);
        if (wnsVar == null || !wnsVar.b()) {
            return;
        }
        if ((aowzVar.b & 2) == 0) {
            whu.l(o, "Missing layout data for Section list item.");
        } else {
            xev n = n(aowzVar);
            i(o, n, xeo.a, 0);
            l(o, n);
        }
        j(o, xeo.a);
    }

    @Override // defpackage.wou
    public final void d(aoyn aoynVar) {
        if ((aoynVar.b & 2) == 0) {
            whu.l(null, "Invalid Slot input for SectionListExternallyManagedSlotAdapter#onDataClear().");
            return;
        }
        xgh o = o(aoynVar);
        xeo xeoVar = xeo.a;
        wns f = f(o);
        if (f == null) {
            whu.l(o, "Warning - got onSlotUnscheduledExternallyManaged() when slot was unregistered");
        } else {
            if (f.b()) {
                j(o, xeoVar);
            }
            int i = f.c;
            if (i != 0 && i != 1) {
                wnt.m(f, "onSlotUnscheduledExternallyManaged");
            }
            f.c = 0;
            this.a.remove(o.a);
        }
        this.b.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED, xeoVar, o, false);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((wwy) it.next()).i(o);
        }
    }
}
