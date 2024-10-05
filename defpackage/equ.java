package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class equ extends ajsu {
    private final ajpd a;

    public equ(ajvb ajvbVar, apsj apsjVar) {
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        if (b(apsjVar) != null) {
            ajvbVar.a(apsl.class);
            ajpdVar.add(b(apsjVar));
        } else {
            ajvbVar.a(apsj.class);
            ajpdVar.add(apsjVar);
        }
    }

    private static apsl b(apsj apsjVar) {
        apsn apsnVar = apsjVar.c;
        if (apsnVar == null) {
            apsnVar = apsn.a;
        }
        if ((apsnVar.b & 4) == 0) {
            return null;
        }
        apsn apsnVar2 = apsjVar.c;
        if (apsnVar2 == null) {
            apsnVar2 = apsn.a;
        }
        apsl apslVar = apsnVar2.c;
        return apslVar == null ? apsl.a : apslVar;
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
