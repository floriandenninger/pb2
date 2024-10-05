package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oge implements ajnf {
    final /* synthetic */ ajng a;
    final /* synthetic */ DefaultWatchPanelViewController b;

    public oge(DefaultWatchPanelViewController defaultWatchPanelViewController, ajng ajngVar) {
        this.b = defaultWatchPanelViewController;
        this.a = ajngVar;
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
    }

    @Override // defpackage.ajnf
    public final void pc() {
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        Object obj = ((you) this.a).get(i);
        if ((obj instanceof frp) || (obj instanceof aqcg) || i != 0) {
            if (this.b.q.I() <= 1) {
                this.b.q.aa(0, 0);
            }
            DefaultWatchPanelViewController defaultWatchPanelViewController = this.b;
            defaultWatchPanelViewController.c.a(defaultWatchPanelViewController.d);
        }
    }
}
