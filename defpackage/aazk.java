package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazk extends aaru {
    public aomf a;

    public aazk(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live_chat/send_live_chat_vote", ajoyVar, afsxVar, null, null, null);
        this.a = aomf.b;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arud.a.createBuilder();
        aomf aomfVar = this.a;
        createBuilder.copyOnWrite();
        arud arudVar = (arud) createBuilder.instance;
        aomfVar.getClass();
        arudVar.b |= 2;
        arudVar.d = aomfVar;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
