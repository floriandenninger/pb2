package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyw {
    public final azrw a;
    public final azrw b;
    public final azrw c;
    public final whu d;

    public wyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, whu whuVar, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = whuVar;
    }

    public wyw(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, whu whuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.d = whuVar;
    }

    public final wyv a(xgh xghVar, xev xevVar) {
        if (!xevVar.j.h()) {
            throw new wxd("No layoutTracking map available");
        }
        if (xevVar.b == apac.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER) {
            return new wyv((wqd) this.a.get(), (wod) this.b.get(), (xhk) this.c.get(), (ywt) xevVar.j.c(), xghVar, xevVar, null);
        }
        if (xghVar.c() != apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM || xevVar.b != apac.LAYOUT_TYPE_MEDIA) {
            throw new wxd("Unrecognized PingTracker requirements");
        }
        return new wyv((wqd) this.a.get(), (wod) this.b.get(), (xhk) this.c.get(), (ywt) xevVar.j.c(), xghVar, xevVar, null);
    }
}
