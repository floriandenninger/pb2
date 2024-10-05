package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nqy {
    private static final amsx c = amsx.s(aqtm.ENGAGEMENT_PANEL_SURFACE_BROWSE, aqtm.ENGAGEMENT_PANEL_SURFACE_SEARCH);
    public final axpg a;
    public final axpg b;
    private final fgq d;

    public nqy(axpg axpgVar, axpg axpgVar2, fgq fgqVar) {
        this.a = axpgVar;
        this.b = axpgVar2;
        this.d = fgqVar;
    }

    public final nqp a(aqtm aqtmVar) {
        if (c.contains(aqtmVar)) {
            return (nqp) this.b.get();
        }
        return (nqp) this.a.get();
    }

    public final aypy b() {
        return this.d.h().Y(mmt.i).B().Y(new ayrv() { // from class: nqx
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                nqy nqyVar = nqy.this;
                if (((Boolean) obj).booleanValue()) {
                    return (nqp) nqyVar.a.get();
                }
                return (nqp) nqyVar.b.get();
            }
        });
    }
}
