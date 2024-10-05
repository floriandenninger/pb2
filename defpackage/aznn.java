package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznn extends AtomicReference implements Runnable, ayqk, ayqx {
    private static final long serialVersionUID = 3528003840217436037L;
    final ayqk a;
    final ayqi b;
    Object c;
    Throwable d;

    public aznn(ayqk ayqkVar, ayqi ayqiVar) {
        this.a = ayqkVar;
        this.b = ayqiVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.d = th;
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
        Throwable th = this.d;
        if (th != null) {
            this.a.b(th);
        } else {
            this.a.sc(this.c);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.c = obj;
        ayrz.i(this, this.b.f(this));
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }
}
