package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class min extends miq {
    final /* synthetic */ mit a;

    public min(mit mitVar) {
        this.a = mitVar;
    }

    @Override // defpackage.miq
    public final int a() {
        return 2;
    }

    @Override // defpackage.miq
    public final void b() {
        amkq.E(this.a.k.isPresent());
        this.a.l = Optional.empty();
        this.a.m = Optional.empty();
        mit mitVar = this.a;
        mitVar.g.l(mitVar);
    }

    @Override // defpackage.miq
    public final void c(int i) {
        boolean z = true;
        if (i != 1) {
            if (i == 3) {
                i = 3;
            } else {
                z = false;
            }
        }
        amkq.F(z, d(i));
    }
}
