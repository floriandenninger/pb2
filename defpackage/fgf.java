package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fgf implements afwx {
    final /* synthetic */ aaqh a;
    final /* synthetic */ fgi b;

    public fgf(fgi fgiVar, aaqh aaqhVar) {
        this.b = fgiVar;
        this.a = aaqhVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.f(cnqVar);
        if (this.b.m(this.a)) {
            fgi fgiVar = this.b;
            fgiVar.d = cnqVar;
            if (fgiVar.e != null) {
                fgiVar.k(cnqVar);
                this.b.j();
            }
        }
    }

    @Override // defpackage.cnl
    public final void kZ(Object obj) {
        this.b.g(obj);
        if (this.b.m(this.a)) {
            fgi fgiVar = this.b;
            fgiVar.b = obj;
            fgiVar.d = null;
            fgiVar.c = fgiVar.a.d();
            fgi fgiVar2 = this.b;
            if (fgiVar2.e != null) {
                afwx b = fgiVar2.b();
                if (b != null) {
                    b.kZ(obj);
                }
                this.b.j();
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
