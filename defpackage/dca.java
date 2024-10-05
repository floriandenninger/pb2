package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dca implements dbu, dbs {
    public volatile dbs a;
    public volatile dbs b;
    private final dbu c;
    private final Object d;
    private dbt e = dbt.CLEARED;
    private dbt f = dbt.CLEARED;
    private boolean g;

    public dca(Object obj, dbu dbuVar) {
        this.d = obj;
        this.c = dbuVar;
    }

    @Override // defpackage.dbu
    public final dbu a() {
        dbu a;
        synchronized (this.d) {
            dbu dbuVar = this.c;
            a = dbuVar != null ? dbuVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.dbs
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != dbt.SUCCESS && this.f != dbt.RUNNING) {
                    this.f = dbt.RUNNING;
                    this.b.b();
                }
                if (this.g && this.e != dbt.RUNNING) {
                    this.e = dbt.RUNNING;
                    this.a.b();
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.dbs
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = dbt.CLEARED;
            this.f = dbt.CLEARED;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.dbu
    public final void d(dbs dbsVar) {
        synchronized (this.d) {
            if (!dbsVar.equals(this.a)) {
                this.f = dbt.FAILED;
                return;
            }
            this.e = dbt.FAILED;
            dbu dbuVar = this.c;
            if (dbuVar != null) {
                dbuVar.d(this);
            }
        }
    }

    @Override // defpackage.dbu
    public final void e(dbs dbsVar) {
        synchronized (this.d) {
            if (dbsVar.equals(this.b)) {
                this.f = dbt.SUCCESS;
                return;
            }
            this.e = dbt.SUCCESS;
            dbu dbuVar = this.c;
            if (dbuVar != null) {
                dbuVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.dbs
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = dbt.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = dbt.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.dbu
    public final boolean g(dbs dbsVar) {
        boolean z;
        synchronized (this.d) {
            dbu dbuVar = this.c;
            z = false;
            if ((dbuVar == null || dbuVar.g(this)) && dbsVar.equals(this.a) && this.e != dbt.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dbu
    public final boolean h(dbs dbsVar) {
        boolean z;
        synchronized (this.d) {
            dbu dbuVar = this.c;
            z = false;
            if ((dbuVar == null || dbuVar.h(this)) && dbsVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
    
        if (r4.e == defpackage.dbt.SUCCESS) goto L9;
     */
    @Override // defpackage.dbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.dbs r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            dbu r1 = r4.c     // Catch: java.lang.Throwable -> L22
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.i(r4)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L10
            goto L12
        L10:
            r2 = 0
            goto L20
        L12:
            dbs r1 = r4.a     // Catch: java.lang.Throwable -> L22
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> L22
            if (r5 != 0) goto L20
            dbt r5 = r4.e     // Catch: java.lang.Throwable -> L22
            dbt r1 = defpackage.dbt.SUCCESS     // Catch: java.lang.Throwable -> L22
            if (r5 == r1) goto L10
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r2
        L22:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L26
        L25:
            throw r5
        L26:
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dca.i(dbs):boolean");
    }

    @Override // defpackage.dbu, defpackage.dbs
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == dbt.CLEARED;
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == dbt.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean m(dbs dbsVar) {
        if (dbsVar instanceof dca) {
            dca dcaVar = (dca) dbsVar;
            if (this.a != null ? this.a.m(dcaVar.a) : dcaVar.a == null) {
                if (this.b == null) {
                    if (dcaVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(dcaVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dbs
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == dbt.RUNNING;
        }
        return z;
    }
}
