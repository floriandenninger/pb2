package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayuj extends AtomicInteger implements aypi, ayqx {
    private static final long serialVersionUID = 4109457741734051389L;
    final aypi a;
    final ayrm b;
    ayqx c;

    public ayuj(aypi aypiVar, ayrm ayrmVar) {
        this.a = aypiVar;
        this.b = ayrmVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
        c();
    }

    final void c() {
        if (compareAndSet(0, 1)) {
            try {
                this.b.a();
            } catch (Throwable th) {
                aynu.c(th);
                aynu.j(th);
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
        c();
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.sh();
        c();
    }
}
