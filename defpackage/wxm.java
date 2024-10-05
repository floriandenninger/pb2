package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxm implements wxq {
    public wom a;
    private final whu b;

    public wxm(aoae aoaeVar, whu whuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = whuVar;
        aoaeVar.b.add(this);
    }

    @Override // defpackage.wxq
    public final wxl a(wxk wxkVar, xgh xghVar) {
        if (whl.d(wxg.class, xghVar)) {
            return new wxg(wxkVar, this, xghVar);
        }
        throw new wxp("BelowPlayerSlotAdapterFactory received unsupported metadata");
    }
}
