package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ejn {
    private final oja a;

    public ejn(oja ojaVar) {
        this.a = ojaVar;
    }

    public final nqp a() {
        ojb ojbVar = this.a.a;
        if (ojbVar != null) {
            return ((DefaultWatchPanelViewController) ojbVar).e;
        }
        throw new wnw("Unable to acquire engagementPanelController");
    }
}
