package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcu extends aaru {
    public String a;
    public String b;

    public abcu(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("shorts/get_shorts_source_video", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arsl.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arsl arslVar = (arsl) createBuilder.instance;
        str.getClass();
        arslVar.b |= 2;
        arslVar.d = str;
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arsl arslVar2 = (arsl) createBuilder.instance;
            arslVar2.b |= 4;
            arslVar2.e = str2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
