package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azmr extends AtomicReference implements ayqd, ayqx {
    private static final long serialVersionUID = -8565274649390031272L;
    final ayqk a;
    final ayqm b;
    boolean c;

    public azmr(ayqk ayqkVar, ayqm ayqmVar) {
        this.a = ayqkVar;
        this.b = ayqmVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.c) {
            aynu.j(th);
        } else {
            this.c = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        ((ayqx) get()).qc();
        sh();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.f(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.Z(new azea(this, this.a, 1));
    }
}
