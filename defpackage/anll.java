package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anll extends anjt {
    public anll(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anol anolVar = (anol) obj;
        anom anomVar = anolVar.c;
        if (anomVar == null) {
            anomVar = anom.a;
        }
        anjh b = anjx.a(anomVar.b).b();
        anom anomVar2 = anolVar.c;
        if (anomVar2 == null) {
            anomVar2 = anom.a;
        }
        anod anodVar = anomVar2.c;
        if (anodVar == null) {
            anodVar = anod.a;
        }
        return new anlk(anodVar, b);
    }
}
