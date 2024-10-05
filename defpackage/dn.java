package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dn {
    int e;
    int f;
    int g;
    int h;
    public int i;
    public boolean j;
    public String l;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList q;
    public ArrayList r;
    ArrayList t;
    public final ArrayList d = new ArrayList();
    boolean k = true;
    public boolean s = false;

    public abstract int a();

    public abstract void d();

    public abstract void e();

    public void f(int i, ce ceVar, String str, int i2) {
        throw null;
    }

    public boolean j() {
        throw null;
    }

    public abstract void k();

    public void l(ce ceVar) {
        throw null;
    }

    public void m(ce ceVar) {
        throw null;
    }

    public void n(ce ceVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(dm dmVar) {
        this.d.add(dmVar);
        dmVar.d = this.e;
        dmVar.e = this.f;
        dmVar.f = this.g;
        dmVar.g = this.h;
    }

    public final void p(int i, ce ceVar) {
        f(i, ceVar, null, 1);
    }

    public final void q(int i, ce ceVar, String str) {
        f(i, ceVar, str, 1);
    }

    public final void r(ce ceVar, String str) {
        f(0, ceVar, str, 1);
    }

    public final void s(String str) {
        if (!this.k) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.j = true;
        this.l = str;
    }

    public final void t() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void v(Runnable runnable) {
        t();
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(runnable);
    }

    public final void w(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public final void x() {
        this.s = true;
    }

    public final void y(int i, ce ceVar) {
        u(i, ceVar, null);
    }

    public final void z(int i, int i2) {
        w(i, i2, 0, 0);
    }

    public final void u(int i, ce ceVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, ceVar, str, 2);
    }
}
