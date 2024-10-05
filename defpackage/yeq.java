package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yeq implements yfb {
    final /* synthetic */ yer a;

    public yeq(yer yerVar) {
        this.a = yerVar;
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
    }

    @Override // defpackage.yfb
    public final void c(CharSequence charSequence) {
        this.a.s.d(charSequence.toString());
    }

    @Override // defpackage.yfb
    public final void d() {
    }
}
