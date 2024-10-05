package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcg extends aaru {
    private final String a;
    private final ysy b;
    private final yxn c;

    public abcg(ajoy ajoyVar, afsx afsxVar, String str, ysy ysyVar, yxn yxnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("account/get_setting", ajoyVar, afsxVar, null, null, null);
        k();
        this.a = str;
        this.b = ysyVar;
        this.c = yxnVar;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asax.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asax asaxVar = (asax) createBuilder.instance;
            asaxVar.b |= 2;
            asaxVar.d = str;
        }
        aone createBuilder2 = asaw.a.createBuilder();
        boolean n = this.b.n();
        createBuilder2.copyOnWrite();
        asaw asawVar = (asaw) createBuilder2.instance;
        asawVar.b |= 1;
        asawVar.c = n;
        boolean l = this.c.l();
        createBuilder2.copyOnWrite();
        asaw asawVar2 = (asaw) createBuilder2.instance;
        asawVar2.b |= 2;
        asawVar2.d = l;
        createBuilder.copyOnWrite();
        asax asaxVar2 = (asax) createBuilder.instance;
        asaw asawVar3 = (asaw) createBuilder2.build();
        asawVar3.getClass();
        asaxVar2.e = asawVar3;
        asaxVar2.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
