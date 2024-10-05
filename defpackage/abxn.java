package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abxn extends aaru {
    private final aone a;

    public abxn(ajoy ajoyVar, afsx afsxVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("gaming/game_by_package_id", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        aone createBuilder = aqzp.a.createBuilder();
        createBuilder.copyOnWrite();
        aqzp aqzpVar = (aqzp) createBuilder.instance;
        aqzpVar.b |= 2;
        aqzpVar.d = str;
        this.a = createBuilder;
    }

    @Override // defpackage.aaru
    public final /* synthetic */ aoox a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N((((aqzp) this.a.instance).b & 2) != 0);
    }
}
