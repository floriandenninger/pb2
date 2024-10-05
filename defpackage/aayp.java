package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aayp extends aaru {
    public astx a;
    public String b;
    public int c;

    public aayp(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("live/get_broadcast_setup", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arqw.a.createBuilder();
        astx astxVar = this.a;
        if (astxVar != null) {
            createBuilder.copyOnWrite();
            arqw arqwVar = (arqw) createBuilder.instance;
            arqwVar.d = astxVar;
            arqwVar.b |= 2;
        }
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            arqw arqwVar2 = (arqw) createBuilder.instance;
            arqwVar2.b |= 4;
            arqwVar2.e = str;
        }
        int i = this.c;
        if (i != 0) {
            createBuilder.copyOnWrite();
            arqw arqwVar3 = (arqw) createBuilder.instance;
            arqwVar3.f = i - 1;
            arqwVar3.b |= 16;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
    }
}
