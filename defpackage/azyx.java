package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azyx implements azyy {
    public final azty a;
    private final azyy b;

    public azyx(azyy azyyVar, azty aztyVar) {
        this.b = azyyVar;
        this.a = aztyVar;
    }

    @Override // defpackage.azyy
    public final Object a(azyz azyzVar, azsq azsqVar) {
        azuo azuoVar = new azuo();
        azuoVar.a = azze.a;
        Object a = this.b.a(new azyw(this, azuoVar, azyzVar), azsqVar);
        return a == azsx.COROUTINE_SUSPENDED ? a : azsf.a;
    }
}
