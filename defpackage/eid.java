package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eid implements hjc, hjr, hjw, vpl, axqj {
    private final efz a;
    private final eed b;
    private final ehw c;

    public eid() {
    }

    public eid(efz efzVar, eed eedVar, ehw ehwVar) {
        this.a = efzVar;
        this.b = eedVar;
        this.c = ehwVar;
    }

    @Override // defpackage.hjc
    public final void a(AudioTrackView audioTrackView) {
        audioTrackView.a = (hgo) this.c.k.get();
        audioTrackView.b = (hrv) this.a.a.S.get();
        audioTrackView.h = this.c.av();
    }

    @Override // defpackage.hjr
    public final void b(TextTrackView textTrackView) {
        textTrackView.a = (hgo) this.c.k.get();
        textTrackView.b = (hrv) this.a.a.S.get();
        textTrackView.i = this.c.av();
        this.a.a.q();
    }

    @Override // defpackage.hjw
    public final void c(TimelineSeekBar timelineSeekBar) {
        timelineSeekBar.e = (hgo) this.c.k.get();
        timelineSeekBar.f = (hjs) this.c.l.get();
        timelineSeekBar.g = this.c.Y();
    }

    @Override // defpackage.vpl
    public final void d(vpm vpmVar) {
        vpmVar.b = (vrp) this.b.lv.get();
        vpmVar.c = (vkb) this.b.lo.get();
        vpmVar.d = (tgn) this.a.a.aX.get();
        vpmVar.e = this.a.a.q();
        vpmVar.f = this.b.fL();
    }
}
