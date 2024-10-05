package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavy extends aasw implements aasm {
    public final afsy a;
    public final aarm b;
    public final aasp c;
    public final aasp g;
    public final aasp h;
    public final aasp i;
    private final aasp j;

    public aavy(aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = afsyVar;
        aarmVar.getClass();
        this.b = aarmVar;
        c(arlw.a, aarmVar, aavh.f, aavd.l);
        this.c = c(arlt.a, aarmVar, aavh.e, aavd.k);
        this.j = c(armb.a, aarmVar, aavh.h, aavd.n);
        this.g = c(arly.a, aarmVar, aavh.g, aavd.m);
        this.h = c(armi.a, aarmVar, aavh.d, aavd.p);
        this.i = c(armf.a, aarmVar, aavh.c, aavd.o);
    }

    @Override // defpackage.aasm
    public final /* bridge */ /* synthetic */ aaru a(ajce ajceVar) {
        aawc aawcVar = new aawc(this.f, this.a.c(), null, null, null);
        aawcVar.a = aawc.i(ajceVar.b());
        aawcVar.m(ajceVar.d());
        return aawcVar;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        aawc aawcVar = (aawc) aaruVar;
        this.e.a(this.b.a(aawcVar, arlw.a, new aavw(aaslVar, afwxVar), aavh.f, aavd.l));
    }

    public final anhy d(aawa aawaVar, Executor executor) {
        return this.j.b(aawaVar, executor);
    }
}
