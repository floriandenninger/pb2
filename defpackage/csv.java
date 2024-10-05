package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csv implements csd, dds {
    public cqi b;
    public boolean c;
    public ctd d;
    public boolean e;
    csz f;
    public boolean g;
    csx h;
    public volatile boolean i;
    int j;
    public final csr k;
    public final csr l;
    private final hy n;
    private final cuv o;
    private final cuv p;
    private final cuv q;
    private boolean s;
    private csf t;
    final csu a = new csu(new ArrayList(2));
    public final aldo m = aldo.c();
    private final AtomicInteger r = new AtomicInteger();

    public csv(cuv cuvVar, cuv cuvVar2, cuv cuvVar3, csr csrVar, csr csrVar2, hy hyVar) {
        this.o = cuvVar;
        this.p = cuvVar2;
        this.q = cuvVar3;
        this.l = csrVar;
        this.k = csrVar2;
        this.n = hyVar;
    }

    private final cuv j() {
        return this.s ? this.q : this.p;
    }

    private final boolean k() {
        return this.g || this.e || this.i;
    }

    @Override // defpackage.csd
    public final void a(csf csfVar) {
        j().execute(csfVar);
    }

    public final synchronized void b(dby dbyVar, Executor executor) {
        this.m.b();
        this.a.a.add(new cst(dbyVar, executor));
        if (this.e) {
            d(1);
            executor.execute(new css(this, dbyVar, 0));
        } else if (this.g) {
            d(1);
            executor.execute(new css(this, dbyVar, 1));
        } else {
            did.aq(!this.i, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        csx csxVar;
        synchronized (this) {
            this.m.b();
            did.aq(k(), "Not yet complete!");
            int decrementAndGet = this.r.decrementAndGet();
            did.aq(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                csxVar = this.h;
                e();
            } else {
                csxVar = null;
            }
        }
        if (csxVar != null) {
            csxVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(int i) {
        csx csxVar;
        did.aq(k(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (csxVar = this.h) == null) {
            return;
        }
        csxVar.d();
    }

    public final synchronized void e() {
        if (this.b == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.b = null;
        this.h = null;
        this.d = null;
        this.g = false;
        this.i = false;
        this.e = false;
        csf csfVar = this.t;
        if (csfVar.q.h()) {
            csfVar.a();
        }
        this.t = null;
        this.f = null;
        this.j = 0;
        this.n.b(this);
    }

    @Override // defpackage.dds
    public final aldo f() {
        return this.m;
    }

    public final synchronized void g(dby dbyVar) {
        this.m.b();
        this.a.a.remove(csu.b(dbyVar));
        if (this.a.e()) {
            if (!k()) {
                this.i = true;
                csf csfVar = this.t;
                csfVar.n = true;
                csb csbVar = csfVar.m;
                if (csbVar != null) {
                    csbVar.a();
                }
                this.l.a(this, this.b);
            }
            if ((this.e || this.g) && this.r.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void h(csf csfVar) {
        cuv cuvVar;
        this.t = csfVar;
        int b = csfVar.b(1);
        if (b != 2 && b != 3) {
            cuvVar = j();
            cuvVar.execute(csfVar);
        }
        cuvVar = this.o;
        cuvVar.execute(csfVar);
    }

    public final synchronized void i(cqi cqiVar, boolean z, boolean z2) {
        this.b = cqiVar;
        this.c = z;
        this.s = z2;
    }
}
