package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azmp extends AtomicReference implements aypi, ayqx {
    private static final long serialVersionUID = -8565274649390031272L;
    final ayqk a;
    final ayqm b;

    public azmp(ayqk ayqkVar, ayqm ayqmVar) {
        this.a = ayqkVar;
        this.b = ayqmVar;
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
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.b.Z(new azea(this, this.a, 1));
    }
}
