package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajwh extends lo {
    final /* synthetic */ ajwi a;

    public ajwh(ajwi ajwiVar) {
        this.a = ajwiVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        ajwi ajwiVar = this.a;
        Runnable runnable = ajwiVar.p;
        if (runnable != null) {
            if (i == 1) {
                ajwiVar.p = null;
            } else if (i == 0) {
                recyclerView.post(runnable);
                ajwiVar.p = null;
            }
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        wd wdVar = recyclerView.n;
        if (wdVar instanceof LinearLayoutManager) {
            this.a.L = ((LinearLayoutManager) wdVar).J();
        }
    }
}
