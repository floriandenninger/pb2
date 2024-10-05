package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anma extends anjt {
    public anma(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        annt anntVar = (annt) obj;
        annu annuVar = anntVar.c;
        if (annuVar == null) {
            annuVar = annu.a;
        }
        anns annsVar = annuVar.c;
        if (annsVar == null) {
            annsVar = anns.a;
        }
        annv annvVar = annsVar.b;
        if (annvVar == null) {
            annvVar = annv.a;
        }
        int X = aobq.X(annvVar.b);
        if (X == 0) {
            X = 1;
        }
        aocz.ap(aobq.ad(X), anntVar.d.I());
        annq annqVar = annsVar.c;
        if (annqVar == null) {
            annqVar = annq.a;
        }
        anod anodVar = annqVar.b;
        if (anodVar == null) {
            anodVar = anod.a;
        }
        new anmi(anodVar);
        annvVar.d.I();
        int V = aobq.V(annvVar.c);
        if (V == 0) {
            V = 1;
        }
        aobq.ac(V);
        int aa = aobq.aa(annsVar.d);
        aobq.ae(aa != 0 ? aa : 1);
        return new anqm();
    }
}
