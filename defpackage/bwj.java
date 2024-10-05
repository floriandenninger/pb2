package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwj extends bwe {
    final bwk a;

    public bwj(bwk bwkVar) {
        this.a = bwkVar;
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void a(bwd bwdVar) {
        bwk bwkVar = this.a;
        int i = bwkVar.p - 1;
        bwkVar.p = i;
        if (i == 0) {
            bwkVar.q = false;
            bwkVar.p();
        }
        bwdVar.B(this);
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void e() {
        bwk bwkVar = this.a;
        if (bwkVar.q) {
            return;
        }
        bwkVar.u();
        this.a.q = true;
    }
}
