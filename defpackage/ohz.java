package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ohz extends gmm {
    private final ajng a;

    public ohz(ajng ajngVar) {
        this.a = ajngVar;
    }

    @Override // defpackage.gmm
    public final int a(int i) {
        Object c = this.a.c(i);
        if (c instanceof aulg) {
            return 63;
        }
        return c instanceof apzy ? 1 : 0;
    }

    @Override // defpackage.gmm
    public final long b(int i) {
        if (this.a.c(i) != null) {
            return r3.hashCode();
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.gmm
    public final void c(View view, View view2) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.related_chip_cloud);
        if (recyclerView2 == null || !(recyclerView2.n instanceof LinearLayoutManager) || (recyclerView = (RecyclerView) view2.findViewById(R.id.related_chip_cloud)) == null) {
            return;
        }
        wd wdVar = recyclerView.n;
        if (wdVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.n;
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) wdVar;
            linearLayoutManager2.Y(linearLayoutManager.P());
            int b = recyclerView2.m.b();
            if (b == recyclerView.m.b()) {
                for (int i = 0; i < b; i++) {
                    View S = linearLayoutManager.S(i);
                    View S2 = linearLayoutManager2.S(i);
                    if ((S instanceof gdq) && (S2 instanceof gdq)) {
                        ((gdq) S2).d(((gdq) S).f);
                    }
                }
            }
        }
    }
}
