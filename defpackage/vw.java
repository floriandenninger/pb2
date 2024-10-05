package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vw {
    public final vx a = new vx();
    public boolean b = false;
    public final int c = 1;

    public abstract int b();

    public int c(int i) {
        return 0;
    }

    public abstract wv f(ViewGroup viewGroup, int i);

    public int jW(vw vwVar, wv wvVar, int i) {
        if (vwVar == this) {
            return i;
        }
        return -1;
    }

    public final void l(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void m(int i, int i2) {
        this.a.f(i, i2);
    }

    public long mu(int i) {
        return -1L;
    }

    public final wv mv(ViewGroup viewGroup, int i) {
        wv f = f(viewGroup, i);
        if (f.a.getParent() == null) {
            f.f = i;
            return f;
        }
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
    }

    public final void mw() {
        this.a.a();
    }

    public final void n(int i) {
        this.a.f(i, 1);
    }

    public abstract void o(wv wvVar, int i);

    public final void oc(int i) {
        this.a.c(i, 1);
    }

    public final void od(int i) {
        this.a.e(i, 1);
    }

    public final void oe(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void og(int i, int i2) {
        this.a.c(i, i2);
    }

    public void p(wv wvVar) {
    }

    public final void q(boolean z) {
        if (!this.a.g()) {
            this.b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void r() {
    }

    public void s(wv wvVar, int i) {
        o(wvVar, i);
    }

    public void t() {
    }

    public void u(js jsVar) {
        this.a.registerObserver(jsVar);
    }

    public void v(js jsVar) {
        this.a.unregisterObserver(jsVar);
    }
}
