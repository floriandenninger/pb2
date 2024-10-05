package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afvx {
    static final aqvp a;
    public final aqvp b;
    public final axpg c;

    static {
        aone createBuilder = aqvp.a.createBuilder();
        createBuilder.copyOnWrite();
        aqvp aqvpVar = (aqvp) createBuilder.instance;
        aqvpVar.b |= 1;
        aqvpVar.c = 1000;
        createBuilder.copyOnWrite();
        aqvp aqvpVar2 = (aqvp) createBuilder.instance;
        aqvpVar2.b |= 4;
        aqvpVar2.e = 30000;
        createBuilder.copyOnWrite();
        aqvp aqvpVar3 = (aqvp) createBuilder.instance;
        aqvpVar3.b |= 2;
        aqvpVar3.d = 2.0f;
        createBuilder.copyOnWrite();
        aqvp aqvpVar4 = (aqvp) createBuilder.instance;
        aqvpVar4.b |= 8;
        aqvpVar4.f = 0.1f;
        a = (aqvp) createBuilder.build();
    }

    public afvx(axpg axpgVar, aqvp aqvpVar) {
        this.c = axpgVar;
        this.b = aqvpVar;
        int i = aqvpVar.c;
        if (i > 0 && aqvpVar.e >= i && aqvpVar.d >= 1.0f) {
            float f = aqvpVar.f;
            if (f >= 0.0f && f < 1.0f) {
                return;
            }
        }
        throw new IllegalArgumentException("Illegal exponential backoff config");
    }
}
