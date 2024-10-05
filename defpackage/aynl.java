package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aynl implements aygd {
    static final ayca a = ayca.c("grpc-previous-rpc-attempts", aycd.a);
    static final ayca b = ayca.c("grpc-retry-pushback-ms", aycd.a);
    public static final Status c = Status.c.withDescription("Stream thrown away because RetriableStream committed");
    public static final Random d = new Random();
    final /* synthetic */ axzo A;
    final /* synthetic */ ayai B;
    final /* synthetic */ aykc C;
    private final aycd D;
    private Status E;
    public final aych e;
    public final Executor f;
    public final Executor g;
    public final ScheduledExecutorService h;
    public final aynm i;
    public final ayiv j;
    public final boolean k;
    public final Object l;
    public final aymw m;
    public final long n;
    public final long o;
    public final aynk p;
    public final ayiz q;
    public volatile aynb r;
    public final AtomicBoolean s;
    public long t;
    public aygf u;
    public aymx v;
    public aymx w;
    public long x;
    public boolean y;
    final /* synthetic */ aych z;

    public aynl(aykc aykcVar, aych aychVar, aycd aycdVar, axzo axzoVar, aynm aynmVar, ayiv ayivVar, aynk aynkVar, ayai ayaiVar) {
        this.C = aykcVar;
        this.z = aychVar;
        this.A = axzoVar;
        this.B = ayaiVar;
        aykx aykxVar = aykcVar.a;
        aymw aymwVar = aykxVar.M;
        long j = aykxVar.N;
        long j2 = aykxVar.O;
        Executor d2 = aykxVar.d(axzoVar);
        ScheduledExecutorService b2 = aykcVar.a.j.b();
        this.g = new aydh(new aymj());
        this.l = new Object();
        this.q = new ayiz();
        this.r = new aynb(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.s = new AtomicBoolean();
        this.e = aychVar;
        this.m = aymwVar;
        this.n = j;
        this.o = j2;
        this.f = d2;
        this.h = b2;
        this.D = aycdVar;
        this.i = aynmVar;
        if (aynmVar != null) {
            this.x = aynmVar.b;
        }
        this.j = ayivVar;
        amkq.F(aynmVar == null || ayivVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.k = ayivVar != null;
        this.p = aynkVar;
    }

    @Override // defpackage.aygd
    public final axzj a() {
        throw null;
    }

    @Override // defpackage.aygd
    public final void b(ayiz ayizVar) {
        aynb aynbVar;
        synchronized (this.l) {
            ayizVar.b("closed", this.q);
            aynbVar = this.r;
        }
        if (aynbVar.f != null) {
            ayiz ayizVar2 = new ayiz();
            aynbVar.f.a.b(ayizVar2);
            ayizVar.b("committed", ayizVar2);
            return;
        }
        ayiz ayizVar3 = new ayiz();
        for (aynj aynjVar : aynbVar.c) {
            ayiz ayizVar4 = new ayiz();
            aynjVar.a.b(ayizVar4);
            ayizVar3.a(ayizVar4);
        }
        ayizVar.b("open", ayizVar3);
    }

    @Override // defpackage.aygd
    public final void c(Status status) {
        aynj aynjVar;
        aynj aynjVar2 = new aynj(0);
        aynjVar2.a = new ayls();
        Runnable q = q(aynjVar2);
        if (q != null) {
            q.run();
            this.g.execute(new aymt(this, status));
            return;
        }
        synchronized (this.l) {
            if (this.r.c.contains(this.r.f)) {
                aynjVar = this.r.f;
            } else {
                this.E = status;
                aynjVar = null;
            }
            aynb aynbVar = this.r;
            this.r = new aynb(aynbVar.b, aynbVar.c, aynbVar.d, aynbVar.f, true, aynbVar.a, aynbVar.h, aynbVar.e);
        }
        if (aynjVar != null) {
            aynjVar.a.c(status);
        }
    }

    @Override // defpackage.ayob
    public final void d() {
        aynb aynbVar = this.r;
        if (aynbVar.a) {
            aynbVar.f.a.d();
        } else {
            s(new aymo(1));
        }
    }

    @Override // defpackage.aygd
    public final void e() {
        s(new aymo(0));
    }

    @Override // defpackage.ayob
    public final void f() {
        s(new aymo(2));
    }

    @Override // defpackage.ayob
    public final void g(int i) {
        aynb aynbVar = this.r;
        if (aynbVar.a) {
            aynbVar.f.a.g(i);
        } else {
            s(new aymp(i, 2));
        }
    }

    @Override // defpackage.ayob
    public final void h(ayac ayacVar) {
        s(new ayml(ayacVar));
    }

    @Override // defpackage.aygd
    public final void i(ayaj ayajVar) {
        s(new aymm(ayajVar));
    }

    @Override // defpackage.aygd
    public final void j(ayam ayamVar) {
        s(new aymn(ayamVar));
    }

    @Override // defpackage.aygd
    public final void k(int i) {
        s(new aymp(i, 1));
    }

    @Override // defpackage.aygd
    public final void l(int i) {
        s(new aymp(i, 0));
    }

    @Override // defpackage.aygd
    public final void m(aygf aygfVar) {
        Status status;
        aymx aymxVar;
        aynk aynkVar;
        this.u = aygfVar;
        aykw aykwVar = this.C.a.z;
        synchronized (aykwVar.a) {
            status = aykwVar.c;
            aymxVar = null;
            if (status == null) {
                aykwVar.b.add(this);
                status = null;
            }
        }
        if (status != null) {
            c(status);
            return;
        }
        synchronized (this.l) {
            this.r.b.add(new ayna(this));
        }
        aynj p = p(0, false);
        if (this.k) {
            synchronized (this.l) {
                this.r = this.r.a(p);
                if (v(this.r) && ((aynkVar = this.p) == null || aynkVar.a())) {
                    aymxVar = new aymx(this.l);
                    this.w = aymxVar;
                }
            }
            if (aymxVar != null) {
                aymxVar.b(this.h.schedule(new aymz(this, aymxVar), this.j.b, TimeUnit.NANOSECONDS));
            }
        }
        t(p);
    }

    @Override // defpackage.ayob
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.ayob
    public final boolean o() {
        Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((aynj) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public final aynj p(int i, boolean z) {
        aynj aynjVar = new aynj(i);
        aymr aymrVar = new aymr(new aymv(this, aynjVar), null, null, null);
        aycd aycdVar = this.D;
        aycd aycdVar2 = new aycd();
        aycdVar2.e(aycdVar);
        if (i > 0) {
            aycdVar2.f(a, String.valueOf(i));
        }
        axzo axzoVar = this.A;
        axzo axzoVar2 = new axzo(axzoVar);
        ArrayList arrayList = new ArrayList(axzoVar.d.size() + 1);
        arrayList.addAll(axzoVar.d);
        arrayList.add(aymrVar);
        axzoVar2.d = Collections.unmodifiableList(arrayList);
        ayep[] k = ayiu.k(axzoVar2, aycdVar2, i, z);
        aygg a2 = this.C.a(new aybn(this.z, aycdVar2, axzoVar2));
        ayai a3 = this.B.a();
        try {
            aygd l = a2.l(this.z, aycdVar2, axzoVar2, k);
            this.B.c(a3);
            aynjVar.a = l;
            return aynjVar;
        } catch (Throwable th) {
            this.B.c(a3);
            throw th;
        }
    }

    public final Runnable q(aynj aynjVar) {
        List list;
        Collection emptyList;
        Future future;
        Future future2;
        synchronized (this.l) {
            if (this.r.f != null) {
                return null;
            }
            Collection collection = this.r.c;
            aynb aynbVar = this.r;
            boolean z = true;
            amkq.O(aynbVar.f == null, "Already committed");
            List list2 = aynbVar.b;
            if (aynbVar.c.contains(aynjVar)) {
                list = null;
                emptyList = Collections.singleton(aynjVar);
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z = false;
            }
            this.r = new aynb(list, emptyList, aynbVar.d, aynjVar, aynbVar.g, z, aynbVar.h, aynbVar.e);
            this.m.a(-this.t);
            aymx aymxVar = this.v;
            if (aymxVar != null) {
                Future a2 = aymxVar.a();
                this.v = null;
                future = a2;
            } else {
                future = null;
            }
            aymx aymxVar2 = this.w;
            if (aymxVar2 != null) {
                Future a3 = aymxVar2.a();
                this.w = null;
                future2 = a3;
            } else {
                future2 = null;
            }
            return new aymk(this, collection, aynjVar, future, future2);
        }
    }

    public final void r(aynj aynjVar) {
        Runnable q = q(aynjVar);
        if (q != null) {
            q.run();
        }
    }

    public final void s(aymu aymuVar) {
        Collection collection;
        synchronized (this.l) {
            if (!this.r.a) {
                this.r.b.add(aymuVar);
            }
            collection = this.r.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aymuVar.a((aynj) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        r18.g.execute(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r2 = r19.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (r18.r.f != r19) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r0 = r18.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        r2.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        r0 = defpackage.aynl.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        r5 = r6.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (r7 >= r5) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        r8 = (defpackage.aymu) r6.get(r7);
        r8.a(r19);
        r4 = r4 | (r8 instanceof defpackage.ayna);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r4 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        r8 = r18.r;
        r10 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        if (r10 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if (r10 == r19) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (r8.g == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.aynj r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aynl.t(aynj):void");
    }

    public final void u() {
        Future future;
        synchronized (this.l) {
            aymx aymxVar = this.w;
            future = null;
            if (aymxVar != null) {
                Future a2 = aymxVar.a();
                this.w = null;
                future = a2;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean v(aynb aynbVar) {
        return aynbVar.f == null && aynbVar.e < this.j.a && !aynbVar.h;
    }
}
