package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgq extends lo implements wl {
    public final RecyclerView a;
    public final fok b;
    public final ScrollSelectionController c;
    public boolean d;

    public mgq(RecyclerView recyclerView, fok fokVar, ScrollSelectionController scrollSelectionController) {
        this.a = recyclerView;
        this.b = fokVar;
        this.c = scrollSelectionController;
    }

    @Override // defpackage.wl
    public final void a(wv wvVar) {
        RecyclerView recyclerView = this.a;
        recyclerView.removeCallbacks(new mgp(this));
        recyclerView.post(new mgp(this));
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0 || i == 1) {
            this.d = false;
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (this.d) {
            return;
        }
        this.c.q();
    }
}
