package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayxp extends azpv implements aypq {
    private static final long serialVersionUID = 8443155186132538303L;
    final banw a;
    final ayrv c;
    banx f;
    volatile boolean g;
    final azqf b = new azqf();
    final ayqw d = new ayqw();
    final int e = Integer.MAX_VALUE;

    public ayxp(banw banwVar, ayrv ayrvVar) {
        this.a = banwVar;
        this.c = ayrvVar;
        lazySet(1);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (azqi.e(this.b, th)) {
            sd();
            if (getAndSet(0) > 0) {
                this.a.b(azqi.d(this.b));
                return;
            }
            return;
        }
        aynu.j(th);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, aypk] */
    @Override // defpackage.banw
    public final void c(Object obj) {
        try {
            ?? a = this.c.a(obj);
            getAndIncrement();
            ayxo ayxoVar = new ayxo(this);
            if (this.g || !this.d.d(ayxoVar)) {
                return;
            }
            a.U(ayxoVar);
        } catch (Throwable th) {
            aynu.c(th);
            this.f.sd();
            b(th);
        }
    }

    @Override // defpackage.aytf
    public final void d() {
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.f, banxVar)) {
            this.f = banxVar;
            this.a.f(this);
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                banxVar.sj(Long.MAX_VALUE);
            } else {
                banxVar.sj(i);
            }
        }
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return true;
    }

    @Override // defpackage.banx
    public final void sd() {
        this.g = true;
        this.f.sd();
        this.d.qc();
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return null;
    }

    @Override // defpackage.banw
    public final void sh() {
        if (decrementAndGet() != 0) {
            if (this.e != Integer.MAX_VALUE) {
                this.f.sj(1L);
            }
        } else {
            Throwable d = azqi.d(this.b);
            if (d != null) {
                this.a.b(d);
            } else {
                this.a.sh();
            }
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
    }
}
