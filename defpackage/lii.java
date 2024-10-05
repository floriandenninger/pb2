package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lii extends algb {
    final /* synthetic */ lhj a;
    final /* synthetic */ lij b;

    public lii(lij lijVar, lhj lhjVar) {
        this.b = lijVar;
        this.a = lhjVar;
    }

    @Override // defpackage.algb
    public final void b(View view, int i) {
        if (i == 5 && this.b.e.ar()) {
            ce ceVar = this.b.e;
            if (ceVar.H || ceVar.s || ceVar.au()) {
                return;
            }
            dn k = this.b.e.mN().k();
            k.m(this.a);
            if (((Boolean) this.b.q.v().aJ().e(0).aB()).booleanValue()) {
                k.d();
            } else {
                k.a();
            }
        }
    }

    @Override // defpackage.algb
    public final void mx(View view, float f) {
    }
}
