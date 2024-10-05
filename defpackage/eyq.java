package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyq implements aaha {
    private final eys a;

    public eyq(eys eysVar) {
        this.a = eysVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        auoz auozVar = (auoz) apxfVar.pX(auoz.b);
        aqew aqewVar = auozVar.c;
        if (aqewVar == null) {
            aqewVar = aqew.a;
        }
        if (aqewVar.pY(aulm.b)) {
            eys eysVar = this.a;
            String str = auozVar.d;
            aqew aqewVar2 = auozVar.c;
            if (aqewVar2 == null) {
                aqewVar2 = aqew.a;
            }
            eysVar.a.c(eyr.c(str, (aulm) aqewVar2.pX(aulm.b)));
        }
    }
}
