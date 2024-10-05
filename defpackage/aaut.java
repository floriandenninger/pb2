package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaut extends aaru {
    public String a;
    public String b;
    private final afsy c;

    public aaut(ajoy ajoyVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("channel/edit_name", ajoyVar, afsyVar.c(), null, null, null);
        this.c = afsyVar;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arkn.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arkn arknVar = (arkn) createBuilder.instance;
        str.getClass();
        arknVar.b |= 2;
        arknVar.d = str;
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arkn arknVar2 = (arkn) createBuilder.instance;
            arknVar2.b |= 4;
            arknVar2.e = str2;
        }
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final void c() {
        amkq.N(this.c.t());
    }
}
