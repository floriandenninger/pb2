package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaxx extends aaru {
    public artp a;
    public String b;

    public aaxx(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("kids/get_kids_blocklist_picker", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arbl.a.createBuilder();
        artp artpVar = this.a;
        createBuilder.copyOnWrite();
        arbl arblVar = (arbl) createBuilder.instance;
        artpVar.getClass();
        arblVar.d = artpVar;
        arblVar.b |= 2;
        String str = this.b;
        createBuilder.copyOnWrite();
        arbl arblVar2 = (arbl) createBuilder.instance;
        str.getClass();
        arblVar2.b |= 4;
        arblVar2.e = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
        this.b.getClass();
    }
}
