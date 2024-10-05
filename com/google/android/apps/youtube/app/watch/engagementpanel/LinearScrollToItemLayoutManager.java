package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import defpackage.ajxc;
import defpackage.nsx;
import defpackage.omm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LinearScrollToItemLayoutManager extends OverScrollLinearLayoutManager implements ajxc {
    public int b;
    private final nsx c;
    private Runnable d = omm.b;

    private LinearScrollToItemLayoutManager(Context context) {
        this.c = new nsx(context, 0, 500);
    }

    public static LinearScrollToItemLayoutManager q(Context context) {
        final LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = new LinearScrollToItemLayoutManager(context);
        linearScrollToItemLayoutManager.d = new Runnable() { // from class: nsw
            @Override // java.lang.Runnable
            public final void run() {
                LinearScrollToItemLayoutManager linearScrollToItemLayoutManager2 = LinearScrollToItemLayoutManager.this;
                linearScrollToItemLayoutManager2.bC(linearScrollToItemLayoutManager2.b);
            }
        };
        return linearScrollToItemLayoutManager;
    }

    public final void bA(RecyclerView recyclerView, int i) {
        recyclerView.removeCallbacks(this.d);
        if (Math.abs(i - J()) < 7) {
            bC(i);
            return;
        }
        Z(i);
        this.b = i;
        recyclerView.post(this.d);
    }

    public final void bB(boolean z) {
        this.c.a = z;
    }

    public final void bC(int i) {
        this.c.n();
        nsx nsxVar = this.c;
        nsxVar.b = i;
        bd(nsxVar);
    }

    @Override // defpackage.ajxc
    public final void c(RecyclerView recyclerView, int i, int i2) {
        nsx nsxVar = new nsx(recyclerView.getContext(), i2, 800);
        nsxVar.b = i;
        bd(nsxVar);
    }
}
