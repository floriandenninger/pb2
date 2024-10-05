package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dpd {
    public final List a = new ArrayList();
    public dpi b;
    public dpc c;
    public int d;

    private dpd() {
    }

    public static dpd c(dpi dpiVar, boolean z) {
        return d(0, dpiVar, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dpd d(int i, dpi dpiVar, boolean z) {
        dpd dpdVar = new dpd();
        dpdVar.d = i;
        dpdVar.b = dpiVar;
        dpdVar.c = z ? new dpc() : null;
        return dpdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dpd e(dpd dpdVar, dpd dpdVar2) {
        dpd c = c(null, false);
        int i = dpdVar != null ? dpdVar.d : 0;
        int i2 = dpdVar2 != null ? dpdVar2.d : 0;
        List list = c.a;
        dpc dpcVar = dpdVar != null ? dpdVar.c : null;
        dpc dpcVar2 = dpdVar2 != null ? dpdVar2.c : null;
        if (dpdVar != null) {
            Iterator it = dpdVar.a.iterator();
            while (it.hasNext()) {
                list.add(dpb.b((dpb) it.next()));
            }
        }
        if (dpdVar2 != null) {
            Iterator it2 = dpdVar2.a.iterator();
            while (it2.hasNext()) {
                list.add(dpb.c((dpb) it2.next(), i));
            }
        }
        c.d = i + i2;
        if (dpcVar == null) {
            dpcVar = dpcVar2;
        } else if (dpcVar2 != null) {
            dpcVar = dpcVar.a(dpcVar2);
        }
        c.c = dpcVar;
        return c;
    }

    public final int a() {
        return this.a.size();
    }

    public final dpb b(int i) {
        return (dpb) this.a.get(i);
    }

    public final void f(dpb dpbVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a.add(dpbVar);
        int i5 = dpbVar.a;
        int i6 = i5 != 1 ? i5 != 3 ? 0 : -1 : 1;
        this.d += i6;
        dpc dpcVar = this.c;
        if (dpcVar != null) {
            if (i5 != 0) {
                if (i5 == 1) {
                    i2 = 1;
                    i3 = 0;
                } else if (i5 != 2) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    i2 = 0;
                    i3 = 0;
                    i4 = 1;
                    i = 0;
                }
                i4 = 0;
                i = 0;
            } else {
                i = dpbVar.d;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            this.c = dpcVar.a(new dpc(i6, i2, i3, i4, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        for (dpb dpbVar : this.a) {
            dpbVar.e = null;
            dpbVar.f = null;
            dpbVar.g = null;
            dpbVar.h = null;
        }
        this.a.clear();
        this.c = null;
        this.d = 0;
    }
}
