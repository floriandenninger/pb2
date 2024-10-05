package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abcx extends aaru {
    final String a;

    public abcx(akpe akpeVar, String str, byte[] bArr, byte[] bArr2) {
        super("get_user_mention_suggestions", akpeVar.f, akpeVar.a.c(), null, null, null);
        m(bArr);
        this.a = str;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asec.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asec asecVar = (asec) createBuilder.instance;
        asecVar.b |= 2;
        asecVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
