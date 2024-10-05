package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatx extends aaru {
    public String a;
    public String b;

    public aatx(ajoy ajoyVar, afsx afsxVar, String str, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("att/log", ajoyVar, afsxVar, 1, false, str, Boolean.valueOf(z), null, null, null);
        this.a = "";
        this.b = "";
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = aruq.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aruq aruqVar = (aruq) createBuilder.instance;
        str.getClass();
        aruqVar.b |= 2;
        aruqVar.f = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        aruq aruqVar2 = (aruq) createBuilder.instance;
        str2.getClass();
        aruqVar2.c = 4;
        aruqVar2.d = str2;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amkq.E(!(this.a.isEmpty() || this.b.isEmpty()));
    }
}
