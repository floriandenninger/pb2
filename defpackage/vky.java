package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vky extends lo {
    final /* synthetic */ GridLayoutManager a;
    final /* synthetic */ vnl b;
    final /* synthetic */ vkz c;

    public vky(vkz vkzVar, GridLayoutManager gridLayoutManager, vnl vnlVar) {
        this.c = vkzVar;
        this.a = gridLayoutManager;
        this.b = vnlVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        int L = this.a.L() + 200;
        if (L > this.c.f) {
            this.b.b(L);
            this.c.f = L;
        }
    }
}
