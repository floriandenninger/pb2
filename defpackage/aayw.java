package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayw extends aaru {
    public asox a;
    private String b;

    public aayw(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live_chat/get_live_chat_replay", ajoyVar, afsxVar, null, null, null);
        this.b = "";
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arui.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arui aruiVar = (arui) createBuilder.instance;
        str.getClass();
        aruiVar.b |= 4;
        aruiVar.d = str;
        asox asoxVar = this.a;
        if (asoxVar != null) {
            createBuilder.copyOnWrite();
            arui aruiVar2 = (arui) createBuilder.instance;
            aruiVar2.e = asoxVar;
            aruiVar2.b |= 8;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }

    public final void d(ajce ajceVar) {
        this.b = i(ajceVar.b());
        m(ajceVar.d());
    }
}
