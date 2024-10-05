package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wtt implements wub {
    public ejn a;
    public final whu b;
    private final azrw c;
    private final azrw d;

    public wtt(azrw azrwVar, azrw azrwVar2, whu whuVar, byte[] bArr, byte[] bArr2) {
        this.c = azrwVar;
        this.d = azrwVar2;
        this.b = whuVar;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (!whl.e(wsn.class, xghVar, xevVar)) {
            throw new wua("BelowPlayerImmersiveLayoutRenderingAdapterFactory invalid metadata");
        }
        if (this.a == null) {
            throw new wua("No adsEngagementPanelApi set when trying to build immersive LRA");
        }
        return new wsn((wsw) this.c.get(), xghVar, xevVar, this.a, (wpl) this.d.get());
    }
}
