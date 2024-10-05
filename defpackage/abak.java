package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abak extends aaru {
    public String a;
    public String b;
    public String c;

    public abak(ajoy ajoyVar, afsx afsxVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("get_panel", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        this.i = z;
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = atte.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            atte atteVar = (atte) createBuilder.instance;
            atteVar.b |= 2;
            atteVar.d = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            atte atteVar2 = (atte) createBuilder.instance;
            atteVar2.b |= 8;
            atteVar2.f = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            atte atteVar3 = (atte) createBuilder.instance;
            atteVar3.b |= 4;
            atteVar3.e = str3;
        }
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.c("params", this.c);
        g.c("panelId", this.a);
        g.c("continuation", this.b);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        t(this.a, this.b);
    }
}
