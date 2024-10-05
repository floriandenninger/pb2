package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ltv extends lxu {
    public ltu a;
    private View j;

    public ltv(ViewGroup viewGroup, ajwi ajwiVar, ajoy ajoyVar, ajvb ajvbVar, aasm aasmVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        super(viewGroup, ajwiVar, ajoyVar, ajvbVar, aasmVar, ypaVar, zawVar, acraVar);
    }

    @Override // defpackage.lxu
    protected final void c(ajpd ajpdVar, auok auokVar, boolean z) {
        if (auokVar.j) {
            return;
        }
        boolean z2 = false;
        for (auom auomVar : auokVar.g) {
            if (auomVar.b == 105604662) {
                auoi auoiVar = (auoi) auomVar.c;
                if (!auoiVar.o) {
                    if (auoiVar.l) {
                        q(auoiVar, true);
                    }
                    z2 = true;
                }
            }
        }
        boolean z3 = !ajpdVar.isEmpty() && (ajpdVar.get(0) instanceof auok);
        if (!z2) {
            if (z && z3) {
                ajpdVar.remove(0);
                return;
            }
            return;
        }
        if (!z) {
            ajpdVar.add(auokVar);
        } else if (z3) {
            ajpdVar.n(0, auokVar);
        } else {
            ajpdVar.add(0, auokVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lxu
    public final void d(ajok ajokVar, ajng ajngVar, int i) {
        super.d(ajokVar, ajngVar, i);
        ajokVar.f("SECTION_LIST_DRAWER_COMPACT_MODE", true);
        ajokVar.f("is_horizontal_drawer_context", true);
    }

    public final void f() {
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.lxu
    protected final void k() {
        RecyclerView recyclerView = this.d;
        this.b.getContext();
        recyclerView.af(new LinearLayoutManager(0));
        ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.drawer_shadow_stub);
        if (viewStub == null || this.j != null) {
            return;
        }
        this.j = viewStub.inflate();
    }

    @Override // defpackage.lxu
    protected final void l(ajox ajoxVar) {
        ajoxVar.u(new ltt(this, ajoxVar));
    }

    public final void m() {
        RecyclerView recyclerView = this.c.K;
        if (recyclerView.canScrollVertically(-1) || (recyclerView.getChildAt(0) != null && recyclerView.getChildAt(0).getTop() < 0)) {
            View view = this.j;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        f();
    }
}
