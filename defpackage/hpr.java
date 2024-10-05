package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hpr extends lo {
    final /* synthetic */ MusicSearchSuggestionsController a;

    public hpr(MusicSearchSuggestionsController musicSearchSuggestionsController) {
        this.a = musicSearchSuggestionsController;
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        Activity activity;
        if (i != 1 || (activity = this.a.k) == null) {
            return;
        }
        whu.B(activity);
    }
}
