package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kun extends kul {
    private final float f;

    public kun(aadw aadwVar) {
        float f;
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        awan awanVar = (asvuVar == null ? asvu.a : asvuVar).v;
        if (((awanVar == null ? awan.a : awanVar).b & 256) != 0) {
            asvu asvuVar2 = b.e;
            awan awanVar2 = (asvuVar2 == null ? asvu.a : asvuVar2).v;
            f = (awanVar2 == null ? awan.a : awanVar2).h;
        } else {
            f = 0.2f;
        }
        this.f = f;
    }

    @Override // defpackage.kul
    public final boolean a() {
        float f = this.b;
        float f2 = this.a;
        float f3 = f > f2 ? (f - f2) / f : (f2 - f) / f2;
        return !this.d && this.e && this.c && ((f3 > 0.02f ? 1 : (f3 == 0.02f ? 0 : -1)) >= 0 && (f3 > this.f ? 1 : (f3 == this.f ? 0 : -1)) <= 0);
    }
}
