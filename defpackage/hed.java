package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hed implements zob {
    final /* synthetic */ hel a;

    public hed(hel helVar) {
        this.a = helVar;
    }

    @Override // defpackage.zob
    public final void c() {
    }

    @Override // defpackage.zob
    public final void e(float f, float f2) {
        this.a.ay.k(f, f2, new zne() { // from class: hec
            @Override // defpackage.zne
            public final void a(int i, int i2) {
                hed hedVar = hed.this;
                hedVar.a.bi.a(acsb.c(99211)).b();
                hedVar.a.aP.a(i, i2);
            }
        });
    }

    @Override // defpackage.zob
    public final void mi() {
        if (this.a.ba.getVisibility() != 0 && this.a.ay.J()) {
            this.a.bi.a(acsb.c(96641)).i(257);
            this.a.aJ.e();
        }
    }

    @Override // defpackage.zob
    public final void mj(int i) {
        hel helVar = this.a;
        if (helVar.aX && !helVar.ay.I()) {
            this.a.aq.a(i);
        }
    }

    @Override // defpackage.zob
    public final void mo(float f) {
        this.a.ay.j(f);
    }
}
