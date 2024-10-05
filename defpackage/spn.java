package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class spn implements sxs {
    private static final boolean b = Boolean.getBoolean("force_elements_view_materialization");
    public dgy a;
    private final boolean d;
    private final boolean e;
    private final awpj f;
    private final syg g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;
    private List n;
    private List o;
    private List p;
    private List q;
    private axou r;
    private SparseArray s;
    private final Object c = new Object();
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;

    public spn(awpj awpjVar, syg sygVar, boolean z, boolean z2) {
        this.f = awpjVar;
        this.g = sygVar;
        this.d = z;
        this.e = z2;
    }

    public static void c() {
        amkq.O(Looper.getMainLooper() == Looper.myLooper(), "The code must run on UI thread.");
    }

    private final void u(dgy dgyVar) {
        axou axouVar = this.r;
        if (axouVar == null || !(dgyVar instanceof snu)) {
            return;
        }
        ((snu) dgyVar).a.f = axouVar;
    }

    private final void v() {
        if (this.v) {
            throw new IllegalStateException("Element already built!");
        }
    }

    @Override // defpackage.sxs
    public final dgy a() {
        dgy dgyVar = this.a;
        dgyVar.getClass();
        return dgyVar;
    }

    @Override // defpackage.sxs
    public final dha b(dhe dheVar) {
        dgy dgyVar;
        dha a;
        final awpj awpjVar;
        synchronized (this.c) {
            v();
            final syg sygVar = this.g;
            if (sygVar != null && (awpjVar = this.f) != null) {
                p(new sxr() { // from class: spm
                    @Override // defpackage.sxr
                    public final /* synthetic */ void b(View view, View view2) {
                        rwh.ai(this, view);
                    }

                    @Override // defpackage.sxr
                    public final void d(View view) {
                        syg sygVar2 = syg.this;
                        awpj awpjVar2 = awpjVar;
                        spn.c();
                        sygVar2.b(amru.r(awpjVar2), 2);
                    }
                });
                j(new sxl() { // from class: spj
                    @Override // defpackage.sxl
                    public final void a(View view) {
                        syg sygVar2 = syg.this;
                        awpj awpjVar2 = awpjVar;
                        spn.c();
                        sygVar2.b(amru.r(awpjVar2), 3);
                    }
                });
                synchronized (this.c) {
                    if (f()) {
                        l(new sxn() { // from class: spl
                            @Override // defpackage.sxn
                            public final void a(View view, szk szkVar) {
                                syg sygVar2 = syg.this;
                                awpj awpjVar2 = awpjVar;
                                spn.c();
                                sygVar2.a(awpjVar2, 2);
                            }
                        });
                    }
                    if (e()) {
                        k(new sxm() { // from class: spk
                            @Override // defpackage.sxm
                            public final void a(View view, szk szkVar) {
                                syg sygVar2 = syg.this;
                                awpj awpjVar2 = awpjVar;
                                spn.c();
                                sygVar2.a(awpjVar2, 4);
                            }
                        });
                    }
                }
            }
            this.v = true;
            if (!this.w || this.d) {
                dgy a2 = a();
                u(a2);
                dgyVar = a2;
            } else {
                dgy a3 = a();
                u(a3);
                List list = this.l;
                if (list != null && !list.isEmpty() && (a3 instanceof snu)) {
                    ((snu) a3).a.g = true;
                }
                spq spqVar = new spq();
                spq.c(spqVar, dheVar, new sps());
                spqVar.a.a = a3.a();
                spqVar.d.set(0);
                List list2 = this.h;
                sps spsVar = spqVar.a;
                spsVar.y = list2;
                spsVar.x = this.j;
                spsVar.d = this.k;
                spsVar.C = this.l;
                spsVar.w = this.e;
                spsVar.B = this.n;
                spsVar.A = this.o;
                spsVar.z = this.p;
                spsVar.f = this.m;
                spsVar.e = null;
                spsVar.b = this.q;
                spsVar.c = this.i;
                spsVar.g = this.t;
                spsVar.v = this.u;
                dgyVar = spqVar;
            }
            if (b) {
                dgyVar.T();
            }
            SparseArray sparseArray = this.s;
            if (sparseArray != null) {
                dgyVar.c.C().D().r(sparseArray);
            }
            a = dgyVar.a();
        }
        return a;
    }

    @Override // defpackage.sxs
    public final boolean d() {
        List list = this.i;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.sxs
    public final boolean e() {
        List list = this.j;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.sxs
    public final boolean f() {
        List list = this.h;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.sxs
    public final void g(ssw sswVar) {
        synchronized (this.c) {
            v();
            if (this.q == null) {
                this.q = new ArrayList();
            }
            this.q.add(sswVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void h(ssl sslVar) {
        synchronized (this.c) {
            v();
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(sslVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void i(sxr sxrVar) {
        synchronized (this.c) {
            v();
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(sxrVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void j(sxl sxlVar) {
        synchronized (this.c) {
            v();
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(sxlVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void k(sxm sxmVar) {
        synchronized (this.c) {
            v();
            if (this.j == null) {
                this.j = new ArrayList();
            }
            this.j.add(sxmVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void l(sxn sxnVar) {
        synchronized (this.c) {
            v();
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(sxnVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void m(sxo sxoVar) {
        synchronized (this.c) {
            v();
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add(sxoVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void n(sxp sxpVar) {
        synchronized (this.c) {
            v();
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(sxpVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void o(sxq sxqVar) {
        synchronized (this.c) {
            v();
            if (this.n == null) {
                this.n = new ArrayList();
            }
            this.n.add(sxqVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void p(sxr sxrVar) {
        synchronized (this.c) {
            v();
            if (this.l == null) {
                this.l = new ArrayList();
            }
            this.l.add(sxrVar);
            this.w = true;
        }
    }

    @Override // defpackage.sxs
    public final void q(int i, Object obj) {
        synchronized (this.c) {
            v();
            if (this.s == null) {
                this.s = new SparseArray();
            }
            this.s.put(i, obj);
        }
    }

    @Override // defpackage.sxs
    public final void r() {
        this.t = true;
    }

    @Override // defpackage.sxs
    public final void s(boolean z) {
        this.u = z;
    }

    @Override // defpackage.sxs
    public final void t(axou axouVar) {
        this.r = axouVar;
    }
}
