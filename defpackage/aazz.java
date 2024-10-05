package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazz extends aaru {
    public aomf a;
    public aomf b;

    public aazz(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("notification/opt_out", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arwo.a.createBuilder();
        aomf aomfVar = this.a;
        createBuilder.copyOnWrite();
        arwo arwoVar = (arwo) createBuilder.instance;
        aomfVar.getClass();
        arwoVar.b |= 4;
        arwoVar.d = aomfVar;
        aomf aomfVar2 = this.b;
        createBuilder.copyOnWrite();
        arwo arwoVar2 = (arwo) createBuilder.instance;
        aomfVar2.getClass();
        arwoVar2.b |= 32;
        arwoVar2.e = aomfVar2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
