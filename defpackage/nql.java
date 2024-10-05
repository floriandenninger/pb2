package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nql implements zch {
    public FrameLayout a;
    public FrameLayout b;
    public View c;
    public zcg d;
    public zcg e;
    public zcg f;
    public zcg g;
    public zcg h;
    public nry i;
    public int j;
    public final Set k = new HashSet();
    public final azqv l = azqv.aq(false);
    public yzr m;
    public yzr n;
    public yzr o;
    public yzr p;

    public static float b(View view, float f) {
        return jw.e(view) == 1 ? -f : f;
    }

    private final void l(boolean z) {
        whu.I(this.c, !z);
    }

    private final void m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.m.l(this.h);
            this.n.l(this.h);
        } else if (i2 != 1) {
            this.m.l(this.d);
            this.n.l(this.e);
        } else {
            this.m.l(this.g);
            this.n.l(this.g);
            this.b.setTranslationZ(this.j);
        }
    }

    public final void c() {
        if (this.n.e()) {
            g(false);
        } else {
            d(false);
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.o.b(false);
            this.m.c(false);
            this.n.j(this);
            this.n.c(false);
            this.n.h(this);
        }
        this.o.c(z);
        this.p.c(false);
        this.m.b(z);
        this.n.b(z);
    }

    public final void e(nqg nqgVar) {
        ((FrameLayout) this.n.b).removeAllViews();
        if (nqgVar != null) {
            nrz.a((ViewGroup) this.m.b, nqgVar.b(), this.i);
            nrz.b((ViewGroup) this.n.b, nqgVar.oO());
        }
    }

    public final void f(nqg nqgVar) {
        ((FrameLayout) this.p.b).removeAllViews();
        if (nqgVar != null) {
            nrz.a((ViewGroup) this.o.b, nqgVar.b(), this.i);
            nrz.b((ViewGroup) this.p.b, nqgVar.oO());
        }
    }

    public final void g(boolean z) {
        if (z) {
            this.o.c(false);
            this.p.c(false);
            this.m.b(false);
            this.n.j(this);
            this.n.b(false);
            this.n.h(this);
        }
        this.o.b(z);
        this.m.c(z);
        this.n.c(z);
    }

    public final void h(nrb nrbVar) {
        if (((FrameLayout) this.p.b).indexOfChild(nrbVar.b.oO()) >= 0) {
            i();
        } else if (((FrameLayout) this.n.b).indexOfChild(nrbVar.b.oO()) < 0) {
            e(nrbVar.b);
        }
        g(false);
    }

    public final void i() {
        this.a.bringChildToFront(this.o.b);
        this.b.bringChildToFront(this.p.b);
        yzr yzrVar = this.m;
        yzr yzrVar2 = this.o;
        this.m = yzrVar2;
        this.o = yzrVar;
        yzr yzrVar3 = this.n;
        this.n = this.p;
        this.p = yzrVar3;
        yzrVar2.l(this.d);
        this.o.l(this.f);
        this.p.j(this);
        this.n.h(this);
    }

    public final void j(nrb nrbVar, nrb nrbVar2, int i) {
        if (((FrameLayout) this.p.b).indexOfChild(nrbVar.b.oO()) >= 0) {
            i();
        } else if (((FrameLayout) this.n.b).indexOfChild(nrbVar.b.oO()) < 0) {
            e(nrbVar.b);
        }
        if (((FrameLayout) this.p.b).indexOfChild(nrbVar2.b.oO()) < 0) {
            f(nrbVar2.b);
        }
        m(i);
        d(true);
    }

    public final void k(nrb nrbVar, nrb nrbVar2, int i) {
        if (((FrameLayout) this.n.b).indexOfChild(nrbVar.b.oO()) >= 0) {
            i();
        } else if (((FrameLayout) this.p.b).indexOfChild(nrbVar.b.oO()) < 0) {
            f(nrbVar.b);
        }
        e(nrbVar2.b);
        m(i);
        g(true);
    }

    @Override // defpackage.zch
    public final void nE(int i, yzr yzrVar) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((zch) it.next()).nE(i, yzrVar);
        }
        if (i != 0) {
            if (i == 2) {
                this.p.b(false);
            } else {
                this.l.c(true);
                l(false);
                return;
            }
        }
        this.b.setTranslationZ(0.0f);
        this.l.c(false);
        l(true);
    }
}
