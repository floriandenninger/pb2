package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.ui.actionbar.MainCollapsingToolbarLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzu extends lo {
    final /* synthetic */ MainCollapsingToolbarLayout a;

    public lzu(MainCollapsingToolbarLayout mainCollapsingToolbarLayout) {
        this.a = mainCollapsingToolbarLayout;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        MainCollapsingToolbarLayout mainCollapsingToolbarLayout = this.a;
        boolean z = false;
        if (mainCollapsingToolbarLayout.isLaidOut() && !mainCollapsingToolbarLayout.isInEditMode()) {
            z = true;
        }
        if (mainCollapsingToolbarLayout.d(z)) {
            return;
        }
        this.a.b((RecyclerView) null);
    }
}
