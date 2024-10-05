package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ybd implements afwx {
    final /* synthetic */ boolean a;
    final /* synthetic */ ybe b;

    public ybd(ybe ybeVar, boolean z) {
        this.b = ybeVar;
        this.a = z;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.a) {
            this.b.d.dismiss();
        }
        this.b.b.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        asga asgaVar = (asga) obj;
        if (this.a) {
            this.b.d.dismiss();
        }
        if (asgaVar.f.isEmpty()) {
            return;
        }
        this.b.a.mM().D(new acqx(asgaVar.g));
        this.b.c.d(asgaVar.f, null);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
