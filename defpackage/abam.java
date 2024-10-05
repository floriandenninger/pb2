package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abam extends aaru {
    public aomf a;

    public abam(ajoy ajoyVar, afsx afsxVar, aomf aomfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live_chat/get_live_chat_super_sticker_buy_flow", ajoyVar, afsxVar, null, null, null);
        this.a = null;
        if (aomfVar != null) {
            l(aomfVar);
        } else {
            k();
        }
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arrq.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            arrq arrqVar = (arrq) createBuilder.instance;
            arrqVar.b |= 2;
            arrqVar.d = aomfVar;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
