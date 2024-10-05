package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ela implements wub, eke {
    private final azrw a;
    private ekf b;

    public ela(azrw azrwVar, aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = azrwVar;
        aoaeVar.M(this);
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        if (!whl.e(eky.class, xghVar, xevVar)) {
            throw new wua("SequenceItemInPlayerLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
        }
        ekf ekfVar = this.b;
        if (ekfVar == null) {
            throw new wua("No elementsRenderingApiFactory set");
        }
        return new eky(ekfVar.a(), (wsw) this.a.get(), xghVar, xevVar, (aqrf) xevVar.e(xdl.class), (xgb) xevVar.e(xea.class));
    }

    @Override // defpackage.eke
    public final void b(ekf ekfVar) {
        this.b = ekfVar;
    }

    @Override // defpackage.eke
    public final void c() {
        this.b = null;
    }
}
