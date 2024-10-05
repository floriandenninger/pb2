package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iab implements byg {
    final /* synthetic */ iac a;

    public iab(iac iacVar) {
        this.a = iacVar;
    }

    @Override // defpackage.byg
    public final void a(int i) {
    }

    @Override // defpackage.byg
    public final void b(int i, float f, int i2) {
    }

    @Override // defpackage.byg
    public final void c(int i) {
        if (this.a.av.j() == 0) {
            return;
        }
        iao iaoVar = (iao) this.a.aw.o(i);
        if (!iaoVar.b) {
            this.a.aL(true);
            this.a.aM(i);
        }
        iaoVar.c.aa(0);
    }
}
