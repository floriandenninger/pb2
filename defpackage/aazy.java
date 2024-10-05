package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazy extends aaru {
    public String a;

    public aazy(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("notification/get_inline_opt_out_menu", ajoyVar, afsxVar, null, null, null);
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arwb.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arwb arwbVar = (arwb) createBuilder.instance;
        str.getClass();
        arwbVar.b |= 2;
        arwbVar.d = str;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        zhq.m(this.a);
    }
}
