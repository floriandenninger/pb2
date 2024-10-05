package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aauy extends aava {
    public String a;

    public aauy(ajoy ajoyVar, afsy afsyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, afsyVar, null, null, null);
    }

    @Override // defpackage.aava, defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone d = super.d();
        aone createBuilder = ascv.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        ascv ascvVar = (ascv) createBuilder.instance;
        str.getClass();
        ascvVar.b |= 1;
        ascvVar.c = str;
        d.copyOnWrite();
        ascw ascwVar = (ascw) d.instance;
        ascv ascvVar2 = (ascv) createBuilder.build();
        ascw ascwVar2 = ascw.a;
        ascvVar2.getClass();
        ascwVar.g = ascvVar2;
        ascwVar.b |= 16384;
        return d;
    }

    @Override // defpackage.aava, defpackage.aaqh
    public final void c() {
        super.c();
        zhq.m(this.a);
    }
}
