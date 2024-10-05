package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izm implements aaud {
    private final axpg a;
    private final aaea b;

    public izm(axpg axpgVar, aaea aaeaVar, aadw aadwVar) {
        this.a = axpgVar;
        this.b = aaeaVar;
        if (evr.az(aadwVar)) {
            return;
        }
        axpgVar.get();
    }

    @Override // defpackage.aaud
    public final void a(aauc aaucVar) {
        arfd a = this.b.a();
        if (a != null) {
            aswb aswbVar = a.e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.af) {
                aone createBuilder = arjo.a.createBuilder();
                int i = true != ((eow) this.a.get()).b().i ? 3 : 2;
                createBuilder.copyOnWrite();
                arjo arjoVar = (arjo) createBuilder.instance;
                arjoVar.c = i - 1;
                arjoVar.b |= 1;
                arjo arjoVar2 = (arjo) createBuilder.build();
                aone createBuilder2 = arju.a.createBuilder();
                createBuilder2.copyOnWrite();
                arju arjuVar = (arju) createBuilder2.instance;
                arjoVar2.getClass();
                arjuVar.c = arjoVar2;
                arjuVar.b |= 2;
                aaucVar.x = (arju) createBuilder2.build();
            }
        }
    }
}
