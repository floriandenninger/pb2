package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aaxm extends aaru {
    public String a;
    public String b;
    public int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaxm(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("player/heartbeat", ajoyVar, afsxVar, null, null, null);
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public void c() {
        zhq.m(this.k);
        zhq.m(this.a);
        zhq.m(this.b);
        amkq.N(this.c >= 0);
    }

    public void d(String str) {
        this.a = str;
    }

    @Override // defpackage.aaru
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public aone a() {
        aone createBuilder = arxm.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arxm arxmVar = (arxm) createBuilder.instance;
        str.getClass();
        arxmVar.b |= 2;
        arxmVar.d = str;
        String str2 = this.b;
        createBuilder.copyOnWrite();
        arxm arxmVar2 = (arxm) createBuilder.instance;
        str2.getClass();
        arxmVar2.b |= 4;
        arxmVar2.e = str2;
        int i = this.c;
        createBuilder.copyOnWrite();
        arxm arxmVar3 = (arxm) createBuilder.instance;
        arxmVar3.b |= 32;
        arxmVar3.g = i;
        return createBuilder;
    }
}
