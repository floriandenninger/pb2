package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyp implements gjk, iyj {
    final PanelsBackStack a;
    public final dd b;
    public PanelDescriptor c;
    PanelsConfiguration d;
    private final Context e;
    private final iyk f;

    public iyp(ml mlVar, yqw yqwVar, ViewGroup viewGroup, jgp jgpVar, byte[] bArr) {
        this.e = mlVar;
        this.b = mlVar.getSupportFragmentManager();
        buc savedStateRegistry = mlVar.getSavedStateRegistry();
        iyk a = jgpVar.a(yqwVar, viewGroup, R.id.settings_selection_container, R.id.settings_detail_container, R.id.settings_selection_detail_panel_separator, this, new amnv() { // from class: iyn
            @Override // defpackage.amnv
            public final Object get() {
                return Optional.ofNullable(iyp.this.d);
            }
        }, Optional.ofNullable(savedStateRegistry.a("fragments.panels.SelectionDetailPanelsController.restoredPanelsLayoutController")));
        this.f = a;
        savedStateRegistry.b("PANELS_MANAGER_BUNDLE", new bub() { // from class: iym
            @Override // defpackage.bub
            public final Bundle a() {
                iyp iypVar = iyp.this;
                Bundle bundle = new Bundle();
                PanelsConfiguration panelsConfiguration = iypVar.d;
                if (panelsConfiguration != null) {
                    bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel", panelsConfiguration.a);
                    bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel", (Parcelable) iypVar.d.b.orElse(null));
                    bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredBackStack", iypVar.a);
                    PanelDescriptor panelDescriptor = iypVar.c;
                    if (panelDescriptor != null && !panelDescriptor.equals(iypVar.d.a())) {
                        bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredMainDescriptor", iypVar.c);
                    }
                }
                return bundle;
            }
        });
        a.getClass();
        savedStateRegistry.b("fragments.panels.SelectionDetailPanelsController.restoredPanelsLayoutController", new iyl(a, 0));
        Bundle a2 = savedStateRegistry.a("PANELS_MANAGER_BUNDLE");
        if (a2 == null || !a2.containsKey("fragments.panels.SelectionDetailPanelsController.restoredBackStack")) {
            this.a = PanelsBackStack.e(new ArrayList());
            return;
        }
        this.a = (PanelsBackStack) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredBackStack");
        if (((PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel")) != null) {
            this.d = PanelsConfiguration.c((PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel"), (PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel"));
        } else {
            this.d = PanelsConfiguration.b((PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel"));
        }
        b(this.d);
        PanelDescriptor panelDescriptor = (PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredMainDescriptor");
        if (panelDescriptor != null) {
            c(panelDescriptor, false);
        }
    }

    @Override // defpackage.gjk
    public final boolean F() {
        if (this.d == null) {
            return false;
        }
        if (!this.a.g()) {
            a(this.a.d().a, true);
            return true;
        }
        if (d()) {
            return false;
        }
        return this.f.j();
    }

    @Override // defpackage.gjk
    public final void b(PanelsConfiguration panelsConfiguration) {
        if (panelsConfiguration == null) {
            return;
        }
        this.a.h();
        this.c = null;
        this.d = panelsConfiguration;
        this.f.c();
    }

    @Override // defpackage.gjk
    public final void c(PanelDescriptor panelDescriptor, boolean z) {
        PanelsConfiguration panelsConfiguration = this.d;
        if (panelsConfiguration == null) {
            return;
        }
        if (panelsConfiguration.d() && z) {
            this.a.h();
            this.c = null;
            this.d = PanelsConfiguration.c(this.d.a, panelDescriptor);
        }
        PanelDescriptor panelDescriptor2 = this.c;
        a(panelDescriptor, panelDescriptor2 == null ? true : panelDescriptor2.equals(panelDescriptor));
    }

    @Override // defpackage.gkb
    public final boolean d() {
        return this.f.g();
    }

    @Override // defpackage.gkb
    public final boolean e() {
        return this.f.i() && !this.f.h();
    }

    @Override // defpackage.iyj
    public final void h(final PanelDescriptor panelDescriptor, final int i) {
        if (i == R.id.settings_detail_container) {
            this.c = panelDescriptor;
            i = R.id.settings_detail_container;
        }
        panelDescriptor.c().ifPresent(new Consumer() { // from class: iyo
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                iyp iypVar = iyp.this;
                int i2 = i;
                PanelDescriptor panelDescriptor2 = panelDescriptor;
                dn k = iypVar.b.k();
                k.u(i2, (ce) obj, panelDescriptor2.d());
                if (iypVar.d()) {
                    k.i = 4099;
                }
                k.d();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.iyj
    public final void i() {
    }

    @Override // defpackage.iyj
    public final void j(int i) {
        ce e = this.b.e(i);
        if (e != null) {
            dn k = this.b.k();
            k.m(e);
            k.d();
        }
    }

    @Override // defpackage.iyj
    public final void k(int i, int i2) {
        iyk.b(this.e, this.b.e(i), i2);
    }

    private final void a(PanelDescriptor panelDescriptor, boolean z) {
        if (!z && this.c != null) {
            ce e = this.b.e(R.id.settings_detail_container);
            Fragment$SavedState c = e != null ? this.b.c(e) : null;
            PanelsBackStack panelsBackStack = this.a;
            PanelDescriptor panelDescriptor2 = this.c;
            panelsBackStack.f(panelDescriptor2, c, null, panelDescriptor2.d());
        }
        this.f.d();
        h(panelDescriptor, R.id.settings_detail_container);
        k(R.id.settings_detail_container, this.f.h);
    }
}
