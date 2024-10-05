package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wv {
    public static final /* synthetic */ int s = 0;
    private static final List t = Collections.emptyList();
    public final View a;
    public WeakReference b;
    int j;
    RecyclerView q;
    vw r;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public wv h = null;
    public wv i = null;
    List k = null;
    List l = null;
    private int u = 0;
    wk m = null;
    boolean n = false;
    public int o = 0;
    public int p = -1;

    public wv(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final boolean A() {
        return (this.j & 128) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B() {
        return (this.j & 32) != 0;
    }

    public final hsl C() {
        return (hsl) this.a;
    }

    public final xue D() {
        return (xue) this.a;
    }

    public final int a() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b(this);
    }

    public final int b() {
        RecyclerView recyclerView;
        vw vwVar;
        int b;
        if (this.r == null || (recyclerView = this.q) == null || (vwVar = recyclerView.m) == null || (b = recyclerView.b(this)) == -1) {
            return -1;
        }
        return vwVar.jW(this.r, this, b);
    }

    public final int c() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List d() {
        if ((this.j & 1024) != 0) {
            return t;
        }
        List list = this.k;
        return (list == null || list.size() == 0) ? t : this.l;
    }

    public final void e(Object obj) {
        if (obj == null) {
            f(1024);
            return;
        }
        if ((1024 & this.j) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void f(int i) {
        this.j = i | this.j;
    }

    public final void g() {
        this.d = -1;
        this.g = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.j &= -33;
    }

    public final void j() {
        this.j &= -257;
    }

    public final void k(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        if (this.a.getLayoutParams() != null) {
            ((we) this.a.getLayoutParams()).e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.u = 0;
        this.h = null;
        this.i = null;
        h();
        this.o = 0;
        this.p = -1;
        RecyclerView.x(this);
    }

    public final void m(int i, int i2) {
        this.j = (i & i2) | (this.j & (i2 ^ (-1)));
    }

    public final void n(boolean z) {
        int i = this.u;
        int i2 = z ? i - 1 : i + 1;
        this.u = i2;
        if (i2 < 0) {
            this.u = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(wk wkVar, boolean z) {
        this.m = wkVar;
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        this.m.l(this);
    }

    public final boolean q(int i) {
        return (i & this.j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return (this.a.getParent() == null || this.a.getParent() == this.q) ? false : true;
    }

    public final boolean s() {
        return (this.j & 1) != 0;
    }

    public final boolean t() {
        return (this.j & 4) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (w()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (t()) {
            sb.append(" invalid");
        }
        if (!s()) {
            sb.append(" unbound");
        }
        if (z()) {
            sb.append(" update");
        }
        if (v()) {
            sb.append(" removed");
        }
        if (A()) {
            sb.append(" ignored");
        }
        if (x()) {
            sb.append(" tmpDetached");
        }
        if (!u()) {
            sb.append(" not recyclable(" + this.u + ")");
        }
        if ((this.j & 512) != 0 || t()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.j & 16) == 0 && !jw.ai(this.a);
    }

    public final boolean v() {
        return (this.j & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        return this.m != null;
    }

    public final boolean x() {
        return (this.j & 256) != 0;
    }

    public final boolean y() {
        return (this.j & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z() {
        return (this.j & 2) != 0;
    }
}
