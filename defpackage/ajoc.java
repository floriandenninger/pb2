package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajoc extends ajmx {
    public final List a = new ArrayList();

    private final void u(int i, ajng ajngVar, boolean z) {
        yjk.f();
        ajob ajobVar = new ajob(this, ajngVar);
        ajobVar.a.lX(ajobVar);
        this.a.add(i, ajobVar);
        s();
        if (!z || ajobVar.a.isEmpty()) {
            return;
        }
        y(ajobVar.b, ajobVar.a.a());
    }

    @Override // defpackage.ajng
    public final int a() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return ((ajob) this.a.get(r0.size() - 1)).g();
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        ajob l = l(i);
        if (l == null) {
            return 0L;
        }
        return l.a.b(l.f(i));
    }

    @Override // defpackage.ajng
    public final Object c(int i) {
        ajob l = l(i);
        if (l == null) {
            return null;
        }
        return l.a.c(l.f(i));
    }

    @Override // defpackage.ajng
    public final boolean contains(Object obj) {
        throw null;
    }

    public final int h() {
        return this.a.size();
    }

    public final int i(ajng ajngVar) {
        if (ajngVar == null || this.a.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (((ajob) this.a.get(i)).a == ajngVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ajng
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(ajng ajngVar) {
        for (ajob ajobVar : this.a) {
            if (ajobVar.a == ajngVar) {
                return ajobVar.b;
            }
        }
        return -1;
    }

    public final ajob k(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (ajob) this.a.get(i);
    }

    public final ajob l(int i) {
        if (i >= 0 && i < a()) {
            int size = this.a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >> 1;
                ajob ajobVar = (ajob) this.a.get(i3);
                if (i < ajobVar.b) {
                    size = i3 - 1;
                } else {
                    if (i < ajobVar.g()) {
                        return ajobVar;
                    }
                    i2 = i3 + 1;
                }
            }
        }
        return null;
    }

    public final void m(ajng ajngVar) {
        n(-1, ajngVar);
    }

    @Override // defpackage.ajmx, defpackage.ajng
    public final void mL(ajok ajokVar, int i) {
        super.mL(ajokVar, i);
        ajob l = l(i);
        if (l != null) {
            l.a.mL(ajokVar, l.f(i));
        }
    }

    public final void n(int i, ajng ajngVar) {
        if (i == -1) {
            i = this.a.size();
        }
        u(i, ajngVar, true);
    }

    public final void o(ajng ajngVar) {
        n(0, ajngVar);
    }

    public final void p(int i) {
        yjk.f();
        ajob ajobVar = (ajob) this.a.get(i);
        ajobVar.a.pf(ajobVar);
        this.a.remove(i);
    }

    public final void q(ajng ajngVar) {
        ajob ajobVar;
        yjk.f();
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                ajobVar = (ajob) this.a.get(size);
            }
        } while (ajobVar.a != ajngVar);
        p(size);
        s();
        if (ajobVar.a.isEmpty()) {
            return;
        }
        z(ajobVar.b, ajobVar.a.a());
    }

    public final void r(ajng ajngVar, ajng ajngVar2) {
        yjk.f();
        for (int i = 0; i < this.a.size(); i++) {
            ajob ajobVar = (ajob) this.a.get(i);
            if (ajobVar.a == ajngVar) {
                p(i);
                u(i, ajngVar2, false);
                s();
                if (!ajobVar.a.isEmpty()) {
                    ajob ajobVar2 = (ajob) this.a.get(i);
                    int a = ajobVar2.a.a();
                    int a2 = ajobVar.a.a();
                    x(ajobVar.b, Math.min(a2, a));
                    if (a > a2) {
                        y(ajobVar.b + a2, a - a2);
                        return;
                    } else {
                        if (a2 > a) {
                            z(ajobVar2.b + a, a2 - a);
                            return;
                        }
                        return;
                    }
                }
                int a3 = ((ajob) this.a.get(i)).a.a();
                if (a3 > 0) {
                    y(ajobVar.b, a3);
                    return;
                }
                return;
            }
        }
    }

    public final void s() {
        int i = 0;
        for (ajob ajobVar : this.a) {
            ajobVar.b = i;
            i = ajobVar.g();
        }
    }

    public final void t() {
        yjk.f();
        if (this.a.isEmpty()) {
            return;
        }
        int a = a();
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                p(size);
            }
        }
        if (a > 0) {
            z(0, a);
        }
    }
}
