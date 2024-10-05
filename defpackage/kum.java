package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kum extends kul {
    private final float f;
    private final float g;

    public kum(aadw aadwVar) {
        float f;
        this.f = evr.ah(aadwVar);
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        awan awanVar = (asvuVar == null ? asvu.a : asvuVar).v;
        if (((awanVar == null ? awan.a : awanVar).b & 4) != 0) {
            asvu asvuVar2 = b.e;
            awan awanVar2 = (asvuVar2 == null ? asvu.a : asvuVar2).v;
            f = (awanVar2 == null ? awan.a : awanVar2).e;
        } else {
            f = 1.7f;
        }
        this.g = f;
    }

    @Override // defpackage.kul
    public final boolean a() {
        float f = this.g;
        float f2 = this.b;
        float f3 = this.f;
        float f4 = this.a;
        return !this.d && this.e && this.c && f <= f2 && f3 <= f4 && 1.02f * f2 <= f4;
    }
}
