package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tal implements ayqd {
    final /* synthetic */ ayqd a;
    final /* synthetic */ tam b;
    private final AtomicBoolean c = new AtomicBoolean();

    public tal(tam tamVar, ayqd ayqdVar) {
        this.b = tamVar;
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.c.compareAndSet(false, true)) {
            try {
                this.b.a.a(obj);
            } catch (Exception e) {
                throw new syf("Error happened with doOnFirst Action", e);
            }
        }
        this.a.c(obj);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        this.a.se(ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }
}
