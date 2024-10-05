package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ion extends aasw {
    public final afsy a;
    public haj b;
    public final aasp c;
    private final aarm g;
    private final aadw h;

    public ion(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, aadw aadwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        aarmVar.getClass();
        this.g = aarmVar;
        this.h = aadwVar;
        this.c = c(arsg.a, aarmVar, fkp.m, iom.a);
    }

    public final ioo a() {
        ioo iooVar = new ioo(this.f, this.a.c(), null, null, null);
        if (this.h.b() != null) {
            atej atejVar = this.h.b().k;
            if (atejVar == null) {
                atejVar = atej.a;
            }
            aper aperVar = atejVar.v;
            if (aperVar == null) {
                aperVar = aper.a;
            }
            iooVar.i = aperVar.c;
        }
        return iooVar;
    }

    public final void b(iol iolVar, afwx afwxVar) {
        this.e.a(this.g.a(iolVar, arsd.a, afwxVar, fkp.l, iom.b));
    }
}
