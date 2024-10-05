package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajvq extends ajpd {
    @Override // defpackage.ajpd, defpackage.ajng
    public final /* bridge */ /* synthetic */ void lX(ajnf ajnfVar) {
        super.i(ajnfVar);
    }

    @Override // defpackage.ajpd, defpackage.ajng
    public final /* bridge */ /* synthetic */ void pf(ajnf ajnfVar) {
        super.j(ajnfVar);
    }

    public final void q(ajvo ajvoVar) {
        if (ajvoVar == null) {
            if (isEmpty()) {
                return;
            }
            clear();
        } else {
            if (!isEmpty()) {
                if (((ajvo) get(0)) == ajvoVar) {
                    return;
                }
                n(0, ajvoVar);
                return;
            }
            add(ajvoVar);
        }
    }
}
