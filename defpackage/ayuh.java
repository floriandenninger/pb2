package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayuh extends AtomicReference implements Runnable, aypi, ayqx {
    private static final long serialVersionUID = 465972761105851022L;
    final aypi a;
    final long b;
    final TimeUnit c;
    final ayqi d;
    Throwable e;

    public ayuh(aypi aypiVar, long j, TimeUnit timeUnit, ayqi ayqiVar) {
        this.a = aypiVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayqiVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.e = th;
        ayrz.i(this, this.d.c(this, 0L, this.c));
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
        Throwable th = this.e;
        this.e = null;
        if (th != null) {
            this.a.b(th);
        } else {
            this.a.sh();
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
        ayrz.i(this, this.d.c(this, this.b, this.c));
    }
}
