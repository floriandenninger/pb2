package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azfj extends AtomicBoolean implements ayqd, ayqx {
    private static final long serialVersionUID = -8223395059921494546L;
    final ayqd a;
    final Callable d;
    ayqx e;
    long g;
    final int b = 2;
    final int c = 1;
    final ArrayDeque f = new ArrayDeque();

    public azfj(ayqd ayqdVar, Callable callable) {
        this.a = ayqdVar;
        this.d = callable;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.f.clear();
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        long j = this.g;
        this.g = 1 + j;
        long j2 = j % this.c;
        try {
            this.f.offer(((azqe) this.d).call());
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(obj);
                if (this.b <= collection.size()) {
                    it.remove();
                    this.a.c(collection);
                }
            }
        } catch (Throwable th) {
            this.f.clear();
            this.e.qc();
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.e.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.e, ayqxVar)) {
            this.e = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        while (!this.f.isEmpty()) {
            this.a.c(this.f.poll());
        }
        this.a.sh();
    }
}
