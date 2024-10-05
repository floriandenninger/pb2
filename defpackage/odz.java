package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class odz extends ic {
    final /* synthetic */ NextGenWatchLayout b;

    public odz(NextGenWatchLayout nextGenWatchLayout) {
        this.b = nextGenWatchLayout;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.v(this.b.getResources().getString(R.string.accessibility_player_content_description));
        ksVar.A(this.b.getResources().getString(R.string.accessibility_player_hint_text));
    }
}
