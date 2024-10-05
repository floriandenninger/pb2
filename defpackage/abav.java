package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abav extends aasw implements aasm {
    public final afsy a;
    public final aasp b;
    public final aasp c;
    public final aasp g;
    private final aasp h;
    private final aasp i;
    private final abau j;

    public abav(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        this.h = c(arzg.a, aarmVar, abaa.j, aazu.r);
        this.b = c(arzi.a, aarmVar, abaa.k, aazu.s);
        this.c = c(arzk.a, aarmVar, abaa.l, aazu.t);
        this.i = c(arzn.a, aarmVar, abaa.m, aazu.u);
        this.g = c(arsp.a, aarmVar, abaa.i, aazu.q);
        this.j = new abau(aarmVar, yslVar);
    }

    @Override // defpackage.aasm
    public final /* bridge */ /* synthetic */ aaru a(ajce ajceVar) {
        abat f = f();
        f.a = abat.i(ajceVar.b());
        f.k();
        return f;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.j.j((abat) aaruVar, aaslVar, afwxVar);
    }

    public final abap d() {
        return new abap(this.f, this.a.c(), null, null, null);
    }

    public final abas e() {
        return new abas(this.f, this.a.c(), null, null, null);
    }

    public final abat f() {
        return new abat(this.f, this.a.c(), null, null, null);
    }

    public final void g(abap abapVar, afwx afwxVar) {
        this.h.e(abapVar, afwxVar);
    }

    public final void h(aaru aaruVar, afwx afwxVar) {
        this.i.e(aaruVar, afwxVar);
    }
}
