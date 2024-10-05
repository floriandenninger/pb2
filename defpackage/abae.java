package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abae extends aaru {
    public byte[] a;

    public abae(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("notification/record_interactions", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arwq.a.createBuilder();
        aomf x = aomf.x(this.a);
        createBuilder.copyOnWrite();
        arwq arwqVar = (arwq) createBuilder.instance;
        arwqVar.b |= 2;
        arwqVar.d = x;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
