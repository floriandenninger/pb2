package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abdb implements afwx {
    final /* synthetic */ afwx a;
    final /* synthetic */ abdd b;
    private final /* synthetic */ int c;

    public abdb(abdd abddVar, afwx afwxVar, int i) {
        this.c = i;
        this.b = abddVar;
        this.a = afwxVar;
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.c != 0) {
            this.a.kY(cnqVar);
        } else {
            this.a.kY(cnqVar);
        }
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void kZ(Object obj) {
        if (this.c == 0) {
            asbr asbrVar = (asbr) obj;
            this.b.d(asbrVar.d);
            this.a.kZ(asbrVar);
        } else {
            asbp asbpVar = (asbp) obj;
            this.b.d(asbpVar.d);
            this.a.kZ(asbpVar);
        }
    }
}
