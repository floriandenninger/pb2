package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wse implements wsg {
    private final azrw a;
    private final azrw b;
    private final shf c;
    private final ajoy d;

    public wse(azrw azrwVar, ajoy ajoyVar, azrw azrwVar2, shf shfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = azrwVar;
        this.d = ajoyVar;
        this.b = azrwVar2;
        this.c = shfVar;
    }

    @Override // defpackage.wsg
    public final wqz a(xgh xghVar) {
        if (whl.d(wqv.class, xghVar)) {
            return new wqv(new wrd((wqy) this.a.get(), xghVar), (wyn) this.b.get());
        }
        if (whl.d(wqx.class, xghVar)) {
            return new wqx(new wrd((wqy) this.a.get(), xghVar), this.d, (wyn) this.b.get(), this.c, null, null, null, null);
        }
        throw new wsf("No supported adapters for ForecastingSlotFulfillmentAdapterFactory");
    }
}
