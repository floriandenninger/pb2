package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aazc extends aasw implements aasm {
    private final afsy a;
    private final aazb b;

    public aazc(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.b = new aazb(aarmVar, yslVar);
    }

    @Override // defpackage.aasm
    public final aaru a(ajce ajceVar) {
        aayw d = d();
        d.d(ajceVar);
        return d;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.b.j((aayw) aaruVar, aaslVar, afwxVar);
    }

    public final aayw d() {
        return new aayw(this.f, this.a.c(), null, null, null);
    }
}
