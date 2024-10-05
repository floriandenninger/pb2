package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipt implements aaha {
    private final ips a;

    public ipt(ips ipsVar) {
        this.a = ipsVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        amkq.E(apxfVar.pY(aqqm.b));
        aqqm aqqmVar = (aqqm) apxfVar.pX(aqqm.b);
        if ((aqqmVar.c & 8) != 0) {
            aulq aulqVar = aqqmVar.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(aszi.a)) {
                this.a.g(aqqmVar);
            }
        }
    }
}
