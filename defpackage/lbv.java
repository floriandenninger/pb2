package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lbv extends lo {
    final /* synthetic */ lbz a;

    public lbv(lbz lbzVar) {
        this.a = lbzVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 1) {
            whu.C(this.a.aD);
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        lbz lbzVar = this.a;
        lbzVar.aG = Math.max(lbzVar.aG, lbzVar.aC.L());
    }
}
