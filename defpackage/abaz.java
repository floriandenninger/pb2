package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abaz extends aasw {
    public final ypa a;
    public final aahv b;
    private final afsy c;
    private final abay g;

    public abaz(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, ypa ypaVar, aahv aahvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.c = afsyVar;
        this.a = ypaVar;
        this.b = aahvVar;
        this.g = new abay(this, aarmVar);
    }

    public final abaw a() {
        return new abaw(this.f, this.c.c(), null, null, null);
    }

    public final void b(aaru aaruVar, afwx afwxVar) {
        this.g.i(aaruVar, afwxVar);
    }
}
