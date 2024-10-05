package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azpt extends AtomicLong implements aypq, banx {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final banw b;
    protected banx c;
    protected Object d;
    protected long e;

    public azpt(banw banwVar) {
        this.b = banwVar;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.c, banxVar)) {
            this.c = banxVar;
            this.b.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.c.sd();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        long j2;
        if (!azqb.h(j)) {
            return;
        }
        do {
            j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                    this.b.c(this.d);
                    this.b.sh();
                    return;
                }
                return;
            }
        } while (!compareAndSet(j2, ayeq.l(j2, j)));
        this.c.sj(j);
    }
}
