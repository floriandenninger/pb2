package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayva extends AtomicReference implements Runnable, aypi, ayqx {
    private static final long serialVersionUID = 8571289934935992137L;
    final aypi a;
    final ayqi b;
    Throwable c;

    public ayva(aypi aypiVar, ayqi ayqiVar) {
        this.a = aypiVar;
        this.b = ayqiVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.c = th;
        ayrz.i(this, this.b.f(this));
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.c;
        if (th == null) {
            this.a.sh();
        } else {
            this.c = null;
            this.a.b(th);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        ayrz.i(this, this.b.f(this));
    }
}
