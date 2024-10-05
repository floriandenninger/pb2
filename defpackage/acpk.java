package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpk {
    public final acpl a;

    public acpk(acpl acplVar) {
        this.a = acplVar;
    }

    public final void a(arpp arppVar) {
        this.a.c(arppVar);
    }

    public final void b(arpp arppVar, long j) {
        this.a.f(arppVar, j);
    }

    public final void c(arpp arppVar, afsx afsxVar) {
        this.a.g(arppVar, afsxVar);
    }

    public final void d(aptu aptuVar) {
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).ck(aptuVar);
        this.a.c((arpp) a.build());
    }

    public final void e(int i, int i2) {
        arpn a = arpp.a();
        aone createBuilder = aspd.a.createBuilder();
        createBuilder.copyOnWrite();
        aspd aspdVar = (aspd) createBuilder.instance;
        aspdVar.c = i - 1;
        aspdVar.b |= 1;
        createBuilder.copyOnWrite();
        aspd aspdVar2 = (aspd) createBuilder.instance;
        aspdVar2.d = i2 - 1;
        aspdVar2.b |= 2;
        aspd aspdVar3 = (aspd) createBuilder.build();
        a.copyOnWrite();
        ((arpp) a.instance).cL(aspdVar3);
        this.a.c((arpp) a.build());
    }
}
