package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abej extends aaru {
    public String a;

    public abej(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_offer_details", ajoyVar, afsxVar, null, null, null);
        this.a = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(((asfh) a().build()).d);
    }

    @Override // defpackage.aaru
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asfh.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asfh asfhVar = (asfh) createBuilder.instance;
        str.getClass();
        asfhVar.b |= 2;
        asfhVar.d = str;
        return createBuilder;
    }
}
