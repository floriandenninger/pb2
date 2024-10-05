package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvo extends ayti implements aypi {
    final ayqd a;
    ayqx b;

    public ayvo(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.aytf
    public final void d() {
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return true;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 2;
    }

    @Override // defpackage.aytf
    public final /* bridge */ /* synthetic */ Object sg() {
        return null;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.a.sh();
    }
}
