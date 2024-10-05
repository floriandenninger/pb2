package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayt extends aaru {
    public String a;

    public aayt(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/update_broadcast_participant", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = ascp.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            ascp ascpVar = (ascp) createBuilder.instance;
            ascpVar.b |= 2;
            ascpVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
