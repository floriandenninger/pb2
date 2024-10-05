package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvg extends AtomicReference implements Runnable, aypi, ayqx {
    private static final long serialVersionUID = 7000911171163930287L;
    final aypi a;
    final aysd b = new aysd();
    final aypk c;

    public ayvg(aypi aypiVar, aypk aypkVar) {
        this.a = aypiVar;
        this.c = aypkVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
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
        this.c.U(this);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.sh();
    }
}
