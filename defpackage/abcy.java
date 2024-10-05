package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcy extends aaru {
    private final arnv a;

    public abcy(ajoy ajoyVar, afsx afsxVar, arnv arnvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("collections/create", ajoyVar, afsxVar, null, null, null);
        this.a = arnvVar;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arnt.a.createBuilder();
        arnv arnvVar = this.a;
        createBuilder.copyOnWrite();
        arnt arntVar = (arnt) createBuilder.instance;
        arnvVar.getClass();
        arntVar.d = arnvVar;
        arntVar.b |= 2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
