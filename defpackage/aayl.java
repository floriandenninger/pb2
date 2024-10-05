package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayl extends aaru {
    public String a;

    public aayl(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/add_broadcast_participant", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = ariu.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            ariu ariuVar = (ariu) createBuilder.instance;
            ariuVar.b |= 2;
            ariuVar.d = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
