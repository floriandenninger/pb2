package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanePanelsController_PanePanelsState;
import com.google.android.apps.youtube.app.fragments.panels.PanePanelsController$PanePanelsState;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixz implements gjk, gjd, gjb, iyj, giz, gja {
    final gje a;
    public final SparseArray b;
    PanelsConfiguration c;
    private final dd d;
    private final Context e;
    private final iyk f;
    private final aoae g;

    public ixz(ml mlVar, yqw yqwVar, aoae aoaeVar, ViewGroup viewGroup, gje gjeVar, jgp jgpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = mlVar;
        this.d = mlVar.getSupportFragmentManager();
        this.g = aoaeVar;
        this.a = gjeVar;
        buc savedStateRegistry = mlVar.getSavedStateRegistry();
        iyk a = jgpVar.a(yqwVar, viewGroup, R.id.selection_container, R.id.pane_fragment_container, R.id.selection_detial_panel_separator, this, new amnv() { // from class: ixx
            @Override // defpackage.amnv
            public final Object get() {
                return Optional.ofNullable(ixz.this.c);
            }
        }, Optional.ofNullable(savedStateRegistry.a("fragments.panels.PanePanelsController.restoredPanelsLayoutController")));
        this.f = a;
        gjeVar.m(this);
        gjeVar.l(this);
        gjeVar.k(this);
        savedStateRegistry.b("PANELS_MANAGER_BUNDLE", new bub() { // from class: ixw
            @Override // defpackage.bub
            public final Bundle a() {
                ixz ixzVar = ixz.this;
                Bundle bundle = new Bundle(1);
                if (ixzVar.b.size() > 0) {
                    bundle.putSparseParcelableArray("fragments.panels.PanePanelsController.restoredSparsePanePanelsConfiguration", ixzVar.b);
                }
                return bundle;
            }
        });
        a.getClass();
        savedStateRegistry.b("fragments.panels.PanePanelsController.restoredPanelsLayoutController", new iyl(a, 1));
        Bundle a2 = savedStateRegistry.a("PANELS_MANAGER_BUNDLE");
        if (a2 == null || !a2.containsKey("fragments.panels.PanePanelsController.restoredSparsePanePanelsConfiguration")) {
            this.b = new SparseArray();
        } else {
            this.b = a2.getSparseParcelableArray("fragments.panels.PanePanelsController.restoredSparsePanePanelsConfiguration");
            o();
        }
    }

    private final Optional l(int i) {
        return Optional.ofNullable((PanePanelsController$PanePanelsState) this.b.get(i));
    }

    private final void m() {
        this.c = null;
        this.b.remove(this.a.b());
    }

    private final void n(PanelsConfiguration panelsConfiguration, boolean z) {
        if (panelsConfiguration == null) {
            return;
        }
        this.c = panelsConfiguration;
        SparseArray sparseArray = this.b;
        int b = this.a.b();
        PanelsConfiguration panelsConfiguration2 = this.c;
        sparseArray.put(b, new AutoValue_PanePanelsController_PanePanelsState((PaneFragmentPanelDescriptor) panelsConfiguration2.a, (PaneFragmentPanelDescriptor) panelsConfiguration2.b.orElse(null)));
        if (z) {
            this.f.c();
        }
    }

    private final void o() {
        Optional empty;
        Optional l = l(this.a.b());
        if (l.isPresent()) {
            if (((PanePanelsController$PanePanelsState) l.get()).a() == null) {
                empty = Optional.of(PanelsConfiguration.b(((PanePanelsController$PanePanelsState) l.get()).b()));
            } else {
                empty = Optional.of(PanelsConfiguration.c(((PanePanelsController$PanePanelsState) l.get()).b(), ((PanePanelsController$PanePanelsState) l.get()).a()));
            }
        } else {
            empty = Optional.empty();
        }
        PanelsConfiguration panelsConfiguration = (PanelsConfiguration) empty.orElse(null);
        m();
        n(panelsConfiguration, p(panelsConfiguration));
    }

    private final boolean p(PanelsConfiguration panelsConfiguration) {
        if (panelsConfiguration == null) {
            return false;
        }
        return PaneDescriptor.m(((PaneFragmentPanelDescriptor) panelsConfiguration.a()).a(), this.a.d(), this.g);
    }

    @Override // defpackage.gjk
    public final boolean F() {
        return false;
    }

    @Override // defpackage.gja
    public final void a() {
        final int b = this.a.b();
        Optional l = l(this.a.b());
        this.b.clear();
        l.ifPresent(new Consumer() { // from class: ixy
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ixz.this.b.put(b, (PanePanelsController$PanePanelsState) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.gjk
    public final void b(PanelsConfiguration panelsConfiguration) {
        n(panelsConfiguration, true);
    }

    @Override // defpackage.gjk
    public final /* bridge */ /* synthetic */ void c(PanelDescriptor panelDescriptor, boolean z) {
    }

    @Override // defpackage.gkb
    public final boolean d() {
        return this.f.g();
    }

    @Override // defpackage.gkb
    public final boolean e() {
        return this.f.i() && !this.f.h();
    }

    @Override // defpackage.giz
    public final void f(int i, int i2) {
        o();
    }

    @Override // defpackage.gjb
    public final void g(gir girVar) {
        if (this.c == null || !PaneDescriptor.m(PaneDescriptor.b(girVar), ((PaneFragmentPanelDescriptor) this.c.a()).a(), this.g)) {
            return;
        }
        iyk.b(this.e, girVar, this.f.h);
    }

    @Override // defpackage.iyj
    public final void h(PanelDescriptor panelDescriptor, int i) {
    }

    @Override // defpackage.iyj
    public final void i() {
    }

    @Override // defpackage.iyj
    public final void j(int i) {
    }

    @Override // defpackage.iyj
    public final void k(int i, int i2) {
        if (p(this.c)) {
            iyk.b(this.e, this.d.e(i), i2);
        }
    }

    @Override // defpackage.gjd
    public final void aJ(gjf gjfVar) {
        PanelsConfiguration panelsConfiguration = this.c;
        if (panelsConfiguration != null) {
            int i = gjfVar.c;
            if (i == 1) {
                if (PaneDescriptor.m(((PaneFragmentPanelDescriptor) panelsConfiguration.a()).a(), gjfVar.a, this.g)) {
                    m();
                }
            } else if (i == 2 && !PaneDescriptor.m(((PaneFragmentPanelDescriptor) panelsConfiguration.a()).a(), gjfVar.b, this.g)) {
                m();
            }
        }
    }
}
