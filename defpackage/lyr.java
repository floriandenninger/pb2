package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyr extends lxu implements lxw {
    public lxv a;
    private View j;

    public lyr(ViewGroup viewGroup, ajwi ajwiVar, ajoy ajoyVar, ajvb ajvbVar, aasm aasmVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        super(viewGroup, ajwiVar, ajoyVar, ajvbVar, aasmVar, ypaVar, zawVar, acraVar);
    }

    @Override // defpackage.lxu
    protected final void c(ajpd ajpdVar, auok auokVar, boolean z) {
        auoi auoiVar;
        auoi auoiVar2;
        if (z) {
            ajpdVar.n(0, auokVar);
        } else {
            ajpdVar.add(auokVar);
        }
        int i = 0;
        while (i < auokVar.g.size()) {
            auom auomVar = (auom) auokVar.g.get(i);
            if (auomVar.b == 105604662) {
                auoiVar = (auoi) auomVar.c;
            } else {
                auoiVar = auoi.a;
            }
            if (auoiVar.l) {
                if (auomVar.b == 105604662) {
                    auoiVar2 = (auoi) auomVar.c;
                } else {
                    auoiVar2 = auoi.a;
                }
                q(auoiVar2, i != 0);
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lxu
    public final void d(ajok ajokVar, ajng ajngVar, int i) {
        super.d(ajokVar, ajngVar, i);
        ajokVar.f("drawer_expansion_state_controller", this.a);
    }

    @Override // defpackage.lxw
    public final void f(float f) {
        Resources resources = this.d.getResources();
        yny.z(this.d, yny.x(resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed) + ((int) ((resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_expanded) - r1) * f))), ViewGroup.LayoutParams.class);
        int i = resources.getConfiguration().orientation;
        if (f == 0.0f || i != 1) {
            this.j.setVisibility(8);
        } else if (f > 0.0f) {
            this.j.setAlpha(f);
            this.j.setVisibility(0);
        }
        zev.d(f > 0.0f ? this.d : this.b);
    }

    @Override // defpackage.lxu
    protected final void k() {
        this.j = ((ViewStub) this.b.findViewById(R.id.translucent_panel_stub)).inflate();
        Resources resources = this.b.getResources();
        lxv lxvVar = new lxv(new zay(this.b.getContext()), resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_expanded) - resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed));
        this.a = lxvVar;
        lxvVar.b(this);
        RecyclerView recyclerView = this.d;
        this.b.getContext();
        recyclerView.af(new LinearLayoutManager());
        this.d.v(this.a);
        this.j.bringToFront();
        this.d.bringToFront();
        r(this.d.getResources().getConfiguration().orientation);
        this.j.setOnClickListener(new lyq(this));
    }

    @Override // defpackage.lxu
    public final void r(int i) {
        zhh j;
        if (i == 1) {
            j = yny.r(this.d.getResources().getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed));
            this.a.e(false);
        } else {
            this.j.setVisibility(8);
            j = yny.j(17, this.d.getId());
            this.a.f(false);
        }
        yny.z(this.f, j, RelativeLayout.LayoutParams.class);
    }

    @Override // defpackage.lxu
    public final void s(aone aoneVar) {
        super.s(aoneVar);
        auoi auoiVar = (auoi) aoneVar.instance;
        if (auoiVar.e == 11 && ((auoj) auoiVar.f).b == 60487319 && this.a.a() > 0.0f && this.d.getResources().getConfiguration().orientation == 1) {
            this.a.e(true);
        }
    }
}
