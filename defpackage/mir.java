package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mir extends miq {
    final /* synthetic */ mit a;

    public mir(mit mitVar) {
        this.a = mitVar;
    }

    @Override // defpackage.miq
    public final int a() {
        return 1;
    }

    @Override // defpackage.miq
    public final void b() {
        mit mitVar = this.a;
        mitVar.g.o(mitVar);
        if (this.a.k.isPresent() && this.a.j.isPresent()) {
            ((gfr) this.a.k.get()).l().aF((lo) this.a.j.get());
        }
        this.a.k = Optional.empty();
        this.a.l = Optional.empty();
        this.a.m = Optional.empty();
    }

    @Override // defpackage.miq
    public final void c(int i) {
        boolean z = true;
        if (i != 2 && i != 1) {
            z = false;
        }
        amkq.F(z, d(i));
        if (i == 2) {
            amkq.F(this.a.k.isPresent(), "Must have autoplayVideosController to exit to INITIALIZED state.");
        }
    }
}
