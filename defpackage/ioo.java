package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ioo extends aaru {
    public String a;
    public String b;

    public ioo(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("reel/reel_watch_sequence", ajoyVar, afsxVar, 1, (byte[]) null, (byte[]) null, (byte[]) null);
        m(aaef.b);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arsf.a.createBuilder();
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            arsf arsfVar = (arsf) createBuilder.instance;
            arsfVar.c = 4;
            arsfVar.d = str;
        }
        String str2 = this.a;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arsf arsfVar2 = (arsf) createBuilder.instance;
            arsfVar2.c = 3;
            arsfVar2.d = str2;
        }
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi afpiVar = new afpi();
        afpiVar.c("serviceName", this.m);
        afpiVar.c("identity", this.n.d());
        afpiVar.c("continuation", i(this.a));
        afpiVar.c("sequenceParams", i(this.b));
        return afpiVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.N((this.b == null) ^ ammx.e(this.a));
    }
}
