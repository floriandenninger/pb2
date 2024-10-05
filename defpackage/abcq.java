package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcq extends aaru {
    public String a;
    public String b;
    public String c;
    public asas d;

    public abcq(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("sfv/search", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asag.a.createBuilder();
        String str = this.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            asag asagVar = (asag) createBuilder.instance;
            asagVar.b |= 2;
            asagVar.d = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            asag asagVar2 = (asag) createBuilder.instance;
            asagVar2.b |= 8;
            asagVar2.f = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            asag asagVar3 = (asag) createBuilder.instance;
            asagVar3.b |= 4;
            asagVar3.e = str3;
        }
        asas asasVar = this.d;
        if (asasVar != null) {
            createBuilder.copyOnWrite();
            asag asagVar4 = (asag) createBuilder.instance;
            asagVar4.j = asasVar;
            asagVar4.b |= 1024;
        }
        return createBuilder;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.c("query", this.a);
        g.c("continuation", this.b);
        return "NO_CACHE_KEY_VALUE";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        t(this.a, this.b);
    }
}
