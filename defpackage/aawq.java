package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aawq extends aaru {
    public apst a;

    public aawq(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("acknowledge_channel_tou_strike", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = apsu.a.createBuilder();
        apst apstVar = this.a;
        createBuilder.copyOnWrite();
        apsu apsuVar = (apsu) createBuilder.instance;
        apstVar.getClass();
        apsuVar.d = apstVar;
        apsuVar.b |= 2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(this.a != null);
    }
}
