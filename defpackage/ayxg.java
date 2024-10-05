package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxg implements aypq, ayqx {
    final ayqk a;
    final Object b;
    banx c;
    long d;
    boolean e;

    public ayxg(ayqk ayqkVar, Object obj) {
        this.a = ayqkVar;
        this.b = obj;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.e) {
            aynu.j(th);
            return;
        }
        this.e = true;
        this.c = azqb.a;
        this.a.b(th);
    }

    @Override // defpackage.banw
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
        this.c.sd();
        this.c = azqb.a;
        this.a.sc(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c == azqb.a;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            this.c = banxVar;
            this.a.se(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.sd();
        this.c = azqb.a;
    }

    @Override // defpackage.banw
    public final void sh() {
        this.c = azqb.a;
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
