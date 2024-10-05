package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdn extends aaru {
    public int a;
    public boolean b;

    public abdn(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("video_effects/get_multi_page_sticker_catalog", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        this.a = -1;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arrs.a.createBuilder();
        createBuilder.copyOnWrite();
        arrs arrsVar = (arrs) createBuilder.instance;
        arrsVar.b |= 4;
        arrsVar.e = "";
        int i = this.a;
        if (i >= 0) {
            createBuilder.copyOnWrite();
            arrs arrsVar2 = (arrs) createBuilder.instance;
            arrsVar2.b |= 2;
            arrsVar2.d = i;
        }
        boolean z = this.b;
        createBuilder.copyOnWrite();
        arrs arrsVar3 = (arrs) createBuilder.instance;
        arrsVar3.b |= 8;
        arrsVar3.f = z;
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.d("getDefaultPage", this.b);
        g.b("page", this.a);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
