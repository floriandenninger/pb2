package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azam extends azpx implements aypq {
    private static final long serialVersionUID = -5526049321428043809L;
    final Object a;
    final boolean b;
    banx c;
    boolean d;

    public azam(banw banwVar, Object obj) {
        super(banwVar);
        this.a = obj;
        this.b = true;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
        } else {
            this.d = true;
            this.f.b(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.g == null) {
            this.g = obj;
            return;
        }
        this.d = true;
        this.c.sd();
        this.f.b(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            this.c = banxVar;
            this.f.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.azpx, defpackage.banx
    public final void sd() {
        super.sd();
        this.c.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.d) {
            return;
        }
        this.d = true;
        Object obj = this.g;
        this.g = null;
        if (obj == null) {
            obj = this.a;
        }
        if (obj != null) {
            g(obj);
        } else if (this.b) {
            this.f.b(new NoSuchElementException());
        } else {
            this.f.sh();
        }
    }
}
