package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mis extends miq {
    final /* synthetic */ mit a;

    public mis(mit mitVar) {
        this.a = mitVar;
    }

    @Override // defpackage.miq
    public final int a() {
        return 3;
    }

    @Override // defpackage.miq
    public final void b() {
        amkq.E(this.a.k.isPresent());
        amkq.E(this.a.l.isPresent());
        amkq.E(!this.a.m.isPresent());
        this.a.f(false);
    }

    @Override // defpackage.miq
    public final void c(int i) {
        amkq.F(amsx.t(1, 2, 4).contains(Integer.valueOf(i)), d(i));
        if (i == 4) {
            amkq.E(this.a.m.isPresent());
        }
        this.a.g();
    }
}
