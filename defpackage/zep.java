package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zep extends lo {
    final /* synthetic */ zeq a;

    public zep(zeq zeqVar) {
        this.a = zeqVar;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        zeq zeqVar = this.a;
        if (recyclerView != zeqVar.b) {
            return;
        }
        for (SwipeLayout swipeLayout : zeqVar.a) {
            if (swipeLayout.isAttachedToWindow() && swipeLayout.r()) {
                swipeLayout.f();
            }
        }
    }
}
