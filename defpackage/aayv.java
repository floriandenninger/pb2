package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayv extends aaru {
    public aomf a;
    public asrh b;

    public aayv(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live_chat/get_live_chat_message_buy_flow", ajoyVar, afsxVar, null, null, null);
        this.a = aomf.b;
        this.b = null;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = aruf.a.createBuilder();
        aomf aomfVar = this.a;
        createBuilder.copyOnWrite();
        aruf arufVar = (aruf) createBuilder.instance;
        aomfVar.getClass();
        arufVar.b |= 2;
        arufVar.d = aomfVar;
        asrh asrhVar = this.b;
        if (asrhVar != null) {
            createBuilder.copyOnWrite();
            aruf arufVar2 = (aruf) createBuilder.instance;
            arufVar2.e = asrhVar;
            arufVar2.b |= 4;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
