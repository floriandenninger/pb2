package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdm extends aaru {
    public String a;

    public abdm(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("video/delete", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asej.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asej asejVar = (asej) createBuilder.instance;
        str.getClass();
        asejVar.b |= 2;
        asejVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final boolean p() {
        return false;
    }
}
