package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tq {
    public final tp a = new tp();
    public final List b = new ArrayList();
    public final wa c;

    public tq(wa waVar, byte[] bArr) {
        this.c = waVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int g = this.c.g();
        int i2 = i;
        while (i2 < g) {
            int a = i - (i2 - this.a.a(i2));
            if (a == 0) {
                while (this.a.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += a;
        }
        return -1;
    }

    public final int a() {
        return this.c.g() - this.b.size();
    }

    public final int b() {
        return this.c.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(View view) {
        int h = this.c.h(view);
        if (h == -1 || this.a.f(h)) {
            return -1;
        }
        return h - this.a.a(h);
    }

    public final View d(int i) {
        return this.c.i(m(i));
    }

    public final View e(int i) {
        return this.c.i(i);
    }

    public final void f(View view, int i, boolean z) {
        int m;
        if (i < 0) {
            m = this.c.g();
        } else {
            m = m(i);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        wa waVar = this.c;
        waVar.a.addView(view, m);
        RecyclerView recyclerView = waVar.a;
        RecyclerView.l(view);
        List list = recyclerView.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wf) recyclerView.x.get(size)).b();
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m;
        if (i < 0) {
            m = this.c.g();
        } else {
            m = m(i);
        }
        this.a.c(m, z);
        if (z) {
            i(view);
        }
        wa waVar = this.c;
        wv l = RecyclerView.l(view);
        if (l != null) {
            if (l.x() || l.A()) {
                l.j();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + l + waVar.a.p());
            }
        }
        waVar.a.attachViewToParent(view, m, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        wv l;
        int m = m(i);
        this.a.g(m);
        wa waVar = this.c;
        View i2 = waVar.i(m);
        if (i2 != null && (l = RecyclerView.l(i2)) != null) {
            if (!l.x() || l.A()) {
                l.f(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + l + waVar.a.p());
            }
        }
        waVar.a.detachViewFromParent(m);
    }

    public final void i(View view) {
        this.b.add(view);
        wa waVar = this.c;
        wv l = RecyclerView.l(view);
        if (l != null) {
            RecyclerView recyclerView = waVar.a;
            int i = l.p;
            if (i != -1) {
                l.o = i;
            } else {
                l.o = jw.c(l.a);
            }
            recyclerView.ax(l, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        int m = m(i);
        View i2 = this.c.i(m);
        if (i2 == null) {
            return;
        }
        if (this.a.g(m)) {
            l(i2);
        }
        this.c.k(m);
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.c.j(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
