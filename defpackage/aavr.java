package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavr extends aaru {
    public String a;

    public aavr(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("share/get_sharing_provider_data", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arsh.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arsh arshVar = (arsh) createBuilder.instance;
        str.getClass();
        arshVar.b |= 2;
        arshVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
