package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbp implements dbu, dbs {
    public volatile dbs a;
    public volatile dbs b;
    private final Object c;
    private final dbu d;
    private dbt e = dbt.CLEARED;
    private dbt f = dbt.CLEARED;

    public dbp(Object obj, dbu dbuVar) {
        this.c = obj;
        this.d = dbuVar;
    }

    private final boolean o(dbs dbsVar) {
        return dbsVar.equals(this.a) || (this.e == dbt.FAILED && dbsVar.equals(this.b));
    }

    @Override // defpackage.dbu
    public final dbu a() {
        dbu a;
        synchronized (this.c) {
            dbu dbuVar = this.d;
            a = dbuVar != null ? dbuVar.a() : this;
        }
        return a;
    }

    @Override // defpackage.dbs
    public final void b() {
        synchronized (this.c) {
            if (this.e != dbt.RUNNING) {
                this.e = dbt.RUNNING;
                this.a.b();
            }
        }
    }

    @Override // defpackage.dbs
    public final void c() {
        synchronized (this.c) {
            this.e = dbt.CLEARED;
            this.a.c();
            if (this.f != dbt.CLEARED) {
                this.f = dbt.CLEARED;
                this.b.c();
            }
        }
    }

    @Override // defpackage.dbu
    public final void d(dbs dbsVar) {
        synchronized (this.c) {
            if (!dbsVar.equals(this.b)) {
                this.e = dbt.FAILED;
                if (this.f != dbt.RUNNING) {
                    this.f = dbt.RUNNING;
                    this.b.b();
                }
                return;
            }
            this.f = dbt.FAILED;
            dbu dbuVar = this.d;
            if (dbuVar != null) {
                dbuVar.d(this);
            }
        }
    }

    @Override // defpackage.dbu
    public final void e(dbs dbsVar) {
        synchronized (this.c) {
            if (dbsVar.equals(this.a)) {
                this.e = dbt.SUCCESS;
            } else if (dbsVar.equals(this.b)) {
                this.f = dbt.SUCCESS;
            }
            dbu dbuVar = this.d;
            if (dbuVar != null) {
                dbuVar.e(this);
            }
        }
    }

    @Override // defpackage.dbs
    public final void f() {
        synchronized (this.c) {
            if (this.e == dbt.RUNNING) {
                this.e = dbt.PAUSED;
                this.a.f();
            }
            if (this.f == dbt.RUNNING) {
                this.f = dbt.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.dbu
    public final boolean g(dbs dbsVar) {
        boolean z;
        synchronized (this.c) {
            dbu dbuVar = this.d;
            z = false;
            if ((dbuVar == null || dbuVar.g(this)) && o(dbsVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dbu
    public final boolean h(dbs dbsVar) {
        boolean z;
        synchronized (this.c) {
            dbu dbuVar = this.d;
            z = false;
            if ((dbuVar == null || dbuVar.h(this)) && o(dbsVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dbu
    public final boolean i(dbs dbsVar) {
        boolean z;
        synchronized (this.c) {
            dbu dbuVar = this.d;
            z = false;
            if ((dbuVar == null || dbuVar.i(this)) && o(dbsVar)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dbu, defpackage.dbs
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == dbt.CLEARED && this.f == dbt.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != dbt.SUCCESS && this.f != dbt.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.dbs
    public final boolean m(dbs dbsVar) {
        if (dbsVar instanceof dbp) {
            dbp dbpVar = (dbp) dbsVar;
            if (this.a.m(dbpVar.a) && this.b.m(dbpVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dbs
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != dbt.RUNNING && this.f != dbt.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
