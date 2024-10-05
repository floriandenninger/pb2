package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbt extends AtomicReference implements aysx, banx {
    private static final long serialVersionUID = -312246233408980075L;
    final banw a;
    final ayro b;
    final AtomicReference c = new AtomicReference();
    final AtomicLong d = new AtomicLong();
    final AtomicReference e = new AtomicReference();

    public azbt(banw banwVar, ayro ayroVar) {
        this.a = banwVar;
        this.b = ayroVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azqb.f(this.e);
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (e(obj)) {
            return;
        }
        ((banx) this.c.get()).sj(1L);
    }

    @Override // defpackage.aysx
    public final boolean e(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object a = this.b.a(obj, obj2);
                aysw.b(a, "The combiner returned a null value");
                this.a.c(a);
                return true;
            } catch (Throwable th) {
                aynu.c(th);
                sd();
                this.a.b(th);
            }
        }
        return false;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.j(this.c, this.d, banxVar);
    }

    @Override // defpackage.banx
    public final void sd() {
        azqb.f(this.c);
        azqb.f(this.e);
    }

    @Override // defpackage.banw
    public final void sh() {
        azqb.f(this.e);
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        azqb.a(this.c, this.d, j);
    }
}
