package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wk {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public wj g;
    public final /* synthetic */ RecyclerView h;

    public wk(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final int a(int i) {
        if (i < 0 || i >= this.h.M.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.h.M.a() + this.h.p());
        }
        RecyclerView recyclerView = this.h;
        return !recyclerView.M.g ? i : recyclerView.f.a(i);
    }

    public final wj b() {
        if (this.g == null) {
            this.g = new wj();
        }
        return this.g;
    }

    public final View c(int i) {
        return n(i, Long.MAX_VALUE).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(wv wvVar, boolean z) {
        RecyclerView.x(wvVar);
        View view = wvVar.a;
        wx wxVar = this.h.Q;
        if (wxVar != null) {
            ic k = wxVar.k();
            jw.M(view, k instanceof ww ? (ic) ((ww) k).c.remove(view) : null);
        }
        if (z) {
            wl wlVar = this.h.o;
            if (wlVar != null) {
                wlVar.a(wvVar);
            }
            int size = this.h.p.size();
            for (int i = 0; i < size; i++) {
                ((wl) this.h.p.get(i)).a(wvVar);
            }
            vw vwVar = this.h.m;
            if (vwVar != null) {
                vwVar.p(wvVar);
            }
            RecyclerView recyclerView = this.h;
            if (recyclerView.M != null) {
                recyclerView.h.e(wvVar);
            }
        }
        wvVar.r = null;
        wvVar.q = null;
        b().f(wvVar);
    }

    public final void e() {
        this.a.clear();
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(View view) {
        wv l = RecyclerView.l(view);
        l.m = null;
        l.n = false;
        l.i();
        j(l);
    }

    public final void g() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                h(size);
            } else {
                this.c.clear();
                int i = RecyclerView.V;
                this.h.L.b();
                return;
            }
        }
    }

    public final void h(int i) {
        d((wv) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void i(View view) {
        wv l = RecyclerView.l(view);
        if (l.x()) {
            this.h.removeDetachedView(view, false);
        }
        if (l.w()) {
            l.p();
        } else if (l.B()) {
            l.i();
        }
        j(l);
        if (this.h.E == null || l.u()) {
            return;
        }
        this.h.E.b(l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r6.h.L.d(r7.c) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r3 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r6.h.L.d(((defpackage.wv) r6.c.get(r3)).c) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.wv r7) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.j(wv):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(View view) {
        vz vzVar;
        wv l = RecyclerView.l(view);
        if (l.q(12) || !l.y() || (vzVar = this.h.E) == null || vzVar.i(l, l.d())) {
            if (!l.t() || l.v() || this.h.m.b) {
                l.o(this, false);
                this.a.add(l);
                return;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.h.p());
            }
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        l.o(this, true);
        this.b.add(l);
    }

    public final void l(wv wvVar) {
        if (wvVar.n) {
            this.b.remove(wvVar);
        } else {
            this.a.remove(wvVar);
        }
        wvVar.m = null;
        wvVar.n = false;
        wvVar.i();
    }

    public final void m() {
        wd wdVar = this.h.n;
        this.f = this.e + (wdVar != null ? wdVar.D : 0);
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0 || this.c.size() <= this.f) {
                return;
            } else {
                h(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0401, code lost:
    
        if ((r9 + r6) >= r20) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c3, code lost:
    
        if (r18.h.M.g == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fd, code lost:
    
        if (r8.e != r9.mu(r8.c)) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0485  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wv n(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.n(int, long):wv");
    }
}
