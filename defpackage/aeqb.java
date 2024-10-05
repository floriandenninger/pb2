package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeqb extends cne {
    final /* synthetic */ aeqc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeqb(aeqc aeqcVar) {
        super(30000, 4, 1.0f);
        this.b = aeqcVar;
    }

    @Override // defpackage.cne, defpackage.cnn
    public final void c(cnq cnqVar) {
        aeqc aeqcVar;
        aftj aftjVar;
        if (cnqVar instanceof cnb) {
            if (this.a > 0) {
                throw cnqVar;
            }
            if (!this.b.a.z() && (aftjVar = (aeqcVar = this.b).b) != null) {
                afic aficVar = afic.ABR;
                aftjVar.a(aeqcVar.a).b(this.b.a);
                this.b.t();
            }
        }
        super.c(cnqVar);
    }
}
