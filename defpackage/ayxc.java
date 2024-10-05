package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxc extends azpx implements aypq {
    private static final long serialVersionUID = 4066607327284737757L;
    final Object a;
    final boolean b;
    banx c;
    long d;
    boolean e;

    public ayxc(banw banwVar, Object obj, boolean z) {
        super(banwVar);
        this.a = obj;
        this.b = z;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.e) {
            aynu.j(th);
        } else {
            this.e = true;
            this.f.b(th);
        }
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
        g(obj);
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
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.a;
        if (obj != null) {
            g(obj);
        } else if (this.b) {
            this.f.b(new NoSuchElementException());
        } else {
            this.f.sh();
        }
    }
}
