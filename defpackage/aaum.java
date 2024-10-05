package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaum extends aaru {
    public aomf a;
    public String b;
    public String c;
    public int d;
    public int s;
    public int t;
    public String u;
    public awjw v;

    public aaum(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("channel/create_channel", ajoyVar, afsxVar, null, null, null);
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arks.a.createBuilder();
        aomf aomfVar = this.a;
        createBuilder.copyOnWrite();
        arks arksVar = (arks) createBuilder.instance;
        aomfVar.getClass();
        arksVar.b |= 2;
        arksVar.d = aomfVar;
        String str = this.b;
        createBuilder.copyOnWrite();
        arks arksVar2 = (arks) createBuilder.instance;
        arksVar2.b |= 8;
        arksVar2.e = i(str);
        String str2 = this.c;
        createBuilder.copyOnWrite();
        arks arksVar3 = (arks) createBuilder.instance;
        arksVar3.b |= 16;
        arksVar3.f = i(str2);
        String str3 = this.u;
        createBuilder.copyOnWrite();
        arks arksVar4 = (arks) createBuilder.instance;
        arksVar4.b |= 256;
        arksVar4.j = i(str3);
        int i = this.d;
        createBuilder.copyOnWrite();
        arks arksVar5 = (arks) createBuilder.instance;
        arksVar5.b |= 32;
        arksVar5.g = i;
        int i2 = this.s;
        createBuilder.copyOnWrite();
        arks arksVar6 = (arks) createBuilder.instance;
        arksVar6.b |= 64;
        arksVar6.h = i2;
        int i3 = this.t;
        createBuilder.copyOnWrite();
        arks arksVar7 = (arks) createBuilder.instance;
        arksVar7.b |= 128;
        arksVar7.i = i3;
        awjw awjwVar = this.v;
        if (awjwVar != null) {
            createBuilder.copyOnWrite();
            arks arksVar8 = (arks) createBuilder.instance;
            arksVar8.k = awjwVar;
            arksVar8.b |= 512;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.a.getClass();
    }
}
