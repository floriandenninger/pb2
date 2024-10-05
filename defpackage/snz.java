package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class snz extends dpi {

    @dnt(a = 6)
    List k;

    @dnt(a = 13)
    axol l;

    @dnt(a = 13)
    ayqw m;

    @dnt(a = 13)
    sxc n;

    @dnt(a = 13)
    sxk o;

    @dnt(a = 13)
    sxt p;

    public snz() {
        super("CollectionSection");
    }

    @Override // defpackage.dpi
    public final boolean d(dpi dpiVar) {
        if (this == dpiVar) {
            return true;
        }
        if (dpiVar == null || getClass() != dpiVar.getClass()) {
            return false;
        }
        snz snzVar = (snz) dpiVar;
        List list = this.k;
        if (list != null) {
            if (snzVar.k != null && list.size() == snzVar.k.size()) {
                Iterator it = this.k.iterator();
                Iterator it2 = snzVar.k.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    if (!((dha) it.next()).f((dha) it2.next())) {
                    }
                }
            }
            return false;
        }
        if (snzVar.k != null) {
            return false;
        }
        axol axolVar = this.l;
        if (axolVar == null ? snzVar.l != null : !axolVar.equals(snzVar.l)) {
            return false;
        }
        ayqw ayqwVar = this.m;
        if (ayqwVar == null ? snzVar.m != null : !ayqwVar.equals(snzVar.m)) {
            return false;
        }
        sxc sxcVar = this.n;
        if (sxcVar == null ? snzVar.n != null : !sxcVar.equals(snzVar.n)) {
            return false;
        }
        sxk sxkVar = this.o;
        if (sxkVar == null ? snzVar.o != null : !sxkVar.equals(snzVar.o)) {
            return false;
        }
        sxt sxtVar = this.p;
        return sxtVar == null ? snzVar.p == null : sxtVar.equals(snzVar.p);
    }

    @Override // defpackage.dpi, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return d((dpi) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dpk
    public final vak i(dpj dpjVar) {
        sxc sxcVar = this.n;
        sxt sxtVar = this.p;
        sxk sxkVar = this.o;
        ayqw ayqwVar = this.m;
        axol axolVar = this.l;
        List<dha> list = this.k;
        vak vakVar = new vak((int[]) null);
        if (axolVar.aJ() > 0) {
            aoam aoamVar = new aoam();
            aoam aoamVar2 = new aoam();
            int i = 0;
            while (i < axolVar.aJ()) {
                int i2 = 4;
                int b = axolVar.b(4);
                if (b != 0) {
                    aoamVar2.f(axolVar.a(axolVar.c(b) + (i * 4)), axolVar.b);
                }
                int i3 = 0;
                while (true) {
                    int b2 = aoamVar2.b(i2);
                    if (i3 < (b2 != 0 ? aoamVar2.d(b2) : 0)) {
                        int b3 = aoamVar2.b(i2);
                        if (b3 != 0) {
                            aoamVar.f(aoamVar2.a(aoamVar2.c(b3) + (i3 * 4)), aoamVar2.b);
                        }
                        int i4 = i3;
                        int i5 = i;
                        dha b4 = sxtVar.b(dpjVar, sxcVar, aoamVar, sxkVar, ayqwVar);
                        if (b4 != null) {
                            dpw j = dpx.j(dpjVar);
                            j.a(b4);
                            did.ax(j, vakVar);
                        }
                        i3 = i4 + 1;
                        i = i5;
                        i2 = 4;
                    }
                }
                i++;
            }
        } else if (list != null) {
            for (dha dhaVar : list) {
                dpw j2 = dpx.j(dpjVar);
                j2.a(dhaVar);
                did.ax(j2, vakVar);
            }
        }
        return vakVar;
    }
}
