package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazj extends aaru {
    public aomf a;
    public String b;
    public asrh c;
    public String d;

    public aazj(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live_chat/send_message", ajoyVar, afsxVar, null, null, null);
        this.a = aomf.b;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = asau.a.createBuilder();
        aomf aomfVar = this.a;
        createBuilder.copyOnWrite();
        asau asauVar = (asau) createBuilder.instance;
        aomfVar.getClass();
        asauVar.b |= 2;
        asauVar.f = aomfVar;
        asrh asrhVar = this.c;
        if (asrhVar != null) {
            createBuilder.copyOnWrite();
            asau asauVar2 = (asau) createBuilder.instance;
            asauVar2.d = asrhVar;
            asauVar2.c = 6;
        } else {
            String str = this.b;
            createBuilder.copyOnWrite();
            asau asauVar3 = (asau) createBuilder.instance;
            str.getClass();
            asauVar3.c = 4;
            asauVar3.d = str;
        }
        String str2 = this.d;
        createBuilder.copyOnWrite();
        asau asauVar4 = (asau) createBuilder.instance;
        asauVar4.b |= 16;
        asauVar4.g = i(str2);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
