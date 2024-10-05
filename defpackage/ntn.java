package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ntn extends lo {
    final /* synthetic */ nto a;

    public ntn(nto ntoVar) {
        this.a = ntoVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if ((recyclerView.n instanceof LinearLayoutManager) && fkc.h(recyclerView)) {
            int a = this.a.c.a.a();
            nto ntoVar = this.a;
            if (a != ntoVar.n) {
                ntoVar.n = a;
                ntoVar.j.lF(ajcd.NEXT);
            }
        }
    }
}
