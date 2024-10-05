package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kge extends ajtz {
    public kgd a;

    public kge(abds abdsVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        super(abdsVar, ypaVar, ypa.c(), zawVar, acraVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        kgd kgdVar;
        atzx atzxVar = (atzx) obj;
        super.lB(atzxVar, ajcdVar);
        if (ajcdVar != ajcd.NEXT || atzxVar == null || (kgdVar = this.a) == null) {
            return;
        }
        ((aicw) kgdVar).b(atzxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final void lm(cnq cnqVar, ajce ajceVar) {
        super.lm(cnqVar, ajceVar);
        ajcd ajcdVar = ajcd.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(atzx.b)) {
            return null;
        }
        return (atzx) aulpVar.pX(atzx.b);
    }
}
