package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abek extends aaru {
    public String a;

    public abek(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_tip_module", ajoyVar, afsxVar, null, null, null);
        this.a = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(((asgb) a().build()).d);
    }

    @Override // defpackage.aaru
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asgb.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        asgb asgbVar = (asgb) createBuilder.instance;
        str.getClass();
        asgbVar.b |= 2;
        asgbVar.d = str;
        return createBuilder;
    }
}
