package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaup extends aaru {
    public String a;

    public aaup(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("channel/delete_channel_post", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arkl.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arkl arklVar = (arkl) createBuilder.instance;
        str.getClass();
        arklVar.b |= 2;
        arklVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a);
    }
}
