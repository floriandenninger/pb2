package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ntd implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ String b;
    final /* synthetic */ MainAppEngagementPanelDataProvider c;

    public ntd(MainAppEngagementPanelDataProvider mainAppEngagementPanelDataProvider, View view, String str) {
        this.c = mainAppEngagementPanelDataProvider;
        this.a = view;
        this.b = str;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.c.h(this.b);
        return true;
    }
}
