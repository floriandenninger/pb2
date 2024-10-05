package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class itq implements aasm {
    public final ivm a;
    private final aaue b;
    private final azrw c;
    private final aaea e;
    private final azrw f;
    private final ammv g;
    private final aadw h;

    public itq(aaue aaueVar, ivm ivmVar, aadw aadwVar, azrw azrwVar, aaea aaeaVar, azrw azrwVar2, ammv ammvVar) {
        aaueVar.getClass();
        this.b = aaueVar;
        ivmVar.getClass();
        this.a = ivmVar;
        this.h = aadwVar;
        azrwVar.getClass();
        this.c = azrwVar;
        this.e = aaeaVar;
        this.f = azrwVar2;
        this.g = ammvVar;
    }

    @Override // defpackage.aasm
    public final aaru a(ajce ajceVar) {
        aauc a = this.b.a(ajceVar);
        izr.q(this.c, a, this.h);
        izr.o(a, this.f, this.e);
        if (this.g.h()) {
            ((yfm) this.g.c()).a(a);
        }
        return a;
    }

    @Override // defpackage.aasm
    public final void b(aaru aaruVar, aasl aaslVar, afwx afwxVar) {
        this.b.b(aaruVar, aaslVar, new itp(this, afwxVar));
    }
}
