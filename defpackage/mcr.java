package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcr extends lo implements alff {
    private final mcs a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;

    public mcr(mcs mcsVar) {
        this.a = mcsVar;
    }

    @Override // defpackage.alfb
    public final void a(AppBarLayout appBarLayout, int i) {
        if (this.d) {
            return;
        }
        if (Math.abs(i) != appBarLayout.g() || !this.b) {
            if (i == 0 && this.c) {
                this.a.n();
                return;
            }
            return;
        }
        this.c = true;
        this.a.m();
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        if (this.d || this.b || i != 1) {
            return;
        }
        this.b = true;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (!this.d && i2 < 0) {
            this.a.n();
        }
    }

    public final void j(RecyclerView recyclerView, AppBarLayout appBarLayout) {
        if (recyclerView == null || appBarLayout == null) {
            zga.b("Could not attach PartialPullListener listener as one or more target views was null.");
        } else {
            recyclerView.aD(this);
            appBarLayout.i(this);
        }
    }

    public final void k(final RecyclerView recyclerView, final AppBarLayout appBarLayout) {
        if (this.d) {
            return;
        }
        this.d = true;
        if (recyclerView == null || appBarLayout == null) {
            zga.l("Disabled PartialPullListener but did not remove it, as one or more of the target  views was null.");
        } else {
            recyclerView.post(new Runnable() { // from class: mcp
                @Override // java.lang.Runnable
                public final void run() {
                    recyclerView.aF(mcr.this);
                }
            });
            appBarLayout.post(new Runnable() { // from class: mcq
                @Override // java.lang.Runnable
                public final void run() {
                    appBarLayout.k(mcr.this);
                }
            });
        }
    }
}
