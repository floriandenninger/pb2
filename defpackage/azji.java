package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azji extends AtomicReference implements ayqd, ayqx {
    private static final long serialVersionUID = 854110278590336484L;
    final ayqd a;
    ayqx b;

    public azji(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        ayrz.c(this);
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
        ayrz.c(this);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        ayrz.c(this);
        this.a.sh();
    }
}
