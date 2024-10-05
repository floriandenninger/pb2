package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abut implements aaha {
    private final ajec a;
    private final aahd b;
    private final acfo c;

    public abut(ajec ajecVar, aahd aahdVar, acfo acfoVar) {
        this.a = ajecVar;
        this.b = aahdVar;
        this.c = acfoVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.a.a();
        aqkr aqkrVar = (aqkr) apxfVar.pX(aqkr.b);
        acfn acfnVar = this.c.a;
        if (acfnVar != null) {
            ((acjl) acfnVar).an = true;
        }
        aahd aahdVar = this.b;
        apxf apxfVar2 = aqkrVar.c;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar.a(apxfVar2);
    }
}
