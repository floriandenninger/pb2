package androidx.work.impl;

import defpackage.bte;
import defpackage.btj;
import defpackage.bug;
import defpackage.buh;
import defpackage.bui;
import defpackage.buk;
import defpackage.cai;
import defpackage.ccq;
import defpackage.ccw;
import defpackage.cdb;
import defpackage.cdl;
import defpackage.cdo;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile cdb i;
    private volatile cdo j;
    private volatile ccq k;
    private volatile ccw l;
    private volatile cdo m;
    private volatile cdo n;
    private volatile cdo o;

    @Override // defpackage.btl
    protected final btj a() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new btj(this, hashMap, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btl
    public final buk b(bte bteVar) {
        bug bugVar = new bug(bteVar, new cai(this), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        buh a = bui.a(bteVar.b);
        a.b = bteVar.c;
        a.c = bugVar;
        return bteVar.a.a(a.a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cdb r() {
        cdb cdbVar;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new cdl(this);
            }
            cdbVar = this.i;
        }
        return cdbVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ccq t() {
        ccq ccqVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new ccq(this);
            }
            ccqVar = this.k;
        }
        return ccqVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ccw u() {
        ccw ccwVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ccw(this);
            }
            ccwVar = this.l;
        }
        return ccwVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cdo v() {
        cdo cdoVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new cdo(this);
            }
            cdoVar = this.j;
        }
        return cdoVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cdo w() {
        cdo cdoVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new cdo(this, (byte[]) null);
            }
            cdoVar = this.m;
        }
        return cdoVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cdo x() {
        cdo cdoVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new cdo(this, (char[]) null);
            }
            cdoVar = this.n;
        }
        return cdoVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cdo y() {
        cdo cdoVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new cdo(this, null, null);
            }
            cdoVar = this.o;
        }
        return cdoVar;
    }
}
