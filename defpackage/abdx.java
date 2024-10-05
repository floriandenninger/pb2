package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdx extends aaru {
    public String a;

    public abdx(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("ypc/get_cancellation_flow", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        s(3);
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.c("cancellationFlowParams", this.a);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(((arrj) a().build()).d);
    }

    @Override // defpackage.aaru
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = arrj.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arrj arrjVar = (arrj) createBuilder.instance;
        str.getClass();
        arrjVar.b |= 2;
        arrjVar.d = str;
        return createBuilder;
    }
}
