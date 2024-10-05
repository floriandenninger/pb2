package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatk extends aaru {
    private final arry a;

    public aatk(ajoy ajoyVar, afsx afsxVar, String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("account/get_profile_card", ajoyVar, afsxVar, null, null, null);
        aone createBuilder = arry.a.createBuilder();
        createBuilder.copyOnWrite();
        arry arryVar = (arry) createBuilder.instance;
        str.getClass();
        arryVar.b |= 2;
        arryVar.d = str;
        createBuilder.copyOnWrite();
        arry arryVar2 = (arry) createBuilder.instance;
        str2.getClass();
        arryVar2.b |= 4;
        arryVar2.e = str2;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            arry arryVar3 = (arry) createBuilder.instance;
            arryVar3.b |= 8;
            arryVar3.f = str3;
        }
        this.a = (arry) createBuilder.build();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        return this.a.toBuilder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
