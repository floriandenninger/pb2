package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azrt extends ayth {
    private static final long serialVersionUID = 7926949470189395511L;
    final /* synthetic */ azru a;

    public azrt(azru azruVar) {
        this.a = azruVar;
    }

    @Override // defpackage.aytf
    public final void d() {
        this.a.a.d();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.a.d;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.a.a.j();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.a.d) {
            return;
        }
        this.a.d = true;
        this.a.e();
        this.a.b.lazySet(null);
        if (this.a.h.getAndIncrement() == 0) {
            this.a.b.lazySet(null);
            this.a.a.d();
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.a.i = true;
        return 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        return this.a.a.sg();
    }
}
