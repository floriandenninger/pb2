package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatq extends aaru {
    public Long a;
    public String b;
    public String c;

    public aatq(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("account/validate_verification_code", ajoyVar, afsxVar, null, null, null);
        k();
        this.i = true;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = aseh.a.createBuilder();
        long longValue = this.a.longValue();
        createBuilder.copyOnWrite();
        aseh asehVar = (aseh) createBuilder.instance;
        asehVar.b |= 2;
        asehVar.d = longValue;
        String str = this.b;
        createBuilder.copyOnWrite();
        aseh asehVar2 = (aseh) createBuilder.instance;
        str.getClass();
        asehVar2.b |= 4;
        asehVar2.e = str;
        String str2 = this.c;
        createBuilder.copyOnWrite();
        aseh asehVar3 = (aseh) createBuilder.instance;
        str2.getClass();
        asehVar3.b |= 8;
        asehVar3.f = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
        zhq.m(this.b);
    }
}
