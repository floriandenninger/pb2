package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ogd implements ajol {
    final /* synthetic */ DefaultWatchPanelViewController a;
    private final /* synthetic */ int b;

    public ogd(DefaultWatchPanelViewController defaultWatchPanelViewController, int i) {
        this.b = i;
        this.a = defaultWatchPanelViewController;
    }

    public /* synthetic */ ogd(DefaultWatchPanelViewController defaultWatchPanelViewController, int i, byte[] bArr) {
        this.b = i;
        this.a = defaultWatchPanelViewController;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        if (this.b == 0) {
            ajokVar.f("always_display_as_grid", Boolean.valueOf(this.a.u(this.a.a.getResources().getConfiguration())));
        } else {
            final DefaultWatchPanelViewController defaultWatchPanelViewController = this.a;
            ajokVar.f("watchNextChipsVisibilityPredicate", new ammy() { // from class: oga
                @Override // defpackage.ammy
                public final boolean a(Object obj) {
                    View view;
                    View view2 = (View) obj;
                    gna gnaVar = DefaultWatchPanelViewController.this.w;
                    return (gnaVar == null || (view = gnaVar.i) == null || view2 != view) ? false : true;
                }
            });
        }
    }
}
