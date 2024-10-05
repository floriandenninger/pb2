package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class osr implements abdr {
    private final osm a;
    private final aadw b;

    public osr(aadw aadwVar, osm osmVar) {
        this.b = aadwVar;
        this.a = osmVar;
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        if (evr.bf(this.b)) {
            aone createBuilder = asey.a.createBuilder();
            boolean g = this.a.g();
            createBuilder.copyOnWrite();
            asey aseyVar = (asey) createBuilder.instance;
            aseyVar.b |= 1;
            aseyVar.c = g;
            int a = this.a.a();
            createBuilder.copyOnWrite();
            asey aseyVar2 = (asey) createBuilder.instance;
            aseyVar2.b |= 2;
            aseyVar2.d = a;
            abduVar.t = (asey) createBuilder.build();
        }
    }
}
