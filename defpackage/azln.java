package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azln extends AtomicReference implements ayqd, ayqx {
    private static final long serialVersionUID = -312246233408980075L;
    final ayqd a;
    final ayro b;
    final AtomicReference c = new AtomicReference();
    final AtomicReference d = new AtomicReference();

    public azln(ayqd ayqdVar, ayro ayroVar) {
        this.a = ayqdVar;
        this.b = ayroVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        ayrz.c(this.d);
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object a = this.b.a(obj, obj2);
                aysw.b(a, "The combiner returned a null value");
                this.a.c(a);
            } catch (Throwable th) {
                aynu.c(th);
                qc();
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) this.c.get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this.c);
        ayrz.c(this.d);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.c, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        ayrz.c(this.d);
        this.a.sh();
    }
}
