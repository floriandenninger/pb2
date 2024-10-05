package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazq extends aasw {
    private final aasp a;
    private boolean b;

    public aazq(aarm aarmVar, ajoy ajoyVar, ysl yslVar, aadw aadwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        boolean z = false;
        this.b = false;
        this.a = c(arps.a, aarmVar, aazd.m, aayn.u);
        apwy b = aadwVar.b();
        if (b != null) {
            atej atejVar = b.k;
            aquo aquoVar = (atejVar == null ? atej.a : atejVar).k;
            z = (aquoVar == null ? aquo.a : aquoVar).e;
        }
        this.b = z;
    }

    public final aazp a(afsx afsxVar, String str, boolean z) {
        return new aazp(this.f, afsxVar, str, this.b, z, null, null, null);
    }

    public final void b(aazp aazpVar, afwx afwxVar) {
        this.a.e(aazpVar, afwxVar);
    }
}
