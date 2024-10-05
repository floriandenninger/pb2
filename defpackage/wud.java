package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wud implements wub {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final whu g;

    public wud(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, whu whuVar, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = whuVar;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (whl.e(wss.class, xghVar, xevVar)) {
            try {
                return new wss((wsw) this.a.get(), ((wyw) this.e.get()).a(xghVar, xevVar), (wog) this.b.get(), (wwn) this.c.get(), (wod) this.d.get(), (acra) this.f.get(), xghVar, xevVar);
            } catch (wxd e) {
                throw new wua(e.toString());
            }
        }
        throw new wua("PlaybackTrackingLayoutRenderingAdapterFactory received unsupported metadata");
    }
}
