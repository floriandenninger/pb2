package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hpe extends hop {
    private static double a(double d) {
        return d / 255.0d;
    }

    @Override // defpackage.hop, defpackage.amml
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        aoro aoroVar = (aoro) obj;
        if (aoroVar == null) {
            return aqqr.a;
        }
        aone createBuilder = aqqr.a.createBuilder();
        double d = aoroVar.c;
        createBuilder.copyOnWrite();
        aqqr aqqrVar = (aqqr) createBuilder.instance;
        aqqrVar.b |= 1;
        aqqrVar.c = a(d);
        double d2 = aoroVar.d;
        createBuilder.copyOnWrite();
        aqqr aqqrVar2 = (aqqr) createBuilder.instance;
        aqqrVar2.b |= 2;
        aqqrVar2.d = a(d2);
        double d3 = aoroVar.e;
        createBuilder.copyOnWrite();
        aqqr aqqrVar3 = (aqqr) createBuilder.instance;
        aqqrVar3.b |= 4;
        aqqrVar3.e = a(d3);
        double d4 = aoroVar.f;
        createBuilder.copyOnWrite();
        aqqr aqqrVar4 = (aqqr) createBuilder.instance;
        aqqrVar4.b |= 8;
        aqqrVar4.f = a(d4);
        return (aqqr) createBuilder.build();
    }
}
