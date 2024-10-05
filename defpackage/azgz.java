package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgz implements ayqd, ayqx {
    final ayqk a;
    final Object b;
    ayqx c;
    long d;
    boolean e;

    public azgz(ayqk ayqkVar, Object obj) {
        this.a = ayqkVar;
        this.b = obj;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.e) {
            aynu.j(th);
        } else {
            this.e = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.qc();
        this.a.sc(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.b;
        if (obj != null) {
            this.a.sc(obj);
        } else {
            this.a.b(new NoSuchElementException());
        }
    }
}
