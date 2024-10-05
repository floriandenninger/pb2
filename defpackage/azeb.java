package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azeb extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = 4603919676453758899L;
    final ayqk a;
    final ayqm b;

    public azeb(ayqk ayqkVar, ayqm ayqmVar) {
        this.a = ayqkVar;
        this.b = ayqmVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.a.sc(obj);
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        ayqx ayqxVar = (ayqx) get();
        if (ayqxVar == ayrz.a || !compareAndSet(ayqxVar, null)) {
            return;
        }
        this.b.Z(new azea(this.a, this, 0));
    }
}
