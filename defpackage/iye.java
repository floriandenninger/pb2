package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iye extends ixv implements giy, gjk, iyj, iya {
    public yqw a;
    private Object af;
    private Fragment$SavedState ag;
    private PanelDescriptor ah;
    private Object ai;
    private Fragment$SavedState aj;
    private PanelDescriptor ak;
    private PanelDescriptor al;
    private iyk an;
    public axpg b;
    public PanelsConfiguration c;
    public jgp d;
    public aoae e;
    private Optional ae = Optional.empty();
    private PanelsBackStack am = PanelsBackStack.e(new ArrayList());

    private final ce aF(int i) {
        return mN().e(i);
    }

    private final PanelDescriptor aG() {
        ce q = q();
        return q instanceof gir ? PaneFragmentPanelDescriptor.b(PaneDescriptor.b((gir) q)) : this.al;
    }

    private final PanelDescriptor aH() {
        ce f = f();
        if (f instanceof gir) {
            return PaneFragmentPanelDescriptor.b(PaneDescriptor.b((gir) f));
        }
        PanelsConfiguration panelsConfiguration = this.c;
        if (panelsConfiguration != null) {
            return panelsConfiguration.a;
        }
        return null;
    }

    private final void aI(PanelsBackStack.PanelsBackStackEntry panelsBackStackEntry) {
        if (panelsBackStackEntry == null) {
            return;
        }
        this.ak = panelsBackStackEntry.a;
        this.aj = panelsBackStackEntry.b;
        this.ai = panelsBackStackEntry.c;
        bh(q(), this.ak, true);
        aJ(this.ak, false);
    }

    private final void aJ(PanelDescriptor panelDescriptor, boolean z) {
        if (z) {
            bh(q(), panelDescriptor, false);
            PanelDescriptor aG = aG();
            if (aG != null) {
                ce q = q();
                this.am.f(aG, mN().c(q), q instanceof gir ? ((gir) q).aT() : null, aG.d());
            }
        }
        this.an.d();
        ce f = f();
        if (f != null) {
            if (f instanceof gir) {
                this.af = ((gir) f).aT();
            }
            this.ag = mN().c(f);
        }
        this.ah = aH();
        h(panelDescriptor, R.id.detail_panel_container);
        k(R.id.detail_panel_container, this.an.h);
    }

    private final boolean bg() {
        if (this.c == null) {
            return false;
        }
        boolean j = this.an.j();
        PanelDescriptor panelDescriptor = this.ah;
        if (!j || panelDescriptor == null) {
            return j;
        }
        bh(q(), panelDescriptor, true);
        h(panelDescriptor, R.id.selection_panel_container);
        return true;
    }

    private static final void bh(ce ceVar, PanelDescriptor panelDescriptor, boolean z) {
        if ((panelDescriptor instanceof PaneFragmentPanelDescriptor) && (ceVar instanceof gir)) {
            gir girVar = (gir) ceVar;
            aone createBuilder = atmc.a.createBuilder();
            boolean z2 = true;
            if (girVar.mM() == null || girVar.mM().k() == null) {
                z2 = false;
            } else {
                String k = girVar.mM().k();
                createBuilder.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder.instance;
                k.getClass();
                atmcVar.b |= 1;
                atmcVar.c = k;
            }
            if (z) {
                int i = acrb.MOBILE_BACK_BUTTON.Jk;
                createBuilder.copyOnWrite();
                atmc atmcVar2 = (atmc) createBuilder.instance;
                atmcVar2.b |= 2;
                atmcVar2.d = i;
            } else if (!z2) {
                return;
            }
            ((PaneFragmentPanelDescriptor) panelDescriptor).a().j((atmc) createBuilder.build());
        }
    }

    private static final Optional bi(PanelDescriptor panelDescriptor) {
        if (!(panelDescriptor instanceof PaneFragmentPanelDescriptor)) {
            return Optional.empty();
        }
        return Optional.of(((PaneFragmentPanelDescriptor) panelDescriptor).a());
    }

    private static final void bj(PanelDescriptor panelDescriptor, PanelDescriptor panelDescriptor2, ce ceVar, Fragment$SavedState fragment$SavedState) {
        if (panelDescriptor != panelDescriptor2 || fragment$SavedState == null) {
            return;
        }
        ceVar.ah(fragment$SavedState);
    }

    @Override // defpackage.giy
    public final boolean E() {
        if (this.am.g()) {
            return d() || !bb() || this.an.i();
        }
        return false;
    }

    @Override // defpackage.giy
    public final boolean F() {
        if (this.am.g()) {
            return bg();
        }
        aI(this.am.d());
        return true;
    }

    @Override // defpackage.giy
    public final boolean G() {
        if (this.am.g()) {
            return bg();
        }
        PanelsBackStack.PanelsBackStackEntry c = this.am.c();
        this.am.h();
        aI(c);
        return true;
    }

    @Override // defpackage.giy
    public final boolean H(PaneDescriptor paneDescriptor) {
        return s(PaneFragmentPanelDescriptor.b(paneDescriptor), paneDescriptor.b.getBoolean("selection_panel_selection_changed", false));
    }

    @Override // defpackage.giy
    public final boolean J() {
        return F();
    }

    @Override // defpackage.gir
    public final gad aM(gad gadVar) {
        if (!r()) {
            return gadVar;
        }
        ce q = q();
        return q instanceof gir ? ((gir) q).lv() : gadVar;
    }

    @Override // defpackage.gir
    public final Optional aR(PaneDescriptor paneDescriptor) {
        if (PaneDescriptor.m(paneDescriptor, (PaneDescriptor) bi(this.ah).orElse(null), this.e)) {
            return Optional.ofNullable(this.af);
        }
        if (PaneDescriptor.m(paneDescriptor, (PaneDescriptor) bi(this.ak).orElse(null), this.e)) {
            return Optional.ofNullable(this.ai);
        }
        return Optional.empty();
    }

    @Override // defpackage.gir
    public final Object aT() {
        iyc iycVar = new iyc();
        ce f = f();
        if (f != null) {
            if (f instanceof gir) {
                iycVar.a = ((gir) f).aT();
            }
            iycVar.d = mN().c(f);
        }
        ce q = q();
        if (q != null) {
            if (q instanceof gir) {
                iycVar.b = ((gir) q).aT();
            }
            iycVar.e = mN().c(q);
        }
        iycVar.c = this.am;
        iycVar.g = aH();
        iycVar.f = aG();
        return new iyd(iycVar.a, iycVar.b, iycVar.c, iycVar.d, iycVar.e, iycVar.f, iycVar.g);
    }

    @Override // defpackage.gir
    public final void aY(Object obj) {
        if (obj instanceof iyd) {
            this.ae = Optional.of((iyd) obj);
        }
    }

    @Override // defpackage.gjk
    public final void b(PanelsConfiguration panelsConfiguration) {
        if (panelsConfiguration == null) {
            return;
        }
        this.c = null;
        this.al = null;
        this.af = null;
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.am.h();
        this.c = panelsConfiguration;
        if (!this.ae.isPresent()) {
            this.an.c();
            return;
        }
        iyd iydVar = (iyd) this.ae.get();
        this.af = iydVar.a;
        this.ah = iydVar.g;
        this.ag = iydVar.d;
        this.ai = iydVar.b;
        this.ak = iydVar.f;
        this.aj = iydVar.e;
        this.am = iydVar.c;
        h(this.ah, R.id.selection_panel_container);
        k(R.id.selection_panel_container, this.an.g);
        h(this.ak, R.id.detail_panel_container);
        k(R.id.detail_panel_container, this.an.h);
    }

    @Override // defpackage.gir
    public final boolean bb() {
        PanelsConfiguration panelsConfiguration = this.c;
        return panelsConfiguration != null && panelsConfiguration.d();
    }

    @Override // defpackage.gjk
    public final /* bridge */ /* synthetic */ void c(PanelDescriptor panelDescriptor, boolean z) {
        s((PaneFragmentPanelDescriptor) panelDescriptor, true);
    }

    @Override // defpackage.gkb
    public final boolean d() {
        return this.an.g();
    }

    @Override // defpackage.gkb
    public final boolean e() {
        iyk iykVar = this.an;
        return (iykVar == null || !iykVar.i() || this.an.h()) ? false : true;
    }

    @Override // defpackage.iya
    public final ce f() {
        return aF(R.id.selection_panel_container);
    }

    @Override // defpackage.iyj
    public final void h(PanelDescriptor panelDescriptor, int i) {
        if (panelDescriptor == null) {
            return;
        }
        Optional c = panelDescriptor.c();
        if (c.isPresent()) {
            if (i == R.id.detail_panel_container) {
                this.al = panelDescriptor;
            }
            ce ceVar = (ce) c.get();
            if (ceVar instanceof gir) {
                if (ceVar.m == null) {
                    ceVar.af(new Bundle());
                }
                if (this.c.d() && i == R.id.detail_panel_container) {
                    ceVar.m.putBoolean("needs_nested_header", true);
                }
                if (i == R.id.selection_panel_container) {
                    ceVar.m.putBoolean("selection_panel", true);
                }
            }
            bj(panelDescriptor, this.ah, ceVar, this.ag);
            bj(panelDescriptor, this.ak, ceVar, this.aj);
            dn k = mN().k();
            k.u(i, ceVar, panelDescriptor.d());
            k.i = 0;
            k.d();
        }
    }

    @Override // defpackage.iyj
    public final void i() {
        ((fzb) this.b.get()).o();
        ((fzb) this.b.get()).j();
        ce q = q();
        if (q instanceof gir) {
            ((gir) q).aZ(d());
        }
    }

    @Override // defpackage.iyj
    public final void j(int i) {
        ce aF = aF(i);
        if (aF != null) {
            dn k = mN().k();
            k.m(aF);
            k.d();
        }
    }

    @Override // defpackage.iyj
    public final void k(int i, int i2) {
        iyk.b(qR(), aF(i), i2);
    }

    @Override // defpackage.gir
    public final gad lv() {
        gad gadVar = this.as;
        if (!r()) {
            return gadVar;
        }
        ce q = q();
        return q instanceof gir ? ((gir) q).lv() : gadVar;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putBundle("fragments.panels.PanelsFragment.restoredPanelsLayoutController", this.an.a());
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.panels_fragment_layout, viewGroup, false);
        this.an = this.d.a(this.a, (ViewGroup) inflate, R.id.selection_panel_container, R.id.detail_panel_container, R.id.panel_separator, this, new amnv() { // from class: iyb
            @Override // defpackage.amnv
            public final Object get() {
                return Optional.ofNullable(iye.this.c);
            }
        }, Optional.ofNullable(bundle != null ? bundle.getBundle("fragments.panels.PanelsFragment.restoredPanelsLayoutController") : null));
        Bundle bundle2 = this.m;
        b(bundle2 != null ? (PanelsConfiguration) bundle2.getParcelable("panels_configuration") : null);
        return inflate;
    }

    @Override // defpackage.giy
    public final /* synthetic */ void o() {
        throw null;
    }

    public final ce q() {
        return aF(R.id.detail_panel_container);
    }

    public final boolean r() {
        iyk iykVar = this.an;
        return (iykVar == null || iykVar.i() || !this.an.h()) ? false : true;
    }

    public final boolean s(PaneFragmentPanelDescriptor paneFragmentPanelDescriptor, boolean z) {
        PanelsConfiguration panelsConfiguration = this.c;
        boolean z2 = false;
        if (panelsConfiguration == null) {
            return false;
        }
        if (panelsConfiguration.d() && z) {
            bh(f(), paneFragmentPanelDescriptor, false);
            this.am.h();
            this.al = null;
            this.c = PanelsConfiguration.c((PaneFragmentPanelDescriptor) this.c.a, paneFragmentPanelDescriptor);
        }
        PanelDescriptor panelDescriptor = this.al;
        if (panelDescriptor != null && !panelDescriptor.equals(paneFragmentPanelDescriptor)) {
            z2 = true;
        }
        aJ(paneFragmentPanelDescriptor, z2);
        return true;
    }
}
