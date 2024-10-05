package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzn extends azpt {
    private static final long serialVersionUID = -3740826063558713822L;
    final ayrv a;

    public ayzn(banw banwVar, ayrv ayrvVar) {
        super(banwVar);
        this.a = ayrvVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        try {
            Object obj = ((aysq) this.a).a;
            aysw.b(obj, "The valueSupplier returned a null value");
            long j = this.e;
            if (j != 0) {
                ayeq.n(this, j);
            }
            while (true) {
                long j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    return;
                }
                if ((j2 & Long.MAX_VALUE) == 0) {
                    this.d = obj;
                    if (compareAndSet(0L, Long.MIN_VALUE)) {
                        return;
                    } else {
                        this.d = null;
                    }
                } else {
                    lazySet(-9223372036854775807L);
                    this.b.c(obj);
                    this.b.sh();
                    return;
                }
            }
        } catch (Throwable th2) {
            aynu.c(th2);
            this.b.b(new ayrf(th, th2));
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.e++;
        this.b.c(obj);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.b.sh();
    }
}
