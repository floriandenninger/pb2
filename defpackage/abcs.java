package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abcs extends aasw implements aasm {
    public final aasu a;
    private final afsy b;

    public abcs(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.b = afsyVar;
        this.a = new abcr(aarmVar, yslVar);
    }

    @Override // defpackage.aasm
    public final aaru a(ajce ajceVar) {
        abcq d = d();
        d.b = abcq.i(ajceVar.b());
        d.m(ajceVar.d());
        return d;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.a.j((abcq) aaruVar, aaslVar, afwxVar);
    }

    public final abcq d() {
        return new abcq(this.f, this.b.c(), null, null, null);
    }
}
