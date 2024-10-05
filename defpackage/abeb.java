package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abeb extends aaru {
    public String a;

    public abeb(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_offline_upsell", ajoyVar, afsxVar, null, null, null);
        this.a = "";
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asfj.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asfj asfjVar = (asfj) createBuilder.instance;
        str.getClass();
        asfjVar.b |= 2;
        asfjVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a);
    }
}
