package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aace {
    private final afqn a;

    public aace(afqn afqnVar) {
        afqnVar.getClass();
        this.a = afqnVar;
    }

    public final void a(yvo yvoVar, final cnm cnmVar) {
        if ((yvoVar instanceof aarn) && ((aarn) yvoVar).A()) {
            final afvw afvwVar = (afvw) yvoVar;
            ynm.i(this.a.c(), new afvi(afvwVar, 1));
            if (cnmVar.b != null) {
                ynm.i(this.a.e(), new ynl() { // from class: aacd
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        cnm cnmVar2 = cnm.this;
                        afvw afvwVar2 = afvwVar;
                        cnc cncVar = cnmVar2.b;
                        cnh cnhVar = new cnh(cncVar.a, cncVar.g);
                        zga.g("Logging response for YouTube API call.");
                        Iterator it = afvwVar2.w(cnhVar).iterator();
                        while (it.hasNext()) {
                            zga.g((String) it.next());
                        }
                    }
                });
            }
        }
    }
}
