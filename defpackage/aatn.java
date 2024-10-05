package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatn extends aaru {
    public arzs a;
    public String b;
    public String c;

    public aatn(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("account/request_verification_code", ajoyVar, afsxVar, null, null, null);
        this.i = true;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arzu.a.createBuilder();
        arzs arzsVar = this.a;
        createBuilder.copyOnWrite();
        arzu arzuVar = (arzu) createBuilder.instance;
        arzuVar.d = arzsVar.d;
        arzuVar.b |= 2;
        String str = this.b;
        createBuilder.copyOnWrite();
        arzu arzuVar2 = (arzu) createBuilder.instance;
        str.getClass();
        arzuVar2.b |= 4;
        arzuVar2.e = str;
        String str2 = this.c;
        createBuilder.copyOnWrite();
        arzu arzuVar3 = (arzu) createBuilder.instance;
        str2.getClass();
        arzuVar3.b |= 8;
        arzuVar3.f = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
        zhq.m(this.b);
        zhq.m(this.c);
    }
}
