package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class win implements wig {
    final /* synthetic */ wir a;

    public win(wir wirVar) {
        this.a = wirVar;
    }

    @Override // defpackage.wig
    public final void a() {
        wir wirVar = this.a;
        if (!((wdd) wirVar.a.get()).t()) {
            wirVar.f(true);
        }
        wirVar.g(wjb.CANCELLED, null);
        wirVar.c.f(new wix());
        wirVar.b.execute(new wip(wirVar, 0));
    }

    @Override // defpackage.wig
    public final void b(Exception exc) {
        this.a.e(exc);
    }

    @Override // defpackage.wig
    public final void c(aata aataVar) {
        this.a.m(aataVar, null);
    }
}
