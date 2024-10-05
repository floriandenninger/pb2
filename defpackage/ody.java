package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ody extends zgd {
    final /* synthetic */ NextGenWatchLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ody(NextGenWatchLayout nextGenWatchLayout) {
        super("engagementPanelWrapperView");
        this.a = nextGenWatchLayout;
    }

    @Override // defpackage.zgd
    protected final /* bridge */ /* synthetic */ Object a() {
        NextGenWatchLayout nextGenWatchLayout = this.a;
        return (ViewGroup) nextGenWatchLayout.findViewById(nextGenWatchLayout.p);
    }
}
