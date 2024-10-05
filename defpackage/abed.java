package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abed extends aaru {
    public byte[] a;
    public String b;
    public boolean c;

    public abed(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/log_payment_server_analytics", ajoyVar, afsxVar, null, null, null);
        this.a = aben.a;
        this.b = "";
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arus.a.createBuilder();
        aomf x = aomf.x(this.a);
        createBuilder.copyOnWrite();
        arus arusVar = (arus) createBuilder.instance;
        arusVar.b |= 2;
        arusVar.d = x;
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            arus arusVar2 = (arus) createBuilder.instance;
            arusVar2.b |= 4;
            arusVar2.e = str;
        }
        boolean z = this.c;
        createBuilder.copyOnWrite();
        arus arusVar3 = (arus) createBuilder.instance;
        arusVar3.b |= 8;
        arusVar3.f = z;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
        this.b.getClass();
    }
}
