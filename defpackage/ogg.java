package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ogg implements nun {
    final /* synthetic */ DefaultWatchPanelViewController a;

    public ogg(DefaultWatchPanelViewController defaultWatchPanelViewController) {
        this.a = defaultWatchPanelViewController;
    }

    @Override // defpackage.nun
    public final void g(nqg nqgVar) {
        DefaultWatchPanelViewController defaultWatchPanelViewController;
        nqg nqgVar2;
        if (nqgVar != null) {
            DefaultWatchPanelViewController defaultWatchPanelViewController2 = this.a;
            if (defaultWatchPanelViewController2.m == null) {
                defaultWatchPanelViewController2.n.g(8, defaultWatchPanelViewController2.f.a(nqgVar));
                this.a.m = nqgVar;
            }
        }
        if (nqgVar == null && (nqgVar2 = (defaultWatchPanelViewController = this.a).m) != null) {
            defaultWatchPanelViewController.n.d(8, defaultWatchPanelViewController.f.a(nqgVar2));
        }
        this.a.m = nqgVar;
    }
}
