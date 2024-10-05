package defpackage;

import android.view.View;
import j$.util.function.Function;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmq implements gaa, zfk, afzo {
    public final List a = new ArrayList();
    public final afzp b;
    private final akbu c;
    private final ajut d;
    private final acra e;
    private final String f;
    private gab g;
    private final aoae h;

    public nmq(akbu akbuVar, ajut ajutVar, afzp afzpVar, aoae aoaeVar, acra acraVar, String str, byte[] bArr) {
        this.c = akbuVar;
        this.d = ajutVar;
        this.b = afzpVar;
        this.h = aoaeVar;
        this.e = acraVar;
        this.f = str;
    }

    private final CharSequence p(String str, boolean z) {
        if (z) {
            try {
                return String.format(this.f, str);
            } catch (IllegalFormatException e) {
                zga.d("Tab's description cannot be generated due to a formatting error.", e);
            }
        }
        return str;
    }

    public final int a() {
        gab gabVar = this.g;
        if (gabVar == null) {
            return -1;
        }
        return gabVar.a();
    }

    @Override // defpackage.gaa
    public final void b(int i, boolean z) {
        if (i >= this.a.size() || i < 0) {
            return;
        }
        nmp nmpVar = (nmp) this.a.get(i);
        nmpVar.c.c();
        lxu lxuVar = nmpVar.d;
        if (lxuVar != null) {
            lxuVar.o();
        }
        this.b.d(nmpVar.a.c);
        if (z) {
            return;
        }
        aveh avehVar = nmpVar.a;
        if ((avehVar.b & 524288) != 0) {
            this.e.I(3, new acqx(avehVar.n.I()), null);
        }
    }

    @Override // defpackage.gaa
    public final void e(float f) {
    }

    public final ajwi f() {
        return (ajwi) h(mjq.o);
    }

    public final aveh g() {
        return (aveh) h(mjq.n);
    }

    public final Object h(Function function) {
        int a = a();
        if (a < 0 || a >= this.a.size()) {
            return null;
        }
        return function.apply(this.a.get(a));
    }

    public final List i() {
        return amru.o(this.a);
    }

    @Override // defpackage.zfk
    public final void j() {
        k();
        gab gabVar = this.g;
        if (gabVar != null) {
            gabVar.g(this);
        }
    }

    public final void k() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nmp) it.next()).c.j();
        }
        this.a.clear();
        gab gabVar = this.g;
        if (gabVar != null) {
            gabVar.f();
        }
    }

    @Override // defpackage.afzo
    public final void l(String str) {
    }

    public final void m(gab gabVar, List list, int i) {
        View c;
        this.g = gabVar;
        gabVar.e(this);
        this.a.clear();
        this.a.addAll(list);
        for (nmp nmpVar : this.a) {
            fxv fxvVar = new fxv(nmpVar.c.K);
            fzy fzyVar = new fzy();
            fzyVar.a = nmpVar.b;
            fzyVar.b(fxvVar);
            aveh avehVar = nmpVar.a;
            avei aveiVar = avehVar.h;
            if (aveiVar == null) {
                aveiVar = avei.a;
            }
            int aN = aobq.aN(aveiVar.b);
            boolean z = true;
            if ((aN == 0 || aN != 2) && !this.b.g(avehVar.c)) {
                z = false;
            }
            if ((avehVar.b & 32) != 0) {
                ajut ajutVar = this.d;
                arfs arfsVar = avehVar.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                c = this.g.b(ajutVar.a(b), z, p(avehVar.e, z), fzyVar.a());
            } else {
                gab gabVar2 = this.g;
                String str = avehVar.e;
                c = gabVar2.c(str, str, z, fzyVar.a());
            }
            this.h.c(avehVar, c);
            aveg avegVar = avehVar.m;
            if (avegVar == null) {
                avegVar = aveg.a;
            }
            if ((avegVar.b & 2) != 0) {
                akbu akbuVar = this.c;
                aveg avegVar2 = avehVar.m;
                if (avegVar2 == null) {
                    avegVar2 = aveg.a;
                }
                arej arejVar = avegVar2.c;
                if (arejVar == null) {
                    arejVar = arej.a;
                }
                akbuVar.b(arejVar, c, avehVar, this.e);
            }
            if ((avehVar.b & 524288) != 0) {
                this.e.u(new acqx(avehVar.n.I()), null);
            }
        }
        if (i != -1) {
            gabVar.k(i);
        }
    }

    public final void n() {
        this.b.c(this, -1L);
        ajwi f = f();
        if (f == null) {
            return;
        }
        f.c();
        f.J();
    }

    @Override // defpackage.afzo
    public final void o(String str, boolean z, int i) {
        int a = a();
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            nmp nmpVar = (nmp) this.a.get(i2);
            if (str.equals(nmpVar.a.c)) {
                if (str.equals("FEnotifications_inbox") && i > 0) {
                    nmpVar.c.l();
                }
                if (i2 != a) {
                    if (z) {
                        whu.O(this.g.d(i2), true, 0, null);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.gaa
    public final boolean oW(int i) {
        if (i < 0 || i >= this.a.size()) {
            return true;
        }
        ((nmp) this.a.get(i)).c.E();
        return true;
    }

    @Override // defpackage.gaa
    public final void ov(int i) {
        ajvz f = f();
        if (f instanceof gaa) {
            ((gaa) f).ov(i);
        }
    }
}
