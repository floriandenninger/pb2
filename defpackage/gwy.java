package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwy extends sbx {
    private final acra a;

    public gwy(acra acraVar) {
        this.a = acraVar;
    }

    private final void b(acrb acrbVar, aone aoneVar) {
        if (acrbVar == null) {
            return;
        }
        if (aoneVar == null) {
            aoneVar = ashh.a.createBuilder();
        }
        aone createBuilder = asht.a.createBuilder();
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashh ashhVar = (ashh) aoneVar.build();
        ashhVar.getClass();
        ashtVar.s = ashhVar;
        ashtVar.c |= 16;
        asht ashtVar2 = (asht) createBuilder.build();
        acsa acsaVar = new acsa(this.a.c(), acrbVar);
        this.a.n(acsaVar);
        this.a.I(3, acsaVar, ashtVar2);
    }

    @Override // defpackage.sbx
    public final void a(aone aoneVar) {
        ansc c;
        ansq ansqVar = (ansq) aoneVar.instance;
        if (ansqVar.c == 3 && ((ansg) ansqVar.d).j()) {
            b(acrb.AR_CAMERA_VIEW, null);
        }
        if (((ansq) aoneVar.instance).c == 5) {
            aone createBuilder = ashh.a.createBuilder();
            acrb acrbVar = acrb.AR_CAMERA_EFFECT;
            ansq ansqVar2 = (ansq) aoneVar.instance;
            if (ansqVar2.c == 5) {
                c = (ansc) ansqVar2.d;
            } else {
                c = ansc.c();
            }
            String d = c.d();
            createBuilder.copyOnWrite();
            ashh ashhVar = (ashh) createBuilder.instance;
            d.getClass();
            ashhVar.b |= 1;
            ashhVar.c = d;
            b(acrbVar, createBuilder);
        }
    }
}
