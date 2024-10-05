package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvs extends bwe {
    boolean a = false;
    final /* synthetic */ ViewGroup b;

    public bvs(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void a(bwd bwdVar) {
        if (!this.a) {
            bwo.a(this.b, false);
        }
        bwdVar.B(this);
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void b() {
        bwo.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void c() {
        bwo.a(this.b, false);
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void d() {
        bwo.a(this.b, true);
    }
}
