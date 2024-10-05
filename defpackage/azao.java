package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azao implements aypq, ayqx {
    final ayqk a;
    final Object b;
    banx c;
    boolean d;
    Object e;

    public azao(ayqk ayqkVar, Object obj) {
        this.a = ayqkVar;
        this.b = obj;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
            return;
        }
        this.d = true;
        this.c = azqb.a;
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e == null) {
            this.e = obj;
            return;
        }
        this.d = true;
        this.c.sd();
        this.c = azqb.a;
        this.a.b(new IllegalArgumentException("Sequence contains more than one element!"));
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
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = azqb.a;
        Object obj = this.e;
        this.e = null;
        if (obj == null) {
            obj = this.b;
        }
        if (obj != null) {
            this.a.sc(obj);
        } else {
            this.a.b(new NoSuchElementException());
        }
    }
}
