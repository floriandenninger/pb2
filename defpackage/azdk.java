package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdk extends AtomicReference implements Runnable, aypt, ayqx {
    private static final long serialVersionUID = 8571289934935992137L;
    final aypt a;
    final ayqi b;
    Object c;
    Throwable d;

    public azdk(aypt ayptVar, ayqi ayqiVar) {
        this.a = ayptVar;
        this.b = ayqiVar;
    }

    @Override // defpackage.aypt
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
            this.d = null;
            this.a.b(th);
            return;
        }
        Object obj = this.c;
        if (obj != null) {
            this.c = null;
            this.a.sc(obj);
        } else {
            this.a.sh();
        }
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.c = obj;
        ayrz.i(this, this.b.f(this));
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        ayrz.i(this, this.b.f(this));
    }
}
