package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vkm extends lo {
    final /* synthetic */ vnj a;
    final /* synthetic */ vkn b;

    public vkm(vkn vknVar, vnj vnjVar) {
        this.b = vknVar;
        this.a = vnjVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        int L = ((GridLayoutManager) recyclerView.n).L() + 200;
        if (L > this.b.f) {
            this.a.a(L);
            this.b.f = L;
        }
    }
}
