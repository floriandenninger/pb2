package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawg extends aaru {
    public String a;
    public Long b;
    private String c;

    public aawg(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("comment/update_comment", ajoyVar, afsxVar, null, null, null);
        this.a = "";
        this.c = "";
        this.b = null;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = armh.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        armh armhVar = (armh) createBuilder.instance;
        str.getClass();
        armhVar.b |= 2;
        armhVar.d = str;
        String str2 = this.c;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            armh armhVar2 = (armh) createBuilder.instance;
            armhVar2.b |= 4;
            armhVar2.e = str2;
        }
        Long l = this.b;
        if (l != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            armh armhVar3 = (armh) createBuilder.instance;
            armhVar3.b |= 8;
            armhVar3.f = longValue;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a);
    }

    public final void d(String str, boolean z) {
        if (!z) {
            str = i(str);
        }
        this.c = str;
    }
}
