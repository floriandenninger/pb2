package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ogf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ DefaultWatchPanelViewController a;

    public ogf(DefaultWatchPanelViewController defaultWatchPanelViewController) {
        this.a = defaultWatchPanelViewController;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        acsx acsxVar = this.a.A;
        if (acsxVar != null) {
            acsxVar.c("wnl");
        }
        this.a.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
