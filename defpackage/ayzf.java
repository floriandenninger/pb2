package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzf extends AtomicInteger implements aypq, banx {
    private static final long serialVersionUID = 3240706908776709697L;
    final banw a;
    final aypf b;
    final long c = 1;
    final AtomicLong d = new AtomicLong();
    final Deque e = new ArrayDeque();
    banx f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;

    public ayzf(banw banwVar, aypf aypfVar) {
        this.a = banwVar;
        this.b = aypfVar;
    }

    static final void g(Deque deque) {
        synchronized (deque) {
            deque.clear();
        }
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
            return;
        }
        this.i = th;
        this.h = true;
        d();
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        boolean z;
        boolean z2;
        if (this.h) {
            return;
        }
        Deque deque = this.e;
        synchronized (deque) {
            z = true;
            z2 = false;
            if (deque.size() == this.c) {
                aypf aypfVar = aypf.ERROR;
                int ordinal = this.b.ordinal();
                if (ordinal == 1) {
                    deque.poll();
                    deque.offer(obj);
                } else if (ordinal != 2) {
                    z = false;
                    z2 = true;
                } else {
                    deque.pollLast();
                    deque.offer(obj);
                }
            } else {
                deque.offer(obj);
                z = false;
            }
        }
        if (z) {
            return;
        }
        if (z2) {
            this.f.sd();
            b(new ayrg());
        } else {
            d();
        }
    }

    final void d() {
        boolean isEmpty;
        Object poll;
        if (getAndIncrement() != 0) {
            return;
        }
        Deque deque = this.e;
        banw banwVar = this.a;
        int i = 1;
        do {
            long j = this.d.get();
            long j2 = 0;
            while (j2 != j) {
                if (!this.g) {
                    boolean z = this.h;
                    synchronized (deque) {
                        poll = deque.poll();
                    }
                    if (z) {
                        Throwable th = this.i;
                        if (th != null) {
                            g(deque);
                            banwVar.b(th);
                            return;
                        } else if (poll == null) {
                            banwVar.sh();
                            return;
                        }
                    } else if (poll == null) {
                        break;
                    }
                    banwVar.c(poll);
                    j2++;
                } else {
                    g(deque);
                    return;
                }
            }
            if (j2 == j) {
                if (!this.g) {
                    boolean z2 = this.h;
                    synchronized (deque) {
                        isEmpty = deque.isEmpty();
                    }
                    if (z2) {
                        Throwable th2 = this.i;
                        if (th2 != null) {
                            g(deque);
                            banwVar.b(th2);
                            return;
                        } else if (isEmpty) {
                            banwVar.sh();
                            return;
                        }
                    }
                } else {
                    g(deque);
                    return;
                }
            }
            if (j2 != 0) {
                ayeq.n(this.d, j2);
            }
            i = addAndGet(-i);
        } while (i != 0);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.f, banxVar)) {
            this.f = banxVar;
            this.a.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.g = true;
        this.f.sd();
        if (getAndIncrement() == 0) {
            g(this.e);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        this.h = true;
        d();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.j(this.d, j);
            d();
        }
    }
}
