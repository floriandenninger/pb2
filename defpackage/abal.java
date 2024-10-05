package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abal extends aasw implements aasm {
    public final aasu a;
    private final afsy b;
    private final boolean c;

    public abal(ajoy ajoyVar, ysl yslVar, afsy afsyVar, aadw aadwVar, aarm aarmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.b = afsyVar;
        this.c = aaec.b(aadwVar);
        this.a = new abai(aarmVar, yslVar, attf.a, abaa.f, aazu.n);
    }

    @Override // defpackage.aasm
    public final /* bridge */ /* synthetic */ aaru a(ajce ajceVar) {
        abak d = d();
        d.b = abak.i(ajceVar.b());
        d.m(ajceVar.d());
        return d;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.a.j((abak) aaruVar, aaslVar, afwxVar);
    }

    public final abak d() {
        return new abak(this.f, this.b.c(), this.c, null, null, null);
    }
}
