package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ogt {
    public final yzr a;
    private final azqv b = azqv.aq(nrl.NON_ENGAGEMENT_PANEL);

    public ogt(yzr yzrVar) {
        this.a = yzrVar;
    }

    public final void a(nqp nqpVar) {
        oba.p(nqpVar.h().m, nqpVar.h().c.c(), this.b.y().n()).n().X(new ayrs() { // from class: ogs
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oba.q(ogt.this.a, ((Float) obj).floatValue());
            }
        });
    }

    public final void b(boolean z, boolean z2) {
        if (z2) {
            this.b.c(nrl.ENGAGEMENT_PANEL);
        } else if (z) {
            this.b.c(nrl.NON_ENGAGEMENT_PANEL);
            this.a.a(true, true);
        } else {
            this.b.c(nrl.NON_ENGAGEMENT_PANEL);
            this.a.a(false, true);
        }
    }
}
