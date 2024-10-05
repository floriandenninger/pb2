package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawf extends aaru {
    public String a;
    private String b;

    public aawf(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("comment/update_comment_reply", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.b = "";
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arme.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arme armeVar = (arme) createBuilder.instance;
        str.getClass();
        armeVar.b |= 2;
        armeVar.d = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        arme armeVar2 = (arme) createBuilder.instance;
        str2.getClass();
        armeVar2.b |= 4;
        armeVar2.e = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a);
        zhq.m(this.b);
    }

    public final void d(String str) {
        this.b = i(str);
    }
}
