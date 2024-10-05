package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gjr {
    public final aivb a;
    public final ool c;
    public final aeb b = new aeb();
    private final ArrayList d = new ArrayList();

    public gjr(ool oolVar, aivb aivbVar) {
        this.c = oolVar;
        this.a = aivbVar;
    }

    private final int h(zcp zcpVar) {
        return (this.c.a || (zcpVar instanceof zcs)) ? 0 : 1;
    }

    private final void i() {
        int i = 0;
        while (true) {
            aeb aebVar = this.b;
            if (i >= aebVar.b) {
                return;
            }
            ((gjs) aebVar.b(i)).c();
            i++;
        }
    }

    final int a() {
        if (this.d.isEmpty()) {
            return 0;
        }
        int i = ((anjr) this.d.get(r0.size() - 1)).b;
        if (i == 1) {
            return 1;
        }
        return i == 2 ? 2 : 0;
    }

    public final int b(fhg fhgVar, int i, zcp zcpVar) {
        amkq.E(etx.u(fhgVar));
        if (fhgVar.g()) {
            return 5;
        }
        int i2 = 1;
        if (fhgVar.b()) {
            if (this.c.a || this.a.b) {
                i2 = 0;
            } else if (!etx.t(i) || !this.a.d()) {
                i2 = 2;
            }
            return etx.v(i2, g(i2, zcpVar));
        }
        if (fhgVar.i()) {
            return etx.v(h(zcpVar), false);
        }
        return etx.v(a(), true);
    }

    public final Object c(int i) {
        int a = a();
        anjr anjrVar = new anjr(i);
        this.d.add(anjrVar);
        if (a != i) {
            i();
        }
        return anjrVar.a;
    }

    public final void d(Object obj) {
        if (this.d.isEmpty()) {
            return;
        }
        int a = a();
        ArrayList arrayList = this.d;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            } else if (((anjr) listIterator.previous()).a.equals(obj)) {
                listIterator.remove();
                break;
            }
        }
        if (a() == a) {
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(int i, zcp zcpVar) {
        int h = h(zcpVar);
        return h == i || h == 0 || i == 0;
    }

    public final boolean f(int i) {
        boolean t = etx.t(i);
        return (t || etx.s(i)) && t == this.a.d();
    }

    public final boolean g(int i, zcp zcpVar) {
        return !this.c.a && !this.a.b && i == h(zcpVar) && f(i);
    }
}
