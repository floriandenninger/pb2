package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azhj extends ayth implements ayqd {
    private static final long serialVersionUID = 8443155186132538303L;
    final ayqd a;
    final ayrv c;
    ayqx e;
    volatile boolean f;
    final azqf b = new azqf();
    final ayqw d = new ayqw();

    public azhj(ayqd ayqdVar, ayrv ayrvVar) {
        this.a = ayqdVar;
        this.c = ayrvVar;
        lazySet(1);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (azqi.e(this.b, th)) {
            qc();
            if (getAndSet(0) > 0) {
                this.a.b(azqi.d(this.b));
                return;
            }
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        try {
            aypk aypkVar = (aypk) this.c.a(obj);
            aysw.b(aypkVar, "The mapper returned a null CompletableSource");
            getAndIncrement();
            azhi azhiVar = new azhi(this);
            if (this.f || !this.d.d(azhiVar)) {
                return;
            }
            aypkVar.U(azhiVar);
        } catch (Throwable th) {
            aynu.c(th);
            this.e.qc();
            b(th);
        }
    }

    @Override // defpackage.aytf
    public final void d() {
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return true;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.f = true;
        this.e.qc();
        this.d.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.e, ayqxVar)) {
            this.e = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return null;
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (decrementAndGet() == 0) {
            Throwable d = azqi.d(this.b);
            if (d != null) {
                this.a.b(d);
            } else {
                this.a.sh();
            }
        }
    }
}
