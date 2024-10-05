package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aban extends aaru {
    public aomf a;

    public aban(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("pdg/get_pdg_buy_flow", ajoyVar, afsxVar, null, null, null);
        this.a = null;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arrw.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            arrw arrwVar = (arrw) createBuilder.instance;
            arrwVar.b |= 2;
            arrwVar.d = aomfVar;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
