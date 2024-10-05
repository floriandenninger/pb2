package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaxy extends aaru {
    public String a;
    public String b;

    public aaxy(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("kids/get_share_with_kids_picker", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arbp.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arbp arbpVar = (arbp) createBuilder.instance;
        str.getClass();
        arbpVar.b |= 2;
        arbpVar.d = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        arbp arbpVar2 = (arbp) createBuilder.instance;
        str2.getClass();
        arbpVar2.b |= 4;
        arbpVar2.e = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
        this.b.getClass();
    }
}
