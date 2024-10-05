package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class can implements Runnable {
    static final String a = ajbh.S("WorkerWrapper");
    public static final /* synthetic */ int j = 0;
    final Context b;
    cda c;
    public volatile boolean f;
    final cfa g;
    private final String k;
    private final List l;
    private final bym m;
    private final ccd n;
    private final WorkDatabase o;
    private final cdb p;
    private List q;
    private String r;
    private final cdo s;
    private final cdo t;
    abd i = abd.f();
    final cex h = cex.h();
    anhy e = null;
    ListenableWorker d = null;

    public can(cam camVar) {
        this.b = camVar.a;
        this.g = camVar.g;
        this.n = camVar.b;
        this.k = camVar.e;
        this.l = camVar.f;
        this.m = camVar.c;
        WorkDatabase workDatabase = camVar.d;
        this.o = workDatabase;
        this.p = workDatabase.r();
        this.t = workDatabase.y();
        this.s = workDatabase.v();
    }

    private final void d() {
        this.o.h();
        try {
            this.p.k(1, this.k);
            this.p.g(this.k, System.currentTimeMillis());
            this.p.j(this.k, -1L);
            this.o.j();
        } finally {
            this.o.i();
            f(true);
        }
    }

    private final void e() {
        this.o.h();
        try {
            this.p.g(this.k, System.currentTimeMillis());
            this.p.k(1, this.k);
            cdb cdbVar = this.p;
            String str = this.k;
            ((cdl) cdbVar).a.g();
            buu d = ((cdl) cdbVar).d.d();
            if (str == null) {
                d.e(1);
            } else {
                d.f(1, str);
            }
            ((cdl) cdbVar).a.h();
            try {
                d.b();
                ((cdl) cdbVar).a.j();
                ((cdl) cdbVar).a.i();
                ((cdl) cdbVar).d.e(d);
                this.p.j(this.k, -1L);
                this.o.j();
            } catch (Throwable th) {
                ((cdl) cdbVar).a.i();
                ((cdl) cdbVar).d.e(d);
                throw th;
            }
        } finally {
            this.o.i();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x009d, TryCatch #1 {all -> 0x009d, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0043, B:15:0x0057, B:17:0x005b, B:19:0x005f, B:21:0x0065, B:22:0x006e, B:30:0x0080, B:32:0x0081, B:38:0x0096, B:39:0x009c, B:5:0x0022, B:7:0x0029, B:24:0x006f, B:25:0x007c), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x009d, TryCatch #1 {all -> 0x009d, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0043, B:15:0x0057, B:17:0x005b, B:19:0x005f, B:21:0x0065, B:22:0x006e, B:30:0x0080, B:32:0x0081, B:38:0x0096, B:39:0x009c, B:5:0x0022, B:7:0x0029, B:24:0x006f, B:25:0x007c), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.o
            r0.h()
            androidx.work.impl.WorkDatabase r0 = r5.o     // Catch: java.lang.Throwable -> L9d
            cdb r0 = r0.r()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            btn r1 = defpackage.btn.a(r1, r2)     // Catch: java.lang.Throwable -> L9d
            r3 = r0
            cdl r3 = (defpackage.cdl) r3     // Catch: java.lang.Throwable -> L9d
            btl r3 = r3.a     // Catch: java.lang.Throwable -> L9d
            r3.g()     // Catch: java.lang.Throwable -> L9d
            cdl r0 = (defpackage.cdl) r0     // Catch: java.lang.Throwable -> L9d
            btl r0 = r0.a     // Catch: java.lang.Throwable -> L9d
            android.database.Cursor r0 = defpackage.jr.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L9d
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L95
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L31
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L9d
            r1.i()     // Catch: java.lang.Throwable -> L9d
            if (r3 != 0) goto L41
            android.content.Context r0 = r5.b     // Catch: java.lang.Throwable -> L9d
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.cdw.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L9d
        L41:
            if (r6 == 0) goto L57
            cdb r0 = r5.p     // Catch: java.lang.Throwable -> L9d
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = r5.k     // Catch: java.lang.Throwable -> L9d
            r1[r2] = r3     // Catch: java.lang.Throwable -> L9d
            r0.k(r4, r1)     // Catch: java.lang.Throwable -> L9d
            cdb r0 = r5.p     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r5.k     // Catch: java.lang.Throwable -> L9d
            r2 = -1
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> L9d
        L57:
            cda r0 = r5.c     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L81
            androidx.work.ListenableWorker r0 = r5.d     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L81
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L81
            ccd r0 = r5.n     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r5.k     // Catch: java.lang.Throwable -> L9d
            r2 = r0
            bzr r2 = (defpackage.bzr) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r2.g     // Catch: java.lang.Throwable -> L9d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L9d
            r3 = r0
            bzr r3 = (defpackage.bzr) r3     // Catch: java.lang.Throwable -> L7e
            java.util.Map r3 = r3.d     // Catch: java.lang.Throwable -> L7e
            r3.remove(r1)     // Catch: java.lang.Throwable -> L7e
            bzr r0 = (defpackage.bzr) r0     // Catch: java.lang.Throwable -> L7e
            r0.d()     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
            goto L81
        L7e:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7e
            throw r6     // Catch: java.lang.Throwable -> L9d
        L81:
            androidx.work.impl.WorkDatabase r0 = r5.o     // Catch: java.lang.Throwable -> L9d
            r0.j()     // Catch: java.lang.Throwable -> L9d
            androidx.work.impl.WorkDatabase r0 = r5.o
            r0.i()
            cex r0 = r5.h
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.e(r6)
            return
        L95:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L9d
            r1.i()     // Catch: java.lang.Throwable -> L9d
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9d:
            r6 = move-exception
            androidx.work.impl.WorkDatabase r0 = r5.o
            r0.i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.can.f(boolean):void");
    }

    private final void g() {
        int h = this.p.h(this.k);
        if (h == 2) {
            ajbh X = ajbh.X();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.k);
            X.T(new Throwable[0]);
            f(true);
            return;
        }
        ajbh X2 = ajbh.X();
        String.format("Status for %s is %s; not doing any work", this.k, abm.c(h));
        X2.T(new Throwable[0]);
        f(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (!c()) {
            this.o.h();
            try {
                int h = this.p.h(this.k);
                ccw u = this.o.u();
                String str = this.k;
                u.a.g();
                buu d = u.b.d();
                if (str == null) {
                    d.e(1);
                } else {
                    d.f(1, str);
                }
                u.a.h();
                try {
                    d.b();
                    u.a.j();
                    u.a.i();
                    u.b.e(d);
                    if (h == 0) {
                        f(false);
                    } else if (h == 2) {
                        abd abdVar = this.i;
                        if (abdVar instanceof byy) {
                            ajbh.X();
                            String.format("Worker result SUCCESS for %s", this.r);
                            ajbh.V(new Throwable[0]);
                            if (!this.c.e()) {
                                this.o.h();
                                try {
                                    this.p.k(3, this.k);
                                    this.p.f(this.k, ((byy) this.i).a);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    for (String str2 : this.t.d(this.k)) {
                                        if (this.p.h(str2) == 5) {
                                            cdo cdoVar = this.t;
                                            btn a2 = btn.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                            if (str2 == null) {
                                                a2.e(1);
                                            } else {
                                                a2.f(1, str2);
                                            }
                                            cdoVar.a.g();
                                            Cursor e = jr.e(cdoVar.a, a2, false);
                                            try {
                                                if (e.moveToFirst() && e.getInt(0) != 0) {
                                                    ajbh.X();
                                                    String.format("Setting status to enqueued for %s", str2);
                                                    ajbh.V(new Throwable[0]);
                                                    this.p.k(1, str2);
                                                    this.p.g(str2, currentTimeMillis);
                                                }
                                            } finally {
                                                e.close();
                                                a2.i();
                                            }
                                        }
                                    }
                                    this.o.j();
                                    this.o.i();
                                    f(false);
                                } catch (Throwable th) {
                                    this.o.i();
                                    f(false);
                                    throw th;
                                }
                            } else {
                                e();
                            }
                        } else if (!(abdVar instanceof byx)) {
                            ajbh.X();
                            String.format("Worker result FAILURE for %s", this.r);
                            ajbh.V(new Throwable[0]);
                            if (this.c.e()) {
                                e();
                            } else {
                                b();
                            }
                        } else {
                            ajbh.X();
                            String.format("Worker result RETRY for %s", this.r);
                            ajbh.V(new Throwable[0]);
                            d();
                        }
                    } else if (!abm.d(h)) {
                        d();
                    }
                    this.o.j();
                } catch (Throwable th2) {
                    u.a.i();
                    u.b.e(d);
                    throw th2;
                }
            } finally {
                this.o.i();
            }
        }
        List list = this.l;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((bzs) it.next()).b(this.k);
            }
            bzt.b(this.o, this.l);
        }
    }

    final void b() {
        this.o.h();
        try {
            String str = this.k;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (this.p.h(str2) != 6) {
                    this.p.k(4, str2);
                }
                linkedList.addAll(this.t.d(str2));
            }
            this.p.f(this.k, ((byw) this.i).a);
            this.o.j();
        } finally {
            this.o.i();
            f(false);
        }
    }

    public final boolean c() {
        if (!this.f) {
            return false;
        }
        ajbh X = ajbh.X();
        String.format("Work interrupted for %s", this.r);
        X.T(new Throwable[0]);
        if (this.p.h(this.k) == 0) {
            f(false);
        } else {
            f(!abm.d(r0));
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byr a2;
        List<String> a3 = this.s.a(this.k);
        this.q = a3;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.k);
        sb.append(", tags={ ");
        boolean z = false;
        boolean z2 = true;
        for (String str : a3) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(str);
            z2 = false;
        }
        sb.append(" } ]");
        this.r = sb.toString();
        if (c()) {
            return;
        }
        this.o.h();
        try {
            cda a4 = this.p.a(this.k);
            this.c = a4;
            if (a4 == null) {
                ajbh.X();
                ajbh.U(a, String.format("Didn't find WorkSpec for id %s", this.k), new Throwable[0]);
                f(false);
                this.o.j();
                return;
            }
            if (a4.r != 1) {
                g();
                this.o.j();
                ajbh X = ajbh.X();
                String.format("%s is not in ENQUEUED state. Nothing more to do.", this.c.d);
                X.T(new Throwable[0]);
                return;
            }
            if (a4.e() || this.c.d()) {
                long currentTimeMillis = System.currentTimeMillis();
                cda cdaVar = this.c;
                if (cdaVar.n != 0 && currentTimeMillis < cdaVar.a()) {
                    ajbh X2 = ajbh.X();
                    String.format("Delaying execution for %s because it is being executed before schedule.", this.c.d);
                    X2.T(new Throwable[0]);
                    f(true);
                    this.o.j();
                    return;
                }
            }
            this.o.j();
            this.o.i();
            if (this.c.e()) {
                a2 = this.c.f;
            } else {
                abd abdVar = this.m.h;
                byv b = byv.b(this.c.e);
                if (b == null) {
                    ajbh.X();
                    ajbh.U(a, String.format("Could not create Input Merger %s", this.c.e), new Throwable[0]);
                    b();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c.f);
                cdb cdbVar = this.p;
                String str2 = this.k;
                btn a5 = btn.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                if (str2 == null) {
                    a5.e(1);
                } else {
                    a5.f(1, str2);
                }
                cdl cdlVar = (cdl) cdbVar;
                cdlVar.a.g();
                Cursor e = jr.e(cdlVar.a, a5, false);
                try {
                    ArrayList arrayList2 = new ArrayList(e.getCount());
                    while (e.moveToNext()) {
                        arrayList2.add(byr.a(e.getBlob(0)));
                    }
                    e.close();
                    a5.i();
                    arrayList.addAll(arrayList2);
                    a2 = b.a(arrayList);
                } catch (Throwable th) {
                    e.close();
                    a5.i();
                    throw th;
                }
            }
            byr byrVar = a2;
            UUID fromString = UUID.fromString(this.k);
            List list = this.q;
            int i = this.c.l;
            bym bymVar = this.m;
            Executor executor = bymVar.a;
            bzm bzmVar = bymVar.c;
            int i2 = cej.a;
            WorkerParameters workerParameters = new WorkerParameters(fromString, byrVar, list, i, executor, bzmVar, new cei(this.o, this.n, this.g));
            if (this.d == null) {
                this.d = this.m.c.b(this.b, this.c.d, workerParameters);
            }
            ListenableWorker listenableWorker = this.d;
            if (listenableWorker == null) {
                ajbh.X();
                ajbh.U(a, String.format("Could not create Worker %s", this.c.d), new Throwable[0]);
                b();
                return;
            }
            if (listenableWorker.d) {
                ajbh.X();
                ajbh.U(a, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.c.d), new Throwable[0]);
                b();
                return;
            }
            listenableWorker.d = true;
            this.o.h();
            try {
                if (this.p.h(this.k) == 1) {
                    this.p.k(2, this.k);
                    cdb cdbVar2 = this.p;
                    String str3 = this.k;
                    ((cdl) cdbVar2).a.g();
                    buu d = ((cdl) cdbVar2).c.d();
                    if (str3 == null) {
                        d.e(1);
                    } else {
                        d.f(1, str3);
                    }
                    ((cdl) cdbVar2).a.h();
                    try {
                        d.b();
                        ((cdl) cdbVar2).a.j();
                        ((cdl) cdbVar2).a.i();
                        ((cdl) cdbVar2).c.e(d);
                        z = true;
                    } catch (Throwable th2) {
                        ((cdl) cdbVar2).a.i();
                        ((cdl) cdbVar2).c.e(d);
                        throw th2;
                    }
                }
                this.o.j();
                if (!z) {
                    g();
                    return;
                }
                if (c()) {
                    return;
                }
                cex h = cex.h();
                ceg cegVar = new ceg(this.b, this.c, this.d, workerParameters.g, this.g);
                this.g.c.execute(cegVar);
                cex cexVar = cegVar.f;
                cexVar.d(new cak(this, cexVar, h), this.g.c);
                h.d(new cal(this, h, this.r), this.g.a);
            } finally {
            }
        } finally {
        }
    }
}
