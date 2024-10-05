package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wsh implements wsg {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public wsh(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public wsh(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.wsg
    public final wqz a(xgh xghVar) {
        int i = this.c;
        if (i == 0) {
            if (whl.d(wrh.class, xghVar)) {
                return new wrh(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
            }
            if (whl.d(wrj.class, xghVar)) {
                return new wrj(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
            }
            if (whl.d(wrl.class, xghVar)) {
                return new wrl(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
            }
            if (whl.d(wrf.class, xghVar)) {
                return new wrf(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
            }
            throw new wsf("No supported adapters for InPlayerSlotFulfillmentAdapterFactory");
        }
        if (i == 1) {
            if (whl.d(wqt.class, xghVar)) {
                return new wqt(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
            }
            throw new wsf("No supported adapters for FixedFooterSlotFulfillmentAdapterFactory");
        }
        if (i != 2) {
            if (whl.d(wrt.class, xghVar)) {
                return new wrt(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get(), xghVar);
            }
            throw new wsf("No supported adapters for PlaybackTrackingSlotFulfillmentAdapterFactory");
        }
        if (whl.d(wrr.class, xghVar)) {
            return new wrr(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
        }
        throw new wsf("No supported adapters for LockscreenSlotFulfillmentAdapterFactory");
    }
}
