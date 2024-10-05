package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mip extends miq {
    final /* synthetic */ mit a;

    public mip(mit mitVar) {
        this.a = mitVar;
    }

    @Override // defpackage.miq
    public final int a() {
        return 5;
    }

    @Override // defpackage.miq
    public final void b() {
        amkq.E(this.a.k.isPresent());
        amkq.E(this.a.l.isPresent());
        amkq.E(this.a.m.isPresent());
        mit mitVar = this.a;
        amkq.E(mitVar.k.isPresent());
        mitVar.i.a(mitVar);
    }

    @Override // defpackage.miq
    public final void c(int i) {
        amkq.F(amsx.u(1, 2, 5, 7).contains(Integer.valueOf(i)), d(i));
        this.a.i.a(null);
        if (i != 7) {
            this.a.b();
        }
    }
}
