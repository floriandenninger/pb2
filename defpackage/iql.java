package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iql implements aaha {
    private final iqw a;

    public iql(iqw iqwVar) {
        this.a = iqwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        arvt arvtVar;
        atei ateiVar = (atei) apxfVar.pX(atei.b);
        if (ateiVar.c == 1) {
            arvtVar = (arvt) ateiVar.d;
        } else {
            arvtVar = arvt.a;
        }
        this.a.u(arvtVar.toBuilder());
    }
}
