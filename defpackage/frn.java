package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frn extends ajqj {
    private final axpg b;

    public frn(axpg axpgVar) {
        this.b = axpgVar;
    }

    @Override // defpackage.ajph
    public final void a() {
        ((ajqe) this.b.get()).a();
    }

    @Override // defpackage.ajph
    public final void b() {
        ((ajqe) this.b.get()).b();
    }

    @Override // defpackage.ajqj
    protected final boolean c() {
        ajqd ajqdVar = this.a;
        aone aoneVar = ((fro) ajqdVar.a).h;
        aone aoneVar2 = ((fro) ajqdVar.b).h;
        if (aoneVar != null && aoneVar2 != null) {
            aqyg aqygVar = ((aptg) aoneVar.instance).f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            aqyg aqygVar2 = ((aptg) aoneVar2.instance).f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            if (!aqygVar.equals(aqygVar2)) {
                ajqe ajqeVar = (ajqe) this.b.get();
                ajqc a = ajqd.a();
                a.j(ajqdVar.a);
                a.g(ajqdVar.b);
                a.b(ajqdVar.c);
                a.i(ajqdVar.d);
                a.h(ajqdVar.e);
                a.f(ajqdVar.f);
                a.e(ajqdVar.g);
                a.c(ajqdVar.h);
                a.d(ajqdVar.i);
                a.k(ajqdVar.j);
                a.l(ajqdVar.k);
                return ajqeVar.d(a.a());
            }
        }
        return false;
    }
}
