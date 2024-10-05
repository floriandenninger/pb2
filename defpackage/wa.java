package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wa {
    public final /* synthetic */ RecyclerView a;

    public wa(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final wv a(int i) {
        wv j = this.a.j(i, true);
        if (j == null || this.a.g.k(j.a)) {
            return null;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(sg sgVar) {
        int i = sgVar.a;
        if (i == 1) {
            this.a.n.v(sgVar.b, sgVar.d);
            return;
        }
        if (i == 2) {
            this.a.n.y(sgVar.b, sgVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            this.a.n.x(sgVar.b, sgVar.d);
        } else {
            wd wdVar = this.a.n;
            int i2 = sgVar.b;
            int i3 = sgVar.d;
            Object obj = sgVar.c;
            wdVar.z(i2, i3);
        }
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View e = recyclerView.g.e(i6);
            wv l = RecyclerView.l(e);
            if (l != null && !l.A() && (i4 = l.c) >= i && i4 < i5) {
                l.f(2);
                l.e(obj);
                ((we) e.getLayoutParams()).e = true;
            }
        }
        wk wkVar = recyclerView.d;
        int size = wkVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.a.O = true;
                return;
            }
            wv wvVar = (wv) wkVar.c.get(size);
            if (wvVar != null && (i3 = wvVar.c) >= i && i3 < i5) {
                wvVar.f(2);
                wkVar.h(size);
            }
        }
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        for (int i3 = 0; i3 < b; i3++) {
            wv l = RecyclerView.l(recyclerView.g.e(i3));
            if (l != null && !l.A() && l.c >= i) {
                l.k(i2, false);
                recyclerView.M.f = true;
            }
        }
        wk wkVar = recyclerView.d;
        int size = wkVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            wv wvVar = (wv) wkVar.c.get(i4);
            if (wvVar != null && wvVar.c >= i) {
                wvVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.a.N = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.g.b();
        int i5 = i < i2 ? -1 : 1;
        int i6 = i < i2 ? i2 : i;
        int i7 = i < i2 ? i : i2;
        for (int i8 = 0; i8 < b; i8++) {
            wv l = RecyclerView.l(recyclerView.g.e(i8));
            if (l != null && (i4 = l.c) >= i7 && i4 <= i6) {
                if (i4 == i) {
                    l.k(i2 - i, false);
                } else {
                    l.k(i5, false);
                }
                recyclerView.M.f = true;
            }
        }
        wk wkVar = recyclerView.d;
        int i9 = i >= i2 ? 1 : -1;
        int size = wkVar.c.size();
        for (int i10 = 0; i10 < size; i10++) {
            wv wvVar = (wv) wkVar.c.get(i10);
            if (wvVar != null && (i3 = wvVar.c) >= i7 && i3 <= i6) {
                if (i3 == i) {
                    wvVar.k(i2 - i, false);
                } else {
                    wvVar.k(i9, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.N = true;
    }

    public final void f(int i, int i2) {
        this.a.Q(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.N = true;
        recyclerView.M.c += i2;
    }

    public final int g() {
        return this.a.getChildCount();
    }

    public final int h(View view) {
        return this.a.indexOfChild(view);
    }

    public final View i(int i) {
        return this.a.getChildAt(i);
    }

    public final void j(View view) {
        wv l = RecyclerView.l(view);
        if (l != null) {
            this.a.ax(l, l.o);
            l.o = 0;
        }
    }

    public final void k(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.C(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }

    public final void l(wv wvVar) {
        RecyclerView recyclerView = this.a;
        recyclerView.n.aS(wvVar.a, recyclerView.d);
    }

    public final void m(wv wvVar, asc ascVar, asc ascVar2) {
        RecyclerView recyclerView = this.a;
        wvVar.n(false);
        if (recyclerView.E.r(wvVar, ascVar, ascVar2)) {
            recyclerView.U();
        }
    }

    public final void n(wv wvVar, asc ascVar, asc ascVar2) {
        this.a.d.l(wvVar);
        RecyclerView recyclerView = this.a;
        recyclerView.t(wvVar);
        wvVar.n(false);
        if (recyclerView.E.t(wvVar, ascVar, ascVar2)) {
            recyclerView.U();
        }
    }
}
