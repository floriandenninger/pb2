package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ayhx implements aygd {
    private volatile boolean a;
    private aygf b;
    private Status c;
    public aygd e;
    private ayhw f;
    private long g;
    private long h;
    private List d = new ArrayList();
    private List i = new ArrayList();

    private final void s(Runnable runnable) {
        amkq.O(this.b != null, "May only be called after start");
        synchronized (this) {
            if (!this.a) {
                this.d.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private final void t(aygf aygfVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.e.m(aygfVar);
    }

    private final void u(aygd aygdVar) {
        aygd aygdVar2 = this.e;
        amkq.Q(aygdVar2 == null, "realStream already set to %s", aygdVar2);
        this.e = aygdVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.aygd
    public final axzj a() {
        throw null;
    }

    @Override // defpackage.aygd
    public void b(ayiz ayizVar) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.e != null) {
                ayizVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.e.b(ayizVar);
            } else {
                ayizVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                ayizVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.aygd
    public void c(Status status) {
        boolean z = true;
        amkq.O(this.b != null, "May only be called after start");
        status.getClass();
        synchronized (this) {
            if (this.e == null) {
                u(ayls.a);
                this.c = status;
                z = false;
            }
        }
        if (z) {
            s(new ayhr(this, status));
            return;
        }
        r();
        p(status);
        this.b.a(status, ayge.PROCESSED, new aycd());
    }

    @Override // defpackage.ayob
    public final void d() {
        amkq.O(this.b != null, "May only be called after start");
        if (this.a) {
            this.e.d();
        } else {
            s(new ayhp(this, 2));
        }
    }

    @Override // defpackage.aygd
    public final void e() {
        amkq.O(this.b != null, "May only be called after start");
        s(new ayhp(this, 3));
    }

    @Override // defpackage.ayob
    public final void f() {
        amkq.O(this.b == null, "May only be called before start");
        this.i.add(new ayhp(this, 1));
    }

    @Override // defpackage.ayob
    public final void g(int i) {
        amkq.O(this.b != null, "May only be called after start");
        if (this.a) {
            this.e.g(i);
        } else {
            s(new ayhn(this, i, 1));
        }
    }

    @Override // defpackage.ayob
    public final void h(ayac ayacVar) {
        amkq.O(this.b == null, "May only be called before start");
        this.i.add(new ayhl(this, ayacVar));
    }

    @Override // defpackage.aygd
    public final void i(ayaj ayajVar) {
        amkq.O(this.b == null, "May only be called before start");
        this.i.add(new ayho(this, ayajVar));
    }

    @Override // defpackage.aygd
    public final void j(ayam ayamVar) {
        amkq.O(this.b == null, "May only be called before start");
        ayamVar.getClass();
        this.i.add(new ayhm(this, ayamVar));
    }

    @Override // defpackage.aygd
    public final void k(int i) {
        amkq.O(this.b == null, "May only be called before start");
        this.i.add(new ayhn(this, i, 0));
    }

    @Override // defpackage.aygd
    public final void l(int i) {
        amkq.O(this.b == null, "May only be called before start");
        this.i.add(new ayhn(this, i, 2));
    }

    @Override // defpackage.aygd
    public final void m(aygf aygfVar) {
        Status status;
        boolean z;
        amkq.O(this.b == null, "already started");
        synchronized (this) {
            status = this.c;
            z = this.a;
            if (!z) {
                ayhw ayhwVar = new ayhw(aygfVar);
                this.f = ayhwVar;
                aygfVar = ayhwVar;
            }
            this.b = aygfVar;
            this.g = System.nanoTime();
        }
        if (status != null) {
            aygfVar.a(status, ayge.PROCESSED, new aycd());
        } else if (z) {
            t(aygfVar);
        }
    }

    @Override // defpackage.ayob
    public final void n(InputStream inputStream) {
        amkq.O(this.b != null, "May only be called after start");
        if (this.a) {
            this.e.n(inputStream);
        } else {
            s(new ayhq(this, inputStream));
        }
    }

    @Override // defpackage.ayob
    public final boolean o() {
        if (this.a) {
            return this.e.o();
        }
        return false;
    }

    protected void p(Status status) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Runnable q(aygd aygdVar) {
        synchronized (this) {
            if (this.e != null) {
                return null;
            }
            aygdVar.getClass();
            u(aygdVar);
            aygf aygfVar = this.b;
            if (aygfVar == null) {
                this.d = null;
                this.a = true;
            }
            if (aygfVar == null) {
                return null;
            }
            t(aygfVar);
            return new ayhp(this, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            ayhw r2 = r6.f     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            goto L71
        L70:
            throw r0
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayhx.r():void");
    }
}
