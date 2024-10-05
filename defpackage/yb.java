package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yb {
    public final ArrayList a = new ArrayList();
    public int b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    public int c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public yb(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static final xz n(View view) {
        return (xz) view.getLayoutParams();
    }

    public final int a() {
        return this.f.d ? m(this.a.size() - 1, -1) : m(0, this.a.size());
    }

    public final int b() {
        return this.f.d ? m(0, this.a.size()) : m(this.a.size() - 1, -1);
    }

    public final int c() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        h();
        return this.c;
    }

    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        h();
        return this.c;
    }

    public final int e() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i();
        return this.b;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        i();
        return this.b;
    }

    public final View g(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.a.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) this.a.get(i3);
                if ((this.f.d && StaggeredGridLayoutManager.bm(view2) <= i) || ((!this.f.d && StaggeredGridLayoutManager.bm(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.a.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) this.a.get(size2);
                if ((this.f.d && StaggeredGridLayoutManager.bm(view3) >= i) || ((!this.f.d && StaggeredGridLayoutManager.bm(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    final void h() {
        View view = (View) this.a.get(r0.size() - 1);
        xz n = n(view);
        this.c = this.f.b.a(view);
        boolean z = n.b;
    }

    final void i() {
        View view = (View) this.a.get(0);
        xz n = n(view);
        this.b = this.f.b.d(view);
        boolean z = n.b;
    }

    public final void j() {
        this.a.clear();
        this.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.d = 0;
    }

    public final void k(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = i;
    }

    final int m(int i, int i2) {
        int j = this.f.b.j();
        int f = this.f.b.f();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int d = this.f.b.d(view);
            int a = this.f.b.a(view);
            boolean z = d <= f;
            boolean z2 = a >= j;
            if (z && z2 && (d < j || a > f)) {
                return StaggeredGridLayoutManager.bm(view);
            }
            i += i3;
        }
        return -1;
    }
}
