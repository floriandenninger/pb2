package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dqx {
    private static final AtomicInteger c = new AtomicInteger(1);
    public final int a;
    public dte b;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private final dkf k;
    private boolean l;
    private boolean m;
    private int n;
    private ComponentTree o;
    private dlr p;
    private int q;
    private int r;
    private dsf s;
    private final dsf t;

    public dqx(dqw dqwVar) {
        new AtomicInteger(0);
        this.l = true;
        this.m = false;
        this.q = -1;
        this.r = -1;
        this.b = dqwVar.a;
        this.k = dqwVar.b;
        this.t = dqwVar.i;
        this.d = dqwVar.d;
        this.a = c.getAndIncrement();
        this.g = dqwVar.c;
        this.h = dqwVar.h;
        this.i = dqwVar.e;
        this.e = dqwVar.f;
        this.f = dqwVar.g;
    }

    public static dqw c() {
        return new dqw();
    }

    private final void u(dhe dheVar) {
        if (this.o == null) {
            dho c2 = ComponentTree.c(dheVar, this.b.b());
            Object e = this.b.e("is_reconciliation_enabled");
            Object e2 = this.b.e("layout_diffing_enabled");
            if (e != null) {
                c2.k = ((Boolean) e).booleanValue();
            } else {
                c2.k = this.e;
            }
            if (e2 != null) {
                c2.f = ((Boolean) e2).booleanValue();
            } else {
                c2.f = this.f;
            }
            c2.g = this.k;
            c2.h = this.p;
            dsf dsfVar = this.t;
            c2.j = dsfVar == null ? null : new dse(dsfVar.a, this);
            c2.i = this.m;
            c2.d = this.g;
            c2.b = this.h;
            c2.e = this.i;
            c2.l = this.d;
            this.b.l();
            this.b.m();
            ComponentTree a = c2.a();
            this.o = a;
            dsf dsfVar2 = this.s;
            if (dsfVar2 != null) {
                a.A = dsfVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a() {
        return this.n;
    }

    public final synchronized ComponentTree b() {
        return this.o;
    }

    public final synchronized dte d() {
        return this.b;
    }

    public final synchronized void e() {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            this.p = componentTree.d();
        }
        ComponentTree componentTree2 = this.o;
        if (componentTree2 != null) {
            this.m = componentTree2.p;
        }
        k();
    }

    public final synchronized void f(dhs dhsVar) {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            synchronized (componentTree) {
                List list = componentTree.e;
                if (list != null) {
                    list.remove(dhsVar);
                }
            }
        }
    }

    public final void g(dhe dheVar, int i, int i2) {
        h(dheVar, i, i2, null);
    }

    public final void h(dhe dheVar, int i, int i2, dhs dhsVar) {
        synchronized (this) {
            if (this.b.k()) {
                return;
            }
            this.q = i;
            this.r = i2;
            u(dheVar);
            ComponentTree componentTree = this.o;
            dha b = this.b.b();
            dte dteVar = this.b;
            amsj amsjVar = dteVar instanceof duc ? ((duc) dteVar).a : null;
            if (dhsVar != null) {
                componentTree.g(dhsVar);
            }
            if (b == null) {
                throw new IllegalArgumentException("Root component can't be null");
            }
            componentTree.x(b, i, i2, true, null, 1, amsjVar);
            synchronized (this) {
                if (this.o == componentTree && b == this.b.b()) {
                    this.j = true;
                }
            }
        }
    }

    public final void i(dhe dheVar, int i, int i2, dlo dloVar) {
        synchronized (this) {
            if (this.b.k()) {
                return;
            }
            this.q = i;
            this.r = i2;
            u(dheVar);
            ComponentTree componentTree = this.o;
            dha b = this.b.b();
            dte dteVar = this.b;
            amsj amsjVar = dteVar instanceof duc ? ((duc) dteVar).a : null;
            if (b == null) {
                throw new IllegalArgumentException("Root component can't be null");
            }
            componentTree.x(b, i, i2, false, dloVar, 0, amsjVar);
            synchronized (this) {
                if (componentTree == this.o && b == this.b.b()) {
                    this.j = true;
                    if (dloVar != null) {
                        this.n = dloVar.b;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j() {
        this.j = false;
    }

    public final synchronized void k() {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            componentTree.o();
            this.o = null;
            this.b.f();
        }
        this.j = false;
    }

    public final synchronized void l(boolean z) {
        this.l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void m(int i) {
        this.n = i;
    }

    public final synchronized void n(dte dteVar) {
        j();
        this.b = dteVar;
    }

    public final synchronized boolean o() {
        boolean z = false;
        if (!this.b.k()) {
            ComponentTree componentTree = this.o;
            if (componentTree != null) {
                if (!componentTree.r(this.q, this.r)) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    public final synchronized boolean p() {
        return this.l;
    }

    public final synchronized boolean q() {
        return this.j;
    }

    public final synchronized boolean r(int i, int i2) {
        boolean z;
        if (q() && this.q == i) {
            z = this.r == i2;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void s(dsf dsfVar) {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            componentTree.A = dsfVar;
        } else {
            this.s = dsfVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t(int i, int i2, int i3) {
        ComponentTree componentTree = this.o;
        if (componentTree != null) {
            componentTree.v(i, i2, i3);
        }
    }
}
