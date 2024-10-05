package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abbt extends aasu {
    private final abep a;

    public abbt(aarm aarmVar, ysl yslVar, abep abepVar) {
        super(aarmVar, yslVar, arwa.a, abaa.t, abax.g);
        this.a = abepVar;
    }

    @Override // defpackage.aasu
    public final /* bridge */ /* synthetic */ Object h(aooy aooyVar) {
        final arwa arwaVar = (arwa) aooyVar;
        if ((arwaVar.b & 8) != 0) {
            abeo a = this.a.a();
            ((abet) a).b = new amml() { // from class: abbs
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    apgh apghVar = arwa.this.e;
                    return apghVar == null ? apgh.a : apghVar;
                }
            };
            ynm.m(a.a(), abbr.a);
        }
        return arwaVar;
    }
}
