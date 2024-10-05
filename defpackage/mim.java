package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mim extends miq {
    final /* synthetic */ mit a;

    public mim(mit mitVar) {
        this.a = mitVar;
    }

    @Override // defpackage.miq
    public final int a() {
        return 7;
    }

    @Override // defpackage.miq
    public final void b() {
        amkq.E(this.a.k.isPresent());
        amkq.E(!this.a.m.isPresent());
        this.a.f(true);
    }

    @Override // defpackage.miq
    public final void c(int i) {
        amkq.E(this.a.l.isPresent());
        amkq.E(this.a.m.isPresent());
        amkq.F(amsx.t(1, 2, 5).contains(Integer.valueOf(i)), d(i));
        this.a.g();
        if (i == 5) {
            return;
        }
        this.a.b();
    }
}
