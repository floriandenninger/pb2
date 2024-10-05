package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ablk implements yfb {
    final /* synthetic */ ablm a;

    public ablk(ablm ablmVar) {
        this.a = ablmVar;
    }

    @Override // defpackage.yfb
    public final CharSequence a(asgd asgdVar) {
        aspb aspbVar;
        if (((asgdVar.b == 136403337 ? (aspb) asgdVar.c : aspb.a).b & 1) == 0) {
            return null;
        }
        if (asgdVar.b == 136403337) {
            aspbVar = (aspb) asgdVar.c;
        } else {
            aspbVar = aspb.a;
        }
        aqyg aqygVar = aspbVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.yfb
    public final void b() {
        this.a.n(false);
    }

    @Override // defpackage.yfb
    public final void c(CharSequence charSequence) {
        this.a.i(charSequence);
    }

    @Override // defpackage.yfb
    public final void d() {
        this.a.j();
    }
}
