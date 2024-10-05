package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaui {
    public final appm a;
    public aauh b;
    private aauj c;

    public aaui(appm appmVar) {
        appmVar.getClass();
        this.a = appmVar;
    }

    public final aauj a() {
        if (this.c == null) {
            appl applVar = this.a.d;
            if (applVar == null) {
                applVar = appl.a;
            }
            if ((applVar.b & 2) != 0) {
                appl applVar2 = this.a.d;
                if (applVar2 == null) {
                    applVar2 = appl.a;
                }
                appo appoVar = applVar2.d;
                if (appoVar == null) {
                    appoVar = appo.a;
                }
                this.c = new aauj(appoVar);
            }
        }
        return this.c;
    }

    public final appr b() {
        appl applVar = this.a.d;
        if (applVar == null) {
            applVar = appl.a;
        }
        if ((applVar.b & 1) == 0) {
            return null;
        }
        appl applVar2 = this.a.d;
        if (applVar2 == null) {
            applVar2 = appl.a;
        }
        appr apprVar = applVar2.c;
        return apprVar == null ? appr.a : apprVar;
    }
}
