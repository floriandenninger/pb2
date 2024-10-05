package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvj extends ajsv {
    final /* synthetic */ nvk a;

    public nvj(nvk nvkVar) {
        this.a = nvkVar;
    }

    @Override // defpackage.ajsv, defpackage.ajww
    public final void c(aamd aamdVar, boolean z) {
        LinearScrollToItemLayoutManager linearScrollToItemLayoutManager;
        int bC;
        int bD;
        if (z) {
            auov auovVar = aamdVar.a;
            RecyclerView recyclerView = this.a.g;
            if (recyclerView != null && (linearScrollToItemLayoutManager = (LinearScrollToItemLayoutManager) recyclerView.n) != null) {
                linearScrollToItemLayoutManager.ac(((auovVar.c & 16384) == 0 || (bD = aobq.bD(auovVar.o)) == 0 || bD != 3) ? false : true);
                linearScrollToItemLayoutManager.bB(((auovVar.c & 65536) == 0 || (bC = aobq.bC(auovVar.q)) == 0 || bC != 3) ? false : true);
            }
            nvk nvkVar = this.a;
            nvkVar.e.H(nvkVar.a());
        }
    }
}
