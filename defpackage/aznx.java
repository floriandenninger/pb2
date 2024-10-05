package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznx extends azpx implements ayqk {
    private static final long serialVersionUID = 187782011903685568L;
    ayqx a;

    public aznx(banw banwVar) {
        super(banwVar);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.f.b(th);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        g(obj);
    }

    @Override // defpackage.azpx, defpackage.banx
    public final void sd() {
        super.sd();
        this.a.qc();
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.a, ayqxVar)) {
            this.a = ayqxVar;
            this.f.f(this);
        }
    }
}
