package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaur extends aaru {
    public String a;
    private final afsy b;

    public aaur(ajoy ajoyVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("channel/edit_description", ajoyVar, afsyVar.c(), null, null, null);
        this.b = afsyVar;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arkh.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arkh arkhVar = (arkh) createBuilder.instance;
        str.getClass();
        arkhVar.b |= 2;
        arkhVar.d = str;
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.b.t());
        this.a.getClass();
    }
}
