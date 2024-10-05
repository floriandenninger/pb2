package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wtx implements wub {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public wtx(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (whl.e(wst.class, xghVar, xevVar)) {
            return new wst((wsw) this.a.get(), (wxz) this.b.get(), (woc) this.c.get(), xghVar, xevVar);
        }
        throw new wua("ForecastingAdRenderingAdapterFactory received unsupported metadata");
    }
}
