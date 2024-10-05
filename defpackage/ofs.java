package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ofs implements ayrs {
    public final /* synthetic */ DefaultWatchPanelViewController a;
    private final /* synthetic */ int b;

    public /* synthetic */ ofs(DefaultWatchPanelViewController defaultWatchPanelViewController, int i) {
        this.b = i;
        this.a = defaultWatchPanelViewController;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            DefaultWatchPanelViewController defaultWatchPanelViewController = this.a;
            Boolean bool = (Boolean) obj;
            if (defaultWatchPanelViewController.z == bool.booleanValue()) {
                return;
            }
            boolean u = defaultWatchPanelViewController.u(defaultWatchPanelViewController.y);
            defaultWatchPanelViewController.z = bool.booleanValue();
            if (u != defaultWatchPanelViewController.u(defaultWatchPanelViewController.y)) {
                ajti ajtiVar = defaultWatchPanelViewController.t;
                if (ajtiVar != null) {
                    ajtiVar.b();
                }
                ajti ajtiVar2 = defaultWatchPanelViewController.s;
                if (ajtiVar2 != null) {
                    ajtiVar2.b();
                }
                ajwi ajwiVar = defaultWatchPanelViewController.r;
                if (ajwiVar != null) {
                    ((vw) ajwiVar.g).mw();
                    return;
                }
                return;
            }
            return;
        }
        this.a.A = (acsx) ((zih) obj).a();
    }
}
