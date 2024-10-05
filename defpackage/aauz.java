package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aauz extends aava {
    public String a;
    public int b;

    public aauz(ajoy ajoyVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, afsyVar, null, null, null);
    }

    @Override // defpackage.aava, defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone d = super.d();
        if (this.b == 2) {
            aone createBuilder = ascs.a.createBuilder();
            String str = this.a;
            createBuilder.copyOnWrite();
            ascs ascsVar = (ascs) createBuilder.instance;
            str.getClass();
            ascsVar.b = 1;
            ascsVar.c = str;
            d.copyOnWrite();
            ascw ascwVar = (ascw) d.instance;
            ascs ascsVar2 = (ascs) createBuilder.build();
            ascw ascwVar2 = ascw.a;
            ascsVar2.getClass();
            ascwVar.e = ascsVar2;
            ascwVar.b |= 128;
        }
        if (this.b == 3) {
            aone createBuilder2 = ascu.a.createBuilder();
            String str2 = this.a;
            createBuilder2.copyOnWrite();
            ascu ascuVar = (ascu) createBuilder2.instance;
            str2.getClass();
            ascuVar.b = 1;
            ascuVar.c = str2;
            d.copyOnWrite();
            ascw ascwVar3 = (ascw) d.instance;
            ascu ascuVar2 = (ascu) createBuilder2.build();
            ascw ascwVar4 = ascw.a;
            ascuVar2.getClass();
            ascwVar3.f = ascuVar2;
            ascwVar3.b |= 1024;
        }
        return d;
    }

    @Override // defpackage.aava, defpackage.aaqh
    public final void c() {
        super.c();
        zhq.m(this.a);
        amkq.N(this.b != 1);
    }
}
