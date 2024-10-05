package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgv implements ayqd, ayqx {
    final ayqd a;
    final Object b;
    final boolean c;
    ayqx d;
    long e;
    boolean f;

    public azgv(ayqd ayqdVar, Object obj, boolean z) {
        this.a = ayqdVar;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.f) {
            aynu.j(th);
        } else {
            this.f = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        long j = this.e;
        if (j != 0) {
            this.e = j + 1;
            return;
        }
        this.f = true;
        this.d.qc();
        this.a.c(obj);
        this.a.sh();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.d.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.d, ayqxVar)) {
            this.d = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.f) {
            return;
        }
        this.f = true;
        Object obj = this.b;
        if (obj != null || !this.c) {
            if (obj != null) {
                this.a.c(obj);
            }
            this.a.sh();
            return;
        }
        this.a.b(new NoSuchElementException());
    }
}
