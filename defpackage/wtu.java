package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wtu implements wub {
    public woo a;
    public final whu b;
    private final azrw c;

    public wtu(azrw azrwVar, whu whuVar, byte[] bArr, byte[] bArr2) {
        this.c = azrwVar;
        this.b = whuVar;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (whl.e(wsm.class, xghVar, xevVar)) {
            if (this.a != null) {
                return new wsm((wsw) this.c.get(), xghVar, xevVar, this.a);
            }
            throw new wua("No companionApi set when trying to build companion LRA");
        }
        if (!whl.e(wso.class, xghVar, xevVar)) {
            throw new wua("BelowPlayerLayoutRenderingAdapterFactory invalid metadata");
        }
        woo wooVar = this.a;
        if (wooVar == null) {
            throw new wua("No companionApi set when trying to build discovery companion LRA");
        }
        return new wso(wswVar, wooVar, xghVar, xevVar);
    }
}
