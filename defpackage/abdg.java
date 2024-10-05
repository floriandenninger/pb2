package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdg extends aaru {
    public asce a;
    public int b;

    public abdg(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("get_survey", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = ascf.a.createBuilder();
        asce asceVar = this.a;
        createBuilder.copyOnWrite();
        ascf ascfVar = (ascf) createBuilder.instance;
        asceVar.getClass();
        ascfVar.d = asceVar;
        ascfVar.b |= 2;
        int i = this.b;
        createBuilder.copyOnWrite();
        ascf ascfVar2 = (ascf) createBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ascfVar2.e = i2;
        ascfVar2.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
