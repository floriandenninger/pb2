package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abee extends aaru {
    public String a;
    public long b;

    public abee(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/pause_subscription", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arxb.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arxb arxbVar = (arxb) createBuilder.instance;
        str.getClass();
        arxbVar.b |= 2;
        arxbVar.d = str;
        long j = this.b;
        createBuilder.copyOnWrite();
        arxb arxbVar2 = (arxb) createBuilder.instance;
        arxbVar2.b |= 4;
        arxbVar2.e = j;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
        amkq.O(this.b > 0, "resume time must be specified");
    }
}
