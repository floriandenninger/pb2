package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytl extends AtomicReference implements ayqd, ayqx {
    public static final Object a = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue b;

    public aytl(Queue queue) {
        this.b = queue;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.b.offer(azqm.b(th));
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        Queue queue = this.b;
        azqm azqmVar = azqm.a;
        queue.offer(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (ayrz.c(this)) {
            this.b.offer(a);
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.b.offer(azqm.a);
    }
}
