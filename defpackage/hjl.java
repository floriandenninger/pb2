package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hjl implements ajom {
    public final TextTrackView a;
    private final View b;

    public hjl(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.text_track, viewGroup, false);
        this.b = inflate;
        this.a = (TextTrackView) inflate.findViewById(R.id.text_track_view);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        TextTrackView textTrackView = this.a;
        textTrackView.c = (hjx) obj;
        textTrackView.requestLayout();
    }
}
