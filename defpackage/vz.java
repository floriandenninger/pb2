package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vz {
    public wa j = null;
    private final ArrayList a = new ArrayList();
    public long h = 120;
    public long i = 250;

    public static void q(wv wvVar) {
        int i = wvVar.j;
        if (!wvVar.t() && (i & 4) == 0) {
            int i2 = wvVar.d;
            wvVar.a();
        }
    }

    public static final asc v() {
        return new asc(null);
    }

    public static final asc w(wv wvVar) {
        asc v = v();
        v.b(wvVar);
        return v;
    }

    public abstract void b(wv wvVar);

    public abstract void c();

    public abstract void d();

    public boolean i(wv wvVar, List list) {
        return o(wvVar);
    }

    public abstract boolean j();

    public final void l(wv wvVar) {
        n(wvVar);
        wa waVar = this.j;
        if (waVar != null) {
            boolean z = true;
            wvVar.n(true);
            if (wvVar.h != null && wvVar.i == null) {
                wvVar.h = null;
            }
            wvVar.i = null;
            if ((wvVar.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = waVar.a;
            View view = wvVar.a;
            recyclerView.al();
            tq tqVar = recyclerView.g;
            int h = tqVar.c.h(view);
            if (h == -1) {
                tqVar.l(view);
            } else if (tqVar.a.f(h)) {
                tqVar.a.g(h);
                tqVar.l(view);
                tqVar.c.k(h);
            } else {
                z = false;
            }
            if (z) {
                wv l = RecyclerView.l(view);
                recyclerView.d.l(l);
                recyclerView.d.j(l);
            }
            recyclerView.am(!z);
            if (z || !wvVar.x()) {
                return;
            }
            waVar.a.removeDetachedView(wvVar.a, false);
        }
    }

    public final void m() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((akke) this.a.get(i)).a();
        }
        this.a.clear();
    }

    public void n(wv wvVar) {
    }

    public boolean o(wv wvVar) {
        throw null;
    }

    public final boolean p(akke akkeVar) {
        boolean j = j();
        if (akkeVar != null) {
            if (!j) {
                akkeVar.a();
            } else {
                this.a.add(akkeVar);
            }
        }
        return j;
    }

    public abstract boolean r(wv wvVar, asc ascVar, asc ascVar2);

    public abstract boolean s(wv wvVar, wv wvVar2, asc ascVar, asc ascVar2);

    public abstract boolean t(wv wvVar, asc ascVar, asc ascVar2);

    public abstract boolean u(wv wvVar, asc ascVar, asc ascVar2);
}
