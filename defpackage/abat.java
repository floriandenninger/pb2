package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abat extends aaru {
    public String a;

    public abat(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("playlist/get_suggested_playlist_videos", ajoyVar, afsxVar, null, null, null);
        this.a = "";
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arso.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arso arsoVar = (arso) createBuilder.instance;
        str.getClass();
        arsoVar.b |= 2;
        arsoVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
