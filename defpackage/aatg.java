package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatg extends aasw {
    private final aatf a;
    private final boolean b;
    private final boolean c;

    public aatg(aarm aarmVar, ajoy ajoyVar, ysl yslVar, aadw aadwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = new aatf(this, aarmVar);
        this.b = aaec.b(aadwVar);
        aotz aotzVar = aadwVar.b().i;
        this.c = (aotzVar == null ? aotz.a : aotzVar).e;
    }

    public final void a(afsx afsxVar, afwx afwxVar, String str, int i) {
        this.a.i(new aate(this.f, afsxVar, str, i, this.b, this.c, null, null, null), afwxVar);
    }
}
