package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznt extends AtomicReference implements Runnable, ayqk, ayqx {
    private static final long serialVersionUID = 7000911171163930287L;
    final ayqk a;
    final aysd b = new aysd();
    final ayqm c;

    public aznt(ayqk ayqkVar, ayqm ayqmVar) {
        this.a = ayqkVar;
        this.c = ayqmVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
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
        ayrz.c(this.b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.Z(this);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.a.sc(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }
}
