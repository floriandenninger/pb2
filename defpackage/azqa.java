package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azqa extends AtomicInteger implements banx {
    private static final long serialVersionUID = -2189523197179400958L;
    public banx f;
    public long g;
    public final AtomicReference h = new AtomicReference();
    final AtomicLong i = new AtomicLong();
    public final AtomicLong j = new AtomicLong();
    public volatile boolean k;
    protected boolean l;

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        g();
    }

    public final void g() {
        int i = 1;
        banx banxVar = null;
        long j = 0;
        do {
            banx banxVar2 = (banx) this.h.get();
            if (banxVar2 != null) {
                banxVar2 = (banx) this.h.getAndSet(null);
            }
            long j2 = this.i.get();
            if (j2 != 0) {
                j2 = this.i.getAndSet(0L);
            }
            long j3 = this.j.get();
            if (j3 != 0) {
                j3 = this.j.getAndSet(0L);
            }
            banx banxVar3 = this.f;
            if (this.k) {
                if (banxVar3 != null) {
                    banxVar3.sd();
                    this.f = null;
                }
                if (banxVar2 != null) {
                    banxVar2.sd();
                }
            } else {
                long j4 = this.g;
                if (j4 != Long.MAX_VALUE) {
                    j4 = ayeq.l(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            azqb.b(j4);
                            j4 = 0;
                        }
                    }
                    this.g = j4;
                }
                if (banxVar2 != null) {
                    this.f = banxVar2;
                    if (j4 != 0) {
                        j = ayeq.l(j, j4);
                        banxVar = banxVar2;
                    }
                } else if (banxVar3 != null && j2 != 0) {
                    j = ayeq.l(j, j2);
                    banxVar = banxVar3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            banxVar.sj(j);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        if (this.k) {
            return;
        }
        this.k = true;
        d();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (!azqb.h(j) || this.l) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ayeq.j(this.i, j);
            d();
            return;
        }
        long j2 = this.g;
        if (j2 != Long.MAX_VALUE) {
            long l = ayeq.l(j2, j);
            this.g = l;
            if (l == Long.MAX_VALUE) {
                this.l = true;
            }
        }
        banx banxVar = this.f;
        if (decrementAndGet() != 0) {
            g();
        }
        if (banxVar != null) {
            banxVar.sj(j);
        }
    }
}
