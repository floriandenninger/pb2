package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abxo extends aaru {
    private final aone a;

    public abxo(ajoy ajoyVar, afsx afsxVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("gaming/game_title", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        aone createBuilder = aqzv.a.createBuilder();
        createBuilder.copyOnWrite();
        aqzv aqzvVar = (aqzv) createBuilder.instance;
        str.getClass();
        aqzvVar.b |= 2;
        aqzvVar.d = str;
        this.a = createBuilder;
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N((((aqzv) this.a.instance).b & 2) != 0);
    }
}
